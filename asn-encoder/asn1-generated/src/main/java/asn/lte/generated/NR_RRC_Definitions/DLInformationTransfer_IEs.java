/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DLInformationTransfer_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DLInformationTransfer-IEs";
   }

   public DedicatedNAS_Message dedicatedNAS_Message;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public DLInformationTransfer_v1610_IEs nonCriticalExtension;  // optional

   public DLInformationTransfer_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DLInformationTransfer_IEs (
      DedicatedNAS_Message dedicatedNAS_Message_,
      Asn1OctetString lateNonCriticalExtension_,
      DLInformationTransfer_v1610_IEs nonCriticalExtension_
   ) {
      super();
      dedicatedNAS_Message = dedicatedNAS_Message_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DLInformationTransfer_IEs (byte[] dedicatedNAS_Message_,
      byte[] lateNonCriticalExtension_,
      DLInformationTransfer_v1610_IEs nonCriticalExtension_
   ) {
      super();
      dedicatedNAS_Message = new DedicatedNAS_Message (dedicatedNAS_Message_);
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      dedicatedNAS_Message = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dedicatedNAS_Message;
         case 1: return lateNonCriticalExtension;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dedicatedNAS-Message";
         case 1: return "lateNonCriticalExtension";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dedicatedNAS_MessagePresent = buffer.decodeBit ("dedicatedNAS_MessagePresent");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode dedicatedNAS_Message

      if (dedicatedNAS_MessagePresent) {
         buffer.getContext().eventDispatcher.startElement("dedicatedNAS_Message", -1);

         dedicatedNAS_Message = new DedicatedNAS_Message();
         dedicatedNAS_Message.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dedicatedNAS_Message", -1);
      }
      else {
         dedicatedNAS_Message = null;
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

         nonCriticalExtension = new DLInformationTransfer_v1610_IEs();
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
      if (dedicatedNAS_Message != null) dedicatedNAS_Message.print (_sb, "dedicatedNAS_Message", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
