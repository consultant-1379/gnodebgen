/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBMS_SAI_InterFreq_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MBMS-SAI-InterFreq-r11";
   }

   public ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r11;
   public MBMS_SAI_List_r11 mbms_SAI_List_r11;

   public MBMS_SAI_InterFreq_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MBMS_SAI_InterFreq_r11 (
      ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r11_,
      MBMS_SAI_List_r11 mbms_SAI_List_r11_
   ) {
      super();
      dl_CarrierFreq_r11 = dl_CarrierFreq_r11_;
      mbms_SAI_List_r11 = mbms_SAI_List_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MBMS_SAI_InterFreq_r11 (long dl_CarrierFreq_r11_,
      MBMS_SAI_List_r11 mbms_SAI_List_r11_
   ) {
      super();
      dl_CarrierFreq_r11 = new ARFCN_ValueEUTRA_r9 (dl_CarrierFreq_r11_);
      mbms_SAI_List_r11 = mbms_SAI_List_r11_;
   }

   public void init () {
      dl_CarrierFreq_r11 = null;
      mbms_SAI_List_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_CarrierFreq_r11;
         case 1: return mbms_SAI_List_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-CarrierFreq-r11";
         case 1: return "mbms-SAI-List-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode dl_CarrierFreq_r11

      buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq_r11", -1);

      dl_CarrierFreq_r11 = new ARFCN_ValueEUTRA_r9();
      dl_CarrierFreq_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq_r11", -1);

      // decode mbms_SAI_List_r11

      buffer.getContext().eventDispatcher.startElement("mbms_SAI_List_r11", -1);

      mbms_SAI_List_r11 = new MBMS_SAI_List_r11();
      mbms_SAI_List_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mbms_SAI_List_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dl_CarrierFreq_r11 != null) dl_CarrierFreq_r11.print (_sb, "dl_CarrierFreq_r11", _level+1);
      if (mbms_SAI_List_r11 != null) mbms_SAI_List_r11.print (_sb, "mbms_SAI_List_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
