/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EUTRA_PresenceAntennaPort1 extends Asn1Boolean {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EUTRA-PresenceAntennaPort1";
   }

   public EUTRA_PresenceAntennaPort1 () {
      super();
   }

   public EUTRA_PresenceAntennaPort1 (boolean value_) {
      super (value_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer);

      buffer.invokeCharacters (toString());
   }

}
