/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscTxResourcesInterFreq_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-DiscTxResourcesInterFreq-r13";
   }

   // Choice element identifier constants
   public final static byte _ACQUIRESI_FROMCARRIER_R13 = 1;
   public final static byte _DISCTXPOOLCOMMON_R13 = 2;
   public final static byte _REQUESTDEDICATED_R13 = 3;
   public final static byte _NOTXONCARRIER_R13 = 4;

   public SL_DiscTxResourcesInterFreq_r13 () {
      super();
   }

   public SL_DiscTxResourcesInterFreq_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ACQUIRESI_FROMCARRIER_R13: return "acquireSI_FromCarrier_r13";
      case _DISCTXPOOLCOMMON_R13: return "discTxPoolCommon_r13";
      case _REQUESTDEDICATED_R13: return "requestDedicated_r13";
      case _NOTXONCARRIER_R13: return "noTxOnCarrier_r13";
      default: return "UNDEFINED";
      }
   }

   public void set_acquireSI_FromCarrier_r13 () {
      setElement (_ACQUIRESI_FROMCARRIER_R13, Asn1Null.NULL_VALUE);
   }

   public void set_discTxPoolCommon_r13 (SL_DiscTxPoolList_r12 value) {
      setElement (_DISCTXPOOLCOMMON_R13, value);
   }

   public void set_requestDedicated_r13 () {
      setElement (_REQUESTDEDICATED_R13, Asn1Null.NULL_VALUE);
   }

   public void set_noTxOnCarrier_r13 () {
      setElement (_NOTXONCARRIER_R13, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // acquireSI_FromCarrier_r13
         case 0: { 
            Asn1Null acquireSI_FromCarrier_r13;
            element = acquireSI_FromCarrier_r13 = Asn1Null.NULL_VALUE;
            acquireSI_FromCarrier_r13.decode (buffer);

            buffer.invokeCharacters(acquireSI_FromCarrier_r13.toString());
            break;
         }

         // discTxPoolCommon_r13
         case 1: { 
            SL_DiscTxPoolList_r12 discTxPoolCommon_r13;
            element = discTxPoolCommon_r13 = new SL_DiscTxPoolList_r12();
            discTxPoolCommon_r13.decode (buffer);
            break;
         }

         // requestDedicated_r13
         case 2: { 
            Asn1Null requestDedicated_r13;
            element = requestDedicated_r13 = Asn1Null.NULL_VALUE;
            requestDedicated_r13.decode (buffer);

            buffer.invokeCharacters(requestDedicated_r13.toString());
            break;
         }

         // noTxOnCarrier_r13
         case 3: { 
            Asn1Null noTxOnCarrier_r13;
            element = noTxOnCarrier_r13 = Asn1Null.NULL_VALUE;
            noTxOnCarrier_r13.decode (buffer);

            buffer.invokeCharacters(noTxOnCarrier_r13.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
