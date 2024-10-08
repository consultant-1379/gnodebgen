/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NRDC_Parameters_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NRDC-Parameters-v1610";
   }

   public MeasAndMobParametersMRDC_v1610 measAndMobParametersNRDC_v1610;  // optional

   public NRDC_Parameters_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NRDC_Parameters_v1610 (
      MeasAndMobParametersMRDC_v1610 measAndMobParametersNRDC_v1610_
   ) {
      super();
      measAndMobParametersNRDC_v1610 = measAndMobParametersNRDC_v1610_;
   }

   public void init () {
      measAndMobParametersNRDC_v1610 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measAndMobParametersNRDC_v1610;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measAndMobParametersNRDC-v1610";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measAndMobParametersNRDC_v1610Present = buffer.decodeBit ("measAndMobParametersNRDC_v1610Present");

      // decode measAndMobParametersNRDC_v1610

      if (measAndMobParametersNRDC_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersNRDC_v1610", -1);

         measAndMobParametersNRDC_v1610 = new MeasAndMobParametersMRDC_v1610();
         measAndMobParametersNRDC_v1610.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measAndMobParametersNRDC_v1610", -1);
      }
      else {
         measAndMobParametersNRDC_v1610 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measAndMobParametersNRDC_v1610 != null) measAndMobParametersNRDC_v1610.print (_sb, "measAndMobParametersNRDC_v1610", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
