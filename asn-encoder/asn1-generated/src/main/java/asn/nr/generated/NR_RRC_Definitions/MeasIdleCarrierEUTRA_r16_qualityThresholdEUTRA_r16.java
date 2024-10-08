/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasIdleCarrierEUTRA_r16_qualityThresholdEUTRA_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_RangeEUTRA idleRSRP_Threshold_EUTRA_r16;  // optional
   public RSRQ_RangeEUTRA_r16 idleRSRQ_Threshold_EUTRA_r16;  // optional

   public MeasIdleCarrierEUTRA_r16_qualityThresholdEUTRA_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasIdleCarrierEUTRA_r16_qualityThresholdEUTRA_r16 (
      RSRP_RangeEUTRA idleRSRP_Threshold_EUTRA_r16_,
      RSRQ_RangeEUTRA_r16 idleRSRQ_Threshold_EUTRA_r16_
   ) {
      super();
      idleRSRP_Threshold_EUTRA_r16 = idleRSRP_Threshold_EUTRA_r16_;
      idleRSRQ_Threshold_EUTRA_r16 = idleRSRQ_Threshold_EUTRA_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasIdleCarrierEUTRA_r16_qualityThresholdEUTRA_r16 (long idleRSRP_Threshold_EUTRA_r16_,
      long idleRSRQ_Threshold_EUTRA_r16_
   ) {
      super();
      idleRSRP_Threshold_EUTRA_r16 = new RSRP_RangeEUTRA (idleRSRP_Threshold_EUTRA_r16_);
      idleRSRQ_Threshold_EUTRA_r16 = new RSRQ_RangeEUTRA_r16 (idleRSRQ_Threshold_EUTRA_r16_);
   }

   public void init () {
      idleRSRP_Threshold_EUTRA_r16 = null;
      idleRSRQ_Threshold_EUTRA_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return idleRSRP_Threshold_EUTRA_r16;
         case 1: return idleRSRQ_Threshold_EUTRA_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "idleRSRP-Threshold-EUTRA-r16";
         case 1: return "idleRSRQ-Threshold-EUTRA-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean idleRSRP_Threshold_EUTRA_r16Present = buffer.decodeBit ("idleRSRP_Threshold_EUTRA_r16Present");
      boolean idleRSRQ_Threshold_EUTRA_r16Present = buffer.decodeBit ("idleRSRQ_Threshold_EUTRA_r16Present");

      // decode idleRSRP_Threshold_EUTRA_r16

      if (idleRSRP_Threshold_EUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("idleRSRP_Threshold_EUTRA_r16", -1);

         idleRSRP_Threshold_EUTRA_r16 = new RSRP_RangeEUTRA();
         idleRSRP_Threshold_EUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("idleRSRP_Threshold_EUTRA_r16", -1);
      }
      else {
         idleRSRP_Threshold_EUTRA_r16 = null;
      }

      // decode idleRSRQ_Threshold_EUTRA_r16

      if (idleRSRQ_Threshold_EUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("idleRSRQ_Threshold_EUTRA_r16", -1);

         idleRSRQ_Threshold_EUTRA_r16 = new RSRQ_RangeEUTRA_r16();
         idleRSRQ_Threshold_EUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("idleRSRQ_Threshold_EUTRA_r16", -1);
      }
      else {
         idleRSRQ_Threshold_EUTRA_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((idleRSRP_Threshold_EUTRA_r16 != null), null);
      buffer.encodeBit ((idleRSRQ_Threshold_EUTRA_r16 != null), null);

      // encode idleRSRP_Threshold_EUTRA_r16

      if (idleRSRP_Threshold_EUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("idleRSRP_Threshold_EUTRA_r16", -1);

         idleRSRP_Threshold_EUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("idleRSRP_Threshold_EUTRA_r16", -1);
      }

      // encode idleRSRQ_Threshold_EUTRA_r16

      if (idleRSRQ_Threshold_EUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("idleRSRQ_Threshold_EUTRA_r16", -1);

         idleRSRQ_Threshold_EUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("idleRSRQ_Threshold_EUTRA_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (idleRSRP_Threshold_EUTRA_r16 != null) idleRSRP_Threshold_EUTRA_r16.print (_sb, "idleRSRP_Threshold_EUTRA_r16", _level+1);
      if (idleRSRQ_Threshold_EUTRA_r16 != null) idleRSRQ_Threshold_EUTRA_r16.print (_sb, "idleRSRQ_Threshold_EUTRA_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
