/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14 samePCI_Indicator_r14;  // optional
   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_eutraControlRegionSize_r14 eutraControlRegionSize_r14 = null;

   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14 (
      DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14 samePCI_Indicator_r14_,
      DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_eutraControlRegionSize_r14 eutraControlRegionSize_r14_
   ) {
      super();
      samePCI_Indicator_r14 = samePCI_Indicator_r14_;
      eutraControlRegionSize_r14 = eutraControlRegionSize_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14 (
      DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_eutraControlRegionSize_r14 eutraControlRegionSize_r14_
   ) {
      super();
      eutraControlRegionSize_r14 = eutraControlRegionSize_r14_;
   }

   public void init () {
      samePCI_Indicator_r14 = null;
      eutraControlRegionSize_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return samePCI_Indicator_r14;
         case 1: return eutraControlRegionSize_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "samePCI-Indicator-r14";
         case 1: return "eutraControlRegionSize-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean samePCI_Indicator_r14Present = buffer.decodeBit ("samePCI_Indicator_r14Present");

      // decode samePCI_Indicator_r14

      if (samePCI_Indicator_r14Present) {
         buffer.getContext().eventDispatcher.startElement("samePCI_Indicator_r14", -1);

         samePCI_Indicator_r14 = new DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14();
         samePCI_Indicator_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("samePCI_Indicator_r14", -1);
      }
      else {
         samePCI_Indicator_r14 = null;
      }

      // decode eutraControlRegionSize_r14

      buffer.getContext().eventDispatcher.startElement("eutraControlRegionSize_r14", -1);

      {
         int tval = DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_eutraControlRegionSize_r14.decodeEnumValue (buffer);
         eutraControlRegionSize_r14 = DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_eutraControlRegionSize_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("eutraControlRegionSize_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (samePCI_Indicator_r14 != null) samePCI_Indicator_r14.print (_sb, "samePCI_Indicator_r14", _level+1);
      if (eutraControlRegionSize_r14 != null) eutraControlRegionSize_r14.print (_sb, "eutraControlRegionSize_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
