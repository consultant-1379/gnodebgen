/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Parameters_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RLC-Parameters-v1310";
   }

   public RLC_Parameters_v1310_extendedRLC_SN_SO_Field_r13 extendedRLC_SN_SO_Field_r13 = null;  // optional

   public RLC_Parameters_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLC_Parameters_v1310 (
      RLC_Parameters_v1310_extendedRLC_SN_SO_Field_r13 extendedRLC_SN_SO_Field_r13_
   ) {
      super();
      extendedRLC_SN_SO_Field_r13 = extendedRLC_SN_SO_Field_r13_;
   }

   public void init () {
      extendedRLC_SN_SO_Field_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return extendedRLC_SN_SO_Field_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "extendedRLC-SN-SO-Field-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean extendedRLC_SN_SO_Field_r13Present = buffer.decodeBit ("extendedRLC_SN_SO_Field_r13Present");

      // decode extendedRLC_SN_SO_Field_r13

      if (extendedRLC_SN_SO_Field_r13Present) {
         buffer.getContext().eventDispatcher.startElement("extendedRLC_SN_SO_Field_r13", -1);

         int tval = RLC_Parameters_v1310_extendedRLC_SN_SO_Field_r13.decodeEnumValue (buffer);
         extendedRLC_SN_SO_Field_r13 = RLC_Parameters_v1310_extendedRLC_SN_SO_Field_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("extendedRLC_SN_SO_Field_r13", -1);
      }
      else {
         extendedRLC_SN_SO_Field_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (extendedRLC_SN_SO_Field_r13 != null) extendedRLC_SN_SO_Field_r13.print (_sb, "extendedRLC_SN_SO_Field_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
