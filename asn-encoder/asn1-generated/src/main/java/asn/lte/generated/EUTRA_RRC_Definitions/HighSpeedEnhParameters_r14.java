/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class HighSpeedEnhParameters_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HighSpeedEnhParameters-r14";
   }

   public HighSpeedEnhParameters_r14_measurementEnhancements_r14 measurementEnhancements_r14 = null;  // optional
   public HighSpeedEnhParameters_r14_demodulationEnhancements_r14 demodulationEnhancements_r14 = null;  // optional
   public HighSpeedEnhParameters_r14_prach_Enhancements_r14 prach_Enhancements_r14 = null;  // optional

   public HighSpeedEnhParameters_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HighSpeedEnhParameters_r14 (
      HighSpeedEnhParameters_r14_measurementEnhancements_r14 measurementEnhancements_r14_,
      HighSpeedEnhParameters_r14_demodulationEnhancements_r14 demodulationEnhancements_r14_,
      HighSpeedEnhParameters_r14_prach_Enhancements_r14 prach_Enhancements_r14_
   ) {
      super();
      measurementEnhancements_r14 = measurementEnhancements_r14_;
      demodulationEnhancements_r14 = demodulationEnhancements_r14_;
      prach_Enhancements_r14 = prach_Enhancements_r14_;
   }

   public void init () {
      measurementEnhancements_r14 = null;
      demodulationEnhancements_r14 = null;
      prach_Enhancements_r14 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measurementEnhancements_r14;
         case 1: return demodulationEnhancements_r14;
         case 2: return prach_Enhancements_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measurementEnhancements-r14";
         case 1: return "demodulationEnhancements-r14";
         case 2: return "prach-Enhancements-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measurementEnhancements_r14Present = buffer.decodeBit ("measurementEnhancements_r14Present");
      boolean demodulationEnhancements_r14Present = buffer.decodeBit ("demodulationEnhancements_r14Present");
      boolean prach_Enhancements_r14Present = buffer.decodeBit ("prach_Enhancements_r14Present");

      // decode measurementEnhancements_r14

      if (measurementEnhancements_r14Present) {
         buffer.getContext().eventDispatcher.startElement("measurementEnhancements_r14", -1);

         int tval = HighSpeedEnhParameters_r14_measurementEnhancements_r14.decodeEnumValue (buffer);
         measurementEnhancements_r14 = HighSpeedEnhParameters_r14_measurementEnhancements_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measurementEnhancements_r14", -1);
      }
      else {
         measurementEnhancements_r14 = null;
      }

      // decode demodulationEnhancements_r14

      if (demodulationEnhancements_r14Present) {
         buffer.getContext().eventDispatcher.startElement("demodulationEnhancements_r14", -1);

         int tval = HighSpeedEnhParameters_r14_demodulationEnhancements_r14.decodeEnumValue (buffer);
         demodulationEnhancements_r14 = HighSpeedEnhParameters_r14_demodulationEnhancements_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("demodulationEnhancements_r14", -1);
      }
      else {
         demodulationEnhancements_r14 = null;
      }

      // decode prach_Enhancements_r14

      if (prach_Enhancements_r14Present) {
         buffer.getContext().eventDispatcher.startElement("prach_Enhancements_r14", -1);

         int tval = HighSpeedEnhParameters_r14_prach_Enhancements_r14.decodeEnumValue (buffer);
         prach_Enhancements_r14 = HighSpeedEnhParameters_r14_prach_Enhancements_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("prach_Enhancements_r14", -1);
      }
      else {
         prach_Enhancements_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measurementEnhancements_r14 != null) measurementEnhancements_r14.print (_sb, "measurementEnhancements_r14", _level+1);
      if (demodulationEnhancements_r14 != null) demodulationEnhancements_r14.print (_sb, "demodulationEnhancements_r14", _level+1);
      if (prach_Enhancements_r14 != null) prach_Enhancements_r14.print (_sb, "prach_Enhancements_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
