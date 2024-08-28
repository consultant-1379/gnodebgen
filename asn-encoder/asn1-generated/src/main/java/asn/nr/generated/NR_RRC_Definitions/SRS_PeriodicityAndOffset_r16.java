/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_PeriodicityAndOffset_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-PeriodicityAndOffset-r16";
   }

   // Choice element identifier constants
   public final static byte _SL1 = 1;
   public final static byte _SL2 = 2;
   public final static byte _SL4 = 3;
   public final static byte _SL5 = 4;
   public final static byte _SL8 = 5;
   public final static byte _SL10 = 6;
   public final static byte _SL16 = 7;
   public final static byte _SL20 = 8;
   public final static byte _SL32 = 9;
   public final static byte _SL40 = 10;
   public final static byte _SL64 = 11;
   public final static byte _SL80 = 12;
   public final static byte _SL160 = 13;
   public final static byte _SL320 = 14;
   public final static byte _SL640 = 15;
   public final static byte _SL1280 = 16;
   public final static byte _SL2560 = 17;
   public final static byte _SL5120 = 18;
   public final static byte _SL10240 = 19;
   public final static byte _SL40960 = 20;
   public final static byte _SL81920 = 21;
   public final static byte _EXTELEM1 = 22;

   public SRS_PeriodicityAndOffset_r16 () {
      super();
   }

   public SRS_PeriodicityAndOffset_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SL1: return "sl1";
      case _SL2: return "sl2";
      case _SL4: return "sl4";
      case _SL5: return "sl5";
      case _SL8: return "sl8";
      case _SL10: return "sl10";
      case _SL16: return "sl16";
      case _SL20: return "sl20";
      case _SL32: return "sl32";
      case _SL40: return "sl40";
      case _SL64: return "sl64";
      case _SL80: return "sl80";
      case _SL160: return "sl160";
      case _SL320: return "sl320";
      case _SL640: return "sl640";
      case _SL1280: return "sl1280";
      case _SL2560: return "sl2560";
      case _SL5120: return "sl5120";
      case _SL10240: return "sl10240";
      case _SL40960: return "sl40960";
      case _SL81920: return "sl81920";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_sl1 () {
      setElement (_SL1, Asn1Null.NULL_VALUE);
   }

   public void set_sl2 (Asn1Integer value) {
      setElement (_SL2, value);
   }

   public void set_sl4 (Asn1Integer value) {
      setElement (_SL4, value);
   }

   public void set_sl5 (Asn1Integer value) {
      setElement (_SL5, value);
   }

   public void set_sl8 (Asn1Integer value) {
      setElement (_SL8, value);
   }

   public void set_sl10 (Asn1Integer value) {
      setElement (_SL10, value);
   }

   public void set_sl16 (Asn1Integer value) {
      setElement (_SL16, value);
   }

   public void set_sl20 (Asn1Integer value) {
      setElement (_SL20, value);
   }

   public void set_sl32 (Asn1Integer value) {
      setElement (_SL32, value);
   }

   public void set_sl40 (Asn1Integer value) {
      setElement (_SL40, value);
   }

   public void set_sl64 (Asn1Integer value) {
      setElement (_SL64, value);
   }

   public void set_sl80 (Asn1Integer value) {
      setElement (_SL80, value);
   }

   public void set_sl160 (Asn1Integer value) {
      setElement (_SL160, value);
   }

   public void set_sl320 (Asn1Integer value) {
      setElement (_SL320, value);
   }

   public void set_sl640 (Asn1Integer value) {
      setElement (_SL640, value);
   }

   public void set_sl1280 (Asn1Integer value) {
      setElement (_SL1280, value);
   }

   public void set_sl2560 (Asn1Integer value) {
      setElement (_SL2560, value);
   }

   public void set_sl5120 (Asn1Integer value) {
      setElement (_SL5120, value);
   }

   public void set_sl10240 (Asn1Integer value) {
      setElement (_SL10240, value);
   }

   public void set_sl40960 (Asn1Integer value) {
      setElement (_SL40960, value);
   }

   public void set_sl81920 (Asn1Integer value) {
      setElement (_SL81920, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (21, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // sl1
            case 0: { 
               Asn1Null sl1;
               element = sl1 = Asn1Null.NULL_VALUE;
               sl1.decode (buffer);

               buffer.invokeCharacters(sl1.toString());
               break;
            }

            // sl2
            case 1: { 
               Asn1Integer sl2;
               element = sl2 = new Asn1Integer();
               sl2.decode (buffer, 0, 1);

               buffer.invokeCharacters(sl2.toString());
               break;
            }

            // sl4
            case 2: { 
               Asn1Integer sl4;
               element = sl4 = new Asn1Integer();
               sl4.decode (buffer, 0, 3);

               buffer.invokeCharacters(sl4.toString());
               break;
            }

            // sl5
            case 3: { 
               Asn1Integer sl5;
               element = sl5 = new Asn1Integer();
               sl5.decode (buffer, 0, 4);

               buffer.invokeCharacters(sl5.toString());
               break;
            }

            // sl8
            case 4: { 
               Asn1Integer sl8;
               element = sl8 = new Asn1Integer();
               sl8.decode (buffer, 0, 7);

               buffer.invokeCharacters(sl8.toString());
               break;
            }

            // sl10
            case 5: { 
               Asn1Integer sl10;
               element = sl10 = new Asn1Integer();
               sl10.decode (buffer, 0, 9);

               buffer.invokeCharacters(sl10.toString());
               break;
            }

            // sl16
            case 6: { 
               Asn1Integer sl16;
               element = sl16 = new Asn1Integer();
               sl16.decode (buffer, 0, 15);

               buffer.invokeCharacters(sl16.toString());
               break;
            }

            // sl20
            case 7: { 
               Asn1Integer sl20;
               element = sl20 = new Asn1Integer();
               sl20.decode (buffer, 0, 19);

               buffer.invokeCharacters(sl20.toString());
               break;
            }

            // sl32
            case 8: { 
               Asn1Integer sl32;
               element = sl32 = new Asn1Integer();
               sl32.decode (buffer, 0, 31);

               buffer.invokeCharacters(sl32.toString());
               break;
            }

            // sl40
            case 9: { 
               Asn1Integer sl40;
               element = sl40 = new Asn1Integer();
               sl40.decode (buffer, 0, 39);

               buffer.invokeCharacters(sl40.toString());
               break;
            }

            // sl64
            case 10: { 
               Asn1Integer sl64;
               element = sl64 = new Asn1Integer();
               sl64.decode (buffer, 0, 63);

               buffer.invokeCharacters(sl64.toString());
               break;
            }

            // sl80
            case 11: { 
               Asn1Integer sl80;
               element = sl80 = new Asn1Integer();
               sl80.decode (buffer, 0, 79);

               buffer.invokeCharacters(sl80.toString());
               break;
            }

            // sl160
            case 12: { 
               Asn1Integer sl160;
               element = sl160 = new Asn1Integer();
               sl160.decode (buffer, 0, 159);

               buffer.invokeCharacters(sl160.toString());
               break;
            }

            // sl320
            case 13: { 
               Asn1Integer sl320;
               element = sl320 = new Asn1Integer();
               sl320.decode (buffer, 0, 319);

               buffer.invokeCharacters(sl320.toString());
               break;
            }

            // sl640
            case 14: { 
               Asn1Integer sl640;
               element = sl640 = new Asn1Integer();
               sl640.decode (buffer, 0, 639);

               buffer.invokeCharacters(sl640.toString());
               break;
            }

            // sl1280
            case 15: { 
               Asn1Integer sl1280;
               element = sl1280 = new Asn1Integer();
               sl1280.decode (buffer, 0, 1279);

               buffer.invokeCharacters(sl1280.toString());
               break;
            }

            // sl2560
            case 16: { 
               Asn1Integer sl2560;
               element = sl2560 = new Asn1Integer();
               sl2560.decode (buffer, 0, 2559);

               buffer.invokeCharacters(sl2560.toString());
               break;
            }

            // sl5120
            case 17: { 
               Asn1Integer sl5120;
               element = sl5120 = new Asn1Integer();
               sl5120.decode (buffer, 0, 5119);

               buffer.invokeCharacters(sl5120.toString());
               break;
            }

            // sl10240
            case 18: { 
               Asn1Integer sl10240;
               element = sl10240 = new Asn1Integer();
               sl10240.decode (buffer, 0, 10239);

               buffer.invokeCharacters(sl10240.toString());
               break;
            }

            // sl40960
            case 19: { 
               Asn1Integer sl40960;
               element = sl40960 = new Asn1Integer();
               sl40960.decode (buffer, 0, 40959);

               buffer.invokeCharacters(sl40960.toString());
               break;
            }

            // sl81920
            case 20: { 
               Asn1Integer sl81920;
               element = sl81920 = new Asn1Integer();
               sl81920.decode (buffer, 0, 81919);

               buffer.invokeCharacters(sl81920.toString());
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 22;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (choiceID > 21);
      buffer.encodeBit (extbit, "extbit");

      if (!extbit) {

         // Encode choice index value

         buffer.encodeConsWholeNumber (choiceID - 1, 21, "index");

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         switch (choiceID) {
            // sl1
            case _SL1:
               Asn1Null sl1 = (Asn1Null) element;
               sl1.encode (buffer);
               break;

            // sl2
            case _SL2:
               Asn1Integer sl2 = (Asn1Integer) element;
               sl2.encode (buffer, 0, 1);
               break;

            // sl4
            case _SL4:
               Asn1Integer sl4 = (Asn1Integer) element;
               sl4.encode (buffer, 0, 3);
               break;

            // sl5
            case _SL5:
               Asn1Integer sl5 = (Asn1Integer) element;
               sl5.encode (buffer, 0, 4);
               break;

            // sl8
            case _SL8:
               Asn1Integer sl8 = (Asn1Integer) element;
               sl8.encode (buffer, 0, 7);
               break;

            // sl10
            case _SL10:
               Asn1Integer sl10 = (Asn1Integer) element;
               sl10.encode (buffer, 0, 9);
               break;

            // sl16
            case _SL16:
               Asn1Integer sl16 = (Asn1Integer) element;
               sl16.encode (buffer, 0, 15);
               break;

            // sl20
            case _SL20:
               Asn1Integer sl20 = (Asn1Integer) element;
               sl20.encode (buffer, 0, 19);
               break;

            // sl32
            case _SL32:
               Asn1Integer sl32 = (Asn1Integer) element;
               sl32.encode (buffer, 0, 31);
               break;

            // sl40
            case _SL40:
               Asn1Integer sl40 = (Asn1Integer) element;
               sl40.encode (buffer, 0, 39);
               break;

            // sl64
            case _SL64:
               Asn1Integer sl64 = (Asn1Integer) element;
               sl64.encode (buffer, 0, 63);
               break;

            // sl80
            case _SL80:
               Asn1Integer sl80 = (Asn1Integer) element;
               sl80.encode (buffer, 0, 79);
               break;

            // sl160
            case _SL160:
               Asn1Integer sl160 = (Asn1Integer) element;
               sl160.encode (buffer, 0, 159);
               break;

            // sl320
            case _SL320:
               Asn1Integer sl320 = (Asn1Integer) element;
               sl320.encode (buffer, 0, 319);
               break;

            // sl640
            case _SL640:
               Asn1Integer sl640 = (Asn1Integer) element;
               sl640.encode (buffer, 0, 639);
               break;

            // sl1280
            case _SL1280:
               Asn1Integer sl1280 = (Asn1Integer) element;
               sl1280.encode (buffer, 0, 1279);
               break;

            // sl2560
            case _SL2560:
               Asn1Integer sl2560 = (Asn1Integer) element;
               sl2560.encode (buffer, 0, 2559);
               break;

            // sl5120
            case _SL5120:
               Asn1Integer sl5120 = (Asn1Integer) element;
               sl5120.encode (buffer, 0, 5119);
               break;

            // sl10240
            case _SL10240:
               Asn1Integer sl10240 = (Asn1Integer) element;
               sl10240.encode (buffer, 0, 10239);
               break;

            // sl40960
            case _SL40960:
               Asn1Integer sl40960 = (Asn1Integer) element;
               sl40960.encode (buffer, 0, 40959);
               break;

            // sl81920
            case _SL81920:
               Asn1Integer sl81920 = (Asn1Integer) element;
               sl81920.encode (buffer, 0, 81919);
               break;

            default:
            throw new Asn1InvalidChoiceOptionException();
         }
      }
      else {
         // Encode extension choice index value

         buffer.encodeSmallNonNegWholeNumber (choiceID - 22);

         // Encode extension element data value

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         Asn1OpenType openType = (Asn1OpenType) element;
         buffer.byteAlign();
         openType.encode (buffer);
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
