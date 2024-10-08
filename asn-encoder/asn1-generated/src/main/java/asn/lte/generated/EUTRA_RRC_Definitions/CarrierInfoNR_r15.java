/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierInfoNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierInfoNR-r15";
   }

   public ARFCN_ValueNR_r15 carrierFreq_r15;
   public CarrierInfoNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15 = null;
   public MTC_SSB_NR_r15 smtc_r15;  // optional

   public CarrierInfoNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierInfoNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_,
      CarrierInfoNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      MTC_SSB_NR_r15 smtc_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      smtc_r15 = smtc_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CarrierInfoNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_,
      CarrierInfoNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CarrierInfoNR_r15 (long carrierFreq_r15_,
      CarrierInfoNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      MTC_SSB_NR_r15 smtc_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      smtc_r15 = smtc_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CarrierInfoNR_r15 (
      long carrierFreq_r15_,
      CarrierInfoNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
   }

   public void init () {
      carrierFreq_r15 = null;
      subcarrierSpacingSSB_r15 = null;
      smtc_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r15;
         case 1: return subcarrierSpacingSSB_r15;
         case 2: return smtc_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r15";
         case 1: return "subcarrierSpacingSSB-r15";
         case 2: return "smtc-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean smtc_r15Present = buffer.decodeBit ("smtc_r15Present");

      // decode carrierFreq_r15

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r15", -1);

      carrierFreq_r15 = new ARFCN_ValueNR_r15();
      carrierFreq_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r15", -1);

      // decode subcarrierSpacingSSB_r15

      buffer.getContext().eventDispatcher.startElement("subcarrierSpacingSSB_r15", -1);

      {
         int tval = CarrierInfoNR_r15_subcarrierSpacingSSB_r15.decodeEnumValue (buffer);
         subcarrierSpacingSSB_r15 = CarrierInfoNR_r15_subcarrierSpacingSSB_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("subcarrierSpacingSSB_r15", -1);

      // decode smtc_r15

      if (smtc_r15Present) {
         buffer.getContext().eventDispatcher.startElement("smtc_r15", -1);

         smtc_r15 = new MTC_SSB_NR_r15();
         smtc_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("smtc_r15", -1);
      }
      else {
         smtc_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq_r15 != null) carrierFreq_r15.print (_sb, "carrierFreq_r15", _level+1);
      if (subcarrierSpacingSSB_r15 != null) subcarrierSpacingSSB_r15.print (_sb, "subcarrierSpacingSSB_r15", _level+1);
      if (smtc_r15 != null) smtc_r15.print (_sb, "smtc_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
