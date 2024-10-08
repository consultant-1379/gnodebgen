/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_MTC_periodicityAndOffset extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SF5 = 1;
   public final static byte _SF10 = 2;
   public final static byte _SF20 = 3;
   public final static byte _SF40 = 4;
   public final static byte _SF80 = 5;
   public final static byte _SF160 = 6;

   public SSB_MTC_periodicityAndOffset () {
      super();
   }

   public SSB_MTC_periodicityAndOffset (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SF5: return "sf5";
      case _SF10: return "sf10";
      case _SF20: return "sf20";
      case _SF40: return "sf40";
      case _SF80: return "sf80";
      case _SF160: return "sf160";
      default: return "UNDEFINED";
      }
   }

   public void set_sf5 (Asn1Integer value) {
      setElement (_SF5, value);
   }

   public void set_sf10 (Asn1Integer value) {
      setElement (_SF10, value);
   }

   public void set_sf20 (Asn1Integer value) {
      setElement (_SF20, value);
   }

   public void set_sf40 (Asn1Integer value) {
      setElement (_SF40, value);
   }

   public void set_sf80 (Asn1Integer value) {
      setElement (_SF80, value);
   }

   public void set_sf160 (Asn1Integer value) {
      setElement (_SF160, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (6, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sf5
         case 0: { 
            Asn1Integer sf5;
            element = sf5 = new Asn1Integer();
            sf5.decode (buffer, 0, 4);

            buffer.invokeCharacters(sf5.toString());
            break;
         }

         // sf10
         case 1: { 
            Asn1Integer sf10;
            element = sf10 = new Asn1Integer();
            sf10.decode (buffer, 0, 9);

            buffer.invokeCharacters(sf10.toString());
            break;
         }

         // sf20
         case 2: { 
            Asn1Integer sf20;
            element = sf20 = new Asn1Integer();
            sf20.decode (buffer, 0, 19);

            buffer.invokeCharacters(sf20.toString());
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

         // sf80
         case 4: { 
            Asn1Integer sf80;
            element = sf80 = new Asn1Integer();
            sf80.decode (buffer, 0, 79);

            buffer.invokeCharacters(sf80.toString());
            break;
         }

         // sf160
         case 5: { 
            Asn1Integer sf160;
            element = sf160 = new Asn1Integer();
            sf160.decode (buffer, 0, 159);

            buffer.invokeCharacters(sf160.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 6, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // sf5
         case _SF5:
            Asn1Integer sf5 = (Asn1Integer) element;
            sf5.encode (buffer, 0, 4);
            break;

         // sf10
         case _SF10:
            Asn1Integer sf10 = (Asn1Integer) element;
            sf10.encode (buffer, 0, 9);
            break;

         // sf20
         case _SF20:
            Asn1Integer sf20 = (Asn1Integer) element;
            sf20.encode (buffer, 0, 19);
            break;

         // sf40
         case _SF40:
            Asn1Integer sf40 = (Asn1Integer) element;
            sf40.encode (buffer, 0, 39);
            break;

         // sf80
         case _SF80:
            Asn1Integer sf80 = (Asn1Integer) element;
            sf80.encode (buffer, 0, 79);
            break;

         // sf160
         case _SF160:
            Asn1Integer sf160 = (Asn1Integer) element;
            sf160.encode (buffer, 0, 159);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
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
