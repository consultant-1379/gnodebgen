/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public TDD_Config_NB_r15 tdd_Config_r15;
   public SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15_tdd_SI_CarrierInfo_r15 tdd_SI_CarrierInfo_r15 = null;
   public DL_Bitmap_NB_r13 tdd_SI_SubframesBitmap_r15;  // optional

   public SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15 (
      TDD_Config_NB_r15 tdd_Config_r15_,
      SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15_tdd_SI_CarrierInfo_r15 tdd_SI_CarrierInfo_r15_,
      DL_Bitmap_NB_r13 tdd_SI_SubframesBitmap_r15_
   ) {
      super();
      tdd_Config_r15 = tdd_Config_r15_;
      tdd_SI_CarrierInfo_r15 = tdd_SI_CarrierInfo_r15_;
      tdd_SI_SubframesBitmap_r15 = tdd_SI_SubframesBitmap_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15 (
      TDD_Config_NB_r15 tdd_Config_r15_,
      SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15_tdd_SI_CarrierInfo_r15 tdd_SI_CarrierInfo_r15_
   ) {
      super();
      tdd_Config_r15 = tdd_Config_r15_;
      tdd_SI_CarrierInfo_r15 = tdd_SI_CarrierInfo_r15_;
   }

   public void init () {
      tdd_Config_r15 = null;
      tdd_SI_CarrierInfo_r15 = null;
      tdd_SI_SubframesBitmap_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tdd_Config_r15;
         case 1: return tdd_SI_CarrierInfo_r15;
         case 2: return tdd_SI_SubframesBitmap_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tdd-Config-r15";
         case 1: return "tdd-SI-CarrierInfo-r15";
         case 2: return "tdd-SI-SubframesBitmap-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tdd_SI_SubframesBitmap_r15Present = buffer.decodeBit ("tdd_SI_SubframesBitmap_r15Present");

      // decode tdd_Config_r15

      buffer.getContext().eventDispatcher.startElement("tdd_Config_r15", -1);

      tdd_Config_r15 = new TDD_Config_NB_r15();
      tdd_Config_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("tdd_Config_r15", -1);

      // decode tdd_SI_CarrierInfo_r15

      buffer.getContext().eventDispatcher.startElement("tdd_SI_CarrierInfo_r15", -1);

      {
         int tval = SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15_tdd_SI_CarrierInfo_r15.decodeEnumValue (buffer);
         tdd_SI_CarrierInfo_r15 = SystemInformationBlockType1_NB_v1530_tdd_Parameters_r15_tdd_SI_CarrierInfo_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("tdd_SI_CarrierInfo_r15", -1);

      // decode tdd_SI_SubframesBitmap_r15

      if (tdd_SI_SubframesBitmap_r15Present) {
         buffer.getContext().eventDispatcher.startElement("tdd_SI_SubframesBitmap_r15", -1);

         tdd_SI_SubframesBitmap_r15 = new DL_Bitmap_NB_r13();
         tdd_SI_SubframesBitmap_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tdd_SI_SubframesBitmap_r15", -1);
      }
      else {
         tdd_SI_SubframesBitmap_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tdd_Config_r15 != null) tdd_Config_r15.print (_sb, "tdd_Config_r15", _level+1);
      if (tdd_SI_CarrierInfo_r15 != null) tdd_SI_CarrierInfo_r15.print (_sb, "tdd_SI_CarrierInfo_r15", _level+1);
      if (tdd_SI_SubframesBitmap_r15 != null) tdd_SI_SubframesBitmap_r15.print (_sb, "tdd_SI_SubframesBitmap_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
