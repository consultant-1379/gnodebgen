/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LWIP_Configuration_r13_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public LWIP_Config_r13 lwip_Config_r13;

   public LWIP_Configuration_r13_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LWIP_Configuration_r13_setup (
      LWIP_Config_r13 lwip_Config_r13_
   ) {
      super();
      lwip_Config_r13 = lwip_Config_r13_;
   }

   public void init () {
      lwip_Config_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lwip_Config_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lwip-Config-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode lwip_Config_r13

      buffer.getContext().eventDispatcher.startElement("lwip_Config_r13", -1);

      lwip_Config_r13 = new LWIP_Config_r13();
      lwip_Config_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("lwip_Config_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (lwip_Config_r13 != null) lwip_Config_r13.print (_sb, "lwip_Config_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
