/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.SL_MeasId_r16;

public class VarMeasReportSL_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarMeasReportSL-r16";
   }

   public SL_MeasId_r16 sl_MeasId_r16;
   public VarMeasReportSL_r16_sl_FrequencyTriggeredList_r16 sl_FrequencyTriggeredList_r16;  // optional
   public Asn1Integer sl_NumberOfReportsSent_r16;

   public VarMeasReportSL_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarMeasReportSL_r16 (
      SL_MeasId_r16 sl_MeasId_r16_,
      VarMeasReportSL_r16_sl_FrequencyTriggeredList_r16 sl_FrequencyTriggeredList_r16_,
      Asn1Integer sl_NumberOfReportsSent_r16_
   ) {
      super();
      sl_MeasId_r16 = sl_MeasId_r16_;
      sl_FrequencyTriggeredList_r16 = sl_FrequencyTriggeredList_r16_;
      sl_NumberOfReportsSent_r16 = sl_NumberOfReportsSent_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public VarMeasReportSL_r16 (
      SL_MeasId_r16 sl_MeasId_r16_,
      Asn1Integer sl_NumberOfReportsSent_r16_
   ) {
      super();
      sl_MeasId_r16 = sl_MeasId_r16_;
      sl_NumberOfReportsSent_r16 = sl_NumberOfReportsSent_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public VarMeasReportSL_r16 (long sl_MeasId_r16_,
      VarMeasReportSL_r16_sl_FrequencyTriggeredList_r16 sl_FrequencyTriggeredList_r16_,
      long sl_NumberOfReportsSent_r16_
   ) {
      super();
      sl_MeasId_r16 = new SL_MeasId_r16 (sl_MeasId_r16_);
      sl_FrequencyTriggeredList_r16 = sl_FrequencyTriggeredList_r16_;
      sl_NumberOfReportsSent_r16 = new Asn1Integer (sl_NumberOfReportsSent_r16_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public VarMeasReportSL_r16 (
      long sl_MeasId_r16_,
      long sl_NumberOfReportsSent_r16_
   ) {
      super();
      sl_MeasId_r16 = new SL_MeasId_r16 (sl_MeasId_r16_);
      sl_NumberOfReportsSent_r16 = new Asn1Integer (sl_NumberOfReportsSent_r16_);
   }

   public void init () {
      sl_MeasId_r16 = null;
      sl_FrequencyTriggeredList_r16 = null;
      sl_NumberOfReportsSent_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_MeasId_r16;
         case 1: return sl_FrequencyTriggeredList_r16;
         case 2: return sl_NumberOfReportsSent_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-MeasId-r16";
         case 1: return "sl-FrequencyTriggeredList-r16";
         case 2: return "sl-NumberOfReportsSent-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sl_FrequencyTriggeredList_r16Present = buffer.decodeBit ("sl_FrequencyTriggeredList_r16Present");

      // decode sl_MeasId_r16

      buffer.getContext().eventDispatcher.startElement("sl_MeasId_r16", -1);

      sl_MeasId_r16 = new SL_MeasId_r16();
      sl_MeasId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_MeasId_r16", -1);

      // decode sl_FrequencyTriggeredList_r16

      if (sl_FrequencyTriggeredList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_FrequencyTriggeredList_r16", -1);

         sl_FrequencyTriggeredList_r16 = new VarMeasReportSL_r16_sl_FrequencyTriggeredList_r16();
         sl_FrequencyTriggeredList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_FrequencyTriggeredList_r16", -1);
      }
      else {
         sl_FrequencyTriggeredList_r16 = null;
      }

      // decode sl_NumberOfReportsSent_r16

      buffer.getContext().eventDispatcher.startElement("sl_NumberOfReportsSent_r16", -1);

      sl_NumberOfReportsSent_r16 = new Asn1Integer();
      sl_NumberOfReportsSent_r16.decode (buffer);

      buffer.invokeCharacters(sl_NumberOfReportsSent_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sl_NumberOfReportsSent_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sl_FrequencyTriggeredList_r16 != null), null);

      // encode sl_MeasId_r16

      if (sl_MeasId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_MeasId_r16", -1);

         sl_MeasId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_MeasId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("sl_MeasId_r16");

      // encode sl_FrequencyTriggeredList_r16

      if (sl_FrequencyTriggeredList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_FrequencyTriggeredList_r16", -1);

         sl_FrequencyTriggeredList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_FrequencyTriggeredList_r16", -1);
      }

      // encode sl_NumberOfReportsSent_r16

      if (sl_NumberOfReportsSent_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_NumberOfReportsSent_r16", -1);

         sl_NumberOfReportsSent_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_NumberOfReportsSent_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("sl_NumberOfReportsSent_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_MeasId_r16 != null) sl_MeasId_r16.print (_sb, "sl_MeasId_r16", _level+1);
      if (sl_FrequencyTriggeredList_r16 != null) sl_FrequencyTriggeredList_r16.print (_sb, "sl_FrequencyTriggeredList_r16", _level+1);
      if (sl_NumberOfReportsSent_r16 != null) sl_NumberOfReportsSent_r16.print (_sb, "sl_NumberOfReportsSent_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
