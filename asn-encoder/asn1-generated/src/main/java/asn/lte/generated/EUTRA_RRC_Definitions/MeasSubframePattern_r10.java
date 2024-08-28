/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasSubframePattern_r10 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasSubframePattern-r10";
   }

   // Choice element identifier constants
   public final static byte _SUBFRAMEPATTERNFDD_R10 = 1;
   public final static byte _SUBFRAMEPATTERNTDD_R10 = 2;
   public final static byte _EXTELEM1 = 3;

   public MeasSubframePattern_r10 () {
      super();
   }

   public MeasSubframePattern_r10 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SUBFRAMEPATTERNFDD_R10: return "subframePatternFDD_r10";
      case _SUBFRAMEPATTERNTDD_R10: return "subframePatternTDD_r10";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_subframePatternFDD_r10 (Asn1BitString value) {
      setElement (_SUBFRAMEPATTERNFDD_R10, value);
   }

   public void set_subframePatternTDD_r10 (MeasSubframePattern_r10_subframePatternTDD_r10 value) {
      setElement (_SUBFRAMEPATTERNTDD_R10, value);
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
            // subframePatternFDD_r10
            case 0: { 
               Asn1BitString subframePatternFDD_r10;
               element = subframePatternFDD_r10 = new Asn1BitString();
               subframePatternFDD_r10.decode (buffer, 40, 40);

               buffer.invokeCharacters(subframePatternFDD_r10.toString());
               break;
            }

            // subframePatternTDD_r10
            case 1: { 
               MeasSubframePattern_r10_subframePatternTDD_r10 subframePatternTDD_r10;
               element = subframePatternTDD_r10 = new MeasSubframePattern_r10_subframePatternTDD_r10();
               subframePatternTDD_r10.decode (buffer);
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
