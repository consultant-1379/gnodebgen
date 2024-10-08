/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionRelease_r8_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionRelease-r8-IEs";
   }

   public ReleaseCause releaseCause = null;
   public RedirectedCarrierInfo redirectedCarrierInfo;  // optional
   public IdleModeMobilityControlInfo idleModeMobilityControlInfo;  // optional
   public RRCConnectionRelease_v890_IEs nonCriticalExtension;  // optional

   public RRCConnectionRelease_r8_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionRelease_r8_IEs (
      ReleaseCause releaseCause_,
      RedirectedCarrierInfo redirectedCarrierInfo_,
      IdleModeMobilityControlInfo idleModeMobilityControlInfo_,
      RRCConnectionRelease_v890_IEs nonCriticalExtension_
   ) {
      super();
      releaseCause = releaseCause_;
      redirectedCarrierInfo = redirectedCarrierInfo_;
      idleModeMobilityControlInfo = idleModeMobilityControlInfo_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RRCConnectionRelease_r8_IEs (
      ReleaseCause releaseCause_
   ) {
      super();
      releaseCause = releaseCause_;
   }

   public void init () {
      releaseCause = null;
      redirectedCarrierInfo = null;
      idleModeMobilityControlInfo = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return releaseCause;
         case 1: return redirectedCarrierInfo;
         case 2: return idleModeMobilityControlInfo;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "releaseCause";
         case 1: return "redirectedCarrierInfo";
         case 2: return "idleModeMobilityControlInfo";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean redirectedCarrierInfoPresent = buffer.decodeBit ("redirectedCarrierInfoPresent");
      boolean idleModeMobilityControlInfoPresent = buffer.decodeBit ("idleModeMobilityControlInfoPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode releaseCause

      buffer.getContext().eventDispatcher.startElement("releaseCause", -1);

      {
         int tval = ReleaseCause.decodeEnumValue (buffer);
         releaseCause = ReleaseCause.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("releaseCause", -1);

      // decode redirectedCarrierInfo

      if (redirectedCarrierInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("redirectedCarrierInfo", -1);

         redirectedCarrierInfo = new RedirectedCarrierInfo();
         redirectedCarrierInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redirectedCarrierInfo", -1);
      }
      else {
         redirectedCarrierInfo = null;
      }

      // decode idleModeMobilityControlInfo

      if (idleModeMobilityControlInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("idleModeMobilityControlInfo", -1);

         idleModeMobilityControlInfo = new IdleModeMobilityControlInfo();
         idleModeMobilityControlInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("idleModeMobilityControlInfo", -1);
      }
      else {
         idleModeMobilityControlInfo = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionRelease_v890_IEs();
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
      if (releaseCause != null) releaseCause.print (_sb, "releaseCause", _level+1);
      if (redirectedCarrierInfo != null) redirectedCarrierInfo.print (_sb, "redirectedCarrierInfo", _level+1);
      if (idleModeMobilityControlInfo != null) idleModeMobilityControlInfo.print (_sb, "idleModeMobilityControlInfo", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
