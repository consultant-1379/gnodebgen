/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class UERadioPagingInformation_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UERadioPagingInformation-IEs";
   }

   public UERadioPagingInformation_IEs_supportedBandListNRForPaging supportedBandListNRForPaging;  // optional
   public UERadioPagingInformation_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UERadioPagingInformation_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UERadioPagingInformation_IEs (
      UERadioPagingInformation_IEs_supportedBandListNRForPaging supportedBandListNRForPaging_,
      UERadioPagingInformation_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      supportedBandListNRForPaging = supportedBandListNRForPaging_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      supportedBandListNRForPaging = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandListNRForPaging;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandListNRForPaging";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedBandListNRForPagingPresent = buffer.decodeBit ("supportedBandListNRForPagingPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode supportedBandListNRForPaging

      if (supportedBandListNRForPagingPresent) {
         buffer.getContext().eventDispatcher.startElement("supportedBandListNRForPaging", -1);

         supportedBandListNRForPaging = new UERadioPagingInformation_IEs_supportedBandListNRForPaging();
         supportedBandListNRForPaging.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandListNRForPaging", -1);
      }
      else {
         supportedBandListNRForPaging = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UERadioPagingInformation_IEs_nonCriticalExtension();
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

      buffer.encodeBit ((supportedBandListNRForPaging != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode supportedBandListNRForPaging

      if (supportedBandListNRForPaging != null) {
         buffer.getContext().eventDispatcher.startElement("supportedBandListNRForPaging", -1);

         supportedBandListNRForPaging.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedBandListNRForPaging", -1);
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
      if (supportedBandListNRForPaging != null) supportedBandListNRForPaging.print (_sb, "supportedBandListNRForPaging", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
