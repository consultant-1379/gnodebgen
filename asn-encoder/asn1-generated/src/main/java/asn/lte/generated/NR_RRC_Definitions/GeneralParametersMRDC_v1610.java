/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class GeneralParametersMRDC_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "GeneralParametersMRDC-v1610";
   }

   public GeneralParametersMRDC_v1610_f1c_OverEUTRA_r16 f1c_OverEUTRA_r16 = null;  // optional

   public GeneralParametersMRDC_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public GeneralParametersMRDC_v1610 (
      GeneralParametersMRDC_v1610_f1c_OverEUTRA_r16 f1c_OverEUTRA_r16_
   ) {
      super();
      f1c_OverEUTRA_r16 = f1c_OverEUTRA_r16_;
   }

   public void init () {
      f1c_OverEUTRA_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return f1c_OverEUTRA_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "f1c-OverEUTRA-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean f1c_OverEUTRA_r16Present = buffer.decodeBit ("f1c_OverEUTRA_r16Present");

      // decode f1c_OverEUTRA_r16

      if (f1c_OverEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("f1c_OverEUTRA_r16", -1);

         int tval = GeneralParametersMRDC_v1610_f1c_OverEUTRA_r16.decodeEnumValue (buffer);
         f1c_OverEUTRA_r16 = GeneralParametersMRDC_v1610_f1c_OverEUTRA_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("f1c_OverEUTRA_r16", -1);
      }
      else {
         f1c_OverEUTRA_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (f1c_OverEUTRA_r16 != null) f1c_OverEUTRA_r16.print (_sb, "f1c_OverEUTRA_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
