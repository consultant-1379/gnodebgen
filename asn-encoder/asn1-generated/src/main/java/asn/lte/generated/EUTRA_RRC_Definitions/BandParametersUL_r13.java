/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.CA_BandwidthClass_r10;
import asn.lte.generated.EUTRA_RRC_Definitions.MIMO_CapabilityUL_r10;

public class BandParametersUL_r13 extends CA_MIMO_ParametersUL_r10 {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandParametersUL-r13";
   }

   public BandParametersUL_r13 () {
      super();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParametersUL_r13 (
      CA_BandwidthClass_r10 ca_BandwidthClassUL_r10_,
      MIMO_CapabilityUL_r10 supportedMIMO_CapabilityUL_r10_
   ) {
      super (ca_BandwidthClassUL_r10_, supportedMIMO_CapabilityUL_r10_);
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandParametersUL_r13 (
      CA_BandwidthClass_r10 ca_BandwidthClassUL_r10_
   ) {
      super (ca_BandwidthClassUL_r10_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer);

      buffer.invokeCharacters (toString());
   }

}
