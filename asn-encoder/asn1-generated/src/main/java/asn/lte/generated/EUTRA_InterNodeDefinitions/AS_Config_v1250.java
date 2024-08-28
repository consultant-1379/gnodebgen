/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.WLAN_OffloadConfig_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_CommConfig_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_DiscConfig_r12;

public class AS_Config_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AS-Config-v1250";
   }

   public WLAN_OffloadConfig_r12 sourceWlan_OffloadConfig_r12;  // optional
   public SL_CommConfig_r12 sourceSL_CommConfig_r12;  // optional
   public SL_DiscConfig_r12 sourceSL_DiscConfig_r12;  // optional

   public AS_Config_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AS_Config_v1250 (
      WLAN_OffloadConfig_r12 sourceWlan_OffloadConfig_r12_,
      SL_CommConfig_r12 sourceSL_CommConfig_r12_,
      SL_DiscConfig_r12 sourceSL_DiscConfig_r12_
   ) {
      super();
      sourceWlan_OffloadConfig_r12 = sourceWlan_OffloadConfig_r12_;
      sourceSL_CommConfig_r12 = sourceSL_CommConfig_r12_;
      sourceSL_DiscConfig_r12 = sourceSL_DiscConfig_r12_;
   }

   public void init () {
      sourceWlan_OffloadConfig_r12 = null;
      sourceSL_CommConfig_r12 = null;
      sourceSL_DiscConfig_r12 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sourceWlan_OffloadConfig_r12;
         case 1: return sourceSL_CommConfig_r12;
         case 2: return sourceSL_DiscConfig_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sourceWlan-OffloadConfig-r12";
         case 1: return "sourceSL-CommConfig-r12";
         case 2: return "sourceSL-DiscConfig-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sourceWlan_OffloadConfig_r12Present = buffer.decodeBit ("sourceWlan_OffloadConfig_r12Present");
      boolean sourceSL_CommConfig_r12Present = buffer.decodeBit ("sourceSL_CommConfig_r12Present");
      boolean sourceSL_DiscConfig_r12Present = buffer.decodeBit ("sourceSL_DiscConfig_r12Present");

      // decode sourceWlan_OffloadConfig_r12

      if (sourceWlan_OffloadConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sourceWlan_OffloadConfig_r12", -1);

         sourceWlan_OffloadConfig_r12 = new WLAN_OffloadConfig_r12();
         sourceWlan_OffloadConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sourceWlan_OffloadConfig_r12", -1);
      }
      else {
         sourceWlan_OffloadConfig_r12 = null;
      }

      // decode sourceSL_CommConfig_r12

      if (sourceSL_CommConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sourceSL_CommConfig_r12", -1);

         sourceSL_CommConfig_r12 = new SL_CommConfig_r12();
         sourceSL_CommConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sourceSL_CommConfig_r12", -1);
      }
      else {
         sourceSL_CommConfig_r12 = null;
      }

      // decode sourceSL_DiscConfig_r12

      if (sourceSL_DiscConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sourceSL_DiscConfig_r12", -1);

         sourceSL_DiscConfig_r12 = new SL_DiscConfig_r12();
         sourceSL_DiscConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sourceSL_DiscConfig_r12", -1);
      }
      else {
         sourceSL_DiscConfig_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sourceWlan_OffloadConfig_r12 != null) sourceWlan_OffloadConfig_r12.print (_sb, "sourceWlan_OffloadConfig_r12", _level+1);
      if (sourceSL_CommConfig_r12 != null) sourceSL_CommConfig_r12.print (_sb, "sourceSL_CommConfig_r12", _level+1);
      if (sourceSL_DiscConfig_r12 != null) sourceSL_DiscConfig_r12.print (_sb, "sourceSL_DiscConfig_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
