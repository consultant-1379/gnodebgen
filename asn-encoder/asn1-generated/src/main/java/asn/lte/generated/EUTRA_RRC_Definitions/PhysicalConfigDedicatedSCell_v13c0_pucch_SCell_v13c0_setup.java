/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysicalConfigDedicatedSCell_v13c0_pucch_SCell_v13c0_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PUCCH_ConfigDedicated_v13c0 pucch_ConfigDedicated_v13c0;

   public PhysicalConfigDedicatedSCell_v13c0_pucch_SCell_v13c0_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysicalConfigDedicatedSCell_v13c0_pucch_SCell_v13c0_setup (
      PUCCH_ConfigDedicated_v13c0 pucch_ConfigDedicated_v13c0_
   ) {
      super();
      pucch_ConfigDedicated_v13c0 = pucch_ConfigDedicated_v13c0_;
   }

   public void init () {
      pucch_ConfigDedicated_v13c0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pucch_ConfigDedicated_v13c0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pucch-ConfigDedicated-v13c0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode pucch_ConfigDedicated_v13c0

      buffer.getContext().eventDispatcher.startElement("pucch_ConfigDedicated_v13c0", -1);

      pucch_ConfigDedicated_v13c0 = new PUCCH_ConfigDedicated_v13c0();
      pucch_ConfigDedicated_v13c0.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pucch_ConfigDedicated_v13c0", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pucch_ConfigDedicated_v13c0 != null) pucch_ConfigDedicated_v13c0.print (_sb, "pucch_ConfigDedicated_v13c0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
