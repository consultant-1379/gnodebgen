/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RedirectedCarrierInfo_NB_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RedirectedCarrierInfo-NB-v1430";
   }

   public RedirectedCarrierInfo_NB_v1430_redirectedCarrierOffsetDedicated_r14 redirectedCarrierOffsetDedicated_r14 = null;
   public RedirectedCarrierInfo_NB_v1430_t322_r14 t322_r14 = null;

   public RedirectedCarrierInfo_NB_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RedirectedCarrierInfo_NB_v1430 (
      RedirectedCarrierInfo_NB_v1430_redirectedCarrierOffsetDedicated_r14 redirectedCarrierOffsetDedicated_r14_,
      RedirectedCarrierInfo_NB_v1430_t322_r14 t322_r14_
   ) {
      super();
      redirectedCarrierOffsetDedicated_r14 = redirectedCarrierOffsetDedicated_r14_;
      t322_r14 = t322_r14_;
   }

   public void init () {
      redirectedCarrierOffsetDedicated_r14 = null;
      t322_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return redirectedCarrierOffsetDedicated_r14;
         case 1: return t322_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "redirectedCarrierOffsetDedicated-r14";
         case 1: return "t322-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode redirectedCarrierOffsetDedicated_r14

      buffer.getContext().eventDispatcher.startElement("redirectedCarrierOffsetDedicated_r14", -1);

      {
         int tval = RedirectedCarrierInfo_NB_v1430_redirectedCarrierOffsetDedicated_r14.decodeEnumValue (buffer);
         redirectedCarrierOffsetDedicated_r14 = RedirectedCarrierInfo_NB_v1430_redirectedCarrierOffsetDedicated_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("redirectedCarrierOffsetDedicated_r14", -1);

      // decode t322_r14

      buffer.getContext().eventDispatcher.startElement("t322_r14", -1);

      {
         int tval = RedirectedCarrierInfo_NB_v1430_t322_r14.decodeEnumValue (buffer);
         t322_r14 = RedirectedCarrierInfo_NB_v1430_t322_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t322_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (redirectedCarrierOffsetDedicated_r14 != null) redirectedCarrierOffsetDedicated_r14.print (_sb, "redirectedCarrierOffsetDedicated_r14", _level+1);
      if (t322_r14 != null) t322_r14.print (_sb, "t322_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
