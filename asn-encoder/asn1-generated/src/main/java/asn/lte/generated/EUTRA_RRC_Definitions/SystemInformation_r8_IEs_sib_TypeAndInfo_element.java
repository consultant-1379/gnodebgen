/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformation_r8_IEs_sib_TypeAndInfo_element extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SIB2 = 1;
   public final static byte _SIB3 = 2;
   public final static byte _SIB4 = 3;
   public final static byte _SIB5 = 4;
   public final static byte _SIB6 = 5;
   public final static byte _SIB7 = 6;
   public final static byte _SIB8 = 7;
   public final static byte _SIB9 = 8;
   public final static byte _SIB10 = 9;
   public final static byte _SIB11 = 10;
   public final static byte _SIB12_V920 = 11;
   public final static byte _SIB13_V920 = 12;
   public final static byte _SIB14_V1130 = 13;
   public final static byte _SIB15_V1130 = 14;
   public final static byte _SIB16_V1130 = 15;
   public final static byte _SIB17_V1250 = 16;
   public final static byte _SIB18_V1250 = 17;
   public final static byte _SIB19_V1250 = 18;
   public final static byte _SIB20_V1310 = 19;
   public final static byte _SIB21_V1430 = 20;
   public final static byte _SIB24_V1530 = 21;
   public final static byte _SIB25_V1530 = 22;
   public final static byte _SIB26_V1530 = 23;
   public final static byte _EXTELEM1 = 24;

   public SystemInformation_r8_IEs_sib_TypeAndInfo_element () {
      super();
   }

   public SystemInformation_r8_IEs_sib_TypeAndInfo_element (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SIB2: return "sib2";
      case _SIB3: return "sib3";
      case _SIB4: return "sib4";
      case _SIB5: return "sib5";
      case _SIB6: return "sib6";
      case _SIB7: return "sib7";
      case _SIB8: return "sib8";
      case _SIB9: return "sib9";
      case _SIB10: return "sib10";
      case _SIB11: return "sib11";
      case _SIB12_V920: return "sib12_v920";
      case _SIB13_V920: return "sib13_v920";
      case _SIB14_V1130: return "sib14_v1130";
      case _SIB15_V1130: return "sib15_v1130";
      case _SIB16_V1130: return "sib16_v1130";
      case _SIB17_V1250: return "sib17_v1250";
      case _SIB18_V1250: return "sib18_v1250";
      case _SIB19_V1250: return "sib19_v1250";
      case _SIB20_V1310: return "sib20_v1310";
      case _SIB21_V1430: return "sib21_v1430";
      case _SIB24_V1530: return "sib24_v1530";
      case _SIB25_V1530: return "sib25_v1530";
      case _SIB26_V1530: return "sib26_v1530";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_sib2 (SystemInformationBlockType2 value) {
      setElement (_SIB2, value);
   }

   public void set_sib3 (SystemInformationBlockType3 value) {
      setElement (_SIB3, value);
   }

   public void set_sib4 (SystemInformationBlockType4 value) {
      setElement (_SIB4, value);
   }

   public void set_sib5 (SystemInformationBlockType5 value) {
      setElement (_SIB5, value);
   }

   public void set_sib6 (SystemInformationBlockType6 value) {
      setElement (_SIB6, value);
   }

   public void set_sib7 (SystemInformationBlockType7 value) {
      setElement (_SIB7, value);
   }

   public void set_sib8 (SystemInformationBlockType8 value) {
      setElement (_SIB8, value);
   }

   public void set_sib9 (SystemInformationBlockType9 value) {
      setElement (_SIB9, value);
   }

   public void set_sib10 (SystemInformationBlockType10 value) {
      setElement (_SIB10, value);
   }

   public void set_sib11 (SystemInformationBlockType11 value) {
      setElement (_SIB11, value);
   }

   public void set_sib12_v920 (SystemInformationBlockType12_r9 value) {
      setElement (_SIB12_V920, value);
   }

   public void set_sib13_v920 (SystemInformationBlockType13_r9 value) {
      setElement (_SIB13_V920, value);
   }

   public void set_sib14_v1130 (SystemInformationBlockType14_r11 value) {
      setElement (_SIB14_V1130, value);
   }

   public void set_sib15_v1130 (SystemInformationBlockType15_r11 value) {
      setElement (_SIB15_V1130, value);
   }

   public void set_sib16_v1130 (SystemInformationBlockType16_r11 value) {
      setElement (_SIB16_V1130, value);
   }

   public void set_sib17_v1250 (SystemInformationBlockType17_r12 value) {
      setElement (_SIB17_V1250, value);
   }

   public void set_sib18_v1250 (SystemInformationBlockType18_r12 value) {
      setElement (_SIB18_V1250, value);
   }

   public void set_sib19_v1250 (SystemInformationBlockType19_r12 value) {
      setElement (_SIB19_V1250, value);
   }

   public void set_sib20_v1310 (SystemInformationBlockType20_r13 value) {
      setElement (_SIB20_V1310, value);
   }

   public void set_sib21_v1430 (SystemInformationBlockType21_r14 value) {
      setElement (_SIB21_V1430, value);
   }

   public void set_sib24_v1530 (SystemInformationBlockType24_r15 value) {
      setElement (_SIB24_V1530, value);
   }

   public void set_sib25_v1530 (SystemInformationBlockType25_r15 value) {
      setElement (_SIB25_V1530, value);
   }

   public void set_sib26_v1530 (SystemInformationBlockType26_r15 value) {
      setElement (_SIB26_V1530, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (10, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // sib2
            case 0: { 
               SystemInformationBlockType2 sib2;
               element = sib2 = new SystemInformationBlockType2();
               sib2.decode (buffer);
               break;
            }

            // sib3
            case 1: { 
               SystemInformationBlockType3 sib3;
               element = sib3 = new SystemInformationBlockType3();
               sib3.decode (buffer);
               break;
            }

            // sib4
            case 2: { 
               SystemInformationBlockType4 sib4;
               element = sib4 = new SystemInformationBlockType4();
               sib4.decode (buffer);
               break;
            }

            // sib5
            case 3: { 
               SystemInformationBlockType5 sib5;
               element = sib5 = new SystemInformationBlockType5();
               sib5.decode (buffer);
               break;
            }

            // sib6
            case 4: { 
               SystemInformationBlockType6 sib6;
               element = sib6 = new SystemInformationBlockType6();
               sib6.decode (buffer);
               break;
            }

            // sib7
            case 5: { 
               SystemInformationBlockType7 sib7;
               element = sib7 = new SystemInformationBlockType7();
               sib7.decode (buffer);
               break;
            }

            // sib8
            case 6: { 
               SystemInformationBlockType8 sib8;
               element = sib8 = new SystemInformationBlockType8();
               sib8.decode (buffer);
               break;
            }

            // sib9
            case 7: { 
               SystemInformationBlockType9 sib9;
               element = sib9 = new SystemInformationBlockType9();
               sib9.decode (buffer);
               break;
            }

            // sib10
            case 8: { 
               SystemInformationBlockType10 sib10;
               element = sib10 = new SystemInformationBlockType10();
               sib10.decode (buffer);
               break;
            }

            // sib11
            case 9: { 
               SystemInformationBlockType11 sib11;
               element = sib11 = new SystemInformationBlockType11();
               sib11.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 11;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // sib12_v920
            case 0: { 
               SystemInformationBlockType12_r9 sib12_v920;
               element = sib12_v920 = new SystemInformationBlockType12_r9();
               sib12_v920.decode (buffer);
               break;
            }

            // sib13_v920
            case 1: { 
               SystemInformationBlockType13_r9 sib13_v920;
               element = sib13_v920 = new SystemInformationBlockType13_r9();
               sib13_v920.decode (buffer);
               break;
            }

            // sib14_v1130
            case 2: { 
               SystemInformationBlockType14_r11 sib14_v1130;
               element = sib14_v1130 = new SystemInformationBlockType14_r11();
               sib14_v1130.decode (buffer);
               break;
            }

            // sib15_v1130
            case 3: { 
               SystemInformationBlockType15_r11 sib15_v1130;
               element = sib15_v1130 = new SystemInformationBlockType15_r11();
               sib15_v1130.decode (buffer);
               break;
            }

            // sib16_v1130
            case 4: { 
               SystemInformationBlockType16_r11 sib16_v1130;
               element = sib16_v1130 = new SystemInformationBlockType16_r11();
               sib16_v1130.decode (buffer);
               break;
            }

            // sib17_v1250
            case 5: { 
               SystemInformationBlockType17_r12 sib17_v1250;
               element = sib17_v1250 = new SystemInformationBlockType17_r12();
               sib17_v1250.decode (buffer);
               break;
            }

            // sib18_v1250
            case 6: { 
               SystemInformationBlockType18_r12 sib18_v1250;
               element = sib18_v1250 = new SystemInformationBlockType18_r12();
               sib18_v1250.decode (buffer);
               break;
            }

            // sib19_v1250
            case 7: { 
               SystemInformationBlockType19_r12 sib19_v1250;
               element = sib19_v1250 = new SystemInformationBlockType19_r12();
               sib19_v1250.decode (buffer);
               break;
            }

            // sib20_v1310
            case 8: { 
               SystemInformationBlockType20_r13 sib20_v1310;
               element = sib20_v1310 = new SystemInformationBlockType20_r13();
               sib20_v1310.decode (buffer);
               break;
            }

            // sib21_v1430
            case 9: { 
               SystemInformationBlockType21_r14 sib21_v1430;
               element = sib21_v1430 = new SystemInformationBlockType21_r14();
               sib21_v1430.decode (buffer);
               break;
            }

            // sib24_v1530
            case 10: { 
               SystemInformationBlockType24_r15 sib24_v1530;
               element = sib24_v1530 = new SystemInformationBlockType24_r15();
               sib24_v1530.decode (buffer);
               break;
            }

            // sib25_v1530
            case 11: { 
               SystemInformationBlockType25_r15 sib25_v1530;
               element = sib25_v1530 = new SystemInformationBlockType25_r15();
               sib25_v1530.decode (buffer);
               break;
            }

            // sib26_v1530
            case 12: { 
               SystemInformationBlockType26_r15 sib26_v1530;
               element = sib26_v1530 = new SystemInformationBlockType26_r15();
               sib26_v1530.decode (buffer);
               break;
            }

            // extElem1
            case 13: { 
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
