/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_PosResource_r16_resourceType_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _APERIODIC_R16 = 1;
   public final static byte _SEMI_PERSISTENT_R16 = 2;
   public final static byte _PERIODIC_R16 = 3;

   public SRS_PosResource_r16_resourceType_r16 () {
      super();
   }

   public SRS_PosResource_r16_resourceType_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _APERIODIC_R16: return "aperiodic_r16";
      case _SEMI_PERSISTENT_R16: return "semi_persistent_r16";
      case _PERIODIC_R16: return "periodic_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_aperiodic_r16 (SRS_PosResource_r16_resourceType_r16_aperiodic_r16 value) {
      setElement (_APERIODIC_R16, value);
   }

   public void set_semi_persistent_r16 (SRS_PosResource_r16_resourceType_r16_semi_persistent_r16 value) {
      setElement (_SEMI_PERSISTENT_R16, value);
   }

   public void set_periodic_r16 (SRS_PosResource_r16_resourceType_r16_periodic_r16 value) {
      setElement (_PERIODIC_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // aperiodic_r16
         case 0: { 
            SRS_PosResource_r16_resourceType_r16_aperiodic_r16 aperiodic_r16;
            element = aperiodic_r16 = new SRS_PosResource_r16_resourceType_r16_aperiodic_r16();
            aperiodic_r16.decode (buffer);
            break;
         }

         // semi_persistent_r16
         case 1: { 
            SRS_PosResource_r16_resourceType_r16_semi_persistent_r16 semi_persistent_r16;
            element = semi_persistent_r16 = new SRS_PosResource_r16_resourceType_r16_semi_persistent_r16();
            semi_persistent_r16.decode (buffer);
            break;
         }

         // periodic_r16
         case 2: { 
            SRS_PosResource_r16_resourceType_r16_periodic_r16 periodic_r16;
            element = periodic_r16 = new SRS_PosResource_r16_resourceType_r16_periodic_r16();
            periodic_r16.decode (buffer);
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

      buffer.encodeConsWholeNumber (choiceID - 1, 3, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // aperiodic_r16
         case _APERIODIC_R16:
            SRS_PosResource_r16_resourceType_r16_aperiodic_r16 aperiodic_r16 = (SRS_PosResource_r16_resourceType_r16_aperiodic_r16) element;
            aperiodic_r16.encode (buffer);
            break;

         // semi_persistent_r16
         case _SEMI_PERSISTENT_R16:
            SRS_PosResource_r16_resourceType_r16_semi_persistent_r16 semi_persistent_r16 = (SRS_PosResource_r16_resourceType_r16_semi_persistent_r16) element;
            semi_persistent_r16.encode (buffer);
            break;

         // periodic_r16
         case _PERIODIC_R16:
            SRS_PosResource_r16_resourceType_r16_periodic_r16 periodic_r16 = (SRS_PosResource_r16_resourceType_r16_periodic_r16) element;
            periodic_r16.encode (buffer);
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
