/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultCBR_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultCBR-r14";
   }

   public SL_V2X_TxPoolReportIdentity_r14 poolIdentity_r14;
   public SL_CBR_r14 cbr_PSSCH_r14;
   public SL_CBR_r14 cbr_PSCCH_r14;  // optional

   public MeasResultCBR_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultCBR_r14 (
      SL_V2X_TxPoolReportIdentity_r14 poolIdentity_r14_,
      SL_CBR_r14 cbr_PSSCH_r14_,
      SL_CBR_r14 cbr_PSCCH_r14_
   ) {
      super();
      poolIdentity_r14 = poolIdentity_r14_;
      cbr_PSSCH_r14 = cbr_PSSCH_r14_;
      cbr_PSCCH_r14 = cbr_PSCCH_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultCBR_r14 (
      SL_V2X_TxPoolReportIdentity_r14 poolIdentity_r14_,
      SL_CBR_r14 cbr_PSSCH_r14_
   ) {
      super();
      poolIdentity_r14 = poolIdentity_r14_;
      cbr_PSSCH_r14 = cbr_PSSCH_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultCBR_r14 (long poolIdentity_r14_,
      long cbr_PSSCH_r14_,
      long cbr_PSCCH_r14_
   ) {
      super();
      poolIdentity_r14 = new SL_V2X_TxPoolReportIdentity_r14 (poolIdentity_r14_);
      cbr_PSSCH_r14 = new SL_CBR_r14 (cbr_PSSCH_r14_);
      cbr_PSCCH_r14 = new SL_CBR_r14 (cbr_PSCCH_r14_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultCBR_r14 (
      long poolIdentity_r14_,
      long cbr_PSSCH_r14_
   ) {
      super();
      poolIdentity_r14 = new SL_V2X_TxPoolReportIdentity_r14 (poolIdentity_r14_);
      cbr_PSSCH_r14 = new SL_CBR_r14 (cbr_PSSCH_r14_);
   }

   public void init () {
      poolIdentity_r14 = null;
      cbr_PSSCH_r14 = null;
      cbr_PSCCH_r14 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return poolIdentity_r14;
         case 1: return cbr_PSSCH_r14;
         case 2: return cbr_PSCCH_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "poolIdentity-r14";
         case 1: return "cbr-PSSCH-r14";
         case 2: return "cbr-PSCCH-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cbr_PSCCH_r14Present = buffer.decodeBit ("cbr_PSCCH_r14Present");

      // decode poolIdentity_r14

      buffer.getContext().eventDispatcher.startElement("poolIdentity_r14", -1);

      poolIdentity_r14 = new SL_V2X_TxPoolReportIdentity_r14();
      poolIdentity_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("poolIdentity_r14", -1);

      // decode cbr_PSSCH_r14

      buffer.getContext().eventDispatcher.startElement("cbr_PSSCH_r14", -1);

      cbr_PSSCH_r14 = new SL_CBR_r14();
      cbr_PSSCH_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cbr_PSSCH_r14", -1);

      // decode cbr_PSCCH_r14

      if (cbr_PSCCH_r14Present) {
         buffer.getContext().eventDispatcher.startElement("cbr_PSCCH_r14", -1);

         cbr_PSCCH_r14 = new SL_CBR_r14();
         cbr_PSCCH_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cbr_PSCCH_r14", -1);
      }
      else {
         cbr_PSCCH_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (poolIdentity_r14 != null) poolIdentity_r14.print (_sb, "poolIdentity_r14", _level+1);
      if (cbr_PSSCH_r14 != null) cbr_PSSCH_r14.print (_sb, "cbr_PSSCH_r14", _level+1);
      if (cbr_PSCCH_r14 != null) cbr_PSCCH_r14.print (_sb, "cbr_PSCCH_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
