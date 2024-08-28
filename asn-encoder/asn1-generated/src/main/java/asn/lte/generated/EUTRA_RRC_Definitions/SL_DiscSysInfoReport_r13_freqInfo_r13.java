/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscSysInfoReport_r13_freqInfo_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ARFCN_ValueEUTRA ul_CarrierFreq_r13;  // optional
   public SL_DiscSysInfoReport_r13_freqInfo_r13_ul_Bandwidth_r13 ul_Bandwidth_r13 = null;  // optional
   public AdditionalSpectrumEmission additionalSpectrumEmission_r13;  // optional

   public SL_DiscSysInfoReport_r13_freqInfo_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_DiscSysInfoReport_r13_freqInfo_r13 (
      ARFCN_ValueEUTRA ul_CarrierFreq_r13_,
      SL_DiscSysInfoReport_r13_freqInfo_r13_ul_Bandwidth_r13 ul_Bandwidth_r13_,
      AdditionalSpectrumEmission additionalSpectrumEmission_r13_
   ) {
      super();
      ul_CarrierFreq_r13 = ul_CarrierFreq_r13_;
      ul_Bandwidth_r13 = ul_Bandwidth_r13_;
      additionalSpectrumEmission_r13 = additionalSpectrumEmission_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_DiscSysInfoReport_r13_freqInfo_r13 (long ul_CarrierFreq_r13_,
      SL_DiscSysInfoReport_r13_freqInfo_r13_ul_Bandwidth_r13 ul_Bandwidth_r13_,
      long additionalSpectrumEmission_r13_
   ) {
      super();
      ul_CarrierFreq_r13 = new ARFCN_ValueEUTRA (ul_CarrierFreq_r13_);
      ul_Bandwidth_r13 = ul_Bandwidth_r13_;
      additionalSpectrumEmission_r13 = new AdditionalSpectrumEmission (additionalSpectrumEmission_r13_);
   }

   public void init () {
      ul_CarrierFreq_r13 = null;
      ul_Bandwidth_r13 = null;
      additionalSpectrumEmission_r13 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_CarrierFreq_r13;
         case 1: return ul_Bandwidth_r13;
         case 2: return additionalSpectrumEmission_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-CarrierFreq-r13";
         case 1: return "ul-Bandwidth-r13";
         case 2: return "additionalSpectrumEmission-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ul_CarrierFreq_r13Present = buffer.decodeBit ("ul_CarrierFreq_r13Present");
      boolean ul_Bandwidth_r13Present = buffer.decodeBit ("ul_Bandwidth_r13Present");
      boolean additionalSpectrumEmission_r13Present = buffer.decodeBit ("additionalSpectrumEmission_r13Present");

      // decode ul_CarrierFreq_r13

      if (ul_CarrierFreq_r13Present) {
         buffer.getContext().eventDispatcher.startElement("ul_CarrierFreq_r13", -1);

         ul_CarrierFreq_r13 = new ARFCN_ValueEUTRA();
         ul_CarrierFreq_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_CarrierFreq_r13", -1);
      }
      else {
         ul_CarrierFreq_r13 = null;
      }

      // decode ul_Bandwidth_r13

      if (ul_Bandwidth_r13Present) {
         buffer.getContext().eventDispatcher.startElement("ul_Bandwidth_r13", -1);

         int tval = SL_DiscSysInfoReport_r13_freqInfo_r13_ul_Bandwidth_r13.decodeEnumValue (buffer);
         ul_Bandwidth_r13 = SL_DiscSysInfoReport_r13_freqInfo_r13_ul_Bandwidth_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_Bandwidth_r13", -1);
      }
      else {
         ul_Bandwidth_r13 = null;
      }

      // decode additionalSpectrumEmission_r13

      if (additionalSpectrumEmission_r13Present) {
         buffer.getContext().eventDispatcher.startElement("additionalSpectrumEmission_r13", -1);

         additionalSpectrumEmission_r13 = new AdditionalSpectrumEmission();
         additionalSpectrumEmission_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("additionalSpectrumEmission_r13", -1);
      }
      else {
         additionalSpectrumEmission_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_CarrierFreq_r13 != null) ul_CarrierFreq_r13.print (_sb, "ul_CarrierFreq_r13", _level+1);
      if (ul_Bandwidth_r13 != null) ul_Bandwidth_r13.print (_sb, "ul_Bandwidth_r13", _level+1);
      if (additionalSpectrumEmission_r13 != null) additionalSpectrumEmission_r13.print (_sb, "additionalSpectrumEmission_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
