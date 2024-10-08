/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class P_C_AndCBSR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "P-C-AndCBSR-r15";
   }

   public Asn1Integer p_C_r15;
   public Asn1BitString codebookSubsetRestriction4_r15;

   public P_C_AndCBSR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public P_C_AndCBSR_r15 (
      Asn1Integer p_C_r15_,
      Asn1BitString codebookSubsetRestriction4_r15_
   ) {
      super();
      p_C_r15 = p_C_r15_;
      codebookSubsetRestriction4_r15 = codebookSubsetRestriction4_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public P_C_AndCBSR_r15 (long p_C_r15_,
      Asn1BitString codebookSubsetRestriction4_r15_
   ) {
      super();
      p_C_r15 = new Asn1Integer (p_C_r15_);
      codebookSubsetRestriction4_r15 = codebookSubsetRestriction4_r15_;
   }

   public void init () {
      p_C_r15 = null;
      codebookSubsetRestriction4_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p_C_r15;
         case 1: return codebookSubsetRestriction4_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p-C-r15";
         case 1: return "codebookSubsetRestriction4-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode p_C_r15

      buffer.getContext().eventDispatcher.startElement("p_C_r15", -1);

      p_C_r15 = new Asn1Integer();
      p_C_r15.decode (buffer, -8, 15);

      buffer.invokeCharacters(p_C_r15.toString());
      buffer.getContext().eventDispatcher.endElement("p_C_r15", -1);

      // decode codebookSubsetRestriction4_r15

      buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction4_r15", -1);

      codebookSubsetRestriction4_r15 = new Asn1BitString();
      codebookSubsetRestriction4_r15.decode (buffer);

      buffer.invokeCharacters(codebookSubsetRestriction4_r15.toString());
      buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction4_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p_C_r15 != null) p_C_r15.print (_sb, "p_C_r15", _level+1);
      if (codebookSubsetRestriction4_r15 != null) codebookSubsetRestriction4_r15.print (_sb, "codebookSubsetRestriction4_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
