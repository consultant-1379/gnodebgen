/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15_edt_SmallTBS_Subset_r15 edt_SmallTBS_Subset_r15 = null;  // optional
   public EDT_TBS_InfoList_NB_r15 edt_TBS_InfoList_r15;
   public NPRACH_ParametersList_NB_r14 nprach_ParametersListEDT_r15;  // optional

   public NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15 (
      NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15_edt_SmallTBS_Subset_r15 edt_SmallTBS_Subset_r15_,
      EDT_TBS_InfoList_NB_r15 edt_TBS_InfoList_r15_,
      NPRACH_ParametersList_NB_r14 nprach_ParametersListEDT_r15_
   ) {
      super();
      edt_SmallTBS_Subset_r15 = edt_SmallTBS_Subset_r15_;
      edt_TBS_InfoList_r15 = edt_TBS_InfoList_r15_;
      nprach_ParametersListEDT_r15 = nprach_ParametersListEDT_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15 (
      EDT_TBS_InfoList_NB_r15 edt_TBS_InfoList_r15_
   ) {
      super();
      edt_TBS_InfoList_r15 = edt_TBS_InfoList_r15_;
   }

   public void init () {
      edt_SmallTBS_Subset_r15 = null;
      edt_TBS_InfoList_r15 = null;
      nprach_ParametersListEDT_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return edt_SmallTBS_Subset_r15;
         case 1: return edt_TBS_InfoList_r15;
         case 2: return nprach_ParametersListEDT_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "edt-SmallTBS-Subset-r15";
         case 1: return "edt-TBS-InfoList-r15";
         case 2: return "nprach-ParametersListEDT-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean edt_SmallTBS_Subset_r15Present = buffer.decodeBit ("edt_SmallTBS_Subset_r15Present");
      boolean nprach_ParametersListEDT_r15Present = buffer.decodeBit ("nprach_ParametersListEDT_r15Present");

      // decode edt_SmallTBS_Subset_r15

      if (edt_SmallTBS_Subset_r15Present) {
         buffer.getContext().eventDispatcher.startElement("edt_SmallTBS_Subset_r15", -1);

         int tval = NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15_edt_SmallTBS_Subset_r15.decodeEnumValue (buffer);
         edt_SmallTBS_Subset_r15 = NPRACH_ConfigSIB_NB_v1530_edt_Parameters_r15_edt_SmallTBS_Subset_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("edt_SmallTBS_Subset_r15", -1);
      }
      else {
         edt_SmallTBS_Subset_r15 = null;
      }

      // decode edt_TBS_InfoList_r15

      buffer.getContext().eventDispatcher.startElement("edt_TBS_InfoList_r15", -1);

      edt_TBS_InfoList_r15 = new EDT_TBS_InfoList_NB_r15();
      edt_TBS_InfoList_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("edt_TBS_InfoList_r15", -1);

      // decode nprach_ParametersListEDT_r15

      if (nprach_ParametersListEDT_r15Present) {
         buffer.getContext().eventDispatcher.startElement("nprach_ParametersListEDT_r15", -1);

         nprach_ParametersListEDT_r15 = new NPRACH_ParametersList_NB_r14();
         nprach_ParametersListEDT_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nprach_ParametersListEDT_r15", -1);
      }
      else {
         nprach_ParametersListEDT_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (edt_SmallTBS_Subset_r15 != null) edt_SmallTBS_Subset_r15.print (_sb, "edt_SmallTBS_Subset_r15", _level+1);
      if (edt_TBS_InfoList_r15 != null) edt_TBS_InfoList_r15.print (_sb, "edt_TBS_InfoList_r15", _level+1);
      if (nprach_ParametersListEDT_r15 != null) nprach_ParametersListEDT_r15.print (_sb, "nprach_ParametersListEDT_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
