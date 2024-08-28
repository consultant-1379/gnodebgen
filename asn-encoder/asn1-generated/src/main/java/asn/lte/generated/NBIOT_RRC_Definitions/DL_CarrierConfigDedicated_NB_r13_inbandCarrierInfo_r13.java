/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_samePCI_Indicator_r13 samePCI_Indicator_r13;  // optional
   public DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_eutraControlRegionSize_r13 eutraControlRegionSize_r13 = null;

   public DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13 (
      DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_samePCI_Indicator_r13 samePCI_Indicator_r13_,
      DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_eutraControlRegionSize_r13 eutraControlRegionSize_r13_
   ) {
      super();
      samePCI_Indicator_r13 = samePCI_Indicator_r13_;
      eutraControlRegionSize_r13 = eutraControlRegionSize_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13 (
      DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_eutraControlRegionSize_r13 eutraControlRegionSize_r13_
   ) {
      super();
      eutraControlRegionSize_r13 = eutraControlRegionSize_r13_;
   }

   public void init () {
      samePCI_Indicator_r13 = null;
      eutraControlRegionSize_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return samePCI_Indicator_r13;
         case 1: return eutraControlRegionSize_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "samePCI-Indicator-r13";
         case 1: return "eutraControlRegionSize-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean samePCI_Indicator_r13Present = buffer.decodeBit ("samePCI_Indicator_r13Present");

      // decode samePCI_Indicator_r13

      if (samePCI_Indicator_r13Present) {
         buffer.getContext().eventDispatcher.startElement("samePCI_Indicator_r13", -1);

         samePCI_Indicator_r13 = new DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_samePCI_Indicator_r13();
         samePCI_Indicator_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("samePCI_Indicator_r13", -1);
      }
      else {
         samePCI_Indicator_r13 = null;
      }

      // decode eutraControlRegionSize_r13

      buffer.getContext().eventDispatcher.startElement("eutraControlRegionSize_r13", -1);

      {
         int tval = DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_eutraControlRegionSize_r13.decodeEnumValue (buffer);
         eutraControlRegionSize_r13 = DL_CarrierConfigDedicated_NB_r13_inbandCarrierInfo_r13_eutraControlRegionSize_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("eutraControlRegionSize_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (samePCI_Indicator_r13 != null) samePCI_Indicator_r13.print (_sb, "samePCI_Indicator_r13", _level+1);
      if (eutraControlRegionSize_r13 != null) eutraControlRegionSize_r13.print (_sb, "eutraControlRegionSize_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
