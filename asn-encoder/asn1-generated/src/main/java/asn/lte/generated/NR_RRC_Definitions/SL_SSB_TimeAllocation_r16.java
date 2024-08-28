/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_SSB_TimeAllocation_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-SSB-TimeAllocation-r16";
   }

   public SL_SSB_TimeAllocation_r16_sl_NumSSB_WithinPeriod_r16 sl_NumSSB_WithinPeriod_r16 = null;  // optional
   public Asn1Integer sl_TimeOffsetSSB_r16;  // optional
   public Asn1Integer sl_TimeInterval_r16;  // optional

   public SL_SSB_TimeAllocation_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_SSB_TimeAllocation_r16 (
      SL_SSB_TimeAllocation_r16_sl_NumSSB_WithinPeriod_r16 sl_NumSSB_WithinPeriod_r16_,
      Asn1Integer sl_TimeOffsetSSB_r16_,
      Asn1Integer sl_TimeInterval_r16_
   ) {
      super();
      sl_NumSSB_WithinPeriod_r16 = sl_NumSSB_WithinPeriod_r16_;
      sl_TimeOffsetSSB_r16 = sl_TimeOffsetSSB_r16_;
      sl_TimeInterval_r16 = sl_TimeInterval_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_SSB_TimeAllocation_r16 (SL_SSB_TimeAllocation_r16_sl_NumSSB_WithinPeriod_r16 sl_NumSSB_WithinPeriod_r16_,
      long sl_TimeOffsetSSB_r16_,
      long sl_TimeInterval_r16_
   ) {
      super();
      sl_NumSSB_WithinPeriod_r16 = sl_NumSSB_WithinPeriod_r16_;
      sl_TimeOffsetSSB_r16 = new Asn1Integer (sl_TimeOffsetSSB_r16_);
      sl_TimeInterval_r16 = new Asn1Integer (sl_TimeInterval_r16_);
   }

   public void init () {
      sl_NumSSB_WithinPeriod_r16 = null;
      sl_TimeOffsetSSB_r16 = null;
      sl_TimeInterval_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_NumSSB_WithinPeriod_r16;
         case 1: return sl_TimeOffsetSSB_r16;
         case 2: return sl_TimeInterval_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-NumSSB-WithinPeriod-r16";
         case 1: return "sl-TimeOffsetSSB-r16";
         case 2: return "sl-TimeInterval-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sl_NumSSB_WithinPeriod_r16Present = buffer.decodeBit ("sl_NumSSB_WithinPeriod_r16Present");
      boolean sl_TimeOffsetSSB_r16Present = buffer.decodeBit ("sl_TimeOffsetSSB_r16Present");
      boolean sl_TimeInterval_r16Present = buffer.decodeBit ("sl_TimeInterval_r16Present");

      // decode sl_NumSSB_WithinPeriod_r16

      if (sl_NumSSB_WithinPeriod_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_NumSSB_WithinPeriod_r16", -1);

         int tval = SL_SSB_TimeAllocation_r16_sl_NumSSB_WithinPeriod_r16.decodeEnumValue (buffer);
         sl_NumSSB_WithinPeriod_r16 = SL_SSB_TimeAllocation_r16_sl_NumSSB_WithinPeriod_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_NumSSB_WithinPeriod_r16", -1);
      }
      else {
         sl_NumSSB_WithinPeriod_r16 = null;
      }

      // decode sl_TimeOffsetSSB_r16

      if (sl_TimeOffsetSSB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_TimeOffsetSSB_r16", -1);

         sl_TimeOffsetSSB_r16 = new Asn1Integer();
         sl_TimeOffsetSSB_r16.decode (buffer, 0, 1279);

         buffer.invokeCharacters(sl_TimeOffsetSSB_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_TimeOffsetSSB_r16", -1);
      }
      else {
         sl_TimeOffsetSSB_r16 = null;
      }

      // decode sl_TimeInterval_r16

      if (sl_TimeInterval_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_TimeInterval_r16", -1);

         sl_TimeInterval_r16 = new Asn1Integer();
         sl_TimeInterval_r16.decode (buffer, 0, 639);

         buffer.invokeCharacters(sl_TimeInterval_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_TimeInterval_r16", -1);
      }
      else {
         sl_TimeInterval_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_NumSSB_WithinPeriod_r16 != null) sl_NumSSB_WithinPeriod_r16.print (_sb, "sl_NumSSB_WithinPeriod_r16", _level+1);
      if (sl_TimeOffsetSSB_r16 != null) sl_TimeOffsetSSB_r16.print (_sb, "sl_TimeOffsetSSB_r16", _level+1);
      if (sl_TimeInterval_r16 != null) sl_TimeInterval_r16.print (_sb, "sl_TimeInterval_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
