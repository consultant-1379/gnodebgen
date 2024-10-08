/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ConfigSIB_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NPRACH-ConfigSIB-NB-r13";
   }

   public NPRACH_ConfigSIB_NB_r13_nprach_CP_Length_r13 nprach_CP_Length_r13 = null;
   public RSRP_ThresholdsNPRACH_InfoList_NB_r13 rsrp_ThresholdsPrachInfoList_r13;  // optional
   public NPRACH_ParametersList_NB_r13 nprach_ParametersList_r13;

   public NPRACH_ConfigSIB_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPRACH_ConfigSIB_NB_r13 (
      NPRACH_ConfigSIB_NB_r13_nprach_CP_Length_r13 nprach_CP_Length_r13_,
      RSRP_ThresholdsNPRACH_InfoList_NB_r13 rsrp_ThresholdsPrachInfoList_r13_,
      NPRACH_ParametersList_NB_r13 nprach_ParametersList_r13_
   ) {
      super();
      nprach_CP_Length_r13 = nprach_CP_Length_r13_;
      rsrp_ThresholdsPrachInfoList_r13 = rsrp_ThresholdsPrachInfoList_r13_;
      nprach_ParametersList_r13 = nprach_ParametersList_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NPRACH_ConfigSIB_NB_r13 (
      NPRACH_ConfigSIB_NB_r13_nprach_CP_Length_r13 nprach_CP_Length_r13_,
      NPRACH_ParametersList_NB_r13 nprach_ParametersList_r13_
   ) {
      super();
      nprach_CP_Length_r13 = nprach_CP_Length_r13_;
      nprach_ParametersList_r13 = nprach_ParametersList_r13_;
   }

   public void init () {
      nprach_CP_Length_r13 = null;
      rsrp_ThresholdsPrachInfoList_r13 = null;
      nprach_ParametersList_r13 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nprach_CP_Length_r13;
         case 1: return rsrp_ThresholdsPrachInfoList_r13;
         case 2: return nprach_ParametersList_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nprach-CP-Length-r13";
         case 1: return "rsrp-ThresholdsPrachInfoList-r13";
         case 2: return "nprach-ParametersList-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rsrp_ThresholdsPrachInfoList_r13Present = buffer.decodeBit ("rsrp_ThresholdsPrachInfoList_r13Present");

      // decode nprach_CP_Length_r13

      buffer.getContext().eventDispatcher.startElement("nprach_CP_Length_r13", -1);

      {
         int tval = NPRACH_ConfigSIB_NB_r13_nprach_CP_Length_r13.decodeEnumValue (buffer);
         nprach_CP_Length_r13 = NPRACH_ConfigSIB_NB_r13_nprach_CP_Length_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("nprach_CP_Length_r13", -1);

      // decode rsrp_ThresholdsPrachInfoList_r13

      if (rsrp_ThresholdsPrachInfoList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ThresholdsPrachInfoList_r13", -1);

         rsrp_ThresholdsPrachInfoList_r13 = new RSRP_ThresholdsNPRACH_InfoList_NB_r13();
         rsrp_ThresholdsPrachInfoList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrp_ThresholdsPrachInfoList_r13", -1);
      }
      else {
         rsrp_ThresholdsPrachInfoList_r13 = null;
      }

      // decode nprach_ParametersList_r13

      buffer.getContext().eventDispatcher.startElement("nprach_ParametersList_r13", -1);

      nprach_ParametersList_r13 = new NPRACH_ParametersList_NB_r13();
      nprach_ParametersList_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nprach_ParametersList_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (nprach_CP_Length_r13 != null) nprach_CP_Length_r13.print (_sb, "nprach_CP_Length_r13", _level+1);
      if (rsrp_ThresholdsPrachInfoList_r13 != null) rsrp_ThresholdsPrachInfoList_r13.print (_sb, "rsrp_ThresholdsPrachInfoList_r13", _level+1);
      if (nprach_ParametersList_r13 != null) nprach_ParametersList_r13.print (_sb, "nprach_ParametersList_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
