/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RF-Parameters-v1310";
   }

   public RF_Parameters_v1310_eNB_RequestedParameters_r13 eNB_RequestedParameters_r13;  // optional
   public RF_Parameters_v1310_maximumCCsRetrieval_r13 maximumCCsRetrieval_r13 = null;  // optional
   public RF_Parameters_v1310_skipFallbackCombinations_r13 skipFallbackCombinations_r13 = null;  // optional
   public RF_Parameters_v1310_reducedIntNonContComb_r13 reducedIntNonContComb_r13 = null;  // optional
   public SupportedBandListEUTRA_v1310 supportedBandListEUTRA_v1310;  // optional
   public SupportedBandCombinationReduced_r13 supportedBandCombinationReduced_r13;  // optional

   public RF_Parameters_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters_v1310 (
      RF_Parameters_v1310_eNB_RequestedParameters_r13 eNB_RequestedParameters_r13_,
      RF_Parameters_v1310_maximumCCsRetrieval_r13 maximumCCsRetrieval_r13_,
      RF_Parameters_v1310_skipFallbackCombinations_r13 skipFallbackCombinations_r13_,
      RF_Parameters_v1310_reducedIntNonContComb_r13 reducedIntNonContComb_r13_,
      SupportedBandListEUTRA_v1310 supportedBandListEUTRA_v1310_,
      SupportedBandCombinationReduced_r13 supportedBandCombinationReduced_r13_
   ) {
      super();
      eNB_RequestedParameters_r13 = eNB_RequestedParameters_r13_;
      maximumCCsRetrieval_r13 = maximumCCsRetrieval_r13_;
      skipFallbackCombinations_r13 = skipFallbackCombinations_r13_;
      reducedIntNonContComb_r13 = reducedIntNonContComb_r13_;
      supportedBandListEUTRA_v1310 = supportedBandListEUTRA_v1310_;
      supportedBandCombinationReduced_r13 = supportedBandCombinationReduced_r13_;
   }

   public void init () {
      eNB_RequestedParameters_r13 = null;
      maximumCCsRetrieval_r13 = null;
      skipFallbackCombinations_r13 = null;
      reducedIntNonContComb_r13 = null;
      supportedBandListEUTRA_v1310 = null;
      supportedBandCombinationReduced_r13 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eNB_RequestedParameters_r13;
         case 1: return maximumCCsRetrieval_r13;
         case 2: return skipFallbackCombinations_r13;
         case 3: return reducedIntNonContComb_r13;
         case 4: return supportedBandListEUTRA_v1310;
         case 5: return supportedBandCombinationReduced_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eNB-RequestedParameters-r13";
         case 1: return "maximumCCsRetrieval-r13";
         case 2: return "skipFallbackCombinations-r13";
         case 3: return "reducedIntNonContComb-r13";
         case 4: return "supportedBandListEUTRA-v1310";
         case 5: return "supportedBandCombinationReduced-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean eNB_RequestedParameters_r13Present = buffer.decodeBit ("eNB_RequestedParameters_r13Present");
      boolean maximumCCsRetrieval_r13Present = buffer.decodeBit ("maximumCCsRetrieval_r13Present");
      boolean skipFallbackCombinations_r13Present = buffer.decodeBit ("skipFallbackCombinations_r13Present");
      boolean reducedIntNonContComb_r13Present = buffer.decodeBit ("reducedIntNonContComb_r13Present");
      boolean supportedBandListEUTRA_v1310Present = buffer.decodeBit ("supportedBandListEUTRA_v1310Present");
      boolean supportedBandCombinationReduced_r13Present = buffer.decodeBit ("supportedBandCombinationReduced_r13Present");

      // decode eNB_RequestedParameters_r13

      if (eNB_RequestedParameters_r13Present) {
         buffer.getContext().eventDispatcher.startElement("eNB_RequestedParameters_r13", -1);

         eNB_RequestedParameters_r13 = new RF_Parameters_v1310_eNB_RequestedParameters_r13();
         eNB_RequestedParameters_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("eNB_RequestedParameters_r13", -1);
      }
      else {
         eNB_RequestedParameters_r13 = null;
      }

      // decode maximumCCsRetrieval_r13

      if (maximumCCsRetrieval_r13Present) {
         buffer.getContext().eventDispatcher.startElement("maximumCCsRetrieval_r13", -1);

         int tval = RF_Parameters_v1310_maximumCCsRetrieval_r13.decodeEnumValue (buffer);
         maximumCCsRetrieval_r13 = RF_Parameters_v1310_maximumCCsRetrieval_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maximumCCsRetrieval_r13", -1);
      }
      else {
         maximumCCsRetrieval_r13 = null;
      }

      // decode skipFallbackCombinations_r13

      if (skipFallbackCombinations_r13Present) {
         buffer.getContext().eventDispatcher.startElement("skipFallbackCombinations_r13", -1);

         int tval = RF_Parameters_v1310_skipFallbackCombinations_r13.decodeEnumValue (buffer);
         skipFallbackCombinations_r13 = RF_Parameters_v1310_skipFallbackCombinations_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("skipFallbackCombinations_r13", -1);
      }
      else {
         skipFallbackCombinations_r13 = null;
      }

      // decode reducedIntNonContComb_r13

      if (reducedIntNonContComb_r13Present) {
         buffer.getContext().eventDispatcher.startElement("reducedIntNonContComb_r13", -1);

         int tval = RF_Parameters_v1310_reducedIntNonContComb_r13.decodeEnumValue (buffer);
         reducedIntNonContComb_r13 = RF_Parameters_v1310_reducedIntNonContComb_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reducedIntNonContComb_r13", -1);
      }
      else {
         reducedIntNonContComb_r13 = null;
      }

      // decode supportedBandListEUTRA_v1310

      if (supportedBandListEUTRA_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandListEUTRA_v1310", -1);

         supportedBandListEUTRA_v1310 = new SupportedBandListEUTRA_v1310();
         supportedBandListEUTRA_v1310.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandListEUTRA_v1310", -1);
      }
      else {
         supportedBandListEUTRA_v1310 = null;
      }

      // decode supportedBandCombinationReduced_r13

      if (supportedBandCombinationReduced_r13Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombinationReduced_r13", -1);

         supportedBandCombinationReduced_r13 = new SupportedBandCombinationReduced_r13();
         supportedBandCombinationReduced_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombinationReduced_r13", -1);
      }
      else {
         supportedBandCombinationReduced_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eNB_RequestedParameters_r13 != null) eNB_RequestedParameters_r13.print (_sb, "eNB_RequestedParameters_r13", _level+1);
      if (maximumCCsRetrieval_r13 != null) maximumCCsRetrieval_r13.print (_sb, "maximumCCsRetrieval_r13", _level+1);
      if (skipFallbackCombinations_r13 != null) skipFallbackCombinations_r13.print (_sb, "skipFallbackCombinations_r13", _level+1);
      if (reducedIntNonContComb_r13 != null) reducedIntNonContComb_r13.print (_sb, "reducedIntNonContComb_r13", _level+1);
      if (supportedBandListEUTRA_v1310 != null) supportedBandListEUTRA_v1310.print (_sb, "supportedBandListEUTRA_v1310", _level+1);
      if (supportedBandCombinationReduced_r13 != null) supportedBandCombinationReduced_r13.print (_sb, "supportedBandCombinationReduced_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
