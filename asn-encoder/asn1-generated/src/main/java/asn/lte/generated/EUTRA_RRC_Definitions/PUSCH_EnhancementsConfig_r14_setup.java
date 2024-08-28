/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_EnhancementsConfig_r14_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer pusch_HoppingOffsetPUSCH_Enh_r14;  // optional
   public PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14 interval_ULHoppingPUSCH_Enh_r14;  // optional

   public PUSCH_EnhancementsConfig_r14_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_EnhancementsConfig_r14_setup (
      Asn1Integer pusch_HoppingOffsetPUSCH_Enh_r14_,
      PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14 interval_ULHoppingPUSCH_Enh_r14_
   ) {
      super();
      pusch_HoppingOffsetPUSCH_Enh_r14 = pusch_HoppingOffsetPUSCH_Enh_r14_;
      interval_ULHoppingPUSCH_Enh_r14 = interval_ULHoppingPUSCH_Enh_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_EnhancementsConfig_r14_setup (long pusch_HoppingOffsetPUSCH_Enh_r14_,
      PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14 interval_ULHoppingPUSCH_Enh_r14_
   ) {
      super();
      pusch_HoppingOffsetPUSCH_Enh_r14 = new Asn1Integer (pusch_HoppingOffsetPUSCH_Enh_r14_);
      interval_ULHoppingPUSCH_Enh_r14 = interval_ULHoppingPUSCH_Enh_r14_;
   }

   public void init () {
      pusch_HoppingOffsetPUSCH_Enh_r14 = null;
      interval_ULHoppingPUSCH_Enh_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pusch_HoppingOffsetPUSCH_Enh_r14;
         case 1: return interval_ULHoppingPUSCH_Enh_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pusch-HoppingOffsetPUSCH-Enh-r14";
         case 1: return "interval-ULHoppingPUSCH-Enh-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pusch_HoppingOffsetPUSCH_Enh_r14Present = buffer.decodeBit ("pusch_HoppingOffsetPUSCH_Enh_r14Present");
      boolean interval_ULHoppingPUSCH_Enh_r14Present = buffer.decodeBit ("interval_ULHoppingPUSCH_Enh_r14Present");

      // decode pusch_HoppingOffsetPUSCH_Enh_r14

      if (pusch_HoppingOffsetPUSCH_Enh_r14Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_HoppingOffsetPUSCH_Enh_r14", -1);

         pusch_HoppingOffsetPUSCH_Enh_r14 = new Asn1Integer();
         pusch_HoppingOffsetPUSCH_Enh_r14.decode (buffer, 1, 100);

         buffer.invokeCharacters(pusch_HoppingOffsetPUSCH_Enh_r14.toString());
         buffer.getContext().eventDispatcher.endElement("pusch_HoppingOffsetPUSCH_Enh_r14", -1);
      }
      else {
         pusch_HoppingOffsetPUSCH_Enh_r14 = null;
      }

      // decode interval_ULHoppingPUSCH_Enh_r14

      if (interval_ULHoppingPUSCH_Enh_r14Present) {
         buffer.getContext().eventDispatcher.startElement("interval_ULHoppingPUSCH_Enh_r14", -1);

         interval_ULHoppingPUSCH_Enh_r14 = new PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14();
         interval_ULHoppingPUSCH_Enh_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interval_ULHoppingPUSCH_Enh_r14", -1);
      }
      else {
         interval_ULHoppingPUSCH_Enh_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pusch_HoppingOffsetPUSCH_Enh_r14 != null) pusch_HoppingOffsetPUSCH_Enh_r14.print (_sb, "pusch_HoppingOffsetPUSCH_Enh_r14", _level+1);
      if (interval_ULHoppingPUSCH_Enh_r14 != null) interval_ULHoppingPUSCH_Enh_r14.print (_sb, "interval_ULHoppingPUSCH_Enh_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
