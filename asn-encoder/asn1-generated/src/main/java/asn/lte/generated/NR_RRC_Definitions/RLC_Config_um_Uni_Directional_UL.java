/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Config_um_Uni_Directional_UL extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public UL_UM_RLC ul_UM_RLC;

   public RLC_Config_um_Uni_Directional_UL () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLC_Config_um_Uni_Directional_UL (
      UL_UM_RLC ul_UM_RLC_
   ) {
      super();
      ul_UM_RLC = ul_UM_RLC_;
   }

   public void init () {
      ul_UM_RLC = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_UM_RLC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-UM-RLC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ul_UM_RLC

      buffer.getContext().eventDispatcher.startElement("ul_UM_RLC", -1);

      ul_UM_RLC = new UL_UM_RLC();
      ul_UM_RLC.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_UM_RLC", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_UM_RLC != null) ul_UM_RLC.print (_sb, "ul_UM_RLC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
