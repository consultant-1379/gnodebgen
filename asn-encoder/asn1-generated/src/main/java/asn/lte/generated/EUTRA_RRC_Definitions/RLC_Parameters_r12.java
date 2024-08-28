/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Parameters_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RLC-Parameters-r12";
   }

   public RLC_Parameters_r12_extended_RLC_LI_Field_r12 extended_RLC_LI_Field_r12 = null;

   public RLC_Parameters_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLC_Parameters_r12 (
      RLC_Parameters_r12_extended_RLC_LI_Field_r12 extended_RLC_LI_Field_r12_
   ) {
      super();
      extended_RLC_LI_Field_r12 = extended_RLC_LI_Field_r12_;
   }

   public void init () {
      extended_RLC_LI_Field_r12 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return extended_RLC_LI_Field_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "extended-RLC-LI-Field-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode extended_RLC_LI_Field_r12

      buffer.getContext().eventDispatcher.startElement("extended_RLC_LI_Field_r12", -1);

      {
         int tval = RLC_Parameters_r12_extended_RLC_LI_Field_r12.decodeEnumValue (buffer);
         extended_RLC_LI_Field_r12 = RLC_Parameters_r12_extended_RLC_LI_Field_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("extended_RLC_LI_Field_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (extended_RLC_LI_Field_r12 != null) extended_RLC_LI_Field_r12.print (_sb, "extended_RLC_LI_Field_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
