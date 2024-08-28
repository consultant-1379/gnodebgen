/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_Config_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-Config-v1530";
   }

   public CSI_RS_ConfigEMIMO_v1530 eMIMO_Type_v1530;  // optional

   public CSI_RS_Config_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_Config_v1530 (
      CSI_RS_ConfigEMIMO_v1530 eMIMO_Type_v1530_
   ) {
      super();
      eMIMO_Type_v1530 = eMIMO_Type_v1530_;
   }

   public void init () {
      eMIMO_Type_v1530 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eMIMO_Type_v1530;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eMIMO-Type-v1530";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean eMIMO_Type_v1530Present = buffer.decodeBit ("eMIMO_Type_v1530Present");

      // decode eMIMO_Type_v1530

      if (eMIMO_Type_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("eMIMO_Type_v1530", -1);

         eMIMO_Type_v1530 = new CSI_RS_ConfigEMIMO_v1530();
         eMIMO_Type_v1530.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("eMIMO_Type_v1530", -1);
      }
      else {
         eMIMO_Type_v1530 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eMIMO_Type_v1530 != null) eMIMO_Type_v1530.print (_sb, "eMIMO_Type_v1530", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
