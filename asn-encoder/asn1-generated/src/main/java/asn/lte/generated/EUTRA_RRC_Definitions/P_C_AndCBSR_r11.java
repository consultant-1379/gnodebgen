/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class P_C_AndCBSR_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "P-C-AndCBSR-r11";
   }

   public Asn1Integer p_C_r11;
   public Asn1BitString codebookSubsetRestriction_r11;

   public P_C_AndCBSR_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public P_C_AndCBSR_r11 (
      Asn1Integer p_C_r11_,
      Asn1BitString codebookSubsetRestriction_r11_
   ) {
      super();
      p_C_r11 = p_C_r11_;
      codebookSubsetRestriction_r11 = codebookSubsetRestriction_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public P_C_AndCBSR_r11 (long p_C_r11_,
      Asn1BitString codebookSubsetRestriction_r11_
   ) {
      super();
      p_C_r11 = new Asn1Integer (p_C_r11_);
      codebookSubsetRestriction_r11 = codebookSubsetRestriction_r11_;
   }

   public void init () {
      p_C_r11 = null;
      codebookSubsetRestriction_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p_C_r11;
         case 1: return codebookSubsetRestriction_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p-C-r11";
         case 1: return "codebookSubsetRestriction-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode p_C_r11

      buffer.getContext().eventDispatcher.startElement("p_C_r11", -1);

      p_C_r11 = new Asn1Integer();
      p_C_r11.decode (buffer, -8, 15);

      buffer.invokeCharacters(p_C_r11.toString());
      buffer.getContext().eventDispatcher.endElement("p_C_r11", -1);

      // decode codebookSubsetRestriction_r11

      buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction_r11", -1);

      codebookSubsetRestriction_r11 = new Asn1BitString();
      codebookSubsetRestriction_r11.decode (buffer);

      buffer.invokeCharacters(codebookSubsetRestriction_r11.toString());
      buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p_C_r11 != null) p_C_r11.print (_sb, "p_C_r11", _level+1);
      if (codebookSubsetRestriction_r11 != null) codebookSubsetRestriction_r11.print (_sb, "codebookSubsetRestriction_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
