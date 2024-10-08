/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_PUSCH_UpPTS_r14_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public TDD_PUSCH_UpPTS_r14_setup_symPUSCH_UpPTS_r14 symPUSCH_UpPTS_r14 = null;  // optional
   public TDD_PUSCH_UpPTS_r14_setup_dmrs_LessUpPTS_Config_r14 dmrs_LessUpPTS_Config_r14 = null;  // optional

   public TDD_PUSCH_UpPTS_r14_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TDD_PUSCH_UpPTS_r14_setup (
      TDD_PUSCH_UpPTS_r14_setup_symPUSCH_UpPTS_r14 symPUSCH_UpPTS_r14_,
      TDD_PUSCH_UpPTS_r14_setup_dmrs_LessUpPTS_Config_r14 dmrs_LessUpPTS_Config_r14_
   ) {
      super();
      symPUSCH_UpPTS_r14 = symPUSCH_UpPTS_r14_;
      dmrs_LessUpPTS_Config_r14 = dmrs_LessUpPTS_Config_r14_;
   }

   public void init () {
      symPUSCH_UpPTS_r14 = null;
      dmrs_LessUpPTS_Config_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return symPUSCH_UpPTS_r14;
         case 1: return dmrs_LessUpPTS_Config_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "symPUSCH-UpPTS-r14";
         case 1: return "dmrs-LessUpPTS-Config-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean symPUSCH_UpPTS_r14Present = buffer.decodeBit ("symPUSCH_UpPTS_r14Present");
      boolean dmrs_LessUpPTS_Config_r14Present = buffer.decodeBit ("dmrs_LessUpPTS_Config_r14Present");

      // decode symPUSCH_UpPTS_r14

      if (symPUSCH_UpPTS_r14Present) {
         buffer.getContext().eventDispatcher.startElement("symPUSCH_UpPTS_r14", -1);

         int tval = TDD_PUSCH_UpPTS_r14_setup_symPUSCH_UpPTS_r14.decodeEnumValue (buffer);
         symPUSCH_UpPTS_r14 = TDD_PUSCH_UpPTS_r14_setup_symPUSCH_UpPTS_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("symPUSCH_UpPTS_r14", -1);
      }
      else {
         symPUSCH_UpPTS_r14 = null;
      }

      // decode dmrs_LessUpPTS_Config_r14

      if (dmrs_LessUpPTS_Config_r14Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_LessUpPTS_Config_r14", -1);

         int tval = TDD_PUSCH_UpPTS_r14_setup_dmrs_LessUpPTS_Config_r14.decodeEnumValue (buffer);
         dmrs_LessUpPTS_Config_r14 = TDD_PUSCH_UpPTS_r14_setup_dmrs_LessUpPTS_Config_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dmrs_LessUpPTS_Config_r14", -1);
      }
      else {
         dmrs_LessUpPTS_Config_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (symPUSCH_UpPTS_r14 != null) symPUSCH_UpPTS_r14.print (_sb, "symPUSCH_UpPTS_r14", _level+1);
      if (dmrs_LessUpPTS_Config_r14 != null) dmrs_LessUpPTS_Config_r14.print (_sb, "dmrs_LessUpPTS_Config_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
