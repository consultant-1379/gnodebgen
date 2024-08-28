/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RateMatchPatternLTE_CRS extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RateMatchPatternLTE-CRS";
   }

   public Asn1Integer carrierFreqDL;
   public RateMatchPatternLTE_CRS_carrierBandwidthDL carrierBandwidthDL = null;
   public EUTRA_MBSFN_SubframeConfigList mbsfn_SubframeConfigList;  // optional
   public RateMatchPatternLTE_CRS_nrofCRS_Ports nrofCRS_Ports = null;
   public RateMatchPatternLTE_CRS_v_Shift v_Shift = null;

   public RateMatchPatternLTE_CRS () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RateMatchPatternLTE_CRS (
      Asn1Integer carrierFreqDL_,
      RateMatchPatternLTE_CRS_carrierBandwidthDL carrierBandwidthDL_,
      EUTRA_MBSFN_SubframeConfigList mbsfn_SubframeConfigList_,
      RateMatchPatternLTE_CRS_nrofCRS_Ports nrofCRS_Ports_,
      RateMatchPatternLTE_CRS_v_Shift v_Shift_
   ) {
      super();
      carrierFreqDL = carrierFreqDL_;
      carrierBandwidthDL = carrierBandwidthDL_;
      mbsfn_SubframeConfigList = mbsfn_SubframeConfigList_;
      nrofCRS_Ports = nrofCRS_Ports_;
      v_Shift = v_Shift_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RateMatchPatternLTE_CRS (
      Asn1Integer carrierFreqDL_,
      RateMatchPatternLTE_CRS_carrierBandwidthDL carrierBandwidthDL_,
      RateMatchPatternLTE_CRS_nrofCRS_Ports nrofCRS_Ports_,
      RateMatchPatternLTE_CRS_v_Shift v_Shift_
   ) {
      super();
      carrierFreqDL = carrierFreqDL_;
      carrierBandwidthDL = carrierBandwidthDL_;
      nrofCRS_Ports = nrofCRS_Ports_;
      v_Shift = v_Shift_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RateMatchPatternLTE_CRS (long carrierFreqDL_,
      RateMatchPatternLTE_CRS_carrierBandwidthDL carrierBandwidthDL_,
      EUTRA_MBSFN_SubframeConfigList mbsfn_SubframeConfigList_,
      RateMatchPatternLTE_CRS_nrofCRS_Ports nrofCRS_Ports_,
      RateMatchPatternLTE_CRS_v_Shift v_Shift_
   ) {
      super();
      carrierFreqDL = new Asn1Integer (carrierFreqDL_);
      carrierBandwidthDL = carrierBandwidthDL_;
      mbsfn_SubframeConfigList = mbsfn_SubframeConfigList_;
      nrofCRS_Ports = nrofCRS_Ports_;
      v_Shift = v_Shift_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RateMatchPatternLTE_CRS (
      long carrierFreqDL_,
      RateMatchPatternLTE_CRS_carrierBandwidthDL carrierBandwidthDL_,
      RateMatchPatternLTE_CRS_nrofCRS_Ports nrofCRS_Ports_,
      RateMatchPatternLTE_CRS_v_Shift v_Shift_
   ) {
      super();
      carrierFreqDL = new Asn1Integer (carrierFreqDL_);
      carrierBandwidthDL = carrierBandwidthDL_;
      nrofCRS_Ports = nrofCRS_Ports_;
      v_Shift = v_Shift_;
   }

   public void init () {
      carrierFreqDL = null;
      carrierBandwidthDL = null;
      mbsfn_SubframeConfigList = null;
      nrofCRS_Ports = null;
      v_Shift = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreqDL;
         case 1: return carrierBandwidthDL;
         case 2: return mbsfn_SubframeConfigList;
         case 3: return nrofCRS_Ports;
         case 4: return v_Shift;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreqDL";
         case 1: return "carrierBandwidthDL";
         case 2: return "mbsfn-SubframeConfigList";
         case 3: return "nrofCRS-Ports";
         case 4: return "v-Shift";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mbsfn_SubframeConfigListPresent = buffer.decodeBit ("mbsfn_SubframeConfigListPresent");

      // decode carrierFreqDL

      buffer.getContext().eventDispatcher.startElement("carrierFreqDL", -1);

      carrierFreqDL = new Asn1Integer();
      carrierFreqDL.decode (buffer, 0, 16383);

      buffer.invokeCharacters(carrierFreqDL.toString());
      buffer.getContext().eventDispatcher.endElement("carrierFreqDL", -1);

      // decode carrierBandwidthDL

      buffer.getContext().eventDispatcher.startElement("carrierBandwidthDL", -1);

      {
         int tval = RateMatchPatternLTE_CRS_carrierBandwidthDL.decodeEnumValue (buffer);
         carrierBandwidthDL = RateMatchPatternLTE_CRS_carrierBandwidthDL.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("carrierBandwidthDL", -1);

      // decode mbsfn_SubframeConfigList

      if (mbsfn_SubframeConfigListPresent) {
         buffer.getContext().eventDispatcher.startElement("mbsfn_SubframeConfigList", -1);

         mbsfn_SubframeConfigList = new EUTRA_MBSFN_SubframeConfigList();
         mbsfn_SubframeConfigList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mbsfn_SubframeConfigList", -1);
      }
      else {
         mbsfn_SubframeConfigList = null;
      }

      // decode nrofCRS_Ports

      buffer.getContext().eventDispatcher.startElement("nrofCRS_Ports", -1);

      {
         int tval = RateMatchPatternLTE_CRS_nrofCRS_Ports.decodeEnumValue (buffer);
         nrofCRS_Ports = RateMatchPatternLTE_CRS_nrofCRS_Ports.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("nrofCRS_Ports", -1);

      // decode v_Shift

      buffer.getContext().eventDispatcher.startElement("v_Shift", -1);

      {
         int tval = RateMatchPatternLTE_CRS_v_Shift.decodeEnumValue (buffer);
         v_Shift = RateMatchPatternLTE_CRS_v_Shift.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("v_Shift", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreqDL != null) carrierFreqDL.print (_sb, "carrierFreqDL", _level+1);
      if (carrierBandwidthDL != null) carrierBandwidthDL.print (_sb, "carrierBandwidthDL", _level+1);
      if (mbsfn_SubframeConfigList != null) mbsfn_SubframeConfigList.print (_sb, "mbsfn_SubframeConfigList", _level+1);
      if (nrofCRS_Ports != null) nrofCRS_Ports.print (_sb, "nrofCRS_Ports", _level+1);
      if (v_Shift != null) v_Shift.print (_sb, "v_Shift", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
