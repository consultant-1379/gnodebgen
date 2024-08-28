/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ParametersCDMA2000_r11_parameters1XRTT_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CSFB_RegistrationParam1XRTT csfb_RegistrationParam1XRTT_r11;  // optional
   public CSFB_RegistrationParam1XRTT_v920 csfb_RegistrationParam1XRTT_Ext_r11;  // optional
   public Asn1BitString longCodeState1XRTT_r11;  // optional
   public CellReselectionParametersCDMA2000_r11 cellReselectionParameters1XRTT_r11;  // optional
   public AC_BarringConfig1XRTT_r9 ac_BarringConfig1XRTT_r11;  // optional
   public Asn1Boolean csfb_SupportForDualRxUEs_r11;  // optional
   public ParametersCDMA2000_r11_parameters1XRTT_r11_csfb_DualRxTxSupport_r11 csfb_DualRxTxSupport_r11 = null;  // optional

   public ParametersCDMA2000_r11_parameters1XRTT_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ParametersCDMA2000_r11_parameters1XRTT_r11 (
      CSFB_RegistrationParam1XRTT csfb_RegistrationParam1XRTT_r11_,
      CSFB_RegistrationParam1XRTT_v920 csfb_RegistrationParam1XRTT_Ext_r11_,
      Asn1BitString longCodeState1XRTT_r11_,
      CellReselectionParametersCDMA2000_r11 cellReselectionParameters1XRTT_r11_,
      AC_BarringConfig1XRTT_r9 ac_BarringConfig1XRTT_r11_,
      Asn1Boolean csfb_SupportForDualRxUEs_r11_,
      ParametersCDMA2000_r11_parameters1XRTT_r11_csfb_DualRxTxSupport_r11 csfb_DualRxTxSupport_r11_
   ) {
      super();
      csfb_RegistrationParam1XRTT_r11 = csfb_RegistrationParam1XRTT_r11_;
      csfb_RegistrationParam1XRTT_Ext_r11 = csfb_RegistrationParam1XRTT_Ext_r11_;
      longCodeState1XRTT_r11 = longCodeState1XRTT_r11_;
      cellReselectionParameters1XRTT_r11 = cellReselectionParameters1XRTT_r11_;
      ac_BarringConfig1XRTT_r11 = ac_BarringConfig1XRTT_r11_;
      csfb_SupportForDualRxUEs_r11 = csfb_SupportForDualRxUEs_r11_;
      csfb_DualRxTxSupport_r11 = csfb_DualRxTxSupport_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ParametersCDMA2000_r11_parameters1XRTT_r11 (CSFB_RegistrationParam1XRTT csfb_RegistrationParam1XRTT_r11_,
      CSFB_RegistrationParam1XRTT_v920 csfb_RegistrationParam1XRTT_Ext_r11_,
      Asn1BitString longCodeState1XRTT_r11_,
      CellReselectionParametersCDMA2000_r11 cellReselectionParameters1XRTT_r11_,
      AC_BarringConfig1XRTT_r9 ac_BarringConfig1XRTT_r11_,
      boolean csfb_SupportForDualRxUEs_r11_,
      ParametersCDMA2000_r11_parameters1XRTT_r11_csfb_DualRxTxSupport_r11 csfb_DualRxTxSupport_r11_
   ) {
      super();
      csfb_RegistrationParam1XRTT_r11 = csfb_RegistrationParam1XRTT_r11_;
      csfb_RegistrationParam1XRTT_Ext_r11 = csfb_RegistrationParam1XRTT_Ext_r11_;
      longCodeState1XRTT_r11 = longCodeState1XRTT_r11_;
      cellReselectionParameters1XRTT_r11 = cellReselectionParameters1XRTT_r11_;
      ac_BarringConfig1XRTT_r11 = ac_BarringConfig1XRTT_r11_;
      csfb_SupportForDualRxUEs_r11 = new Asn1Boolean (csfb_SupportForDualRxUEs_r11_);
      csfb_DualRxTxSupport_r11 = csfb_DualRxTxSupport_r11_;
   }

   public void init () {
      csfb_RegistrationParam1XRTT_r11 = null;
      csfb_RegistrationParam1XRTT_Ext_r11 = null;
      longCodeState1XRTT_r11 = null;
      cellReselectionParameters1XRTT_r11 = null;
      ac_BarringConfig1XRTT_r11 = null;
      csfb_SupportForDualRxUEs_r11 = null;
      csfb_DualRxTxSupport_r11 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csfb_RegistrationParam1XRTT_r11;
         case 1: return csfb_RegistrationParam1XRTT_Ext_r11;
         case 2: return longCodeState1XRTT_r11;
         case 3: return cellReselectionParameters1XRTT_r11;
         case 4: return ac_BarringConfig1XRTT_r11;
         case 5: return csfb_SupportForDualRxUEs_r11;
         case 6: return csfb_DualRxTxSupport_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csfb-RegistrationParam1XRTT-r11";
         case 1: return "csfb-RegistrationParam1XRTT-Ext-r11";
         case 2: return "longCodeState1XRTT-r11";
         case 3: return "cellReselectionParameters1XRTT-r11";
         case 4: return "ac-BarringConfig1XRTT-r11";
         case 5: return "csfb-SupportForDualRxUEs-r11";
         case 6: return "csfb-DualRxTxSupport-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean csfb_RegistrationParam1XRTT_r11Present = buffer.decodeBit ("csfb_RegistrationParam1XRTT_r11Present");
      boolean csfb_RegistrationParam1XRTT_Ext_r11Present = buffer.decodeBit ("csfb_RegistrationParam1XRTT_Ext_r11Present");
      boolean longCodeState1XRTT_r11Present = buffer.decodeBit ("longCodeState1XRTT_r11Present");
      boolean cellReselectionParameters1XRTT_r11Present = buffer.decodeBit ("cellReselectionParameters1XRTT_r11Present");
      boolean ac_BarringConfig1XRTT_r11Present = buffer.decodeBit ("ac_BarringConfig1XRTT_r11Present");
      boolean csfb_SupportForDualRxUEs_r11Present = buffer.decodeBit ("csfb_SupportForDualRxUEs_r11Present");
      boolean csfb_DualRxTxSupport_r11Present = buffer.decodeBit ("csfb_DualRxTxSupport_r11Present");

      // decode csfb_RegistrationParam1XRTT_r11

      if (csfb_RegistrationParam1XRTT_r11Present) {
         buffer.getContext().eventDispatcher.startElement("csfb_RegistrationParam1XRTT_r11", -1);

         csfb_RegistrationParam1XRTT_r11 = new CSFB_RegistrationParam1XRTT();
         csfb_RegistrationParam1XRTT_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csfb_RegistrationParam1XRTT_r11", -1);
      }
      else {
         csfb_RegistrationParam1XRTT_r11 = null;
      }

      // decode csfb_RegistrationParam1XRTT_Ext_r11

      if (csfb_RegistrationParam1XRTT_Ext_r11Present) {
         buffer.getContext().eventDispatcher.startElement("csfb_RegistrationParam1XRTT_Ext_r11", -1);

         csfb_RegistrationParam1XRTT_Ext_r11 = new CSFB_RegistrationParam1XRTT_v920();
         csfb_RegistrationParam1XRTT_Ext_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csfb_RegistrationParam1XRTT_Ext_r11", -1);
      }
      else {
         csfb_RegistrationParam1XRTT_Ext_r11 = null;
      }

      // decode longCodeState1XRTT_r11

      if (longCodeState1XRTT_r11Present) {
         buffer.getContext().eventDispatcher.startElement("longCodeState1XRTT_r11", -1);

         longCodeState1XRTT_r11 = new Asn1BitString();
         longCodeState1XRTT_r11.decode (buffer, 42, 42);

         buffer.invokeCharacters(longCodeState1XRTT_r11.toString());
         buffer.getContext().eventDispatcher.endElement("longCodeState1XRTT_r11", -1);
      }
      else {
         longCodeState1XRTT_r11 = null;
      }

      // decode cellReselectionParameters1XRTT_r11

      if (cellReselectionParameters1XRTT_r11Present) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionParameters1XRTT_r11", -1);

         cellReselectionParameters1XRTT_r11 = new CellReselectionParametersCDMA2000_r11();
         cellReselectionParameters1XRTT_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellReselectionParameters1XRTT_r11", -1);
      }
      else {
         cellReselectionParameters1XRTT_r11 = null;
      }

      // decode ac_BarringConfig1XRTT_r11

      if (ac_BarringConfig1XRTT_r11Present) {
         buffer.getContext().eventDispatcher.startElement("ac_BarringConfig1XRTT_r11", -1);

         ac_BarringConfig1XRTT_r11 = new AC_BarringConfig1XRTT_r9();
         ac_BarringConfig1XRTT_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ac_BarringConfig1XRTT_r11", -1);
      }
      else {
         ac_BarringConfig1XRTT_r11 = null;
      }

      // decode csfb_SupportForDualRxUEs_r11

      if (csfb_SupportForDualRxUEs_r11Present) {
         buffer.getContext().eventDispatcher.startElement("csfb_SupportForDualRxUEs_r11", -1);

         csfb_SupportForDualRxUEs_r11 = new Asn1Boolean();
         csfb_SupportForDualRxUEs_r11.decode (buffer);

         buffer.invokeCharacters(csfb_SupportForDualRxUEs_r11.toString());
         buffer.getContext().eventDispatcher.endElement("csfb_SupportForDualRxUEs_r11", -1);
      }
      else {
         csfb_SupportForDualRxUEs_r11 = null;
      }

      // decode csfb_DualRxTxSupport_r11

      if (csfb_DualRxTxSupport_r11Present) {
         buffer.getContext().eventDispatcher.startElement("csfb_DualRxTxSupport_r11", -1);

         int tval = ParametersCDMA2000_r11_parameters1XRTT_r11_csfb_DualRxTxSupport_r11.decodeEnumValue (buffer);
         csfb_DualRxTxSupport_r11 = ParametersCDMA2000_r11_parameters1XRTT_r11_csfb_DualRxTxSupport_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csfb_DualRxTxSupport_r11", -1);
      }
      else {
         csfb_DualRxTxSupport_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csfb_RegistrationParam1XRTT_r11 != null) csfb_RegistrationParam1XRTT_r11.print (_sb, "csfb_RegistrationParam1XRTT_r11", _level+1);
      if (csfb_RegistrationParam1XRTT_Ext_r11 != null) csfb_RegistrationParam1XRTT_Ext_r11.print (_sb, "csfb_RegistrationParam1XRTT_Ext_r11", _level+1);
      if (longCodeState1XRTT_r11 != null) longCodeState1XRTT_r11.print (_sb, "longCodeState1XRTT_r11", _level+1);
      if (cellReselectionParameters1XRTT_r11 != null) cellReselectionParameters1XRTT_r11.print (_sb, "cellReselectionParameters1XRTT_r11", _level+1);
      if (ac_BarringConfig1XRTT_r11 != null) ac_BarringConfig1XRTT_r11.print (_sb, "ac_BarringConfig1XRTT_r11", _level+1);
      if (csfb_SupportForDualRxUEs_r11 != null) csfb_SupportForDualRxUEs_r11.print (_sb, "csfb_SupportForDualRxUEs_r11", _level+1);
      if (csfb_DualRxTxSupport_r11 != null) csfb_DualRxTxSupport_r11.print (_sb, "csfb_DualRxTxSupport_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
