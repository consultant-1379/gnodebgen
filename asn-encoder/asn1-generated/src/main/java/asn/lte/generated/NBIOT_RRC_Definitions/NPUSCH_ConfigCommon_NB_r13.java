/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPUSCH_ConfigCommon_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NPUSCH-ConfigCommon-NB-r13";
   }

   public NPUSCH_ConfigCommon_NB_r13_ack_NACK_NumRepetitions_Msg4_r13 ack_NACK_NumRepetitions_Msg4_r13;
   public NPUSCH_ConfigCommon_NB_r13_srs_SubframeConfig_r13 srs_SubframeConfig_r13 = null;  // optional
   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 dmrs_Config_r13;  // optional
   public UL_ReferenceSignalsNPUSCH_NB_r13 ul_ReferenceSignalsNPUSCH_r13;

   public NPUSCH_ConfigCommon_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPUSCH_ConfigCommon_NB_r13 (
      NPUSCH_ConfigCommon_NB_r13_ack_NACK_NumRepetitions_Msg4_r13 ack_NACK_NumRepetitions_Msg4_r13_,
      NPUSCH_ConfigCommon_NB_r13_srs_SubframeConfig_r13 srs_SubframeConfig_r13_,
      NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 dmrs_Config_r13_,
      UL_ReferenceSignalsNPUSCH_NB_r13 ul_ReferenceSignalsNPUSCH_r13_
   ) {
      super();
      ack_NACK_NumRepetitions_Msg4_r13 = ack_NACK_NumRepetitions_Msg4_r13_;
      srs_SubframeConfig_r13 = srs_SubframeConfig_r13_;
      dmrs_Config_r13 = dmrs_Config_r13_;
      ul_ReferenceSignalsNPUSCH_r13 = ul_ReferenceSignalsNPUSCH_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NPUSCH_ConfigCommon_NB_r13 (
      NPUSCH_ConfigCommon_NB_r13_ack_NACK_NumRepetitions_Msg4_r13 ack_NACK_NumRepetitions_Msg4_r13_,
      UL_ReferenceSignalsNPUSCH_NB_r13 ul_ReferenceSignalsNPUSCH_r13_
   ) {
      super();
      ack_NACK_NumRepetitions_Msg4_r13 = ack_NACK_NumRepetitions_Msg4_r13_;
      ul_ReferenceSignalsNPUSCH_r13 = ul_ReferenceSignalsNPUSCH_r13_;
   }

   public void init () {
      ack_NACK_NumRepetitions_Msg4_r13 = null;
      srs_SubframeConfig_r13 = null;
      dmrs_Config_r13 = null;
      ul_ReferenceSignalsNPUSCH_r13 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ack_NACK_NumRepetitions_Msg4_r13;
         case 1: return srs_SubframeConfig_r13;
         case 2: return dmrs_Config_r13;
         case 3: return ul_ReferenceSignalsNPUSCH_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ack-NACK-NumRepetitions-Msg4-r13";
         case 1: return "srs-SubframeConfig-r13";
         case 2: return "dmrs-Config-r13";
         case 3: return "ul-ReferenceSignalsNPUSCH-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean srs_SubframeConfig_r13Present = buffer.decodeBit ("srs_SubframeConfig_r13Present");
      boolean dmrs_Config_r13Present = buffer.decodeBit ("dmrs_Config_r13Present");

      // decode ack_NACK_NumRepetitions_Msg4_r13

      buffer.getContext().eventDispatcher.startElement("ack_NACK_NumRepetitions_Msg4_r13", -1);

      ack_NACK_NumRepetitions_Msg4_r13 = new NPUSCH_ConfigCommon_NB_r13_ack_NACK_NumRepetitions_Msg4_r13();
      ack_NACK_NumRepetitions_Msg4_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ack_NACK_NumRepetitions_Msg4_r13", -1);

      // decode srs_SubframeConfig_r13

      if (srs_SubframeConfig_r13Present) {
         buffer.getContext().eventDispatcher.startElement("srs_SubframeConfig_r13", -1);

         int tval = NPUSCH_ConfigCommon_NB_r13_srs_SubframeConfig_r13.decodeEnumValue (buffer);
         srs_SubframeConfig_r13 = NPUSCH_ConfigCommon_NB_r13_srs_SubframeConfig_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("srs_SubframeConfig_r13", -1);
      }
      else {
         srs_SubframeConfig_r13 = null;
      }

      // decode dmrs_Config_r13

      if (dmrs_Config_r13Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_Config_r13", -1);

         dmrs_Config_r13 = new NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13();
         dmrs_Config_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dmrs_Config_r13", -1);
      }
      else {
         dmrs_Config_r13 = null;
      }

      // decode ul_ReferenceSignalsNPUSCH_r13

      buffer.getContext().eventDispatcher.startElement("ul_ReferenceSignalsNPUSCH_r13", -1);

      ul_ReferenceSignalsNPUSCH_r13 = new UL_ReferenceSignalsNPUSCH_NB_r13();
      ul_ReferenceSignalsNPUSCH_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_ReferenceSignalsNPUSCH_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ack_NACK_NumRepetitions_Msg4_r13 != null) ack_NACK_NumRepetitions_Msg4_r13.print (_sb, "ack_NACK_NumRepetitions_Msg4_r13", _level+1);
      if (srs_SubframeConfig_r13 != null) srs_SubframeConfig_r13.print (_sb, "srs_SubframeConfig_r13", _level+1);
      if (dmrs_Config_r13 != null) dmrs_Config_r13.print (_sb, "dmrs_Config_r13", _level+1);
      if (ul_ReferenceSignalsNPUSCH_r13 != null) ul_ReferenceSignalsNPUSCH_r13.print (_sb, "ul_ReferenceSignalsNPUSCH_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
