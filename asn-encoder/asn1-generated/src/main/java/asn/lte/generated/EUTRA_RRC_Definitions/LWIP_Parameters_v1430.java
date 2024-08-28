/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LWIP_Parameters_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LWIP-Parameters-v1430";
   }

   public LWIP_Parameters_v1430_lwip_Aggregation_DL_r14 lwip_Aggregation_DL_r14 = null;  // optional
   public LWIP_Parameters_v1430_lwip_Aggregation_UL_r14 lwip_Aggregation_UL_r14 = null;  // optional

   public LWIP_Parameters_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LWIP_Parameters_v1430 (
      LWIP_Parameters_v1430_lwip_Aggregation_DL_r14 lwip_Aggregation_DL_r14_,
      LWIP_Parameters_v1430_lwip_Aggregation_UL_r14 lwip_Aggregation_UL_r14_
   ) {
      super();
      lwip_Aggregation_DL_r14 = lwip_Aggregation_DL_r14_;
      lwip_Aggregation_UL_r14 = lwip_Aggregation_UL_r14_;
   }

   public void init () {
      lwip_Aggregation_DL_r14 = null;
      lwip_Aggregation_UL_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lwip_Aggregation_DL_r14;
         case 1: return lwip_Aggregation_UL_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lwip-Aggregation-DL-r14";
         case 1: return "lwip-Aggregation-UL-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lwip_Aggregation_DL_r14Present = buffer.decodeBit ("lwip_Aggregation_DL_r14Present");
      boolean lwip_Aggregation_UL_r14Present = buffer.decodeBit ("lwip_Aggregation_UL_r14Present");

      // decode lwip_Aggregation_DL_r14

      if (lwip_Aggregation_DL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("lwip_Aggregation_DL_r14", -1);

         int tval = LWIP_Parameters_v1430_lwip_Aggregation_DL_r14.decodeEnumValue (buffer);
         lwip_Aggregation_DL_r14 = LWIP_Parameters_v1430_lwip_Aggregation_DL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lwip_Aggregation_DL_r14", -1);
      }
      else {
         lwip_Aggregation_DL_r14 = null;
      }

      // decode lwip_Aggregation_UL_r14

      if (lwip_Aggregation_UL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("lwip_Aggregation_UL_r14", -1);

         int tval = LWIP_Parameters_v1430_lwip_Aggregation_UL_r14.decodeEnumValue (buffer);
         lwip_Aggregation_UL_r14 = LWIP_Parameters_v1430_lwip_Aggregation_UL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lwip_Aggregation_UL_r14", -1);
      }
      else {
         lwip_Aggregation_UL_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (lwip_Aggregation_DL_r14 != null) lwip_Aggregation_DL_r14.print (_sb, "lwip_Aggregation_DL_r14", _level+1);
      if (lwip_Aggregation_UL_r14 != null) lwip_Aggregation_UL_r14.print (_sb, "lwip_Aggregation_UL_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
