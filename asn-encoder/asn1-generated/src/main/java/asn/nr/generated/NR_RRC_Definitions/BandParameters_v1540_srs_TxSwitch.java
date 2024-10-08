/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters_v1540_srs_TxSwitch extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch supportedSRS_TxPortSwitch = null;
   public Asn1Integer txSwitchImpactToRx;  // optional
   public Asn1Integer txSwitchWithAnotherBand;  // optional

   public BandParameters_v1540_srs_TxSwitch () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParameters_v1540_srs_TxSwitch (
      BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch supportedSRS_TxPortSwitch_,
      Asn1Integer txSwitchImpactToRx_,
      Asn1Integer txSwitchWithAnotherBand_
   ) {
      super();
      supportedSRS_TxPortSwitch = supportedSRS_TxPortSwitch_;
      txSwitchImpactToRx = txSwitchImpactToRx_;
      txSwitchWithAnotherBand = txSwitchWithAnotherBand_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandParameters_v1540_srs_TxSwitch (
      BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch supportedSRS_TxPortSwitch_
   ) {
      super();
      supportedSRS_TxPortSwitch = supportedSRS_TxPortSwitch_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandParameters_v1540_srs_TxSwitch (BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch supportedSRS_TxPortSwitch_,
      long txSwitchImpactToRx_,
      long txSwitchWithAnotherBand_
   ) {
      super();
      supportedSRS_TxPortSwitch = supportedSRS_TxPortSwitch_;
      txSwitchImpactToRx = new Asn1Integer (txSwitchImpactToRx_);
      txSwitchWithAnotherBand = new Asn1Integer (txSwitchWithAnotherBand_);
   }

   public void init () {
      supportedSRS_TxPortSwitch = null;
      txSwitchImpactToRx = null;
      txSwitchWithAnotherBand = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedSRS_TxPortSwitch;
         case 1: return txSwitchImpactToRx;
         case 2: return txSwitchWithAnotherBand;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedSRS-TxPortSwitch";
         case 1: return "txSwitchImpactToRx";
         case 2: return "txSwitchWithAnotherBand";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean txSwitchImpactToRxPresent = buffer.decodeBit ("txSwitchImpactToRxPresent");
      boolean txSwitchWithAnotherBandPresent = buffer.decodeBit ("txSwitchWithAnotherBandPresent");

      // decode supportedSRS_TxPortSwitch

      buffer.getContext().eventDispatcher.startElement("supportedSRS_TxPortSwitch", -1);

      {
         int tval = BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch.decodeEnumValue (buffer);
         supportedSRS_TxPortSwitch = BandParameters_v1540_srs_TxSwitch_supportedSRS_TxPortSwitch.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportedSRS_TxPortSwitch", -1);

      // decode txSwitchImpactToRx

      if (txSwitchImpactToRxPresent) {
         buffer.getContext().eventDispatcher.startElement("txSwitchImpactToRx", -1);

         txSwitchImpactToRx = new Asn1Integer();
         txSwitchImpactToRx.decode (buffer, 1, 32);

         buffer.invokeCharacters(txSwitchImpactToRx.toString());
         buffer.getContext().eventDispatcher.endElement("txSwitchImpactToRx", -1);
      }
      else {
         txSwitchImpactToRx = null;
      }

      // decode txSwitchWithAnotherBand

      if (txSwitchWithAnotherBandPresent) {
         buffer.getContext().eventDispatcher.startElement("txSwitchWithAnotherBand", -1);

         txSwitchWithAnotherBand = new Asn1Integer();
         txSwitchWithAnotherBand.decode (buffer, 1, 32);

         buffer.invokeCharacters(txSwitchWithAnotherBand.toString());
         buffer.getContext().eventDispatcher.endElement("txSwitchWithAnotherBand", -1);
      }
      else {
         txSwitchWithAnotherBand = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((txSwitchImpactToRx != null), null);
      buffer.encodeBit ((txSwitchWithAnotherBand != null), null);

      // encode supportedSRS_TxPortSwitch

      if (supportedSRS_TxPortSwitch != null) {
         buffer.getContext().eventDispatcher.startElement("supportedSRS_TxPortSwitch", -1);

         supportedSRS_TxPortSwitch.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedSRS_TxPortSwitch", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedSRS_TxPortSwitch");

      // encode txSwitchImpactToRx

      if (txSwitchImpactToRx != null) {
         buffer.getContext().eventDispatcher.startElement("txSwitchImpactToRx", -1);

         txSwitchImpactToRx.encode (buffer, 1, 32);

         buffer.getContext().eventDispatcher.endElement("txSwitchImpactToRx", -1);
      }

      // encode txSwitchWithAnotherBand

      if (txSwitchWithAnotherBand != null) {
         buffer.getContext().eventDispatcher.startElement("txSwitchWithAnotherBand", -1);

         txSwitchWithAnotherBand.encode (buffer, 1, 32);

         buffer.getContext().eventDispatcher.endElement("txSwitchWithAnotherBand", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedSRS_TxPortSwitch != null) supportedSRS_TxPortSwitch.print (_sb, "supportedSRS_TxPortSwitch", _level+1);
      if (txSwitchImpactToRx != null) txSwitchImpactToRx.print (_sb, "txSwitchImpactToRx", _level+1);
      if (txSwitchWithAnotherBand != null) txSwitchWithAnotherBand.print (_sb, "txSwitchWithAnotherBand", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
