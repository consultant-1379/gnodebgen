/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SecurityConfigHO_v1530_handoverType_v1530_epc_To5GC_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SecurityAlgorithmConfig securityAlgorithmConfig_r15;
   public Asn1OctetString nas_Container_r15;

   public SecurityConfigHO_v1530_handoverType_v1530_epc_To5GC_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SecurityConfigHO_v1530_handoverType_v1530_epc_To5GC_r15 (
      SecurityAlgorithmConfig securityAlgorithmConfig_r15_,
      Asn1OctetString nas_Container_r15_
   ) {
      super();
      securityAlgorithmConfig_r15 = securityAlgorithmConfig_r15_;
      nas_Container_r15 = nas_Container_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SecurityConfigHO_v1530_handoverType_v1530_epc_To5GC_r15 (SecurityAlgorithmConfig securityAlgorithmConfig_r15_,
      byte[] nas_Container_r15_
   ) {
      super();
      securityAlgorithmConfig_r15 = securityAlgorithmConfig_r15_;
      nas_Container_r15 = new Asn1OctetString (nas_Container_r15_);
   }

   public void init () {
      securityAlgorithmConfig_r15 = null;
      nas_Container_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return securityAlgorithmConfig_r15;
         case 1: return nas_Container_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "securityAlgorithmConfig-r15";
         case 1: return "nas-Container-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode securityAlgorithmConfig_r15

      buffer.getContext().eventDispatcher.startElement("securityAlgorithmConfig_r15", -1);

      securityAlgorithmConfig_r15 = new SecurityAlgorithmConfig();
      securityAlgorithmConfig_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("securityAlgorithmConfig_r15", -1);

      // decode nas_Container_r15

      buffer.getContext().eventDispatcher.startElement("nas_Container_r15", -1);

      nas_Container_r15 = new Asn1OctetString();
      nas_Container_r15.decode (buffer);

      buffer.invokeCharacters(nas_Container_r15.toString());
      buffer.getContext().eventDispatcher.endElement("nas_Container_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (securityAlgorithmConfig_r15 != null) securityAlgorithmConfig_r15.print (_sb, "securityAlgorithmConfig_r15", _level+1);
      if (nas_Container_r15 != null) nas_Container_r15.print (_sb, "nas_Container_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
