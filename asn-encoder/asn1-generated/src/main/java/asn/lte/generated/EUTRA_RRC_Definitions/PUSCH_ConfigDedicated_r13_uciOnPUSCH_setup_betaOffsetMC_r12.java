/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer betaOffset_ACK_Index_MC_SubframeSet2_r13;
   public Asn1Integer betaOffset2_ACK_Index_MC_SubframeSet2_r13;  // optional
   public Asn1Integer betaOffset_RI_Index_MC_SubframeSet2_r13;
   public Asn1Integer betaOffset_CQI_Index_MC_SubframeSet2_r13;

   public PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 (
      Asn1Integer betaOffset_ACK_Index_MC_SubframeSet2_r13_,
      Asn1Integer betaOffset2_ACK_Index_MC_SubframeSet2_r13_,
      Asn1Integer betaOffset_RI_Index_MC_SubframeSet2_r13_,
      Asn1Integer betaOffset_CQI_Index_MC_SubframeSet2_r13_
   ) {
      super();
      betaOffset_ACK_Index_MC_SubframeSet2_r13 = betaOffset_ACK_Index_MC_SubframeSet2_r13_;
      betaOffset2_ACK_Index_MC_SubframeSet2_r13 = betaOffset2_ACK_Index_MC_SubframeSet2_r13_;
      betaOffset_RI_Index_MC_SubframeSet2_r13 = betaOffset_RI_Index_MC_SubframeSet2_r13_;
      betaOffset_CQI_Index_MC_SubframeSet2_r13 = betaOffset_CQI_Index_MC_SubframeSet2_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 (
      Asn1Integer betaOffset_ACK_Index_MC_SubframeSet2_r13_,
      Asn1Integer betaOffset_RI_Index_MC_SubframeSet2_r13_,
      Asn1Integer betaOffset_CQI_Index_MC_SubframeSet2_r13_
   ) {
      super();
      betaOffset_ACK_Index_MC_SubframeSet2_r13 = betaOffset_ACK_Index_MC_SubframeSet2_r13_;
      betaOffset_RI_Index_MC_SubframeSet2_r13 = betaOffset_RI_Index_MC_SubframeSet2_r13_;
      betaOffset_CQI_Index_MC_SubframeSet2_r13 = betaOffset_CQI_Index_MC_SubframeSet2_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 (long betaOffset_ACK_Index_MC_SubframeSet2_r13_,
      long betaOffset2_ACK_Index_MC_SubframeSet2_r13_,
      long betaOffset_RI_Index_MC_SubframeSet2_r13_,
      long betaOffset_CQI_Index_MC_SubframeSet2_r13_
   ) {
      super();
      betaOffset_ACK_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_ACK_Index_MC_SubframeSet2_r13_);
      betaOffset2_ACK_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset2_ACK_Index_MC_SubframeSet2_r13_);
      betaOffset_RI_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_RI_Index_MC_SubframeSet2_r13_);
      betaOffset_CQI_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_CQI_Index_MC_SubframeSet2_r13_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PUSCH_ConfigDedicated_r13_uciOnPUSCH_setup_betaOffsetMC_r12 (
      long betaOffset_ACK_Index_MC_SubframeSet2_r13_,
      long betaOffset_RI_Index_MC_SubframeSet2_r13_,
      long betaOffset_CQI_Index_MC_SubframeSet2_r13_
   ) {
      super();
      betaOffset_ACK_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_ACK_Index_MC_SubframeSet2_r13_);
      betaOffset_RI_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_RI_Index_MC_SubframeSet2_r13_);
      betaOffset_CQI_Index_MC_SubframeSet2_r13 = new Asn1Integer (betaOffset_CQI_Index_MC_SubframeSet2_r13_);
   }

   public void init () {
      betaOffset_ACK_Index_MC_SubframeSet2_r13 = null;
      betaOffset2_ACK_Index_MC_SubframeSet2_r13 = null;
      betaOffset_RI_Index_MC_SubframeSet2_r13 = null;
      betaOffset_CQI_Index_MC_SubframeSet2_r13 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return betaOffset_ACK_Index_MC_SubframeSet2_r13;
         case 1: return betaOffset2_ACK_Index_MC_SubframeSet2_r13;
         case 2: return betaOffset_RI_Index_MC_SubframeSet2_r13;
         case 3: return betaOffset_CQI_Index_MC_SubframeSet2_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "betaOffset-ACK-Index-MC-SubframeSet2-r13";
         case 1: return "betaOffset2-ACK-Index-MC-SubframeSet2-r13";
         case 2: return "betaOffset-RI-Index-MC-SubframeSet2-r13";
         case 3: return "betaOffset-CQI-Index-MC-SubframeSet2-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean betaOffset2_ACK_Index_MC_SubframeSet2_r13Present = buffer.decodeBit ("betaOffset2_ACK_Index_MC_SubframeSet2_r13Present");

      // decode betaOffset_ACK_Index_MC_SubframeSet2_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_ACK_Index_MC_SubframeSet2_r13", -1);

      betaOffset_ACK_Index_MC_SubframeSet2_r13 = new Asn1Integer();
      betaOffset_ACK_Index_MC_SubframeSet2_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_ACK_Index_MC_SubframeSet2_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_ACK_Index_MC_SubframeSet2_r13", -1);

      // decode betaOffset2_ACK_Index_MC_SubframeSet2_r13

      if (betaOffset2_ACK_Index_MC_SubframeSet2_r13Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffset2_ACK_Index_MC_SubframeSet2_r13", -1);

         betaOffset2_ACK_Index_MC_SubframeSet2_r13 = new Asn1Integer();
         betaOffset2_ACK_Index_MC_SubframeSet2_r13.decode (buffer, 0, 15);

         buffer.invokeCharacters(betaOffset2_ACK_Index_MC_SubframeSet2_r13.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffset2_ACK_Index_MC_SubframeSet2_r13", -1);
      }
      else {
         betaOffset2_ACK_Index_MC_SubframeSet2_r13 = null;
      }

      // decode betaOffset_RI_Index_MC_SubframeSet2_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_RI_Index_MC_SubframeSet2_r13", -1);

      betaOffset_RI_Index_MC_SubframeSet2_r13 = new Asn1Integer();
      betaOffset_RI_Index_MC_SubframeSet2_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_RI_Index_MC_SubframeSet2_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_RI_Index_MC_SubframeSet2_r13", -1);

      // decode betaOffset_CQI_Index_MC_SubframeSet2_r13

      buffer.getContext().eventDispatcher.startElement("betaOffset_CQI_Index_MC_SubframeSet2_r13", -1);

      betaOffset_CQI_Index_MC_SubframeSet2_r13 = new Asn1Integer();
      betaOffset_CQI_Index_MC_SubframeSet2_r13.decode (buffer, 0, 15);

      buffer.invokeCharacters(betaOffset_CQI_Index_MC_SubframeSet2_r13.toString());
      buffer.getContext().eventDispatcher.endElement("betaOffset_CQI_Index_MC_SubframeSet2_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (betaOffset_ACK_Index_MC_SubframeSet2_r13 != null) betaOffset_ACK_Index_MC_SubframeSet2_r13.print (_sb, "betaOffset_ACK_Index_MC_SubframeSet2_r13", _level+1);
      if (betaOffset2_ACK_Index_MC_SubframeSet2_r13 != null) betaOffset2_ACK_Index_MC_SubframeSet2_r13.print (_sb, "betaOffset2_ACK_Index_MC_SubframeSet2_r13", _level+1);
      if (betaOffset_RI_Index_MC_SubframeSet2_r13 != null) betaOffset_RI_Index_MC_SubframeSet2_r13.print (_sb, "betaOffset_RI_Index_MC_SubframeSet2_r13", _level+1);
      if (betaOffset_CQI_Index_MC_SubframeSet2_r13 != null) betaOffset_CQI_Index_MC_SubframeSet2_r13.print (_sb, "betaOffset_CQI_Index_MC_SubframeSet2_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
