/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_MTC3_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SSB-MTC3-r16";
   }

   public SSB_MTC3_r16_periodicityAndOffset_r16 periodicityAndOffset_r16;
   public SSB_MTC3_r16_duration_r16 duration_r16 = null;
   public SSB_MTC3_r16_pci_List_r16 pci_List_r16;  // optional
   public SSB_MTC3_r16_ssb_ToMeasure_r16 ssb_ToMeasure_r16;  // optional

   public SSB_MTC3_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SSB_MTC3_r16 (
      SSB_MTC3_r16_periodicityAndOffset_r16 periodicityAndOffset_r16_,
      SSB_MTC3_r16_duration_r16 duration_r16_,
      SSB_MTC3_r16_pci_List_r16 pci_List_r16_,
      SSB_MTC3_r16_ssb_ToMeasure_r16 ssb_ToMeasure_r16_
   ) {
      super();
      periodicityAndOffset_r16 = periodicityAndOffset_r16_;
      duration_r16 = duration_r16_;
      pci_List_r16 = pci_List_r16_;
      ssb_ToMeasure_r16 = ssb_ToMeasure_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SSB_MTC3_r16 (
      SSB_MTC3_r16_periodicityAndOffset_r16 periodicityAndOffset_r16_,
      SSB_MTC3_r16_duration_r16 duration_r16_
   ) {
      super();
      periodicityAndOffset_r16 = periodicityAndOffset_r16_;
      duration_r16 = duration_r16_;
   }

   public void init () {
      periodicityAndOffset_r16 = null;
      duration_r16 = null;
      pci_List_r16 = null;
      ssb_ToMeasure_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return periodicityAndOffset_r16;
         case 1: return duration_r16;
         case 2: return pci_List_r16;
         case 3: return ssb_ToMeasure_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "periodicityAndOffset-r16";
         case 1: return "duration-r16";
         case 2: return "pci-List-r16";
         case 3: return "ssb-ToMeasure-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pci_List_r16Present = buffer.decodeBit ("pci_List_r16Present");
      boolean ssb_ToMeasure_r16Present = buffer.decodeBit ("ssb_ToMeasure_r16Present");

      // decode periodicityAndOffset_r16

      buffer.getContext().eventDispatcher.startElement("periodicityAndOffset_r16", -1);

      periodicityAndOffset_r16 = new SSB_MTC3_r16_periodicityAndOffset_r16();
      periodicityAndOffset_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("periodicityAndOffset_r16", -1);

      // decode duration_r16

      buffer.getContext().eventDispatcher.startElement("duration_r16", -1);

      {
         int tval = SSB_MTC3_r16_duration_r16.decodeEnumValue (buffer);
         duration_r16 = SSB_MTC3_r16_duration_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("duration_r16", -1);

      // decode pci_List_r16

      if (pci_List_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pci_List_r16", -1);

         pci_List_r16 = new SSB_MTC3_r16_pci_List_r16();
         pci_List_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pci_List_r16", -1);
      }
      else {
         pci_List_r16 = null;
      }

      // decode ssb_ToMeasure_r16

      if (ssb_ToMeasure_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ssb_ToMeasure_r16", -1);

         ssb_ToMeasure_r16 = new SSB_MTC3_r16_ssb_ToMeasure_r16();
         ssb_ToMeasure_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ssb_ToMeasure_r16", -1);
      }
      else {
         ssb_ToMeasure_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((pci_List_r16 != null), null);
      buffer.encodeBit ((ssb_ToMeasure_r16 != null), null);

      // encode periodicityAndOffset_r16

      if (periodicityAndOffset_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("periodicityAndOffset_r16", -1);

         periodicityAndOffset_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("periodicityAndOffset_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("periodicityAndOffset_r16");

      // encode duration_r16

      if (duration_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("duration_r16", -1);

         duration_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("duration_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("duration_r16");

      // encode pci_List_r16

      if (pci_List_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pci_List_r16", -1);

         pci_List_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pci_List_r16", -1);
      }

      // encode ssb_ToMeasure_r16

      if (ssb_ToMeasure_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ssb_ToMeasure_r16", -1);

         ssb_ToMeasure_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ssb_ToMeasure_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (periodicityAndOffset_r16 != null) periodicityAndOffset_r16.print (_sb, "periodicityAndOffset_r16", _level+1);
      if (duration_r16 != null) duration_r16.print (_sb, "duration_r16", _level+1);
      if (pci_List_r16 != null) pci_List_r16.print (_sb, "pci_List_r16", _level+1);
      if (ssb_ToMeasure_r16 != null) ssb_ToMeasure_r16.print (_sb, "ssb_ToMeasure_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
