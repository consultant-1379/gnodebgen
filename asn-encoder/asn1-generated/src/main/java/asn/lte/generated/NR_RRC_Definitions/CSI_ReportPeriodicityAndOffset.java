/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportPeriodicityAndOffset extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-ReportPeriodicityAndOffset";
   }

   // Choice element identifier constants
   public final static byte _SLOTS4 = 1;
   public final static byte _SLOTS5 = 2;
   public final static byte _SLOTS8 = 3;
   public final static byte _SLOTS10 = 4;
   public final static byte _SLOTS16 = 5;
   public final static byte _SLOTS20 = 6;
   public final static byte _SLOTS40 = 7;
   public final static byte _SLOTS80 = 8;
   public final static byte _SLOTS160 = 9;
   public final static byte _SLOTS320 = 10;

   public CSI_ReportPeriodicityAndOffset () {
      super();
   }

   public CSI_ReportPeriodicityAndOffset (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SLOTS4: return "slots4";
      case _SLOTS5: return "slots5";
      case _SLOTS8: return "slots8";
      case _SLOTS10: return "slots10";
      case _SLOTS16: return "slots16";
      case _SLOTS20: return "slots20";
      case _SLOTS40: return "slots40";
      case _SLOTS80: return "slots80";
      case _SLOTS160: return "slots160";
      case _SLOTS320: return "slots320";
      default: return "UNDEFINED";
      }
   }

   public void set_slots4 (Asn1Integer value) {
      setElement (_SLOTS4, value);
   }

   public void set_slots5 (Asn1Integer value) {
      setElement (_SLOTS5, value);
   }

   public void set_slots8 (Asn1Integer value) {
      setElement (_SLOTS8, value);
   }

   public void set_slots10 (Asn1Integer value) {
      setElement (_SLOTS10, value);
   }

   public void set_slots16 (Asn1Integer value) {
      setElement (_SLOTS16, value);
   }

   public void set_slots20 (Asn1Integer value) {
      setElement (_SLOTS20, value);
   }

   public void set_slots40 (Asn1Integer value) {
      setElement (_SLOTS40, value);
   }

   public void set_slots80 (Asn1Integer value) {
      setElement (_SLOTS80, value);
   }

   public void set_slots160 (Asn1Integer value) {
      setElement (_SLOTS160, value);
   }

   public void set_slots320 (Asn1Integer value) {
      setElement (_SLOTS320, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (10, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // slots4
         case 0: { 
            Asn1Integer slots4;
            element = slots4 = new Asn1Integer();
            slots4.decode (buffer, 0, 3);

            buffer.invokeCharacters(slots4.toString());
            break;
         }

         // slots5
         case 1: { 
            Asn1Integer slots5;
            element = slots5 = new Asn1Integer();
            slots5.decode (buffer, 0, 4);

            buffer.invokeCharacters(slots5.toString());
            break;
         }

         // slots8
         case 2: { 
            Asn1Integer slots8;
            element = slots8 = new Asn1Integer();
            slots8.decode (buffer, 0, 7);

            buffer.invokeCharacters(slots8.toString());
            break;
         }

         // slots10
         case 3: { 
            Asn1Integer slots10;
            element = slots10 = new Asn1Integer();
            slots10.decode (buffer, 0, 9);

            buffer.invokeCharacters(slots10.toString());
            break;
         }

         // slots16
         case 4: { 
            Asn1Integer slots16;
            element = slots16 = new Asn1Integer();
            slots16.decode (buffer, 0, 15);

            buffer.invokeCharacters(slots16.toString());
            break;
         }

         // slots20
         case 5: { 
            Asn1Integer slots20;
            element = slots20 = new Asn1Integer();
            slots20.decode (buffer, 0, 19);

            buffer.invokeCharacters(slots20.toString());
            break;
         }

         // slots40
         case 6: { 
            Asn1Integer slots40;
            element = slots40 = new Asn1Integer();
            slots40.decode (buffer, 0, 39);

            buffer.invokeCharacters(slots40.toString());
            break;
         }

         // slots80
         case 7: { 
            Asn1Integer slots80;
            element = slots80 = new Asn1Integer();
            slots80.decode (buffer, 0, 79);

            buffer.invokeCharacters(slots80.toString());
            break;
         }

         // slots160
         case 8: { 
            Asn1Integer slots160;
            element = slots160 = new Asn1Integer();
            slots160.decode (buffer, 0, 159);

            buffer.invokeCharacters(slots160.toString());
            break;
         }

         // slots320
         case 9: { 
            Asn1Integer slots320;
            element = slots320 = new Asn1Integer();
            slots320.decode (buffer, 0, 319);

            buffer.invokeCharacters(slots320.toString());
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
