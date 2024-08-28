/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_CapabilityAddXDD_Mode_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-CapabilityAddXDD-Mode-r9";
   }

   public PhyLayerParameters phyLayerParameters_r9;  // optional
   public Asn1BitString featureGroupIndicators_r9;  // optional
   public Asn1BitString featureGroupIndRel9Add_r9;  // optional
   public IRAT_ParametersGERAN interRAT_ParametersGERAN_r9;  // optional
   public IRAT_ParametersUTRA_v920 interRAT_ParametersUTRA_r9;  // optional
   public IRAT_ParametersCDMA2000_1XRTT_v920 interRAT_ParametersCDMA2000_r9;  // optional
   public NeighCellSI_AcquisitionParameters_r9 neighCellSI_AcquisitionParameters_r9;  // optional
   public Asn1OpenExt extElem1;

   public UE_EUTRA_CapabilityAddXDD_Mode_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_CapabilityAddXDD_Mode_r9 (
      PhyLayerParameters phyLayerParameters_r9_,
      Asn1BitString featureGroupIndicators_r9_,
      Asn1BitString featureGroupIndRel9Add_r9_,
      IRAT_ParametersGERAN interRAT_ParametersGERAN_r9_,
      IRAT_ParametersUTRA_v920 interRAT_ParametersUTRA_r9_,
      IRAT_ParametersCDMA2000_1XRTT_v920 interRAT_ParametersCDMA2000_r9_,
      NeighCellSI_AcquisitionParameters_r9 neighCellSI_AcquisitionParameters_r9_
   ) {
      super();
      phyLayerParameters_r9 = phyLayerParameters_r9_;
      featureGroupIndicators_r9 = featureGroupIndicators_r9_;
      featureGroupIndRel9Add_r9 = featureGroupIndRel9Add_r9_;
      interRAT_ParametersGERAN_r9 = interRAT_ParametersGERAN_r9_;
      interRAT_ParametersUTRA_r9 = interRAT_ParametersUTRA_r9_;
      interRAT_ParametersCDMA2000_r9 = interRAT_ParametersCDMA2000_r9_;
      neighCellSI_AcquisitionParameters_r9 = neighCellSI_AcquisitionParameters_r9_;
   }

   public void init () {
      phyLayerParameters_r9 = null;
      featureGroupIndicators_r9 = null;
      featureGroupIndRel9Add_r9 = null;
      interRAT_ParametersGERAN_r9 = null;
      interRAT_ParametersUTRA_r9 = null;
      interRAT_ParametersCDMA2000_r9 = null;
      neighCellSI_AcquisitionParameters_r9 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phyLayerParameters_r9;
         case 1: return featureGroupIndicators_r9;
         case 2: return featureGroupIndRel9Add_r9;
         case 3: return interRAT_ParametersGERAN_r9;
         case 4: return interRAT_ParametersUTRA_r9;
         case 5: return interRAT_ParametersCDMA2000_r9;
         case 6: return neighCellSI_AcquisitionParameters_r9;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phyLayerParameters-r9";
         case 1: return "featureGroupIndicators-r9";
         case 2: return "featureGroupIndRel9Add-r9";
         case 3: return "interRAT-ParametersGERAN-r9";
         case 4: return "interRAT-ParametersUTRA-r9";
         case 5: return "interRAT-ParametersCDMA2000-r9";
         case 6: return "neighCellSI-AcquisitionParameters-r9";
         case 7: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean phyLayerParameters_r9Present = buffer.decodeBit ("phyLayerParameters_r9Present");
      boolean featureGroupIndicators_r9Present = buffer.decodeBit ("featureGroupIndicators_r9Present");
      boolean featureGroupIndRel9Add_r9Present = buffer.decodeBit ("featureGroupIndRel9Add_r9Present");
      boolean interRAT_ParametersGERAN_r9Present = buffer.decodeBit ("interRAT_ParametersGERAN_r9Present");
      boolean interRAT_ParametersUTRA_r9Present = buffer.decodeBit ("interRAT_ParametersUTRA_r9Present");
      boolean interRAT_ParametersCDMA2000_r9Present = buffer.decodeBit ("interRAT_ParametersCDMA2000_r9Present");
      boolean neighCellSI_AcquisitionParameters_r9Present = buffer.decodeBit ("neighCellSI_AcquisitionParameters_r9Present");

      // decode phyLayerParameters_r9

      if (phyLayerParameters_r9Present) {
         buffer.getContext().eventDispatcher.startElement("phyLayerParameters_r9", -1);

         phyLayerParameters_r9 = new PhyLayerParameters();
         phyLayerParameters_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phyLayerParameters_r9", -1);
      }
      else {
         phyLayerParameters_r9 = null;
      }

      // decode featureGroupIndicators_r9

      if (featureGroupIndicators_r9Present) {
         buffer.getContext().eventDispatcher.startElement("featureGroupIndicators_r9", -1);

         featureGroupIndicators_r9 = new Asn1BitString();
         featureGroupIndicators_r9.decode (buffer, 32, 32);

         buffer.invokeCharacters(featureGroupIndicators_r9.toString());
         buffer.getContext().eventDispatcher.endElement("featureGroupIndicators_r9", -1);
      }
      else {
         featureGroupIndicators_r9 = null;
      }

      // decode featureGroupIndRel9Add_r9

      if (featureGroupIndRel9Add_r9Present) {
         buffer.getContext().eventDispatcher.startElement("featureGroupIndRel9Add_r9", -1);

         featureGroupIndRel9Add_r9 = new Asn1BitString();
         featureGroupIndRel9Add_r9.decode (buffer, 32, 32);

         buffer.invokeCharacters(featureGroupIndRel9Add_r9.toString());
         buffer.getContext().eventDispatcher.endElement("featureGroupIndRel9Add_r9", -1);
      }
      else {
         featureGroupIndRel9Add_r9 = null;
      }

      // decode interRAT_ParametersGERAN_r9

      if (interRAT_ParametersGERAN_r9Present) {
         buffer.getContext().eventDispatcher.startElement("interRAT_ParametersGERAN_r9", -1);

         interRAT_ParametersGERAN_r9 = new IRAT_ParametersGERAN();
         interRAT_ParametersGERAN_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interRAT_ParametersGERAN_r9", -1);
      }
      else {
         interRAT_ParametersGERAN_r9 = null;
      }

      // decode interRAT_ParametersUTRA_r9

      if (interRAT_ParametersUTRA_r9Present) {
         buffer.getContext().eventDispatcher.startElement("interRAT_ParametersUTRA_r9", -1);

         interRAT_ParametersUTRA_r9 = new IRAT_ParametersUTRA_v920();
         interRAT_ParametersUTRA_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interRAT_ParametersUTRA_r9", -1);
      }
      else {
         interRAT_ParametersUTRA_r9 = null;
      }

      // decode interRAT_ParametersCDMA2000_r9

      if (interRAT_ParametersCDMA2000_r9Present) {
         buffer.getContext().eventDispatcher.startElement("interRAT_ParametersCDMA2000_r9", -1);

         interRAT_ParametersCDMA2000_r9 = new IRAT_ParametersCDMA2000_1XRTT_v920();
         interRAT_ParametersCDMA2000_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interRAT_ParametersCDMA2000_r9", -1);
      }
      else {
         interRAT_ParametersCDMA2000_r9 = null;
      }

      // decode neighCellSI_AcquisitionParameters_r9

      if (neighCellSI_AcquisitionParameters_r9Present) {
         buffer.getContext().eventDispatcher.startElement("neighCellSI_AcquisitionParameters_r9", -1);

         neighCellSI_AcquisitionParameters_r9 = new NeighCellSI_AcquisitionParameters_r9();
         neighCellSI_AcquisitionParameters_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("neighCellSI_AcquisitionParameters_r9", -1);
      }
      else {
         neighCellSI_AcquisitionParameters_r9 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (phyLayerParameters_r9 != null) phyLayerParameters_r9.print (_sb, "phyLayerParameters_r9", _level+1);
      if (featureGroupIndicators_r9 != null) featureGroupIndicators_r9.print (_sb, "featureGroupIndicators_r9", _level+1);
      if (featureGroupIndRel9Add_r9 != null) featureGroupIndRel9Add_r9.print (_sb, "featureGroupIndRel9Add_r9", _level+1);
      if (interRAT_ParametersGERAN_r9 != null) interRAT_ParametersGERAN_r9.print (_sb, "interRAT_ParametersGERAN_r9", _level+1);
      if (interRAT_ParametersUTRA_r9 != null) interRAT_ParametersUTRA_r9.print (_sb, "interRAT_ParametersUTRA_r9", _level+1);
      if (interRAT_ParametersCDMA2000_r9 != null) interRAT_ParametersCDMA2000_r9.print (_sb, "interRAT_ParametersCDMA2000_r9", _level+1);
      if (neighCellSI_AcquisitionParameters_r9 != null) neighCellSI_AcquisitionParameters_r9.print (_sb, "neighCellSI_AcquisitionParameters_r9", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
