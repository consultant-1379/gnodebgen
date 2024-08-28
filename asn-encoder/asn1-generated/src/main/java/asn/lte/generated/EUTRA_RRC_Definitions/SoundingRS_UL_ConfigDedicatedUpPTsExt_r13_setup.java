/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_UpPtsAdd_r13 srs_UpPtsAdd_r13 = null;
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_Bandwidth_r13 srs_Bandwidth_r13 = null;
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_HoppingBandwidth_r13 srs_HoppingBandwidth_r13 = null;
   public Asn1Integer freqDomainPosition_r13;
   public Asn1Boolean duration_r13;
   public Asn1Integer srs_ConfigIndex_r13;
   public Asn1Integer transmissionComb_r13;
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_cyclicShift_r13 cyclicShift_r13 = null;
   public SRS_AntennaPort srs_AntennaPort_r13 = null;
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_transmissionCombNum_r13 transmissionCombNum_r13 = null;

   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup (
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_UpPtsAdd_r13 srs_UpPtsAdd_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_Bandwidth_r13 srs_Bandwidth_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_HoppingBandwidth_r13 srs_HoppingBandwidth_r13_,
      Asn1Integer freqDomainPosition_r13_,
      Asn1Boolean duration_r13_,
      Asn1Integer srs_ConfigIndex_r13_,
      Asn1Integer transmissionComb_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_cyclicShift_r13 cyclicShift_r13_,
      SRS_AntennaPort srs_AntennaPort_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      srs_UpPtsAdd_r13 = srs_UpPtsAdd_r13_;
      srs_Bandwidth_r13 = srs_Bandwidth_r13_;
      srs_HoppingBandwidth_r13 = srs_HoppingBandwidth_r13_;
      freqDomainPosition_r13 = freqDomainPosition_r13_;
      duration_r13 = duration_r13_;
      srs_ConfigIndex_r13 = srs_ConfigIndex_r13_;
      transmissionComb_r13 = transmissionComb_r13_;
      cyclicShift_r13 = cyclicShift_r13_;
      srs_AntennaPort_r13 = srs_AntennaPort_r13_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup (SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_UpPtsAdd_r13 srs_UpPtsAdd_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_Bandwidth_r13 srs_Bandwidth_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_HoppingBandwidth_r13 srs_HoppingBandwidth_r13_,
      long freqDomainPosition_r13_,
      boolean duration_r13_,
      long srs_ConfigIndex_r13_,
      long transmissionComb_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_cyclicShift_r13 cyclicShift_r13_,
      SRS_AntennaPort srs_AntennaPort_r13_,
      SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      srs_UpPtsAdd_r13 = srs_UpPtsAdd_r13_;
      srs_Bandwidth_r13 = srs_Bandwidth_r13_;
      srs_HoppingBandwidth_r13 = srs_HoppingBandwidth_r13_;
      freqDomainPosition_r13 = new Asn1Integer (freqDomainPosition_r13_);
      duration_r13 = new Asn1Boolean (duration_r13_);
      srs_ConfigIndex_r13 = new Asn1Integer (srs_ConfigIndex_r13_);
      transmissionComb_r13 = new Asn1Integer (transmissionComb_r13_);
      cyclicShift_r13 = cyclicShift_r13_;
      srs_AntennaPort_r13 = srs_AntennaPort_r13_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   public void init () {
      srs_UpPtsAdd_r13 = null;
      srs_Bandwidth_r13 = null;
      srs_HoppingBandwidth_r13 = null;
      freqDomainPosition_r13 = null;
      duration_r13 = null;
      srs_ConfigIndex_r13 = null;
      transmissionComb_r13 = null;
      cyclicShift_r13 = null;
      srs_AntennaPort_r13 = null;
      transmissionCombNum_r13 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srs_UpPtsAdd_r13;
         case 1: return srs_Bandwidth_r13;
         case 2: return srs_HoppingBandwidth_r13;
         case 3: return freqDomainPosition_r13;
         case 4: return duration_r13;
         case 5: return srs_ConfigIndex_r13;
         case 6: return transmissionComb_r13;
         case 7: return cyclicShift_r13;
         case 8: return srs_AntennaPort_r13;
         case 9: return transmissionCombNum_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srs-UpPtsAdd-r13";
         case 1: return "srs-Bandwidth-r13";
         case 2: return "srs-HoppingBandwidth-r13";
         case 3: return "freqDomainPosition-r13";
         case 4: return "duration-r13";
         case 5: return "srs-ConfigIndex-r13";
         case 6: return "transmissionComb-r13";
         case 7: return "cyclicShift-r13";
         case 8: return "srs-AntennaPort-r13";
         case 9: return "transmissionCombNum-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode srs_UpPtsAdd_r13

      buffer.getContext().eventDispatcher.startElement("srs_UpPtsAdd_r13", -1);

      {
         int tval = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_UpPtsAdd_r13.decodeEnumValue (buffer);
         srs_UpPtsAdd_r13 = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_UpPtsAdd_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("srs_UpPtsAdd_r13", -1);

      // decode srs_Bandwidth_r13

      buffer.getContext().eventDispatcher.startElement("srs_Bandwidth_r13", -1);

      {
         int tval = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_Bandwidth_r13.decodeEnumValue (buffer);
         srs_Bandwidth_r13 = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_Bandwidth_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("srs_Bandwidth_r13", -1);

      // decode srs_HoppingBandwidth_r13

      buffer.getContext().eventDispatcher.startElement("srs_HoppingBandwidth_r13", -1);

      {
         int tval = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_HoppingBandwidth_r13.decodeEnumValue (buffer);
         srs_HoppingBandwidth_r13 = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_srs_HoppingBandwidth_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("srs_HoppingBandwidth_r13", -1);

      // decode freqDomainPosition_r13

      buffer.getContext().eventDispatcher.startElement("freqDomainPosition_r13", -1);

      freqDomainPosition_r13 = new Asn1Integer();
      freqDomainPosition_r13.decode (buffer, 0, 23);

      buffer.invokeCharacters(freqDomainPosition_r13.toString());
      buffer.getContext().eventDispatcher.endElement("freqDomainPosition_r13", -1);

      // decode duration_r13

      buffer.getContext().eventDispatcher.startElement("duration_r13", -1);

      duration_r13 = new Asn1Boolean();
      duration_r13.decode (buffer);

      buffer.invokeCharacters(duration_r13.toString());
      buffer.getContext().eventDispatcher.endElement("duration_r13", -1);

      // decode srs_ConfigIndex_r13

      buffer.getContext().eventDispatcher.startElement("srs_ConfigIndex_r13", -1);

      srs_ConfigIndex_r13 = new Asn1Integer();
      srs_ConfigIndex_r13.decode (buffer, 0, 1023);

      buffer.invokeCharacters(srs_ConfigIndex_r13.toString());
      buffer.getContext().eventDispatcher.endElement("srs_ConfigIndex_r13", -1);

      // decode transmissionComb_r13

      buffer.getContext().eventDispatcher.startElement("transmissionComb_r13", -1);

      transmissionComb_r13 = new Asn1Integer();
      transmissionComb_r13.decode (buffer, 0, 3);

      buffer.invokeCharacters(transmissionComb_r13.toString());
      buffer.getContext().eventDispatcher.endElement("transmissionComb_r13", -1);

      // decode cyclicShift_r13

      buffer.getContext().eventDispatcher.startElement("cyclicShift_r13", -1);

      {
         int tval = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_cyclicShift_r13.decodeEnumValue (buffer);
         cyclicShift_r13 = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_cyclicShift_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cyclicShift_r13", -1);

      // decode srs_AntennaPort_r13

      buffer.getContext().eventDispatcher.startElement("srs_AntennaPort_r13", -1);

      {
         int tval = SRS_AntennaPort.decodeEnumValue (buffer);
         srs_AntennaPort_r13 = SRS_AntennaPort.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("srs_AntennaPort_r13", -1);

      // decode transmissionCombNum_r13

      buffer.getContext().eventDispatcher.startElement("transmissionCombNum_r13", -1);

      {
         int tval = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_transmissionCombNum_r13.decodeEnumValue (buffer);
         transmissionCombNum_r13 = SoundingRS_UL_ConfigDedicatedUpPTsExt_r13_setup_transmissionCombNum_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("transmissionCombNum_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srs_UpPtsAdd_r13 != null) srs_UpPtsAdd_r13.print (_sb, "srs_UpPtsAdd_r13", _level+1);
      if (srs_Bandwidth_r13 != null) srs_Bandwidth_r13.print (_sb, "srs_Bandwidth_r13", _level+1);
      if (srs_HoppingBandwidth_r13 != null) srs_HoppingBandwidth_r13.print (_sb, "srs_HoppingBandwidth_r13", _level+1);
      if (freqDomainPosition_r13 != null) freqDomainPosition_r13.print (_sb, "freqDomainPosition_r13", _level+1);
      if (duration_r13 != null) duration_r13.print (_sb, "duration_r13", _level+1);
      if (srs_ConfigIndex_r13 != null) srs_ConfigIndex_r13.print (_sb, "srs_ConfigIndex_r13", _level+1);
      if (transmissionComb_r13 != null) transmissionComb_r13.print (_sb, "transmissionComb_r13", _level+1);
      if (cyclicShift_r13 != null) cyclicShift_r13.print (_sb, "cyclicShift_r13", _level+1);
      if (srs_AntennaPort_r13 != null) srs_AntennaPort_r13.print (_sb, "srs_AntennaPort_r13", _level+1);
      if (transmissionCombNum_r13 != null) transmissionCombNum_r13.print (_sb, "transmissionCombNum_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
