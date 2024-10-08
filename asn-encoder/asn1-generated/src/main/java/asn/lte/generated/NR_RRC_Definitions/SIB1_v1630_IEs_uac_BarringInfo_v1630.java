/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB1_v1630_IEs_uac_BarringInfo_v1630 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SIB1_v1630_IEs_uac_BarringInfo_v1630_uac_AC1_SelectAssistInfo_r16 uac_AC1_SelectAssistInfo_r16;

   public SIB1_v1630_IEs_uac_BarringInfo_v1630 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SIB1_v1630_IEs_uac_BarringInfo_v1630 (
      SIB1_v1630_IEs_uac_BarringInfo_v1630_uac_AC1_SelectAssistInfo_r16 uac_AC1_SelectAssistInfo_r16_
   ) {
      super();
      uac_AC1_SelectAssistInfo_r16 = uac_AC1_SelectAssistInfo_r16_;
   }

   public void init () {
      uac_AC1_SelectAssistInfo_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return uac_AC1_SelectAssistInfo_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "uac-AC1-SelectAssistInfo-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode uac_AC1_SelectAssistInfo_r16

      buffer.getContext().eventDispatcher.startElement("uac_AC1_SelectAssistInfo_r16", -1);

      uac_AC1_SelectAssistInfo_r16 = new SIB1_v1630_IEs_uac_BarringInfo_v1630_uac_AC1_SelectAssistInfo_r16();
      uac_AC1_SelectAssistInfo_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uac_AC1_SelectAssistInfo_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (uac_AC1_SelectAssistInfo_r16 != null) uac_AC1_SelectAssistInfo_r16.print (_sb, "uac_AC1_SelectAssistInfo_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
