/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_Parameters_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-Parameters-v1610";
   }

   public MAC_ParametersFRX_Diff_r16 mac_ParametersFRX_Diff_r16;  // optional

   public MAC_Parameters_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_Parameters_v1610 (
      MAC_ParametersFRX_Diff_r16 mac_ParametersFRX_Diff_r16_
   ) {
      super();
      mac_ParametersFRX_Diff_r16 = mac_ParametersFRX_Diff_r16_;
   }

   public void init () {
      mac_ParametersFRX_Diff_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mac_ParametersFRX_Diff_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mac-ParametersFRX-Diff-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mac_ParametersFRX_Diff_r16Present = buffer.decodeBit ("mac_ParametersFRX_Diff_r16Present");

      // decode mac_ParametersFRX_Diff_r16

      if (mac_ParametersFRX_Diff_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mac_ParametersFRX_Diff_r16", -1);

         mac_ParametersFRX_Diff_r16 = new MAC_ParametersFRX_Diff_r16();
         mac_ParametersFRX_Diff_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mac_ParametersFRX_Diff_r16", -1);
      }
      else {
         mac_ParametersFRX_Diff_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((mac_ParametersFRX_Diff_r16 != null), null);

      // encode mac_ParametersFRX_Diff_r16

      if (mac_ParametersFRX_Diff_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mac_ParametersFRX_Diff_r16", -1);

         mac_ParametersFRX_Diff_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mac_ParametersFRX_Diff_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mac_ParametersFRX_Diff_r16 != null) mac_ParametersFRX_Diff_r16.print (_sb, "mac_ParametersFRX_Diff_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
