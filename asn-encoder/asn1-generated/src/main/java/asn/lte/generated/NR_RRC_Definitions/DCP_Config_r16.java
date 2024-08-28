/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DCP_Config_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DCP-Config-r16";
   }

   public RNTI_Value ps_RNTI_r16;
   public Asn1Integer ps_Offset_r16;
   public Asn1Integer sizeDCI_2_6_r16;
   public Asn1Integer ps_PositionDCI_2_6_r16;
   public DCP_Config_r16_ps_WakeUp_r16 ps_WakeUp_r16 = null;  // optional
   public DCP_Config_r16_ps_TransmitPeriodicL1_RSRP_r16 ps_TransmitPeriodicL1_RSRP_r16 = null;  // optional
   public DCP_Config_r16_ps_TransmitOtherPeriodicCSI_r16 ps_TransmitOtherPeriodicCSI_r16 = null;  // optional

   public DCP_Config_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DCP_Config_r16 (
      RNTI_Value ps_RNTI_r16_,
      Asn1Integer ps_Offset_r16_,
      Asn1Integer sizeDCI_2_6_r16_,
      Asn1Integer ps_PositionDCI_2_6_r16_,
      DCP_Config_r16_ps_WakeUp_r16 ps_WakeUp_r16_,
      DCP_Config_r16_ps_TransmitPeriodicL1_RSRP_r16 ps_TransmitPeriodicL1_RSRP_r16_,
      DCP_Config_r16_ps_TransmitOtherPeriodicCSI_r16 ps_TransmitOtherPeriodicCSI_r16_
   ) {
      super();
      ps_RNTI_r16 = ps_RNTI_r16_;
      ps_Offset_r16 = ps_Offset_r16_;
      sizeDCI_2_6_r16 = sizeDCI_2_6_r16_;
      ps_PositionDCI_2_6_r16 = ps_PositionDCI_2_6_r16_;
      ps_WakeUp_r16 = ps_WakeUp_r16_;
      ps_TransmitPeriodicL1_RSRP_r16 = ps_TransmitPeriodicL1_RSRP_r16_;
      ps_TransmitOtherPeriodicCSI_r16 = ps_TransmitOtherPeriodicCSI_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DCP_Config_r16 (
      RNTI_Value ps_RNTI_r16_,
      Asn1Integer ps_Offset_r16_,
      Asn1Integer sizeDCI_2_6_r16_,
      Asn1Integer ps_PositionDCI_2_6_r16_
   ) {
      super();
      ps_RNTI_r16 = ps_RNTI_r16_;
      ps_Offset_r16 = ps_Offset_r16_;
      sizeDCI_2_6_r16 = sizeDCI_2_6_r16_;
      ps_PositionDCI_2_6_r16 = ps_PositionDCI_2_6_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DCP_Config_r16 (long ps_RNTI_r16_,
      long ps_Offset_r16_,
      long sizeDCI_2_6_r16_,
      long ps_PositionDCI_2_6_r16_,
      DCP_Config_r16_ps_WakeUp_r16 ps_WakeUp_r16_,
      DCP_Config_r16_ps_TransmitPeriodicL1_RSRP_r16 ps_TransmitPeriodicL1_RSRP_r16_,
      DCP_Config_r16_ps_TransmitOtherPeriodicCSI_r16 ps_TransmitOtherPeriodicCSI_r16_
   ) {
      super();
      ps_RNTI_r16 = new RNTI_Value (ps_RNTI_r16_);
      ps_Offset_r16 = new Asn1Integer (ps_Offset_r16_);
      sizeDCI_2_6_r16 = new Asn1Integer (sizeDCI_2_6_r16_);
      ps_PositionDCI_2_6_r16 = new Asn1Integer (ps_PositionDCI_2_6_r16_);
      ps_WakeUp_r16 = ps_WakeUp_r16_;
      ps_TransmitPeriodicL1_RSRP_r16 = ps_TransmitPeriodicL1_RSRP_r16_;
      ps_TransmitOtherPeriodicCSI_r16 = ps_TransmitOtherPeriodicCSI_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public DCP_Config_r16 (
      long ps_RNTI_r16_,
      long ps_Offset_r16_,
      long sizeDCI_2_6_r16_,
      long ps_PositionDCI_2_6_r16_
   ) {
      super();
      ps_RNTI_r16 = new RNTI_Value (ps_RNTI_r16_);
      ps_Offset_r16 = new Asn1Integer (ps_Offset_r16_);
      sizeDCI_2_6_r16 = new Asn1Integer (sizeDCI_2_6_r16_);
      ps_PositionDCI_2_6_r16 = new Asn1Integer (ps_PositionDCI_2_6_r16_);
   }

   public void init () {
      ps_RNTI_r16 = null;
      ps_Offset_r16 = null;
      sizeDCI_2_6_r16 = null;
      ps_PositionDCI_2_6_r16 = null;
      ps_WakeUp_r16 = null;
      ps_TransmitPeriodicL1_RSRP_r16 = null;
      ps_TransmitOtherPeriodicCSI_r16 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ps_RNTI_r16;
         case 1: return ps_Offset_r16;
         case 2: return sizeDCI_2_6_r16;
         case 3: return ps_PositionDCI_2_6_r16;
         case 4: return ps_WakeUp_r16;
         case 5: return ps_TransmitPeriodicL1_RSRP_r16;
         case 6: return ps_TransmitOtherPeriodicCSI_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ps-RNTI-r16";
         case 1: return "ps-Offset-r16";
         case 2: return "sizeDCI-2-6-r16";
         case 3: return "ps-PositionDCI-2-6-r16";
         case 4: return "ps-WakeUp-r16";
         case 5: return "ps-TransmitPeriodicL1-RSRP-r16";
         case 6: return "ps-TransmitOtherPeriodicCSI-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ps_WakeUp_r16Present = buffer.decodeBit ("ps_WakeUp_r16Present");
      boolean ps_TransmitPeriodicL1_RSRP_r16Present = buffer.decodeBit ("ps_TransmitPeriodicL1_RSRP_r16Present");
      boolean ps_TransmitOtherPeriodicCSI_r16Present = buffer.decodeBit ("ps_TransmitOtherPeriodicCSI_r16Present");

      // decode ps_RNTI_r16

      buffer.getContext().eventDispatcher.startElement("ps_RNTI_r16", -1);

      ps_RNTI_r16 = new RNTI_Value();
      ps_RNTI_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ps_RNTI_r16", -1);

      // decode ps_Offset_r16

      buffer.getContext().eventDispatcher.startElement("ps_Offset_r16", -1);

      ps_Offset_r16 = new Asn1Integer();
      ps_Offset_r16.decode (buffer, 1, 120);

      buffer.invokeCharacters(ps_Offset_r16.toString());
      buffer.getContext().eventDispatcher.endElement("ps_Offset_r16", -1);

      // decode sizeDCI_2_6_r16

      buffer.getContext().eventDispatcher.startElement("sizeDCI_2_6_r16", -1);

      sizeDCI_2_6_r16 = new Asn1Integer();
      sizeDCI_2_6_r16.decode (buffer, 1, 140);

      buffer.invokeCharacters(sizeDCI_2_6_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sizeDCI_2_6_r16", -1);

      // decode ps_PositionDCI_2_6_r16

      buffer.getContext().eventDispatcher.startElement("ps_PositionDCI_2_6_r16", -1);

      ps_PositionDCI_2_6_r16 = new Asn1Integer();
      ps_PositionDCI_2_6_r16.decode (buffer, 0, 139);

      buffer.invokeCharacters(ps_PositionDCI_2_6_r16.toString());
      buffer.getContext().eventDispatcher.endElement("ps_PositionDCI_2_6_r16", -1);

      // decode ps_WakeUp_r16

      if (ps_WakeUp_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ps_WakeUp_r16", -1);

         int tval = DCP_Config_r16_ps_WakeUp_r16.decodeEnumValue (buffer);
         ps_WakeUp_r16 = DCP_Config_r16_ps_WakeUp_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ps_WakeUp_r16", -1);
      }
      else {
         ps_WakeUp_r16 = null;
      }

      // decode ps_TransmitPeriodicL1_RSRP_r16

      if (ps_TransmitPeriodicL1_RSRP_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ps_TransmitPeriodicL1_RSRP_r16", -1);

         int tval = DCP_Config_r16_ps_TransmitPeriodicL1_RSRP_r16.decodeEnumValue (buffer);
         ps_TransmitPeriodicL1_RSRP_r16 = DCP_Config_r16_ps_TransmitPeriodicL1_RSRP_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ps_TransmitPeriodicL1_RSRP_r16", -1);
      }
      else {
         ps_TransmitPeriodicL1_RSRP_r16 = null;
      }

      // decode ps_TransmitOtherPeriodicCSI_r16

      if (ps_TransmitOtherPeriodicCSI_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ps_TransmitOtherPeriodicCSI_r16", -1);

         int tval = DCP_Config_r16_ps_TransmitOtherPeriodicCSI_r16.decodeEnumValue (buffer);
         ps_TransmitOtherPeriodicCSI_r16 = DCP_Config_r16_ps_TransmitOtherPeriodicCSI_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ps_TransmitOtherPeriodicCSI_r16", -1);
      }
      else {
         ps_TransmitOtherPeriodicCSI_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ps_RNTI_r16 != null) ps_RNTI_r16.print (_sb, "ps_RNTI_r16", _level+1);
      if (ps_Offset_r16 != null) ps_Offset_r16.print (_sb, "ps_Offset_r16", _level+1);
      if (sizeDCI_2_6_r16 != null) sizeDCI_2_6_r16.print (_sb, "sizeDCI_2_6_r16", _level+1);
      if (ps_PositionDCI_2_6_r16 != null) ps_PositionDCI_2_6_r16.print (_sb, "ps_PositionDCI_2_6_r16", _level+1);
      if (ps_WakeUp_r16 != null) ps_WakeUp_r16.print (_sb, "ps_WakeUp_r16", _level+1);
      if (ps_TransmitPeriodicL1_RSRP_r16 != null) ps_TransmitPeriodicL1_RSRP_r16.print (_sb, "ps_TransmitPeriodicL1_RSRP_r16", _level+1);
      if (ps_TransmitOtherPeriodicCSI_r16 != null) ps_TransmitOtherPeriodicCSI_r16.print (_sb, "ps_TransmitOtherPeriodicCSI_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
