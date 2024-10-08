/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IRAT_ParametersCDMA2000_1XRTT_v920 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IRAT-ParametersCDMA2000-1XRTT-v920";
   }

   public IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_1XRTT_r9 e_CSFB_1XRTT_r9 = null;
   public IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_ConcPS_Mob1XRTT_r9 e_CSFB_ConcPS_Mob1XRTT_r9 = null;  // optional

   public IRAT_ParametersCDMA2000_1XRTT_v920 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IRAT_ParametersCDMA2000_1XRTT_v920 (
      IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_1XRTT_r9 e_CSFB_1XRTT_r9_,
      IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_ConcPS_Mob1XRTT_r9 e_CSFB_ConcPS_Mob1XRTT_r9_
   ) {
      super();
      e_CSFB_1XRTT_r9 = e_CSFB_1XRTT_r9_;
      e_CSFB_ConcPS_Mob1XRTT_r9 = e_CSFB_ConcPS_Mob1XRTT_r9_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public IRAT_ParametersCDMA2000_1XRTT_v920 (
      IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_1XRTT_r9 e_CSFB_1XRTT_r9_
   ) {
      super();
      e_CSFB_1XRTT_r9 = e_CSFB_1XRTT_r9_;
   }

   public void init () {
      e_CSFB_1XRTT_r9 = null;
      e_CSFB_ConcPS_Mob1XRTT_r9 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return e_CSFB_1XRTT_r9;
         case 1: return e_CSFB_ConcPS_Mob1XRTT_r9;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "e-CSFB-1XRTT-r9";
         case 1: return "e-CSFB-ConcPS-Mob1XRTT-r9";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean e_CSFB_ConcPS_Mob1XRTT_r9Present = buffer.decodeBit ("e_CSFB_ConcPS_Mob1XRTT_r9Present");

      // decode e_CSFB_1XRTT_r9

      buffer.getContext().eventDispatcher.startElement("e_CSFB_1XRTT_r9", -1);

      {
         int tval = IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_1XRTT_r9.decodeEnumValue (buffer);
         e_CSFB_1XRTT_r9 = IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_1XRTT_r9.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("e_CSFB_1XRTT_r9", -1);

      // decode e_CSFB_ConcPS_Mob1XRTT_r9

      if (e_CSFB_ConcPS_Mob1XRTT_r9Present) {
         buffer.getContext().eventDispatcher.startElement("e_CSFB_ConcPS_Mob1XRTT_r9", -1);

         int tval = IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_ConcPS_Mob1XRTT_r9.decodeEnumValue (buffer);
         e_CSFB_ConcPS_Mob1XRTT_r9 = IRAT_ParametersCDMA2000_1XRTT_v920_e_CSFB_ConcPS_Mob1XRTT_r9.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("e_CSFB_ConcPS_Mob1XRTT_r9", -1);
      }
      else {
         e_CSFB_ConcPS_Mob1XRTT_r9 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (e_CSFB_1XRTT_r9 != null) e_CSFB_1XRTT_r9.print (_sb, "e_CSFB_1XRTT_r9", _level+1);
      if (e_CSFB_ConcPS_Mob1XRTT_r9 != null) e_CSFB_ConcPS_Mob1XRTT_r9.print (_sb, "e_CSFB_ConcPS_Mob1XRTT_r9", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
