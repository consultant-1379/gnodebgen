/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNRDC_v1630 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CA-ParametersNRDC-v1630";
   }

   public CA_ParametersNR_v1610 ca_ParametersNR_ForDC_v1610;  // optional
   public CA_ParametersNR_v1630 ca_ParametersNR_ForDC_v1630;  // optional

   public CA_ParametersNRDC_v1630 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_ParametersNRDC_v1630 (
      CA_ParametersNR_v1610 ca_ParametersNR_ForDC_v1610_,
      CA_ParametersNR_v1630 ca_ParametersNR_ForDC_v1630_
   ) {
      super();
      ca_ParametersNR_ForDC_v1610 = ca_ParametersNR_ForDC_v1610_;
      ca_ParametersNR_ForDC_v1630 = ca_ParametersNR_ForDC_v1630_;
   }

   public void init () {
      ca_ParametersNR_ForDC_v1610 = null;
      ca_ParametersNR_ForDC_v1630 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ca_ParametersNR_ForDC_v1610;
         case 1: return ca_ParametersNR_ForDC_v1630;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ca-ParametersNR-ForDC-v1610";
         case 1: return "ca-ParametersNR-ForDC-v1630";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ca_ParametersNR_ForDC_v1610Present = buffer.decodeBit ("ca_ParametersNR_ForDC_v1610Present");
      boolean ca_ParametersNR_ForDC_v1630Present = buffer.decodeBit ("ca_ParametersNR_ForDC_v1630Present");

      // decode ca_ParametersNR_ForDC_v1610

      if (ca_ParametersNR_ForDC_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("ca_ParametersNR_ForDC_v1610", -1);

         ca_ParametersNR_ForDC_v1610 = new CA_ParametersNR_v1610();
         ca_ParametersNR_ForDC_v1610.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ca_ParametersNR_ForDC_v1610", -1);
      }
      else {
         ca_ParametersNR_ForDC_v1610 = null;
      }

      // decode ca_ParametersNR_ForDC_v1630

      if (ca_ParametersNR_ForDC_v1630Present) {
         buffer.getContext().eventDispatcher.startElement("ca_ParametersNR_ForDC_v1630", -1);

         ca_ParametersNR_ForDC_v1630 = new CA_ParametersNR_v1630();
         ca_ParametersNR_ForDC_v1630.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ca_ParametersNR_ForDC_v1630", -1);
      }
      else {
         ca_ParametersNR_ForDC_v1630 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ca_ParametersNR_ForDC_v1610 != null) ca_ParametersNR_ForDC_v1610.print (_sb, "ca_ParametersNR_ForDC_v1610", _level+1);
      if (ca_ParametersNR_ForDC_v1630 != null) ca_ParametersNR_ForDC_v1630.print (_sb, "ca_ParametersNR_ForDC_v1630", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
