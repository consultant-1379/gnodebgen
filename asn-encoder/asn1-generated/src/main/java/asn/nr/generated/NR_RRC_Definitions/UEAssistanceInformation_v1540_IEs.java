/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEAssistanceInformation_v1540_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UEAssistanceInformation-v1540-IEs";
   }

   public OverheatingAssistance overheatingAssistance;  // optional
   public UEAssistanceInformation_v1610_IEs nonCriticalExtension;  // optional

   public UEAssistanceInformation_v1540_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UEAssistanceInformation_v1540_IEs (
      OverheatingAssistance overheatingAssistance_,
      UEAssistanceInformation_v1610_IEs nonCriticalExtension_
   ) {
      super();
      overheatingAssistance = overheatingAssistance_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      overheatingAssistance = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return overheatingAssistance;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "overheatingAssistance";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean overheatingAssistancePresent = buffer.decodeBit ("overheatingAssistancePresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode overheatingAssistance

      if (overheatingAssistancePresent) {
         buffer.getContext().eventDispatcher.startElement("overheatingAssistance", -1);

         overheatingAssistance = new OverheatingAssistance();
         overheatingAssistance.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("overheatingAssistance", -1);
      }
      else {
         overheatingAssistance = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UEAssistanceInformation_v1610_IEs();
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

      buffer.encodeBit ((overheatingAssistance != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode overheatingAssistance

      if (overheatingAssistance != null) {
         buffer.getContext().eventDispatcher.startElement("overheatingAssistance", -1);

         overheatingAssistance.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("overheatingAssistance", -1);
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
      if (overheatingAssistance != null) overheatingAssistance.print (_sb, "overheatingAssistance", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
