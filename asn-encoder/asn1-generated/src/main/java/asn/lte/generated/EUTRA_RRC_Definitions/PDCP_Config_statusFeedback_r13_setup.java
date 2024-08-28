/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_statusFeedback_r13_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 statusPDU_TypeForPolling_r13 = null;  // optional
   public PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type1_r13 statusPDU_Periodicity_Type1_r13 = null;  // optional
   public PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type2_r13 statusPDU_Periodicity_Type2_r13 = null;  // optional
   public PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 statusPDU_Periodicity_Offset_r13 = null;  // optional

   public PDCP_Config_statusFeedback_r13_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Config_statusFeedback_r13_setup (
      PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 statusPDU_TypeForPolling_r13_,
      PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type1_r13 statusPDU_Periodicity_Type1_r13_,
      PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type2_r13 statusPDU_Periodicity_Type2_r13_,
      PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 statusPDU_Periodicity_Offset_r13_
   ) {
      super();
      statusPDU_TypeForPolling_r13 = statusPDU_TypeForPolling_r13_;
      statusPDU_Periodicity_Type1_r13 = statusPDU_Periodicity_Type1_r13_;
      statusPDU_Periodicity_Type2_r13 = statusPDU_Periodicity_Type2_r13_;
      statusPDU_Periodicity_Offset_r13 = statusPDU_Periodicity_Offset_r13_;
   }

   public void init () {
      statusPDU_TypeForPolling_r13 = null;
      statusPDU_Periodicity_Type1_r13 = null;
      statusPDU_Periodicity_Type2_r13 = null;
      statusPDU_Periodicity_Offset_r13 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return statusPDU_TypeForPolling_r13;
         case 1: return statusPDU_Periodicity_Type1_r13;
         case 2: return statusPDU_Periodicity_Type2_r13;
         case 3: return statusPDU_Periodicity_Offset_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "statusPDU-TypeForPolling-r13";
         case 1: return "statusPDU-Periodicity-Type1-r13";
         case 2: return "statusPDU-Periodicity-Type2-r13";
         case 3: return "statusPDU-Periodicity-Offset-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean statusPDU_TypeForPolling_r13Present = buffer.decodeBit ("statusPDU_TypeForPolling_r13Present");
      boolean statusPDU_Periodicity_Type1_r13Present = buffer.decodeBit ("statusPDU_Periodicity_Type1_r13Present");
      boolean statusPDU_Periodicity_Type2_r13Present = buffer.decodeBit ("statusPDU_Periodicity_Type2_r13Present");
      boolean statusPDU_Periodicity_Offset_r13Present = buffer.decodeBit ("statusPDU_Periodicity_Offset_r13Present");

      // decode statusPDU_TypeForPolling_r13

      if (statusPDU_TypeForPolling_r13Present) {
         buffer.getContext().eventDispatcher.startElement("statusPDU_TypeForPolling_r13", -1);

         int tval = PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13.decodeEnumValue (buffer);
         statusPDU_TypeForPolling_r13 = PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("statusPDU_TypeForPolling_r13", -1);
      }
      else {
         statusPDU_TypeForPolling_r13 = null;
      }

      // decode statusPDU_Periodicity_Type1_r13

      if (statusPDU_Periodicity_Type1_r13Present) {
         buffer.getContext().eventDispatcher.startElement("statusPDU_Periodicity_Type1_r13", -1);

         int tval = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type1_r13.decodeEnumValue (buffer);
         statusPDU_Periodicity_Type1_r13 = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type1_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("statusPDU_Periodicity_Type1_r13", -1);
      }
      else {
         statusPDU_Periodicity_Type1_r13 = null;
      }

      // decode statusPDU_Periodicity_Type2_r13

      if (statusPDU_Periodicity_Type2_r13Present) {
         buffer.getContext().eventDispatcher.startElement("statusPDU_Periodicity_Type2_r13", -1);

         int tval = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type2_r13.decodeEnumValue (buffer);
         statusPDU_Periodicity_Type2_r13 = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Type2_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("statusPDU_Periodicity_Type2_r13", -1);
      }
      else {
         statusPDU_Periodicity_Type2_r13 = null;
      }

      // decode statusPDU_Periodicity_Offset_r13

      if (statusPDU_Periodicity_Offset_r13Present) {
         buffer.getContext().eventDispatcher.startElement("statusPDU_Periodicity_Offset_r13", -1);

         int tval = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13.decodeEnumValue (buffer);
         statusPDU_Periodicity_Offset_r13 = PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("statusPDU_Periodicity_Offset_r13", -1);
      }
      else {
         statusPDU_Periodicity_Offset_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (statusPDU_TypeForPolling_r13 != null) statusPDU_TypeForPolling_r13.print (_sb, "statusPDU_TypeForPolling_r13", _level+1);
      if (statusPDU_Periodicity_Type1_r13 != null) statusPDU_Periodicity_Type1_r13.print (_sb, "statusPDU_Periodicity_Type1_r13", _level+1);
      if (statusPDU_Periodicity_Type2_r13 != null) statusPDU_Periodicity_Type2_r13.print (_sb, "statusPDU_Periodicity_Type2_r13", _level+1);
      if (statusPDU_Periodicity_Offset_r13 != null) statusPDU_Periodicity_Offset_r13.print (_sb, "statusPDU_Periodicity_Offset_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
