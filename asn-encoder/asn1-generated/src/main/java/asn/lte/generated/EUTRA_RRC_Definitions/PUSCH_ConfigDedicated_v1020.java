/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigDedicated_v1020 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-ConfigDedicated-v1020";
   }

   public PUSCH_ConfigDedicated_v1020_betaOffsetMC_r10 betaOffsetMC_r10;  // optional
   public PUSCH_ConfigDedicated_v1020_groupHoppingDisabled_r10 groupHoppingDisabled_r10 = null;  // optional
   public PUSCH_ConfigDedicated_v1020_dmrs_WithOCC_Activated_r10 dmrs_WithOCC_Activated_r10 = null;  // optional

   public PUSCH_ConfigDedicated_v1020 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigDedicated_v1020 (
      PUSCH_ConfigDedicated_v1020_betaOffsetMC_r10 betaOffsetMC_r10_,
      PUSCH_ConfigDedicated_v1020_groupHoppingDisabled_r10 groupHoppingDisabled_r10_,
      PUSCH_ConfigDedicated_v1020_dmrs_WithOCC_Activated_r10 dmrs_WithOCC_Activated_r10_
   ) {
      super();
      betaOffsetMC_r10 = betaOffsetMC_r10_;
      groupHoppingDisabled_r10 = groupHoppingDisabled_r10_;
      dmrs_WithOCC_Activated_r10 = dmrs_WithOCC_Activated_r10_;
   }

   public void init () {
      betaOffsetMC_r10 = null;
      groupHoppingDisabled_r10 = null;
      dmrs_WithOCC_Activated_r10 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return betaOffsetMC_r10;
         case 1: return groupHoppingDisabled_r10;
         case 2: return dmrs_WithOCC_Activated_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "betaOffsetMC-r10";
         case 1: return "groupHoppingDisabled-r10";
         case 2: return "dmrs-WithOCC-Activated-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean betaOffsetMC_r10Present = buffer.decodeBit ("betaOffsetMC_r10Present");
      boolean groupHoppingDisabled_r10Present = buffer.decodeBit ("groupHoppingDisabled_r10Present");
      boolean dmrs_WithOCC_Activated_r10Present = buffer.decodeBit ("dmrs_WithOCC_Activated_r10Present");

      // decode betaOffsetMC_r10

      if (betaOffsetMC_r10Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetMC_r10", -1);

         betaOffsetMC_r10 = new PUSCH_ConfigDedicated_v1020_betaOffsetMC_r10();
         betaOffsetMC_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("betaOffsetMC_r10", -1);
      }
      else {
         betaOffsetMC_r10 = null;
      }

      // decode groupHoppingDisabled_r10

      if (groupHoppingDisabled_r10Present) {
         buffer.getContext().eventDispatcher.startElement("groupHoppingDisabled_r10", -1);

         int tval = PUSCH_ConfigDedicated_v1020_groupHoppingDisabled_r10.decodeEnumValue (buffer);
         groupHoppingDisabled_r10 = PUSCH_ConfigDedicated_v1020_groupHoppingDisabled_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("groupHoppingDisabled_r10", -1);
      }
      else {
         groupHoppingDisabled_r10 = null;
      }

      // decode dmrs_WithOCC_Activated_r10

      if (dmrs_WithOCC_Activated_r10Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_WithOCC_Activated_r10", -1);

         int tval = PUSCH_ConfigDedicated_v1020_dmrs_WithOCC_Activated_r10.decodeEnumValue (buffer);
         dmrs_WithOCC_Activated_r10 = PUSCH_ConfigDedicated_v1020_dmrs_WithOCC_Activated_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dmrs_WithOCC_Activated_r10", -1);
      }
      else {
         dmrs_WithOCC_Activated_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (betaOffsetMC_r10 != null) betaOffsetMC_r10.print (_sb, "betaOffsetMC_r10", _level+1);
      if (groupHoppingDisabled_r10 != null) groupHoppingDisabled_r10.print (_sb, "groupHoppingDisabled_r10", _level+1);
      if (dmrs_WithOCC_Activated_r10 != null) dmrs_WithOCC_Activated_r10.print (_sb, "dmrs_WithOCC_Activated_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
