/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectNR_SL_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasObjectNR-SL-r16";
   }

   public Tx_PoolMeasList_r16 tx_PoolMeasToRemoveList_r16;  // optional
   public Tx_PoolMeasList_r16 tx_PoolMeasToAddModList_r16;  // optional

   public MeasObjectNR_SL_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasObjectNR_SL_r16 (
      Tx_PoolMeasList_r16 tx_PoolMeasToRemoveList_r16_,
      Tx_PoolMeasList_r16 tx_PoolMeasToAddModList_r16_
   ) {
      super();
      tx_PoolMeasToRemoveList_r16 = tx_PoolMeasToRemoveList_r16_;
      tx_PoolMeasToAddModList_r16 = tx_PoolMeasToAddModList_r16_;
   }

   public void init () {
      tx_PoolMeasToRemoveList_r16 = null;
      tx_PoolMeasToAddModList_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tx_PoolMeasToRemoveList_r16;
         case 1: return tx_PoolMeasToAddModList_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tx-PoolMeasToRemoveList-r16";
         case 1: return "tx-PoolMeasToAddModList-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tx_PoolMeasToRemoveList_r16Present = buffer.decodeBit ("tx_PoolMeasToRemoveList_r16Present");
      boolean tx_PoolMeasToAddModList_r16Present = buffer.decodeBit ("tx_PoolMeasToAddModList_r16Present");

      // decode tx_PoolMeasToRemoveList_r16

      if (tx_PoolMeasToRemoveList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("tx_PoolMeasToRemoveList_r16", -1);

         tx_PoolMeasToRemoveList_r16 = new Tx_PoolMeasList_r16();
         tx_PoolMeasToRemoveList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tx_PoolMeasToRemoveList_r16", -1);
      }
      else {
         tx_PoolMeasToRemoveList_r16 = null;
      }

      // decode tx_PoolMeasToAddModList_r16

      if (tx_PoolMeasToAddModList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("tx_PoolMeasToAddModList_r16", -1);

         tx_PoolMeasToAddModList_r16 = new Tx_PoolMeasList_r16();
         tx_PoolMeasToAddModList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tx_PoolMeasToAddModList_r16", -1);
      }
      else {
         tx_PoolMeasToAddModList_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((tx_PoolMeasToRemoveList_r16 != null), null);
      buffer.encodeBit ((tx_PoolMeasToAddModList_r16 != null), null);

      // encode tx_PoolMeasToRemoveList_r16

      if (tx_PoolMeasToRemoveList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("tx_PoolMeasToRemoveList_r16", -1);

         tx_PoolMeasToRemoveList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tx_PoolMeasToRemoveList_r16", -1);
      }

      // encode tx_PoolMeasToAddModList_r16

      if (tx_PoolMeasToAddModList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("tx_PoolMeasToAddModList_r16", -1);

         tx_PoolMeasToAddModList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tx_PoolMeasToAddModList_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tx_PoolMeasToRemoveList_r16 != null) tx_PoolMeasToRemoveList_r16.print (_sb, "tx_PoolMeasToRemoveList_r16", _level+1);
      if (tx_PoolMeasToAddModList_r16 != null) tx_PoolMeasToAddModList_r16.print (_sb, "tx_PoolMeasToAddModList_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
