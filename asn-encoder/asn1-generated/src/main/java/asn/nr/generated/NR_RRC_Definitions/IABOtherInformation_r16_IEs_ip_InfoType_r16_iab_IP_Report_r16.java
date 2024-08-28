/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public IAB_IP_AddressAndTraffic_r16 iab_IPv4_AddressReport_r16;  // optional
   public IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16_iab_IPv6_Report_r16 iab_IPv6_Report_r16;  // optional

   public IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16 (
      IAB_IP_AddressAndTraffic_r16 iab_IPv4_AddressReport_r16_,
      IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16_iab_IPv6_Report_r16 iab_IPv6_Report_r16_
   ) {
      super();
      iab_IPv4_AddressReport_r16 = iab_IPv4_AddressReport_r16_;
      iab_IPv6_Report_r16 = iab_IPv6_Report_r16_;
   }

   public void init () {
      iab_IPv4_AddressReport_r16 = null;
      iab_IPv6_Report_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return iab_IPv4_AddressReport_r16;
         case 1: return iab_IPv6_Report_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "iab-IPv4-AddressReport-r16";
         case 1: return "iab-IPv6-Report-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean iab_IPv4_AddressReport_r16Present = buffer.decodeBit ("iab_IPv4_AddressReport_r16Present");
      boolean iab_IPv6_Report_r16Present = buffer.decodeBit ("iab_IPv6_Report_r16Present");

      // decode iab_IPv4_AddressReport_r16

      if (iab_IPv4_AddressReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("iab_IPv4_AddressReport_r16", -1);

         iab_IPv4_AddressReport_r16 = new IAB_IP_AddressAndTraffic_r16();
         iab_IPv4_AddressReport_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iab_IPv4_AddressReport_r16", -1);
      }
      else {
         iab_IPv4_AddressReport_r16 = null;
      }

      // decode iab_IPv6_Report_r16

      if (iab_IPv6_Report_r16Present) {
         buffer.getContext().eventDispatcher.startElement("iab_IPv6_Report_r16", -1);

         iab_IPv6_Report_r16 = new IABOtherInformation_r16_IEs_ip_InfoType_r16_iab_IP_Report_r16_iab_IPv6_Report_r16();
         iab_IPv6_Report_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iab_IPv6_Report_r16", -1);
      }
      else {
         iab_IPv6_Report_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((iab_IPv4_AddressReport_r16 != null), null);
      buffer.encodeBit ((iab_IPv6_Report_r16 != null), null);

      // encode iab_IPv4_AddressReport_r16

      if (iab_IPv4_AddressReport_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("iab_IPv4_AddressReport_r16", -1);

         iab_IPv4_AddressReport_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("iab_IPv4_AddressReport_r16", -1);
      }

      // encode iab_IPv6_Report_r16

      if (iab_IPv6_Report_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("iab_IPv6_Report_r16", -1);

         iab_IPv6_Report_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("iab_IPv6_Report_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (iab_IPv4_AddressReport_r16 != null) iab_IPv4_AddressReport_r16.print (_sb, "iab_IPv4_AddressReport_r16", _level+1);
      if (iab_IPv6_Report_r16 != null) iab_IPv6_Report_r16.print (_sb, "iab_IPv6_Report_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
