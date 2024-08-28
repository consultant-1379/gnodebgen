/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectToAddMod_measObject extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _MEASOBJECTEUTRA = 1;
   public final static byte _MEASOBJECTUTRA = 2;
   public final static byte _MEASOBJECTGERAN = 3;
   public final static byte _MEASOBJECTCDMA2000 = 4;
   public final static byte _MEASOBJECTWLAN_R13 = 5;
   public final static byte _MEASOBJECTNR_R15 = 6;
   public final static byte _EXTELEM1 = 7;

   public MeasObjectToAddMod_measObject () {
      super();
   }

   public MeasObjectToAddMod_measObject (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _MEASOBJECTEUTRA: return "measObjectEUTRA";
      case _MEASOBJECTUTRA: return "measObjectUTRA";
      case _MEASOBJECTGERAN: return "measObjectGERAN";
      case _MEASOBJECTCDMA2000: return "measObjectCDMA2000";
      case _MEASOBJECTWLAN_R13: return "measObjectWLAN_r13";
      case _MEASOBJECTNR_R15: return "measObjectNR_r15";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_measObjectEUTRA (MeasObjectEUTRA value) {
      setElement (_MEASOBJECTEUTRA, value);
   }

   public void set_measObjectUTRA (MeasObjectUTRA value) {
      setElement (_MEASOBJECTUTRA, value);
   }

   public void set_measObjectGERAN (MeasObjectGERAN value) {
      setElement (_MEASOBJECTGERAN, value);
   }

   public void set_measObjectCDMA2000 (MeasObjectCDMA2000 value) {
      setElement (_MEASOBJECTCDMA2000, value);
   }

   public void set_measObjectWLAN_r13 (MeasObjectWLAN_r13 value) {
      setElement (_MEASOBJECTWLAN_R13, value);
   }

   public void set_measObjectNR_r15 (MeasObjectNR_r15 value) {
      setElement (_MEASOBJECTNR_R15, value);
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
            // measObjectEUTRA
            case 0: { 
               MeasObjectEUTRA measObjectEUTRA;
               element = measObjectEUTRA = new MeasObjectEUTRA();
               measObjectEUTRA.decode (buffer);
               break;
            }

            // measObjectUTRA
            case 1: { 
               MeasObjectUTRA measObjectUTRA;
               element = measObjectUTRA = new MeasObjectUTRA();
               measObjectUTRA.decode (buffer);
               break;
            }

            // measObjectGERAN
            case 2: { 
               MeasObjectGERAN measObjectGERAN;
               element = measObjectGERAN = new MeasObjectGERAN();
               measObjectGERAN.decode (buffer);
               break;
            }

            // measObjectCDMA2000
            case 3: { 
               MeasObjectCDMA2000 measObjectCDMA2000;
               element = measObjectCDMA2000 = new MeasObjectCDMA2000();
               measObjectCDMA2000.decode (buffer);
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

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // measObjectWLAN_r13
            case 0: { 
               MeasObjectWLAN_r13 measObjectWLAN_r13;
               element = measObjectWLAN_r13 = new MeasObjectWLAN_r13();
               measObjectWLAN_r13.decode (buffer);
               break;
            }

            // measObjectNR_r15
            case 1: { 
               MeasObjectNR_r15 measObjectNR_r15;
               element = measObjectNR_r15 = new MeasObjectNR_r15();
               measObjectNR_r15.decode (buffer);
               break;
            }

            // extElem1
            case 2: { 
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
