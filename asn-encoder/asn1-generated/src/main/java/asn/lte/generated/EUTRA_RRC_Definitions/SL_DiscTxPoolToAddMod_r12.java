/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscTxPoolToAddMod_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-DiscTxPoolToAddMod-r12";
   }

   public SL_TxPoolIdentity_r12 poolIdentity_r12;
   public SL_DiscResourcePool_r12 pool_r12;

   public SL_DiscTxPoolToAddMod_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_DiscTxPoolToAddMod_r12 (
      SL_TxPoolIdentity_r12 poolIdentity_r12_,
      SL_DiscResourcePool_r12 pool_r12_
   ) {
      super();
      poolIdentity_r12 = poolIdentity_r12_;
      pool_r12 = pool_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_DiscTxPoolToAddMod_r12 (long poolIdentity_r12_,
      SL_DiscResourcePool_r12 pool_r12_
   ) {
      super();
      poolIdentity_r12 = new SL_TxPoolIdentity_r12 (poolIdentity_r12_);
      pool_r12 = pool_r12_;
   }

   public void init () {
      poolIdentity_r12 = null;
      pool_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return poolIdentity_r12;
         case 1: return pool_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "poolIdentity-r12";
         case 1: return "pool-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode poolIdentity_r12

      buffer.getContext().eventDispatcher.startElement("poolIdentity_r12", -1);

      poolIdentity_r12 = new SL_TxPoolIdentity_r12();
      poolIdentity_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("poolIdentity_r12", -1);

      // decode pool_r12

      buffer.getContext().eventDispatcher.startElement("pool_r12", -1);

      pool_r12 = new SL_DiscResourcePool_r12();
      pool_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pool_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (poolIdentity_r12 != null) poolIdentity_r12.print (_sb, "poolIdentity_r12", _level+1);
      if (pool_r12 != null) pool_r12.print (_sb, "pool_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
