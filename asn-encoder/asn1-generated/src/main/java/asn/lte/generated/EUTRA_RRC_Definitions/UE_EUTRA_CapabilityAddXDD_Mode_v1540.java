/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_CapabilityAddXDD_Mode_v1540 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-CapabilityAddXDD-Mode-v1540";
   }

   public EUTRA_5GC_Parameters_r15 eutra_5GC_Parameters_r15;  // optional
   public IRAT_ParametersNR_v1540 irat_ParametersNR_v1540;  // optional

   public UE_EUTRA_CapabilityAddXDD_Mode_v1540 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_CapabilityAddXDD_Mode_v1540 (
      EUTRA_5GC_Parameters_r15 eutra_5GC_Parameters_r15_,
      IRAT_ParametersNR_v1540 irat_ParametersNR_v1540_
   ) {
      super();
      eutra_5GC_Parameters_r15 = eutra_5GC_Parameters_r15_;
      irat_ParametersNR_v1540 = irat_ParametersNR_v1540_;
   }

   public void init () {
      eutra_5GC_Parameters_r15 = null;
      irat_ParametersNR_v1540 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eutra_5GC_Parameters_r15;
         case 1: return irat_ParametersNR_v1540;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eutra-5GC-Parameters-r15";
         case 1: return "irat-ParametersNR-v1540";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean eutra_5GC_Parameters_r15Present = buffer.decodeBit ("eutra_5GC_Parameters_r15Present");
      boolean irat_ParametersNR_v1540Present = buffer.decodeBit ("irat_ParametersNR_v1540Present");

      // decode eutra_5GC_Parameters_r15

      if (eutra_5GC_Parameters_r15Present) {
         buffer.getContext().eventDispatcher.startElement("eutra_5GC_Parameters_r15", -1);

         eutra_5GC_Parameters_r15 = new EUTRA_5GC_Parameters_r15();
         eutra_5GC_Parameters_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("eutra_5GC_Parameters_r15", -1);
      }
      else {
         eutra_5GC_Parameters_r15 = null;
      }

      // decode irat_ParametersNR_v1540

      if (irat_ParametersNR_v1540Present) {
         buffer.getContext().eventDispatcher.startElement("irat_ParametersNR_v1540", -1);

         irat_ParametersNR_v1540 = new IRAT_ParametersNR_v1540();
         irat_ParametersNR_v1540.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("irat_ParametersNR_v1540", -1);
      }
      else {
         irat_ParametersNR_v1540 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eutra_5GC_Parameters_r15 != null) eutra_5GC_Parameters_r15.print (_sb, "eutra_5GC_Parameters_r15", _level+1);
      if (irat_ParametersNR_v1540 != null) irat_ParametersNR_v1540.print (_sb, "irat_ParametersNR_v1540", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
