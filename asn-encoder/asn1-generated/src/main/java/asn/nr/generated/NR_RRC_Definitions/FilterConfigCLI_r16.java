/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FilterConfigCLI_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FilterConfigCLI-r16";
   }

   public FilterCoefficient filterCoefficientSRS_RSRP_r16 = null;  // default = FilterCoefficient.fc4()
   public FilterCoefficient filterCoefficientCLI_RSSI_r16 = null;  // default = FilterCoefficient.fc4()

   public FilterConfigCLI_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FilterConfigCLI_r16 (
      FilterCoefficient filterCoefficientSRS_RSRP_r16_,
      FilterCoefficient filterCoefficientCLI_RSSI_r16_
   ) {
      super();
      filterCoefficientSRS_RSRP_r16 = filterCoefficientSRS_RSRP_r16_;
      filterCoefficientCLI_RSSI_r16 = filterCoefficientCLI_RSSI_r16_;
   }

   public void init () {
      filterCoefficientSRS_RSRP_r16 = FilterCoefficient.fc4();
      filterCoefficientCLI_RSSI_r16 = FilterCoefficient.fc4();
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return filterCoefficientSRS_RSRP_r16;
         case 1: return filterCoefficientCLI_RSSI_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "filterCoefficientSRS-RSRP-r16";
         case 1: return "filterCoefficientCLI-RSSI-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean filterCoefficientSRS_RSRP_r16Present = buffer.decodeBit ("filterCoefficientSRS_RSRP_r16Present");
      boolean filterCoefficientCLI_RSSI_r16Present = buffer.decodeBit ("filterCoefficientCLI_RSSI_r16Present");

      // decode filterCoefficientSRS_RSRP_r16

      if (filterCoefficientSRS_RSRP_r16Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficientSRS_RSRP_r16", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficientSRS_RSRP_r16 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficientSRS_RSRP_r16", -1);
      }
      else {
         filterCoefficientSRS_RSRP_r16 = FilterCoefficient.fc4();
      }

      // decode filterCoefficientCLI_RSSI_r16

      if (filterCoefficientCLI_RSSI_r16Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficientCLI_RSSI_r16", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficientCLI_RSSI_r16 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficientCLI_RSSI_r16", -1);
      }
      else {
         filterCoefficientCLI_RSSI_r16 = FilterCoefficient.fc4();
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((!filterCoefficientSRS_RSRP_r16.equals (FilterCoefficient.fc4())), null);
      buffer.encodeBit ((!filterCoefficientCLI_RSSI_r16.equals (FilterCoefficient.fc4())), null);

      // encode filterCoefficientSRS_RSRP_r16

      if (filterCoefficientSRS_RSRP_r16 != null) {
         if (!filterCoefficientSRS_RSRP_r16.equals (FilterCoefficient.fc4())) {
            buffer.getContext().eventDispatcher.startElement("filterCoefficientSRS_RSRP_r16", -1);

            filterCoefficientSRS_RSRP_r16.encode (buffer);

            buffer.getContext().eventDispatcher.endElement("filterCoefficientSRS_RSRP_r16", -1);
         }
      }

      // encode filterCoefficientCLI_RSSI_r16

      if (filterCoefficientCLI_RSSI_r16 != null) {
         if (!filterCoefficientCLI_RSSI_r16.equals (FilterCoefficient.fc4())) {
            buffer.getContext().eventDispatcher.startElement("filterCoefficientCLI_RSSI_r16", -1);

            filterCoefficientCLI_RSSI_r16.encode (buffer);

            buffer.getContext().eventDispatcher.endElement("filterCoefficientCLI_RSSI_r16", -1);
         }
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (filterCoefficientSRS_RSRP_r16 != null) filterCoefficientSRS_RSRP_r16.print (_sb, "filterCoefficientSRS_RSRP_r16", _level+1);
      if (filterCoefficientCLI_RSSI_r16 != null) filterCoefficientCLI_RSSI_r16.print (_sb, "filterCoefficientCLI_RSSI_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
