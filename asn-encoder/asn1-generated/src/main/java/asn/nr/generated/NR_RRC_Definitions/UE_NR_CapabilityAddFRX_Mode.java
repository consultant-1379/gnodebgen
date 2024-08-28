/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_NR_CapabilityAddFRX_Mode extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-NR-CapabilityAddFRX-Mode";
   }

   public Phy_ParametersFRX_Diff phy_ParametersFRX_Diff;  // optional
   public MeasAndMobParametersFRX_Diff measAndMobParametersFRX_Diff;  // optional

   public UE_NR_CapabilityAddFRX_Mode () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_NR_CapabilityAddFRX_Mode (
      Phy_ParametersFRX_Diff phy_ParametersFRX_Diff_,
      MeasAndMobParametersFRX_Diff measAndMobParametersFRX_Diff_
   ) {
      super();
      phy_ParametersFRX_Diff = phy_ParametersFRX_Diff_;
      measAndMobParametersFRX_Diff = measAndMobParametersFRX_Diff_;
   }

   public void init () {
      phy_ParametersFRX_Diff = null;
      measAndMobParametersFRX_Diff = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phy_ParametersFRX_Diff;
         case 1: return measAndMobParametersFRX_Diff;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phy-ParametersFRX-Diff";
         case 1: return "measAndMobParametersFRX-Diff";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean phy_ParametersFRX_DiffPresent = buffer.decodeBit ("phy_ParametersFRX_DiffPresent");
      boolean measAndMobParametersFRX_DiffPresent = buffer.decodeBit ("measAndMobParametersFRX_DiffPresent");

      // decode phy_ParametersFRX_Diff

      if (phy_ParametersFRX_DiffPresent) {
         buffer.getContext().eventDispatcher.startElement("phy_ParametersFRX_Diff", -1);

         phy_ParametersFRX_Diff = new Phy_ParametersFRX_Diff();
         phy_ParametersFRX_Diff.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phy_ParametersFRX_Diff", -1);
      }
      else {
         phy_ParametersFRX_Diff = null;
      }

      // decode measAndMobParametersFRX_Diff

      if (measAndMobParametersFRX_DiffPresent) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersFRX_Diff", -1);

         measAndMobParametersFRX_Diff = new MeasAndMobParametersFRX_Diff();
         measAndMobParametersFRX_Diff.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measAndMobParametersFRX_Diff", -1);
      }
      else {
         measAndMobParametersFRX_Diff = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((phy_ParametersFRX_Diff != null), null);
      buffer.encodeBit ((measAndMobParametersFRX_Diff != null), null);

      // encode phy_ParametersFRX_Diff

      if (phy_ParametersFRX_Diff != null) {
         buffer.getContext().eventDispatcher.startElement("phy_ParametersFRX_Diff", -1);

         phy_ParametersFRX_Diff.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("phy_ParametersFRX_Diff", -1);
      }

      // encode measAndMobParametersFRX_Diff

      if (measAndMobParametersFRX_Diff != null) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersFRX_Diff", -1);

         measAndMobParametersFRX_Diff.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measAndMobParametersFRX_Diff", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (phy_ParametersFRX_Diff != null) phy_ParametersFRX_Diff.print (_sb, "phy_ParametersFRX_Diff", _level+1);
      if (measAndMobParametersFRX_Diff != null) measAndMobParametersFRX_Diff.print (_sb, "measAndMobParametersFRX_Diff", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
