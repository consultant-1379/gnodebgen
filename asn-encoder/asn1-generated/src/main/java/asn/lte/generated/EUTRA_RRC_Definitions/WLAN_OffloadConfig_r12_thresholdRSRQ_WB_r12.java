/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_OffloadConfig_r12_thresholdRSRQ_WB_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRQ_Range thresholdRSRQ_WB_Low_r12;
   public RSRQ_Range thresholdRSRQ_WB_High_r12;

   public WLAN_OffloadConfig_r12_thresholdRSRQ_WB_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLAN_OffloadConfig_r12_thresholdRSRQ_WB_r12 (
      RSRQ_Range thresholdRSRQ_WB_Low_r12_,
      RSRQ_Range thresholdRSRQ_WB_High_r12_
   ) {
      super();
      thresholdRSRQ_WB_Low_r12 = thresholdRSRQ_WB_Low_r12_;
      thresholdRSRQ_WB_High_r12 = thresholdRSRQ_WB_High_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WLAN_OffloadConfig_r12_thresholdRSRQ_WB_r12 (long thresholdRSRQ_WB_Low_r12_,
      long thresholdRSRQ_WB_High_r12_
   ) {
      super();
      thresholdRSRQ_WB_Low_r12 = new RSRQ_Range (thresholdRSRQ_WB_Low_r12_);
      thresholdRSRQ_WB_High_r12 = new RSRQ_Range (thresholdRSRQ_WB_High_r12_);
   }

   public void init () {
      thresholdRSRQ_WB_Low_r12 = null;
      thresholdRSRQ_WB_High_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return thresholdRSRQ_WB_Low_r12;
         case 1: return thresholdRSRQ_WB_High_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "thresholdRSRQ-WB-Low-r12";
         case 1: return "thresholdRSRQ-WB-High-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode thresholdRSRQ_WB_Low_r12

      buffer.getContext().eventDispatcher.startElement("thresholdRSRQ_WB_Low_r12", -1);

      thresholdRSRQ_WB_Low_r12 = new RSRQ_Range();
      thresholdRSRQ_WB_Low_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("thresholdRSRQ_WB_Low_r12", -1);

      // decode thresholdRSRQ_WB_High_r12

      buffer.getContext().eventDispatcher.startElement("thresholdRSRQ_WB_High_r12", -1);

      thresholdRSRQ_WB_High_r12 = new RSRQ_Range();
      thresholdRSRQ_WB_High_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("thresholdRSRQ_WB_High_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (thresholdRSRQ_WB_Low_r12 != null) thresholdRSRQ_WB_Low_r12.print (_sb, "thresholdRSRQ_WB_Low_r12", _level+1);
      if (thresholdRSRQ_WB_High_r12 != null) thresholdRSRQ_WB_High_r12.print (_sb, "thresholdRSRQ_WB_High_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
