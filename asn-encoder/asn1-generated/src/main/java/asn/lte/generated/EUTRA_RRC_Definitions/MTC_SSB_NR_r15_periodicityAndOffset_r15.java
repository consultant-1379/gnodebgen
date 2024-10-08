/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MTC_SSB_NR_r15_periodicityAndOffset_r15 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SF5_R15 = 1;
   public final static byte _SF10_R15 = 2;
   public final static byte _SF20_R15 = 3;
   public final static byte _SF40_R15 = 4;
   public final static byte _SF80_R15 = 5;
   public final static byte _SF160_R15 = 6;

   public MTC_SSB_NR_r15_periodicityAndOffset_r15 () {
      super();
   }

   public MTC_SSB_NR_r15_periodicityAndOffset_r15 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SF5_R15: return "sf5_r15";
      case _SF10_R15: return "sf10_r15";
      case _SF20_R15: return "sf20_r15";
      case _SF40_R15: return "sf40_r15";
      case _SF80_R15: return "sf80_r15";
      case _SF160_R15: return "sf160_r15";
      default: return "UNDEFINED";
      }
   }

   public void set_sf5_r15 (Asn1Integer value) {
      setElement (_SF5_R15, value);
   }

   public void set_sf10_r15 (Asn1Integer value) {
      setElement (_SF10_R15, value);
   }

   public void set_sf20_r15 (Asn1Integer value) {
      setElement (_SF20_R15, value);
   }

   public void set_sf40_r15 (Asn1Integer value) {
      setElement (_SF40_R15, value);
   }

   public void set_sf80_r15 (Asn1Integer value) {
      setElement (_SF80_R15, value);
   }

   public void set_sf160_r15 (Asn1Integer value) {
      setElement (_SF160_R15, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (6, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sf5_r15
         case 0: { 
            Asn1Integer sf5_r15;
            element = sf5_r15 = new Asn1Integer();
            sf5_r15.decode (buffer, 0, 4);

            buffer.invokeCharacters(sf5_r15.toString());
            break;
         }

         // sf10_r15
         case 1: { 
            Asn1Integer sf10_r15;
            element = sf10_r15 = new Asn1Integer();
            sf10_r15.decode (buffer, 0, 9);

            buffer.invokeCharacters(sf10_r15.toString());
            break;
         }

         // sf20_r15
         case 2: { 
            Asn1Integer sf20_r15;
            element = sf20_r15 = new Asn1Integer();
            sf20_r15.decode (buffer, 0, 19);

            buffer.invokeCharacters(sf20_r15.toString());
            break;
         }

         // sf40_r15
         case 3: { 
            Asn1Integer sf40_r15;
            element = sf40_r15 = new Asn1Integer();
            sf40_r15.decode (buffer, 0, 39);

            buffer.invokeCharacters(sf40_r15.toString());
            break;
         }

         // sf80_r15
         case 4: { 
            Asn1Integer sf80_r15;
            element = sf80_r15 = new Asn1Integer();
            sf80_r15.decode (buffer, 0, 79);

            buffer.invokeCharacters(sf80_r15.toString());
            break;
         }

         // sf160_r15
         case 5: { 
            Asn1Integer sf160_r15;
            element = sf160_r15 = new Asn1Integer();
            sf160_r15.decode (buffer, 0, 159);

            buffer.invokeCharacters(sf160_r15.toString());
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
