/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SidelinkUEInformation_r12_criticalExtensions_criticalExtensionsFuture extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SidelinkUEInformation_r12_criticalExtensions_criticalExtensionsFuture () {
      super();
      init();
   }

   public void init () {
   }

   public int getElementCount() { return 0; }


   public Object getElementValue(int index){
      switch(index)  {
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
