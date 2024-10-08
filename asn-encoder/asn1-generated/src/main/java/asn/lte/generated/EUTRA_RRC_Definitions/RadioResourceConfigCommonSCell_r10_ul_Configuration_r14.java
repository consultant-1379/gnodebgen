/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RadioResourceConfigCommonSCell_r10_ul_Configuration_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RadioResourceConfigCommonSCell_r10_ul_Configuration_r14_ul_FreqInfo_r14 ul_FreqInfo_r14;
   public P_Max p_Max_r14;  // optional
   public SoundingRS_UL_ConfigCommon soundingRS_UL_ConfigCommon_r14;
   public UL_CyclicPrefixLength ul_CyclicPrefixLength_r14 = null;
   public PRACH_ConfigSCell_r10 prach_ConfigSCell_r14;  // optional
   public UplinkPowerControlCommonPUSCH_LessCell_v1430 uplinkPowerControlCommonPUSCH_LessCell_v1430;  // optional

   public RadioResourceConfigCommonSCell_r10_ul_Configuration_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RadioResourceConfigCommonSCell_r10_ul_Configuration_r14 (
      RadioResourceConfigCommonSCell_r10_ul_Configuration_r14_ul_FreqInfo_r14 ul_FreqInfo_r14_,
      P_Max p_Max_r14_,
      SoundingRS_UL_ConfigCommon soundingRS_UL_ConfigCommon_r14_,
      UL_CyclicPrefixLength ul_CyclicPrefixLength_r14_,
      PRACH_ConfigSCell_r10 prach_ConfigSCell_r14_,
      UplinkPowerControlCommonPUSCH_LessCell_v1430 uplinkPowerControlCommonPUSCH_LessCell_v1430_
   ) {
      super();
      ul_FreqInfo_r14 = ul_FreqInfo_r14_;
      p_Max_r14 = p_Max_r14_;
      soundingRS_UL_ConfigCommon_r14 = soundingRS_UL_ConfigCommon_r14_;
      ul_CyclicPrefixLength_r14 = ul_CyclicPrefixLength_r14_;
      prach_ConfigSCell_r14 = prach_ConfigSCell_r14_;
      uplinkPowerControlCommonPUSCH_LessCell_v1430 = uplinkPowerControlCommonPUSCH_LessCell_v1430_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RadioResourceConfigCommonSCell_r10_ul_Configuration_r14 (
      RadioResourceConfigCommonSCell_r10_ul_Configuration_r14_ul_FreqInfo_r14 ul_FreqInfo_r14_,
      SoundingRS_UL_ConfigCommon soundingRS_UL_ConfigCommon_r14_,
      UL_CyclicPrefixLength ul_CyclicPrefixLength_r14_
   ) {
      super();
      ul_FreqInfo_r14 = ul_FreqInfo_r14_;
      soundingRS_UL_ConfigCommon_r14 = soundingRS_UL_ConfigCommon_r14_;
      ul_CyclicPrefixLength_r14 = ul_CyclicPrefixLength_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RadioResourceConfigCommonSCell_r10_ul_Configuration_r14 (RadioResourceConfigCommonSCell_r10_ul_Configuration_r14_ul_FreqInfo_r14 ul_FreqInfo_r14_,
      long p_Max_r14_,
      SoundingRS_UL_ConfigCommon soundingRS_UL_ConfigCommon_r14_,
      UL_CyclicPrefixLength ul_CyclicPrefixLength_r14_,
      PRACH_ConfigSCell_r10 prach_ConfigSCell_r14_,
      UplinkPowerControlCommonPUSCH_LessCell_v1430 uplinkPowerControlCommonPUSCH_LessCell_v1430_
   ) {
      super();
      ul_FreqInfo_r14 = ul_FreqInfo_r14_;
      p_Max_r14 = new P_Max (p_Max_r14_);
      soundingRS_UL_ConfigCommon_r14 = soundingRS_UL_ConfigCommon_r14_;
      ul_CyclicPrefixLength_r14 = ul_CyclicPrefixLength_r14_;
      prach_ConfigSCell_r14 = prach_ConfigSCell_r14_;
      uplinkPowerControlCommonPUSCH_LessCell_v1430 = uplinkPowerControlCommonPUSCH_LessCell_v1430_;
   }

   public void init () {
      ul_FreqInfo_r14 = null;
      p_Max_r14 = null;
      soundingRS_UL_ConfigCommon_r14 = null;
      ul_CyclicPrefixLength_r14 = null;
      prach_ConfigSCell_r14 = null;
      uplinkPowerControlCommonPUSCH_LessCell_v1430 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_FreqInfo_r14;
         case 1: return p_Max_r14;
         case 2: return soundingRS_UL_ConfigCommon_r14;
         case 3: return ul_CyclicPrefixLength_r14;
         case 4: return prach_ConfigSCell_r14;
         case 5: return uplinkPowerControlCommonPUSCH_LessCell_v1430;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-FreqInfo-r14";
         case 1: return "p-Max-r14";
         case 2: return "soundingRS-UL-ConfigCommon-r14";
         case 3: return "ul-CyclicPrefixLength-r14";
         case 4: return "prach-ConfigSCell-r14";
         case 5: return "uplinkPowerControlCommonPUSCH-LessCell-v1430";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean p_Max_r14Present = buffer.decodeBit ("p_Max_r14Present");
      boolean prach_ConfigSCell_r14Present = buffer.decodeBit ("prach_ConfigSCell_r14Present");
      boolean uplinkPowerControlCommonPUSCH_LessCell_v1430Present = buffer.decodeBit ("uplinkPowerControlCommonPUSCH_LessCell_v1430Present");

      // decode ul_FreqInfo_r14

      buffer.getContext().eventDispatcher.startElement("ul_FreqInfo_r14", -1);

      ul_FreqInfo_r14 = new RadioResourceConfigCommonSCell_r10_ul_Configuration_r14_ul_FreqInfo_r14();
      ul_FreqInfo_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_FreqInfo_r14", -1);

      // decode p_Max_r14

      if (p_Max_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p_Max_r14", -1);

         p_Max_r14 = new P_Max();
         p_Max_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p_Max_r14", -1);
      }
      else {
         p_Max_r14 = null;
      }

      // decode soundingRS_UL_ConfigCommon_r14

      buffer.getContext().eventDispatcher.startElement("soundingRS_UL_ConfigCommon_r14", -1);

      soundingRS_UL_ConfigCommon_r14 = new SoundingRS_UL_ConfigCommon();
      soundingRS_UL_ConfigCommon_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("soundingRS_UL_ConfigCommon_r14", -1);

      // decode ul_CyclicPrefixLength_r14

      buffer.getContext().eventDispatcher.startElement("ul_CyclicPrefixLength_r14", -1);

      {
         int tval = UL_CyclicPrefixLength.decodeEnumValue (buffer);
         ul_CyclicPrefixLength_r14 = UL_CyclicPrefixLength.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ul_CyclicPrefixLength_r14", -1);

      // decode prach_ConfigSCell_r14

      if (prach_ConfigSCell_r14Present) {
         buffer.getContext().eventDispatcher.startElement("prach_ConfigSCell_r14", -1);

         prach_ConfigSCell_r14 = new PRACH_ConfigSCell_r10();
         prach_ConfigSCell_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("prach_ConfigSCell_r14", -1);
      }
      else {
         prach_ConfigSCell_r14 = null;
      }

      // decode uplinkPowerControlCommonPUSCH_LessCell_v1430

      if (uplinkPowerControlCommonPUSCH_LessCell_v1430Present) {
         buffer.getContext().eventDispatcher.startElement("uplinkPowerControlCommonPUSCH_LessCell_v1430", -1);

         uplinkPowerControlCommonPUSCH_LessCell_v1430 = new UplinkPowerControlCommonPUSCH_LessCell_v1430();
         uplinkPowerControlCommonPUSCH_LessCell_v1430.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uplinkPowerControlCommonPUSCH_LessCell_v1430", -1);
      }
      else {
         uplinkPowerControlCommonPUSCH_LessCell_v1430 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_FreqInfo_r14 != null) ul_FreqInfo_r14.print (_sb, "ul_FreqInfo_r14", _level+1);
      if (p_Max_r14 != null) p_Max_r14.print (_sb, "p_Max_r14", _level+1);
      if (soundingRS_UL_ConfigCommon_r14 != null) soundingRS_UL_ConfigCommon_r14.print (_sb, "soundingRS_UL_ConfigCommon_r14", _level+1);
      if (ul_CyclicPrefixLength_r14 != null) ul_CyclicPrefixLength_r14.print (_sb, "ul_CyclicPrefixLength_r14", _level+1);
      if (prach_ConfigSCell_r14 != null) prach_ConfigSCell_r14.print (_sb, "prach_ConfigSCell_r14", _level+1);
      if (uplinkPowerControlCommonPUSCH_LessCell_v1430 != null) uplinkPowerControlCommonPUSCH_LessCell_v1430.print (_sb, "uplinkPowerControlCommonPUSCH_LessCell_v1430", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
