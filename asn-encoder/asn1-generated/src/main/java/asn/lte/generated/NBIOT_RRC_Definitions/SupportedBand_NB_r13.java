/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SupportedBand_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SupportedBand-NB-r13";
   }

   public FreqBandIndicator_NB_r13 band_r13;
   public SupportedBand_NB_r13_powerClassNB_20dBm_r13 powerClassNB_20dBm_r13 = null;  // optional

   public SupportedBand_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SupportedBand_NB_r13 (
      FreqBandIndicator_NB_r13 band_r13_,
      SupportedBand_NB_r13_powerClassNB_20dBm_r13 powerClassNB_20dBm_r13_
   ) {
      super();
      band_r13 = band_r13_;
      powerClassNB_20dBm_r13 = powerClassNB_20dBm_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SupportedBand_NB_r13 (
      FreqBandIndicator_NB_r13 band_r13_
   ) {
      super();
      band_r13 = band_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SupportedBand_NB_r13 (long band_r13_,
      SupportedBand_NB_r13_powerClassNB_20dBm_r13 powerClassNB_20dBm_r13_
   ) {
      super();
      band_r13 = new FreqBandIndicator_NB_r13 (band_r13_);
      powerClassNB_20dBm_r13 = powerClassNB_20dBm_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SupportedBand_NB_r13 (
      long band_r13_
   ) {
      super();
      band_r13 = new FreqBandIndicator_NB_r13 (band_r13_);
   }

   public void init () {
      band_r13 = null;
      powerClassNB_20dBm_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return band_r13;
         case 1: return powerClassNB_20dBm_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "band-r13";
         case 1: return "powerClassNB-20dBm-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean powerClassNB_20dBm_r13Present = buffer.decodeBit ("powerClassNB_20dBm_r13Present");

      // decode band_r13

      buffer.getContext().eventDispatcher.startElement("band_r13", -1);

      band_r13 = new FreqBandIndicator_NB_r13();
      band_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("band_r13", -1);

      // decode powerClassNB_20dBm_r13

      if (powerClassNB_20dBm_r13Present) {
         buffer.getContext().eventDispatcher.startElement("powerClassNB_20dBm_r13", -1);

         int tval = SupportedBand_NB_r13_powerClassNB_20dBm_r13.decodeEnumValue (buffer);
         powerClassNB_20dBm_r13 = SupportedBand_NB_r13_powerClassNB_20dBm_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("powerClassNB_20dBm_r13", -1);
      }
      else {
         powerClassNB_20dBm_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (band_r13 != null) band_r13.print (_sb, "band_r13", _level+1);
      if (powerClassNB_20dBm_r13 != null) powerClassNB_20dBm_r13.print (_sb, "powerClassNB_20dBm_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
