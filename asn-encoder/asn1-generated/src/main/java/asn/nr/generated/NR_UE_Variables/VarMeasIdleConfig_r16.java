/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.ValidityAreaList_r16;

public class VarMeasIdleConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarMeasIdleConfig-r16";
   }

   public VarMeasIdleConfig_r16_measIdleCarrierListNR_r16 measIdleCarrierListNR_r16;  // optional
   public VarMeasIdleConfig_r16_measIdleCarrierListEUTRA_r16 measIdleCarrierListEUTRA_r16;  // optional
   public VarMeasIdleConfig_r16_measIdleDuration_r16 measIdleDuration_r16 = null;
   public ValidityAreaList_r16 validityAreaList_r16;  // optional

   public VarMeasIdleConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarMeasIdleConfig_r16 (
      VarMeasIdleConfig_r16_measIdleCarrierListNR_r16 measIdleCarrierListNR_r16_,
      VarMeasIdleConfig_r16_measIdleCarrierListEUTRA_r16 measIdleCarrierListEUTRA_r16_,
      VarMeasIdleConfig_r16_measIdleDuration_r16 measIdleDuration_r16_,
      ValidityAreaList_r16 validityAreaList_r16_
   ) {
      super();
      measIdleCarrierListNR_r16 = measIdleCarrierListNR_r16_;
      measIdleCarrierListEUTRA_r16 = measIdleCarrierListEUTRA_r16_;
      measIdleDuration_r16 = measIdleDuration_r16_;
      validityAreaList_r16 = validityAreaList_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public VarMeasIdleConfig_r16 (
      VarMeasIdleConfig_r16_measIdleDuration_r16 measIdleDuration_r16_
   ) {
      super();
      measIdleDuration_r16 = measIdleDuration_r16_;
   }

   public void init () {
      measIdleCarrierListNR_r16 = null;
      measIdleCarrierListEUTRA_r16 = null;
      measIdleDuration_r16 = null;
      validityAreaList_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measIdleCarrierListNR_r16;
         case 1: return measIdleCarrierListEUTRA_r16;
         case 2: return measIdleDuration_r16;
         case 3: return validityAreaList_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measIdleCarrierListNR-r16";
         case 1: return "measIdleCarrierListEUTRA-r16";
         case 2: return "measIdleDuration-r16";
         case 3: return "validityAreaList-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measIdleCarrierListNR_r16Present = buffer.decodeBit ("measIdleCarrierListNR_r16Present");
      boolean measIdleCarrierListEUTRA_r16Present = buffer.decodeBit ("measIdleCarrierListEUTRA_r16Present");
      boolean validityAreaList_r16Present = buffer.decodeBit ("validityAreaList_r16Present");

      // decode measIdleCarrierListNR_r16

      if (measIdleCarrierListNR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measIdleCarrierListNR_r16", -1);

         measIdleCarrierListNR_r16 = new VarMeasIdleConfig_r16_measIdleCarrierListNR_r16();
         measIdleCarrierListNR_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdleCarrierListNR_r16", -1);
      }
      else {
         measIdleCarrierListNR_r16 = null;
      }

      // decode measIdleCarrierListEUTRA_r16

      if (measIdleCarrierListEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measIdleCarrierListEUTRA_r16", -1);

         measIdleCarrierListEUTRA_r16 = new VarMeasIdleConfig_r16_measIdleCarrierListEUTRA_r16();
         measIdleCarrierListEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdleCarrierListEUTRA_r16", -1);
      }
      else {
         measIdleCarrierListEUTRA_r16 = null;
      }

      // decode measIdleDuration_r16

      buffer.getContext().eventDispatcher.startElement("measIdleDuration_r16", -1);

      {
         int tval = VarMeasIdleConfig_r16_measIdleDuration_r16.decodeEnumValue (buffer);
         measIdleDuration_r16 = VarMeasIdleConfig_r16_measIdleDuration_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measIdleDuration_r16", -1);

      // decode validityAreaList_r16

      if (validityAreaList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("validityAreaList_r16", -1);

         validityAreaList_r16 = new ValidityAreaList_r16();
         validityAreaList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("validityAreaList_r16", -1);
      }
      else {
         validityAreaList_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measIdleCarrierListNR_r16 != null), null);
      buffer.encodeBit ((measIdleCarrierListEUTRA_r16 != null), null);
      buffer.encodeBit ((validityAreaList_r16 != null), null);

      // encode measIdleCarrierListNR_r16

      if (measIdleCarrierListNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measIdleCarrierListNR_r16", -1);

         measIdleCarrierListNR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measIdleCarrierListNR_r16", -1);
      }

      // encode measIdleCarrierListEUTRA_r16

      if (measIdleCarrierListEUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measIdleCarrierListEUTRA_r16", -1);

         measIdleCarrierListEUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measIdleCarrierListEUTRA_r16", -1);
      }

      // encode measIdleDuration_r16

      if (measIdleDuration_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measIdleDuration_r16", -1);

         measIdleDuration_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measIdleDuration_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("measIdleDuration_r16");

      // encode validityAreaList_r16

      if (validityAreaList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("validityAreaList_r16", -1);

         validityAreaList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("validityAreaList_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measIdleCarrierListNR_r16 != null) measIdleCarrierListNR_r16.print (_sb, "measIdleCarrierListNR_r16", _level+1);
      if (measIdleCarrierListEUTRA_r16 != null) measIdleCarrierListEUTRA_r16.print (_sb, "measIdleCarrierListEUTRA_r16", _level+1);
      if (measIdleDuration_r16 != null) measIdleDuration_r16.print (_sb, "measIdleDuration_r16", _level+1);
      if (validityAreaList_r16 != null) validityAreaList_r16.print (_sb, "validityAreaList_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
