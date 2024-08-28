/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DLInformationTransfer_v1610_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DLInformationTransfer-v1610-IEs";
   }

   public ReferenceTimeInfo_r16 referenceTimeInfo_r16;  // optional
   public DLInformationTransfer_v1610_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public DLInformationTransfer_v1610_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DLInformationTransfer_v1610_IEs (
      ReferenceTimeInfo_r16 referenceTimeInfo_r16_,
      DLInformationTransfer_v1610_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      referenceTimeInfo_r16 = referenceTimeInfo_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      referenceTimeInfo_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return referenceTimeInfo_r16;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "referenceTimeInfo-r16";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean referenceTimeInfo_r16Present = buffer.decodeBit ("referenceTimeInfo_r16Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode referenceTimeInfo_r16

      if (referenceTimeInfo_r16Present) {
         buffer.getContext().eventDispatcher.startElement("referenceTimeInfo_r16", -1);

         referenceTimeInfo_r16 = new ReferenceTimeInfo_r16();
         referenceTimeInfo_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("referenceTimeInfo_r16", -1);
      }
      else {
         referenceTimeInfo_r16 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new DLInformationTransfer_v1610_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((referenceTimeInfo_r16 != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode referenceTimeInfo_r16

      if (referenceTimeInfo_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("referenceTimeInfo_r16", -1);

         referenceTimeInfo_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("referenceTimeInfo_r16", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (referenceTimeInfo_r16 != null) referenceTimeInfo_r16.print (_sb, "referenceTimeInfo_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
