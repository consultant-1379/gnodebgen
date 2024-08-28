/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CommConfig_r12_commTxResources_r12_setup_scheduled_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public C_RNTI sl_RNTI_r12;
   public MAC_MainConfigSL_r12 mac_MainConfig_r12;
   public SL_CommResourcePool_r12 sc_CommTxConfig_r12;
   public Asn1Integer mcs_r12;  // optional

   public SL_CommConfig_r12_commTxResources_r12_setup_scheduled_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CommConfig_r12_commTxResources_r12_setup_scheduled_r12 (
      C_RNTI sl_RNTI_r12_,
      MAC_MainConfigSL_r12 mac_MainConfig_r12_,
      SL_CommResourcePool_r12 sc_CommTxConfig_r12_,
      Asn1Integer mcs_r12_
   ) {
      super();
      sl_RNTI_r12 = sl_RNTI_r12_;
      mac_MainConfig_r12 = mac_MainConfig_r12_;
      sc_CommTxConfig_r12 = sc_CommTxConfig_r12_;
      mcs_r12 = mcs_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_CommConfig_r12_commTxResources_r12_setup_scheduled_r12 (
      C_RNTI sl_RNTI_r12_,
      MAC_MainConfigSL_r12 mac_MainConfig_r12_,
      SL_CommResourcePool_r12 sc_CommTxConfig_r12_
   ) {
      super();
      sl_RNTI_r12 = sl_RNTI_r12_;
      mac_MainConfig_r12 = mac_MainConfig_r12_;
      sc_CommTxConfig_r12 = sc_CommTxConfig_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_CommConfig_r12_commTxResources_r12_setup_scheduled_r12 (C_RNTI sl_RNTI_r12_,
      MAC_MainConfigSL_r12 mac_MainConfig_r12_,
      SL_CommResourcePool_r12 sc_CommTxConfig_r12_,
      long mcs_r12_
   ) {
      super();
      sl_RNTI_r12 = sl_RNTI_r12_;
      mac_MainConfig_r12 = mac_MainConfig_r12_;
      sc_CommTxConfig_r12 = sc_CommTxConfig_r12_;
      mcs_r12 = new Asn1Integer (mcs_r12_);
   }

   public void init () {
      sl_RNTI_r12 = null;
      mac_MainConfig_r12 = null;
      sc_CommTxConfig_r12 = null;
      mcs_r12 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_RNTI_r12;
         case 1: return mac_MainConfig_r12;
         case 2: return sc_CommTxConfig_r12;
         case 3: return mcs_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-RNTI-r12";
         case 1: return "mac-MainConfig-r12";
         case 2: return "sc-CommTxConfig-r12";
         case 3: return "mcs-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mcs_r12Present = buffer.decodeBit ("mcs_r12Present");

      // decode sl_RNTI_r12

      buffer.getContext().eventDispatcher.startElement("sl_RNTI_r12", -1);

      sl_RNTI_r12 = new C_RNTI();
      sl_RNTI_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_RNTI_r12", -1);

      // decode mac_MainConfig_r12

      buffer.getContext().eventDispatcher.startElement("mac_MainConfig_r12", -1);

      mac_MainConfig_r12 = new MAC_MainConfigSL_r12();
      mac_MainConfig_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mac_MainConfig_r12", -1);

      // decode sc_CommTxConfig_r12

      buffer.getContext().eventDispatcher.startElement("sc_CommTxConfig_r12", -1);

      sc_CommTxConfig_r12 = new SL_CommResourcePool_r12();
      sc_CommTxConfig_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sc_CommTxConfig_r12", -1);

      // decode mcs_r12

      if (mcs_r12Present) {
         buffer.getContext().eventDispatcher.startElement("mcs_r12", -1);

         mcs_r12 = new Asn1Integer();
         mcs_r12.decode (buffer, 0, 28);

         buffer.invokeCharacters(mcs_r12.toString());
         buffer.getContext().eventDispatcher.endElement("mcs_r12", -1);
      }
      else {
         mcs_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_RNTI_r12 != null) sl_RNTI_r12.print (_sb, "sl_RNTI_r12", _level+1);
      if (mac_MainConfig_r12 != null) mac_MainConfig_r12.print (_sb, "mac_MainConfig_r12", _level+1);
      if (sc_CommTxConfig_r12 != null) sc_CommTxConfig_r12.print (_sb, "sc_CommTxConfig_r12", _level+1);
      if (mcs_r12 != null) mcs_r12.print (_sb, "mcs_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
