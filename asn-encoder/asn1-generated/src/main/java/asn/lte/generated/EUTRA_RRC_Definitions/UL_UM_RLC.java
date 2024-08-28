/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_UM_RLC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UL-UM-RLC";
   }

   public SN_FieldLength sn_FieldLength = null;

   public UL_UM_RLC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UL_UM_RLC (
      SN_FieldLength sn_FieldLength_
   ) {
      super();
      sn_FieldLength = sn_FieldLength_;
   }

   public void init () {
      sn_FieldLength = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sn_FieldLength;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sn-FieldLength";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode sn_FieldLength

      buffer.getContext().eventDispatcher.startElement("sn_FieldLength", -1);

      {
         int tval = SN_FieldLength.decodeEnumValue (buffer);
         sn_FieldLength = SN_FieldLength.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sn_FieldLength", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sn_FieldLength != null) sn_FieldLength.print (_sb, "sn_FieldLength", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
