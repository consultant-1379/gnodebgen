/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EPDCCH_Config_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EPDCCH-Config-r11";
   }

   public EPDCCH_Config_r11_config_r11 config_r11;

   public EPDCCH_Config_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EPDCCH_Config_r11 (
      EPDCCH_Config_r11_config_r11 config_r11_
   ) {
      super();
      config_r11 = config_r11_;
   }

   public void init () {
      config_r11 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return config_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "config-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode config_r11

      buffer.getContext().eventDispatcher.startElement("config_r11", -1);

      config_r11 = new EPDCCH_Config_r11_config_r11();
      config_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("config_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (config_r11 != null) config_r11.print (_sb, "config_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
