/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelink_r16_psfch_FormatZeroSidelink_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_RxNumber psfch_RxNumber = null;
   public BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber psfch_TxNumber = null;

   public BandSidelink_r16_psfch_FormatZeroSidelink_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandSidelink_r16_psfch_FormatZeroSidelink_r16 (
      BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_RxNumber psfch_RxNumber_,
      BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber psfch_TxNumber_
   ) {
      super();
      psfch_RxNumber = psfch_RxNumber_;
      psfch_TxNumber = psfch_TxNumber_;
   }

   public void init () {
      psfch_RxNumber = null;
      psfch_TxNumber = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return psfch_RxNumber;
         case 1: return psfch_TxNumber;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "psfch-RxNumber";
         case 1: return "psfch-TxNumber";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode psfch_RxNumber

      buffer.getContext().eventDispatcher.startElement("psfch_RxNumber", -1);

      {
         int tval = BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_RxNumber.decodeEnumValue (buffer);
         psfch_RxNumber = BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_RxNumber.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("psfch_RxNumber", -1);

      // decode psfch_TxNumber

      buffer.getContext().eventDispatcher.startElement("psfch_TxNumber", -1);

      {
         int tval = BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber.decodeEnumValue (buffer);
         psfch_TxNumber = BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("psfch_TxNumber", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (psfch_RxNumber != null) psfch_RxNumber.print (_sb, "psfch_RxNumber", _level+1);
      if (psfch_TxNumber != null) psfch_TxNumber.print (_sb, "psfch_TxNumber", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
