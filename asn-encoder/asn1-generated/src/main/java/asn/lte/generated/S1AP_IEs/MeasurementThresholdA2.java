/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class MeasurementThresholdA2 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasurementThresholdA2";
   }

   // Choice element identifier constants
   public final static byte _THRESHOLD_RSRP = 1;
   public final static byte _THRESHOLD_RSRQ = 2;
   public final static byte _EXTELEM1 = 3;

   public MeasurementThresholdA2 () {
      super();
   }

   public MeasurementThresholdA2 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _THRESHOLD_RSRP: return "threshold_RSRP";
      case _THRESHOLD_RSRQ: return "threshold_RSRQ";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_threshold_RSRP (Threshold_RSRP value) {
      setElement (_THRESHOLD_RSRP, value);
   }

   public void set_threshold_RSRQ (Threshold_RSRQ value) {
      setElement (_THRESHOLD_RSRQ, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (2, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // threshold_RSRP
            case 0: { 
               Threshold_RSRP threshold_RSRP;
               element = threshold_RSRP = new Threshold_RSRP();
               threshold_RSRP.decode (buffer);
               break;
            }

            // threshold_RSRQ
            case 1: { 
               Threshold_RSRQ threshold_RSRQ;
               element = threshold_RSRQ = new Threshold_RSRQ();
               threshold_RSRQ.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 3;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
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
