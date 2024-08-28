/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LWA_Parameters_v1440 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LWA-Parameters-v1440";
   }

   public LWA_Parameters_v1440_lwa_RLC_UM_r14 lwa_RLC_UM_r14 = null;  // optional

   public LWA_Parameters_v1440 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LWA_Parameters_v1440 (
      LWA_Parameters_v1440_lwa_RLC_UM_r14 lwa_RLC_UM_r14_
   ) {
      super();
      lwa_RLC_UM_r14 = lwa_RLC_UM_r14_;
   }

   public void init () {
      lwa_RLC_UM_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lwa_RLC_UM_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lwa-RLC-UM-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lwa_RLC_UM_r14Present = buffer.decodeBit ("lwa_RLC_UM_r14Present");

      // decode lwa_RLC_UM_r14

      if (lwa_RLC_UM_r14Present) {
         buffer.getContext().eventDispatcher.startElement("lwa_RLC_UM_r14", -1);

         int tval = LWA_Parameters_v1440_lwa_RLC_UM_r14.decodeEnumValue (buffer);
         lwa_RLC_UM_r14 = LWA_Parameters_v1440_lwa_RLC_UM_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lwa_RLC_UM_r14", -1);
      }
      else {
         lwa_RLC_UM_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (lwa_RLC_UM_r14 != null) lwa_RLC_UM_r14.print (_sb, "lwa_RLC_UM_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
