/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysicalConfigDedicated_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhysicalConfigDedicated-NB-r13";
   }

   public CarrierConfigDedicated_NB_r13 carrierConfigDedicated_r13;  // optional
   public NPDCCH_ConfigDedicated_NB_r13 npdcch_ConfigDedicated_r13;  // optional
   public NPUSCH_ConfigDedicated_NB_r13 npusch_ConfigDedicated_r13;  // optional
   public UplinkPowerControlDedicated_NB_r13 uplinkPowerControlDedicated_r13;  // optional
   public boolean mV2ExtPresent;
   public PhysicalConfigDedicated_NB_r13_twoHARQ_ProcessesConfig_r14 twoHARQ_ProcessesConfig_r14 = null;  // optional
   public boolean mV3ExtPresent;
   public PhysicalConfigDedicated_NB_r13_interferenceRandomisationConfig_r14 interferenceRandomisationConfig_r14 = null;  // optional
   public boolean mV4ExtPresent;
   public NPDCCH_ConfigDedicated_NB_v1530 npdcch_ConfigDedicated_v1530;  // optional
   public boolean mV5ExtPresent;
   public PhysicalConfigDedicated_NB_r13_additionalTxSIB1_Config_v1540 additionalTxSIB1_Config_v1540 = null;  // optional
   public Asn1OpenExt extElem1;

   public PhysicalConfigDedicated_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysicalConfigDedicated_NB_r13 (
      CarrierConfigDedicated_NB_r13 carrierConfigDedicated_r13_,
      NPDCCH_ConfigDedicated_NB_r13 npdcch_ConfigDedicated_r13_,
      NPUSCH_ConfigDedicated_NB_r13 npusch_ConfigDedicated_r13_,
      UplinkPowerControlDedicated_NB_r13 uplinkPowerControlDedicated_r13_,
      PhysicalConfigDedicated_NB_r13_twoHARQ_ProcessesConfig_r14 twoHARQ_ProcessesConfig_r14_,
      PhysicalConfigDedicated_NB_r13_interferenceRandomisationConfig_r14 interferenceRandomisationConfig_r14_,
      NPDCCH_ConfigDedicated_NB_v1530 npdcch_ConfigDedicated_v1530_,
      PhysicalConfigDedicated_NB_r13_additionalTxSIB1_Config_v1540 additionalTxSIB1_Config_v1540_
   ) {
      super();
      carrierConfigDedicated_r13 = carrierConfigDedicated_r13_;
      npdcch_ConfigDedicated_r13 = npdcch_ConfigDedicated_r13_;
      npusch_ConfigDedicated_r13 = npusch_ConfigDedicated_r13_;
      uplinkPowerControlDedicated_r13 = uplinkPowerControlDedicated_r13_;
      twoHARQ_ProcessesConfig_r14 = twoHARQ_ProcessesConfig_r14_;
      interferenceRandomisationConfig_r14 = interferenceRandomisationConfig_r14_;
      npdcch_ConfigDedicated_v1530 = npdcch_ConfigDedicated_v1530_;
      additionalTxSIB1_Config_v1540 = additionalTxSIB1_Config_v1540_;
   }

   public void init () {
      carrierConfigDedicated_r13 = null;
      npdcch_ConfigDedicated_r13 = null;
      npusch_ConfigDedicated_r13 = null;
      uplinkPowerControlDedicated_r13 = null;
      twoHARQ_ProcessesConfig_r14 = null;
      interferenceRandomisationConfig_r14 = null;
      npdcch_ConfigDedicated_v1530 = null;
      additionalTxSIB1_Config_v1540 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierConfigDedicated_r13;
         case 1: return npdcch_ConfigDedicated_r13;
         case 2: return npusch_ConfigDedicated_r13;
         case 3: return uplinkPowerControlDedicated_r13;
         case 4: return twoHARQ_ProcessesConfig_r14;
         case 5: return interferenceRandomisationConfig_r14;
         case 6: return npdcch_ConfigDedicated_v1530;
         case 7: return additionalTxSIB1_Config_v1540;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierConfigDedicated-r13";
         case 1: return "npdcch-ConfigDedicated-r13";
         case 2: return "npusch-ConfigDedicated-r13";
         case 3: return "uplinkPowerControlDedicated-r13";
         case 4: return "twoHARQ-ProcessesConfig-r14";
         case 5: return "interferenceRandomisationConfig-r14";
         case 6: return "npdcch-ConfigDedicated-v1530";
         case 7: return "additionalTxSIB1-Config-v1540";
         case 8: return null;
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

      boolean carrierConfigDedicated_r13Present = buffer.decodeBit ("carrierConfigDedicated_r13Present");
      boolean npdcch_ConfigDedicated_r13Present = buffer.decodeBit ("npdcch_ConfigDedicated_r13Present");
      boolean npusch_ConfigDedicated_r13Present = buffer.decodeBit ("npusch_ConfigDedicated_r13Present");
      boolean uplinkPowerControlDedicated_r13Present = buffer.decodeBit ("uplinkPowerControlDedicated_r13Present");

      // decode carrierConfigDedicated_r13

      if (carrierConfigDedicated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("carrierConfigDedicated_r13", -1);

         carrierConfigDedicated_r13 = new CarrierConfigDedicated_NB_r13();
         carrierConfigDedicated_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("carrierConfigDedicated_r13", -1);
      }
      else {
         carrierConfigDedicated_r13 = null;
      }

      // decode npdcch_ConfigDedicated_r13

      if (npdcch_ConfigDedicated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("npdcch_ConfigDedicated_r13", -1);

         npdcch_ConfigDedicated_r13 = new NPDCCH_ConfigDedicated_NB_r13();
         npdcch_ConfigDedicated_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("npdcch_ConfigDedicated_r13", -1);
      }
      else {
         npdcch_ConfigDedicated_r13 = null;
      }

      // decode npusch_ConfigDedicated_r13

      if (npusch_ConfigDedicated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("npusch_ConfigDedicated_r13", -1);

         npusch_ConfigDedicated_r13 = new NPUSCH_ConfigDedicated_NB_r13();
         npusch_ConfigDedicated_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("npusch_ConfigDedicated_r13", -1);
      }
      else {
         npusch_ConfigDedicated_r13 = null;
      }

      // decode uplinkPowerControlDedicated_r13

      if (uplinkPowerControlDedicated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("uplinkPowerControlDedicated_r13", -1);

         uplinkPowerControlDedicated_r13 = new UplinkPowerControlDedicated_NB_r13();
         uplinkPowerControlDedicated_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uplinkPowerControlDedicated_r13", -1);
      }
      else {
         uplinkPowerControlDedicated_r13 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean twoHARQ_ProcessesConfig_r14Present = buffer.decodeBit ("twoHARQ_ProcessesConfig_r14Present");

            // decode twoHARQ_ProcessesConfig_r14

            if (twoHARQ_ProcessesConfig_r14Present) {
               buffer.getContext().eventDispatcher.startElement("twoHARQ_ProcessesConfig_r14", -1);

               int tval = PhysicalConfigDedicated_NB_r13_twoHARQ_ProcessesConfig_r14.decodeEnumValue (buffer);
               twoHARQ_ProcessesConfig_r14 = PhysicalConfigDedicated_NB_r13_twoHARQ_ProcessesConfig_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("twoHARQ_ProcessesConfig_r14", -1);
            }
            else {
               twoHARQ_ProcessesConfig_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean interferenceRandomisationConfig_r14Present = buffer.decodeBit ("interferenceRandomisationConfig_r14Present");

            // decode interferenceRandomisationConfig_r14

            if (interferenceRandomisationConfig_r14Present) {
               buffer.getContext().eventDispatcher.startElement("interferenceRandomisationConfig_r14", -1);

               int tval = PhysicalConfigDedicated_NB_r13_interferenceRandomisationConfig_r14.decodeEnumValue (buffer);
               interferenceRandomisationConfig_r14 = PhysicalConfigDedicated_NB_r13_interferenceRandomisationConfig_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("interferenceRandomisationConfig_r14", -1);
            }
            else {
               interferenceRandomisationConfig_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean npdcch_ConfigDedicated_v1530Present = buffer.decodeBit ("npdcch_ConfigDedicated_v1530Present");

            // decode npdcch_ConfigDedicated_v1530

            if (npdcch_ConfigDedicated_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("npdcch_ConfigDedicated_v1530", -1);

               npdcch_ConfigDedicated_v1530 = new NPDCCH_ConfigDedicated_NB_v1530();
               npdcch_ConfigDedicated_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("npdcch_ConfigDedicated_v1530", -1);
            }
            else {
               npdcch_ConfigDedicated_v1530 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean additionalTxSIB1_Config_v1540Present = buffer.decodeBit ("additionalTxSIB1_Config_v1540Present");

            // decode additionalTxSIB1_Config_v1540

            if (additionalTxSIB1_Config_v1540Present) {
               buffer.getContext().eventDispatcher.startElement("additionalTxSIB1_Config_v1540", -1);

               int tval = PhysicalConfigDedicated_NB_r13_additionalTxSIB1_Config_v1540.decodeEnumValue (buffer);
               additionalTxSIB1_Config_v1540 = PhysicalConfigDedicated_NB_r13_additionalTxSIB1_Config_v1540.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("additionalTxSIB1_Config_v1540", -1);
            }
            else {
               additionalTxSIB1_Config_v1540 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (carrierConfigDedicated_r13 != null) carrierConfigDedicated_r13.print (_sb, "carrierConfigDedicated_r13", _level+1);
      if (npdcch_ConfigDedicated_r13 != null) npdcch_ConfigDedicated_r13.print (_sb, "npdcch_ConfigDedicated_r13", _level+1);
      if (npusch_ConfigDedicated_r13 != null) npusch_ConfigDedicated_r13.print (_sb, "npusch_ConfigDedicated_r13", _level+1);
      if (uplinkPowerControlDedicated_r13 != null) uplinkPowerControlDedicated_r13.print (_sb, "uplinkPowerControlDedicated_r13", _level+1);
      if (twoHARQ_ProcessesConfig_r14 != null) twoHARQ_ProcessesConfig_r14.print (_sb, "twoHARQ_ProcessesConfig_r14", _level+1);
      if (interferenceRandomisationConfig_r14 != null) interferenceRandomisationConfig_r14.print (_sb, "interferenceRandomisationConfig_r14", _level+1);
      if (npdcch_ConfigDedicated_v1530 != null) npdcch_ConfigDedicated_v1530.print (_sb, "npdcch_ConfigDedicated_v1530", _level+1);
      if (additionalTxSIB1_Config_v1540 != null) additionalTxSIB1_Config_v1540.print (_sb, "additionalTxSIB1_Config_v1540", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
