/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EthernetHeaderCompression_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EthernetHeaderCompression-r16";
   }

   public EthernetHeaderCompression_r16_ehc_Common_r16 ehc_Common_r16;
   public EthernetHeaderCompression_r16_ehc_Downlink_r16 ehc_Downlink_r16;  // optional
   public EthernetHeaderCompression_r16_ehc_Uplink_r16 ehc_Uplink_r16;  // optional

   public EthernetHeaderCompression_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EthernetHeaderCompression_r16 (
      EthernetHeaderCompression_r16_ehc_Common_r16 ehc_Common_r16_,
      EthernetHeaderCompression_r16_ehc_Downlink_r16 ehc_Downlink_r16_,
      EthernetHeaderCompression_r16_ehc_Uplink_r16 ehc_Uplink_r16_
   ) {
      super();
      ehc_Common_r16 = ehc_Common_r16_;
      ehc_Downlink_r16 = ehc_Downlink_r16_;
      ehc_Uplink_r16 = ehc_Uplink_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public EthernetHeaderCompression_r16 (
      EthernetHeaderCompression_r16_ehc_Common_r16 ehc_Common_r16_
   ) {
      super();
      ehc_Common_r16 = ehc_Common_r16_;
   }

   public void init () {
      ehc_Common_r16 = null;
      ehc_Downlink_r16 = null;
      ehc_Uplink_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ehc_Common_r16;
         case 1: return ehc_Downlink_r16;
         case 2: return ehc_Uplink_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ehc-Common-r16";
         case 1: return "ehc-Downlink-r16";
         case 2: return "ehc-Uplink-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ehc_Downlink_r16Present = buffer.decodeBit ("ehc_Downlink_r16Present");
      boolean ehc_Uplink_r16Present = buffer.decodeBit ("ehc_Uplink_r16Present");

      // decode ehc_Common_r16

      buffer.getContext().eventDispatcher.startElement("ehc_Common_r16", -1);

      ehc_Common_r16 = new EthernetHeaderCompression_r16_ehc_Common_r16();
      ehc_Common_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ehc_Common_r16", -1);

      // decode ehc_Downlink_r16

      if (ehc_Downlink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ehc_Downlink_r16", -1);

         ehc_Downlink_r16 = new EthernetHeaderCompression_r16_ehc_Downlink_r16();
         ehc_Downlink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ehc_Downlink_r16", -1);
      }
      else {
         ehc_Downlink_r16 = null;
      }

      // decode ehc_Uplink_r16

      if (ehc_Uplink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ehc_Uplink_r16", -1);

         ehc_Uplink_r16 = new EthernetHeaderCompression_r16_ehc_Uplink_r16();
         ehc_Uplink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ehc_Uplink_r16", -1);
      }
      else {
         ehc_Uplink_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((ehc_Downlink_r16 != null), null);
      buffer.encodeBit ((ehc_Uplink_r16 != null), null);

      // encode ehc_Common_r16

      if (ehc_Common_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ehc_Common_r16", -1);

         ehc_Common_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ehc_Common_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("ehc_Common_r16");

      // encode ehc_Downlink_r16

      if (ehc_Downlink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ehc_Downlink_r16", -1);

         ehc_Downlink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ehc_Downlink_r16", -1);
      }

      // encode ehc_Uplink_r16

      if (ehc_Uplink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ehc_Uplink_r16", -1);

         ehc_Uplink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ehc_Uplink_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ehc_Common_r16 != null) ehc_Common_r16.print (_sb, "ehc_Common_r16", _level+1);
      if (ehc_Downlink_r16 != null) ehc_Downlink_r16.print (_sb, "ehc_Downlink_r16", _level+1);
      if (ehc_Uplink_r16 != null) ehc_Uplink_r16.print (_sb, "ehc_Uplink_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
