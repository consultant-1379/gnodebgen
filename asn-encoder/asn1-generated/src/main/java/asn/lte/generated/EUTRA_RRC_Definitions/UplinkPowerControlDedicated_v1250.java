/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPowerControlDedicated_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkPowerControlDedicated-v1250";
   }

   public UplinkPowerControlDedicated_v1250_set2PowerControlParameter set2PowerControlParameter;

   public UplinkPowerControlDedicated_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkPowerControlDedicated_v1250 (
      UplinkPowerControlDedicated_v1250_set2PowerControlParameter set2PowerControlParameter_
   ) {
      super();
      set2PowerControlParameter = set2PowerControlParameter_;
   }

   public void init () {
      set2PowerControlParameter = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return set2PowerControlParameter;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "set2PowerControlParameter";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode set2PowerControlParameter

      buffer.getContext().eventDispatcher.startElement("set2PowerControlParameter", -1);

      set2PowerControlParameter = new UplinkPowerControlDedicated_v1250_set2PowerControlParameter();
      set2PowerControlParameter.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("set2PowerControlParameter", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (set2PowerControlParameter != null) set2PowerControlParameter.print (_sb, "set2PowerControlParameter", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
