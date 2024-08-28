/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class SCG_ConfigInfo_r12_criticalExtensions_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SCG_CONFIGINFO_R12 = 1;
   public final static byte _SPARE7 = 2;
   public final static byte _SPARE6 = 3;
   public final static byte _SPARE5 = 4;
   public final static byte _SPARE4 = 5;
   public final static byte _SPARE3 = 6;
   public final static byte _SPARE2 = 7;
   public final static byte _SPARE1 = 8;

   public SCG_ConfigInfo_r12_criticalExtensions_c1 () {
      super();
   }

   public SCG_ConfigInfo_r12_criticalExtensions_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SCG_CONFIGINFO_R12: return "scg_ConfigInfo_r12";
      case _SPARE7: return "spare7";
      case _SPARE6: return "spare6";
      case _SPARE5: return "spare5";
      case _SPARE4: return "spare4";
      case _SPARE3: return "spare3";
      case _SPARE2: return "spare2";
      case _SPARE1: return "spare1";
      default: return "UNDEFINED";
      }
   }

   public void set_scg_ConfigInfo_r12 (SCG_ConfigInfo_r12_IEs value) {
      setElement (_SCG_CONFIGINFO_R12, value);
   }

   public void set_spare7 () {
      setElement (_SPARE7, Asn1Null.NULL_VALUE);
   }

   public void set_spare6 () {
      setElement (_SPARE6, Asn1Null.NULL_VALUE);
   }

   public void set_spare5 () {
      setElement (_SPARE5, Asn1Null.NULL_VALUE);
   }

   public void set_spare4 () {
      setElement (_SPARE4, Asn1Null.NULL_VALUE);
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
      int idx = (int) buffer.decodeConsWholeNumber (8, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // scg_ConfigInfo_r12
         case 0: { 
            SCG_ConfigInfo_r12_IEs scg_ConfigInfo_r12;
            element = scg_ConfigInfo_r12 = new SCG_ConfigInfo_r12_IEs();
            scg_ConfigInfo_r12.decode (buffer);
            break;
         }

         // spare7
         case 1: { 
            Asn1Null spare7;
            element = spare7 = Asn1Null.NULL_VALUE;
            spare7.decode (buffer);

            buffer.invokeCharacters(spare7.toString());
            break;
         }

         // spare6
         case 2: { 
            Asn1Null spare6;
            element = spare6 = Asn1Null.NULL_VALUE;
            spare6.decode (buffer);

            buffer.invokeCharacters(spare6.toString());
            break;
         }

         // spare5
         case 3: { 
            Asn1Null spare5;
            element = spare5 = Asn1Null.NULL_VALUE;
            spare5.decode (buffer);

            buffer.invokeCharacters(spare5.toString());
            break;
         }

         // spare4
         case 4: { 
            Asn1Null spare4;
            element = spare4 = Asn1Null.NULL_VALUE;
            spare4.decode (buffer);

            buffer.invokeCharacters(spare4.toString());
            break;
         }

         // spare3
         case 5: { 
            Asn1Null spare3;
            element = spare3 = Asn1Null.NULL_VALUE;
            spare3.decode (buffer);

            buffer.invokeCharacters(spare3.toString());
            break;
         }

         // spare2
         case 6: { 
            Asn1Null spare2;
            element = spare2 = Asn1Null.NULL_VALUE;
            spare2.decode (buffer);

            buffer.invokeCharacters(spare2.toString());
            break;
         }

         // spare1
         case 7: { 
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
