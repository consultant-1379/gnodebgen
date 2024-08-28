/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectToAddMod_measObject extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _MEASOBJECTNR = 1;
   public final static byte _MEASOBJECTEUTRA = 2;
   public final static byte _MEASOBJECTUTRA_FDD_R16 = 3;
   public final static byte _MEASOBJECTNR_SL_R16 = 4;
   public final static byte _MEASOBJECTCLI_R16 = 5;
   public final static byte _EXTELEM1 = 6;

   public MeasObjectToAddMod_measObject () {
      super();
   }

   public MeasObjectToAddMod_measObject (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _MEASOBJECTNR: return "measObjectNR";
      case _MEASOBJECTEUTRA: return "measObjectEUTRA";
      case _MEASOBJECTUTRA_FDD_R16: return "measObjectUTRA_FDD_r16";
      case _MEASOBJECTNR_SL_R16: return "measObjectNR_SL_r16";
      case _MEASOBJECTCLI_R16: return "measObjectCLI_r16";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_measObjectNR (MeasObjectNR value) {
      setElement (_MEASOBJECTNR, value);
   }

   public void set_measObjectEUTRA (MeasObjectEUTRA value) {
      setElement (_MEASOBJECTEUTRA, value);
   }

   public void set_measObjectUTRA_FDD_r16 (MeasObjectUTRA_FDD_r16 value) {
      setElement (_MEASOBJECTUTRA_FDD_R16, value);
   }

   public void set_measObjectNR_SL_r16 (MeasObjectNR_SL_r16 value) {
      setElement (_MEASOBJECTNR_SL_R16, value);
   }

   public void set_measObjectCLI_r16 (MeasObjectCLI_r16 value) {
      setElement (_MEASOBJECTCLI_R16, value);
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
            // measObjectNR
            case 0: { 
               MeasObjectNR measObjectNR;
               element = measObjectNR = new MeasObjectNR();
               measObjectNR.decode (buffer);
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

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // measObjectEUTRA
            case 0: { 
               MeasObjectEUTRA measObjectEUTRA;
               element = measObjectEUTRA = new MeasObjectEUTRA();
               measObjectEUTRA.decode (buffer);
               break;
            }

            // measObjectUTRA_FDD_r16
            case 1: { 
               MeasObjectUTRA_FDD_r16 measObjectUTRA_FDD_r16;
               element = measObjectUTRA_FDD_r16 = new MeasObjectUTRA_FDD_r16();
               measObjectUTRA_FDD_r16.decode (buffer);
               break;
            }

            // measObjectNR_SL_r16
            case 2: { 
               MeasObjectNR_SL_r16 measObjectNR_SL_r16;
               element = measObjectNR_SL_r16 = new MeasObjectNR_SL_r16();
               measObjectNR_SL_r16.decode (buffer);
               break;
            }

            // measObjectCLI_r16
            case 3: { 
               MeasObjectCLI_r16 measObjectCLI_r16;
               element = measObjectCLI_r16 = new MeasObjectCLI_r16();
               measObjectCLI_r16.decode (buffer);
               break;
            }

            // extElem1
            case 4: { 
               Asn1OpenType extElem1;
               element = extElem1 = new Asn1OpenType();
               extElem1.decode (buffer);

               buffer.invokeCharacters(extElem1.toString());
               break;
            }

            default:
               setElement (_EXTELEM1, openType);
               buffer.invokeCharacters (openType.toString());
         }

      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (choiceID > 1);
      buffer.encodeBit (extbit, "extbit");

      if (!extbit) {

         // Encode choice index value

         buffer.encodeConsWholeNumber (choiceID - 1, 1, "index");

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         switch (choiceID) {
            // measObjectNR
            case _MEASOBJECTNR:
               MeasObjectNR measObjectNR = (MeasObjectNR) element;
               measObjectNR.encode (buffer);
               break;

            default:
            throw new Asn1InvalidChoiceOptionException();
         }
      }
      else {
         // Encode extension choice index value

         buffer.encodeSmallNonNegWholeNumber (choiceID - 2);

         // Encode extension element data value

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         Asn1PerEncodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());
         Asn1OpenType openType;

         switch (choiceID) {
            // measObjectEUTRA
            case _MEASOBJECTEUTRA:
               MeasObjectEUTRA measObjectEUTRA = (MeasObjectEUTRA) element;
               measObjectEUTRA.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            // measObjectUTRA_FDD_r16
            case _MEASOBJECTUTRA_FDD_R16:
               MeasObjectUTRA_FDD_r16 measObjectUTRA_FDD_r16 = (MeasObjectUTRA_FDD_r16) element;
               measObjectUTRA_FDD_r16.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            // measObjectNR_SL_r16
            case _MEASOBJECTNR_SL_R16:
               MeasObjectNR_SL_r16 measObjectNR_SL_r16 = (MeasObjectNR_SL_r16) element;
               measObjectNR_SL_r16.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            // measObjectCLI_r16
            case _MEASOBJECTCLI_R16:
               MeasObjectCLI_r16 measObjectCLI_r16 = (MeasObjectCLI_r16) element;
               measObjectCLI_r16.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            default:
               openType = (Asn1OpenType)getElement();
         }

         buffer = savedBuffer;
         if (openType != null) {
            buffer.byteAlign();
            openType.encode (buffer);
         }
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
