/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer maxNumberOfMonitoringCC_r16;
   public CA_ParametersNR_v1610_pdcch_MonitoringCA_r16_supportedSpanArrangement_r16 supportedSpanArrangement_r16 = null;

   public CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 (
      Asn1Integer maxNumberOfMonitoringCC_r16_,
      CA_ParametersNR_v1610_pdcch_MonitoringCA_r16_supportedSpanArrangement_r16 supportedSpanArrangement_r16_
   ) {
      super();
      maxNumberOfMonitoringCC_r16 = maxNumberOfMonitoringCC_r16_;
      supportedSpanArrangement_r16 = supportedSpanArrangement_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 (long maxNumberOfMonitoringCC_r16_,
      CA_ParametersNR_v1610_pdcch_MonitoringCA_r16_supportedSpanArrangement_r16 supportedSpanArrangement_r16_
   ) {
      super();
      maxNumberOfMonitoringCC_r16 = new Asn1Integer (maxNumberOfMonitoringCC_r16_);
      supportedSpanArrangement_r16 = supportedSpanArrangement_r16_;
   }

   public void init () {
      maxNumberOfMonitoringCC_r16 = null;
      supportedSpanArrangement_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberOfMonitoringCC_r16;
         case 1: return supportedSpanArrangement_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberOfMonitoringCC-r16";
         case 1: return "supportedSpanArrangement-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberOfMonitoringCC_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberOfMonitoringCC_r16", -1);

      maxNumberOfMonitoringCC_r16 = new Asn1Integer();
      maxNumberOfMonitoringCC_r16.decode (buffer, 2, 16);

      buffer.invokeCharacters(maxNumberOfMonitoringCC_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberOfMonitoringCC_r16", -1);

      // decode supportedSpanArrangement_r16

      buffer.getContext().eventDispatcher.startElement("supportedSpanArrangement_r16", -1);

      {
         int tval = CA_ParametersNR_v1610_pdcch_MonitoringCA_r16_supportedSpanArrangement_r16.decodeEnumValue (buffer);
         supportedSpanArrangement_r16 = CA_ParametersNR_v1610_pdcch_MonitoringCA_r16_supportedSpanArrangement_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportedSpanArrangement_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberOfMonitoringCC_r16

      if (maxNumberOfMonitoringCC_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberOfMonitoringCC_r16", -1);

         maxNumberOfMonitoringCC_r16.encode (buffer, 2, 16);

         buffer.getContext().eventDispatcher.endElement("maxNumberOfMonitoringCC_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberOfMonitoringCC_r16");

      // encode supportedSpanArrangement_r16

      if (supportedSpanArrangement_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("supportedSpanArrangement_r16", -1);

         supportedSpanArrangement_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedSpanArrangement_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedSpanArrangement_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberOfMonitoringCC_r16 != null) maxNumberOfMonitoringCC_r16.print (_sb, "maxNumberOfMonitoringCC_r16", _level+1);
      if (supportedSpanArrangement_r16 != null) supportedSpanArrangement_r16.print (_sb, "supportedSpanArrangement_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
