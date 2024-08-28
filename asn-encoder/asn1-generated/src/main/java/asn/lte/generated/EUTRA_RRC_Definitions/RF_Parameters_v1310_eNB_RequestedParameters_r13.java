/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters_v1310_eNB_RequestedParameters_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RF_Parameters_v1310_eNB_RequestedParameters_r13_reducedIntNonContCombRequested_r13 reducedIntNonContCombRequested_r13 = null;  // optional
   public Asn1Integer requestedCCsDL_r13;  // optional
   public Asn1Integer requestedCCsUL_r13;  // optional
   public RF_Parameters_v1310_eNB_RequestedParameters_r13_skipFallbackCombRequested_r13 skipFallbackCombRequested_r13 = null;  // optional

   public RF_Parameters_v1310_eNB_RequestedParameters_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters_v1310_eNB_RequestedParameters_r13 (
      RF_Parameters_v1310_eNB_RequestedParameters_r13_reducedIntNonContCombRequested_r13 reducedIntNonContCombRequested_r13_,
      Asn1Integer requestedCCsDL_r13_,
      Asn1Integer requestedCCsUL_r13_,
      RF_Parameters_v1310_eNB_RequestedParameters_r13_skipFallbackCombRequested_r13 skipFallbackCombRequested_r13_
   ) {
      super();
      reducedIntNonContCombRequested_r13 = reducedIntNonContCombRequested_r13_;
      requestedCCsDL_r13 = requestedCCsDL_r13_;
      requestedCCsUL_r13 = requestedCCsUL_r13_;
      skipFallbackCombRequested_r13 = skipFallbackCombRequested_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RF_Parameters_v1310_eNB_RequestedParameters_r13 (RF_Parameters_v1310_eNB_RequestedParameters_r13_reducedIntNonContCombRequested_r13 reducedIntNonContCombRequested_r13_,
      long requestedCCsDL_r13_,
      long requestedCCsUL_r13_,
      RF_Parameters_v1310_eNB_RequestedParameters_r13_skipFallbackCombRequested_r13 skipFallbackCombRequested_r13_
   ) {
      super();
      reducedIntNonContCombRequested_r13 = reducedIntNonContCombRequested_r13_;
      requestedCCsDL_r13 = new Asn1Integer (requestedCCsDL_r13_);
      requestedCCsUL_r13 = new Asn1Integer (requestedCCsUL_r13_);
      skipFallbackCombRequested_r13 = skipFallbackCombRequested_r13_;
   }

   public void init () {
      reducedIntNonContCombRequested_r13 = null;
      requestedCCsDL_r13 = null;
      requestedCCsUL_r13 = null;
      skipFallbackCombRequested_r13 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reducedIntNonContCombRequested_r13;
         case 1: return requestedCCsDL_r13;
         case 2: return requestedCCsUL_r13;
         case 3: return skipFallbackCombRequested_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reducedIntNonContCombRequested-r13";
         case 1: return "requestedCCsDL-r13";
         case 2: return "requestedCCsUL-r13";
         case 3: return "skipFallbackCombRequested-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean reducedIntNonContCombRequested_r13Present = buffer.decodeBit ("reducedIntNonContCombRequested_r13Present");
      boolean requestedCCsDL_r13Present = buffer.decodeBit ("requestedCCsDL_r13Present");
      boolean requestedCCsUL_r13Present = buffer.decodeBit ("requestedCCsUL_r13Present");
      boolean skipFallbackCombRequested_r13Present = buffer.decodeBit ("skipFallbackCombRequested_r13Present");

      // decode reducedIntNonContCombRequested_r13

      if (reducedIntNonContCombRequested_r13Present) {
         buffer.getContext().eventDispatcher.startElement("reducedIntNonContCombRequested_r13", -1);

         int tval = RF_Parameters_v1310_eNB_RequestedParameters_r13_reducedIntNonContCombRequested_r13.decodeEnumValue (buffer);
         reducedIntNonContCombRequested_r13 = RF_Parameters_v1310_eNB_RequestedParameters_r13_reducedIntNonContCombRequested_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reducedIntNonContCombRequested_r13", -1);
      }
      else {
         reducedIntNonContCombRequested_r13 = null;
      }

      // decode requestedCCsDL_r13

      if (requestedCCsDL_r13Present) {
         buffer.getContext().eventDispatcher.startElement("requestedCCsDL_r13", -1);

         requestedCCsDL_r13 = new Asn1Integer();
         requestedCCsDL_r13.decode (buffer, 2, 32);

         buffer.invokeCharacters(requestedCCsDL_r13.toString());
         buffer.getContext().eventDispatcher.endElement("requestedCCsDL_r13", -1);
      }
      else {
         requestedCCsDL_r13 = null;
      }

      // decode requestedCCsUL_r13

      if (requestedCCsUL_r13Present) {
         buffer.getContext().eventDispatcher.startElement("requestedCCsUL_r13", -1);

         requestedCCsUL_r13 = new Asn1Integer();
         requestedCCsUL_r13.decode (buffer, 2, 32);

         buffer.invokeCharacters(requestedCCsUL_r13.toString());
         buffer.getContext().eventDispatcher.endElement("requestedCCsUL_r13", -1);
      }
      else {
         requestedCCsUL_r13 = null;
      }

      // decode skipFallbackCombRequested_r13

      if (skipFallbackCombRequested_r13Present) {
         buffer.getContext().eventDispatcher.startElement("skipFallbackCombRequested_r13", -1);

         int tval = RF_Parameters_v1310_eNB_RequestedParameters_r13_skipFallbackCombRequested_r13.decodeEnumValue (buffer);
         skipFallbackCombRequested_r13 = RF_Parameters_v1310_eNB_RequestedParameters_r13_skipFallbackCombRequested_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("skipFallbackCombRequested_r13", -1);
      }
      else {
         skipFallbackCombRequested_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reducedIntNonContCombRequested_r13 != null) reducedIntNonContCombRequested_r13.print (_sb, "reducedIntNonContCombRequested_r13", _level+1);
      if (requestedCCsDL_r13 != null) requestedCCsDL_r13.print (_sb, "requestedCCsDL_r13", _level+1);
      if (requestedCCsUL_r13 != null) requestedCCsUL_r13.print (_sb, "requestedCCsUL_r13", _level+1);
      if (skipFallbackCombRequested_r13 != null) skipFallbackCombRequested_r13.print (_sb, "skipFallbackCombRequested_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
