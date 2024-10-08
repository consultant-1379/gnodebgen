/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NRDC_Parameters_v1570 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NRDC-Parameters-v1570";
   }

   public NRDC_Parameters_v1570_sfn_SyncNRDC sfn_SyncNRDC = null;  // optional

   public NRDC_Parameters_v1570 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NRDC_Parameters_v1570 (
      NRDC_Parameters_v1570_sfn_SyncNRDC sfn_SyncNRDC_
   ) {
      super();
      sfn_SyncNRDC = sfn_SyncNRDC_;
   }

   public void init () {
      sfn_SyncNRDC = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sfn_SyncNRDC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sfn-SyncNRDC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sfn_SyncNRDCPresent = buffer.decodeBit ("sfn_SyncNRDCPresent");

      // decode sfn_SyncNRDC

      if (sfn_SyncNRDCPresent) {
         buffer.getContext().eventDispatcher.startElement("sfn_SyncNRDC", -1);

         int tval = NRDC_Parameters_v1570_sfn_SyncNRDC.decodeEnumValue (buffer);
         sfn_SyncNRDC = NRDC_Parameters_v1570_sfn_SyncNRDC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sfn_SyncNRDC", -1);
      }
      else {
         sfn_SyncNRDC = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sfn_SyncNRDC != null) sfn_SyncNRDC.print (_sb, "sfn_SyncNRDC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
