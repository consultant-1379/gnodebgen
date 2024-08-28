/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310_commTxPoolNormalDedicatedExt_r13 commTxPoolNormalDedicatedExt_r13;

   public SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310 (
      SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310_commTxPoolNormalDedicatedExt_r13 commTxPoolNormalDedicatedExt_r13_
   ) {
      super();
      commTxPoolNormalDedicatedExt_r13 = commTxPoolNormalDedicatedExt_r13_;
   }

   public void init () {
      commTxPoolNormalDedicatedExt_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return commTxPoolNormalDedicatedExt_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "commTxPoolNormalDedicatedExt-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode commTxPoolNormalDedicatedExt_r13

      buffer.getContext().eventDispatcher.startElement("commTxPoolNormalDedicatedExt_r13", -1);

      commTxPoolNormalDedicatedExt_r13 = new SL_CommConfig_r12_commTxResources_v1310_setup_ue_Selected_v1310_commTxPoolNormalDedicatedExt_r13();
      commTxPoolNormalDedicatedExt_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("commTxPoolNormalDedicatedExt_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (commTxPoolNormalDedicatedExt_r13 != null) commTxPoolNormalDedicatedExt_r13.print (_sb, "commTxPoolNormalDedicatedExt_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
