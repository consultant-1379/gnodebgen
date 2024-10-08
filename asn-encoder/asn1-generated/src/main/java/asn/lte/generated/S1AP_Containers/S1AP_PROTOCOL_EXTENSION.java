/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_Containers;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_CommonDataTypes.ProtocolExtensionID;
import asn.lte.generated.S1AP_CommonDataTypes.Criticality;
import asn.lte.generated.S1AP_CommonDataTypes.Presence;

public class S1AP_PROTOCOL_EXTENSION {
   public ProtocolExtensionID id;
   public Criticality criticality;
   public Asn1OpenTypeField Extension;
   public Presence presence;

   public S1AP_PROTOCOL_EXTENSION() {
      id = null;
      criticality = null;
      Extension = null;
      presence = null;
   }

   public S1AP_PROTOCOL_EXTENSION(
      ProtocolExtensionID id_,
      Criticality criticality_,
      Asn1OpenTypeField Extension_,
      Presence presence_
      ) {
      id = id_;
      criticality = criticality_;
      Extension = Extension_;
      presence = presence_;
   }
}
