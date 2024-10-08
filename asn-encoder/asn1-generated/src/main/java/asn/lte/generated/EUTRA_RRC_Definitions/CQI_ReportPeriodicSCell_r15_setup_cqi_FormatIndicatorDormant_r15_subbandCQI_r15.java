/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer k_r15;
   public CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15_periodicityFactor_r15 periodicityFactor_r15 = null;

   public CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15 (
      Asn1Integer k_r15_,
      CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15_periodicityFactor_r15 periodicityFactor_r15_
   ) {
      super();
      k_r15 = k_r15_;
      periodicityFactor_r15 = periodicityFactor_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15 (long k_r15_,
      CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15_periodicityFactor_r15 periodicityFactor_r15_
   ) {
      super();
      k_r15 = new Asn1Integer (k_r15_);
      periodicityFactor_r15 = periodicityFactor_r15_;
   }

   public void init () {
      k_r15 = null;
      periodicityFactor_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return k_r15;
         case 1: return periodicityFactor_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "k-r15";
         case 1: return "periodicityFactor-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode k_r15

      buffer.getContext().eventDispatcher.startElement("k_r15", -1);

      k_r15 = new Asn1Integer();
      k_r15.decode (buffer, 1, 4);

      buffer.invokeCharacters(k_r15.toString());
      buffer.getContext().eventDispatcher.endElement("k_r15", -1);

      // decode periodicityFactor_r15

      buffer.getContext().eventDispatcher.startElement("periodicityFactor_r15", -1);

      {
         int tval = CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15_periodicityFactor_r15.decodeEnumValue (buffer);
         periodicityFactor_r15 = CQI_ReportPeriodicSCell_r15_setup_cqi_FormatIndicatorDormant_r15_subbandCQI_r15_periodicityFactor_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("periodicityFactor_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (k_r15 != null) k_r15.print (_sb, "k_r15", _level+1);
      if (periodicityFactor_r15 != null) periodicityFactor_r15.print (_sb, "periodicityFactor_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
