/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class HighSpeedParameters_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HighSpeedParameters-r16";
   }

   public HighSpeedParameters_r16_measurementEnhancement_r16 measurementEnhancement_r16 = null;  // optional
   public HighSpeedParameters_r16_demodulationEnhancement_r16 demodulationEnhancement_r16 = null;  // optional

   public HighSpeedParameters_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HighSpeedParameters_r16 (
      HighSpeedParameters_r16_measurementEnhancement_r16 measurementEnhancement_r16_,
      HighSpeedParameters_r16_demodulationEnhancement_r16 demodulationEnhancement_r16_
   ) {
      super();
      measurementEnhancement_r16 = measurementEnhancement_r16_;
      demodulationEnhancement_r16 = demodulationEnhancement_r16_;
   }

   public void init () {
      measurementEnhancement_r16 = null;
      demodulationEnhancement_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measurementEnhancement_r16;
         case 1: return demodulationEnhancement_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measurementEnhancement-r16";
         case 1: return "demodulationEnhancement-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measurementEnhancement_r16Present = buffer.decodeBit ("measurementEnhancement_r16Present");
      boolean demodulationEnhancement_r16Present = buffer.decodeBit ("demodulationEnhancement_r16Present");

      // decode measurementEnhancement_r16

      if (measurementEnhancement_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measurementEnhancement_r16", -1);

         int tval = HighSpeedParameters_r16_measurementEnhancement_r16.decodeEnumValue (buffer);
         measurementEnhancement_r16 = HighSpeedParameters_r16_measurementEnhancement_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measurementEnhancement_r16", -1);
      }
      else {
         measurementEnhancement_r16 = null;
      }

      // decode demodulationEnhancement_r16

      if (demodulationEnhancement_r16Present) {
         buffer.getContext().eventDispatcher.startElement("demodulationEnhancement_r16", -1);

         int tval = HighSpeedParameters_r16_demodulationEnhancement_r16.decodeEnumValue (buffer);
         demodulationEnhancement_r16 = HighSpeedParameters_r16_demodulationEnhancement_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("demodulationEnhancement_r16", -1);
      }
      else {
         demodulationEnhancement_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measurementEnhancement_r16 != null), null);
      buffer.encodeBit ((demodulationEnhancement_r16 != null), null);

      // encode measurementEnhancement_r16

      if (measurementEnhancement_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measurementEnhancement_r16", -1);

         measurementEnhancement_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measurementEnhancement_r16", -1);
      }

      // encode demodulationEnhancement_r16

      if (demodulationEnhancement_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("demodulationEnhancement_r16", -1);

         demodulationEnhancement_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("demodulationEnhancement_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measurementEnhancement_r16 != null) measurementEnhancement_r16.print (_sb, "measurementEnhancement_r16", _level+1);
      if (demodulationEnhancement_r16 != null) demodulationEnhancement_r16.print (_sb, "demodulationEnhancement_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
