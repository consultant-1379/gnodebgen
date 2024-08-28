/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class MeasurementTimingConfiguration_criticalExtensions_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _MEASTIMINGCONF = 1;
   public final static byte _SPARE3 = 2;
   public final static byte _SPARE2 = 3;
   public final static byte _SPARE1 = 4;

   public MeasurementTimingConfiguration_criticalExtensions_c1 () {
      super();
   }

   public MeasurementTimingConfiguration_criticalExtensions_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _MEASTIMINGCONF: return "measTimingConf";
      case _SPARE3: return "spare3";
      case _SPARE2: return "spare2";
      case _SPARE1: return "spare1";
      default: return "UNDEFINED";
      }
   }

   public void set_measTimingConf (MeasurementTimingConfiguration_IEs value) {
      setElement (_MEASTIMINGCONF, value);
   }

   public void set_spare3 () {
      setElement (_SPARE3, Asn1Null.NULL_VALUE);
   }

   public void set_spare2 () {
      setElement (_SPARE2, Asn1Null.NULL_VALUE);
   }

   public void set_spare1 () {
      setElement (_SPARE1, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // measTimingConf
         case 0: { 
            MeasurementTimingConfiguration_IEs measTimingConf;
            element = measTimingConf = new MeasurementTimingConfiguration_IEs();
            measTimingConf.decode (buffer);
            break;
         }

         // spare3
         case 1: { 
            Asn1Null spare3;
            element = spare3 = Asn1Null.NULL_VALUE;
            spare3.decode (buffer);

            buffer.invokeCharacters(spare3.toString());
            break;
         }

         // spare2
         case 2: { 
            Asn1Null spare2;
            element = spare2 = Asn1Null.NULL_VALUE;
            spare2.decode (buffer);

            buffer.invokeCharacters(spare2.toString());
            break;
         }

         // spare1
         case 3: { 
            Asn1Null spare1;
            element = spare1 = Asn1Null.NULL_VALUE;
            spare1.decode (buffer);

            buffer.invokeCharacters(spare1.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 4, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // measTimingConf
         case _MEASTIMINGCONF:
            MeasurementTimingConfiguration_IEs measTimingConf = (MeasurementTimingConfiguration_IEs) element;
            measTimingConf.encode (buffer);
            break;

         // spare3
         case _SPARE3:
            Asn1Null spare3 = (Asn1Null) element;
            spare3.encode (buffer);
            break;

         // spare2
         case _SPARE2:
            Asn1Null spare2 = (Asn1Null) element;
            spare2.encode (buffer);
            break;

         // spare1
         case _SPARE1:
            Asn1Null spare1 = (Asn1Null) element;
            spare1.encode (buffer);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
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
