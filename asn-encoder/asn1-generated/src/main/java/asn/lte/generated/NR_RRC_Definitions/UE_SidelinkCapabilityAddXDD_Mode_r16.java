/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_SidelinkCapabilityAddXDD_Mode_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-SidelinkCapabilityAddXDD-Mode-r16";
   }

   public MAC_ParametersSidelinkXDD_Diff_r16 mac_ParametersSidelinkXDD_Diff_r16;  // optional

   public UE_SidelinkCapabilityAddXDD_Mode_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_SidelinkCapabilityAddXDD_Mode_r16 (
      MAC_ParametersSidelinkXDD_Diff_r16 mac_ParametersSidelinkXDD_Diff_r16_
   ) {
      super();
      mac_ParametersSidelinkXDD_Diff_r16 = mac_ParametersSidelinkXDD_Diff_r16_;
   }

   public void init () {
      mac_ParametersSidelinkXDD_Diff_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mac_ParametersSidelinkXDD_Diff_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mac-ParametersSidelinkXDD-Diff-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mac_ParametersSidelinkXDD_Diff_r16Present = buffer.decodeBit ("mac_ParametersSidelinkXDD_Diff_r16Present");

      // decode mac_ParametersSidelinkXDD_Diff_r16

      if (mac_ParametersSidelinkXDD_Diff_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mac_ParametersSidelinkXDD_Diff_r16", -1);

         mac_ParametersSidelinkXDD_Diff_r16 = new MAC_ParametersSidelinkXDD_Diff_r16();
         mac_ParametersSidelinkXDD_Diff_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mac_ParametersSidelinkXDD_Diff_r16", -1);
      }
      else {
         mac_ParametersSidelinkXDD_Diff_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mac_ParametersSidelinkXDD_Diff_r16 != null) mac_ParametersSidelinkXDD_Diff_r16.print (_sb, "mac_ParametersSidelinkXDD_Diff_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
