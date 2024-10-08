/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportConfig_reportFreqConfiguration_csi_ReportingBand extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SUBBANDS3 = 1;
   public final static byte _SUBBANDS4 = 2;
   public final static byte _SUBBANDS5 = 3;
   public final static byte _SUBBANDS6 = 4;
   public final static byte _SUBBANDS7 = 5;
   public final static byte _SUBBANDS8 = 6;
   public final static byte _SUBBANDS9 = 7;
   public final static byte _SUBBANDS10 = 8;
   public final static byte _SUBBANDS11 = 9;
   public final static byte _SUBBANDS12 = 10;
   public final static byte _SUBBANDS13 = 11;
   public final static byte _SUBBANDS14 = 12;
   public final static byte _SUBBANDS15 = 13;
   public final static byte _SUBBANDS16 = 14;
   public final static byte _SUBBANDS17 = 15;
   public final static byte _SUBBANDS18 = 16;
   public final static byte _SUBBANDS19_V1530 = 17;
   public final static byte _EXTELEM1 = 18;

   public CSI_ReportConfig_reportFreqConfiguration_csi_ReportingBand () {
      super();
   }

   public CSI_ReportConfig_reportFreqConfiguration_csi_ReportingBand (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SUBBANDS3: return "subbands3";
      case _SUBBANDS4: return "subbands4";
      case _SUBBANDS5: return "subbands5";
      case _SUBBANDS6: return "subbands6";
      case _SUBBANDS7: return "subbands7";
      case _SUBBANDS8: return "subbands8";
      case _SUBBANDS9: return "subbands9";
      case _SUBBANDS10: return "subbands10";
      case _SUBBANDS11: return "subbands11";
      case _SUBBANDS12: return "subbands12";
      case _SUBBANDS13: return "subbands13";
      case _SUBBANDS14: return "subbands14";
      case _SUBBANDS15: return "subbands15";
      case _SUBBANDS16: return "subbands16";
      case _SUBBANDS17: return "subbands17";
      case _SUBBANDS18: return "subbands18";
      case _SUBBANDS19_V1530: return "subbands19_v1530";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_subbands3 (Asn1BitString value) {
      setElement (_SUBBANDS3, value);
   }

   public void set_subbands4 (Asn1BitString value) {
      setElement (_SUBBANDS4, value);
   }

   public void set_subbands5 (Asn1BitString value) {
      setElement (_SUBBANDS5, value);
   }

   public void set_subbands6 (Asn1BitString value) {
      setElement (_SUBBANDS6, value);
   }

   public void set_subbands7 (Asn1BitString value) {
      setElement (_SUBBANDS7, value);
   }

   public void set_subbands8 (Asn1BitString value) {
      setElement (_SUBBANDS8, value);
   }

   public void set_subbands9 (Asn1BitString value) {
      setElement (_SUBBANDS9, value);
   }

   public void set_subbands10 (Asn1BitString value) {
      setElement (_SUBBANDS10, value);
   }

   public void set_subbands11 (Asn1BitString value) {
      setElement (_SUBBANDS11, value);
   }

   public void set_subbands12 (Asn1BitString value) {
      setElement (_SUBBANDS12, value);
   }

   public void set_subbands13 (Asn1BitString value) {
      setElement (_SUBBANDS13, value);
   }

   public void set_subbands14 (Asn1BitString value) {
      setElement (_SUBBANDS14, value);
   }

   public void set_subbands15 (Asn1BitString value) {
      setElement (_SUBBANDS15, value);
   }

   public void set_subbands16 (Asn1BitString value) {
      setElement (_SUBBANDS16, value);
   }

   public void set_subbands17 (Asn1BitString value) {
      setElement (_SUBBANDS17, value);
   }

   public void set_subbands18 (Asn1BitString value) {
      setElement (_SUBBANDS18, value);
   }

   public void set_subbands19_v1530 (Asn1BitString value) {
      setElement (_SUBBANDS19_V1530, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (16, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // subbands3
            case 0: { 
               Asn1BitString subbands3;
               element = subbands3 = new Asn1BitString();
               subbands3.decode (buffer, 3, 3);

               buffer.invokeCharacters(subbands3.toString());
               break;
            }

            // subbands4
            case 1: { 
               Asn1BitString subbands4;
               element = subbands4 = new Asn1BitString();
               subbands4.decode (buffer, 4, 4);

               buffer.invokeCharacters(subbands4.toString());
               break;
            }

            // subbands5
            case 2: { 
               Asn1BitString subbands5;
               element = subbands5 = new Asn1BitString();
               subbands5.decode (buffer, 5, 5);

               buffer.invokeCharacters(subbands5.toString());
               break;
            }

            // subbands6
            case 3: { 
               Asn1BitString subbands6;
               element = subbands6 = new Asn1BitString();
               subbands6.decode (buffer, 6, 6);

               buffer.invokeCharacters(subbands6.toString());
               break;
            }

            // subbands7
            case 4: { 
               Asn1BitString subbands7;
               element = subbands7 = new Asn1BitString();
               subbands7.decode (buffer, 7, 7);

               buffer.invokeCharacters(subbands7.toString());
               break;
            }

            // subbands8
            case 5: { 
               Asn1BitString subbands8;
               element = subbands8 = new Asn1BitString();
               subbands8.decode (buffer, 8, 8);

               buffer.invokeCharacters(subbands8.toString());
               break;
            }

            // subbands9
            case 6: { 
               Asn1BitString subbands9;
               element = subbands9 = new Asn1BitString();
               subbands9.decode (buffer, 9, 9);

               buffer.invokeCharacters(subbands9.toString());
               break;
            }

            // subbands10
            case 7: { 
               Asn1BitString subbands10;
               element = subbands10 = new Asn1BitString();
               subbands10.decode (buffer, 10, 10);

               buffer.invokeCharacters(subbands10.toString());
               break;
            }

            // subbands11
            case 8: { 
               Asn1BitString subbands11;
               element = subbands11 = new Asn1BitString();
               subbands11.decode (buffer, 11, 11);

               buffer.invokeCharacters(subbands11.toString());
               break;
            }

            // subbands12
            case 9: { 
               Asn1BitString subbands12;
               element = subbands12 = new Asn1BitString();
               subbands12.decode (buffer, 12, 12);

               buffer.invokeCharacters(subbands12.toString());
               break;
            }

            // subbands13
            case 10: { 
               Asn1BitString subbands13;
               element = subbands13 = new Asn1BitString();
               subbands13.decode (buffer, 13, 13);

               buffer.invokeCharacters(subbands13.toString());
               break;
            }

            // subbands14
            case 11: { 
               Asn1BitString subbands14;
               element = subbands14 = new Asn1BitString();
               subbands14.decode (buffer, 14, 14);

               buffer.invokeCharacters(subbands14.toString());
               break;
            }

            // subbands15
            case 12: { 
               Asn1BitString subbands15;
               element = subbands15 = new Asn1BitString();
               subbands15.decode (buffer, 15, 15);

               buffer.invokeCharacters(subbands15.toString());
               break;
            }

            // subbands16
            case 13: { 
               Asn1BitString subbands16;
               element = subbands16 = new Asn1BitString();
               subbands16.decode (buffer, 16, 16);

               buffer.invokeCharacters(subbands16.toString());
               break;
            }

            // subbands17
            case 14: { 
               Asn1BitString subbands17;
               element = subbands17 = new Asn1BitString();
               subbands17.decode (buffer, 17, 17);

               buffer.invokeCharacters(subbands17.toString());
               break;
            }

            // subbands18
            case 15: { 
               Asn1BitString subbands18;
               element = subbands18 = new Asn1BitString();
               subbands18.decode (buffer, 18, 18);

               buffer.invokeCharacters(subbands18.toString());
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 17;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // subbands19_v1530
            case 0: { 
               Asn1BitString subbands19_v1530;
               element = subbands19_v1530 = new Asn1BitString();
               subbands19_v1530.decode (buffer, 19, 19);

               buffer.invokeCharacters(subbands19_v1530.toString());
               break;
            }

            // extElem1
            case 1: { 
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

      boolean extbit = (choiceID > 16);
      buffer.encodeBit (extbit, "extbit");

      if (!extbit) {

         // Encode choice index value

         buffer.encodeConsWholeNumber (choiceID - 1, 16, "index");

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         switch (choiceID) {
            // subbands3
            case _SUBBANDS3:
               Asn1BitString subbands3 = (Asn1BitString) element;
               subbands3.encode (buffer, 3, 3);
               break;

            // subbands4
            case _SUBBANDS4:
               Asn1BitString subbands4 = (Asn1BitString) element;
               subbands4.encode (buffer, 4, 4);
               break;

            // subbands5
            case _SUBBANDS5:
               Asn1BitString subbands5 = (Asn1BitString) element;
               subbands5.encode (buffer, 5, 5);
               break;

            // subbands6
            case _SUBBANDS6:
               Asn1BitString subbands6 = (Asn1BitString) element;
               subbands6.encode (buffer, 6, 6);
               break;

            // subbands7
            case _SUBBANDS7:
               Asn1BitString subbands7 = (Asn1BitString) element;
               subbands7.encode (buffer, 7, 7);
               break;

            // subbands8
            case _SUBBANDS8:
               Asn1BitString subbands8 = (Asn1BitString) element;
               subbands8.encode (buffer, 8, 8);
               break;

            // subbands9
            case _SUBBANDS9:
               Asn1BitString subbands9 = (Asn1BitString) element;
               subbands9.encode (buffer, 9, 9);
               break;

            // subbands10
            case _SUBBANDS10:
               Asn1BitString subbands10 = (Asn1BitString) element;
               subbands10.encode (buffer, 10, 10);
               break;

            // subbands11
            case _SUBBANDS11:
               Asn1BitString subbands11 = (Asn1BitString) element;
               subbands11.encode (buffer, 11, 11);
               break;

            // subbands12
            case _SUBBANDS12:
               Asn1BitString subbands12 = (Asn1BitString) element;
               subbands12.encode (buffer, 12, 12);
               break;

            // subbands13
            case _SUBBANDS13:
               Asn1BitString subbands13 = (Asn1BitString) element;
               subbands13.encode (buffer, 13, 13);
               break;

            // subbands14
            case _SUBBANDS14:
               Asn1BitString subbands14 = (Asn1BitString) element;
               subbands14.encode (buffer, 14, 14);
               break;

            // subbands15
            case _SUBBANDS15:
               Asn1BitString subbands15 = (Asn1BitString) element;
               subbands15.encode (buffer, 15, 15);
               break;

            // subbands16
            case _SUBBANDS16:
               Asn1BitString subbands16 = (Asn1BitString) element;
               subbands16.encode (buffer, 16, 16);
               break;

            // subbands17
            case _SUBBANDS17:
               Asn1BitString subbands17 = (Asn1BitString) element;
               subbands17.encode (buffer, 17, 17);
               break;

            // subbands18
            case _SUBBANDS18:
               Asn1BitString subbands18 = (Asn1BitString) element;
               subbands18.encode (buffer, 18, 18);
               break;

            default:
            throw new Asn1InvalidChoiceOptionException();
         }
      }
      else {
         // Encode extension choice index value

         buffer.encodeSmallNonNegWholeNumber (choiceID - 17);

         // Encode extension element data value

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         Asn1PerEncodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());
         Asn1OpenType openType;

         switch (choiceID) {
            // subbands19_v1530
            case _SUBBANDS19_V1530:
               Asn1BitString subbands19_v1530 = (Asn1BitString) element;
               subbands19_v1530.encode (buffer, 19, 19);
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
