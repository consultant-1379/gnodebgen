/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FilterConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FilterConfig";
   }

   public FilterCoefficient filterCoefficientRSRP = null;  // default = FilterCoefficient.fc4()
   public FilterCoefficient filterCoefficientRSRQ = null;  // default = FilterCoefficient.fc4()
   public FilterCoefficient filterCoefficientRS_SINR = null;  // default = FilterCoefficient.fc4()

   public FilterConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FilterConfig (
      FilterCoefficient filterCoefficientRSRP_,
      FilterCoefficient filterCoefficientRSRQ_,
      FilterCoefficient filterCoefficientRS_SINR_
   ) {
      super();
      filterCoefficientRSRP = filterCoefficientRSRP_;
      filterCoefficientRSRQ = filterCoefficientRSRQ_;
      filterCoefficientRS_SINR = filterCoefficientRS_SINR_;
   }

   public void init () {
      filterCoefficientRSRP = FilterCoefficient.fc4();
      filterCoefficientRSRQ = FilterCoefficient.fc4();
      filterCoefficientRS_SINR = FilterCoefficient.fc4();
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return filterCoefficientRSRP;
         case 1: return filterCoefficientRSRQ;
         case 2: return filterCoefficientRS_SINR;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "filterCoefficientRSRP";
         case 1: return "filterCoefficientRSRQ";
         case 2: return "filterCoefficientRS-SINR";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean filterCoefficientRSRPPresent = buffer.decodeBit ("filterCoefficientRSRPPresent");
      boolean filterCoefficientRSRQPresent = buffer.decodeBit ("filterCoefficientRSRQPresent");
      boolean filterCoefficientRS_SINRPresent = buffer.decodeBit ("filterCoefficientRS_SINRPresent");

      // decode filterCoefficientRSRP

      if (filterCoefficientRSRPPresent) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficientRSRP", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficientRSRP = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficientRSRP", -1);
      }
      else {
         filterCoefficientRSRP = FilterCoefficient.fc4();
      }

      // decode filterCoefficientRSRQ

      if (filterCoefficientRSRQPresent) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficientRSRQ", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficientRSRQ = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficientRSRQ", -1);
      }
      else {
         filterCoefficientRSRQ = FilterCoefficient.fc4();
      }

      // decode filterCoefficientRS_SINR

      if (filterCoefficientRS_SINRPresent) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficientRS_SINR", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficientRS_SINR = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficientRS_SINR", -1);
      }
      else {
         filterCoefficientRS_SINR = FilterCoefficient.fc4();
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((!filterCoefficientRSRP.equals (FilterCoefficient.fc4())), null);
      buffer.encodeBit ((!filterCoefficientRSRQ.equals (FilterCoefficient.fc4())), null);
      buffer.encodeBit ((!filterCoefficientRS_SINR.equals (FilterCoefficient.fc4())), null);

      // encode filterCoefficientRSRP

      if (filterCoefficientRSRP != null) {
         if (!filterCoefficientRSRP.equals (FilterCoefficient.fc4())) {
            buffer.getContext().eventDispatcher.startElement("filterCoefficientRSRP", -1);

            filterCoefficientRSRP.encode (buffer);

            buffer.getContext().eventDispatcher.endElement("filterCoefficientRSRP", -1);
         }
      }

      // encode filterCoefficientRSRQ

      if (filterCoefficientRSRQ != null) {
         if (!filterCoefficientRSRQ.equals (FilterCoefficient.fc4())) {
            buffer.getContext().eventDispatcher.startElement("filterCoefficientRSRQ", -1);

            filterCoefficientRSRQ.encode (buffer);

            buffer.getContext().eventDispatcher.endElement("filterCoefficientRSRQ", -1);
         }
      }

      // encode filterCoefficientRS_SINR

      if (filterCoefficientRS_SINR != null) {
         if (!filterCoefficientRS_SINR.equals (FilterCoefficient.fc4())) {
            buffer.getContext().eventDispatcher.startElement("filterCoefficientRS_SINR", -1);

            filterCoefficientRS_SINR.encode (buffer);

            buffer.getContext().eventDispatcher.endElement("filterCoefficientRS_SINR", -1);
         }
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (filterCoefficientRSRP != null) filterCoefficientRSRP.print (_sb, "filterCoefficientRSRP", _level+1);
      if (filterCoefficientRSRQ != null) filterCoefficientRSRQ.print (_sb, "filterCoefficientRSRQ", _level+1);
      if (filterCoefficientRS_SINR != null) filterCoefficientRS_SINR.print (_sb, "filterCoefficientRS_SINR", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
