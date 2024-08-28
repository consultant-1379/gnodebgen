/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_AM_RLC_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DL-AM-RLC-NB-r13";
   }

   public DL_AM_RLC_NB_r13_enableStatusReportSN_Gap_r13 enableStatusReportSN_Gap_r13 = null;  // optional

   public DL_AM_RLC_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_AM_RLC_NB_r13 (
      DL_AM_RLC_NB_r13_enableStatusReportSN_Gap_r13 enableStatusReportSN_Gap_r13_
   ) {
      super();
      enableStatusReportSN_Gap_r13 = enableStatusReportSN_Gap_r13_;
   }

   public void init () {
      enableStatusReportSN_Gap_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return enableStatusReportSN_Gap_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "enableStatusReportSN-Gap-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean enableStatusReportSN_Gap_r13Present = buffer.decodeBit ("enableStatusReportSN_Gap_r13Present");

      // decode enableStatusReportSN_Gap_r13

      if (enableStatusReportSN_Gap_r13Present) {
         buffer.getContext().eventDispatcher.startElement("enableStatusReportSN_Gap_r13", -1);

         int tval = DL_AM_RLC_NB_r13_enableStatusReportSN_Gap_r13.decodeEnumValue (buffer);
         enableStatusReportSN_Gap_r13 = DL_AM_RLC_NB_r13_enableStatusReportSN_Gap_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("enableStatusReportSN_Gap_r13", -1);
      }
      else {
         enableStatusReportSN_Gap_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (enableStatusReportSN_Gap_r13 != null) enableStatusReportSN_Gap_r13.print (_sb, "enableStatusReportSN_Gap_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
