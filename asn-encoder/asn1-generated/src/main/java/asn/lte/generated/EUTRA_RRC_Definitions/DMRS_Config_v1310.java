/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DMRS_Config_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DMRS-Config-v1310";
   }

   public DMRS_Config_v1310_dmrs_tableAlt_r13 dmrs_tableAlt_r13 = null;  // optional

   public DMRS_Config_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DMRS_Config_v1310 (
      DMRS_Config_v1310_dmrs_tableAlt_r13 dmrs_tableAlt_r13_
   ) {
      super();
      dmrs_tableAlt_r13 = dmrs_tableAlt_r13_;
   }

   public void init () {
      dmrs_tableAlt_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dmrs_tableAlt_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dmrs-tableAlt-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dmrs_tableAlt_r13Present = buffer.decodeBit ("dmrs_tableAlt_r13Present");

      // decode dmrs_tableAlt_r13

      if (dmrs_tableAlt_r13Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_tableAlt_r13", -1);

         int tval = DMRS_Config_v1310_dmrs_tableAlt_r13.decodeEnumValue (buffer);
         dmrs_tableAlt_r13 = DMRS_Config_v1310_dmrs_tableAlt_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dmrs_tableAlt_r13", -1);
      }
      else {
         dmrs_tableAlt_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dmrs_tableAlt_r13 != null) dmrs_tableAlt_r13.print (_sb, "dmrs_tableAlt_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
