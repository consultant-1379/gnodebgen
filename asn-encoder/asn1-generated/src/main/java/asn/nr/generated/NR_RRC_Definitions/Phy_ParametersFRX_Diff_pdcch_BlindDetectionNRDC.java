/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersFRX_Diff_pdcch_BlindDetectionNRDC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer pdcch_BlindDetectionMCG_UE;
   public Asn1Integer pdcch_BlindDetectionSCG_UE;

   public Phy_ParametersFRX_Diff_pdcch_BlindDetectionNRDC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Phy_ParametersFRX_Diff_pdcch_BlindDetectionNRDC (
      Asn1Integer pdcch_BlindDetectionMCG_UE_,
      Asn1Integer pdcch_BlindDetectionSCG_UE_
   ) {
      super();
      pdcch_BlindDetectionMCG_UE = pdcch_BlindDetectionMCG_UE_;
      pdcch_BlindDetectionSCG_UE = pdcch_BlindDetectionSCG_UE_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Phy_ParametersFRX_Diff_pdcch_BlindDetectionNRDC (long pdcch_BlindDetectionMCG_UE_,
      long pdcch_BlindDetectionSCG_UE_
   ) {
      super();
      pdcch_BlindDetectionMCG_UE = new Asn1Integer (pdcch_BlindDetectionMCG_UE_);
      pdcch_BlindDetectionSCG_UE = new Asn1Integer (pdcch_BlindDetectionSCG_UE_);
   }

   public void init () {
      pdcch_BlindDetectionMCG_UE = null;
      pdcch_BlindDetectionSCG_UE = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pdcch_BlindDetectionMCG_UE;
         case 1: return pdcch_BlindDetectionSCG_UE;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pdcch-BlindDetectionMCG-UE";
         case 1: return "pdcch-BlindDetectionSCG-UE";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode pdcch_BlindDetectionMCG_UE

      buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionMCG_UE", -1);

      pdcch_BlindDetectionMCG_UE = new Asn1Integer();
      pdcch_BlindDetectionMCG_UE.decode (buffer, 1, 15);

      buffer.invokeCharacters(pdcch_BlindDetectionMCG_UE.toString());
      buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionMCG_UE", -1);

      // decode pdcch_BlindDetectionSCG_UE

      buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE", -1);

      pdcch_BlindDetectionSCG_UE = new Asn1Integer();
      pdcch_BlindDetectionSCG_UE.decode (buffer, 1, 15);

      buffer.invokeCharacters(pdcch_BlindDetectionSCG_UE.toString());
      buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode pdcch_BlindDetectionMCG_UE

      if (pdcch_BlindDetectionMCG_UE != null) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionMCG_UE", -1);

         pdcch_BlindDetectionMCG_UE.encode (buffer, 1, 15);

         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionMCG_UE", -1);
      }
      else throw new Asn1MissingRequiredException ("pdcch_BlindDetectionMCG_UE");

      // encode pdcch_BlindDetectionSCG_UE

      if (pdcch_BlindDetectionSCG_UE != null) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE", -1);

         pdcch_BlindDetectionSCG_UE.encode (buffer, 1, 15);

         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE", -1);
      }
      else throw new Asn1MissingRequiredException ("pdcch_BlindDetectionSCG_UE");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pdcch_BlindDetectionMCG_UE != null) pdcch_BlindDetectionMCG_UE.print (_sb, "pdcch_BlindDetectionMCG_UE", _level+1);
      if (pdcch_BlindDetectionSCG_UE != null) pdcch_BlindDetectionSCG_UE.print (_sb, "pdcch_BlindDetectionSCG_UE", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
