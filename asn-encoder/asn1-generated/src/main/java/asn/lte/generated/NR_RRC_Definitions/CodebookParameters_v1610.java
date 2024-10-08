/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookParameters_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CodebookParameters-v1610";
   }

   public CodebookParameters_v1610_supportedCSI_RS_ResourceListAlt_r16 supportedCSI_RS_ResourceListAlt_r16;  // optional

   public CodebookParameters_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookParameters_v1610 (
      CodebookParameters_v1610_supportedCSI_RS_ResourceListAlt_r16 supportedCSI_RS_ResourceListAlt_r16_
   ) {
      super();
      supportedCSI_RS_ResourceListAlt_r16 = supportedCSI_RS_ResourceListAlt_r16_;
   }

   public void init () {
      supportedCSI_RS_ResourceListAlt_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedCSI_RS_ResourceListAlt_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedCSI-RS-ResourceListAlt-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedCSI_RS_ResourceListAlt_r16Present = buffer.decodeBit ("supportedCSI_RS_ResourceListAlt_r16Present");

      // decode supportedCSI_RS_ResourceListAlt_r16

      if (supportedCSI_RS_ResourceListAlt_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportedCSI_RS_ResourceListAlt_r16", -1);

         supportedCSI_RS_ResourceListAlt_r16 = new CodebookParameters_v1610_supportedCSI_RS_ResourceListAlt_r16();
         supportedCSI_RS_ResourceListAlt_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedCSI_RS_ResourceListAlt_r16", -1);
      }
      else {
         supportedCSI_RS_ResourceListAlt_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedCSI_RS_ResourceListAlt_r16 != null) supportedCSI_RS_ResourceListAlt_r16.print (_sb, "supportedCSI_RS_ResourceListAlt_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
