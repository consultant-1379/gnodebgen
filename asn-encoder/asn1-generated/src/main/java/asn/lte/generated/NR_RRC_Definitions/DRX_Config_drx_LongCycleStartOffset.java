/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_drx_LongCycleStartOffset extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _MS10 = 1;
   public final static byte _MS20 = 2;
   public final static byte _MS32 = 3;
   public final static byte _MS40 = 4;
   public final static byte _MS60 = 5;
   public final static byte _MS64 = 6;
   public final static byte _MS70 = 7;
   public final static byte _MS80 = 8;
   public final static byte _MS128 = 9;
   public final static byte _MS160 = 10;
   public final static byte _MS256 = 11;
   public final static byte _MS320 = 12;
   public final static byte _MS512 = 13;
   public final static byte _MS640 = 14;
   public final static byte _MS1024 = 15;
   public final static byte _MS1280 = 16;
   public final static byte _MS2048 = 17;
   public final static byte _MS2560 = 18;
   public final static byte _MS5120 = 19;
   public final static byte _MS10240 = 20;

   public DRX_Config_drx_LongCycleStartOffset () {
      super();
   }

   public DRX_Config_drx_LongCycleStartOffset (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _MS10: return "ms10";
      case _MS20: return "ms20";
      case _MS32: return "ms32";
      case _MS40: return "ms40";
      case _MS60: return "ms60";
      case _MS64: return "ms64";
      case _MS70: return "ms70";
      case _MS80: return "ms80";
      case _MS128: return "ms128";
      case _MS160: return "ms160";
      case _MS256: return "ms256";
      case _MS320: return "ms320";
      case _MS512: return "ms512";
      case _MS640: return "ms640";
      case _MS1024: return "ms1024";
      case _MS1280: return "ms1280";
      case _MS2048: return "ms2048";
      case _MS2560: return "ms2560";
      case _MS5120: return "ms5120";
      case _MS10240: return "ms10240";
      default: return "UNDEFINED";
      }
   }

   public void set_ms10 (Asn1Integer value) {
      setElement (_MS10, value);
   }

   public void set_ms20 (Asn1Integer value) {
      setElement (_MS20, value);
   }

   public void set_ms32 (Asn1Integer value) {
      setElement (_MS32, value);
   }

   public void set_ms40 (Asn1Integer value) {
      setElement (_MS40, value);
   }

   public void set_ms60 (Asn1Integer value) {
      setElement (_MS60, value);
   }

   public void set_ms64 (Asn1Integer value) {
      setElement (_MS64, value);
   }

   public void set_ms70 (Asn1Integer value) {
      setElement (_MS70, value);
   }

   public void set_ms80 (Asn1Integer value) {
      setElement (_MS80, value);
   }

   public void set_ms128 (Asn1Integer value) {
      setElement (_MS128, value);
   }

   public void set_ms160 (Asn1Integer value) {
      setElement (_MS160, value);
   }

   public void set_ms256 (Asn1Integer value) {
      setElement (_MS256, value);
   }

   public void set_ms320 (Asn1Integer value) {
      setElement (_MS320, value);
   }

   public void set_ms512 (Asn1Integer value) {
      setElement (_MS512, value);
   }

   public void set_ms640 (Asn1Integer value) {
      setElement (_MS640, value);
   }

   public void set_ms1024 (Asn1Integer value) {
      setElement (_MS1024, value);
   }

   public void set_ms1280 (Asn1Integer value) {
      setElement (_MS1280, value);
   }

   public void set_ms2048 (Asn1Integer value) {
      setElement (_MS2048, value);
   }

   public void set_ms2560 (Asn1Integer value) {
      setElement (_MS2560, value);
   }

   public void set_ms5120 (Asn1Integer value) {
      setElement (_MS5120, value);
   }

   public void set_ms10240 (Asn1Integer value) {
      setElement (_MS10240, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (20, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ms10
         case 0: { 
            Asn1Integer ms10;
            element = ms10 = new Asn1Integer();
            ms10.decode (buffer, 0, 9);

            buffer.invokeCharacters(ms10.toString());
            break;
         }

         // ms20
         case 1: { 
            Asn1Integer ms20;
            element = ms20 = new Asn1Integer();
            ms20.decode (buffer, 0, 19);

            buffer.invokeCharacters(ms20.toString());
            break;
         }

         // ms32
         case 2: { 
            Asn1Integer ms32;
            element = ms32 = new Asn1Integer();
            ms32.decode (buffer, 0, 31);

            buffer.invokeCharacters(ms32.toString());
            break;
         }

         // ms40
         case 3: { 
            Asn1Integer ms40;
            element = ms40 = new Asn1Integer();
            ms40.decode (buffer, 0, 39);

            buffer.invokeCharacters(ms40.toString());
            break;
         }

         // ms60
         case 4: { 
            Asn1Integer ms60;
            element = ms60 = new Asn1Integer();
            ms60.decode (buffer, 0, 59);

            buffer.invokeCharacters(ms60.toString());
            break;
         }

         // ms64
         case 5: { 
            Asn1Integer ms64;
            element = ms64 = new Asn1Integer();
            ms64.decode (buffer, 0, 63);

            buffer.invokeCharacters(ms64.toString());
            break;
         }

         // ms70
         case 6: { 
            Asn1Integer ms70;
            element = ms70 = new Asn1Integer();
            ms70.decode (buffer, 0, 69);

            buffer.invokeCharacters(ms70.toString());
            break;
         }

         // ms80
         case 7: { 
            Asn1Integer ms80;
            element = ms80 = new Asn1Integer();
            ms80.decode (buffer, 0, 79);

            buffer.invokeCharacters(ms80.toString());
            break;
         }

         // ms128
         case 8: { 
            Asn1Integer ms128;
            element = ms128 = new Asn1Integer();
            ms128.decode (buffer, 0, 127);

            buffer.invokeCharacters(ms128.toString());
            break;
         }

         // ms160
         case 9: { 
            Asn1Integer ms160;
            element = ms160 = new Asn1Integer();
            ms160.decode (buffer, 0, 159);

            buffer.invokeCharacters(ms160.toString());
            break;
         }

         // ms256
         case 10: { 
            Asn1Integer ms256;
            element = ms256 = new Asn1Integer();
            ms256.decode (buffer, 0, 255);

            buffer.invokeCharacters(ms256.toString());
            break;
         }

         // ms320
         case 11: { 
            Asn1Integer ms320;
            element = ms320 = new Asn1Integer();
            ms320.decode (buffer, 0, 319);

            buffer.invokeCharacters(ms320.toString());
            break;
         }

         // ms512
         case 12: { 
            Asn1Integer ms512;
            element = ms512 = new Asn1Integer();
            ms512.decode (buffer, 0, 511);

            buffer.invokeCharacters(ms512.toString());
            break;
         }

         // ms640
         case 13: { 
            Asn1Integer ms640;
            element = ms640 = new Asn1Integer();
            ms640.decode (buffer, 0, 639);

            buffer.invokeCharacters(ms640.toString());
            break;
         }

         // ms1024
         case 14: { 
            Asn1Integer ms1024;
            element = ms1024 = new Asn1Integer();
            ms1024.decode (buffer, 0, 1023);

            buffer.invokeCharacters(ms1024.toString());
            break;
         }

         // ms1280
         case 15: { 
            Asn1Integer ms1280;
            element = ms1280 = new Asn1Integer();
            ms1280.decode (buffer, 0, 1279);

            buffer.invokeCharacters(ms1280.toString());
            break;
         }

         // ms2048
         case 16: { 
            Asn1Integer ms2048;
            element = ms2048 = new Asn1Integer();
            ms2048.decode (buffer, 0, 2047);

            buffer.invokeCharacters(ms2048.toString());
            break;
         }

         // ms2560
         case 17: { 
            Asn1Integer ms2560;
            element = ms2560 = new Asn1Integer();
            ms2560.decode (buffer, 0, 2559);

            buffer.invokeCharacters(ms2560.toString());
            break;
         }

         // ms5120
         case 18: { 
            Asn1Integer ms5120;
            element = ms5120 = new Asn1Integer();
            ms5120.decode (buffer, 0, 5119);

            buffer.invokeCharacters(ms5120.toString());
            break;
         }

         // ms10240
         case 19: { 
            Asn1Integer ms10240;
            element = ms10240 = new Asn1Integer();
            ms10240.decode (buffer, 0, 10239);

            buffer.invokeCharacters(ms10240.toString());
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
