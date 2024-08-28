# S3 for 5G

## Quick start

1. Unzip S345G-\<version\>-bundle.zip on target machine with Java 8 installed. 
2. edit etc/S345G.ini
3. run S345G with the command

> $ java -Xmx2g -jar S345G-\<version\>.jar -v 

Output should look like:
```

 Calls per second       Total Events          Events per second  
 Target   Current | generated distributed | generated distributed
   5000      1605     2003846     1995180       48472       45866
```

## Introduction

Welcome to S3; a smaller, simpler simulator. This version has been adopted for 5G NR nodes.

S3 is a stand alone tool that emulates a subset of an LTE network. By running one or more instances of S3, a network of arbitrary size, load and complexity can be built quickly and easily. S3 ships as a Java jar with some configuration files which runs on any available hardware that supports Java from a raspberry Pi to the latest blades. It has minimal storage requirements as even its log files could be directed to /dev/null if not required.

S3 emulates the network by producing the celltrace events that would be produced by a cell in response to calls conforming to the specified patterns (i.e. with consistent and coherent identifiers and values). Events are streamed in real time to the specified destinations exactly as they would be from the nodes.



## Key concepts

S3 simulates calls on a network (more specifically, it generates the events that would result from the interaction of a UE and a cell on a node) and since every call is just a pattern of events, it is easy to define the patterns to be emulated and their relative frequency. S3 maintains a pool of nodes and the cells attached to those nodes and the network destinations that events can be sent to. It is worth noting that since S3 simulates calls, it makes little difference to it whether they are being generated from twenty or twenty thousand nodes.

Internally, S3 maintains a circular queue with an entry for each time slot (typically every 125 milliseconds). It then runs two threads, one creates calls and adds the generated events into the appropriate time slots and the other thread transmits all the events that have been generated for a given timeslot. Among other benefits, this allows S3 to self regulate by keeping track of how long each thread needs to do its job and adjusting the generation rate up or down as needed.

To generate a call, S3 takes the next pattern to be processed and creates an instance of each event in the pattern. It selects or generates the key identifiers that all events of that call will share (gnb_id, main_plmn_id, gnb_id_length, nci, pm_event_common_version, pm_event_correction_version, pm_event_group_version, etcm_version, etcm_correction_version). The use of resource pools makes it easy to ensure that resources such as IMSI's will be exclusive to a given call and can not be re-used until the last event of that call has been transmitted. Since each call may have a random duration, S3 will insert any required periodic events at the times and offsets specified by the pattern. Other then the 'header' identifiers, S3 only sets the parameters for each event that have been specified in the pattern because there is no point setting values nobody is interested in reading. Having generated all the events for a given call, they are then added to the queues for required timeslots so they can be distributed at the right time.

The distribution thread takes all the events for a specific timeslot, sets the current timestamp and transmits them to the appropriate destinations. 

## Installation

