/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OverheatingAssistance_r14_reducedUE_Category extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer reducedUE_CategoryDL;
   public Asn1Integer reducedUE_CategoryUL;

   public OverheatingAssistance_r14_reducedUE_Category () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public OverheatingAssistance_r14_reducedUE_Category (
      Asn1Integer reducedUE_CategoryDL_,
      Asn1Integer reducedUE_CategoryUL_
   ) {
      super();
      reducedUE_CategoryDL = reducedUE_CategoryDL_;
      reducedUE_CategoryUL = reducedUE_CategoryUL_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public OverheatingAssistance_r14_reducedUE_Category (long reducedUE_CategoryDL_,
      long reducedUE_CategoryUL_
   ) {
      super();
      reducedUE_CategoryDL = new Asn1Integer (reducedUE_CategoryDL_);
      reducedUE_CategoryUL = new Asn1Integer (reducedUE_CategoryUL_);
   }

   public void init () {
      reducedUE_CategoryDL = null;
      reducedUE_CategoryUL = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reducedUE_CategoryDL;
         case 1: return reducedUE_CategoryUL;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reducedUE-CategoryDL";
         case 1: return "reducedUE-CategoryUL";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reducedUE_CategoryDL

      buffer.getContext().eventDispatcher.startElement("reducedUE_CategoryDL", -1);

      reducedUE_CategoryDL = new Asn1Integer();
      reducedUE_CategoryDL.decode (buffer, 0, 19);

      buffer.invokeCharacters(reducedUE_CategoryDL.toString());
      buffer.getContext().eventDispatcher.endElement("reducedUE_CategoryDL", -1);

      // decode reducedUE_CategoryUL

      buffer.getContext().eventDispatcher.startElement("reducedUE_CategoryUL", -1);

      reducedUE_CategoryUL = new Asn1Integer();
      reducedUE_CategoryUL.decode (buffer, 0, 21);

      buffer.invokeCharacters(reducedUE_CategoryUL.toString());
      buffer.getContext().eventDispatcher.endElement("reducedUE_CategoryUL", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reducedUE_CategoryDL != null) reducedUE_CategoryDL.print (_sb, "reducedUE_CategoryDL", _level+1);
      if (reducedUE_CategoryUL != null) reducedUE_CategoryUL.print (_sb, "reducedUE_CategoryUL", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
