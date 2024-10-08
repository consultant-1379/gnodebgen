/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class CG_Config_v1640_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-Config-v1640-IEs";
   }

   public ServCellInfoListSCG_NR_r16 servCellInfoListSCG_NR_r16;  // optional
   public ServCellInfoListSCG_EUTRA_r16 servCellInfoListSCG_EUTRA_r16;  // optional
   public CG_Config_v1640_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public CG_Config_v1640_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_Config_v1640_IEs (
      ServCellInfoListSCG_NR_r16 servCellInfoListSCG_NR_r16_,
      ServCellInfoListSCG_EUTRA_r16 servCellInfoListSCG_EUTRA_r16_,
      CG_Config_v1640_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      servCellInfoListSCG_NR_r16 = servCellInfoListSCG_NR_r16_;
      servCellInfoListSCG_EUTRA_r16 = servCellInfoListSCG_EUTRA_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      servCellInfoListSCG_NR_r16 = null;
      servCellInfoListSCG_EUTRA_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return servCellInfoListSCG_NR_r16;
         case 1: return servCellInfoListSCG_EUTRA_r16;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "servCellInfoListSCG-NR-r16";
         case 1: return "servCellInfoListSCG-EUTRA-r16";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean servCellInfoListSCG_NR_r16Present = buffer.decodeBit ("servCellInfoListSCG_NR_r16Present");
      boolean servCellInfoListSCG_EUTRA_r16Present = buffer.decodeBit ("servCellInfoListSCG_EUTRA_r16Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode servCellInfoListSCG_NR_r16

      if (servCellInfoListSCG_NR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("servCellInfoListSCG_NR_r16", -1);

         servCellInfoListSCG_NR_r16 = new ServCellInfoListSCG_NR_r16();
         servCellInfoListSCG_NR_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("servCellInfoListSCG_NR_r16", -1);
      }
      else {
         servCellInfoListSCG_NR_r16 = null;
      }

      // decode servCellInfoListSCG_EUTRA_r16

      if (servCellInfoListSCG_EUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("servCellInfoListSCG_EUTRA_r16", -1);

         servCellInfoListSCG_EUTRA_r16 = new ServCellInfoListSCG_EUTRA_r16();
         servCellInfoListSCG_EUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("servCellInfoListSCG_EUTRA_r16", -1);
      }
      else {
         servCellInfoListSCG_EUTRA_r16 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CG_Config_v1640_IEs_nonCriticalExtension();
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

      buffer.encodeBit ((servCellInfoListSCG_NR_r16 != null), null);
      buffer.encodeBit ((servCellInfoListSCG_EUTRA_r16 != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode servCellInfoListSCG_NR_r16

      if (servCellInfoListSCG_NR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("servCellInfoListSCG_NR_r16", -1);

         servCellInfoListSCG_NR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("servCellInfoListSCG_NR_r16", -1);
      }

      // encode servCellInfoListSCG_EUTRA_r16

      if (servCellInfoListSCG_EUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("servCellInfoListSCG_EUTRA_r16", -1);

         servCellInfoListSCG_EUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("servCellInfoListSCG_EUTRA_r16", -1);
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
      if (servCellInfoListSCG_NR_r16 != null) servCellInfoListSCG_NR_r16.print (_sb, "servCellInfoListSCG_NR_r16", _level+1);
      if (servCellInfoListSCG_EUTRA_r16 != null) servCellInfoListSCG_EUTRA_r16.print (_sb, "servCellInfoListSCG_EUTRA_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
