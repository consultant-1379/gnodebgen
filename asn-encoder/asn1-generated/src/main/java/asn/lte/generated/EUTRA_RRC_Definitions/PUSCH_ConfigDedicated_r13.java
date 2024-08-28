/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigDedicated_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-ConfigDedicated-r13";
   }

   public Asn1Integer betaOffset_ACK_Index_r13;
   public Asn1Integer betaOffset2_ACK_Index_r13;  // optional
   public Asn1Integer betaOffset_RI_Index_r13;
   public Asn1Integer betaOffset_CQI_Index_r13;
   public PUSCH_ConfigDedicated_r13_betaOffsetMC_r13 betaOffsetMC_r13;  // optional
   public PUSCH_ConfigDedicated_r13_groupHoppingDisabled_r13 groupHoppingDisabled_r13 = null;  // optional
   public PUSCH_ConfigDedicated_r13_dmrs_WithOCC_Activated_r13 dmrs_WithOCC_Activated_r13 = null;  // optional
   public PUSCH_ConfigDedicated_r13_pusch_DMRS_r11 pusch_DMRS_r11;  // optional
   public PUSCH_ConfigDedicated_r13_uciOnPUSCH uciOnPUSCH;  // optional
   public PUSCH_ConfigDedicated_r13_pusch_HoppingConfig_r13 pusch_HoppingConfig_r13 = null;  // optional

   public PUSCH_ConfigDedicated_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigDedicated_r13 (
      Asn1Integer betaOffset_ACK_Index_r13_,
      Asn1Integer betaOffset2_ACK_Index_r13_,
      Asn1Integer betaOffset_RI_Index_r13_,
      Asn1Integer betaOffset_CQI_Index_r13_,
      PUSCH_ConfigDedicated_r13_betaOffsetMC_r13 betaOffsetMC_r13_,
      PUSCH_ConfigDedicated_r13_groupHoppingDisabled_r13 groupHoppingDisabled_r13_,
      PUSCH_ConfigDedicated_r13_dmrs_WithOCC_Activated_r13 dmrs_WithOCC_Activated_r13_,
      PUSCH_ConfigDedicated_r13_pusch_DMRS_r11 pusch_DMRS_r11_,
      PUSCH_ConfigDedicated_r13_uciOnPUSCH uciOnPUSCH_,
      PUSCH_ConfigDedicated_r13_pusch_HoppingConfig_r13 pusch_HoppingConfig_r13_
   ) {
      super();
      betaOffset_ACK_Index_r13 = betaOffset_ACK_Index_r13_;
      betaOffset2_ACK_Index_r13 = betaOffset2_ACK_Index_r13_;
      betaOffset_RI_Index_r13 = betaOffset_RI_Index_r13_;
      betaOffset_CQI_Index_r13 = betaOffset_CQI_Index_r13_;
      betaOffsetMC_r13 = betaOffsetMC_r13_;
      groupHoppingDisabled_r13 = groupHoppingDisabled_r13_;
      dmrs_WithOCC_Activated_r13 = dmrs_WithOCC_Activated_r13_;
      pusch_DMRS_r11 = pusch_DMRS_r11_;
      uciOnPUSCH = uciOnPUSCH_;
      pusch_HoppingConfig_r13 = pusch_HoppingConfig_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PUSCH_ConfigDedicated_r13 (
      Asn1Integer betaOffset_ACK_Index_r13_,
      Asn1Integer betaOffset_RI_Index_r13_,
      Asn1Integer betaOffset_CQI_Index_r13_
   ) {
      super();
      betaOffset_ACK_Index_r13 = betaOffset_ACK_Index_r13_;
      betaOffset_RI_Index_r13 = betaOffset_RI_Index_r13_;
      betaOffset_CQI_Index_r13 = betaOffset_CQI_Index_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_ConfigDedicated_r13 (long betaOffset_ACK_Index_r13_,
      long betaOffset2_ACK_Index_r13_,
      long betaOffset_RI_Index_r13_,
      long betaOffset_CQI_Index_r13_,
      PUSCH_ConfigDedicated_r13_betaOffsetMC_r13 betaOffsetMC_r13_,
      PUSCH_ConfigDedicated_r13_groupHoppingDisabled_r13 groupHoppingDisabled_r13_,
      PUSCH_ConfigDedicated_r13_dmrs_WithOCC_Activated_r13 dmrs_WithOCC_Activated_r13_,
      PUSCH_ConfigDedicated_r13_pusch_DMRS_r11 pusch_DMRS_r11_,
      PUSCH_ConfigDedicated_r13_uciOnPUSCH uciOnPUSCH_,
      PUSCH_ConfigDedicated_r13_pusch_HoppingConfig_r13 pusch_HoppingConfig_r13_
   ) {
      super();
      betaOffset_ACK_Index_r13 = new Asn1Integer (betaOffset_ACK_Index_r13_);
      betaOffset2_ACK_Index_r13 = new Asn1Integer (betaOffset2_ACK_Index_r13_);
      betaOffset_RI_Index_r13 = new Asn1Integer (betaOffset_RI_Index_r13_);
      betaOffset_CQI_Index_r13 = new Asn1Integer (betaOffset_CQI_Index_r13_);
      betaOffsetMC_r13 = betaOffsetMC_r13_;
      groupHoppingDisabled_r13 = groupHoppingDisabled_r13_;
      dmrs_WithOCC_Activated_r13 = dmrs_WithOCC_Activated_r13_;
      pusch_DMRS_r11 = pusch_DMRS_r11_;
      uciOnPUSCH = uciOnPUSCH_;
      pusch_HoppingConfig_r13 = pusch_HoppingConfig_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PUSCH_ConfigDedicated_r13 (
      long betaOffset_ACK_Index_r13_,
      long betaOffset_RI_Index_r13_,
      long betaOffset_CQI_Index_r13_
   ) {
      super();
      betaOffset_ACK_Index_r13 = new Asn1Integer (betaOffset_ACK_Index_r13_);
      betaOffset_RI_Index_r13 = new Asn1Integer (betaOffset_RI_Index_r13_);
      betaOffset_CQI_Index_r13 = new Asn1Integer (betaOffset_CQI_Index_r13_);
   }

   public void init () {
      betaOffset_ACK_Index_r13 = null;
      betaOffset2_ACK_Index_r13 = null;
      betaOffset_RI_Index_r13 = null;
      betaOffset_CQI_Index_r13 = null;
      betaOffsetMC_r13 = null;
      groupHoppingDisabled_r13 = null;
      dmrs_WithOCC_Activated_r13 = null;
      pusch_DMRS_r11 = null;
      uciOnPUSCH = null;
      pusch_HoppingConfig_r13 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return betaOffset_ACK_Index_r13;
         case 1: return betaOffset2_ACK_Index_r13;
         case 2: return betaOffset_RI_Index_r13;
         case 3: return betaOffset_CQI_Index_r13;
         case 4: return betaOffsetMC_r13;
         case 5: return groupHoppingDisabled_r13;
         case 6: return dmrs_WithOCC_Activated_r13;
         case 7: return pusch_DMRS_r11;
         case 8: return uciOnPUSCH;
         case 9: return pusch_HoppingConfig_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "betaOffset-ACK-Index-r13";
         case 1: return "betaOffset2-ACK-Index-r13";
         case 2: return "betaOffset-RI-Index-r13";
         case 3: return "betaOffset-CQI-Index-r13";
         case 4: return "betaOffsetMC-r13";
         case 5: return "groupHoppingDisabled-r13";
         case 6: return "dmrs-WithOCC-Activated-r13";
         case 7: return "pusch-DMRS-r11";
         case 8: return "uciOnPUSCH";
         case 9: return "pusch-HoppingConfig-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean betaOffset2_ACK_Index_r13Present = buffer.decodeBit ("betaOffset2_ACK_Index_r13Present");
      boolean betaOffsetMC_r13Present = buffer.decodeBit ("betaOffsetMC_r13Present");
      boolean groupHoppingDisabled_r13Present = buffer.decodeBit ("groupHoppingDisabled_r13Present");
      boolean dmrs_WithOCC_Activated_r13Present = buffer.decodeBit ("dmrs_WithOCC_Activated_r13Present");
      boolean pusch_DMRS_r11Present = buffer.decodeBit ("pusch_DMRS_r11Present");
      boolean uciOnPUSCHPresent = buffer.decodeBit ("uciOnPUSCHPresent");
      boolean pusch_HoppingConfig_r13Present = buffer.decodeBit ("pusch_HoppingConfig_r13Present");

      // decode betaOffset_ACK_Index_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_ACK_Index_r13", -1);

      betaOffset_ACK_Index_r13 = new Asn1Integer();
      betaOffset_ACK_Index_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_ACK_Index_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_ACK_Index_r13", -1);

      // decode betaOffset2_ACK_Index_r13

      if (betaOffset2_ACK_Index_r13Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffset2_ACK_Index_r13", -1);

         betaOffset2_ACK_Index_r13 = new Asn1Integer();
         betaOffset2_ACK_Index_r13.decode (buffer, 0, 15);

         buffer.invokeCharacters(betaOffset2_ACK_Index_r13.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffset2_ACK_Index_r13", -1);
      }
      else {
         betaOffset2_ACK_Index_r13 = null;
      }

      // decode betaOffset_RI_Index_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_RI_Index_r13", -1);

      betaOffset_RI_Index_r13 = new Asn1Integer();
      betaOffset_RI_Index_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_RI_Index_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_RI_Index_r13", -1);

      // decode betaOffset_CQI_Index_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_CQI_Index_r13", -1);

      betaOffset_CQI_Index_r13 = new Asn1Integer();
      betaOffset_CQI_Index_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_CQI_Index_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_CQI_Index_r13", -1);

      // decode betaOffsetMC_r13

      if (betaOffsetMC_r13Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetMC_r13", -1);

         betaOffsetMC_r13 = new PUSCH_ConfigDedicated_r13_betaOffsetMC_r13();
         betaOffsetMC_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("betaOffsetMC_r13", -1);
      }
      else {
         betaOffsetMC_r13 = null;
      }

      // decode groupHoppingDisabled_r13

      if (groupHoppingDisabled_r13Present) {
         buffer.getContext().eventDispatcher.startElement("groupHoppingDisabled_r13", -1);

         int tval = PUSCH_ConfigDedicated_r13_groupHoppingDisabled_r13.decodeEnumValue (buffer);
         groupHoppingDisabled_r13 = PUSCH_ConfigDedicated_r13_groupHoppingDisabled_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("groupHoppingDisabled_r13", -1);
      }
      else {
         groupHoppingDisabled_r13 = null;
      }

      // decode dmrs_WithOCC_Activated_r13

      if (dmrs_WithOCC_Activated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_WithOCC_Activated_r13", -1);

         int tval = PUSCH_ConfigDedicated_r13_dmrs_WithOCC_Activated_r13.decodeEnumValue (buffer);
         dmrs_WithOCC_Activated_r13 = PUSCH_ConfigDedicated_r13_dmrs_WithOCC_Activated_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dmrs_WithOCC_Activated_r13", -1);
      }
      else {
         dmrs_WithOCC_Activated_r13 = null;
      }

      // decode pusch_DMRS_r11

      if (pusch_DMRS_r11Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_DMRS_r11", -1);

         pusch_DMRS_r11 = new PUSCH_ConfigDedicated_r13_pusch_DMRS_r11();
         pusch_DMRS_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pusch_DMRS_r11", -1);
      }
      else {
         pusch_DMRS_r11 = null;
      }

      // decode uciOnPUSCH

      if (uciOnPUSCHPresent) {
         buffer.getContext().eventDispatcher.startElement("uciOnPUSCH", -1);

         uciOnPUSCH = new PUSCH_ConfigDedicated_r13_uciOnPUSCH();
         uciOnPUSCH.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uciOnPUSCH", -1);
      }
      else {
         uciOnPUSCH = null;
      }

      // decode pusch_HoppingConfig_r13

      if (pusch_HoppingConfig_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_HoppingConfig_r13", -1);

         int tval = PUSCH_ConfigDedicated_r13_pusch_HoppingConfig_r13.decodeEnumValue (buffer);
         pusch_HoppingConfig_r13 = PUSCH_ConfigDedicated_r13_pusch_HoppingConfig_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pusch_HoppingConfig_r13", -1);
      }
      else {
         pusch_HoppingConfig_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (betaOffset_ACK_Index_r13 != null) betaOffset_ACK_Index_r13.print (_sb, "betaOffset_ACK_Index_r13", _level+1);
      if (betaOffset2_ACK_Index_r13 != null) betaOffset2_ACK_Index_r13.print (_sb, "betaOffset2_ACK_Index_r13", _level+1);
      if (betaOffset_RI_Index_r13 != null) betaOffset_RI_Index_r13.print (_sb, "betaOffset_RI_Index_r13", _level+1);
      if (betaOffset_CQI_Index_r13 != null) betaOffset_CQI_Index_r13.print (_sb, "betaOffset_CQI_Index_r13", _level+1);
      if (betaOffsetMC_r13 != null) betaOffsetMC_r13.print (_sb, "betaOffsetMC_r13", _level+1);
      if (groupHoppingDisabled_r13 != null) groupHoppingDisabled_r13.print (_sb, "groupHoppingDisabled_r13", _level+1);
      if (dmrs_WithOCC_Activated_r13 != null) dmrs_WithOCC_Activated_r13.print (_sb, "dmrs_WithOCC_Activated_r13", _level+1);
      if (pusch_DMRS_r11 != null) pusch_DMRS_r11.print (_sb, "pusch_DMRS_r11", _level+1);
      if (uciOnPUSCH != null) uciOnPUSCH.print (_sb, "uciOnPUSCH", _level+1);
      if (pusch_HoppingConfig_r13 != null) pusch_HoppingConfig_r13.print (_sb, "pusch_HoppingConfig_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
