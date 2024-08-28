/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_BWP_PoolConfigCommon_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-BWP-PoolConfigCommon-r16";
   }

   public SL_BWP_PoolConfigCommon_r16_sl_RxPool_r16 sl_RxPool_r16;  // optional
   public SL_BWP_PoolConfigCommon_r16_sl_TxPoolSelectedNormal_r16 sl_TxPoolSelectedNormal_r16;  // optional
   public SL_ResourcePoolConfig_r16 sl_TxPoolExceptional_r16;  // optional

   public SL_BWP_PoolConfigCommon_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_BWP_PoolConfigCommon_r16 (
      SL_BWP_PoolConfigCommon_r16_sl_RxPool_r16 sl_RxPool_r16_,
      SL_BWP_PoolConfigCommon_r16_sl_TxPoolSelectedNormal_r16 sl_TxPoolSelectedNormal_r16_,
      SL_ResourcePoolConfig_r16 sl_TxPoolExceptional_r16_
   ) {
      super();
      sl_RxPool_r16 = sl_RxPool_r16_;
      sl_TxPoolSelectedNormal_r16 = sl_TxPoolSelectedNormal_r16_;
      sl_TxPoolExceptional_r16 = sl_TxPoolExceptional_r16_;
   }

   public void init () {
      sl_RxPool_r16 = null;
      sl_TxPoolSelectedNormal_r16 = null;
      sl_TxPoolExceptional_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_RxPool_r16;
         case 1: return sl_TxPoolSelectedNormal_r16;
         case 2: return sl_TxPoolExceptional_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-RxPool-r16";
         case 1: return "sl-TxPoolSelectedNormal-r16";
         case 2: return "sl-TxPoolExceptional-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sl_RxPool_r16Present = buffer.decodeBit ("sl_RxPool_r16Present");
      boolean sl_TxPoolSelectedNormal_r16Present = buffer.decodeBit ("sl_TxPoolSelectedNormal_r16Present");
      boolean sl_TxPoolExceptional_r16Present = buffer.decodeBit ("sl_TxPoolExceptional_r16Present");

      // decode sl_RxPool_r16

      if (sl_RxPool_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_RxPool_r16", -1);

         sl_RxPool_r16 = new SL_BWP_PoolConfigCommon_r16_sl_RxPool_r16();
         sl_RxPool_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_RxPool_r16", -1);
      }
      else {
         sl_RxPool_r16 = null;
      }

      // decode sl_TxPoolSelectedNormal_r16

      if (sl_TxPoolSelectedNormal_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_TxPoolSelectedNormal_r16", -1);

         sl_TxPoolSelectedNormal_r16 = new SL_BWP_PoolConfigCommon_r16_sl_TxPoolSelectedNormal_r16();
         sl_TxPoolSelectedNormal_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_TxPoolSelectedNormal_r16", -1);
      }
      else {
         sl_TxPoolSelectedNormal_r16 = null;
      }

      // decode sl_TxPoolExceptional_r16

      if (sl_TxPoolExceptional_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_TxPoolExceptional_r16", -1);

         sl_TxPoolExceptional_r16 = new SL_ResourcePoolConfig_r16();
         sl_TxPoolExceptional_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_TxPoolExceptional_r16", -1);
      }
      else {
         sl_TxPoolExceptional_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sl_RxPool_r16 != null), null);
      buffer.encodeBit ((sl_TxPoolSelectedNormal_r16 != null), null);
      buffer.encodeBit ((sl_TxPoolExceptional_r16 != null), null);

      // encode sl_RxPool_r16

      if (sl_RxPool_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_RxPool_r16", -1);

         sl_RxPool_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_RxPool_r16", -1);
      }

      // encode sl_TxPoolSelectedNormal_r16

      if (sl_TxPoolSelectedNormal_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_TxPoolSelectedNormal_r16", -1);

         sl_TxPoolSelectedNormal_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_TxPoolSelectedNormal_r16", -1);
      }

      // encode sl_TxPoolExceptional_r16

      if (sl_TxPoolExceptional_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_TxPoolExceptional_r16", -1);

         sl_TxPoolExceptional_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_TxPoolExceptional_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_RxPool_r16 != null) sl_RxPool_r16.print (_sb, "sl_RxPool_r16", _level+1);
      if (sl_TxPoolSelectedNormal_r16 != null) sl_TxPoolSelectedNormal_r16.print (_sb, "sl_TxPoolSelectedNormal_r16", _level+1);
      if (sl_TxPoolExceptional_r16 != null) sl_TxPoolExceptional_r16.print (_sb, "sl_TxPoolExceptional_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
