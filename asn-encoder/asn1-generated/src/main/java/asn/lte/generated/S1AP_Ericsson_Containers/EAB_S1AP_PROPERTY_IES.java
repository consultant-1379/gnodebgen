/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_Ericsson_Containers;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_CriticalityIgnore;
import asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_PresenceOptional;

public class EAB_S1AP_PROPERTY_IES {
   public ProtocolIE_ID id;
   public EAB_CriticalityIgnore criticality;
   public Asn1OpenTypeField Value;
   public EAB_PresenceOptional presence;

   public EAB_S1AP_PROPERTY_IES() {
      id = null;
      criticality = null;
      Value = null;
      presence = null;
   }

   public EAB_S1AP_PROPERTY_IES(
      ProtocolIE_ID id_,
      EAB_CriticalityIgnore criticality_,
      Asn1OpenTypeField Value_,
      EAB_PresenceOptional presence_
      ) {
      id = id_;
      criticality = criticality_;
      Value = Value_;
      presence = presence_;
   }
}
