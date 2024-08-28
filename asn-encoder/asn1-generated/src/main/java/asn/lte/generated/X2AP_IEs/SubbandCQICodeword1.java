/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SubbandCQICodeword1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SubbandCQICodeword1";
   }

   // Choice element identifier constants
   public final static byte _FOUR_BITCQI = 1;
   public final static byte _THREE_BITSPATIALDIFFERENTIALCQI = 2;
   public final static byte _TWO_BITSUBBANDDIFFERENTIALCQI = 3;
   public final static byte _TWO_BITDIFFERENTIALCQI = 4;
   public final static byte _EXTELEM1 = 5;

   public SubbandCQICodeword1 () {
      super();
   }

   public SubbandCQICodeword1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _FOUR_BITCQI: return "four_bitCQI";
      case _THREE_BITSPATIALDIFFERENTIALCQI: return "three_bitSpatialDifferentialCQI";
      case _TWO_BITSUBBANDDIFFERENTIALCQI: return "two_bitSubbandDifferentialCQI";
      case _TWO_BITDIFFERENTIALCQI: return "two_bitDifferentialCQI";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_four_bitCQI (Asn1Integer value) {
      setElement (_FOUR_BITCQI, value);
   }

   public void set_three_bitSpatialDifferentialCQI (Asn1Integer value) {
      setElement (_THREE_BITSPATIALDIFFERENTIALCQI, value);
   }

   public void set_two_bitSubbandDifferentialCQI (Asn1Integer value) {
      setElement (_TWO_BITSUBBANDDIFFERENTIALCQI, value);
   }

   public void set_two_bitDifferentialCQI (Asn1Integer value) {
      setElement (_TWO_BITDIFFERENTIALCQI, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (4, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // four_bitCQI
            case 0: { 
               Asn1Integer four_bitCQI;
               element = four_bitCQI = new Asn1Integer();
               boolean extbit_1 = buffer.decodeBit ("extbit_1");
               if (!extbit_1) {
                  four_bitCQI.decode (buffer, 0, 15);
               }
               else {
                  four_bitCQI.decode (buffer);
               }

               buffer.invokeCharacters(four_bitCQI.toString());
               break;
            }

            // three_bitSpatialDifferentialCQI
            case 1: { 
               Asn1Integer three_bitSpatialDifferentialCQI;
               element = three_bitSpatialDifferentialCQI = new Asn1Integer();
               boolean extbit_2 = buffer.decodeBit ("extbit_2");
               if (!extbit_2) {
                  three_bitSpatialDifferentialCQI.decode (buffer, 0, 7);
               }
               else {
                  three_bitSpatialDifferentialCQI.decode (buffer);
               }

               buffer.invokeCharacters(three_bitSpatialDifferentialCQI.toString());
               break;
            }

            // two_bitSubbandDifferentialCQI
            case 2: { 
               Asn1Integer two_bitSubbandDifferentialCQI;
               element = two_bitSubbandDifferentialCQI = new Asn1Integer();
               boolean extbit_3 = buffer.decodeBit ("extbit_3");
               if (!extbit_3) {
                  two_bitSubbandDifferentialCQI.decode (buffer, 0, 3);
               }
               else {
                  two_bitSubbandDifferentialCQI.decode (buffer);
               }

               buffer.invokeCharacters(two_bitSubbandDifferentialCQI.toString());
               break;
            }

            // two_bitDifferentialCQI
            case 3: { 
               Asn1Integer two_bitDifferentialCQI;
               element = two_bitDifferentialCQI = new Asn1Integer();
               boolean extbit_4 = buffer.decodeBit ("extbit_4");
               if (!extbit_4) {
                  two_bitDifferentialCQI.decode (buffer, 0, 3);
               }
               else {
                  two_bitDifferentialCQI.decode (buffer);
               }

               buffer.invokeCharacters(two_bitDifferentialCQI.toString());
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 5;
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
