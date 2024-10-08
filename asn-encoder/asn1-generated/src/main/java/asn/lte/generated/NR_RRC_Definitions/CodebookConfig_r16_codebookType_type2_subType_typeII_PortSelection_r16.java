/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16_portSelectionSamplingSize_r16 portSelectionSamplingSize_r16 = null;
   public Asn1BitString typeII_PortSelectionRI_Restriction_r16;

   public CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16 (
      CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16_portSelectionSamplingSize_r16 portSelectionSamplingSize_r16_,
      Asn1BitString typeII_PortSelectionRI_Restriction_r16_
   ) {
      super();
      portSelectionSamplingSize_r16 = portSelectionSamplingSize_r16_;
      typeII_PortSelectionRI_Restriction_r16 = typeII_PortSelectionRI_Restriction_r16_;
   }

   public void init () {
      portSelectionSamplingSize_r16 = null;
      typeII_PortSelectionRI_Restriction_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return portSelectionSamplingSize_r16;
         case 1: return typeII_PortSelectionRI_Restriction_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "portSelectionSamplingSize-r16";
         case 1: return "typeII-PortSelectionRI-Restriction-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode portSelectionSamplingSize_r16

      buffer.getContext().eventDispatcher.startElement("portSelectionSamplingSize_r16", -1);

      {
         int tval = CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16_portSelectionSamplingSize_r16.decodeEnumValue (buffer);
         portSelectionSamplingSize_r16 = CodebookConfig_r16_codebookType_type2_subType_typeII_PortSelection_r16_portSelectionSamplingSize_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("portSelectionSamplingSize_r16", -1);

      // decode typeII_PortSelectionRI_Restriction_r16

      buffer.getContext().eventDispatcher.startElement("typeII_PortSelectionRI_Restriction_r16", -1);

      typeII_PortSelectionRI_Restriction_r16 = new Asn1BitString();
      typeII_PortSelectionRI_Restriction_r16.decode (buffer, 4, 4);

      buffer.invokeCharacters(typeII_PortSelectionRI_Restriction_r16.toString());
      buffer.getContext().eventDispatcher.endElement("typeII_PortSelectionRI_Restriction_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (portSelectionSamplingSize_r16 != null) portSelectionSamplingSize_r16.print (_sb, "portSelectionSamplingSize_r16", _level+1);
      if (typeII_PortSelectionRI_Restriction_r16 != null) typeII_PortSelectionRI_Restriction_r16.print (_sb, "typeII_PortSelectionRI_Restriction_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
