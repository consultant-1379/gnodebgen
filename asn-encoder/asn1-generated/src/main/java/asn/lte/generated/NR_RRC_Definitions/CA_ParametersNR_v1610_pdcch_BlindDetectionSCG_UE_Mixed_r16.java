/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer pdcch_BlindDetectionSCG_UE1_r16;
   public Asn1Integer pdcch_BlindDetectionSCG_UE2_r16;

   public CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 (
      Asn1Integer pdcch_BlindDetectionSCG_UE1_r16_,
      Asn1Integer pdcch_BlindDetectionSCG_UE2_r16_
   ) {
      super();
      pdcch_BlindDetectionSCG_UE1_r16 = pdcch_BlindDetectionSCG_UE1_r16_;
      pdcch_BlindDetectionSCG_UE2_r16 = pdcch_BlindDetectionSCG_UE2_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 (long pdcch_BlindDetectionSCG_UE1_r16_,
      long pdcch_BlindDetectionSCG_UE2_r16_
   ) {
      super();
      pdcch_BlindDetectionSCG_UE1_r16 = new Asn1Integer (pdcch_BlindDetectionSCG_UE1_r16_);
      pdcch_BlindDetectionSCG_UE2_r16 = new Asn1Integer (pdcch_BlindDetectionSCG_UE2_r16_);
   }

   public void init () {
      pdcch_BlindDetectionSCG_UE1_r16 = null;
      pdcch_BlindDetectionSCG_UE2_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pdcch_BlindDetectionSCG_UE1_r16;
         case 1: return pdcch_BlindDetectionSCG_UE2_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pdcch-BlindDetectionSCG-UE1-r16";
         case 1: return "pdcch-BlindDetectionSCG-UE2-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode pdcch_BlindDetectionSCG_UE1_r16

      buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE1_r16", -1);

      pdcch_BlindDetectionSCG_UE1_r16 = new Asn1Integer();
      pdcch_BlindDetectionSCG_UE1_r16.decode (buffer, 0, 15);

      buffer.invokeCharacters(pdcch_BlindDetectionSCG_UE1_r16.toString());
      buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE1_r16", -1);

      // decode pdcch_BlindDetectionSCG_UE2_r16

      buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE2_r16", -1);

      pdcch_BlindDetectionSCG_UE2_r16 = new Asn1Integer();
      pdcch_BlindDetectionSCG_UE2_r16.decode (buffer, 0, 15);

      buffer.invokeCharacters(pdcch_BlindDetectionSCG_UE2_r16.toString());
      buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE2_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pdcch_BlindDetectionSCG_UE1_r16 != null) pdcch_BlindDetectionSCG_UE1_r16.print (_sb, "pdcch_BlindDetectionSCG_UE1_r16", _level+1);
      if (pdcch_BlindDetectionSCG_UE2_r16 != null) pdcch_BlindDetectionSCG_UE2_r16.print (_sb, "pdcch_BlindDetectionSCG_UE2_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
