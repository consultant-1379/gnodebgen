/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_drb_headerCompression_rohc extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer maxCID;  // default = 15()
   public PDCP_Config_drb_headerCompression_rohc_profiles profiles;
   public PDCP_Config_drb_headerCompression_rohc_drb_ContinueROHC drb_ContinueROHC = null;  // optional

   public PDCP_Config_drb_headerCompression_rohc () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Config_drb_headerCompression_rohc (
      Asn1Integer maxCID_,
      PDCP_Config_drb_headerCompression_rohc_profiles profiles_,
      PDCP_Config_drb_headerCompression_rohc_drb_ContinueROHC drb_ContinueROHC_
   ) {
      super();
      maxCID = maxCID_;
      profiles = profiles_;
      drb_ContinueROHC = drb_ContinueROHC_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PDCP_Config_drb_headerCompression_rohc (
      PDCP_Config_drb_headerCompression_rohc_profiles profiles_
   ) {
      super();
      maxCID = new Asn1Integer (15);
      profiles = profiles_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PDCP_Config_drb_headerCompression_rohc (long maxCID_,
      PDCP_Config_drb_headerCompression_rohc_profiles profiles_,
      PDCP_Config_drb_headerCompression_rohc_drb_ContinueROHC drb_ContinueROHC_
   ) {
      super();
      maxCID = new Asn1Integer (maxCID_);
      profiles = profiles_;
      drb_ContinueROHC = drb_ContinueROHC_;
   }

   public void init () {
      maxCID = new Asn1Integer (15);
      profiles = null;
      drb_ContinueROHC = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxCID;
         case 1: return profiles;
         case 2: return drb_ContinueROHC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxCID";
         case 1: return "profiles";
         case 2: return "drb-ContinueROHC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean maxCIDPresent = buffer.decodeBit ("maxCIDPresent");
      boolean drb_ContinueROHCPresent = buffer.decodeBit ("drb_ContinueROHCPresent");

      // decode maxCID

      if (maxCIDPresent) {
         buffer.getContext().eventDispatcher.startElement("maxCID", -1);

         maxCID = new Asn1Integer();
         maxCID.decode (buffer, 1, 16383);

         buffer.invokeCharacters(maxCID.toString());
         buffer.getContext().eventDispatcher.endElement("maxCID", -1);
      }
      else {
         maxCID = new Asn1Integer();
         maxCID.value = 15;
      }

      // decode profiles

      buffer.getContext().eventDispatcher.startElement("profiles", -1);

      profiles = new PDCP_Config_drb_headerCompression_rohc_profiles();
      profiles.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("profiles", -1);

      // decode drb_ContinueROHC

      if (drb_ContinueROHCPresent) {
         buffer.getContext().eventDispatcher.startElement("drb_ContinueROHC", -1);

         int tval = PDCP_Config_drb_headerCompression_rohc_drb_ContinueROHC.decodeEnumValue (buffer);
         drb_ContinueROHC = PDCP_Config_drb_headerCompression_rohc_drb_ContinueROHC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("drb_ContinueROHC", -1);
      }
      else {
         drb_ContinueROHC = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((!maxCID.equals (15)), null);
      buffer.encodeBit ((drb_ContinueROHC != null), null);

      // encode maxCID

      if (maxCID != null) {
         if (!maxCID.equals (15)) {
            buffer.getContext().eventDispatcher.startElement("maxCID", -1);

            maxCID.encode (buffer, 1, 16383);

            buffer.getContext().eventDispatcher.endElement("maxCID", -1);
         }
      }

      // encode profiles

      if (profiles != null) {
         buffer.getContext().eventDispatcher.startElement("profiles", -1);

         profiles.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("profiles", -1);
      }
      else throw new Asn1MissingRequiredException ("profiles");

      // encode drb_ContinueROHC

      if (drb_ContinueROHC != null) {
         buffer.getContext().eventDispatcher.startElement("drb_ContinueROHC", -1);

         drb_ContinueROHC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drb_ContinueROHC", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxCID != null) maxCID.print (_sb, "maxCID", _level+1);
      if (profiles != null) profiles.print (_sb, "profiles", _level+1);
      if (drb_ContinueROHC != null) drb_ContinueROHC.print (_sb, "drb_ContinueROHC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
