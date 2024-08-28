/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AntennaInfoDedicatedSTTI_r15_setup_codebookSubsetRestriction extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _N2TXANTENNA_TM3_R15 = 1;
   public final static byte _N4TXANTENNA_TM3_R15 = 2;
   public final static byte _N2TXANTENNA_TM4_R15 = 3;
   public final static byte _N4TXANTENNA_TM4_R15 = 4;
   public final static byte _N2TXANTENNA_TM5_R15 = 5;
   public final static byte _N4TXANTENNA_TM5_R15 = 6;
   public final static byte _N2TXANTENNA_TM6_R15 = 7;
   public final static byte _N4TXANTENNA_TM6_R15 = 8;
   public final static byte _N2TXANTENNA_TM8_R15 = 9;
   public final static byte _N4TXANTENNA_TM8_R15 = 10;
   public final static byte _N2TXANTENNA_TM9AND10_R15 = 11;
   public final static byte _N4TXANTENNA_TM9AND10_R15 = 12;
   public final static byte _N8TXANTENNA_TM9AND10_R15 = 13;

   public AntennaInfoDedicatedSTTI_r15_setup_codebookSubsetRestriction () {
      super();
   }

   public AntennaInfoDedicatedSTTI_r15_setup_codebookSubsetRestriction (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _N2TXANTENNA_TM3_R15: return "n2TxAntenna_tm3_r15";
      case _N4TXANTENNA_TM3_R15: return "n4TxAntenna_tm3_r15";
      case _N2TXANTENNA_TM4_R15: return "n2TxAntenna_tm4_r15";
      case _N4TXANTENNA_TM4_R15: return "n4TxAntenna_tm4_r15";
      case _N2TXANTENNA_TM5_R15: return "n2TxAntenna_tm5_r15";
      case _N4TXANTENNA_TM5_R15: return "n4TxAntenna_tm5_r15";
      case _N2TXANTENNA_TM6_R15: return "n2TxAntenna_tm6_r15";
      case _N4TXANTENNA_TM6_R15: return "n4TxAntenna_tm6_r15";
      case _N2TXANTENNA_TM8_R15: return "n2TxAntenna_tm8_r15";
      case _N4TXANTENNA_TM8_R15: return "n4TxAntenna_tm8_r15";
      case _N2TXANTENNA_TM9AND10_R15: return "n2TxAntenna_tm9and10_r15";
      case _N4TXANTENNA_TM9AND10_R15: return "n4TxAntenna_tm9and10_r15";
      case _N8TXANTENNA_TM9AND10_R15: return "n8TxAntenna_tm9and10_r15";
      default: return "UNDEFINED";
      }
   }

   public void set_n2TxAntenna_tm3_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM3_R15, value);
   }

   public void set_n4TxAntenna_tm3_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM3_R15, value);
   }

   public void set_n2TxAntenna_tm4_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM4_R15, value);
   }

   public void set_n4TxAntenna_tm4_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM4_R15, value);
   }

   public void set_n2TxAntenna_tm5_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM5_R15, value);
   }

   public void set_n4TxAntenna_tm5_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM5_R15, value);
   }

   public void set_n2TxAntenna_tm6_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM6_R15, value);
   }

   public void set_n4TxAntenna_tm6_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM6_R15, value);
   }

   public void set_n2TxAntenna_tm8_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM8_R15, value);
   }

   public void set_n4TxAntenna_tm8_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM8_R15, value);
   }

   public void set_n2TxAntenna_tm9and10_r15 (Asn1BitString value) {
      setElement (_N2TXANTENNA_TM9AND10_R15, value);
   }

   public void set_n4TxAntenna_tm9and10_r15 (Asn1BitString value) {
      setElement (_N4TXANTENNA_TM9AND10_R15, value);
   }

   public void set_n8TxAntenna_tm9and10_r15 (Asn1BitString value) {
      setElement (_N8TXANTENNA_TM9AND10_R15, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (13, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // n2TxAntenna_tm3_r15
         case 0: { 
            Asn1BitString n2TxAntenna_tm3_r15;
            element = n2TxAntenna_tm3_r15 = new Asn1BitString();
            n2TxAntenna_tm3_r15.decode (buffer, 2, 2);

            buffer.invokeCharacters(n2TxAntenna_tm3_r15.toString());
            break;
         }

         // n4TxAntenna_tm3_r15
         case 1: { 
            Asn1BitString n4TxAntenna_tm3_r15;
            element = n4TxAntenna_tm3_r15 = new Asn1BitString();
            n4TxAntenna_tm3_r15.decode (buffer, 4, 4);

            buffer.invokeCharacters(n4TxAntenna_tm3_r15.toString());
            break;
         }

         // n2TxAntenna_tm4_r15
         case 2: { 
            Asn1BitString n2TxAntenna_tm4_r15;
            element = n2TxAntenna_tm4_r15 = new Asn1BitString();
            n2TxAntenna_tm4_r15.decode (buffer, 6, 6);

            buffer.invokeCharacters(n2TxAntenna_tm4_r15.toString());
            break;
         }

         // n4TxAntenna_tm4_r15
         case 3: { 
            Asn1BitString n4TxAntenna_tm4_r15;
            element = n4TxAntenna_tm4_r15 = new Asn1BitString();
            n4TxAntenna_tm4_r15.decode (buffer, 64, 64);

            buffer.invokeCharacters(n4TxAntenna_tm4_r15.toString());
            break;
         }

         // n2TxAntenna_tm5_r15
         case 4: { 
            Asn1BitString n2TxAntenna_tm5_r15;
            element = n2TxAntenna_tm5_r15 = new Asn1BitString();
            n2TxAntenna_tm5_r15.decode (buffer, 4, 4);

            buffer.invokeCharacters(n2TxAntenna_tm5_r15.toString());
            break;
         }

         // n4TxAntenna_tm5_r15
         case 5: { 
            Asn1BitString n4TxAntenna_tm5_r15;
            element = n4TxAntenna_tm5_r15 = new Asn1BitString();
            n4TxAntenna_tm5_r15.decode (buffer, 16, 16);

            buffer.invokeCharacters(n4TxAntenna_tm5_r15.toString());
            break;
         }

         // n2TxAntenna_tm6_r15
         case 6: { 
            Asn1BitString n2TxAntenna_tm6_r15;
            element = n2TxAntenna_tm6_r15 = new Asn1BitString();
            n2TxAntenna_tm6_r15.decode (buffer, 4, 4);

            buffer.invokeCharacters(n2TxAntenna_tm6_r15.toString());
            break;
         }

         // n4TxAntenna_tm6_r15
         case 7: { 
            Asn1BitString n4TxAntenna_tm6_r15;
            element = n4TxAntenna_tm6_r15 = new Asn1BitString();
            n4TxAntenna_tm6_r15.decode (buffer, 16, 16);

            buffer.invokeCharacters(n4TxAntenna_tm6_r15.toString());
            break;
         }

         // n2TxAntenna_tm8_r15
         case 8: { 
            Asn1BitString n2TxAntenna_tm8_r15;
            element = n2TxAntenna_tm8_r15 = new Asn1BitString();
            n2TxAntenna_tm8_r15.decode (buffer, 6, 6);

            buffer.invokeCharacters(n2TxAntenna_tm8_r15.toString());
            break;
         }

         // n4TxAntenna_tm8_r15
         case 9: { 
            Asn1BitString n4TxAntenna_tm8_r15;
            element = n4TxAntenna_tm8_r15 = new Asn1BitString();
            n4TxAntenna_tm8_r15.decode (buffer, 64, 64);

            buffer.invokeCharacters(n4TxAntenna_tm8_r15.toString());
            break;
         }

         // n2TxAntenna_tm9and10_r15
         case 10: { 
            Asn1BitString n2TxAntenna_tm9and10_r15;
            element = n2TxAntenna_tm9and10_r15 = new Asn1BitString();
            n2TxAntenna_tm9and10_r15.decode (buffer, 6, 6);

            buffer.invokeCharacters(n2TxAntenna_tm9and10_r15.toString());
            break;
         }

         // n4TxAntenna_tm9and10_r15
         case 11: { 
            Asn1BitString n4TxAntenna_tm9and10_r15;
            element = n4TxAntenna_tm9and10_r15 = new Asn1BitString();
            n4TxAntenna_tm9and10_r15.decode (buffer, 96, 96);

            buffer.invokeCharacters(n4TxAntenna_tm9and10_r15.toString());
            break;
         }

         // n8TxAntenna_tm9and10_r15
         case 12: { 
            Asn1BitString n8TxAntenna_tm9and10_r15;
            element = n8TxAntenna_tm9and10_r15 = new Asn1BitString();
            n8TxAntenna_tm9and10_r15.decode (buffer, 109, 109);

            buffer.invokeCharacters(n8TxAntenna_tm9and10_r15.toString());
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
