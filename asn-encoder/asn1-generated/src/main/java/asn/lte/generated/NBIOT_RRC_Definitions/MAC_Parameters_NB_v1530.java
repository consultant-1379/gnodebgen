/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_Parameters_NB_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-Parameters-NB-v1530";
   }

   public MAC_Parameters_NB_v1530_sr_SPS_BSR_r15 sr_SPS_BSR_r15 = null;  // optional

   public MAC_Parameters_NB_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_Parameters_NB_v1530 (
      MAC_Parameters_NB_v1530_sr_SPS_BSR_r15 sr_SPS_BSR_r15_
   ) {
      super();
      sr_SPS_BSR_r15 = sr_SPS_BSR_r15_;
   }

   public void init () {
      sr_SPS_BSR_r15 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sr_SPS_BSR_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sr-SPS-BSR-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sr_SPS_BSR_r15Present = buffer.decodeBit ("sr_SPS_BSR_r15Present");

      // decode sr_SPS_BSR_r15

      if (sr_SPS_BSR_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_SPS_BSR_r15", -1);

         int tval = MAC_Parameters_NB_v1530_sr_SPS_BSR_r15.decodeEnumValue (buffer);
         sr_SPS_BSR_r15 = MAC_Parameters_NB_v1530_sr_SPS_BSR_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sr_SPS_BSR_r15", -1);
      }
      else {
         sr_SPS_BSR_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sr_SPS_BSR_r15 != null) sr_SPS_BSR_r15.print (_sb, "sr_SPS_BSR_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
