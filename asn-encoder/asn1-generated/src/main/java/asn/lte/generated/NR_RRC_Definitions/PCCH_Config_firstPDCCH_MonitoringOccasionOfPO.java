/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PCCH_Config_firstPDCCH_MonitoringOccasionOfPO extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SCS15KHZONET = 1;
   public final static byte _SCS30KHZONET_SCS15KHZHALFT = 2;
   public final static byte _SCS60KHZONET_SCS30KHZHALFT_SCS15KHZQUARTERT = 3;
   public final static byte _SCS120KHZONET_SCS60KHZHALFT_SCS30KHZQUARTERT_SCS15KHZONEEIGHTHT = 4;
   public final static byte _SCS120KHZHALFT_SCS60KHZQUARTERT_SCS30KHZONEEIGHTHT_SCS15KHZONESIXTEENTHT = 5;
   public final static byte _SCS120KHZQUARTERT_SCS60KHZONEEIGHTHT_SCS30KHZONESIXTEENTHT = 6;
   public final static byte _SCS120KHZONEEIGHTHT_SCS60KHZONESIXTEENTHT = 7;
   public final static byte _SCS120KHZONESIXTEENTHT = 8;

   public PCCH_Config_firstPDCCH_MonitoringOccasionOfPO () {
      super();
   }

   public PCCH_Config_firstPDCCH_MonitoringOccasionOfPO (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SCS15KHZONET: return "sCS15KHZoneT";
      case _SCS30KHZONET_SCS15KHZHALFT: return "sCS30KHZoneT_SCS15KHZhalfT";
      case _SCS60KHZONET_SCS30KHZHALFT_SCS15KHZQUARTERT: return "sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT";
      case _SCS120KHZONET_SCS60KHZHALFT_SCS30KHZQUARTERT_SCS15KHZONEEIGHTHT: return "sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT";
      case _SCS120KHZHALFT_SCS60KHZQUARTERT_SCS30KHZONEEIGHTHT_SCS15KHZONESIXTEENTHT: return "sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT";
      case _SCS120KHZQUARTERT_SCS60KHZONEEIGHTHT_SCS30KHZONESIXTEENTHT: return "sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT";
      case _SCS120KHZONEEIGHTHT_SCS60KHZONESIXTEENTHT: return "sCS120KHZoneEighthT_SCS60KHZoneSixteenthT";
      case _SCS120KHZONESIXTEENTHT: return "sCS120KHZoneSixteenthT";
      default: return "UNDEFINED";
      }
   }

   public void set_sCS15KHZoneT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS15KHZoneT value) {
      setElement (_SCS15KHZONET, value);
   }

   public void set_sCS30KHZoneT_SCS15KHZhalfT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS30KHZoneT_SCS15KHZhalfT value) {
      setElement (_SCS30KHZONET_SCS15KHZHALFT, value);
   }

   public void set_sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT value) {
      setElement (_SCS60KHZONET_SCS30KHZHALFT_SCS15KHZQUARTERT, value);
   }

   public void set_sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT value) {
      setElement (_SCS120KHZONET_SCS60KHZHALFT_SCS30KHZQUARTERT_SCS15KHZONEEIGHTHT, value);
   }

   public void set_sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT value) {
      setElement (_SCS120KHZHALFT_SCS60KHZQUARTERT_SCS30KHZONEEIGHTHT_SCS15KHZONESIXTEENTHT, value);
   }

   public void set_sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT value) {
      setElement (_SCS120KHZQUARTERT_SCS60KHZONEEIGHTHT_SCS30KHZONESIXTEENTHT, value);
   }

   public void set_sCS120KHZoneEighthT_SCS60KHZoneSixteenthT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneEighthT_SCS60KHZoneSixteenthT value) {
      setElement (_SCS120KHZONEEIGHTHT_SCS60KHZONESIXTEENTHT, value);
   }

   public void set_sCS120KHZoneSixteenthT (PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneSixteenthT value) {
      setElement (_SCS120KHZONESIXTEENTHT, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (8, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sCS15KHZoneT
         case 0: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS15KHZoneT sCS15KHZoneT;
            element = sCS15KHZoneT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS15KHZoneT();
            sCS15KHZoneT.decode (buffer);
            break;
         }

         // sCS30KHZoneT_SCS15KHZhalfT
         case 1: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS30KHZoneT_SCS15KHZhalfT sCS30KHZoneT_SCS15KHZhalfT;
            element = sCS30KHZoneT_SCS15KHZhalfT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS30KHZoneT_SCS15KHZhalfT();
            sCS30KHZoneT_SCS15KHZhalfT.decode (buffer);
            break;
         }

         // sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT
         case 2: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT;
            element = sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT();
            sCS60KHZoneT_SCS30KHZhalfT_SCS15KHZquarterT.decode (buffer);
            break;
         }

         // sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT
         case 3: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT;
            element = sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT();
            sCS120KHZoneT_SCS60KHZhalfT_SCS30KHZquarterT_SCS15KHZoneEighthT.decode (buffer);
            break;
         }

         // sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT
         case 4: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT;
            element = sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT();
            sCS120KHZhalfT_SCS60KHZquarterT_SCS30KHZoneEighthT_SCS15KHZoneSixteenthT.decode (buffer);
            break;
         }

         // sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT
         case 5: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT;
            element = sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT();
            sCS120KHZquarterT_SCS60KHZoneEighthT_SCS30KHZoneSixteenthT.decode (buffer);
            break;
         }

         // sCS120KHZoneEighthT_SCS60KHZoneSixteenthT
         case 6: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneEighthT_SCS60KHZoneSixteenthT sCS120KHZoneEighthT_SCS60KHZoneSixteenthT;
            element = sCS120KHZoneEighthT_SCS60KHZoneSixteenthT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneEighthT_SCS60KHZoneSixteenthT();
            sCS120KHZoneEighthT_SCS60KHZoneSixteenthT.decode (buffer);
            break;
         }

         // sCS120KHZoneSixteenthT
         case 7: { 
            PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneSixteenthT sCS120KHZoneSixteenthT;
            element = sCS120KHZoneSixteenthT = new PCCH_Config_firstPDCCH_MonitoringOccasionOfPO_sCS120KHZoneSixteenthT();
            sCS120KHZoneSixteenthT.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
