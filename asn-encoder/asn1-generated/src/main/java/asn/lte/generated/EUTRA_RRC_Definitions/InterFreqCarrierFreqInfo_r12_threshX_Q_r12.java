/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InterFreqCarrierFreqInfo_r12_threshX_Q_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ReselectionThresholdQ_r9 threshX_HighQ_r12;
   public ReselectionThresholdQ_r9 threshX_LowQ_r12;

   public InterFreqCarrierFreqInfo_r12_threshX_Q_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InterFreqCarrierFreqInfo_r12_threshX_Q_r12 (
      ReselectionThresholdQ_r9 threshX_HighQ_r12_,
      ReselectionThresholdQ_r9 threshX_LowQ_r12_
   ) {
      super();
      threshX_HighQ_r12 = threshX_HighQ_r12_;
      threshX_LowQ_r12 = threshX_LowQ_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public InterFreqCarrierFreqInfo_r12_threshX_Q_r12 (long threshX_HighQ_r12_,
      long threshX_LowQ_r12_
   ) {
      super();
      threshX_HighQ_r12 = new ReselectionThresholdQ_r9 (threshX_HighQ_r12_);
      threshX_LowQ_r12 = new ReselectionThresholdQ_r9 (threshX_LowQ_r12_);
   }

   public void init () {
      threshX_HighQ_r12 = null;
      threshX_LowQ_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return threshX_HighQ_r12;
         case 1: return threshX_LowQ_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "threshX-HighQ-r12";
         case 1: return "threshX-LowQ-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode threshX_HighQ_r12

      buffer.getContext().eventDispatcher.startElement("threshX_HighQ_r12", -1);

      threshX_HighQ_r12 = new ReselectionThresholdQ_r9();
      threshX_HighQ_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_HighQ_r12", -1);

      // decode threshX_LowQ_r12

      buffer.getContext().eventDispatcher.startElement("threshX_LowQ_r12", -1);

      threshX_LowQ_r12 = new ReselectionThresholdQ_r9();
      threshX_LowQ_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_LowQ_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (threshX_HighQ_r12 != null) threshX_HighQ_r12.print (_sb, "threshX_HighQ_r12", _level+1);
      if (threshX_LowQ_r12 != null) threshX_LowQ_r12.print (_sb, "threshX_LowQ_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
