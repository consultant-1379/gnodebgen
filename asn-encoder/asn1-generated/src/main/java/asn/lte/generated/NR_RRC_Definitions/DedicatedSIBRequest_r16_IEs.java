/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DedicatedSIBRequest_r16_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DedicatedSIBRequest-r16-IEs";
   }

   public DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 onDemandSIB_RequestList_r16;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public DedicatedSIBRequest_r16_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public DedicatedSIBRequest_r16_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DedicatedSIBRequest_r16_IEs (
      DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 onDemandSIB_RequestList_r16_,
      Asn1OctetString lateNonCriticalExtension_,
      DedicatedSIBRequest_r16_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      onDemandSIB_RequestList_r16 = onDemandSIB_RequestList_r16_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DedicatedSIBRequest_r16_IEs (DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 onDemandSIB_RequestList_r16_,
      byte[] lateNonCriticalExtension_,
      DedicatedSIBRequest_r16_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      onDemandSIB_RequestList_r16 = onDemandSIB_RequestList_r16_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      onDemandSIB_RequestList_r16 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return onDemandSIB_RequestList_r16;
         case 1: return lateNonCriticalExtension;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "onDemandSIB-RequestList-r16";
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

      boolean onDemandSIB_RequestList_r16Present = buffer.decodeBit ("onDemandSIB_RequestList_r16Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode onDemandSIB_RequestList_r16

      if (onDemandSIB_RequestList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("onDemandSIB_RequestList_r16", -1);

         onDemandSIB_RequestList_r16 = new DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16();
         onDemandSIB_RequestList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("onDemandSIB_RequestList_r16", -1);
      }
      else {
         onDemandSIB_RequestList_r16 = null;
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

         nonCriticalExtension = new DedicatedSIBRequest_r16_IEs_nonCriticalExtension();
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
      if (onDemandSIB_RequestList_r16 != null) onDemandSIB_RequestList_r16.print (_sb, "onDemandSIB_RequestList_r16", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
