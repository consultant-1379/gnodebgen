/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCResume_v1610_IEs_mrdc_SecondaryCellGroup_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _NR_SCG_R16 = 1;
   public final static byte _EUTRA_SCG_R16 = 2;

   public RRCResume_v1610_IEs_mrdc_SecondaryCellGroup_r16 () {
      super();
   }

   public RRCResume_v1610_IEs_mrdc_SecondaryCellGroup_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NR_SCG_R16: return "nr_SCG_r16";
      case _EUTRA_SCG_R16: return "eutra_SCG_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_nr_SCG_r16 (RRCReconfiguration value) {
      setElement (_NR_SCG_R16, value);
   }

   public void set_eutra_SCG_r16 (Asn1OctetString value) {
      setElement (_EUTRA_SCG_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // nr_SCG_r16
         case 0: { 
            RRCReconfiguration nr_SCG_r16;
            Asn1OctetString nr_SCG_r16_outer = new Asn1OctetString();
            nr_SCG_r16_outer.decode (buffer);
            if (nr_SCG_r16_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
            Asn1PerDecodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerDecodeBuffer( nr_SCG_r16_outer.value, buffer.isAligned());
            buffer.setEventHandlerList( savedBuffer );
            element = nr_SCG_r16 = new RRCReconfiguration();
            nr_SCG_r16.decode (buffer);
            buffer = savedBuffer;
            break;
         }

         // eutra_SCG_r16
         case 1: { 
            Asn1OctetString eutra_SCG_r16;
            element = eutra_SCG_r16 = new Asn1OctetString();
            eutra_SCG_r16.decode (buffer);

            buffer.invokeCharacters(eutra_SCG_r16.toString());
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

      buffer.encodeConsWholeNumber (choiceID - 1, 2, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // nr_SCG_r16
         case _NR_SCG_R16:
            RRCReconfiguration nr_SCG_r16 = (RRCReconfiguration) element;
            Asn1OctetString nr_SCG_r16_outer;
            {
               Asn1PerEncodeBuffer savedBuffer = buffer;
               buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
               nr_SCG_r16.encode (buffer);
               nr_SCG_r16_outer = new Asn1OctetString(buffer.getMsgCopy() );
               buffer = savedBuffer;
            }
            nr_SCG_r16_outer.encode (buffer);
            break;

         // eutra_SCG_r16
         case _EUTRA_SCG_R16:
            Asn1OctetString eutra_SCG_r16 = (Asn1OctetString) element;
            eutra_SCG_r16.encode (buffer);
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
