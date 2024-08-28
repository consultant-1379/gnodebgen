/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookParameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CodebookParameters";
   }

   public CodebookParameters_type1 type1;
   public CodebookParameters_type2 type2;  // optional
   public CodebookParameters_type2_PortSelection type2_PortSelection;  // optional

   public CodebookParameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookParameters (
      CodebookParameters_type1 type1_,
      CodebookParameters_type2 type2_,
      CodebookParameters_type2_PortSelection type2_PortSelection_
   ) {
      super();
      type1 = type1_;
      type2 = type2_;
      type2_PortSelection = type2_PortSelection_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CodebookParameters (
      CodebookParameters_type1 type1_
   ) {
      super();
      type1 = type1_;
   }

   public void init () {
      type1 = null;
      type2 = null;
      type2_PortSelection = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return type1;
         case 1: return type2;
         case 2: return type2_PortSelection;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "type1";
         case 1: return "type2";
         case 2: return "type2-PortSelection";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean type2Present = buffer.decodeBit ("type2Present");
      boolean type2_PortSelectionPresent = buffer.decodeBit ("type2_PortSelectionPresent");

      // decode type1

      buffer.getContext().eventDispatcher.startElement("type1", -1);

      type1 = new CodebookParameters_type1();
      type1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("type1", -1);

      // decode type2

      if (type2Present) {
         buffer.getContext().eventDispatcher.startElement("type2", -1);

         type2 = new CodebookParameters_type2();
         type2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("type2", -1);
      }
      else {
         type2 = null;
      }

      // decode type2_PortSelection

      if (type2_PortSelectionPresent) {
         buffer.getContext().eventDispatcher.startElement("type2_PortSelection", -1);

         type2_PortSelection = new CodebookParameters_type2_PortSelection();
         type2_PortSelection.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("type2_PortSelection", -1);
      }
      else {
         type2_PortSelection = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (type1 != null) type1.print (_sb, "type1", _level+1);
      if (type2 != null) type2.print (_sb, "type2", _level+1);
      if (type2_PortSelection != null) type2_PortSelection.print (_sb, "type2_PortSelection", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
