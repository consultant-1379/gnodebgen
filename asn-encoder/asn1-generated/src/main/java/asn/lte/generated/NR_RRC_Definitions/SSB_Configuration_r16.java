/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_Configuration_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SSB-Configuration-r16";
   }

   public ARFCN_ValueNR ssb_Freq_r16;
   public SSB_Configuration_r16_halfFrameIndex_r16 halfFrameIndex_r16 = null;
   public SubcarrierSpacing ssbSubcarrierSpacing_r16 = null;
   public SSB_Configuration_r16_ssb_Periodicity_r16 ssb_Periodicity_r16 = null;  // optional
   public SSB_Configuration_r16_sfn0_Offset_r16 sfn0_Offset_r16;  // optional
   public Asn1Integer sfn_SSB_Offset_r16;
   public Asn1Integer ss_PBCH_BlockPower_r16;  // optional

   public SSB_Configuration_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SSB_Configuration_r16 (
      ARFCN_ValueNR ssb_Freq_r16_,
      SSB_Configuration_r16_halfFrameIndex_r16 halfFrameIndex_r16_,
      SubcarrierSpacing ssbSubcarrierSpacing_r16_,
      SSB_Configuration_r16_ssb_Periodicity_r16 ssb_Periodicity_r16_,
      SSB_Configuration_r16_sfn0_Offset_r16 sfn0_Offset_r16_,
      Asn1Integer sfn_SSB_Offset_r16_,
      Asn1Integer ss_PBCH_BlockPower_r16_
   ) {
      super();
      ssb_Freq_r16 = ssb_Freq_r16_;
      halfFrameIndex_r16 = halfFrameIndex_r16_;
      ssbSubcarrierSpacing_r16 = ssbSubcarrierSpacing_r16_;
      ssb_Periodicity_r16 = ssb_Periodicity_r16_;
      sfn0_Offset_r16 = sfn0_Offset_r16_;
      sfn_SSB_Offset_r16 = sfn_SSB_Offset_r16_;
      ss_PBCH_BlockPower_r16 = ss_PBCH_BlockPower_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SSB_Configuration_r16 (
      ARFCN_ValueNR ssb_Freq_r16_,
      SSB_Configuration_r16_halfFrameIndex_r16 halfFrameIndex_r16_,
      SubcarrierSpacing ssbSubcarrierSpacing_r16_,
      Asn1Integer sfn_SSB_Offset_r16_
   ) {
      super();
      ssb_Freq_r16 = ssb_Freq_r16_;
      halfFrameIndex_r16 = halfFrameIndex_r16_;
      ssbSubcarrierSpacing_r16 = ssbSubcarrierSpacing_r16_;
      sfn_SSB_Offset_r16 = sfn_SSB_Offset_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SSB_Configuration_r16 (long ssb_Freq_r16_,
      SSB_Configuration_r16_halfFrameIndex_r16 halfFrameIndex_r16_,
      SubcarrierSpacing ssbSubcarrierSpacing_r16_,
      SSB_Configuration_r16_ssb_Periodicity_r16 ssb_Periodicity_r16_,
      SSB_Configuration_r16_sfn0_Offset_r16 sfn0_Offset_r16_,
      long sfn_SSB_Offset_r16_,
      long ss_PBCH_BlockPower_r16_
   ) {
      super();
      ssb_Freq_r16 = new ARFCN_ValueNR (ssb_Freq_r16_);
      halfFrameIndex_r16 = halfFrameIndex_r16_;
      ssbSubcarrierSpacing_r16 = ssbSubcarrierSpacing_r16_;
      ssb_Periodicity_r16 = ssb_Periodicity_r16_;
      sfn0_Offset_r16 = sfn0_Offset_r16_;
      sfn_SSB_Offset_r16 = new Asn1Integer (sfn_SSB_Offset_r16_);
      ss_PBCH_BlockPower_r16 = new Asn1Integer (ss_PBCH_BlockPower_r16_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SSB_Configuration_r16 (
      long ssb_Freq_r16_,
      SSB_Configuration_r16_halfFrameIndex_r16 halfFrameIndex_r16_,
      SubcarrierSpacing ssbSubcarrierSpacing_r16_,
      long sfn_SSB_Offset_r16_
   ) {
      super();
      ssb_Freq_r16 = new ARFCN_ValueNR (ssb_Freq_r16_);
      halfFrameIndex_r16 = halfFrameIndex_r16_;
      ssbSubcarrierSpacing_r16 = ssbSubcarrierSpacing_r16_;
      sfn_SSB_Offset_r16 = new Asn1Integer (sfn_SSB_Offset_r16_);
   }

   public void init () {
      ssb_Freq_r16 = null;
      halfFrameIndex_r16 = null;
      ssbSubcarrierSpacing_r16 = null;
      ssb_Periodicity_r16 = null;
      sfn0_Offset_r16 = null;
      sfn_SSB_Offset_r16 = null;
      ss_PBCH_BlockPower_r16 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ssb_Freq_r16;
         case 1: return halfFrameIndex_r16;
         case 2: return ssbSubcarrierSpacing_r16;
         case 3: return ssb_Periodicity_r16;
         case 4: return sfn0_Offset_r16;
         case 5: return sfn_SSB_Offset_r16;
         case 6: return ss_PBCH_BlockPower_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ssb-Freq-r16";
         case 1: return "halfFrameIndex-r16";
         case 2: return "ssbSubcarrierSpacing-r16";
         case 3: return "ssb-Periodicity-r16";
         case 4: return "sfn0-Offset-r16";
         case 5: return "sfn-SSB-Offset-r16";
         case 6: return "ss-PBCH-BlockPower-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ssb_Periodicity_r16Present = buffer.decodeBit ("ssb_Periodicity_r16Present");
      boolean sfn0_Offset_r16Present = buffer.decodeBit ("sfn0_Offset_r16Present");
      boolean ss_PBCH_BlockPower_r16Present = buffer.decodeBit ("ss_PBCH_BlockPower_r16Present");

      // decode ssb_Freq_r16

      buffer.getContext().eventDispatcher.startElement("ssb_Freq_r16", -1);

      ssb_Freq_r16 = new ARFCN_ValueNR();
      ssb_Freq_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ssb_Freq_r16", -1);

      // decode halfFrameIndex_r16

      buffer.getContext().eventDispatcher.startElement("halfFrameIndex_r16", -1);

      {
         int tval = SSB_Configuration_r16_halfFrameIndex_r16.decodeEnumValue (buffer);
         halfFrameIndex_r16 = SSB_Configuration_r16_halfFrameIndex_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("halfFrameIndex_r16", -1);

      // decode ssbSubcarrierSpacing_r16

      buffer.getContext().eventDispatcher.startElement("ssbSubcarrierSpacing_r16", -1);

      {
         int tval = SubcarrierSpacing.decodeEnumValue (buffer);
         ssbSubcarrierSpacing_r16 = SubcarrierSpacing.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ssbSubcarrierSpacing_r16", -1);

      // decode ssb_Periodicity_r16

      if (ssb_Periodicity_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ssb_Periodicity_r16", -1);

         int tval = SSB_Configuration_r16_ssb_Periodicity_r16.decodeEnumValue (buffer);
         ssb_Periodicity_r16 = SSB_Configuration_r16_ssb_Periodicity_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ssb_Periodicity_r16", -1);
      }
      else {
         ssb_Periodicity_r16 = null;
      }

      // decode sfn0_Offset_r16

      if (sfn0_Offset_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sfn0_Offset_r16", -1);

         sfn0_Offset_r16 = new SSB_Configuration_r16_sfn0_Offset_r16();
         sfn0_Offset_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sfn0_Offset_r16", -1);
      }
      else {
         sfn0_Offset_r16 = null;
      }

      // decode sfn_SSB_Offset_r16

      buffer.getContext().eventDispatcher.startElement("sfn_SSB_Offset_r16", -1);

      sfn_SSB_Offset_r16 = new Asn1Integer();
      sfn_SSB_Offset_r16.decode (buffer, 0, 15);

      buffer.invokeCharacters(sfn_SSB_Offset_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sfn_SSB_Offset_r16", -1);

      // decode ss_PBCH_BlockPower_r16

      if (ss_PBCH_BlockPower_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ss_PBCH_BlockPower_r16", -1);

         ss_PBCH_BlockPower_r16 = new Asn1Integer();
         ss_PBCH_BlockPower_r16.decode (buffer, -60, 50);

         buffer.invokeCharacters(ss_PBCH_BlockPower_r16.toString());
         buffer.getContext().eventDispatcher.endElement("ss_PBCH_BlockPower_r16", -1);
      }
      else {
         ss_PBCH_BlockPower_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ssb_Freq_r16 != null) ssb_Freq_r16.print (_sb, "ssb_Freq_r16", _level+1);
      if (halfFrameIndex_r16 != null) halfFrameIndex_r16.print (_sb, "halfFrameIndex_r16", _level+1);
      if (ssbSubcarrierSpacing_r16 != null) ssbSubcarrierSpacing_r16.print (_sb, "ssbSubcarrierSpacing_r16", _level+1);
      if (ssb_Periodicity_r16 != null) ssb_Periodicity_r16.print (_sb, "ssb_Periodicity_r16", _level+1);
      if (sfn0_Offset_r16 != null) sfn0_Offset_r16.print (_sb, "sfn0_Offset_r16", _level+1);
      if (sfn_SSB_Offset_r16 != null) sfn_SSB_Offset_r16.print (_sb, "sfn_SSB_Offset_r16", _level+1);
      if (ss_PBCH_BlockPower_r16 != null) ss_PBCH_BlockPower_r16.print (_sb, "ss_PBCH_BlockPower_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
