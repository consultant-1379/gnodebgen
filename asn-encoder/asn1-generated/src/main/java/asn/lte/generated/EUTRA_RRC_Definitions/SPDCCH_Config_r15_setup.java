/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPDCCH_Config_r15_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 spdcch_L1_ReuseIndication_r15 = null;  // optional
   public SPDCCH_Set_r15 spdcch_SetConfig_r15;  // optional

   public SPDCCH_Config_r15_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SPDCCH_Config_r15_setup (
      SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 spdcch_L1_ReuseIndication_r15_,
      SPDCCH_Set_r15 spdcch_SetConfig_r15_
   ) {
      super();
      spdcch_L1_ReuseIndication_r15 = spdcch_L1_ReuseIndication_r15_;
      spdcch_SetConfig_r15 = spdcch_SetConfig_r15_;
   }

   public void init () {
      spdcch_L1_ReuseIndication_r15 = null;
      spdcch_SetConfig_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return spdcch_L1_ReuseIndication_r15;
         case 1: return spdcch_SetConfig_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "spdcch-L1-ReuseIndication-r15";
         case 1: return "spdcch-SetConfig-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean spdcch_L1_ReuseIndication_r15Present = buffer.decodeBit ("spdcch_L1_ReuseIndication_r15Present");
      boolean spdcch_SetConfig_r15Present = buffer.decodeBit ("spdcch_SetConfig_r15Present");

      // decode spdcch_L1_ReuseIndication_r15

      if (spdcch_L1_ReuseIndication_r15Present) {
         buffer.getContext().eventDispatcher.startElement("spdcch_L1_ReuseIndication_r15", -1);

         int tval = SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15.decodeEnumValue (buffer);
         spdcch_L1_ReuseIndication_r15 = SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("spdcch_L1_ReuseIndication_r15", -1);
      }
      else {
         spdcch_L1_ReuseIndication_r15 = null;
      }

      // decode spdcch_SetConfig_r15

      if (spdcch_SetConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("spdcch_SetConfig_r15", -1);

         spdcch_SetConfig_r15 = new SPDCCH_Set_r15();
         spdcch_SetConfig_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("spdcch_SetConfig_r15", -1);
      }
      else {
         spdcch_SetConfig_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (spdcch_L1_ReuseIndication_r15 != null) spdcch_L1_ReuseIndication_r15.print (_sb, "spdcch_L1_ReuseIndication_r15", _level+1);
      if (spdcch_SetConfig_r15 != null) spdcch_SetConfig_r15.print (_sb, "spdcch_SetConfig_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
