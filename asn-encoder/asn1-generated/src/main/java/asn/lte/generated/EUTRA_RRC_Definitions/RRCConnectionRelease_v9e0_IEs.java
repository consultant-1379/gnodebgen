/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionRelease_v9e0_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionRelease-v9e0-IEs";
   }

   public RedirectedCarrierInfo_v9e0 redirectedCarrierInfo_v9e0;  // optional
   public IdleModeMobilityControlInfo_v9e0 idleModeMobilityControlInfo_v9e0;  // optional
   public RRCConnectionRelease_v9e0_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCConnectionRelease_v9e0_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionRelease_v9e0_IEs (
      RedirectedCarrierInfo_v9e0 redirectedCarrierInfo_v9e0_,
      IdleModeMobilityControlInfo_v9e0 idleModeMobilityControlInfo_v9e0_,
      RRCConnectionRelease_v9e0_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      redirectedCarrierInfo_v9e0 = redirectedCarrierInfo_v9e0_;
      idleModeMobilityControlInfo_v9e0 = idleModeMobilityControlInfo_v9e0_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      redirectedCarrierInfo_v9e0 = null;
      idleModeMobilityControlInfo_v9e0 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return redirectedCarrierInfo_v9e0;
         case 1: return idleModeMobilityControlInfo_v9e0;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "redirectedCarrierInfo-v9e0";
         case 1: return "idleModeMobilityControlInfo-v9e0";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean redirectedCarrierInfo_v9e0Present = buffer.decodeBit ("redirectedCarrierInfo_v9e0Present");
      boolean idleModeMobilityControlInfo_v9e0Present = buffer.decodeBit ("idleModeMobilityControlInfo_v9e0Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode redirectedCarrierInfo_v9e0

      if (redirectedCarrierInfo_v9e0Present) {
         buffer.getContext().eventDispatcher.startElement("redirectedCarrierInfo_v9e0", -1);

         redirectedCarrierInfo_v9e0 = new RedirectedCarrierInfo_v9e0();
         redirectedCarrierInfo_v9e0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redirectedCarrierInfo_v9e0", -1);
      }
      else {
         redirectedCarrierInfo_v9e0 = null;
      }

      // decode idleModeMobilityControlInfo_v9e0

      if (idleModeMobilityControlInfo_v9e0Present) {
         buffer.getContext().eventDispatcher.startElement("idleModeMobilityControlInfo_v9e0", -1);

         idleModeMobilityControlInfo_v9e0 = new IdleModeMobilityControlInfo_v9e0();
         idleModeMobilityControlInfo_v9e0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("idleModeMobilityControlInfo_v9e0", -1);
      }
      else {
         idleModeMobilityControlInfo_v9e0 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionRelease_v9e0_IEs_nonCriticalExtension();
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
      if (redirectedCarrierInfo_v9e0 != null) redirectedCarrierInfo_v9e0.print (_sb, "redirectedCarrierInfo_v9e0", _level+1);
      if (idleModeMobilityControlInfo_v9e0 != null) idleModeMobilityControlInfo_v9e0.print (_sb, "idleModeMobilityControlInfo_v9e0", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
