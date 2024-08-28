/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Config_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RLC-Config-v1250";
   }

   public Asn1Boolean ul_extended_RLC_LI_Field_r12;
   public Asn1Boolean dl_extended_RLC_LI_Field_r12;

   public RLC_Config_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLC_Config_v1250 (
      Asn1Boolean ul_extended_RLC_LI_Field_r12_,
      Asn1Boolean dl_extended_RLC_LI_Field_r12_
   ) {
      super();
      ul_extended_RLC_LI_Field_r12 = ul_extended_RLC_LI_Field_r12_;
      dl_extended_RLC_LI_Field_r12 = dl_extended_RLC_LI_Field_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RLC_Config_v1250 (boolean ul_extended_RLC_LI_Field_r12_,
      boolean dl_extended_RLC_LI_Field_r12_
   ) {
      super();
      ul_extended_RLC_LI_Field_r12 = new Asn1Boolean (ul_extended_RLC_LI_Field_r12_);
      dl_extended_RLC_LI_Field_r12 = new Asn1Boolean (dl_extended_RLC_LI_Field_r12_);
   }

   public void init () {
      ul_extended_RLC_LI_Field_r12 = null;
      dl_extended_RLC_LI_Field_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_extended_RLC_LI_Field_r12;
         case 1: return dl_extended_RLC_LI_Field_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-extended-RLC-LI-Field-r12";
         case 1: return "dl-extended-RLC-LI-Field-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ul_extended_RLC_LI_Field_r12

      buffer.getContext().eventDispatcher.startElement("ul_extended_RLC_LI_Field_r12", -1);

      ul_extended_RLC_LI_Field_r12 = new Asn1Boolean();
      ul_extended_RLC_LI_Field_r12.decode (buffer);

      buffer.invokeCharacters(ul_extended_RLC_LI_Field_r12.toString());
      buffer.getContext().eventDispatcher.endElement("ul_extended_RLC_LI_Field_r12", -1);

      // decode dl_extended_RLC_LI_Field_r12

      buffer.getContext().eventDispatcher.startElement("dl_extended_RLC_LI_Field_r12", -1);

      dl_extended_RLC_LI_Field_r12 = new Asn1Boolean();
      dl_extended_RLC_LI_Field_r12.decode (buffer);

      buffer.invokeCharacters(dl_extended_RLC_LI_Field_r12.toString());
      buffer.getContext().eventDispatcher.endElement("dl_extended_RLC_LI_Field_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_extended_RLC_LI_Field_r12 != null) ul_extended_RLC_LI_Field_r12.print (_sb, "ul_extended_RLC_LI_Field_r12", _level+1);
      if (dl_extended_RLC_LI_Field_r12 != null) dl_extended_RLC_LI_Field_r12.print (_sb, "dl_extended_RLC_LI_Field_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
