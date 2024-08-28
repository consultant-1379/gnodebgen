/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_drb extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PDCP_Config_drb_discardTimer discardTimer = null;  // optional
   public PDCP_Config_drb_pdcp_SN_SizeUL pdcp_SN_SizeUL = null;  // optional
   public PDCP_Config_drb_pdcp_SN_SizeDL pdcp_SN_SizeDL = null;  // optional
   public PDCP_Config_drb_headerCompression headerCompression;
   public PDCP_Config_drb_integrityProtection integrityProtection = null;  // optional
   public PDCP_Config_drb_statusReportRequired statusReportRequired = null;  // optional
   public PDCP_Config_drb_outOfOrderDelivery outOfOrderDelivery = null;  // optional

   public PDCP_Config_drb () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Config_drb (
      PDCP_Config_drb_discardTimer discardTimer_,
      PDCP_Config_drb_pdcp_SN_SizeUL pdcp_SN_SizeUL_,
      PDCP_Config_drb_pdcp_SN_SizeDL pdcp_SN_SizeDL_,
      PDCP_Config_drb_headerCompression headerCompression_,
      PDCP_Config_drb_integrityProtection integrityProtection_,
      PDCP_Config_drb_statusReportRequired statusReportRequired_,
      PDCP_Config_drb_outOfOrderDelivery outOfOrderDelivery_
   ) {
      super();
      discardTimer = discardTimer_;
      pdcp_SN_SizeUL = pdcp_SN_SizeUL_;
      pdcp_SN_SizeDL = pdcp_SN_SizeDL_;
      headerCompression = headerCompression_;
      integrityProtection = integrityProtection_;
      statusReportRequired = statusReportRequired_;
      outOfOrderDelivery = outOfOrderDelivery_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PDCP_Config_drb (
      PDCP_Config_drb_headerCompression headerCompression_
   ) {
      super();
      headerCompression = headerCompression_;
   }

   public void init () {
      discardTimer = null;
      pdcp_SN_SizeUL = null;
      pdcp_SN_SizeDL = null;
      headerCompression = null;
      integrityProtection = null;
      statusReportRequired = null;
      outOfOrderDelivery = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return discardTimer;
         case 1: return pdcp_SN_SizeUL;
         case 2: return pdcp_SN_SizeDL;
         case 3: return headerCompression;
         case 4: return integrityProtection;
         case 5: return statusReportRequired;
         case 6: return outOfOrderDelivery;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "discardTimer";
         case 1: return "pdcp-SN-SizeUL";
         case 2: return "pdcp-SN-SizeDL";
         case 3: return "headerCompression";
         case 4: return "integrityProtection";
         case 5: return "statusReportRequired";
         case 6: return "outOfOrderDelivery";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean discardTimerPresent = buffer.decodeBit ("discardTimerPresent");
      boolean pdcp_SN_SizeULPresent = buffer.decodeBit ("pdcp_SN_SizeULPresent");
      boolean pdcp_SN_SizeDLPresent = buffer.decodeBit ("pdcp_SN_SizeDLPresent");
      boolean integrityProtectionPresent = buffer.decodeBit ("integrityProtectionPresent");
      boolean statusReportRequiredPresent = buffer.decodeBit ("statusReportRequiredPresent");
      boolean outOfOrderDeliveryPresent = buffer.decodeBit ("outOfOrderDeliveryPresent");

      // decode discardTimer

      if (discardTimerPresent) {
         buffer.getContext().eventDispatcher.startElement("discardTimer", -1);

         int tval = PDCP_Config_drb_discardTimer.decodeEnumValue (buffer);
         discardTimer = PDCP_Config_drb_discardTimer.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("discardTimer", -1);
      }
      else {
         discardTimer = null;
      }

      // decode pdcp_SN_SizeUL

      if (pdcp_SN_SizeULPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_SN_SizeUL", -1);

         int tval = PDCP_Config_drb_pdcp_SN_SizeUL.decodeEnumValue (buffer);
         pdcp_SN_SizeUL = PDCP_Config_drb_pdcp_SN_SizeUL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_SN_SizeUL", -1);
      }
      else {
         pdcp_SN_SizeUL = null;
      }

      // decode pdcp_SN_SizeDL

      if (pdcp_SN_SizeDLPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_SN_SizeDL", -1);

         int tval = PDCP_Config_drb_pdcp_SN_SizeDL.decodeEnumValue (buffer);
         pdcp_SN_SizeDL = PDCP_Config_drb_pdcp_SN_SizeDL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_SN_SizeDL", -1);
      }
      else {
         pdcp_SN_SizeDL = null;
      }

      // decode headerCompression

      buffer.getContext().eventDispatcher.startElement("headerCompression", -1);

      headerCompression = new PDCP_Config_drb_headerCompression();
      headerCompression.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("headerCompression", -1);

      // decode integrityProtection

      if (integrityProtectionPresent) {
         buffer.getContext().eventDispatcher.startElement("integrityProtection", -1);

         int tval = PDCP_Config_drb_integrityProtection.decodeEnumValue (buffer);
         integrityProtection = PDCP_Config_drb_integrityProtection.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("integrityProtection", -1);
      }
      else {
         integrityProtection = null;
      }

      // decode statusReportRequired

      if (statusReportRequiredPresent) {
         buffer.getContext().eventDispatcher.startElement("statusReportRequired", -1);

         int tval = PDCP_Config_drb_statusReportRequired.decodeEnumValue (buffer);
         statusReportRequired = PDCP_Config_drb_statusReportRequired.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("statusReportRequired", -1);
      }
      else {
         statusReportRequired = null;
      }

      // decode outOfOrderDelivery

      if (outOfOrderDeliveryPresent) {
         buffer.getContext().eventDispatcher.startElement("outOfOrderDelivery", -1);

         int tval = PDCP_Config_drb_outOfOrderDelivery.decodeEnumValue (buffer);
         outOfOrderDelivery = PDCP_Config_drb_outOfOrderDelivery.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("outOfOrderDelivery", -1);
      }
      else {
         outOfOrderDelivery = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((discardTimer != null), null);
      buffer.encodeBit ((pdcp_SN_SizeUL != null), null);
      buffer.encodeBit ((pdcp_SN_SizeDL != null), null);
      buffer.encodeBit ((integrityProtection != null), null);
      buffer.encodeBit ((statusReportRequired != null), null);
      buffer.encodeBit ((outOfOrderDelivery != null), null);

      // encode discardTimer

      if (discardTimer != null) {
         buffer.getContext().eventDispatcher.startElement("discardTimer", -1);

         discardTimer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("discardTimer", -1);
      }

      // encode pdcp_SN_SizeUL

      if (pdcp_SN_SizeUL != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_SN_SizeUL", -1);

         pdcp_SN_SizeUL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_SN_SizeUL", -1);
      }

      // encode pdcp_SN_SizeDL

      if (pdcp_SN_SizeDL != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_SN_SizeDL", -1);

         pdcp_SN_SizeDL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_SN_SizeDL", -1);
      }

      // encode headerCompression

      if (headerCompression != null) {
         buffer.getContext().eventDispatcher.startElement("headerCompression", -1);

         headerCompression.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("headerCompression", -1);
      }
      else throw new Asn1MissingRequiredException ("headerCompression");

      // encode integrityProtection

      if (integrityProtection != null) {
         buffer.getContext().eventDispatcher.startElement("integrityProtection", -1);

         integrityProtection.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("integrityProtection", -1);
      }

      // encode statusReportRequired

      if (statusReportRequired != null) {
         buffer.getContext().eventDispatcher.startElement("statusReportRequired", -1);

         statusReportRequired.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("statusReportRequired", -1);
      }

      // encode outOfOrderDelivery

      if (outOfOrderDelivery != null) {
         buffer.getContext().eventDispatcher.startElement("outOfOrderDelivery", -1);

         outOfOrderDelivery.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("outOfOrderDelivery", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (discardTimer != null) discardTimer.print (_sb, "discardTimer", _level+1);
      if (pdcp_SN_SizeUL != null) pdcp_SN_SizeUL.print (_sb, "pdcp_SN_SizeUL", _level+1);
      if (pdcp_SN_SizeDL != null) pdcp_SN_SizeDL.print (_sb, "pdcp_SN_SizeDL", _level+1);
      if (headerCompression != null) headerCompression.print (_sb, "headerCompression", _level+1);
      if (integrityProtection != null) integrityProtection.print (_sb, "integrityProtection", _level+1);
      if (statusReportRequired != null) statusReportRequired.print (_sb, "statusReportRequired", _level+1);
      if (outOfOrderDelivery != null) outOfOrderDelivery.print (_sb, "outOfOrderDelivery", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
