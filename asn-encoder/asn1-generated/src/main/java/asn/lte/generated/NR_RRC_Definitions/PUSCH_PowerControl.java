/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_PowerControl extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-PowerControl";
   }

   public PUSCH_PowerControl_tpc_Accumulation tpc_Accumulation = null;  // optional
   public Alpha msg3_Alpha = null;  // optional
   public Asn1Integer p0_NominalWithoutGrant;  // optional
   public PUSCH_PowerControl_p0_AlphaSets p0_AlphaSets;  // optional
   public PUSCH_PowerControl_pathlossReferenceRSToAddModList pathlossReferenceRSToAddModList;  // optional
   public PUSCH_PowerControl_pathlossReferenceRSToReleaseList pathlossReferenceRSToReleaseList;  // optional
   public PUSCH_PowerControl_twoPUSCH_PC_AdjustmentStates twoPUSCH_PC_AdjustmentStates = null;  // optional
   public PUSCH_PowerControl_deltaMCS deltaMCS = null;  // optional
   public PUSCH_PowerControl_sri_PUSCH_MappingToAddModList sri_PUSCH_MappingToAddModList;  // optional
   public PUSCH_PowerControl_sri_PUSCH_MappingToReleaseList sri_PUSCH_MappingToReleaseList;  // optional

   public PUSCH_PowerControl () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_PowerControl (
      PUSCH_PowerControl_tpc_Accumulation tpc_Accumulation_,
      Alpha msg3_Alpha_,
      Asn1Integer p0_NominalWithoutGrant_,
      PUSCH_PowerControl_p0_AlphaSets p0_AlphaSets_,
      PUSCH_PowerControl_pathlossReferenceRSToAddModList pathlossReferenceRSToAddModList_,
      PUSCH_PowerControl_pathlossReferenceRSToReleaseList pathlossReferenceRSToReleaseList_,
      PUSCH_PowerControl_twoPUSCH_PC_AdjustmentStates twoPUSCH_PC_AdjustmentStates_,
      PUSCH_PowerControl_deltaMCS deltaMCS_,
      PUSCH_PowerControl_sri_PUSCH_MappingToAddModList sri_PUSCH_MappingToAddModList_,
      PUSCH_PowerControl_sri_PUSCH_MappingToReleaseList sri_PUSCH_MappingToReleaseList_
   ) {
      super();
      tpc_Accumulation = tpc_Accumulation_;
      msg3_Alpha = msg3_Alpha_;
      p0_NominalWithoutGrant = p0_NominalWithoutGrant_;
      p0_AlphaSets = p0_AlphaSets_;
      pathlossReferenceRSToAddModList = pathlossReferenceRSToAddModList_;
      pathlossReferenceRSToReleaseList = pathlossReferenceRSToReleaseList_;
      twoPUSCH_PC_AdjustmentStates = twoPUSCH_PC_AdjustmentStates_;
      deltaMCS = deltaMCS_;
      sri_PUSCH_MappingToAddModList = sri_PUSCH_MappingToAddModList_;
      sri_PUSCH_MappingToReleaseList = sri_PUSCH_MappingToReleaseList_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_PowerControl (PUSCH_PowerControl_tpc_Accumulation tpc_Accumulation_,
      Alpha msg3_Alpha_,
      long p0_NominalWithoutGrant_,
      PUSCH_PowerControl_p0_AlphaSets p0_AlphaSets_,
      PUSCH_PowerControl_pathlossReferenceRSToAddModList pathlossReferenceRSToAddModList_,
      PUSCH_PowerControl_pathlossReferenceRSToReleaseList pathlossReferenceRSToReleaseList_,
      PUSCH_PowerControl_twoPUSCH_PC_AdjustmentStates twoPUSCH_PC_AdjustmentStates_,
      PUSCH_PowerControl_deltaMCS deltaMCS_,
      PUSCH_PowerControl_sri_PUSCH_MappingToAddModList sri_PUSCH_MappingToAddModList_,
      PUSCH_PowerControl_sri_PUSCH_MappingToReleaseList sri_PUSCH_MappingToReleaseList_
   ) {
      super();
      tpc_Accumulation = tpc_Accumulation_;
      msg3_Alpha = msg3_Alpha_;
      p0_NominalWithoutGrant = new Asn1Integer (p0_NominalWithoutGrant_);
      p0_AlphaSets = p0_AlphaSets_;
      pathlossReferenceRSToAddModList = pathlossReferenceRSToAddModList_;
      pathlossReferenceRSToReleaseList = pathlossReferenceRSToReleaseList_;
      twoPUSCH_PC_AdjustmentStates = twoPUSCH_PC_AdjustmentStates_;
      deltaMCS = deltaMCS_;
      sri_PUSCH_MappingToAddModList = sri_PUSCH_MappingToAddModList_;
      sri_PUSCH_MappingToReleaseList = sri_PUSCH_MappingToReleaseList_;
   }

   public void init () {
      tpc_Accumulation = null;
      msg3_Alpha = null;
      p0_NominalWithoutGrant = null;
      p0_AlphaSets = null;
      pathlossReferenceRSToAddModList = null;
      pathlossReferenceRSToReleaseList = null;
      twoPUSCH_PC_AdjustmentStates = null;
      deltaMCS = null;
      sri_PUSCH_MappingToAddModList = null;
      sri_PUSCH_MappingToReleaseList = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tpc_Accumulation;
         case 1: return msg3_Alpha;
         case 2: return p0_NominalWithoutGrant;
         case 3: return p0_AlphaSets;
         case 4: return pathlossReferenceRSToAddModList;
         case 5: return pathlossReferenceRSToReleaseList;
         case 6: return twoPUSCH_PC_AdjustmentStates;
         case 7: return deltaMCS;
         case 8: return sri_PUSCH_MappingToAddModList;
         case 9: return sri_PUSCH_MappingToReleaseList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tpc-Accumulation";
         case 1: return "msg3-Alpha";
         case 2: return "p0-NominalWithoutGrant";
         case 3: return "p0-AlphaSets";
         case 4: return "pathlossReferenceRSToAddModList";
         case 5: return "pathlossReferenceRSToReleaseList";
         case 6: return "twoPUSCH-PC-AdjustmentStates";
         case 7: return "deltaMCS";
         case 8: return "sri-PUSCH-MappingToAddModList";
         case 9: return "sri-PUSCH-MappingToReleaseList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tpc_AccumulationPresent = buffer.decodeBit ("tpc_AccumulationPresent");
      boolean msg3_AlphaPresent = buffer.decodeBit ("msg3_AlphaPresent");
      boolean p0_NominalWithoutGrantPresent = buffer.decodeBit ("p0_NominalWithoutGrantPresent");
      boolean p0_AlphaSetsPresent = buffer.decodeBit ("p0_AlphaSetsPresent");
      boolean pathlossReferenceRSToAddModListPresent = buffer.decodeBit ("pathlossReferenceRSToAddModListPresent");
      boolean pathlossReferenceRSToReleaseListPresent = buffer.decodeBit ("pathlossReferenceRSToReleaseListPresent");
      boolean twoPUSCH_PC_AdjustmentStatesPresent = buffer.decodeBit ("twoPUSCH_PC_AdjustmentStatesPresent");
      boolean deltaMCSPresent = buffer.decodeBit ("deltaMCSPresent");
      boolean sri_PUSCH_MappingToAddModListPresent = buffer.decodeBit ("sri_PUSCH_MappingToAddModListPresent");
      boolean sri_PUSCH_MappingToReleaseListPresent = buffer.decodeBit ("sri_PUSCH_MappingToReleaseListPresent");

      // decode tpc_Accumulation

      if (tpc_AccumulationPresent) {
         buffer.getContext().eventDispatcher.startElement("tpc_Accumulation", -1);

         int tval = PUSCH_PowerControl_tpc_Accumulation.decodeEnumValue (buffer);
         tpc_Accumulation = PUSCH_PowerControl_tpc_Accumulation.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tpc_Accumulation", -1);
      }
      else {
         tpc_Accumulation = null;
      }

      // decode msg3_Alpha

      if (msg3_AlphaPresent) {
         buffer.getContext().eventDispatcher.startElement("msg3_Alpha", -1);

         int tval = Alpha.decodeEnumValue (buffer);
         msg3_Alpha = Alpha.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("msg3_Alpha", -1);
      }
      else {
         msg3_Alpha = null;
      }

      // decode p0_NominalWithoutGrant

      if (p0_NominalWithoutGrantPresent) {
         buffer.getContext().eventDispatcher.startElement("p0_NominalWithoutGrant", -1);

         p0_NominalWithoutGrant = new Asn1Integer();
         p0_NominalWithoutGrant.decode (buffer, -202, 24);

         buffer.invokeCharacters(p0_NominalWithoutGrant.toString());
         buffer.getContext().eventDispatcher.endElement("p0_NominalWithoutGrant", -1);
      }
      else {
         p0_NominalWithoutGrant = null;
      }

      // decode p0_AlphaSets

      if (p0_AlphaSetsPresent) {
         buffer.getContext().eventDispatcher.startElement("p0_AlphaSets", -1);

         p0_AlphaSets = new PUSCH_PowerControl_p0_AlphaSets();
         p0_AlphaSets.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p0_AlphaSets", -1);
      }
      else {
         p0_AlphaSets = null;
      }

      // decode pathlossReferenceRSToAddModList

      if (pathlossReferenceRSToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToAddModList", -1);

         pathlossReferenceRSToAddModList = new PUSCH_PowerControl_pathlossReferenceRSToAddModList();
         pathlossReferenceRSToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToAddModList", -1);
      }
      else {
         pathlossReferenceRSToAddModList = null;
      }

      // decode pathlossReferenceRSToReleaseList

      if (pathlossReferenceRSToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToReleaseList", -1);

         pathlossReferenceRSToReleaseList = new PUSCH_PowerControl_pathlossReferenceRSToReleaseList();
         pathlossReferenceRSToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToReleaseList", -1);
      }
      else {
         pathlossReferenceRSToReleaseList = null;
      }

      // decode twoPUSCH_PC_AdjustmentStates

      if (twoPUSCH_PC_AdjustmentStatesPresent) {
         buffer.getContext().eventDispatcher.startElement("twoPUSCH_PC_AdjustmentStates", -1);

         int tval = PUSCH_PowerControl_twoPUSCH_PC_AdjustmentStates.decodeEnumValue (buffer);
         twoPUSCH_PC_AdjustmentStates = PUSCH_PowerControl_twoPUSCH_PC_AdjustmentStates.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("twoPUSCH_PC_AdjustmentStates", -1);
      }
      else {
         twoPUSCH_PC_AdjustmentStates = null;
      }

      // decode deltaMCS

      if (deltaMCSPresent) {
         buffer.getContext().eventDispatcher.startElement("deltaMCS", -1);

         int tval = PUSCH_PowerControl_deltaMCS.decodeEnumValue (buffer);
         deltaMCS = PUSCH_PowerControl_deltaMCS.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("deltaMCS", -1);
      }
      else {
         deltaMCS = null;
      }

      // decode sri_PUSCH_MappingToAddModList

      if (sri_PUSCH_MappingToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("sri_PUSCH_MappingToAddModList", -1);

         sri_PUSCH_MappingToAddModList = new PUSCH_PowerControl_sri_PUSCH_MappingToAddModList();
         sri_PUSCH_MappingToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sri_PUSCH_MappingToAddModList", -1);
      }
      else {
         sri_PUSCH_MappingToAddModList = null;
      }

      // decode sri_PUSCH_MappingToReleaseList

      if (sri_PUSCH_MappingToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("sri_PUSCH_MappingToReleaseList", -1);

         sri_PUSCH_MappingToReleaseList = new PUSCH_PowerControl_sri_PUSCH_MappingToReleaseList();
         sri_PUSCH_MappingToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sri_PUSCH_MappingToReleaseList", -1);
      }
      else {
         sri_PUSCH_MappingToReleaseList = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tpc_Accumulation != null) tpc_Accumulation.print (_sb, "tpc_Accumulation", _level+1);
      if (msg3_Alpha != null) msg3_Alpha.print (_sb, "msg3_Alpha", _level+1);
      if (p0_NominalWithoutGrant != null) p0_NominalWithoutGrant.print (_sb, "p0_NominalWithoutGrant", _level+1);
      if (p0_AlphaSets != null) p0_AlphaSets.print (_sb, "p0_AlphaSets", _level+1);
      if (pathlossReferenceRSToAddModList != null) pathlossReferenceRSToAddModList.print (_sb, "pathlossReferenceRSToAddModList", _level+1);
      if (pathlossReferenceRSToReleaseList != null) pathlossReferenceRSToReleaseList.print (_sb, "pathlossReferenceRSToReleaseList", _level+1);
      if (twoPUSCH_PC_AdjustmentStates != null) twoPUSCH_PC_AdjustmentStates.print (_sb, "twoPUSCH_PC_AdjustmentStates", _level+1);
      if (deltaMCS != null) deltaMCS.print (_sb, "deltaMCS", _level+1);
      if (sri_PUSCH_MappingToAddModList != null) sri_PUSCH_MappingToAddModList.print (_sb, "sri_PUSCH_MappingToAddModList", _level+1);
      if (sri_PUSCH_MappingToReleaseList != null) sri_PUSCH_MappingToReleaseList.print (_sb, "sri_PUSCH_MappingToReleaseList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
