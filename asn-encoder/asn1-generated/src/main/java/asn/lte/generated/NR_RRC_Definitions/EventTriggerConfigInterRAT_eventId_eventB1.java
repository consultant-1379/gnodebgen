/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EventTriggerConfigInterRAT_eventId_eventB1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasTriggerQuantityEUTRA b1_ThresholdEUTRA;
   public Asn1Boolean reportOnLeave;
   public Hysteresis hysteresis;
   public TimeToTrigger timeToTrigger = null;
   public Asn1OpenExt extElem1;

   public EventTriggerConfigInterRAT_eventId_eventB1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EventTriggerConfigInterRAT_eventId_eventB1 (
      MeasTriggerQuantityEUTRA b1_ThresholdEUTRA_,
      Asn1Boolean reportOnLeave_,
      Hysteresis hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      b1_ThresholdEUTRA = b1_ThresholdEUTRA_;
      reportOnLeave = reportOnLeave_;
      hysteresis = hysteresis_;
      timeToTrigger = timeToTrigger_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EventTriggerConfigInterRAT_eventId_eventB1 (MeasTriggerQuantityEUTRA b1_ThresholdEUTRA_,
      boolean reportOnLeave_,
      long hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      b1_ThresholdEUTRA = b1_ThresholdEUTRA_;
      reportOnLeave = new Asn1Boolean (reportOnLeave_);
      hysteresis = new Hysteresis (hysteresis_);
      timeToTrigger = timeToTrigger_;
   }

   public void init () {
      b1_ThresholdEUTRA = null;
      reportOnLeave = null;
      hysteresis = null;
      timeToTrigger = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return b1_ThresholdEUTRA;
         case 1: return reportOnLeave;
         case 2: return hysteresis;
         case 3: return timeToTrigger;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "b1-ThresholdEUTRA";
         case 1: return "reportOnLeave";
         case 2: return "hysteresis";
         case 3: return "timeToTrigger";
         case 4: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode b1_ThresholdEUTRA

      buffer.getContext().eventDispatcher.startElement("b1_ThresholdEUTRA", -1);

      b1_ThresholdEUTRA = new MeasTriggerQuantityEUTRA();
      b1_ThresholdEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("b1_ThresholdEUTRA", -1);

      // decode reportOnLeave

      buffer.getContext().eventDispatcher.startElement("reportOnLeave", -1);

      reportOnLeave = new Asn1Boolean();
      reportOnLeave.decode (buffer);

      buffer.invokeCharacters(reportOnLeave.toString());
      buffer.getContext().eventDispatcher.endElement("reportOnLeave", -1);

      // decode hysteresis

      buffer.getContext().eventDispatcher.startElement("hysteresis", -1);

      hysteresis = new Hysteresis();
      hysteresis.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("hysteresis", -1);

      // decode timeToTrigger

      buffer.getContext().eventDispatcher.startElement("timeToTrigger", -1);

      {
         int tval = TimeToTrigger.decodeEnumValue (buffer);
         timeToTrigger = TimeToTrigger.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("timeToTrigger", -1);

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
      if (b1_ThresholdEUTRA != null) b1_ThresholdEUTRA.print (_sb, "b1_ThresholdEUTRA", _level+1);
      if (reportOnLeave != null) reportOnLeave.print (_sb, "reportOnLeave", _level+1);
      if (hysteresis != null) hysteresis.print (_sb, "hysteresis", _level+1);
      if (timeToTrigger != null) timeToTrigger.print (_sb, "timeToTrigger", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
