/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_Ericsson_Conveyor;

import com.objsys.asn1j.runtime.*;

public class S1AP_Ericsson_Data extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_Ericsson_ConveyorRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "S1AP-Ericsson-Data";
   }

   // Choice element identifier constants
   public final static byte _V0 = 1;
   public final static byte _EXTELEM1 = 2;

   public S1AP_Ericsson_Data () {
      super();
   }

   public S1AP_Ericsson_Data (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _V0: return "v0";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_v0 (S1AP_Ericsson_Data_v0 value) {
      setElement (_V0, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (1, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // v0
            case 0: { 
               S1AP_Ericsson_Data_v0 v0;
               element = v0 = new S1AP_Ericsson_Data_v0();
               v0.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 2;
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
