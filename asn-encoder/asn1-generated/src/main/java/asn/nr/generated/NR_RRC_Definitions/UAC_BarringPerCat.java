/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UAC_BarringPerCat extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UAC-BarringPerCat";
   }

   public Asn1Integer accessCategory;
   public UAC_BarringInfoSetIndex uac_barringInfoSetIndex;

   public UAC_BarringPerCat () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UAC_BarringPerCat (
      Asn1Integer accessCategory_,
      UAC_BarringInfoSetIndex uac_barringInfoSetIndex_
   ) {
      super();
      accessCategory = accessCategory_;
      uac_barringInfoSetIndex = uac_barringInfoSetIndex_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UAC_BarringPerCat (long accessCategory_,
      long uac_barringInfoSetIndex_
   ) {
      super();
      accessCategory = new Asn1Integer (accessCategory_);
      uac_barringInfoSetIndex = new UAC_BarringInfoSetIndex (uac_barringInfoSetIndex_);
   }

   public void init () {
      accessCategory = null;
      uac_barringInfoSetIndex = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return accessCategory;
         case 1: return uac_barringInfoSetIndex;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "accessCategory";
         case 1: return "uac-barringInfoSetIndex";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode accessCategory

      buffer.getContext().eventDispatcher.startElement("accessCategory", -1);

      accessCategory = new Asn1Integer();
      accessCategory.decode (buffer, 1, 63);

      buffer.invokeCharacters(accessCategory.toString());
      buffer.getContext().eventDispatcher.endElement("accessCategory", -1);

      // decode uac_barringInfoSetIndex

      buffer.getContext().eventDispatcher.startElement("uac_barringInfoSetIndex", -1);

      uac_barringInfoSetIndex = new UAC_BarringInfoSetIndex();
      uac_barringInfoSetIndex.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uac_barringInfoSetIndex", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode accessCategory

      if (accessCategory != null) {
         buffer.getContext().eventDispatcher.startElement("accessCategory", -1);

         accessCategory.encode (buffer, 1, 63);

         buffer.getContext().eventDispatcher.endElement("accessCategory", -1);
      }
      else throw new Asn1MissingRequiredException ("accessCategory");

      // encode uac_barringInfoSetIndex

      if (uac_barringInfoSetIndex != null) {
         buffer.getContext().eventDispatcher.startElement("uac_barringInfoSetIndex", -1);

         uac_barringInfoSetIndex.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("uac_barringInfoSetIndex", -1);
      }
      else throw new Asn1MissingRequiredException ("uac_barringInfoSetIndex");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (accessCategory != null) accessCategory.print (_sb, "accessCategory", _level+1);
      if (uac_barringInfoSetIndex != null) uac_barringInfoSetIndex.print (_sb, "uac_barringInfoSetIndex", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
