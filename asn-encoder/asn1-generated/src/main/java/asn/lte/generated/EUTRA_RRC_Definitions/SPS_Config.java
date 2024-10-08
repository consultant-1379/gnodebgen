/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPS_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SPS-Config";
   }

   public C_RNTI semiPersistSchedC_RNTI;  // optional
   public SPS_ConfigDL sps_ConfigDL;  // optional
   public SPS_ConfigUL sps_ConfigUL;  // optional

   public SPS_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SPS_Config (
      C_RNTI semiPersistSchedC_RNTI_,
      SPS_ConfigDL sps_ConfigDL_,
      SPS_ConfigUL sps_ConfigUL_
   ) {
      super();
      semiPersistSchedC_RNTI = semiPersistSchedC_RNTI_;
      sps_ConfigDL = sps_ConfigDL_;
      sps_ConfigUL = sps_ConfigUL_;
   }

   public void init () {
      semiPersistSchedC_RNTI = null;
      sps_ConfigDL = null;
      sps_ConfigUL = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return semiPersistSchedC_RNTI;
         case 1: return sps_ConfigDL;
         case 2: return sps_ConfigUL;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "semiPersistSchedC-RNTI";
         case 1: return "sps-ConfigDL";
         case 2: return "sps-ConfigUL";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean semiPersistSchedC_RNTIPresent = buffer.decodeBit ("semiPersistSchedC_RNTIPresent");
      boolean sps_ConfigDLPresent = buffer.decodeBit ("sps_ConfigDLPresent");
      boolean sps_ConfigULPresent = buffer.decodeBit ("sps_ConfigULPresent");

      // decode semiPersistSchedC_RNTI

      if (semiPersistSchedC_RNTIPresent) {
         buffer.getContext().eventDispatcher.startElement("semiPersistSchedC_RNTI", -1);

         semiPersistSchedC_RNTI = new C_RNTI();
         semiPersistSchedC_RNTI.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("semiPersistSchedC_RNTI", -1);
      }
      else {
         semiPersistSchedC_RNTI = null;
      }

      // decode sps_ConfigDL

      if (sps_ConfigDLPresent) {
         buffer.getContext().eventDispatcher.startElement("sps_ConfigDL", -1);

         sps_ConfigDL = new SPS_ConfigDL();
         sps_ConfigDL.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sps_ConfigDL", -1);
      }
      else {
         sps_ConfigDL = null;
      }

      // decode sps_ConfigUL

      if (sps_ConfigULPresent) {
         buffer.getContext().eventDispatcher.startElement("sps_ConfigUL", -1);

         sps_ConfigUL = new SPS_ConfigUL();
         sps_ConfigUL.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sps_ConfigUL", -1);
      }
      else {
         sps_ConfigUL = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (semiPersistSchedC_RNTI != null) semiPersistSchedC_RNTI.print (_sb, "semiPersistSchedC_RNTI", _level+1);
      if (sps_ConfigDL != null) sps_ConfigDL.print (_sb, "sps_ConfigDL", _level+1);
      if (sps_ConfigUL != null) sps_ConfigUL.print (_sb, "sps_ConfigUL", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
