/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_Parameters_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-Parameters-v1310";
   }

   public MAC_Parameters_v1310_extendedMAC_LengthField_r13 extendedMAC_LengthField_r13 = null;  // optional
   public MAC_Parameters_v1310_extendedLongDRX_r13 extendedLongDRX_r13 = null;  // optional

   public MAC_Parameters_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_Parameters_v1310 (
      MAC_Parameters_v1310_extendedMAC_LengthField_r13 extendedMAC_LengthField_r13_,
      MAC_Parameters_v1310_extendedLongDRX_r13 extendedLongDRX_r13_
   ) {
      super();
      extendedMAC_LengthField_r13 = extendedMAC_LengthField_r13_;
      extendedLongDRX_r13 = extendedLongDRX_r13_;
   }

   public void init () {
      extendedMAC_LengthField_r13 = null;
      extendedLongDRX_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return extendedMAC_LengthField_r13;
         case 1: return extendedLongDRX_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "extendedMAC-LengthField-r13";
         case 1: return "extendedLongDRX-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean extendedMAC_LengthField_r13Present = buffer.decodeBit ("extendedMAC_LengthField_r13Present");
      boolean extendedLongDRX_r13Present = buffer.decodeBit ("extendedLongDRX_r13Present");

      // decode extendedMAC_LengthField_r13

      if (extendedMAC_LengthField_r13Present) {
         buffer.getContext().eventDispatcher.startElement("extendedMAC_LengthField_r13", -1);

         int tval = MAC_Parameters_v1310_extendedMAC_LengthField_r13.decodeEnumValue (buffer);
         extendedMAC_LengthField_r13 = MAC_Parameters_v1310_extendedMAC_LengthField_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("extendedMAC_LengthField_r13", -1);
      }
      else {
         extendedMAC_LengthField_r13 = null;
      }

      // decode extendedLongDRX_r13

      if (extendedLongDRX_r13Present) {
         buffer.getContext().eventDispatcher.startElement("extendedLongDRX_r13", -1);

         int tval = MAC_Parameters_v1310_extendedLongDRX_r13.decodeEnumValue (buffer);
         extendedLongDRX_r13 = MAC_Parameters_v1310_extendedLongDRX_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("extendedLongDRX_r13", -1);
      }
      else {
         extendedLongDRX_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (extendedMAC_LengthField_r13 != null) extendedMAC_LengthField_r13.print (_sb, "extendedMAC_LengthField_r13", _level+1);
      if (extendedLongDRX_r13 != null) extendedLongDRX_r13.print (_sb, "extendedLongDRX_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
