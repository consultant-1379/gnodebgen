/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNRDC_v1640 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CA-ParametersNRDC-v1640";
   }

   public CA_ParametersNR_v1640 ca_ParametersNR_ForDC_v1640;  // optional

   public CA_ParametersNRDC_v1640 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_ParametersNRDC_v1640 (
      CA_ParametersNR_v1640 ca_ParametersNR_ForDC_v1640_
   ) {
      super();
      ca_ParametersNR_ForDC_v1640 = ca_ParametersNR_ForDC_v1640_;
   }

   public void init () {
      ca_ParametersNR_ForDC_v1640 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ca_ParametersNR_ForDC_v1640;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ca-ParametersNR-ForDC-v1640";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ca_ParametersNR_ForDC_v1640Present = buffer.decodeBit ("ca_ParametersNR_ForDC_v1640Present");

      // decode ca_ParametersNR_ForDC_v1640

      if (ca_ParametersNR_ForDC_v1640Present) {
         buffer.getContext().eventDispatcher.startElement("ca_ParametersNR_ForDC_v1640", -1);

         ca_ParametersNR_ForDC_v1640 = new CA_ParametersNR_v1640();
         ca_ParametersNR_ForDC_v1640.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ca_ParametersNR_ForDC_v1640", -1);
      }
      else {
         ca_ParametersNR_ForDC_v1640 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((ca_ParametersNR_ForDC_v1640 != null), null);

      // encode ca_ParametersNR_ForDC_v1640

      if (ca_ParametersNR_ForDC_v1640 != null) {
         buffer.getContext().eventDispatcher.startElement("ca_ParametersNR_ForDC_v1640", -1);

         ca_ParametersNR_ForDC_v1640.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ca_ParametersNR_ForDC_v1640", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ca_ParametersNR_ForDC_v1640 != null) ca_ParametersNR_ForDC_v1640.print (_sb, "ca_ParametersNR_ForDC_v1640", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
