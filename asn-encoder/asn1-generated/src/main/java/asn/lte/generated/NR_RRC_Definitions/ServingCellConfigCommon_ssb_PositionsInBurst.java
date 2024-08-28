/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ServingCellConfigCommon_ssb_PositionsInBurst extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SHORTBITMAP = 1;
   public final static byte _MEDIUMBITMAP = 2;
   public final static byte _LONGBITMAP = 3;

   public ServingCellConfigCommon_ssb_PositionsInBurst () {
      super();
   }

   public ServingCellConfigCommon_ssb_PositionsInBurst (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SHORTBITMAP: return "shortBitmap";
      case _MEDIUMBITMAP: return "mediumBitmap";
      case _LONGBITMAP: return "longBitmap";
      default: return "UNDEFINED";
      }
   }

   public void set_shortBitmap (Asn1BitString value) {
      setElement (_SHORTBITMAP, value);
   }

   public void set_mediumBitmap (Asn1BitString value) {
      setElement (_MEDIUMBITMAP, value);
   }

   public void set_longBitmap (Asn1BitString value) {
      setElement (_LONGBITMAP, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // shortBitmap
         case 0: { 
            Asn1BitString shortBitmap;
            element = shortBitmap = new Asn1BitString();
            shortBitmap.decode (buffer, 4, 4);

            buffer.invokeCharacters(shortBitmap.toString());
            break;
         }

         // mediumBitmap
         case 1: { 
            Asn1BitString mediumBitmap;
            element = mediumBitmap = new Asn1BitString();
            mediumBitmap.decode (buffer, 8, 8);

            buffer.invokeCharacters(mediumBitmap.toString());
            break;
         }

         // longBitmap
         case 2: { 
            Asn1BitString longBitmap;
            element = longBitmap = new Asn1BitString();
            longBitmap.decode (buffer, 64, 64);

            buffer.invokeCharacters(longBitmap.toString());
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
