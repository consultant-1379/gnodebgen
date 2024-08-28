/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class P_C_AndCBSR_r13_cbsr_Selection_r13_nonPrecoded_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString codebookSubsetRestriction1_r13;
   public Asn1BitString codebookSubsetRestriction2_r13;

   public P_C_AndCBSR_r13_cbsr_Selection_r13_nonPrecoded_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public P_C_AndCBSR_r13_cbsr_Selection_r13_nonPrecoded_r13 (
      Asn1BitString codebookSubsetRestriction1_r13_,
      Asn1BitString codebookSubsetRestriction2_r13_
   ) {
      super();
      codebookSubsetRestriction1_r13 = codebookSubsetRestriction1_r13_;
      codebookSubsetRestriction2_r13 = codebookSubsetRestriction2_r13_;
   }

   public void init () {
      codebookSubsetRestriction1_r13 = null;
      codebookSubsetRestriction2_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return codebookSubsetRestriction1_r13;
         case 1: return codebookSubsetRestriction2_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "codebookSubsetRestriction1-r13";
         case 1: return "codebookSubsetRestriction2-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode codebookSubsetRestriction1_r13

      buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction1_r13", -1);

      codebookSubsetRestriction1_r13 = new Asn1BitString();
      codebookSubsetRestriction1_r13.decode (buffer);

      buffer.invokeCharacters(codebookSubsetRestriction1_r13.toString());
      buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction1_r13", -1);

      // decode codebookSubsetRestriction2_r13

      buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction2_r13", -1);

      codebookSubsetRestriction2_r13 = new Asn1BitString();
      codebookSubsetRestriction2_r13.decode (buffer);

      buffer.invokeCharacters(codebookSubsetRestriction2_r13.toString());
      buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction2_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (codebookSubsetRestriction1_r13 != null) codebookSubsetRestriction1_r13.print (_sb, "codebookSubsetRestriction1_r13", _level+1);
      if (codebookSubsetRestriction2_r13 != null) codebookSubsetRestriction2_r13.print (_sb, "codebookSubsetRestriction2_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
