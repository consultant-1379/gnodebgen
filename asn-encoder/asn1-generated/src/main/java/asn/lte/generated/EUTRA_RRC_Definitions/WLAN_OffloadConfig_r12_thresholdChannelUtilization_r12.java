/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_OffloadConfig_r12_thresholdChannelUtilization_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer thresholdChannelUtilizationLow_r12;
   public Asn1Integer thresholdChannelUtilizationHigh_r12;

   public WLAN_OffloadConfig_r12_thresholdChannelUtilization_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLAN_OffloadConfig_r12_thresholdChannelUtilization_r12 (
      Asn1Integer thresholdChannelUtilizationLow_r12_,
      Asn1Integer thresholdChannelUtilizationHigh_r12_
   ) {
      super();
      thresholdChannelUtilizationLow_r12 = thresholdChannelUtilizationLow_r12_;
      thresholdChannelUtilizationHigh_r12 = thresholdChannelUtilizationHigh_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WLAN_OffloadConfig_r12_thresholdChannelUtilization_r12 (long thresholdChannelUtilizationLow_r12_,
      long thresholdChannelUtilizationHigh_r12_
   ) {
      super();
      thresholdChannelUtilizationLow_r12 = new Asn1Integer (thresholdChannelUtilizationLow_r12_);
      thresholdChannelUtilizationHigh_r12 = new Asn1Integer (thresholdChannelUtilizationHigh_r12_);
   }

   public void init () {
      thresholdChannelUtilizationLow_r12 = null;
      thresholdChannelUtilizationHigh_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return thresholdChannelUtilizationLow_r12;
         case 1: return thresholdChannelUtilizationHigh_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "thresholdChannelUtilizationLow-r12";
         case 1: return "thresholdChannelUtilizationHigh-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode thresholdChannelUtilizationLow_r12

      buffer.getContext().eventDispatcher.startElement("thresholdChannelUtilizationLow_r12", -1);

      thresholdChannelUtilizationLow_r12 = new Asn1Integer();
      thresholdChannelUtilizationLow_r12.decode (buffer, 0, 255);

      buffer.invokeCharacters(thresholdChannelUtilizationLow_r12.toString());
      buffer.getContext().eventDispatcher.endElement("thresholdChannelUtilizationLow_r12", -1);

      // decode thresholdChannelUtilizationHigh_r12

      buffer.getContext().eventDispatcher.startElement("thresholdChannelUtilizationHigh_r12", -1);

      thresholdChannelUtilizationHigh_r12 = new Asn1Integer();
      thresholdChannelUtilizationHigh_r12.decode (buffer, 0, 255);

      buffer.invokeCharacters(thresholdChannelUtilizationHigh_r12.toString());
      buffer.getContext().eventDispatcher.endElement("thresholdChannelUtilizationHigh_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (thresholdChannelUtilizationLow_r12 != null) thresholdChannelUtilizationLow_r12.print (_sb, "thresholdChannelUtilizationLow_r12", _level+1);
      if (thresholdChannelUtilizationHigh_r12 != null) thresholdChannelUtilizationHigh_r12.print (_sb, "thresholdChannelUtilizationHigh_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
