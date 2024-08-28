/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IAB_IP_Address_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IAB-IP-Address-r16";
   }

   // Choice element identifier constants
   public final static byte _IPV4_ADDRESS_R16 = 1;
   public final static byte _IPV6_ADDRESS_R16 = 2;
   public final static byte _IPV6_PREFIX_R16 = 3;
   public final static byte _EXTELEM1 = 4;

   public IAB_IP_Address_r16 () {
      super();
   }

   public IAB_IP_Address_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _IPV4_ADDRESS_R16: return "iPv4_Address_r16";
      case _IPV6_ADDRESS_R16: return "iPv6_Address_r16";
      case _IPV6_PREFIX_R16: return "iPv6_Prefix_r16";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_iPv4_Address_r16 (Asn1BitString value) {
      setElement (_IPV4_ADDRESS_R16, value);
   }

   public void set_iPv6_Address_r16 (Asn1BitString value) {
      setElement (_IPV6_ADDRESS_R16, value);
   }

   public void set_iPv6_Prefix_r16 (Asn1BitString value) {
      setElement (_IPV6_PREFIX_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (3, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // iPv4_Address_r16
            case 0: { 
               Asn1BitString iPv4_Address_r16;
               element = iPv4_Address_r16 = new Asn1BitString();
               iPv4_Address_r16.decode (buffer, 32, 32);

               buffer.invokeCharacters(iPv4_Address_r16.toString());
               break;
            }

            // iPv6_Address_r16
            case 1: { 
               Asn1BitString iPv6_Address_r16;
               element = iPv6_Address_r16 = new Asn1BitString();
               iPv6_Address_r16.decode (buffer, 128, 128);

               buffer.invokeCharacters(iPv6_Address_r16.toString());
               break;
            }

            // iPv6_Prefix_r16
            case 2: { 
               Asn1BitString iPv6_Prefix_r16;
               element = iPv6_Prefix_r16 = new Asn1BitString();
               iPv6_Prefix_r16.decode (buffer, 64, 64);

               buffer.invokeCharacters(iPv6_Prefix_r16.toString());
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 4;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
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
