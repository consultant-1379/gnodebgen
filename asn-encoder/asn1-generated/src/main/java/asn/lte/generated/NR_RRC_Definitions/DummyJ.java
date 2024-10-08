/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyJ extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DummyJ";
   }

   public Asn1Integer maxEnergyDetectionThreshold_r16;
   public Asn1Integer energyDetectionThresholdOffset_r16;
   public Asn1Integer ul_toDL_COT_SharingED_Threshold_r16;  // optional
   public DummyJ_absenceOfAnyOtherTechnology_r16 absenceOfAnyOtherTechnology_r16 = null;  // optional

   public DummyJ () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DummyJ (
      Asn1Integer maxEnergyDetectionThreshold_r16_,
      Asn1Integer energyDetectionThresholdOffset_r16_,
      Asn1Integer ul_toDL_COT_SharingED_Threshold_r16_,
      DummyJ_absenceOfAnyOtherTechnology_r16 absenceOfAnyOtherTechnology_r16_
   ) {
      super();
      maxEnergyDetectionThreshold_r16 = maxEnergyDetectionThreshold_r16_;
      energyDetectionThresholdOffset_r16 = energyDetectionThresholdOffset_r16_;
      ul_toDL_COT_SharingED_Threshold_r16 = ul_toDL_COT_SharingED_Threshold_r16_;
      absenceOfAnyOtherTechnology_r16 = absenceOfAnyOtherTechnology_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DummyJ (
      Asn1Integer maxEnergyDetectionThreshold_r16_,
      Asn1Integer energyDetectionThresholdOffset_r16_
   ) {
      super();
      maxEnergyDetectionThreshold_r16 = maxEnergyDetectionThreshold_r16_;
      energyDetectionThresholdOffset_r16 = energyDetectionThresholdOffset_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DummyJ (long maxEnergyDetectionThreshold_r16_,
      long energyDetectionThresholdOffset_r16_,
      long ul_toDL_COT_SharingED_Threshold_r16_,
      DummyJ_absenceOfAnyOtherTechnology_r16 absenceOfAnyOtherTechnology_r16_
   ) {
      super();
      maxEnergyDetectionThreshold_r16 = new Asn1Integer (maxEnergyDetectionThreshold_r16_);
      energyDetectionThresholdOffset_r16 = new Asn1Integer (energyDetectionThresholdOffset_r16_);
      ul_toDL_COT_SharingED_Threshold_r16 = new Asn1Integer (ul_toDL_COT_SharingED_Threshold_r16_);
      absenceOfAnyOtherTechnology_r16 = absenceOfAnyOtherTechnology_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public DummyJ (
      long maxEnergyDetectionThreshold_r16_,
      long energyDetectionThresholdOffset_r16_
   ) {
      super();
      maxEnergyDetectionThreshold_r16 = new Asn1Integer (maxEnergyDetectionThreshold_r16_);
      energyDetectionThresholdOffset_r16 = new Asn1Integer (energyDetectionThresholdOffset_r16_);
   }

   public void init () {
      maxEnergyDetectionThreshold_r16 = null;
      energyDetectionThresholdOffset_r16 = null;
      ul_toDL_COT_SharingED_Threshold_r16 = null;
      absenceOfAnyOtherTechnology_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxEnergyDetectionThreshold_r16;
         case 1: return energyDetectionThresholdOffset_r16;
         case 2: return ul_toDL_COT_SharingED_Threshold_r16;
         case 3: return absenceOfAnyOtherTechnology_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxEnergyDetectionThreshold-r16";
         case 1: return "energyDetectionThresholdOffset-r16";
         case 2: return "ul-toDL-COT-SharingED-Threshold-r16";
         case 3: return "absenceOfAnyOtherTechnology-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ul_toDL_COT_SharingED_Threshold_r16Present = buffer.decodeBit ("ul_toDL_COT_SharingED_Threshold_r16Present");
      boolean absenceOfAnyOtherTechnology_r16Present = buffer.decodeBit ("absenceOfAnyOtherTechnology_r16Present");

      // decode maxEnergyDetectionThreshold_r16

      buffer.getContext().eventDispatcher.startElement("maxEnergyDetectionThreshold_r16", -1);

      maxEnergyDetectionThreshold_r16 = new Asn1Integer();
      maxEnergyDetectionThreshold_r16.decode (buffer, -85, -52);

      buffer.invokeCharacters(maxEnergyDetectionThreshold_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxEnergyDetectionThreshold_r16", -1);

      // decode energyDetectionThresholdOffset_r16

      buffer.getContext().eventDispatcher.startElement("energyDetectionThresholdOffset_r16", -1);

      energyDetectionThresholdOffset_r16 = new Asn1Integer();
      energyDetectionThresholdOffset_r16.decode (buffer, -20, -13);

      buffer.invokeCharacters(energyDetectionThresholdOffset_r16.toString());
      buffer.getContext().eventDispatcher.endElement("energyDetectionThresholdOffset_r16", -1);

      // decode ul_toDL_COT_SharingED_Threshold_r16

      if (ul_toDL_COT_SharingED_Threshold_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ul_toDL_COT_SharingED_Threshold_r16", -1);

         ul_toDL_COT_SharingED_Threshold_r16 = new Asn1Integer();
         ul_toDL_COT_SharingED_Threshold_r16.decode (buffer, -85, -52);

         buffer.invokeCharacters(ul_toDL_COT_SharingED_Threshold_r16.toString());
         buffer.getContext().eventDispatcher.endElement("ul_toDL_COT_SharingED_Threshold_r16", -1);
      }
      else {
         ul_toDL_COT_SharingED_Threshold_r16 = null;
      }

      // decode absenceOfAnyOtherTechnology_r16

      if (absenceOfAnyOtherTechnology_r16Present) {
         buffer.getContext().eventDispatcher.startElement("absenceOfAnyOtherTechnology_r16", -1);

         int tval = DummyJ_absenceOfAnyOtherTechnology_r16.decodeEnumValue (buffer);
         absenceOfAnyOtherTechnology_r16 = DummyJ_absenceOfAnyOtherTechnology_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("absenceOfAnyOtherTechnology_r16", -1);
      }
      else {
         absenceOfAnyOtherTechnology_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxEnergyDetectionThreshold_r16 != null) maxEnergyDetectionThreshold_r16.print (_sb, "maxEnergyDetectionThreshold_r16", _level+1);
      if (energyDetectionThresholdOffset_r16 != null) energyDetectionThresholdOffset_r16.print (_sb, "energyDetectionThresholdOffset_r16", _level+1);
      if (ul_toDL_COT_SharingED_Threshold_r16 != null) ul_toDL_COT_SharingED_Threshold_r16.print (_sb, "ul_toDL_COT_SharingED_Threshold_r16", _level+1);
      if (absenceOfAnyOtherTechnology_r16 != null) absenceOfAnyOtherTechnology_r16.print (_sb, "absenceOfAnyOtherTechnology_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
