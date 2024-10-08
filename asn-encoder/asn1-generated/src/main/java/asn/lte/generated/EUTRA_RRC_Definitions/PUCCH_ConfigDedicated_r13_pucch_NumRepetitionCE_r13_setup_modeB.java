/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format1_r13 pucch_NumRepetitionCE_format1_r13 = null;
   public PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format2_r13 pucch_NumRepetitionCE_format2_r13 = null;

   public PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB (
      PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format1_r13 pucch_NumRepetitionCE_format1_r13_,
      PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format2_r13 pucch_NumRepetitionCE_format2_r13_
   ) {
      super();
      pucch_NumRepetitionCE_format1_r13 = pucch_NumRepetitionCE_format1_r13_;
      pucch_NumRepetitionCE_format2_r13 = pucch_NumRepetitionCE_format2_r13_;
   }

   public void init () {
      pucch_NumRepetitionCE_format1_r13 = null;
      pucch_NumRepetitionCE_format2_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pucch_NumRepetitionCE_format1_r13;
         case 1: return pucch_NumRepetitionCE_format2_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pucch-NumRepetitionCE-format1-r13";
         case 1: return "pucch-NumRepetitionCE-format2-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode pucch_NumRepetitionCE_format1_r13

      buffer.getContext().eventDispatcher.startElement("pucch_NumRepetitionCE_format1_r13", -1);

      {
         int tval = PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format1_r13.decodeEnumValue (buffer);
         pucch_NumRepetitionCE_format1_r13 = PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format1_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("pucch_NumRepetitionCE_format1_r13", -1);

      // decode pucch_NumRepetitionCE_format2_r13

      buffer.getContext().eventDispatcher.startElement("pucch_NumRepetitionCE_format2_r13", -1);

      {
         int tval = PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format2_r13.decodeEnumValue (buffer);
         pucch_NumRepetitionCE_format2_r13 = PUCCH_ConfigDedicated_r13_pucch_NumRepetitionCE_r13_setup_modeB_pucch_NumRepetitionCE_format2_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("pucch_NumRepetitionCE_format2_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pucch_NumRepetitionCE_format1_r13 != null) pucch_NumRepetitionCE_format1_r13.print (_sb, "pucch_NumRepetitionCE_format1_r13", _level+1);
      if (pucch_NumRepetitionCE_format2_r13 != null) pucch_NumRepetitionCE_format2_r13.print (_sb, "pucch_NumRepetitionCE_format2_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
