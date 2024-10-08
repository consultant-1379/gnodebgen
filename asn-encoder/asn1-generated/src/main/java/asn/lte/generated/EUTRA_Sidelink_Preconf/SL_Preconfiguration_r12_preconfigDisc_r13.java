/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;

public class SL_Preconfiguration_r12_preconfigDisc_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SL_PreconfigDiscRxPoolList_r13 discRxPoolList_r13;
   public SL_PreconfigDiscTxPoolList_r13 discTxPoolList_r13;  // optional

   public SL_Preconfiguration_r12_preconfigDisc_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_Preconfiguration_r12_preconfigDisc_r13 (
      SL_PreconfigDiscRxPoolList_r13 discRxPoolList_r13_,
      SL_PreconfigDiscTxPoolList_r13 discTxPoolList_r13_
   ) {
      super();
      discRxPoolList_r13 = discRxPoolList_r13_;
      discTxPoolList_r13 = discTxPoolList_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_Preconfiguration_r12_preconfigDisc_r13 (
      SL_PreconfigDiscRxPoolList_r13 discRxPoolList_r13_
   ) {
      super();
      discRxPoolList_r13 = discRxPoolList_r13_;
   }

   public void init () {
      discRxPoolList_r13 = null;
      discTxPoolList_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return discRxPoolList_r13;
         case 1: return discTxPoolList_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "discRxPoolList-r13";
         case 1: return "discTxPoolList-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean discTxPoolList_r13Present = buffer.decodeBit ("discTxPoolList_r13Present");

      // decode discRxPoolList_r13

      buffer.getContext().eventDispatcher.startElement("discRxPoolList_r13", -1);

      discRxPoolList_r13 = new SL_PreconfigDiscRxPoolList_r13();
      discRxPoolList_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("discRxPoolList_r13", -1);

      // decode discTxPoolList_r13

      if (discTxPoolList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("discTxPoolList_r13", -1);

         discTxPoolList_r13 = new SL_PreconfigDiscTxPoolList_r13();
         discTxPoolList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("discTxPoolList_r13", -1);
      }
      else {
         discTxPoolList_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (discRxPoolList_r13 != null) discRxPoolList_r13.print (_sb, "discRxPoolList_r13", _level+1);
      if (discTxPoolList_r13 != null) discTxPoolList_r13.print (_sb, "discTxPoolList_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
