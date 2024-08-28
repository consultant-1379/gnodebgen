/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportPeriodicSCell_r15_setup_csi_SubframePatternDormant_r15_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasSubframePattern_r10 csi_MeasSubframeSet1_r15;
   public MeasSubframePattern_r10 csi_MeasSubframeSet2_r15;

   public CQI_ReportPeriodicSCell_r15_setup_csi_SubframePatternDormant_r15_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportPeriodicSCell_r15_setup_csi_SubframePatternDormant_r15_setup (
      MeasSubframePattern_r10 csi_MeasSubframeSet1_r15_,
      MeasSubframePattern_r10 csi_MeasSubframeSet2_r15_
   ) {
      super();
      csi_MeasSubframeSet1_r15 = csi_MeasSubframeSet1_r15_;
      csi_MeasSubframeSet2_r15 = csi_MeasSubframeSet2_r15_;
   }

   public void init () {
      csi_MeasSubframeSet1_r15 = null;
      csi_MeasSubframeSet2_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_MeasSubframeSet1_r15;
         case 1: return csi_MeasSubframeSet2_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-MeasSubframeSet1-r15";
         case 1: return "csi-MeasSubframeSet2-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode csi_MeasSubframeSet1_r15

      buffer.getContext().eventDispatcher.startElement("csi_MeasSubframeSet1_r15", -1);

      csi_MeasSubframeSet1_r15 = new MeasSubframePattern_r10();
      csi_MeasSubframeSet1_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_MeasSubframeSet1_r15", -1);

      // decode csi_MeasSubframeSet2_r15

      buffer.getContext().eventDispatcher.startElement("csi_MeasSubframeSet2_r15", -1);

      csi_MeasSubframeSet2_r15 = new MeasSubframePattern_r10();
      csi_MeasSubframeSet2_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_MeasSubframeSet2_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_MeasSubframeSet1_r15 != null) csi_MeasSubframeSet1_r15.print (_sb, "csi_MeasSubframeSet1_r15", _level+1);
      if (csi_MeasSubframeSet2_r15 != null) csi_MeasSubframeSet2_r15.print (_sb, "csi_MeasSubframeSet2_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
