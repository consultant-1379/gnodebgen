/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_interRAT_Parameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public IRAT_ParametersUTRA_FDD utraFDD;  // optional
   public IRAT_ParametersUTRA_TDD128 utraTDD128;  // optional
   public IRAT_ParametersUTRA_TDD384 utraTDD384;  // optional
   public IRAT_ParametersUTRA_TDD768 utraTDD768;  // optional
   public IRAT_ParametersGERAN geran;  // optional
   public IRAT_ParametersCDMA2000_HRPD cdma2000_HRPD;  // optional
   public IRAT_ParametersCDMA2000_1XRTT cdma2000_1xRTT;  // optional

   public UE_EUTRA_Capability_interRAT_Parameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_interRAT_Parameters (
      IRAT_ParametersUTRA_FDD utraFDD_,
      IRAT_ParametersUTRA_TDD128 utraTDD128_,
      IRAT_ParametersUTRA_TDD384 utraTDD384_,
      IRAT_ParametersUTRA_TDD768 utraTDD768_,
      IRAT_ParametersGERAN geran_,
      IRAT_ParametersCDMA2000_HRPD cdma2000_HRPD_,
      IRAT_ParametersCDMA2000_1XRTT cdma2000_1xRTT_
   ) {
      super();
      utraFDD = utraFDD_;
      utraTDD128 = utraTDD128_;
      utraTDD384 = utraTDD384_;
      utraTDD768 = utraTDD768_;
      geran = geran_;
      cdma2000_HRPD = cdma2000_HRPD_;
      cdma2000_1xRTT = cdma2000_1xRTT_;
   }

   public void init () {
      utraFDD = null;
      utraTDD128 = null;
      utraTDD384 = null;
      utraTDD768 = null;
      geran = null;
      cdma2000_HRPD = null;
      cdma2000_1xRTT = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return utraFDD;
         case 1: return utraTDD128;
         case 2: return utraTDD384;
         case 3: return utraTDD768;
         case 4: return geran;
         case 5: return cdma2000_HRPD;
         case 6: return cdma2000_1xRTT;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "utraFDD";
         case 1: return "utraTDD128";
         case 2: return "utraTDD384";
         case 3: return "utraTDD768";
         case 4: return "geran";
         case 5: return "cdma2000-HRPD";
         case 6: return "cdma2000-1xRTT";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean utraFDDPresent = buffer.decodeBit ("utraFDDPresent");
      boolean utraTDD128Present = buffer.decodeBit ("utraTDD128Present");
      boolean utraTDD384Present = buffer.decodeBit ("utraTDD384Present");
      boolean utraTDD768Present = buffer.decodeBit ("utraTDD768Present");
      boolean geranPresent = buffer.decodeBit ("geranPresent");
      boolean cdma2000_HRPDPresent = buffer.decodeBit ("cdma2000_HRPDPresent");
      boolean cdma2000_1xRTTPresent = buffer.decodeBit ("cdma2000_1xRTTPresent");

      // decode utraFDD

      if (utraFDDPresent) {
         buffer.getContext().eventDispatcher.startElement("utraFDD", -1);

         utraFDD = new IRAT_ParametersUTRA_FDD();
         utraFDD.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("utraFDD", -1);
      }
      else {
         utraFDD = null;
      }

      // decode utraTDD128

      if (utraTDD128Present) {
         buffer.getContext().eventDispatcher.startElement("utraTDD128", -1);

         utraTDD128 = new IRAT_ParametersUTRA_TDD128();
         utraTDD128.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("utraTDD128", -1);
      }
      else {
         utraTDD128 = null;
      }

      // decode utraTDD384

      if (utraTDD384Present) {
         buffer.getContext().eventDispatcher.startElement("utraTDD384", -1);

         utraTDD384 = new IRAT_ParametersUTRA_TDD384();
         utraTDD384.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("utraTDD384", -1);
      }
      else {
         utraTDD384 = null;
      }

      // decode utraTDD768

      if (utraTDD768Present) {
         buffer.getContext().eventDispatcher.startElement("utraTDD768", -1);

         utraTDD768 = new IRAT_ParametersUTRA_TDD768();
         utraTDD768.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("utraTDD768", -1);
      }
      else {
         utraTDD768 = null;
      }

      // decode geran

      if (geranPresent) {
         buffer.getContext().eventDispatcher.startElement("geran", -1);

         geran = new IRAT_ParametersGERAN();
         geran.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("geran", -1);
      }
      else {
         geran = null;
      }

      // decode cdma2000_HRPD

      if (cdma2000_HRPDPresent) {
         buffer.getContext().eventDispatcher.startElement("cdma2000_HRPD", -1);

         cdma2000_HRPD = new IRAT_ParametersCDMA2000_HRPD();
         cdma2000_HRPD.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cdma2000_HRPD", -1);
      }
      else {
         cdma2000_HRPD = null;
      }

      // decode cdma2000_1xRTT

      if (cdma2000_1xRTTPresent) {
         buffer.getContext().eventDispatcher.startElement("cdma2000_1xRTT", -1);

         cdma2000_1xRTT = new IRAT_ParametersCDMA2000_1XRTT();
         cdma2000_1xRTT.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cdma2000_1xRTT", -1);
      }
      else {
         cdma2000_1xRTT = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (utraFDD != null) utraFDD.print (_sb, "utraFDD", _level+1);
      if (utraTDD128 != null) utraTDD128.print (_sb, "utraTDD128", _level+1);
      if (utraTDD384 != null) utraTDD384.print (_sb, "utraTDD384", _level+1);
      if (utraTDD768 != null) utraTDD768.print (_sb, "utraTDD768", _level+1);
      if (geran != null) geran.print (_sb, "geran", _level+1);
      if (cdma2000_HRPD != null) cdma2000_HRPD.print (_sb, "cdma2000_HRPD", _level+1);
      if (cdma2000_1xRTT != null) cdma2000_1xRTT.print (_sb, "cdma2000_1xRTT", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
