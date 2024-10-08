/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBMS_SAI_InterFreq_v1140 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MBMS-SAI-InterFreq-v1140";
   }

   public MultiBandInfoList_r11 multiBandInfoList_r11;  // optional

   public MBMS_SAI_InterFreq_v1140 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MBMS_SAI_InterFreq_v1140 (
      MultiBandInfoList_r11 multiBandInfoList_r11_
   ) {
      super();
      multiBandInfoList_r11 = multiBandInfoList_r11_;
   }

   public void init () {
      multiBandInfoList_r11 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return multiBandInfoList_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "multiBandInfoList-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean multiBandInfoList_r11Present = buffer.decodeBit ("multiBandInfoList_r11Present");

      // decode multiBandInfoList_r11

      if (multiBandInfoList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("multiBandInfoList_r11", -1);

         multiBandInfoList_r11 = new MultiBandInfoList_r11();
         multiBandInfoList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("multiBandInfoList_r11", -1);
      }
      else {
         multiBandInfoList_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (multiBandInfoList_r11 != null) multiBandInfoList_r11.print (_sb, "multiBandInfoList_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
