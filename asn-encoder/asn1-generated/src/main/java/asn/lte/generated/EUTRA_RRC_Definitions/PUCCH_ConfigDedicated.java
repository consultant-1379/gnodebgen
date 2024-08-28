/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_ConfigDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUCCH-ConfigDedicated";
   }

   public PUCCH_ConfigDedicated_ackNackRepetition ackNackRepetition;
   public PUCCH_ConfigDedicated_tdd_AckNackFeedbackMode tdd_AckNackFeedbackMode = null;  // optional

   public PUCCH_ConfigDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUCCH_ConfigDedicated (
      PUCCH_ConfigDedicated_ackNackRepetition ackNackRepetition_,
      PUCCH_ConfigDedicated_tdd_AckNackFeedbackMode tdd_AckNackFeedbackMode_
   ) {
      super();
      ackNackRepetition = ackNackRepetition_;
      tdd_AckNackFeedbackMode = tdd_AckNackFeedbackMode_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PUCCH_ConfigDedicated (
      PUCCH_ConfigDedicated_ackNackRepetition ackNackRepetition_
   ) {
      super();
      ackNackRepetition = ackNackRepetition_;
   }

   public void init () {
      ackNackRepetition = null;
      tdd_AckNackFeedbackMode = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ackNackRepetition;
         case 1: return tdd_AckNackFeedbackMode;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ackNackRepetition";
         case 1: return "tdd-AckNackFeedbackMode";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tdd_AckNackFeedbackModePresent = buffer.decodeBit ("tdd_AckNackFeedbackModePresent");

      // decode ackNackRepetition

      buffer.getContext().eventDispatcher.startElement("ackNackRepetition", -1);

      ackNackRepetition = new PUCCH_ConfigDedicated_ackNackRepetition();
      ackNackRepetition.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ackNackRepetition", -1);

      // decode tdd_AckNackFeedbackMode

      if (tdd_AckNackFeedbackModePresent) {
         buffer.getContext().eventDispatcher.startElement("tdd_AckNackFeedbackMode", -1);

         int tval = PUCCH_ConfigDedicated_tdd_AckNackFeedbackMode.decodeEnumValue (buffer);
         tdd_AckNackFeedbackMode = PUCCH_ConfigDedicated_tdd_AckNackFeedbackMode.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tdd_AckNackFeedbackMode", -1);
      }
      else {
         tdd_AckNackFeedbackMode = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ackNackRepetition != null) ackNackRepetition.print (_sb, "ackNackRepetition", _level+1);
      if (tdd_AckNackFeedbackMode != null) tdd_AckNackFeedbackMode.print (_sb, "tdd_AckNackFeedbackMode", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
