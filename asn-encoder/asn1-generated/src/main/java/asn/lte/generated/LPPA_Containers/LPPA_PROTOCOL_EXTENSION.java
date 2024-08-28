/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_Containers;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.LPPA_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.LPPA_CommonDataTypes.Criticality;
import asn.lte.generated.LPPA_CommonDataTypes.Presence;

public class LPPA_PROTOCOL_EXTENSION {
   public ProtocolIE_ID id;
   public Criticality criticality;
   public Asn1OpenTypeField Extension;
   public Presence presence;

   public LPPA_PROTOCOL_EXTENSION() {
      id = null;
      criticality = null;
      Extension = null;
      presence = null;
   }

   public LPPA_PROTOCOL_EXTENSION(
      ProtocolIE_ID id_,
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
