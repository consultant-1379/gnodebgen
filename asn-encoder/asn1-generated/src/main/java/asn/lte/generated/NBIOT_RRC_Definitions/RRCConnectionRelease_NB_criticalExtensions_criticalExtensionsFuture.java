/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionRelease_NB_criticalExtensions_criticalExtensionsFuture extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RRCConnectionRelease_NB_criticalExtensions_criticalExtensionsFuture () {
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
