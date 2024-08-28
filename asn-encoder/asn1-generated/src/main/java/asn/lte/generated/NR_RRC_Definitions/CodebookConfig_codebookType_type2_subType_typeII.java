/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookConfig_codebookType_type2_subType_typeII extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction n1_n2_codebookSubsetRestriction;
   public Asn1BitString typeII_RI_Restriction;

   public CodebookConfig_codebookType_type2_subType_typeII () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookConfig_codebookType_type2_subType_typeII (
      CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction n1_n2_codebookSubsetRestriction_,
      Asn1BitString typeII_RI_Restriction_
   ) {
      super();
      n1_n2_codebookSubsetRestriction = n1_n2_codebookSubsetRestriction_;
      typeII_RI_Restriction = typeII_RI_Restriction_;
   }

   public void init () {
      n1_n2_codebookSubsetRestriction = null;
      typeII_RI_Restriction = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return n1_n2_codebookSubsetRestriction;
         case 1: return typeII_RI_Restriction;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "n1-n2-codebookSubsetRestriction";
         case 1: return "typeII-RI-Restriction";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode n1_n2_codebookSubsetRestriction

      buffer.getContext().eventDispatcher.startElement("n1_n2_codebookSubsetRestriction", -1);

      n1_n2_codebookSubsetRestriction = new CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction();
      n1_n2_codebookSubsetRestriction.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("n1_n2_codebookSubsetRestriction", -1);

      // decode typeII_RI_Restriction

      buffer.getContext().eventDispatcher.startElement("typeII_RI_Restriction", -1);

      typeII_RI_Restriction = new Asn1BitString();
      typeII_RI_Restriction.decode (buffer, 2, 2);

      buffer.invokeCharacters(typeII_RI_Restriction.toString());
      buffer.getContext().eventDispatcher.endElement("typeII_RI_Restriction", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (n1_n2_codebookSubsetRestriction != null) n1_n2_codebookSubsetRestriction.print (_sb, "n1_n2_codebookSubsetRestriction", _level+1);
      if (typeII_RI_Restriction != null) typeII_RI_Restriction.print (_sb, "typeII_RI_Restriction", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
