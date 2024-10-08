/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.EUTRA_CarrierList_r15;

public class VarMeasIdleConfig_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarMeasIdleConfig-r15";
   }

   public EUTRA_CarrierList_r15 measIdleCarrierListEUTRA_r15;  // optional
   public VarMeasIdleConfig_r15_measIdleDuration_r15 measIdleDuration_r15 = null;

   public VarMeasIdleConfig_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarMeasIdleConfig_r15 (
      EUTRA_CarrierList_r15 measIdleCarrierListEUTRA_r15_,
      VarMeasIdleConfig_r15_measIdleDuration_r15 measIdleDuration_r15_
   ) {
      super();
      measIdleCarrierListEUTRA_r15 = measIdleCarrierListEUTRA_r15_;
      measIdleDuration_r15 = measIdleDuration_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public VarMeasIdleConfig_r15 (
      VarMeasIdleConfig_r15_measIdleDuration_r15 measIdleDuration_r15_
   ) {
      super();
      measIdleDuration_r15 = measIdleDuration_r15_;
   }

   public void init () {
      measIdleCarrierListEUTRA_r15 = null;
      measIdleDuration_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measIdleCarrierListEUTRA_r15;
         case 1: return measIdleDuration_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measIdleCarrierListEUTRA-r15";
         case 1: return "measIdleDuration-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measIdleCarrierListEUTRA_r15Present = buffer.decodeBit ("measIdleCarrierListEUTRA_r15Present");

      // decode measIdleCarrierListEUTRA_r15

      if (measIdleCarrierListEUTRA_r15Present) {
         buffer.getContext().eventDispatcher.startElement("measIdleCarrierListEUTRA_r15", -1);

         measIdleCarrierListEUTRA_r15 = new EUTRA_CarrierList_r15();
         measIdleCarrierListEUTRA_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdleCarrierListEUTRA_r15", -1);
      }
      else {
         measIdleCarrierListEUTRA_r15 = null;
      }

      // decode measIdleDuration_r15

      buffer.getContext().eventDispatcher.startElement("measIdleDuration_r15", -1);

      {
         int tval = VarMeasIdleConfig_r15_measIdleDuration_r15.decodeEnumValue (buffer);
         measIdleDuration_r15 = VarMeasIdleConfig_r15_measIdleDuration_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measIdleDuration_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measIdleCarrierListEUTRA_r15 != null) measIdleCarrierListEUTRA_r15.print (_sb, "measIdleCarrierListEUTRA_r15", _level+1);
      if (measIdleDuration_r15 != null) measIdleDuration_r15.print (_sb, "measIdleDuration_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
