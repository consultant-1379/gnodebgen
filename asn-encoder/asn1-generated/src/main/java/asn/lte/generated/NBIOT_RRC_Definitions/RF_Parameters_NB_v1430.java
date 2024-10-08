/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters_NB_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RF-Parameters-NB-v1430";
   }

   public RF_Parameters_NB_v1430_powerClassNB_14dBm_r14 powerClassNB_14dBm_r14 = null;  // optional

   public RF_Parameters_NB_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters_NB_v1430 (
      RF_Parameters_NB_v1430_powerClassNB_14dBm_r14 powerClassNB_14dBm_r14_
   ) {
      super();
      powerClassNB_14dBm_r14 = powerClassNB_14dBm_r14_;
   }

   public void init () {
      powerClassNB_14dBm_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return powerClassNB_14dBm_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "powerClassNB-14dBm-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean powerClassNB_14dBm_r14Present = buffer.decodeBit ("powerClassNB_14dBm_r14Present");

      // decode powerClassNB_14dBm_r14

      if (powerClassNB_14dBm_r14Present) {
         buffer.getContext().eventDispatcher.startElement("powerClassNB_14dBm_r14", -1);

         int tval = RF_Parameters_NB_v1430_powerClassNB_14dBm_r14.decodeEnumValue (buffer);
         powerClassNB_14dBm_r14 = RF_Parameters_NB_v1430_powerClassNB_14dBm_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("powerClassNB_14dBm_r14", -1);
      }
      else {
         powerClassNB_14dBm_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (powerClassNB_14dBm_r14 != null) powerClassNB_14dBm_r14.print (_sb, "powerClassNB_14dBm_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
