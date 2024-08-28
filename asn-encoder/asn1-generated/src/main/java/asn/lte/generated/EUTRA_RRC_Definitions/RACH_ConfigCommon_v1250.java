/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RACH-ConfigCommon-v1250";
   }

   public RACH_ConfigCommon_v1250_txFailParams_r12 txFailParams_r12;

   public RACH_ConfigCommon_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_ConfigCommon_v1250 (
      RACH_ConfigCommon_v1250_txFailParams_r12 txFailParams_r12_
   ) {
      super();
      txFailParams_r12 = txFailParams_r12_;
   }

   public void init () {
      txFailParams_r12 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return txFailParams_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "txFailParams-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode txFailParams_r12

      buffer.getContext().eventDispatcher.startElement("txFailParams_r12", -1);

      txFailParams_r12 = new RACH_ConfigCommon_v1250_txFailParams_r12();
      txFailParams_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("txFailParams_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (txFailParams_r12 != null) txFailParams_r12.print (_sb, "txFailParams_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
