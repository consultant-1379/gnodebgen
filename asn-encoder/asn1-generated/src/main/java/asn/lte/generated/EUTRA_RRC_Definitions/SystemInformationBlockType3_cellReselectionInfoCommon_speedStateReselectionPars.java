/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MobilityStateParameters mobilityStateParameters;
   public SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF q_HystSF;

   public SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars (
      MobilityStateParameters mobilityStateParameters_,
      SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF q_HystSF_
   ) {
      super();
      mobilityStateParameters = mobilityStateParameters_;
      q_HystSF = q_HystSF_;
   }

   public void init () {
      mobilityStateParameters = null;
      q_HystSF = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mobilityStateParameters;
         case 1: return q_HystSF;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mobilityStateParameters";
         case 1: return "q-HystSF";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode mobilityStateParameters

      buffer.getContext().eventDispatcher.startElement("mobilityStateParameters", -1);

      mobilityStateParameters = new MobilityStateParameters();
      mobilityStateParameters.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mobilityStateParameters", -1);

      // decode q_HystSF

      buffer.getContext().eventDispatcher.startElement("q_HystSF", -1);

      q_HystSF = new SystemInformationBlockType3_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF();
      q_HystSF.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("q_HystSF", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mobilityStateParameters != null) mobilityStateParameters.print (_sb, "mobilityStateParameters", _level+1);
      if (q_HystSF != null) q_HystSF.print (_sb, "q_HystSF", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
