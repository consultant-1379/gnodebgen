/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqNR_r15_threshX_Q_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ReselectionThresholdQ_r9 threshX_HighQ_r15;
   public ReselectionThresholdQ_r9 threshX_LowQ_r15;

   public CarrierFreqNR_r15_threshX_Q_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqNR_r15_threshX_Q_r15 (
      ReselectionThresholdQ_r9 threshX_HighQ_r15_,
      ReselectionThresholdQ_r9 threshX_LowQ_r15_
   ) {
      super();
      threshX_HighQ_r15 = threshX_HighQ_r15_;
      threshX_LowQ_r15 = threshX_LowQ_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CarrierFreqNR_r15_threshX_Q_r15 (long threshX_HighQ_r15_,
      long threshX_LowQ_r15_
   ) {
      super();
      threshX_HighQ_r15 = new ReselectionThresholdQ_r9 (threshX_HighQ_r15_);
      threshX_LowQ_r15 = new ReselectionThresholdQ_r9 (threshX_LowQ_r15_);
   }

   public void init () {
      threshX_HighQ_r15 = null;
      threshX_LowQ_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return threshX_HighQ_r15;
         case 1: return threshX_LowQ_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "threshX-HighQ-r15";
         case 1: return "threshX-LowQ-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode threshX_HighQ_r15

      buffer.getContext().eventDispatcher.startElement("threshX_HighQ_r15", -1);

      threshX_HighQ_r15 = new ReselectionThresholdQ_r9();
      threshX_HighQ_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_HighQ_r15", -1);

      // decode threshX_LowQ_r15

      buffer.getContext().eventDispatcher.startElement("threshX_LowQ_r15", -1);

      threshX_LowQ_r15 = new ReselectionThresholdQ_r9();
      threshX_LowQ_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_LowQ_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (threshX_HighQ_r15 != null) threshX_HighQ_r15.print (_sb, "threshX_HighQ_r15", _level+1);
      if (threshX_LowQ_r15 != null) threshX_LowQ_r15.print (_sb, "threshX_LowQ_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
