/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.PC5_RRC_Definitions.MasterInformationBlock_SL_V2X_r14_sl_Bandwidth_r14;
import asn.lte.generated.EUTRA_RRC_Definitions.TDD_ConfigSL_r12;

public class SBCCH_SL_BCH_MessageType_V2X_r14 extends MasterInformationBlock_SL_V2X_r14 {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SBCCH-SL-BCH-MessageType-V2X-r14";
   }

   public SBCCH_SL_BCH_MessageType_V2X_r14 () {
      super();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SBCCH_SL_BCH_MessageType_V2X_r14 (
      MasterInformationBlock_SL_V2X_r14_sl_Bandwidth_r14 sl_Bandwidth_r14_,
      TDD_ConfigSL_r12 tdd_ConfigSL_r14_,
      Asn1BitString directFrameNumber_r14_,
      Asn1Integer directSubframeNumber_r14_,
      Asn1Boolean inCoverage_r14_,
      Asn1BitString reserved_r14_
   ) {
      super (sl_Bandwidth_r14_, tdd_ConfigSL_r14_, directFrameNumber_r14_, directSubframeNumber_r14_, inCoverage_r14_, reserved_r14_);
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SBCCH_SL_BCH_MessageType_V2X_r14 (MasterInformationBlock_SL_V2X_r14_sl_Bandwidth_r14 sl_Bandwidth_r14_,
      TDD_ConfigSL_r12 tdd_ConfigSL_r14_,
      Asn1BitString directFrameNumber_r14_,
      long directSubframeNumber_r14_,
      boolean inCoverage_r14_,
      Asn1BitString reserved_r14_
   ) {
      super (sl_Bandwidth_r14_, tdd_ConfigSL_r14_, directFrameNumber_r14_, directSubframeNumber_r14_, inCoverage_r14_, reserved_r14_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer);

      buffer.invokeCharacters (toString());
   }

}
