/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PRACH_ParametersCE_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PRACH-ParametersCE-r13";
   }

   public Asn1Integer prach_ConfigIndex_r13;
   public Asn1Integer prach_FreqOffset_r13;
   public PRACH_ParametersCE_r13_prach_StartingSubframe_r13 prach_StartingSubframe_r13 = null;  // optional
   public PRACH_ParametersCE_r13_maxNumPreambleAttemptCE_r13 maxNumPreambleAttemptCE_r13 = null;  // optional
   public PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13 numRepetitionPerPreambleAttempt_r13 = null;
   public PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13 mpdcch_NarrowbandsToMonitor_r13;
   public PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13 mpdcch_NumRepetition_RA_r13 = null;
   public PRACH_ParametersCE_r13_prach_HoppingConfig_r13 prach_HoppingConfig_r13 = null;

   public PRACH_ParametersCE_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PRACH_ParametersCE_r13 (
      Asn1Integer prach_ConfigIndex_r13_,
      Asn1Integer prach_FreqOffset_r13_,
      PRACH_ParametersCE_r13_prach_StartingSubframe_r13 prach_StartingSubframe_r13_,
      PRACH_ParametersCE_r13_maxNumPreambleAttemptCE_r13 maxNumPreambleAttemptCE_r13_,
      PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13 numRepetitionPerPreambleAttempt_r13_,
      PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13 mpdcch_NarrowbandsToMonitor_r13_,
      PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13 mpdcch_NumRepetition_RA_r13_,
      PRACH_ParametersCE_r13_prach_HoppingConfig_r13 prach_HoppingConfig_r13_
   ) {
      super();
      prach_ConfigIndex_r13 = prach_ConfigIndex_r13_;
      prach_FreqOffset_r13 = prach_FreqOffset_r13_;
      prach_StartingSubframe_r13 = prach_StartingSubframe_r13_;
      maxNumPreambleAttemptCE_r13 = maxNumPreambleAttemptCE_r13_;
      numRepetitionPerPreambleAttempt_r13 = numRepetitionPerPreambleAttempt_r13_;
      mpdcch_NarrowbandsToMonitor_r13 = mpdcch_NarrowbandsToMonitor_r13_;
      mpdcch_NumRepetition_RA_r13 = mpdcch_NumRepetition_RA_r13_;
      prach_HoppingConfig_r13 = prach_HoppingConfig_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PRACH_ParametersCE_r13 (
      Asn1Integer prach_ConfigIndex_r13_,
      Asn1Integer prach_FreqOffset_r13_,
      PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13 numRepetitionPerPreambleAttempt_r13_,
      PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13 mpdcch_NarrowbandsToMonitor_r13_,
      PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13 mpdcch_NumRepetition_RA_r13_,
      PRACH_ParametersCE_r13_prach_HoppingConfig_r13 prach_HoppingConfig_r13_
   ) {
      super();
      prach_ConfigIndex_r13 = prach_ConfigIndex_r13_;
      prach_FreqOffset_r13 = prach_FreqOffset_r13_;
      numRepetitionPerPreambleAttempt_r13 = numRepetitionPerPreambleAttempt_r13_;
      mpdcch_NarrowbandsToMonitor_r13 = mpdcch_NarrowbandsToMonitor_r13_;
      mpdcch_NumRepetition_RA_r13 = mpdcch_NumRepetition_RA_r13_;
      prach_HoppingConfig_r13 = prach_HoppingConfig_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PRACH_ParametersCE_r13 (long prach_ConfigIndex_r13_,
      long prach_FreqOffset_r13_,
      PRACH_ParametersCE_r13_prach_StartingSubframe_r13 prach_StartingSubframe_r13_,
      PRACH_ParametersCE_r13_maxNumPreambleAttemptCE_r13 maxNumPreambleAttemptCE_r13_,
      PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13 numRepetitionPerPreambleAttempt_r13_,
      PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13 mpdcch_NarrowbandsToMonitor_r13_,
      PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13 mpdcch_NumRepetition_RA_r13_,
      PRACH_ParametersCE_r13_prach_HoppingConfig_r13 prach_HoppingConfig_r13_
   ) {
      super();
      prach_ConfigIndex_r13 = new Asn1Integer (prach_ConfigIndex_r13_);
      prach_FreqOffset_r13 = new Asn1Integer (prach_FreqOffset_r13_);
      prach_StartingSubframe_r13 = prach_StartingSubframe_r13_;
      maxNumPreambleAttemptCE_r13 = maxNumPreambleAttemptCE_r13_;
      numRepetitionPerPreambleAttempt_r13 = numRepetitionPerPreambleAttempt_r13_;
      mpdcch_NarrowbandsToMonitor_r13 = mpdcch_NarrowbandsToMonitor_r13_;
      mpdcch_NumRepetition_RA_r13 = mpdcch_NumRepetition_RA_r13_;
      prach_HoppingConfig_r13 = prach_HoppingConfig_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PRACH_ParametersCE_r13 (
      long prach_ConfigIndex_r13_,
      long prach_FreqOffset_r13_,
      PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13 numRepetitionPerPreambleAttempt_r13_,
      PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13 mpdcch_NarrowbandsToMonitor_r13_,
      PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13 mpdcch_NumRepetition_RA_r13_,
      PRACH_ParametersCE_r13_prach_HoppingConfig_r13 prach_HoppingConfig_r13_
   ) {
      super();
      prach_ConfigIndex_r13 = new Asn1Integer (prach_ConfigIndex_r13_);
      prach_FreqOffset_r13 = new Asn1Integer (prach_FreqOffset_r13_);
      numRepetitionPerPreambleAttempt_r13 = numRepetitionPerPreambleAttempt_r13_;
      mpdcch_NarrowbandsToMonitor_r13 = mpdcch_NarrowbandsToMonitor_r13_;
      mpdcch_NumRepetition_RA_r13 = mpdcch_NumRepetition_RA_r13_;
      prach_HoppingConfig_r13 = prach_HoppingConfig_r13_;
   }

   public void init () {
      prach_ConfigIndex_r13 = null;
      prach_FreqOffset_r13 = null;
      prach_StartingSubframe_r13 = null;
      maxNumPreambleAttemptCE_r13 = null;
      numRepetitionPerPreambleAttempt_r13 = null;
      mpdcch_NarrowbandsToMonitor_r13 = null;
      mpdcch_NumRepetition_RA_r13 = null;
      prach_HoppingConfig_r13 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return prach_ConfigIndex_r13;
         case 1: return prach_FreqOffset_r13;
         case 2: return prach_StartingSubframe_r13;
         case 3: return maxNumPreambleAttemptCE_r13;
         case 4: return numRepetitionPerPreambleAttempt_r13;
         case 5: return mpdcch_NarrowbandsToMonitor_r13;
         case 6: return mpdcch_NumRepetition_RA_r13;
         case 7: return prach_HoppingConfig_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "prach-ConfigIndex-r13";
         case 1: return "prach-FreqOffset-r13";
         case 2: return "prach-StartingSubframe-r13";
         case 3: return "maxNumPreambleAttemptCE-r13";
         case 4: return "numRepetitionPerPreambleAttempt-r13";
         case 5: return "mpdcch-NarrowbandsToMonitor-r13";
         case 6: return "mpdcch-NumRepetition-RA-r13";
         case 7: return "prach-HoppingConfig-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean prach_StartingSubframe_r13Present = buffer.decodeBit ("prach_StartingSubframe_r13Present");
      boolean maxNumPreambleAttemptCE_r13Present = buffer.decodeBit ("maxNumPreambleAttemptCE_r13Present");

      // decode prach_ConfigIndex_r13

      buffer.getContext().eventDispatcher.startElement("prach_ConfigIndex_r13", -1);

      prach_ConfigIndex_r13 = new Asn1Integer();
      prach_ConfigIndex_r13.decode (buffer, 0, 63);

      buffer.invokeCharacters(prach_ConfigIndex_r13.toString());
      buffer.getContext().eventDispatcher.endElement("prach_ConfigIndex_r13", -1);

      // decode prach_FreqOffset_r13

      buffer.getContext().eventDispatcher.startElement("prach_FreqOffset_r13", -1);

      prach_FreqOffset_r13 = new Asn1Integer();
      prach_FreqOffset_r13.decode (buffer, 0, 94);

      buffer.invokeCharacters(prach_FreqOffset_r13.toString());
      buffer.getContext().eventDispatcher.endElement("prach_FreqOffset_r13", -1);

      // decode prach_StartingSubframe_r13

      if (prach_StartingSubframe_r13Present) {
         buffer.getContext().eventDispatcher.startElement("prach_StartingSubframe_r13", -1);

         int tval = PRACH_ParametersCE_r13_prach_StartingSubframe_r13.decodeEnumValue (buffer);
         prach_StartingSubframe_r13 = PRACH_ParametersCE_r13_prach_StartingSubframe_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("prach_StartingSubframe_r13", -1);
      }
      else {
         prach_StartingSubframe_r13 = null;
      }

      // decode maxNumPreambleAttemptCE_r13

      if (maxNumPreambleAttemptCE_r13Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumPreambleAttemptCE_r13", -1);

         int tval = PRACH_ParametersCE_r13_maxNumPreambleAttemptCE_r13.decodeEnumValue (buffer);
         maxNumPreambleAttemptCE_r13 = PRACH_ParametersCE_r13_maxNumPreambleAttemptCE_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumPreambleAttemptCE_r13", -1);
      }
      else {
         maxNumPreambleAttemptCE_r13 = null;
      }

      // decode numRepetitionPerPreambleAttempt_r13

      buffer.getContext().eventDispatcher.startElement("numRepetitionPerPreambleAttempt_r13", -1);

      {
         int tval = PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13.decodeEnumValue (buffer);
         numRepetitionPerPreambleAttempt_r13 = PRACH_ParametersCE_r13_numRepetitionPerPreambleAttempt_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("numRepetitionPerPreambleAttempt_r13", -1);

      // decode mpdcch_NarrowbandsToMonitor_r13

      buffer.getContext().eventDispatcher.startElement("mpdcch_NarrowbandsToMonitor_r13", -1);

      mpdcch_NarrowbandsToMonitor_r13 = new PRACH_ParametersCE_r13_mpdcch_NarrowbandsToMonitor_r13();
      mpdcch_NarrowbandsToMonitor_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mpdcch_NarrowbandsToMonitor_r13", -1);

      // decode mpdcch_NumRepetition_RA_r13

      buffer.getContext().eventDispatcher.startElement("mpdcch_NumRepetition_RA_r13", -1);

      {
         int tval = PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13.decodeEnumValue (buffer);
         mpdcch_NumRepetition_RA_r13 = PRACH_ParametersCE_r13_mpdcch_NumRepetition_RA_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mpdcch_NumRepetition_RA_r13", -1);

      // decode prach_HoppingConfig_r13

      buffer.getContext().eventDispatcher.startElement("prach_HoppingConfig_r13", -1);

      {
         int tval = PRACH_ParametersCE_r13_prach_HoppingConfig_r13.decodeEnumValue (buffer);
         prach_HoppingConfig_r13 = PRACH_ParametersCE_r13_prach_HoppingConfig_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("prach_HoppingConfig_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (prach_ConfigIndex_r13 != null) prach_ConfigIndex_r13.print (_sb, "prach_ConfigIndex_r13", _level+1);
      if (prach_FreqOffset_r13 != null) prach_FreqOffset_r13.print (_sb, "prach_FreqOffset_r13", _level+1);
      if (prach_StartingSubframe_r13 != null) prach_StartingSubframe_r13.print (_sb, "prach_StartingSubframe_r13", _level+1);
      if (maxNumPreambleAttemptCE_r13 != null) maxNumPreambleAttemptCE_r13.print (_sb, "maxNumPreambleAttemptCE_r13", _level+1);
      if (numRepetitionPerPreambleAttempt_r13 != null) numRepetitionPerPreambleAttempt_r13.print (_sb, "numRepetitionPerPreambleAttempt_r13", _level+1);
      if (mpdcch_NarrowbandsToMonitor_r13 != null) mpdcch_NarrowbandsToMonitor_r13.print (_sb, "mpdcch_NarrowbandsToMonitor_r13", _level+1);
      if (mpdcch_NumRepetition_RA_r13 != null) mpdcch_NumRepetition_RA_r13.print (_sb, "mpdcch_NumRepetition_RA_r13", _level+1);
      if (prach_HoppingConfig_r13 != null) prach_HoppingConfig_r13.print (_sb, "prach_HoppingConfig_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
