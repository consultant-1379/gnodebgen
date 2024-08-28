/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InDeviceCoexIndication_r11_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InDeviceCoexIndication-r11-IEs";
   }

   public AffectedCarrierFreqList_r11 affectedCarrierFreqList_r11;  // optional
   public TDM_AssistanceInfo_r11 tdm_AssistanceInfo_r11;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public InDeviceCoexIndication_v11d0_IEs nonCriticalExtension;  // optional

   public InDeviceCoexIndication_r11_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InDeviceCoexIndication_r11_IEs (
      AffectedCarrierFreqList_r11 affectedCarrierFreqList_r11_,
      TDM_AssistanceInfo_r11 tdm_AssistanceInfo_r11_,
      Asn1OctetString lateNonCriticalExtension_,
      InDeviceCoexIndication_v11d0_IEs nonCriticalExtension_
   ) {
      super();
      affectedCarrierFreqList_r11 = affectedCarrierFreqList_r11_;
      tdm_AssistanceInfo_r11 = tdm_AssistanceInfo_r11_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public InDeviceCoexIndication_r11_IEs (AffectedCarrierFreqList_r11 affectedCarrierFreqList_r11_,
      TDM_AssistanceInfo_r11 tdm_AssistanceInfo_r11_,
      byte[] lateNonCriticalExtension_,
      InDeviceCoexIndication_v11d0_IEs nonCriticalExtension_
   ) {
      super();
      affectedCarrierFreqList_r11 = affectedCarrierFreqList_r11_;
      tdm_AssistanceInfo_r11 = tdm_AssistanceInfo_r11_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      affectedCarrierFreqList_r11 = null;
      tdm_AssistanceInfo_r11 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return affectedCarrierFreqList_r11;
         case 1: return tdm_AssistanceInfo_r11;
         case 2: return lateNonCriticalExtension;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "affectedCarrierFreqList-r11";
         case 1: return "tdm-AssistanceInfo-r11";
         case 2: return "lateNonCriticalExtension";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean affectedCarrierFreqList_r11Present = buffer.decodeBit ("affectedCarrierFreqList_r11Present");
      boolean tdm_AssistanceInfo_r11Present = buffer.decodeBit ("tdm_AssistanceInfo_r11Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode affectedCarrierFreqList_r11

      if (affectedCarrierFreqList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("affectedCarrierFreqList_r11", -1);

         affectedCarrierFreqList_r11 = new AffectedCarrierFreqList_r11();
         affectedCarrierFreqList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("affectedCarrierFreqList_r11", -1);
      }
      else {
         affectedCarrierFreqList_r11 = null;
      }

      // decode tdm_AssistanceInfo_r11

      if (tdm_AssistanceInfo_r11Present) {
         buffer.getContext().eventDispatcher.startElement("tdm_AssistanceInfo_r11", -1);

         tdm_AssistanceInfo_r11 = new TDM_AssistanceInfo_r11();
         tdm_AssistanceInfo_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tdm_AssistanceInfo_r11", -1);
      }
      else {
         tdm_AssistanceInfo_r11 = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new InDeviceCoexIndication_v11d0_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (affectedCarrierFreqList_r11 != null) affectedCarrierFreqList_r11.print (_sb, "affectedCarrierFreqList_r11", _level+1);
      if (tdm_AssistanceInfo_r11 != null) tdm_AssistanceInfo_r11.print (_sb, "tdm_AssistanceInfo_r11", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
