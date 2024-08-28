/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Containers;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.PrivateIE_ID;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;
import asn.lte.generated.X2AP_CommonDataTypes.Presence;

public class X2AP_PRIVATE_IES {
   public PrivateIE_ID id;
   public Criticality criticality;
   public Asn1OpenTypeField Value;
   public Presence presence;

   public X2AP_PRIVATE_IES() {
      id = null;
      criticality = null;
      Value = null;
      presence = null;
   }

   public X2AP_PRIVATE_IES(
      PrivateIE_ID id_,
      Criticality criticality_,
      Asn1OpenTypeField Value_,
      Presence presence_
      ) {
      id = id_;
      criticality = criticality_;
      Value = Value_;
      presence = presence_;
   }
}
