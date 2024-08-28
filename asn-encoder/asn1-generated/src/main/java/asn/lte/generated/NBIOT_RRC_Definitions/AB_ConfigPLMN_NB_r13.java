/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AB_ConfigPLMN_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AB-ConfigPLMN-NB-r13";
   }

   public AB_Config_NB_r13 ab_Config_r13;  // optional

   public AB_ConfigPLMN_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AB_ConfigPLMN_NB_r13 (
      AB_Config_NB_r13 ab_Config_r13_
   ) {
      super();
      ab_Config_r13 = ab_Config_r13_;
   }

   public void init () {
      ab_Config_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ab_Config_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ab-Config-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ab_Config_r13Present = buffer.decodeBit ("ab_Config_r13Present");

      // decode ab_Config_r13

      if (ab_Config_r13Present) {
         buffer.getContext().eventDispatcher.startElement("ab_Config_r13", -1);

         ab_Config_r13 = new AB_Config_NB_r13();
         ab_Config_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ab_Config_r13", -1);
      }
      else {
         ab_Config_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ab_Config_r13 != null) ab_Config_r13.print (_sb, "ab_Config_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
