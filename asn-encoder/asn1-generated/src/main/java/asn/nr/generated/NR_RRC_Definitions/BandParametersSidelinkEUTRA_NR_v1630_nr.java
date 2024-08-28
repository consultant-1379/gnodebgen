/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParametersSidelinkEUTRA_NR_v1630_nr extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public BandParametersSidelinkEUTRA_NR_v1630_nr_tx_Sidelink_r16 tx_Sidelink_r16 = null;  // optional
   public BandParametersSidelinkEUTRA_NR_v1630_nr_rx_Sidelink_r16 rx_Sidelink_r16 = null;  // optional
   public BandParametersSidelinkEUTRA_NR_v1630_nr_sl_CrossCarrierScheduling_r16 sl_CrossCarrierScheduling_r16 = null;  // optional

   public BandParametersSidelinkEUTRA_NR_v1630_nr () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParametersSidelinkEUTRA_NR_v1630_nr (
      BandParametersSidelinkEUTRA_NR_v1630_nr_tx_Sidelink_r16 tx_Sidelink_r16_,
      BandParametersSidelinkEUTRA_NR_v1630_nr_rx_Sidelink_r16 rx_Sidelink_r16_,
      BandParametersSidelinkEUTRA_NR_v1630_nr_sl_CrossCarrierScheduling_r16 sl_CrossCarrierScheduling_r16_
   ) {
      super();
      tx_Sidelink_r16 = tx_Sidelink_r16_;
      rx_Sidelink_r16 = rx_Sidelink_r16_;
      sl_CrossCarrierScheduling_r16 = sl_CrossCarrierScheduling_r16_;
   }

   public void init () {
      tx_Sidelink_r16 = null;
      rx_Sidelink_r16 = null;
      sl_CrossCarrierScheduling_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tx_Sidelink_r16;
         case 1: return rx_Sidelink_r16;
         case 2: return sl_CrossCarrierScheduling_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tx-Sidelink-r16";
         case 1: return "rx-Sidelink-r16";
         case 2: return "sl-CrossCarrierScheduling-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tx_Sidelink_r16Present = buffer.decodeBit ("tx_Sidelink_r16Present");
      boolean rx_Sidelink_r16Present = buffer.decodeBit ("rx_Sidelink_r16Present");
      boolean sl_CrossCarrierScheduling_r16Present = buffer.decodeBit ("sl_CrossCarrierScheduling_r16Present");

      // decode tx_Sidelink_r16

      if (tx_Sidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("tx_Sidelink_r16", -1);

         int tval = BandParametersSidelinkEUTRA_NR_v1630_nr_tx_Sidelink_r16.decodeEnumValue (buffer);
         tx_Sidelink_r16 = BandParametersSidelinkEUTRA_NR_v1630_nr_tx_Sidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tx_Sidelink_r16", -1);
      }
      else {
         tx_Sidelink_r16 = null;
      }

      // decode rx_Sidelink_r16

      if (rx_Sidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rx_Sidelink_r16", -1);

         int tval = BandParametersSidelinkEUTRA_NR_v1630_nr_rx_Sidelink_r16.decodeEnumValue (buffer);
         rx_Sidelink_r16 = BandParametersSidelinkEUTRA_NR_v1630_nr_rx_Sidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rx_Sidelink_r16", -1);
      }
      else {
         rx_Sidelink_r16 = null;
      }

      // decode sl_CrossCarrierScheduling_r16

      if (sl_CrossCarrierScheduling_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_CrossCarrierScheduling_r16", -1);

         int tval = BandParametersSidelinkEUTRA_NR_v1630_nr_sl_CrossCarrierScheduling_r16.decodeEnumValue (buffer);
         sl_CrossCarrierScheduling_r16 = BandParametersSidelinkEUTRA_NR_v1630_nr_sl_CrossCarrierScheduling_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_CrossCarrierScheduling_r16", -1);
      }
      else {
         sl_CrossCarrierScheduling_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((tx_Sidelink_r16 != null), null);
      buffer.encodeBit ((rx_Sidelink_r16 != null), null);
      buffer.encodeBit ((sl_CrossCarrierScheduling_r16 != null), null);

      // encode tx_Sidelink_r16

      if (tx_Sidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("tx_Sidelink_r16", -1);

         tx_Sidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tx_Sidelink_r16", -1);
      }

      // encode rx_Sidelink_r16

      if (rx_Sidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rx_Sidelink_r16", -1);

         rx_Sidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rx_Sidelink_r16", -1);
      }

      // encode sl_CrossCarrierScheduling_r16

      if (sl_CrossCarrierScheduling_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_CrossCarrierScheduling_r16", -1);

         sl_CrossCarrierScheduling_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_CrossCarrierScheduling_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tx_Sidelink_r16 != null) tx_Sidelink_r16.print (_sb, "tx_Sidelink_r16", _level+1);
      if (rx_Sidelink_r16 != null) rx_Sidelink_r16.print (_sb, "rx_Sidelink_r16", _level+1);
      if (sl_CrossCarrierScheduling_r16 != null) sl_CrossCarrierScheduling_r16.print (_sb, "sl_CrossCarrierScheduling_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
