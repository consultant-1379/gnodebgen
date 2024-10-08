/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class DynamicDLTransmissionInformation extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DynamicDLTransmissionInformation";
   }

   // Choice element identifier constants
   public final static byte _NAICS_ACTIVE = 1;
   public final static byte _NAICS_INACTIVE = 2;
   public final static byte _EXTELEM1 = 3;

   public DynamicDLTransmissionInformation () {
      super();
   }

   public DynamicDLTransmissionInformation (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NAICS_ACTIVE: return "naics_active";
      case _NAICS_INACTIVE: return "naics_inactive";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_naics_active (DynamicNAICSInformation value) {
      setElement (_NAICS_ACTIVE, value);
   }

   public void set_naics_inactive () {
      setElement (_NAICS_INACTIVE, Asn1Null.NULL_VALUE);
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
            // naics_active
            case 0: { 
               DynamicNAICSInformation naics_active;
               element = naics_active = new DynamicNAICSInformation();
               naics_active.decode (buffer);
               break;
            }

            // naics_inactive
            case 1: { 
               Asn1Null naics_inactive;
               element = naics_inactive = Asn1Null.NULL_VALUE;
               naics_inactive.decode (buffer);

               buffer.invokeCharacters(naics_inactive.toString());
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
