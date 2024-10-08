/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DRX-Config-v1310";
   }

   public DRX_Config_v1310_longDRX_CycleStartOffset_v1310 longDRX_CycleStartOffset_v1310;  // optional

   public DRX_Config_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRX_Config_v1310 (
      DRX_Config_v1310_longDRX_CycleStartOffset_v1310 longDRX_CycleStartOffset_v1310_
   ) {
      super();
      longDRX_CycleStartOffset_v1310 = longDRX_CycleStartOffset_v1310_;
   }

   public void init () {
      longDRX_CycleStartOffset_v1310 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return longDRX_CycleStartOffset_v1310;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "longDRX-CycleStartOffset-v1310";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean longDRX_CycleStartOffset_v1310Present = buffer.decodeBit ("longDRX_CycleStartOffset_v1310Present");

      // decode longDRX_CycleStartOffset_v1310

      if (longDRX_CycleStartOffset_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("longDRX_CycleStartOffset_v1310", -1);

         longDRX_CycleStartOffset_v1310 = new DRX_Config_v1310_longDRX_CycleStartOffset_v1310();
         longDRX_CycleStartOffset_v1310.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("longDRX_CycleStartOffset_v1310", -1);
      }
      else {
         longDRX_CycleStartOffset_v1310 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (longDRX_CycleStartOffset_v1310 != null) longDRX_CycleStartOffset_v1310.print (_sb, "longDRX_CycleStartOffset_v1310", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
