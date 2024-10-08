/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CommResourcePool_r12_txParameters_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SL_TxParameters_r12 sc_TxParameters_r12;
   public SL_TxParameters_r12 dataTxParameters_r12;

   public SL_CommResourcePool_r12_txParameters_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CommResourcePool_r12_txParameters_r12 (
      SL_TxParameters_r12 sc_TxParameters_r12_,
      SL_TxParameters_r12 dataTxParameters_r12_
   ) {
      super();
      sc_TxParameters_r12 = sc_TxParameters_r12_;
      dataTxParameters_r12 = dataTxParameters_r12_;
   }

   public void init () {
      sc_TxParameters_r12 = null;
      dataTxParameters_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sc_TxParameters_r12;
         case 1: return dataTxParameters_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sc-TxParameters-r12";
         case 1: return "dataTxParameters-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode sc_TxParameters_r12

      buffer.getContext().eventDispatcher.startElement("sc_TxParameters_r12", -1);

      sc_TxParameters_r12 = new SL_TxParameters_r12();
      sc_TxParameters_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sc_TxParameters_r12", -1);

      // decode dataTxParameters_r12

      buffer.getContext().eventDispatcher.startElement("dataTxParameters_r12", -1);

      dataTxParameters_r12 = new SL_TxParameters_r12();
      dataTxParameters_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dataTxParameters_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sc_TxParameters_r12 != null) sc_TxParameters_r12.print (_sb, "sc_TxParameters_r12", _level+1);
      if (dataTxParameters_r12 != null) dataTxParameters_r12.print (_sb, "dataTxParameters_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
