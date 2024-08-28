/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class HighSpeedConfig_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HighSpeedConfig-v1530";
   }

   public HighSpeedConfig_v1530_highSpeedMeasGapCE_ModeA_r15 highSpeedMeasGapCE_ModeA_r15 = null;

   public HighSpeedConfig_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HighSpeedConfig_v1530 (
      HighSpeedConfig_v1530_highSpeedMeasGapCE_ModeA_r15 highSpeedMeasGapCE_ModeA_r15_
   ) {
      super();
      highSpeedMeasGapCE_ModeA_r15 = highSpeedMeasGapCE_ModeA_r15_;
   }

   public void init () {
      highSpeedMeasGapCE_ModeA_r15 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return highSpeedMeasGapCE_ModeA_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "highSpeedMeasGapCE-ModeA-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode highSpeedMeasGapCE_ModeA_r15

      buffer.getContext().eventDispatcher.startElement("highSpeedMeasGapCE_ModeA_r15", -1);

      {
         int tval = HighSpeedConfig_v1530_highSpeedMeasGapCE_ModeA_r15.decodeEnumValue (buffer);
         highSpeedMeasGapCE_ModeA_r15 = HighSpeedConfig_v1530_highSpeedMeasGapCE_ModeA_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("highSpeedMeasGapCE_ModeA_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (highSpeedMeasGapCE_ModeA_r15 != null) highSpeedMeasGapCE_ModeA_r15.print (_sb, "highSpeedMeasGapCE_ModeA_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
