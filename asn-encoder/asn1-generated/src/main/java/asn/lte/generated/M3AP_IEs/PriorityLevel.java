/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.M3AP_IEs;

import com.objsys.asn1j.runtime.*;

public class PriorityLevel extends Asn1Integer {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_M3AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PriorityLevel";
   }

   public final static int spare = 0;
   public final static int highest = 1;
   public final static int lowest = 14;
   public final static int no_priority = 15;

   public PriorityLevel () {
      super();
   }

   public PriorityLevel (long value_) {
      super (value_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer, 0, 15);

      buffer.invokeCharacters (toString());
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
