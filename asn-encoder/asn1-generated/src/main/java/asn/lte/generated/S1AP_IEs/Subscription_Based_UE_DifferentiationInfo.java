/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class Subscription_Based_UE_DifferentiationInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Subscription-Based-UE-DifferentiationInfo";
   }

   public Subscription_Based_UE_DifferentiationInfo_periodicCommunicationIndicator periodicCommunicationIndicator = null;  // optional
   public Asn1Integer periodicTime;  // optional
   public ScheduledCommunicationTime scheduledCommunicationTime;  // optional
   public Subscription_Based_UE_DifferentiationInfo_stationaryIndication stationaryIndication = null;  // optional
   public Subscription_Based_UE_DifferentiationInfo_trafficProfile trafficProfile = null;  // optional
   public Subscription_Based_UE_DifferentiationInfo_batteryIndication batteryIndication = null;  // optional
   public Subscription_Based_UE_DifferentiationInfo_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public Subscription_Based_UE_DifferentiationInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Subscription_Based_UE_DifferentiationInfo (
      Subscription_Based_UE_DifferentiationInfo_periodicCommunicationIndicator periodicCommunicationIndicator_,
      Asn1Integer periodicTime_,
      ScheduledCommunicationTime scheduledCommunicationTime_,
      Subscription_Based_UE_DifferentiationInfo_stationaryIndication stationaryIndication_,
      Subscription_Based_UE_DifferentiationInfo_trafficProfile trafficProfile_,
      Subscription_Based_UE_DifferentiationInfo_batteryIndication batteryIndication_,
      Subscription_Based_UE_DifferentiationInfo_iE_Extensions iE_Extensions_
   ) {
      super();
      periodicCommunicationIndicator = periodicCommunicationIndicator_;
      periodicTime = periodicTime_;
      scheduledCommunicationTime = scheduledCommunicationTime_;
      stationaryIndication = stationaryIndication_;
      trafficProfile = trafficProfile_;
      batteryIndication = batteryIndication_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Subscription_Based_UE_DifferentiationInfo (Subscription_Based_UE_DifferentiationInfo_periodicCommunicationIndicator periodicCommunicationIndicator_,
      long periodicTime_,
      ScheduledCommunicationTime scheduledCommunicationTime_,
      Subscription_Based_UE_DifferentiationInfo_stationaryIndication stationaryIndication_,
      Subscription_Based_UE_DifferentiationInfo_trafficProfile trafficProfile_,
      Subscription_Based_UE_DifferentiationInfo_batteryIndication batteryIndication_,
      Subscription_Based_UE_DifferentiationInfo_iE_Extensions iE_Extensions_
   ) {
      super();
      periodicCommunicationIndicator = periodicCommunicationIndicator_;
      periodicTime = new Asn1Integer (periodicTime_);
      scheduledCommunicationTime = scheduledCommunicationTime_;
      stationaryIndication = stationaryIndication_;
      trafficProfile = trafficProfile_;
      batteryIndication = batteryIndication_;
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      periodicCommunicationIndicator = null;
      periodicTime = null;
      scheduledCommunicationTime = null;
      stationaryIndication = null;
      trafficProfile = null;
      batteryIndication = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return periodicCommunicationIndicator;
         case 1: return periodicTime;
         case 2: return scheduledCommunicationTime;
         case 3: return stationaryIndication;
         case 4: return trafficProfile;
         case 5: return batteryIndication;
         case 6: return iE_Extensions;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "periodicCommunicationIndicator";
         case 1: return "periodicTime";
         case 2: return "scheduledCommunicationTime";
         case 3: return "stationaryIndication";
         case 4: return "trafficProfile";
         case 5: return "batteryIndication";
         case 6: return "iE-Extensions";
         case 7: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean periodicCommunicationIndicatorPresent = buffer.decodeBit ("periodicCommunicationIndicatorPresent");
      boolean periodicTimePresent = buffer.decodeBit ("periodicTimePresent");
      boolean scheduledCommunicationTimePresent = buffer.decodeBit ("scheduledCommunicationTimePresent");
      boolean stationaryIndicationPresent = buffer.decodeBit ("stationaryIndicationPresent");
      boolean trafficProfilePresent = buffer.decodeBit ("trafficProfilePresent");
      boolean batteryIndicationPresent = buffer.decodeBit ("batteryIndicationPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode periodicCommunicationIndicator

      if (periodicCommunicationIndicatorPresent) {
         buffer.getContext().eventDispatcher.startElement("periodicCommunicationIndicator", -1);

         int tval = Subscription_Based_UE_DifferentiationInfo_periodicCommunicationIndicator.decodeEnumValue (buffer);
         periodicCommunicationIndicator = Subscription_Based_UE_DifferentiationInfo_periodicCommunicationIndicator.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("periodicCommunicationIndicator", -1);
      }
      else {
         periodicCommunicationIndicator = null;
      }

      // decode periodicTime

      if (periodicTimePresent) {
         buffer.getContext().eventDispatcher.startElement("periodicTime", -1);

         periodicTime = new Asn1Integer();
         boolean extbit_1 = buffer.decodeBit ("extbit_1");
         if (!extbit_1) {
            periodicTime.decode (buffer, 1, 3600);
         }
         else {
            periodicTime.decode (buffer);
         }

         buffer.invokeCharacters(periodicTime.toString());
         buffer.getContext().eventDispatcher.endElement("periodicTime", -1);
      }
      else {
         periodicTime = null;
      }

      // decode scheduledCommunicationTime

      if (scheduledCommunicationTimePresent) {
         buffer.getContext().eventDispatcher.startElement("scheduledCommunicationTime", -1);

         scheduledCommunicationTime = new ScheduledCommunicationTime();
         scheduledCommunicationTime.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scheduledCommunicationTime", -1);
      }
      else {
         scheduledCommunicationTime = null;
      }

      // decode stationaryIndication

      if (stationaryIndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("stationaryIndication", -1);

         int tval = Subscription_Based_UE_DifferentiationInfo_stationaryIndication.decodeEnumValue (buffer);
         stationaryIndication = Subscription_Based_UE_DifferentiationInfo_stationaryIndication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("stationaryIndication", -1);
      }
      else {
         stationaryIndication = null;
      }

      // decode trafficProfile

      if (trafficProfilePresent) {
         buffer.getContext().eventDispatcher.startElement("trafficProfile", -1);

         int tval = Subscription_Based_UE_DifferentiationInfo_trafficProfile.decodeEnumValue (buffer);
         trafficProfile = Subscription_Based_UE_DifferentiationInfo_trafficProfile.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("trafficProfile", -1);
      }
      else {
         trafficProfile = null;
      }

      // decode batteryIndication

      if (batteryIndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("batteryIndication", -1);

         int tval = Subscription_Based_UE_DifferentiationInfo_batteryIndication.decodeEnumValue (buffer);
         batteryIndication = Subscription_Based_UE_DifferentiationInfo_batteryIndication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("batteryIndication", -1);
      }
      else {
         batteryIndication = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new Subscription_Based_UE_DifferentiationInfo_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (periodicCommunicationIndicator != null) periodicCommunicationIndicator.print (_sb, "periodicCommunicationIndicator", _level+1);
      if (periodicTime != null) periodicTime.print (_sb, "periodicTime", _level+1);
      if (scheduledCommunicationTime != null) scheduledCommunicationTime.print (_sb, "scheduledCommunicationTime", _level+1);
      if (stationaryIndication != null) stationaryIndication.print (_sb, "stationaryIndication", _level+1);
      if (trafficProfile != null) trafficProfile.print (_sb, "trafficProfile", _level+1);
      if (batteryIndication != null) batteryIndication.print (_sb, "batteryIndication", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
