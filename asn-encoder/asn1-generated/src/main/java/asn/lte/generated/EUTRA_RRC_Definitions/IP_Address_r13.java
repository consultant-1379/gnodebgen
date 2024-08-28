/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IP_Address_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IP-Address-r13";
   }

   // Choice element identifier constants
   public final static byte _IPV4_R13 = 1;
   public final static byte _IPV6_R13 = 2;

   public IP_Address_r13 () {
      super();
   }

   public IP_Address_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _IPV4_R13: return "ipv4_r13";
      case _IPV6_R13: return "ipv6_r13";
      default: return "UNDEFINED";
      }
   }

   public void set_ipv4_r13 (Asn1BitString value) {
      setElement (_IPV4_R13, value);
   }

   public void set_ipv6_r13 (Asn1BitString value) {
      setElement (_IPV6_R13, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ipv4_r13
         case 0: { 
            Asn1BitString ipv4_r13;
            element = ipv4_r13 = new Asn1BitString();
            ipv4_r13.decode (buffer, 32, 32);

            buffer.invokeCharacters(ipv4_r13.toString());
            break;
         }

         // ipv6_r13
         case 1: { 
            Asn1BitString ipv6_r13;
            element = ipv6_r13 = new Asn1BitString();
            ipv6_r13.decode (buffer, 128, 128);

            buffer.invokeCharacters(ipv6_r13.toString());
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
