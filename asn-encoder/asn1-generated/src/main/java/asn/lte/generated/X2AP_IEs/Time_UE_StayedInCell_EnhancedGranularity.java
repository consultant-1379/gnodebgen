/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class Time_UE_StayedInCell_EnhancedGranularity extends Asn1Integer {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Time-UE-StayedInCell-EnhancedGranularity";
   }

   public Time_UE_StayedInCell_EnhancedGranularity () {
      super();
   }

   public Time_UE_StayedInCell_EnhancedGranularity (long value_) {
      super (value_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer, 0, 40950);

      buffer.invokeCharacters (toString());
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
