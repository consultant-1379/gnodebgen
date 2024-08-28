/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportConfig_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CQI-ReportConfig-v1250";
   }

   public CQI_ReportConfig_v1250_csi_SubframePatternConfig_r12 csi_SubframePatternConfig_r12;  // optional
   public CQI_ReportBoth_v1250 cqi_ReportBoth_v1250;  // optional
   public CQI_ReportAperiodic_v1250 cqi_ReportAperiodic_v1250;  // optional
   public CQI_ReportConfig_v1250_altCQI_Table_r12 altCQI_Table_r12 = null;  // optional

   public CQI_ReportConfig_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportConfig_v1250 (
      CQI_ReportConfig_v1250_csi_SubframePatternConfig_r12 csi_SubframePatternConfig_r12_,
      CQI_ReportBoth_v1250 cqi_ReportBoth_v1250_,
      CQI_ReportAperiodic_v1250 cqi_ReportAperiodic_v1250_,
      CQI_ReportConfig_v1250_altCQI_Table_r12 altCQI_Table_r12_
   ) {
      super();
      csi_SubframePatternConfig_r12 = csi_SubframePatternConfig_r12_;
      cqi_ReportBoth_v1250 = cqi_ReportBoth_v1250_;
      cqi_ReportAperiodic_v1250 = cqi_ReportAperiodic_v1250_;
      altCQI_Table_r12 = altCQI_Table_r12_;
   }

   public void init () {
      csi_SubframePatternConfig_r12 = null;
      cqi_ReportBoth_v1250 = null;
      cqi_ReportAperiodic_v1250 = null;
      altCQI_Table_r12 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_SubframePatternConfig_r12;
         case 1: return cqi_ReportBoth_v1250;
         case 2: return cqi_ReportAperiodic_v1250;
         case 3: return altCQI_Table_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-SubframePatternConfig-r12";
         case 1: return "cqi-ReportBoth-v1250";
         case 2: return "cqi-ReportAperiodic-v1250";
         case 3: return "altCQI-Table-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean csi_SubframePatternConfig_r12Present = buffer.decodeBit ("csi_SubframePatternConfig_r12Present");
      boolean cqi_ReportBoth_v1250Present = buffer.decodeBit ("cqi_ReportBoth_v1250Present");
      boolean cqi_ReportAperiodic_v1250Present = buffer.decodeBit ("cqi_ReportAperiodic_v1250Present");
      boolean altCQI_Table_r12Present = buffer.decodeBit ("altCQI_Table_r12Present");

      // decode csi_SubframePatternConfig_r12

      if (csi_SubframePatternConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("csi_SubframePatternConfig_r12", -1);

         csi_SubframePatternConfig_r12 = new CQI_ReportConfig_v1250_csi_SubframePatternConfig_r12();
         csi_SubframePatternConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csi_SubframePatternConfig_r12", -1);
      }
      else {
         csi_SubframePatternConfig_r12 = null;
      }

      // decode cqi_ReportBoth_v1250

      if (cqi_ReportBoth_v1250Present) {
         buffer.getContext().eventDispatcher.startElement("cqi_ReportBoth_v1250", -1);

         cqi_ReportBoth_v1250 = new CQI_ReportBoth_v1250();
         cqi_ReportBoth_v1250.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cqi_ReportBoth_v1250", -1);
      }
      else {
         cqi_ReportBoth_v1250 = null;
      }

      // decode cqi_ReportAperiodic_v1250

      if (cqi_ReportAperiodic_v1250Present) {
         buffer.getContext().eventDispatcher.startElement("cqi_ReportAperiodic_v1250", -1);

         cqi_ReportAperiodic_v1250 = new CQI_ReportAperiodic_v1250();
         cqi_ReportAperiodic_v1250.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cqi_ReportAperiodic_v1250", -1);
      }
      else {
         cqi_ReportAperiodic_v1250 = null;
      }

      // decode altCQI_Table_r12

      if (altCQI_Table_r12Present) {
         buffer.getContext().eventDispatcher.startElement("altCQI_Table_r12", -1);

         int tval = CQI_ReportConfig_v1250_altCQI_Table_r12.decodeEnumValue (buffer);
         altCQI_Table_r12 = CQI_ReportConfig_v1250_altCQI_Table_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("altCQI_Table_r12", -1);
      }
      else {
         altCQI_Table_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_SubframePatternConfig_r12 != null) csi_SubframePatternConfig_r12.print (_sb, "csi_SubframePatternConfig_r12", _level+1);
      if (cqi_ReportBoth_v1250 != null) cqi_ReportBoth_v1250.print (_sb, "cqi_ReportBoth_v1250", _level+1);
      if (cqi_ReportAperiodic_v1250 != null) cqi_ReportAperiodic_v1250.print (_sb, "cqi_ReportAperiodic_v1250", _level+1);
      if (altCQI_Table_r12 != null) altCQI_Table_r12.print (_sb, "altCQI_Table_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