Source code is available in the [ebs-playground](https://gerrit.ericsson.se/#/admin/projects/OSS/playground/ebs-playground) under the S345G directory. Build it with `mvn clean install`.

The resulting `target` directory will contain the file `S345G-<version>-bundle.zip` that contains everything (except the JRE) that is needed to be transferred to a target machine. 

Configuration files will be in a sub-directory called "etc", logs files will be in a sub-directory called "log" and pattern files will be in a sub-directory called "patterns"

## Configuration

In the directory you installed S3 is a sub-directory called "etc". This contains self-documented configuration files. Edit them as required. 

**Note:-** S3 is network bound and not CPU bound so once you have specified the highest traffic level your network can cope with, increasing the numCallsPerSec further will simply increase the number of events that get dropped. - edit - Fixed in 1.1.10. If generation thread gets too far ahead of the distribution thread, the program will reduce the number of calls per second until the stable maximum is reached. This will only work is the starting level is low enough to not overpower the system and fill available memory before an adjustment can be made.

## Command line arguments
Optional parameters you can use include:
* -v for verbose output
* -i <path> to specify an alternate ini file to use. Default is etc/S345G.ini
* -ses <size> to adjust the average event size to the specified number of bytes.
* -ft for feature test mode to run a specified pattern one time only
* -p <path> to specify the pattern file you want to use - only meaningful in feature test mode.
* -d <time> duration of call in seconds - only meaningful in feature test mode
* -lt listener test mode.
* -p <port range> to specify the range of ports to listen on - only meaningful in listener test mode.
* -ip the public address of the server to bind the listener to - only meaningful in listener test mode.

## Patterns
S3 uses patterns to define the events that make up a call. The S345G.ini configuration file includes a section called "Paths" which includes a parameter called "PatternDir" which tells S3 which directory to look in for pattern files. S3 will look at each file in that directory and if the ini file contains an entry with the same name, and a frequency greater then zero, it will load it as a pattern to use to generate calls. Pattern configurations can be maintained in separate ini file as below. S3 will look for the file in the specified "PatternDir" and load the patterns along with patterns listed in S345G.ini file.

For example :
PatternINIFileName="patterns.ini"
For failure patterns: PatternINIFileName="patternsFail.ini"
For incomplete patterns: PatternINIFileName="patterns_incomplete.ini"
Pattern configuration example:
If the directory "Patterns" contained the files, pat1.pat, pat2.pat, pat3.pat, pat4.pat and pat5.pat and the ini file contained a section such as:
```
[Paths]
PatternDir="Patterns"
pat1.pat=3
pat2.pat=50
pat4.pat=49
pat5.pat=-1
```
S3 would load and parse three pattern files. The file pat3.pat would be ignored because it is not in the INI file and the file pat5.pat would be ignored because its frequency is less than one. Any problems encountered parsing the patterns will be reported in the log files. The frequencies are totaled and then the patterns are shuffled so the calls will appear in no particular order. In this case they total 102 which means out of every 102 calls, 3 of them will follow the pattern in pat1.pat, 50 of them will follow pat2.pat and 49 will follow pat4.pat. 

## Pattern Files
Call patterns are defined using the following keywords. 

> \# This is a comment

> id=1234  \# this is a line with a comment

The character '#' is used to start a comment.

> include = *path*

insert the text from the named file at this point in the pattern. This can have an optional repeat count for example
>include=X2HO_X2HI.pat, 3

would include the instructions in the named file three times and
> include=X2HO_X2HI.pat, r(10)

would include the instructions in the named file a random number between 1 and 10 times.

> id = *event_id*

the id of the event to generate. Applies to all subsequent commands until the next id is specified.
> offset = xx

the number of milliseconds after the previous event before this one can be sent. This is a hint, not an exact figure.
> debug=*some text*

This text will appear in the log file.
> period = nn

the last specifed event is periodic and will be repeated every x seconds until the call completes. The first periodic event starts the sequence of periodic events, the first non-periodic ends the sequence of periodic events. (**Note:-** Period is in seconds, offset is in milliseconds!)

> version=CUCP,13,38,0,15,0

The version command sets the default values for the version information required by the different network functions. The values are network function, common, group, corrected, etcm and etcm_correction.  

> set = *parameter*,*value*

set the specified parameter of this event to the specified value.

*parameter* is a valid settable parameter of the current event as specified in the schema used to generate S3.
Where a *parameter* exists more then once in an event, you can use an array suffix to specify which entry you want, starting from
zero.

*value* can have four formats:
- direct implies a number, eg. 123
- "" implies a string, eg. "abc"
- b"" implies a byte array, eg b"00 2C DA 14" in the format of hex pairs (the spaces are optional).
- r(min,max,len) produce a random value x of len bytes such that min <= x < max.

*note:-* if set is called before any ids have been specified, it specifies teh default value to use for the specified parameter for all subsequent ids.

### Pattern Example 1:
du_adjusted.pat:
```
# example of a comment
# set some defaults
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0
id = CuUpTestEventEnm
set = data, 1

id = DuPerUeTrafficRep
set= per_ue_rlc_arq_dl_ack,1
id = DuPerCellTrafficRep
set= per_cell_mac_vol_dl, 1
```

## Call duration rules setup

Call duration is only meaningful for patterns that include periodic events. Patterns that do not contain periodic events should be handled by a separate instance of S3 so that they do not distort the proportions of calls of different durations. S3 use call duration rules to specify the proportions of calls of different lengths that it will generate. These rules are specified in the ini file. Up to 100 rules can be defined using the keys “Duration0=” to “Duration99=” where each rule gives the length of the call and the number of calls of that length. Call length is 1 second or greater and only the first 1000 calls are considered.

For example, by giving the rules:
```
Duration1=45,50 # 50 calls of 45 seconds
Duration2=75,20 # 20 calls of 75 seconds
Duration3=5,2 # 2 calls of 5 seconds
```
S3 is being told that for every  (50+20+2) seventy two calls generated, fifty will last 45 seconds, twenty will last 75 seconds and two of them will last only five seconds. If the total number of calls described exceeds 1000 or if low frequency calls account for less than 0.5% of the total then the duration rules to use can be calculated using the spreadsheet Call_Duration_Rules_Setup.xlsx , and configure your S345G.ini files as per the suggested duration rules and target CPS rates.

*NOTE:* At least one call duration rule is required.

*NOTE:* A warning will be generated in the log file if the longest call specified can not be accommodated by the currently defined Q size. The default Q size has a default of 10,000 entries and is controlled by the "QueueSize" parameter. One entry exists for each "DistMonitor" time slot, so at a default of 125 milliseconds, the default queue can handle calls up to about 1250 seconds long ( 20 minutes), If DistMonitor is changed to 100 milliseconds, then the longest supported call is about 16 minutes. To support a call of 24 hours with dist monitor at 125 milliseconds would require a QueueSize of over 691,200 (24 * 60 * 60 * (1000/125)) which will have corresponding impacts on memory usage and garbage collection.

## Advanced configuration
Values specified in ini file can be overridden on the command line by using the -D\<property=value\> option. If used, this option must appear before the jar file is specified and the property must exactly match a property specified in the ini file.
For example, if the ini file contains the properties *numDest=10* and *FirstDest=0*, then an instance of S3 could be started which only used the third and fourth destination port by specifying the command line as:
> $ java -DnumDest=2 -DFirstDest=2 -jar S3-\<version\>.jar

## Topology
It is possible to provide a CSV file (etc/topology.txt) with basic topology information required for events. The parameters NumChannels and FirstChannel still behave as normal so the same topology list can be shared among many instances of S3. Any errors parsing this file will
show in the logs.
```
# either use
#  nodeName, nodeId
#   in which case S3 will add CellsPerNode entries starting from 0
# - or - 
#  name, gnodeBId, cell1Id [, cell2Id [, cell3Id [...]]]
#   in which case S3 will add an entry for each cell mentioned
#
MyNodeName,1
nametwo,2,1,2,3,4
Mynode003,3, 9,8,7,6
Mynode004,4, 1,2,3
Mynode005,5, 0,1,2
Mynode006,6
Mynode007,7

```

## Test modes
Three test modes are built into S3 to help set things up smoothly. Feature test mode (described above) and Listener mode and Netty listener
mode.
- Listener Mode:
Listener mode is a simple listener that can accept events from S3 and report counts and rates. It can be very useful to establish connectivity
between two systems.
To start S3 in listener mode, add the command line option '-lt' and use the '-p' to specify the port or range of ports to listen on.

> $ java -jar target/S345G- \<version\>.jar -lt -p 10102

will start S3 and have it listen on the localhost to ports in the range 10102. The output form listener mode (subject to change) looks like :
```

About to start listener on ports [10102]
initializing server 
Now accepting connections on 127.0.0.1
                                    Avg Evts/s     Avg kbytes/s  Avg bytes  
 Channels:     Events:   Errors:    run:   spot:   run:   spot:  per evt:         
     3000      948626         0    8544   53383    955    6091    113.79 

```
If the sender is on a different host, the listener will not see it because it is bound (by default) to the localhost. To correct this, you must specify the public address that other hosts use to see this server with the '-ip' option, such as :

> $ java -jar target/S345G- \<version\>.jar -lt -p 10102 -ip 198.169.1.2

The value for the $-ip$ parameter is the value used to ping this host from another server. 

## Protocol files
In the build directory is a sub-directory called `protos`. This contains the google protocol buffers that will be used to define the messages generated by S3. If these need changing, rebuild the library `gpg45G` by running `mvn clean install` and then rebuild S3 to use the new library. 
