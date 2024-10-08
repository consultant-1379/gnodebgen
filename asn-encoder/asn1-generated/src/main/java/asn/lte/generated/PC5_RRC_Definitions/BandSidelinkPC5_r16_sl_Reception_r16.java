/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelinkPC5_r16_sl_Reception_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public BandSidelinkPC5_r16_sl_Reception_r16_harq_RxProcessSidelink_r16 harq_RxProcessSidelink_r16 = null;
   public BandSidelinkPC5_r16_sl_Reception_r16_pscch_RxSidelink_r16 pscch_RxSidelink_r16 = null;
   public BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16 scs_CP_PatternRxSidelink_r16;  // optional
   public BandSidelinkPC5_r16_sl_Reception_r16_extendedCP_RxSidelink_r16 extendedCP_RxSidelink_r16 = null;  // optional

   public BandSidelinkPC5_r16_sl_Reception_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandSidelinkPC5_r16_sl_Reception_r16 (
      BandSidelinkPC5_r16_sl_Reception_r16_harq_RxProcessSidelink_r16 harq_RxProcessSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16_pscch_RxSidelink_r16 pscch_RxSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16 scs_CP_PatternRxSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16_extendedCP_RxSidelink_r16 extendedCP_RxSidelink_r16_
   ) {
      super();
      harq_RxProcessSidelink_r16 = harq_RxProcessSidelink_r16_;
      pscch_RxSidelink_r16 = pscch_RxSidelink_r16_;
      scs_CP_PatternRxSidelink_r16 = scs_CP_PatternRxSidelink_r16_;
      extendedCP_RxSidelink_r16 = extendedCP_RxSidelink_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandSidelinkPC5_r16_sl_Reception_r16 (
      BandSidelinkPC5_r16_sl_Reception_r16_harq_RxProcessSidelink_r16 harq_RxProcessSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16_pscch_RxSidelink_r16 pscch_RxSidelink_r16_
   ) {
      super();
      harq_RxProcessSidelink_r16 = harq_RxProcessSidelink_r16_;
      pscch_RxSidelink_r16 = pscch_RxSidelink_r16_;
   }

   public void init () {
      harq_RxProcessSidelink_r16 = null;
      pscch_RxSidelink_r16 = null;
      scs_CP_PatternRxSidelink_r16 = null;
      extendedCP_RxSidelink_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return harq_RxProcessSidelink_r16;
         case 1: return pscch_RxSidelink_r16;
         case 2: return scs_CP_PatternRxSidelink_r16;
         case 3: return extendedCP_RxSidelink_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "harq-RxProcessSidelink-r16";
         case 1: return "pscch-RxSidelink-r16";
         case 2: return "scs-CP-PatternRxSidelink-r16";
         case 3: return "extendedCP-RxSidelink-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scs_CP_PatternRxSidelink_r16Present = buffer.decodeBit ("scs_CP_PatternRxSidelink_r16Present");
      boolean extendedCP_RxSidelink_r16Present = buffer.decodeBit ("extendedCP_RxSidelink_r16Present");

      // decode harq_RxProcessSidelink_r16

      buffer.getContext().eventDispatcher.startElement("harq_RxProcessSidelink_r16", -1);

      {
         int tval = BandSidelinkPC5_r16_sl_Reception_r16_harq_RxProcessSidelink_r16.decodeEnumValue (buffer);
         harq_RxProcessSidelink_r16 = BandSidelinkPC5_r16_sl_Reception_r16_harq_RxProcessSidelink_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("harq_RxProcessSidelink_r16", -1);

      // decode pscch_RxSidelink_r16

      buffer.getContext().eventDispatcher.startElement("pscch_RxSidelink_r16", -1);

      {
         int tval = BandSidelinkPC5_r16_sl_Reception_r16_pscch_RxSidelink_r16.decodeEnumValue (buffer);
         pscch_RxSidelink_r16 = BandSidelinkPC5_r16_sl_Reception_r16_pscch_RxSidelink_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("pscch_RxSidelink_r16", -1);

      // decode scs_CP_PatternRxSidelink_r16

      if (scs_CP_PatternRxSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_CP_PatternRxSidelink_r16", -1);

         scs_CP_PatternRxSidelink_r16 = new BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16();
         scs_CP_PatternRxSidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scs_CP_PatternRxSidelink_r16", -1);
      }
      else {
         scs_CP_PatternRxSidelink_r16 = null;
      }

      // decode extendedCP_RxSidelink_r16

      if (extendedCP_RxSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("extendedCP_RxSidelink_r16", -1);

         int tval = BandSidelinkPC5_r16_sl_Reception_r16_extendedCP_RxSidelink_r16.decodeEnumValue (buffer);
         extendedCP_RxSidelink_r16 = BandSidelinkPC5_r16_sl_Reception_r16_extendedCP_RxSidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("extendedCP_RxSidelink_r16", -1);
      }
      else {
         extendedCP_RxSidelink_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (harq_RxProcessSidelink_r16 != null) harq_RxProcessSidelink_r16.print (_sb, "harq_RxProcessSidelink_r16", _level+1);
      if (pscch_RxSidelink_r16 != null) pscch_RxSidelink_r16.print (_sb, "pscch_RxSidelink_r16", _level+1);
      if (scs_CP_PatternRxSidelink_r16 != null) scs_CP_PatternRxSidelink_r16.print (_sb, "scs_CP_PatternRxSidelink_r16", _level+1);
      if (extendedCP_RxSidelink_r16 != null) extendedCP_RxSidelink_r16.print (_sb, "extendedCP_RxSidelink_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
