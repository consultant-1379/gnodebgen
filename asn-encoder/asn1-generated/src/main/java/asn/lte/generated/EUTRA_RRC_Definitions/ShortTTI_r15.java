/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ShortTTI_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ShortTTI-r15";
   }

   public ShortTTI_Length_r15 dl_STTI_Length_r15 = null;  // optional
   public ShortTTI_Length_r15 ul_STTI_Length_r15 = null;  // optional

   public ShortTTI_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ShortTTI_r15 (
      ShortTTI_Length_r15 dl_STTI_Length_r15_,
      ShortTTI_Length_r15 ul_STTI_Length_r15_
   ) {
      super();
      dl_STTI_Length_r15 = dl_STTI_Length_r15_;
      ul_STTI_Length_r15 = ul_STTI_Length_r15_;
   }

   public void init () {
      dl_STTI_Length_r15 = null;
      ul_STTI_Length_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_STTI_Length_r15;
         case 1: return ul_STTI_Length_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-STTI-Length-r15";
         case 1: return "ul-STTI-Length-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dl_STTI_Length_r15Present = buffer.decodeBit ("dl_STTI_Length_r15Present");
      boolean ul_STTI_Length_r15Present = buffer.decodeBit ("ul_STTI_Length_r15Present");

      // decode dl_STTI_Length_r15

      if (dl_STTI_Length_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_STTI_Length_r15", -1);

         int tval = ShortTTI_Length_r15.decodeEnumValue (buffer);
         dl_STTI_Length_r15 = ShortTTI_Length_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_STTI_Length_r15", -1);
      }
      else {
         dl_STTI_Length_r15 = null;
      }

      // decode ul_STTI_Length_r15

      if (ul_STTI_Length_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ul_STTI_Length_r15", -1);

         int tval = ShortTTI_Length_r15.decodeEnumValue (buffer);
         ul_STTI_Length_r15 = ShortTTI_Length_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_STTI_Length_r15", -1);
      }
      else {
         ul_STTI_Length_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dl_STTI_Length_r15 != null) dl_STTI_Length_r15.print (_sb, "dl_STTI_Length_r15", _level+1);
      if (ul_STTI_Length_r15 != null) ul_STTI_Length_r15.print (_sb, "ul_STTI_Length_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
