/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RNReconfiguration_r10_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RNReconfiguration-r10-IEs";
   }

   public RN_SystemInfo_r10 rn_SystemInfo_r10;  // optional
   public RN_SubframeConfig_r10 rn_SubframeConfig_r10;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public RNReconfiguration_r10_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RNReconfiguration_r10_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RNReconfiguration_r10_IEs (
      RN_SystemInfo_r10 rn_SystemInfo_r10_,
      RN_SubframeConfig_r10 rn_SubframeConfig_r10_,
      Asn1OctetString lateNonCriticalExtension_,
      RNReconfiguration_r10_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      rn_SystemInfo_r10 = rn_SystemInfo_r10_;
      rn_SubframeConfig_r10 = rn_SubframeConfig_r10_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RNReconfiguration_r10_IEs (RN_SystemInfo_r10 rn_SystemInfo_r10_,
      RN_SubframeConfig_r10 rn_SubframeConfig_r10_,
      byte[] lateNonCriticalExtension_,
      RNReconfiguration_r10_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      rn_SystemInfo_r10 = rn_SystemInfo_r10_;
      rn_SubframeConfig_r10 = rn_SubframeConfig_r10_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      rn_SystemInfo_r10 = null;
      rn_SubframeConfig_r10 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rn_SystemInfo_r10;
         case 1: return rn_SubframeConfig_r10;
         case 2: return lateNonCriticalExtension;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rn-SystemInfo-r10";
         case 1: return "rn-SubframeConfig-r10";
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

      boolean rn_SystemInfo_r10Present = buffer.decodeBit ("rn_SystemInfo_r10Present");
      boolean rn_SubframeConfig_r10Present = buffer.decodeBit ("rn_SubframeConfig_r10Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode rn_SystemInfo_r10

      if (rn_SystemInfo_r10Present) {
         buffer.getContext().eventDispatcher.startElement("rn_SystemInfo_r10", -1);

         rn_SystemInfo_r10 = new RN_SystemInfo_r10();
         rn_SystemInfo_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rn_SystemInfo_r10", -1);
      }
      else {
         rn_SystemInfo_r10 = null;
      }

      // decode rn_SubframeConfig_r10

      if (rn_SubframeConfig_r10Present) {
         buffer.getContext().eventDispatcher.startElement("rn_SubframeConfig_r10", -1);

         rn_SubframeConfig_r10 = new RN_SubframeConfig_r10();
         rn_SubframeConfig_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rn_SubframeConfig_r10", -1);
      }
      else {
         rn_SubframeConfig_r10 = null;
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

         nonCriticalExtension = new RNReconfiguration_r10_IEs_nonCriticalExtension();
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
      if (rn_SystemInfo_r10 != null) rn_SystemInfo_r10.print (_sb, "rn_SystemInfo_r10", _level+1);
      if (rn_SubframeConfig_r10 != null) rn_SubframeConfig_r10.print (_sb, "rn_SubframeConfig_r10", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
