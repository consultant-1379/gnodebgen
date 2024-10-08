/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IRAT_ParametersCDMA2000_HRPD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IRAT-ParametersCDMA2000-HRPD";
   }

   public SupportedBandListHRPD supportedBandListHRPD;
   public IRAT_ParametersCDMA2000_HRPD_tx_ConfigHRPD tx_ConfigHRPD = null;
   public IRAT_ParametersCDMA2000_HRPD_rx_ConfigHRPD rx_ConfigHRPD = null;

   public IRAT_ParametersCDMA2000_HRPD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IRAT_ParametersCDMA2000_HRPD (
      SupportedBandListHRPD supportedBandListHRPD_,
      IRAT_ParametersCDMA2000_HRPD_tx_ConfigHRPD tx_ConfigHRPD_,
      IRAT_ParametersCDMA2000_HRPD_rx_ConfigHRPD rx_ConfigHRPD_
   ) {
      super();
      supportedBandListHRPD = supportedBandListHRPD_;
      tx_ConfigHRPD = tx_ConfigHRPD_;
      rx_ConfigHRPD = rx_ConfigHRPD_;
   }

   public void init () {
      supportedBandListHRPD = null;
      tx_ConfigHRPD = null;
      rx_ConfigHRPD = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandListHRPD;
         case 1: return tx_ConfigHRPD;
         case 2: return rx_ConfigHRPD;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandListHRPD";
         case 1: return "tx-ConfigHRPD";
         case 2: return "rx-ConfigHRPD";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode supportedBandListHRPD

      buffer.getContext().eventDispatcher.startElement("supportedBandListHRPD", -1);

      supportedBandListHRPD = new SupportedBandListHRPD();
      supportedBandListHRPD.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedBandListHRPD", -1);

      // decode tx_ConfigHRPD

      buffer.getContext().eventDispatcher.startElement("tx_ConfigHRPD", -1);

      {
         int tval = IRAT_ParametersCDMA2000_HRPD_tx_ConfigHRPD.decodeEnumValue (buffer);
         tx_ConfigHRPD = IRAT_ParametersCDMA2000_HRPD_tx_ConfigHRPD.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("tx_ConfigHRPD", -1);

      // decode rx_ConfigHRPD

      buffer.getContext().eventDispatcher.startElement("rx_ConfigHRPD", -1);

      {
         int tval = IRAT_ParametersCDMA2000_HRPD_rx_ConfigHRPD.decodeEnumValue (buffer);
         rx_ConfigHRPD = IRAT_ParametersCDMA2000_HRPD_rx_ConfigHRPD.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("rx_ConfigHRPD", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedBandListHRPD != null) supportedBandListHRPD.print (_sb, "supportedBandListHRPD", _level+1);
      if (tx_ConfigHRPD != null) tx_ConfigHRPD.print (_sb, "tx_ConfigHRPD", _level+1);
      if (rx_ConfigHRPD != null) rx_ConfigHRPD.print (_sb, "rx_ConfigHRPD", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
