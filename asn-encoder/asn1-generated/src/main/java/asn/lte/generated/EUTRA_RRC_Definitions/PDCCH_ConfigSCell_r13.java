/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCCH_ConfigSCell_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCCH-ConfigSCell-r13";
   }

   public PDCCH_ConfigSCell_r13_skipMonitoringDCI_format0_1A_r13 skipMonitoringDCI_format0_1A_r13 = null;  // optional

   public PDCCH_ConfigSCell_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCCH_ConfigSCell_r13 (
      PDCCH_ConfigSCell_r13_skipMonitoringDCI_format0_1A_r13 skipMonitoringDCI_format0_1A_r13_
   ) {
      super();
      skipMonitoringDCI_format0_1A_r13 = skipMonitoringDCI_format0_1A_r13_;
   }

   public void init () {
      skipMonitoringDCI_format0_1A_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return skipMonitoringDCI_format0_1A_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "skipMonitoringDCI-format0-1A-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean skipMonitoringDCI_format0_1A_r13Present = buffer.decodeBit ("skipMonitoringDCI_format0_1A_r13Present");

      // decode skipMonitoringDCI_format0_1A_r13

      if (skipMonitoringDCI_format0_1A_r13Present) {
         buffer.getContext().eventDispatcher.startElement("skipMonitoringDCI_format0_1A_r13", -1);

         int tval = PDCCH_ConfigSCell_r13_skipMonitoringDCI_format0_1A_r13.decodeEnumValue (buffer);
         skipMonitoringDCI_format0_1A_r13 = PDCCH_ConfigSCell_r13_skipMonitoringDCI_format0_1A_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("skipMonitoringDCI_format0_1A_r13", -1);
      }
      else {
         skipMonitoringDCI_format0_1A_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (skipMonitoringDCI_format0_1A_r13 != null) skipMonitoringDCI_format0_1A_r13.print (_sb, "skipMonitoringDCI_format0_1A_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
