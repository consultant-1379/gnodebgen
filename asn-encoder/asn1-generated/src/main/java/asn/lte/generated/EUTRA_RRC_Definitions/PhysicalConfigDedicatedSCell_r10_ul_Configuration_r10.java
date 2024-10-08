/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysicalConfigDedicatedSCell_r10_ul_Configuration_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public AntennaInfoUL_r10 antennaInfoUL_r10;  // optional
   public PUSCH_ConfigDedicatedSCell_r10 pusch_ConfigDedicatedSCell_r10;  // optional
   public UplinkPowerControlDedicatedSCell_r10 uplinkPowerControlDedicatedSCell_r10;  // optional
   public CQI_ReportConfigSCell_r10 cqi_ReportConfigSCell_r10;  // optional
   public SoundingRS_UL_ConfigDedicated soundingRS_UL_ConfigDedicated_r10;  // optional
   public SoundingRS_UL_ConfigDedicated_v1020 soundingRS_UL_ConfigDedicated_v1020;  // optional
   public SoundingRS_UL_ConfigDedicatedAperiodic_r10 soundingRS_UL_ConfigDedicatedAperiodic_r10;  // optional

   public PhysicalConfigDedicatedSCell_r10_ul_Configuration_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysicalConfigDedicatedSCell_r10_ul_Configuration_r10 (
      AntennaInfoUL_r10 antennaInfoUL_r10_,
      PUSCH_ConfigDedicatedSCell_r10 pusch_ConfigDedicatedSCell_r10_,
      UplinkPowerControlDedicatedSCell_r10 uplinkPowerControlDedicatedSCell_r10_,
      CQI_ReportConfigSCell_r10 cqi_ReportConfigSCell_r10_,
      SoundingRS_UL_ConfigDedicated soundingRS_UL_ConfigDedicated_r10_,
      SoundingRS_UL_ConfigDedicated_v1020 soundingRS_UL_ConfigDedicated_v1020_,
      SoundingRS_UL_ConfigDedicatedAperiodic_r10 soundingRS_UL_ConfigDedicatedAperiodic_r10_
   ) {
      super();
      antennaInfoUL_r10 = antennaInfoUL_r10_;
      pusch_ConfigDedicatedSCell_r10 = pusch_ConfigDedicatedSCell_r10_;
      uplinkPowerControlDedicatedSCell_r10 = uplinkPowerControlDedicatedSCell_r10_;
      cqi_ReportConfigSCell_r10 = cqi_ReportConfigSCell_r10_;
      soundingRS_UL_ConfigDedicated_r10 = soundingRS_UL_ConfigDedicated_r10_;
      soundingRS_UL_ConfigDedicated_v1020 = soundingRS_UL_ConfigDedicated_v1020_;
      soundingRS_UL_ConfigDedicatedAperiodic_r10 = soundingRS_UL_ConfigDedicatedAperiodic_r10_;
   }

   public void init () {
      antennaInfoUL_r10 = null;
      pusch_ConfigDedicatedSCell_r10 = null;
      uplinkPowerControlDedicatedSCell_r10 = null;
      cqi_ReportConfigSCell_r10 = null;
      soundingRS_UL_ConfigDedicated_r10 = null;
      soundingRS_UL_ConfigDedicated_v1020 = null;
      soundingRS_UL_ConfigDedicatedAperiodic_r10 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return antennaInfoUL_r10;
         case 1: return pusch_ConfigDedicatedSCell_r10;
         case 2: return uplinkPowerControlDedicatedSCell_r10;
         case 3: return cqi_ReportConfigSCell_r10;
         case 4: return soundingRS_UL_ConfigDedicated_r10;
         case 5: return soundingRS_UL_ConfigDedicated_v1020;
         case 6: return soundingRS_UL_ConfigDedicatedAperiodic_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "antennaInfoUL-r10";
         case 1: return "pusch-ConfigDedicatedSCell-r10";
         case 2: return "uplinkPowerControlDedicatedSCell-r10";
         case 3: return "cqi-ReportConfigSCell-r10";
         case 4: return "soundingRS-UL-ConfigDedicated-r10";
         case 5: return "soundingRS-UL-ConfigDedicated-v1020";
         case 6: return "soundingRS-UL-ConfigDedicatedAperiodic-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean antennaInfoUL_r10Present = buffer.decodeBit ("antennaInfoUL_r10Present");
      boolean pusch_ConfigDedicatedSCell_r10Present = buffer.decodeBit ("pusch_ConfigDedicatedSCell_r10Present");
      boolean uplinkPowerControlDedicatedSCell_r10Present = buffer.decodeBit ("uplinkPowerControlDedicatedSCell_r10Present");
      boolean cqi_ReportConfigSCell_r10Present = buffer.decodeBit ("cqi_ReportConfigSCell_r10Present");
      boolean soundingRS_UL_ConfigDedicated_r10Present = buffer.decodeBit ("soundingRS_UL_ConfigDedicated_r10Present");
      boolean soundingRS_UL_ConfigDedicated_v1020Present = buffer.decodeBit ("soundingRS_UL_ConfigDedicated_v1020Present");
      boolean soundingRS_UL_ConfigDedicatedAperiodic_r10Present = buffer.decodeBit ("soundingRS_UL_ConfigDedicatedAperiodic_r10Present");

      // decode antennaInfoUL_r10

      if (antennaInfoUL_r10Present) {
         buffer.getContext().eventDispatcher.startElement("antennaInfoUL_r10", -1);

         antennaInfoUL_r10 = new AntennaInfoUL_r10();
         antennaInfoUL_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("antennaInfoUL_r10", -1);
      }
      else {
         antennaInfoUL_r10 = null;
      }

      // decode pusch_ConfigDedicatedSCell_r10

      if (pusch_ConfigDedicatedSCell_r10Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_ConfigDedicatedSCell_r10", -1);

         pusch_ConfigDedicatedSCell_r10 = new PUSCH_ConfigDedicatedSCell_r10();
         pusch_ConfigDedicatedSCell_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pusch_ConfigDedicatedSCell_r10", -1);
      }
      else {
         pusch_ConfigDedicatedSCell_r10 = null;
      }

      // decode uplinkPowerControlDedicatedSCell_r10

      if (uplinkPowerControlDedicatedSCell_r10Present) {
         buffer.getContext().eventDispatcher.startElement("uplinkPowerControlDedicatedSCell_r10", -1);

         uplinkPowerControlDedicatedSCell_r10 = new UplinkPowerControlDedicatedSCell_r10();
         uplinkPowerControlDedicatedSCell_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uplinkPowerControlDedicatedSCell_r10", -1);
      }
      else {
         uplinkPowerControlDedicatedSCell_r10 = null;
      }

      // decode cqi_ReportConfigSCell_r10

      if (cqi_ReportConfigSCell_r10Present) {
         buffer.getContext().eventDispatcher.startElement("cqi_ReportConfigSCell_r10", -1);

         cqi_ReportConfigSCell_r10 = new CQI_ReportConfigSCell_r10();
         cqi_ReportConfigSCell_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cqi_ReportConfigSCell_r10", -1);
      }
      else {
         cqi_ReportConfigSCell_r10 = null;
      }

      // decode soundingRS_UL_ConfigDedicated_r10

      if (soundingRS_UL_ConfigDedicated_r10Present) {
         buffer.getContext().eventDispatcher.startElement("soundingRS_UL_ConfigDedicated_r10", -1);

         soundingRS_UL_ConfigDedicated_r10 = new SoundingRS_UL_ConfigDedicated();
         soundingRS_UL_ConfigDedicated_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("soundingRS_UL_ConfigDedicated_r10", -1);
      }
      else {
         soundingRS_UL_ConfigDedicated_r10 = null;
      }

      // decode soundingRS_UL_ConfigDedicated_v1020

      if (soundingRS_UL_ConfigDedicated_v1020Present) {
         buffer.getContext().eventDispatcher.startElement("soundingRS_UL_ConfigDedicated_v1020", -1);

         soundingRS_UL_ConfigDedicated_v1020 = new SoundingRS_UL_ConfigDedicated_v1020();
         soundingRS_UL_ConfigDedicated_v1020.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("soundingRS_UL_ConfigDedicated_v1020", -1);
      }
      else {
         soundingRS_UL_ConfigDedicated_v1020 = null;
      }

      // decode soundingRS_UL_ConfigDedicatedAperiodic_r10

      if (soundingRS_UL_ConfigDedicatedAperiodic_r10Present) {
         buffer.getContext().eventDispatcher.startElement("soundingRS_UL_ConfigDedicatedAperiodic_r10", -1);

         soundingRS_UL_ConfigDedicatedAperiodic_r10 = new SoundingRS_UL_ConfigDedicatedAperiodic_r10();
         soundingRS_UL_ConfigDedicatedAperiodic_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("soundingRS_UL_ConfigDedicatedAperiodic_r10", -1);
      }
      else {
         soundingRS_UL_ConfigDedicatedAperiodic_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (antennaInfoUL_r10 != null) antennaInfoUL_r10.print (_sb, "antennaInfoUL_r10", _level+1);
      if (pusch_ConfigDedicatedSCell_r10 != null) pusch_ConfigDedicatedSCell_r10.print (_sb, "pusch_ConfigDedicatedSCell_r10", _level+1);
      if (uplinkPowerControlDedicatedSCell_r10 != null) uplinkPowerControlDedicatedSCell_r10.print (_sb, "uplinkPowerControlDedicatedSCell_r10", _level+1);
      if (cqi_ReportConfigSCell_r10 != null) cqi_ReportConfigSCell_r10.print (_sb, "cqi_ReportConfigSCell_r10", _level+1);
      if (soundingRS_UL_ConfigDedicated_r10 != null) soundingRS_UL_ConfigDedicated_r10.print (_sb, "soundingRS_UL_ConfigDedicated_r10", _level+1);
      if (soundingRS_UL_ConfigDedicated_v1020 != null) soundingRS_UL_ConfigDedicated_v1020.print (_sb, "soundingRS_UL_ConfigDedicated_v1020", _level+1);
      if (soundingRS_UL_ConfigDedicatedAperiodic_r10 != null) soundingRS_UL_ConfigDedicatedAperiodic_r10.print (_sb, "soundingRS_UL_ConfigDedicatedAperiodic_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
