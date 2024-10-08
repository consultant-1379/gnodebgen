/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_NR_CapabilityAddXDD_Mode extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-NR-CapabilityAddXDD-Mode";
   }

   public Phy_ParametersXDD_Diff phy_ParametersXDD_Diff;  // optional
   public MAC_ParametersXDD_Diff mac_ParametersXDD_Diff;  // optional
   public MeasAndMobParametersXDD_Diff measAndMobParametersXDD_Diff;  // optional

   public UE_NR_CapabilityAddXDD_Mode () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_NR_CapabilityAddXDD_Mode (
      Phy_ParametersXDD_Diff phy_ParametersXDD_Diff_,
      MAC_ParametersXDD_Diff mac_ParametersXDD_Diff_,
      MeasAndMobParametersXDD_Diff measAndMobParametersXDD_Diff_
   ) {
      super();
      phy_ParametersXDD_Diff = phy_ParametersXDD_Diff_;
      mac_ParametersXDD_Diff = mac_ParametersXDD_Diff_;
      measAndMobParametersXDD_Diff = measAndMobParametersXDD_Diff_;
   }

   public void init () {
      phy_ParametersXDD_Diff = null;
      mac_ParametersXDD_Diff = null;
      measAndMobParametersXDD_Diff = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phy_ParametersXDD_Diff;
         case 1: return mac_ParametersXDD_Diff;
         case 2: return measAndMobParametersXDD_Diff;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phy-ParametersXDD-Diff";
         case 1: return "mac-ParametersXDD-Diff";
         case 2: return "measAndMobParametersXDD-Diff";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean phy_ParametersXDD_DiffPresent = buffer.decodeBit ("phy_ParametersXDD_DiffPresent");
      boolean mac_ParametersXDD_DiffPresent = buffer.decodeBit ("mac_ParametersXDD_DiffPresent");
      boolean measAndMobParametersXDD_DiffPresent = buffer.decodeBit ("measAndMobParametersXDD_DiffPresent");

      // decode phy_ParametersXDD_Diff

      if (phy_ParametersXDD_DiffPresent) {
         buffer.getContext().eventDispatcher.startElement("phy_ParametersXDD_Diff", -1);

         phy_ParametersXDD_Diff = new Phy_ParametersXDD_Diff();
         phy_ParametersXDD_Diff.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phy_ParametersXDD_Diff", -1);
      }
      else {
         phy_ParametersXDD_Diff = null;
      }

      // decode mac_ParametersXDD_Diff

      if (mac_ParametersXDD_DiffPresent) {
         buffer.getContext().eventDispatcher.startElement("mac_ParametersXDD_Diff", -1);

         mac_ParametersXDD_Diff = new MAC_ParametersXDD_Diff();
         mac_ParametersXDD_Diff.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mac_ParametersXDD_Diff", -1);
      }
      else {
         mac_ParametersXDD_Diff = null;
      }

      // decode measAndMobParametersXDD_Diff

      if (measAndMobParametersXDD_DiffPresent) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersXDD_Diff", -1);

         measAndMobParametersXDD_Diff = new MeasAndMobParametersXDD_Diff();
         measAndMobParametersXDD_Diff.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measAndMobParametersXDD_Diff", -1);
      }
      else {
         measAndMobParametersXDD_Diff = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (phy_ParametersXDD_Diff != null) phy_ParametersXDD_Diff.print (_sb, "phy_ParametersXDD_Diff", _level+1);
      if (mac_ParametersXDD_Diff != null) mac_ParametersXDD_Diff.print (_sb, "mac_ParametersXDD_Diff", _level+1);
      if (measAndMobParametersXDD_Diff != null) measAndMobParametersXDD_Diff.print (_sb, "measAndMobParametersXDD_Diff", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
