/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QuantityConfigRS_NR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QuantityConfigRS-NR-r15";
   }

   public FilterCoefficient filterCoeff_RSRP_r15 = null;  // default = FilterCoefficient.fc4()
   public FilterCoefficient filterCoeff_RSRQ_r15 = null;  // default = FilterCoefficient.fc4()
   public FilterCoefficient filterCoefficient_SINR_r13 = null;  // default = FilterCoefficient.fc4()

   public QuantityConfigRS_NR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QuantityConfigRS_NR_r15 (
      FilterCoefficient filterCoeff_RSRP_r15_,
      FilterCoefficient filterCoeff_RSRQ_r15_,
      FilterCoefficient filterCoefficient_SINR_r13_
   ) {
      super();
      filterCoeff_RSRP_r15 = filterCoeff_RSRP_r15_;
      filterCoeff_RSRQ_r15 = filterCoeff_RSRQ_r15_;
      filterCoefficient_SINR_r13 = filterCoefficient_SINR_r13_;
   }

   public void init () {
      filterCoeff_RSRP_r15 = FilterCoefficient.fc4();
      filterCoeff_RSRQ_r15 = FilterCoefficient.fc4();
      filterCoefficient_SINR_r13 = FilterCoefficient.fc4();
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return filterCoeff_RSRP_r15;
         case 1: return filterCoeff_RSRQ_r15;
         case 2: return filterCoefficient_SINR_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "filterCoeff-RSRP-r15";
         case 1: return "filterCoeff-RSRQ-r15";
         case 2: return "filterCoefficient-SINR-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean filterCoeff_RSRP_r15Present = buffer.decodeBit ("filterCoeff_RSRP_r15Present");
      boolean filterCoeff_RSRQ_r15Present = buffer.decodeBit ("filterCoeff_RSRQ_r15Present");
      boolean filterCoefficient_SINR_r13Present = buffer.decodeBit ("filterCoefficient_SINR_r13Present");

      // decode filterCoeff_RSRP_r15

      if (filterCoeff_RSRP_r15Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoeff_RSRP_r15", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoeff_RSRP_r15 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoeff_RSRP_r15", -1);
      }
      else {
         filterCoeff_RSRP_r15 = FilterCoefficient.fc4();
      }

      // decode filterCoeff_RSRQ_r15

      if (filterCoeff_RSRQ_r15Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoeff_RSRQ_r15", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoeff_RSRQ_r15 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoeff_RSRQ_r15", -1);
      }
      else {
         filterCoeff_RSRQ_r15 = FilterCoefficient.fc4();
      }

      // decode filterCoefficient_SINR_r13

      if (filterCoefficient_SINR_r13Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficient_SINR_r13", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficient_SINR_r13 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficient_SINR_r13", -1);
      }
      else {
         filterCoefficient_SINR_r13 = FilterCoefficient.fc4();
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (filterCoeff_RSRP_r15 != null) filterCoeff_RSRP_r15.print (_sb, "filterCoeff_RSRP_r15", _level+1);
      if (filterCoeff_RSRQ_r15 != null) filterCoeff_RSRQ_r15.print (_sb, "filterCoeff_RSRQ_r15", _level+1);
      if (filterCoefficient_SINR_r13 != null) filterCoefficient_SINR_r13.print (_sb, "filterCoefficient_SINR_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
