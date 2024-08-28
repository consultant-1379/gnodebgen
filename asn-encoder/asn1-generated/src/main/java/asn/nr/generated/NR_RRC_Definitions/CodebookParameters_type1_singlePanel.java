/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookParameters_type1_singlePanel extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CodebookParameters_type1_singlePanel_supportedCSI_RS_ResourceList supportedCSI_RS_ResourceList;
   public CodebookParameters_type1_singlePanel_modes modes = null;
   public Asn1Integer maxNumberCSI_RS_PerResourceSet;

   public CodebookParameters_type1_singlePanel () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookParameters_type1_singlePanel (
      CodebookParameters_type1_singlePanel_supportedCSI_RS_ResourceList supportedCSI_RS_ResourceList_,
      CodebookParameters_type1_singlePanel_modes modes_,
      Asn1Integer maxNumberCSI_RS_PerResourceSet_
   ) {
      super();
      supportedCSI_RS_ResourceList = supportedCSI_RS_ResourceList_;
      modes = modes_;
      maxNumberCSI_RS_PerResourceSet = maxNumberCSI_RS_PerResourceSet_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CodebookParameters_type1_singlePanel (CodebookParameters_type1_singlePanel_supportedCSI_RS_ResourceList supportedCSI_RS_ResourceList_,
      CodebookParameters_type1_singlePanel_modes modes_,
      long maxNumberCSI_RS_PerResourceSet_
   ) {
      super();
      supportedCSI_RS_ResourceList = supportedCSI_RS_ResourceList_;
      modes = modes_;
      maxNumberCSI_RS_PerResourceSet = new Asn1Integer (maxNumberCSI_RS_PerResourceSet_);
   }

   public void init () {
      supportedCSI_RS_ResourceList = null;
      modes = null;
      maxNumberCSI_RS_PerResourceSet = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedCSI_RS_ResourceList;
         case 1: return modes;
         case 2: return maxNumberCSI_RS_PerResourceSet;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedCSI-RS-ResourceList";
         case 1: return "modes";
         case 2: return "maxNumberCSI-RS-PerResourceSet";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode supportedCSI_RS_ResourceList

      buffer.getContext().eventDispatcher.startElement("supportedCSI_RS_ResourceList", -1);

      supportedCSI_RS_ResourceList = new CodebookParameters_type1_singlePanel_supportedCSI_RS_ResourceList();
      supportedCSI_RS_ResourceList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedCSI_RS_ResourceList", -1);

      // decode modes

      buffer.getContext().eventDispatcher.startElement("modes", -1);

      {
         int tval = CodebookParameters_type1_singlePanel_modes.decodeEnumValue (buffer);
         modes = CodebookParameters_type1_singlePanel_modes.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("modes", -1);

      // decode maxNumberCSI_RS_PerResourceSet

      buffer.getContext().eventDispatcher.startElement("maxNumberCSI_RS_PerResourceSet", -1);

      maxNumberCSI_RS_PerResourceSet = new Asn1Integer();
      maxNumberCSI_RS_PerResourceSet.decode (buffer, 1, 8);

      buffer.invokeCharacters(maxNumberCSI_RS_PerResourceSet.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberCSI_RS_PerResourceSet", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode supportedCSI_RS_ResourceList

      if (supportedCSI_RS_ResourceList != null) {
         buffer.getContext().eventDispatcher.startElement("supportedCSI_RS_ResourceList", -1);

         supportedCSI_RS_ResourceList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedCSI_RS_ResourceList", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedCSI_RS_ResourceList");

      // encode modes

      if (modes != null) {
         buffer.getContext().eventDispatcher.startElement("modes", -1);

         modes.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("modes", -1);
      }
      else throw new Asn1MissingRequiredException ("modes");

      // encode maxNumberCSI_RS_PerResourceSet

      if (maxNumberCSI_RS_PerResourceSet != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberCSI_RS_PerResourceSet", -1);

         maxNumberCSI_RS_PerResourceSet.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("maxNumberCSI_RS_PerResourceSet", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberCSI_RS_PerResourceSet");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedCSI_RS_ResourceList != null) supportedCSI_RS_ResourceList.print (_sb, "supportedCSI_RS_ResourceList", _level+1);
      if (modes != null) modes.print (_sb, "modes", _level+1);
      if (maxNumberCSI_RS_PerResourceSet != null) maxNumberCSI_RS_PerResourceSet.print (_sb, "maxNumberCSI_RS_PerResourceSet", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
