/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Config_NB_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RLC-Config-NB-r13";
   }

   // Choice element identifier constants
   public final static byte _AM = 1;
   public final static byte _UM_BI_DIRECTIONAL_R15 = 2;
   public final static byte _UM_UNI_DIRECTIONAL_UL_R15 = 3;
   public final static byte _UM_UNI_DIRECTIONAL_DL_R15 = 4;
   public final static byte _EXTELEM1 = 5;

   public RLC_Config_NB_r13 () {
      super();
   }

   public RLC_Config_NB_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _AM: return "am";
      case _UM_BI_DIRECTIONAL_R15: return "um_Bi_Directional_r15";
      case _UM_UNI_DIRECTIONAL_UL_R15: return "um_Uni_Directional_UL_r15";
      case _UM_UNI_DIRECTIONAL_DL_R15: return "um_Uni_Directional_DL_r15";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_am (RLC_Config_NB_r13_am value) {
      setElement (_AM, value);
   }

   public void set_um_Bi_Directional_r15 () {
      setElement (_UM_BI_DIRECTIONAL_R15, Asn1Null.NULL_VALUE);
   }

   public void set_um_Uni_Directional_UL_r15 () {
      setElement (_UM_UNI_DIRECTIONAL_UL_R15, Asn1Null.NULL_VALUE);
   }

   public void set_um_Uni_Directional_DL_r15 () {
      setElement (_UM_UNI_DIRECTIONAL_DL_R15, Asn1Null.NULL_VALUE);
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
            // am
            case 0: { 
               RLC_Config_NB_r13_am am;
               element = am = new RLC_Config_NB_r13_am();
               am.decode (buffer);
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
            // um_Bi_Directional_r15
            case 0: { 
               Asn1Null um_Bi_Directional_r15;
               element = um_Bi_Directional_r15 = Asn1Null.NULL_VALUE;
               um_Bi_Directional_r15.decode (buffer);

               buffer.invokeCharacters(um_Bi_Directional_r15.toString());
               break;
            }

            // um_Uni_Directional_UL_r15
            case 1: { 
               Asn1Null um_Uni_Directional_UL_r15;
               element = um_Uni_Directional_UL_r15 = Asn1Null.NULL_VALUE;
               um_Uni_Directional_UL_r15.decode (buffer);

               buffer.invokeCharacters(um_Uni_Directional_UL_r15.toString());
               break;
            }

            // um_Uni_Directional_DL_r15
            case 2: { 
               Asn1Null um_Uni_Directional_DL_r15;
               element = um_Uni_Directional_DL_r15 = Asn1Null.NULL_VALUE;
               um_Uni_Directional_DL_r15.decode (buffer);

               buffer.invokeCharacters(um_Uni_Directional_DL_r15.toString());
               break;
            }

            // extElem1
            case 3: { 
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
