/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_FormatConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUCCH-FormatConfig";
   }

   public PUCCH_FormatConfig_interslotFrequencyHopping interslotFrequencyHopping = null;  // optional
   public PUCCH_FormatConfig_additionalDMRS additionalDMRS = null;  // optional
   public PUCCH_MaxCodeRate maxCodeRate = null;  // optional
   public PUCCH_FormatConfig_nrofSlots nrofSlots = null;  // optional
   public PUCCH_FormatConfig_pi2BPSK pi2BPSK = null;  // optional
   public PUCCH_FormatConfig_simultaneousHARQ_ACK_CSI simultaneousHARQ_ACK_CSI = null;  // optional

   public PUCCH_FormatConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUCCH_FormatConfig (
      PUCCH_FormatConfig_interslotFrequencyHopping interslotFrequencyHopping_,
      PUCCH_FormatConfig_additionalDMRS additionalDMRS_,
      PUCCH_MaxCodeRate maxCodeRate_,
      PUCCH_FormatConfig_nrofSlots nrofSlots_,
      PUCCH_FormatConfig_pi2BPSK pi2BPSK_,
      PUCCH_FormatConfig_simultaneousHARQ_ACK_CSI simultaneousHARQ_ACK_CSI_
   ) {
      super();
      interslotFrequencyHopping = interslotFrequencyHopping_;
      additionalDMRS = additionalDMRS_;
      maxCodeRate = maxCodeRate_;
      nrofSlots = nrofSlots_;
      pi2BPSK = pi2BPSK_;
      simultaneousHARQ_ACK_CSI = simultaneousHARQ_ACK_CSI_;
   }

   public void init () {
      interslotFrequencyHopping = null;
      additionalDMRS = null;
      maxCodeRate = null;
      nrofSlots = null;
      pi2BPSK = null;
      simultaneousHARQ_ACK_CSI = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return interslotFrequencyHopping;
         case 1: return additionalDMRS;
         case 2: return maxCodeRate;
         case 3: return nrofSlots;
         case 4: return pi2BPSK;
         case 5: return simultaneousHARQ_ACK_CSI;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "interslotFrequencyHopping";
         case 1: return "additionalDMRS";
         case 2: return "maxCodeRate";
         case 3: return "nrofSlots";
         case 4: return "pi2BPSK";
         case 5: return "simultaneousHARQ-ACK-CSI";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean interslotFrequencyHoppingPresent = buffer.decodeBit ("interslotFrequencyHoppingPresent");
      boolean additionalDMRSPresent = buffer.decodeBit ("additionalDMRSPresent");
      boolean maxCodeRatePresent = buffer.decodeBit ("maxCodeRatePresent");
      boolean nrofSlotsPresent = buffer.decodeBit ("nrofSlotsPresent");
      boolean pi2BPSKPresent = buffer.decodeBit ("pi2BPSKPresent");
      boolean simultaneousHARQ_ACK_CSIPresent = buffer.decodeBit ("simultaneousHARQ_ACK_CSIPresent");

      // decode interslotFrequencyHopping

      if (interslotFrequencyHoppingPresent) {
         buffer.getContext().eventDispatcher.startElement("interslotFrequencyHopping", -1);

         int tval = PUCCH_FormatConfig_interslotFrequencyHopping.decodeEnumValue (buffer);
         interslotFrequencyHopping = PUCCH_FormatConfig_interslotFrequencyHopping.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("interslotFrequencyHopping", -1);
      }
      else {
         interslotFrequencyHopping = null;
      }

      // decode additionalDMRS

      if (additionalDMRSPresent) {
         buffer.getContext().eventDispatcher.startElement("additionalDMRS", -1);

         int tval = PUCCH_FormatConfig_additionalDMRS.decodeEnumValue (buffer);
         additionalDMRS = PUCCH_FormatConfig_additionalDMRS.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("additionalDMRS", -1);
      }
      else {
         additionalDMRS = null;
      }

      // decode maxCodeRate

      if (maxCodeRatePresent) {
         buffer.getContext().eventDispatcher.startElement("maxCodeRate", -1);

         int tval = PUCCH_MaxCodeRate.decodeEnumValue (buffer);
         maxCodeRate = PUCCH_MaxCodeRate.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxCodeRate", -1);
      }
      else {
         maxCodeRate = null;
      }

      // decode nrofSlots

      if (nrofSlotsPresent) {
         buffer.getContext().eventDispatcher.startElement("nrofSlots", -1);

         int tval = PUCCH_FormatConfig_nrofSlots.decodeEnumValue (buffer);
         nrofSlots = PUCCH_FormatConfig_nrofSlots.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nrofSlots", -1);
      }
      else {
         nrofSlots = null;
      }

      // decode pi2BPSK

      if (pi2BPSKPresent) {
         buffer.getContext().eventDispatcher.startElement("pi2BPSK", -1);

         int tval = PUCCH_FormatConfig_pi2BPSK.decodeEnumValue (buffer);
         pi2BPSK = PUCCH_FormatConfig_pi2BPSK.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pi2BPSK", -1);
      }
      else {
         pi2BPSK = null;
      }

      // decode simultaneousHARQ_ACK_CSI

      if (simultaneousHARQ_ACK_CSIPresent) {
         buffer.getContext().eventDispatcher.startElement("simultaneousHARQ_ACK_CSI", -1);

         int tval = PUCCH_FormatConfig_simultaneousHARQ_ACK_CSI.decodeEnumValue (buffer);
         simultaneousHARQ_ACK_CSI = PUCCH_FormatConfig_simultaneousHARQ_ACK_CSI.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simultaneousHARQ_ACK_CSI", -1);
      }
      else {
         simultaneousHARQ_ACK_CSI = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((interslotFrequencyHopping != null), null);
      buffer.encodeBit ((additionalDMRS != null), null);
      buffer.encodeBit ((maxCodeRate != null), null);
      buffer.encodeBit ((nrofSlots != null), null);
      buffer.encodeBit ((pi2BPSK != null), null);
      buffer.encodeBit ((simultaneousHARQ_ACK_CSI != null), null);

      // encode interslotFrequencyHopping

      if (interslotFrequencyHopping != null) {
         buffer.getContext().eventDispatcher.startElement("interslotFrequencyHopping", -1);

         interslotFrequencyHopping.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("interslotFrequencyHopping", -1);
      }

      // encode additionalDMRS

      if (additionalDMRS != null) {
         buffer.getContext().eventDispatcher.startElement("additionalDMRS", -1);

         additionalDMRS.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("additionalDMRS", -1);
      }

      // encode maxCodeRate

      if (maxCodeRate != null) {
         buffer.getContext().eventDispatcher.startElement("maxCodeRate", -1);

         maxCodeRate.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxCodeRate", -1);
      }

      // encode nrofSlots

      if (nrofSlots != null) {
         buffer.getContext().eventDispatcher.startElement("nrofSlots", -1);

         nrofSlots.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nrofSlots", -1);
      }

      // encode pi2BPSK

      if (pi2BPSK != null) {
         buffer.getContext().eventDispatcher.startElement("pi2BPSK", -1);

         pi2BPSK.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pi2BPSK", -1);
      }

      // encode simultaneousHARQ_ACK_CSI

      if (simultaneousHARQ_ACK_CSI != null) {
         buffer.getContext().eventDispatcher.startElement("simultaneousHARQ_ACK_CSI", -1);

         simultaneousHARQ_ACK_CSI.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("simultaneousHARQ_ACK_CSI", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (interslotFrequencyHopping != null) interslotFrequencyHopping.print (_sb, "interslotFrequencyHopping", _level+1);
      if (additionalDMRS != null) additionalDMRS.print (_sb, "additionalDMRS", _level+1);
      if (maxCodeRate != null) maxCodeRate.print (_sb, "maxCodeRate", _level+1);
      if (nrofSlots != null) nrofSlots.print (_sb, "nrofSlots", _level+1);
      if (pi2BPSK != null) pi2BPSK.print (_sb, "pi2BPSK", _level+1);
      if (simultaneousHARQ_ACK_CSI != null) simultaneousHARQ_ACK_CSI.print (_sb, "simultaneousHARQ_ACK_CSI", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
