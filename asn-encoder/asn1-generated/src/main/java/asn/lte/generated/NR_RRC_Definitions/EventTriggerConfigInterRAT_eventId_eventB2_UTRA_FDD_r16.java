/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasTriggerQuantity b2_Threshold1_r16;
   public MeasTriggerQuantityUTRA_FDD_r16 b2_Threshold2UTRA_FDD_r16;
   public Asn1Boolean reportOnLeave_r16;
   public Hysteresis hysteresis_r16;
   public TimeToTrigger timeToTrigger_r16 = null;
   public Asn1OpenExt extElem1;

   public EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 (
      MeasTriggerQuantity b2_Threshold1_r16_,
      MeasTriggerQuantityUTRA_FDD_r16 b2_Threshold2UTRA_FDD_r16_,
      Asn1Boolean reportOnLeave_r16_,
      Hysteresis hysteresis_r16_,
      TimeToTrigger timeToTrigger_r16_
   ) {
      super();
      b2_Threshold1_r16 = b2_Threshold1_r16_;
      b2_Threshold2UTRA_FDD_r16 = b2_Threshold2UTRA_FDD_r16_;
      reportOnLeave_r16 = reportOnLeave_r16_;
      hysteresis_r16 = hysteresis_r16_;
      timeToTrigger_r16 = timeToTrigger_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 (MeasTriggerQuantity b2_Threshold1_r16_,
      MeasTriggerQuantityUTRA_FDD_r16 b2_Threshold2UTRA_FDD_r16_,
      boolean reportOnLeave_r16_,
      long hysteresis_r16_,
      TimeToTrigger timeToTrigger_r16_
   ) {
      super();
      b2_Threshold1_r16 = b2_Threshold1_r16_;
      b2_Threshold2UTRA_FDD_r16 = b2_Threshold2UTRA_FDD_r16_;
      reportOnLeave_r16 = new Asn1Boolean (reportOnLeave_r16_);
      hysteresis_r16 = new Hysteresis (hysteresis_r16_);
      timeToTrigger_r16 = timeToTrigger_r16_;
   }

   public void init () {
      b2_Threshold1_r16 = null;
      b2_Threshold2UTRA_FDD_r16 = null;
      reportOnLeave_r16 = null;
      hysteresis_r16 = null;
      timeToTrigger_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return b2_Threshold1_r16;
         case 1: return b2_Threshold2UTRA_FDD_r16;
         case 2: return reportOnLeave_r16;
         case 3: return hysteresis_r16;
         case 4: return timeToTrigger_r16;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "b2-Threshold1-r16";
         case 1: return "b2-Threshold2UTRA-FDD-r16";
         case 2: return "reportOnLeave-r16";
         case 3: return "hysteresis-r16";
         case 4: return "timeToTrigger-r16";
         case 5: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode b2_Threshold1_r16

      buffer.getContext().eventDispatcher.startElement("b2_Threshold1_r16", -1);

      b2_Threshold1_r16 = new MeasTriggerQuantity();
      b2_Threshold1_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("b2_Threshold1_r16", -1);

      // decode b2_Threshold2UTRA_FDD_r16

      buffer.getContext().eventDispatcher.startElement("b2_Threshold2UTRA_FDD_r16", -1);

      b2_Threshold2UTRA_FDD_r16 = new MeasTriggerQuantityUTRA_FDD_r16();
      b2_Threshold2UTRA_FDD_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("b2_Threshold2UTRA_FDD_r16", -1);

      // decode reportOnLeave_r16

      buffer.getContext().eventDispatcher.startElement("reportOnLeave_r16", -1);

      reportOnLeave_r16 = new Asn1Boolean();
      reportOnLeave_r16.decode (buffer);

      buffer.invokeCharacters(reportOnLeave_r16.toString());
      buffer.getContext().eventDispatcher.endElement("reportOnLeave_r16", -1);

      // decode hysteresis_r16

      buffer.getContext().eventDispatcher.startElement("hysteresis_r16", -1);

      hysteresis_r16 = new Hysteresis();
      hysteresis_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("hysteresis_r16", -1);

      // decode timeToTrigger_r16

      buffer.getContext().eventDispatcher.startElement("timeToTrigger_r16", -1);

      {
         int tval = TimeToTrigger.decodeEnumValue (buffer);
         timeToTrigger_r16 = TimeToTrigger.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("timeToTrigger_r16", -1);

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
      if (b2_Threshold1_r16 != null) b2_Threshold1_r16.print (_sb, "b2_Threshold1_r16", _level+1);
      if (b2_Threshold2UTRA_FDD_r16 != null) b2_Threshold2UTRA_FDD_r16.print (_sb, "b2_Threshold2UTRA_FDD_r16", _level+1);
      if (reportOnLeave_r16 != null) reportOnLeave_r16.print (_sb, "reportOnLeave_r16", _level+1);
      if (hysteresis_r16 != null) hysteresis_r16.print (_sb, "hysteresis_r16", _level+1);
      if (timeToTrigger_r16 != null) timeToTrigger_r16.print (_sb, "timeToTrigger_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
