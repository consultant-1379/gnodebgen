/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SC_MTCH_SchedulingInfo_r13_schedulingPeriodStartOffsetSCPTM_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SF10 = 1;
   public final static byte _SF20 = 2;
   public final static byte _SF32 = 3;
   public final static byte _SF40 = 4;
   public final static byte _SF64 = 5;
   public final static byte _SF80 = 6;
   public final static byte _SF128 = 7;
   public final static byte _SF160 = 8;
   public final static byte _SF256 = 9;
   public final static byte _SF320 = 10;
   public final static byte _SF512 = 11;
   public final static byte _SF640 = 12;
   public final static byte _SF1024 = 13;
   public final static byte _SF2048 = 14;
   public final static byte _SF4096 = 15;
   public final static byte _SF8192 = 16;

   public SC_MTCH_SchedulingInfo_r13_schedulingPeriodStartOffsetSCPTM_r13 () {
      super();
   }

   public SC_MTCH_SchedulingInfo_r13_schedulingPeriodStartOffsetSCPTM_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SF10: return "sf10";
      case _SF20: return "sf20";
      case _SF32: return "sf32";
      case _SF40: return "sf40";
      case _SF64: return "sf64";
      case _SF80: return "sf80";
      case _SF128: return "sf128";
      case _SF160: return "sf160";
      case _SF256: return "sf256";
      case _SF320: return "sf320";
      case _SF512: return "sf512";
      case _SF640: return "sf640";
      case _SF1024: return "sf1024";
      case _SF2048: return "sf2048";
      case _SF4096: return "sf4096";
      case _SF8192: return "sf8192";
      default: return "UNDEFINED";
      }
   }

   public void set_sf10 (Asn1Integer value) {
      setElement (_SF10, value);
   }

   public void set_sf20 (Asn1Integer value) {
      setElement (_SF20, value);
   }

   public void set_sf32 (Asn1Integer value) {
      setElement (_SF32, value);
   }

   public void set_sf40 (Asn1Integer value) {
      setElement (_SF40, value);
   }

   public void set_sf64 (Asn1Integer value) {
      setElement (_SF64, value);
   }

   public void set_sf80 (Asn1Integer value) {
      setElement (_SF80, value);
   }

   public void set_sf128 (Asn1Integer value) {
      setElement (_SF128, value);
   }

   public void set_sf160 (Asn1Integer value) {
      setElement (_SF160, value);
   }

   public void set_sf256 (Asn1Integer value) {
      setElement (_SF256, value);
   }

   public void set_sf320 (Asn1Integer value) {
      setElement (_SF320, value);
   }

   public void set_sf512 (Asn1Integer value) {
      setElement (_SF512, value);
   }

   public void set_sf640 (Asn1Integer value) {
      setElement (_SF640, value);
   }

   public void set_sf1024 (Asn1Integer value) {
      setElement (_SF1024, value);
   }

   public void set_sf2048 (Asn1Integer value) {
      setElement (_SF2048, value);
   }

   public void set_sf4096 (Asn1Integer value) {
      setElement (_SF4096, value);
   }

   public void set_sf8192 (Asn1Integer value) {
      setElement (_SF8192, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (16, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sf10
         case 0: { 
            Asn1Integer sf10;
            element = sf10 = new Asn1Integer();
            sf10.decode (buffer, 0, 9);

            buffer.invokeCharacters(sf10.toString());
            break;
         }

         // sf20
         case 1: { 
            Asn1Integer sf20;
            element = sf20 = new Asn1Integer();
            sf20.decode (buffer, 0, 19);

            buffer.invokeCharacters(sf20.toString());
            break;
         }

         // sf32
         case 2: { 
            Asn1Integer sf32;
            element = sf32 = new Asn1Integer();
            sf32.decode (buffer, 0, 31);

            buffer.invokeCharacters(sf32.toString());
            break;
         }

         // sf40
         case 3: { 
            Asn1Integer sf40;
            element = sf40 = new Asn1Integer();
            sf40.decode (buffer, 0, 39);

            buffer.invokeCharacters(sf40.toString());
            break;
         }

         // sf64
         case 4: { 
            Asn1Integer sf64;
            element = sf64 = new Asn1Integer();
            sf64.decode (buffer, 0, 63);

            buffer.invokeCharacters(sf64.toString());
            break;
         }

         // sf80
         case 5: { 
            Asn1Integer sf80;
            element = sf80 = new Asn1Integer();
            sf80.decode (buffer, 0, 79);

            buffer.invokeCharacters(sf80.toString());
            break;
         }

         // sf128
         case 6: { 
            Asn1Integer sf128;
            element = sf128 = new Asn1Integer();
            sf128.decode (buffer, 0, 127);

            buffer.invokeCharacters(sf128.toString());
            break;
         }

         // sf160
         case 7: { 
            Asn1Integer sf160;
            element = sf160 = new Asn1Integer();
            sf160.decode (buffer, 0, 159);

            buffer.invokeCharacters(sf160.toString());
            break;
         }

         // sf256
         case 8: { 
            Asn1Integer sf256;
            element = sf256 = new Asn1Integer();
            sf256.decode (buffer, 0, 255);

            buffer.invokeCharacters(sf256.toString());
            break;
         }

         // sf320
         case 9: { 
            Asn1Integer sf320;
            element = sf320 = new Asn1Integer();
            sf320.decode (buffer, 0, 319);

            buffer.invokeCharacters(sf320.toString());
            break;
         }

         // sf512
         case 10: { 
            Asn1Integer sf512;
            element = sf512 = new Asn1Integer();
            sf512.decode (buffer, 0, 511);

            buffer.invokeCharacters(sf512.toString());
            break;
         }

         // sf640
         case 11: { 
            Asn1Integer sf640;
            element = sf640 = new Asn1Integer();
            sf640.decode (buffer, 0, 639);

            buffer.invokeCharacters(sf640.toString());
            break;
         }

         // sf1024
         case 12: { 
            Asn1Integer sf1024;
            element = sf1024 = new Asn1Integer();
            sf1024.decode (buffer, 0, 1023);

            buffer.invokeCharacters(sf1024.toString());
            break;
         }

         // sf2048
         case 13: { 
            Asn1Integer sf2048;
            element = sf2048 = new Asn1Integer();
            sf2048.decode (buffer, 0, 2048);

            buffer.invokeCharacters(sf2048.toString());
            break;
         }

         // sf4096
         case 14: { 
            Asn1Integer sf4096;
            element = sf4096 = new Asn1Integer();
            sf4096.decode (buffer, 0, 4096);

            buffer.invokeCharacters(sf4096.toString());
            break;
         }

         // sf8192
         case 15: { 
            Asn1Integer sf8192;
            element = sf8192 = new Asn1Integer();
            sf8192.decode (buffer, 0, 8192);

            buffer.invokeCharacters(sf8192.toString());
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
