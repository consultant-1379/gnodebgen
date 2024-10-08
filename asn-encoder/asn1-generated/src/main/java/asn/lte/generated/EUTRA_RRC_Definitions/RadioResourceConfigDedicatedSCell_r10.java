/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RadioResourceConfigDedicatedSCell_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RadioResourceConfigDedicatedSCell-r10";
   }

   public PhysicalConfigDedicatedSCell_r10 physicalConfigDedicatedSCell_r10;  // optional
   public boolean mV2ExtPresent;
   public MAC_MainConfigSCell_r11 mac_MainConfigSCell_r11;  // optional
   public boolean mV3ExtPresent;
   public NAICS_AssistanceInfo_r12 naics_Info_r12;  // optional
   public boolean mV4ExtPresent;
   public NeighCellsCRS_Info_r13 neighCellsCRS_InfoSCell_r13;  // optional
   public boolean mV5ExtPresent;
   public PhysicalConfigDedicatedSCell_v1370 physicalConfigDedicatedSCell_v1370;  // optional
   public boolean mV6ExtPresent;
   public Asn1Boolean crs_IntfMitigEnabled_r15;  // optional
   public NeighCellsCRS_Info_r15 neighCellsCRS_Info_r15;  // optional
   public SPS_Config_v1530 sps_Config_v1530;  // optional
   public Asn1OpenExt extElem1;

   public RadioResourceConfigDedicatedSCell_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RadioResourceConfigDedicatedSCell_r10 (
      PhysicalConfigDedicatedSCell_r10 physicalConfigDedicatedSCell_r10_,
      MAC_MainConfigSCell_r11 mac_MainConfigSCell_r11_,
      NAICS_AssistanceInfo_r12 naics_Info_r12_,
      NeighCellsCRS_Info_r13 neighCellsCRS_InfoSCell_r13_,
      PhysicalConfigDedicatedSCell_v1370 physicalConfigDedicatedSCell_v1370_,
      Asn1Boolean crs_IntfMitigEnabled_r15_,
      NeighCellsCRS_Info_r15 neighCellsCRS_Info_r15_,
      SPS_Config_v1530 sps_Config_v1530_
   ) {
      super();
      physicalConfigDedicatedSCell_r10 = physicalConfigDedicatedSCell_r10_;
      mac_MainConfigSCell_r11 = mac_MainConfigSCell_r11_;
      naics_Info_r12 = naics_Info_r12_;
      neighCellsCRS_InfoSCell_r13 = neighCellsCRS_InfoSCell_r13_;
      physicalConfigDedicatedSCell_v1370 = physicalConfigDedicatedSCell_v1370_;
      crs_IntfMitigEnabled_r15 = crs_IntfMitigEnabled_r15_;
      neighCellsCRS_Info_r15 = neighCellsCRS_Info_r15_;
      sps_Config_v1530 = sps_Config_v1530_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RadioResourceConfigDedicatedSCell_r10 (PhysicalConfigDedicatedSCell_r10 physicalConfigDedicatedSCell_r10_,
      MAC_MainConfigSCell_r11 mac_MainConfigSCell_r11_,
      NAICS_AssistanceInfo_r12 naics_Info_r12_,
      NeighCellsCRS_Info_r13 neighCellsCRS_InfoSCell_r13_,
      PhysicalConfigDedicatedSCell_v1370 physicalConfigDedicatedSCell_v1370_,
      boolean crs_IntfMitigEnabled_r15_,
      NeighCellsCRS_Info_r15 neighCellsCRS_Info_r15_,
      SPS_Config_v1530 sps_Config_v1530_
   ) {
      super();
      physicalConfigDedicatedSCell_r10 = physicalConfigDedicatedSCell_r10_;
      mac_MainConfigSCell_r11 = mac_MainConfigSCell_r11_;
      naics_Info_r12 = naics_Info_r12_;
      neighCellsCRS_InfoSCell_r13 = neighCellsCRS_InfoSCell_r13_;
      physicalConfigDedicatedSCell_v1370 = physicalConfigDedicatedSCell_v1370_;
      crs_IntfMitigEnabled_r15 = new Asn1Boolean (crs_IntfMitigEnabled_r15_);
      neighCellsCRS_Info_r15 = neighCellsCRS_Info_r15_;
      sps_Config_v1530 = sps_Config_v1530_;
   }

   public void init () {
      physicalConfigDedicatedSCell_r10 = null;
      mac_MainConfigSCell_r11 = null;
      naics_Info_r12 = null;
      neighCellsCRS_InfoSCell_r13 = null;
      physicalConfigDedicatedSCell_v1370 = null;
      crs_IntfMitigEnabled_r15 = null;
      neighCellsCRS_Info_r15 = null;
      sps_Config_v1530 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physicalConfigDedicatedSCell_r10;
         case 1: return mac_MainConfigSCell_r11;
         case 2: return naics_Info_r12;
         case 3: return neighCellsCRS_InfoSCell_r13;
         case 4: return physicalConfigDedicatedSCell_v1370;
         case 5: return crs_IntfMitigEnabled_r15;
         case 6: return neighCellsCRS_Info_r15;
         case 7: return sps_Config_v1530;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physicalConfigDedicatedSCell-r10";
         case 1: return "mac-MainConfigSCell-r11";
         case 2: return "naics-Info-r12";
         case 3: return "neighCellsCRS-InfoSCell-r13";
         case 4: return "physicalConfigDedicatedSCell-v1370";
         case 5: return "crs-IntfMitigEnabled-r15";
         case 6: return "neighCellsCRS-Info-r15";
         case 7: return "sps-Config-v1530";
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

      boolean physicalConfigDedicatedSCell_r10Present = buffer.decodeBit ("physicalConfigDedicatedSCell_r10Present");

      // decode physicalConfigDedicatedSCell_r10

      if (physicalConfigDedicatedSCell_r10Present) {
         buffer.getContext().eventDispatcher.startElement("physicalConfigDedicatedSCell_r10", -1);

         physicalConfigDedicatedSCell_r10 = new PhysicalConfigDedicatedSCell_r10();
         physicalConfigDedicatedSCell_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("physicalConfigDedicatedSCell_r10", -1);
      }
      else {
         physicalConfigDedicatedSCell_r10 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean mac_MainConfigSCell_r11Present = buffer.decodeBit ("mac_MainConfigSCell_r11Present");

            // decode mac_MainConfigSCell_r11

            if (mac_MainConfigSCell_r11Present) {
               buffer.getContext().eventDispatcher.startElement("mac_MainConfigSCell_r11", -1);

               mac_MainConfigSCell_r11 = new MAC_MainConfigSCell_r11();
               mac_MainConfigSCell_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("mac_MainConfigSCell_r11", -1);
            }
            else {
               mac_MainConfigSCell_r11 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean naics_Info_r12Present = buffer.decodeBit ("naics_Info_r12Present");

            // decode naics_Info_r12

            if (naics_Info_r12Present) {
               buffer.getContext().eventDispatcher.startElement("naics_Info_r12", -1);

               naics_Info_r12 = new NAICS_AssistanceInfo_r12();
               naics_Info_r12.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("naics_Info_r12", -1);
            }
            else {
               naics_Info_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean neighCellsCRS_InfoSCell_r13Present = buffer.decodeBit ("neighCellsCRS_InfoSCell_r13Present");

            // decode neighCellsCRS_InfoSCell_r13

            if (neighCellsCRS_InfoSCell_r13Present) {
               buffer.getContext().eventDispatcher.startElement("neighCellsCRS_InfoSCell_r13", -1);

               neighCellsCRS_InfoSCell_r13 = new NeighCellsCRS_Info_r13();
               neighCellsCRS_InfoSCell_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("neighCellsCRS_InfoSCell_r13", -1);
            }
            else {
               neighCellsCRS_InfoSCell_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean physicalConfigDedicatedSCell_v1370Present = buffer.decodeBit ("physicalConfigDedicatedSCell_v1370Present");

            // decode physicalConfigDedicatedSCell_v1370

            if (physicalConfigDedicatedSCell_v1370Present) {
               buffer.getContext().eventDispatcher.startElement("physicalConfigDedicatedSCell_v1370", -1);

               physicalConfigDedicatedSCell_v1370 = new PhysicalConfigDedicatedSCell_v1370();
               physicalConfigDedicatedSCell_v1370.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("physicalConfigDedicatedSCell_v1370", -1);
            }
            else {
               physicalConfigDedicatedSCell_v1370 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean crs_IntfMitigEnabled_r15Present = buffer.decodeBit ("crs_IntfMitigEnabled_r15Present");

            boolean neighCellsCRS_Info_r15Present = buffer.decodeBit ("neighCellsCRS_Info_r15Present");

            boolean sps_Config_v1530Present = buffer.decodeBit ("sps_Config_v1530Present");

            // decode crs_IntfMitigEnabled_r15

            if (crs_IntfMitigEnabled_r15Present) {
               buffer.getContext().eventDispatcher.startElement("crs_IntfMitigEnabled_r15", -1);

               crs_IntfMitigEnabled_r15 = new Asn1Boolean();
               crs_IntfMitigEnabled_r15.decode (buffer);

               buffer.invokeCharacters(crs_IntfMitigEnabled_r15.toString());
               buffer.getContext().eventDispatcher.endElement("crs_IntfMitigEnabled_r15", -1);
            }
            else {
               crs_IntfMitigEnabled_r15 = null;
            }

            // decode neighCellsCRS_Info_r15

            if (neighCellsCRS_Info_r15Present) {
               buffer.getContext().eventDispatcher.startElement("neighCellsCRS_Info_r15", -1);

               neighCellsCRS_Info_r15 = new NeighCellsCRS_Info_r15();
               neighCellsCRS_Info_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("neighCellsCRS_Info_r15", -1);
            }
            else {
               neighCellsCRS_Info_r15 = null;
            }

            // decode sps_Config_v1530

            if (sps_Config_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("sps_Config_v1530", -1);

               sps_Config_v1530 = new SPS_Config_v1530();
               sps_Config_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sps_Config_v1530", -1);
            }
            else {
               sps_Config_v1530 = null;
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
      if (physicalConfigDedicatedSCell_r10 != null) physicalConfigDedicatedSCell_r10.print (_sb, "physicalConfigDedicatedSCell_r10", _level+1);
      if (mac_MainConfigSCell_r11 != null) mac_MainConfigSCell_r11.print (_sb, "mac_MainConfigSCell_r11", _level+1);
      if (naics_Info_r12 != null) naics_Info_r12.print (_sb, "naics_Info_r12", _level+1);
      if (neighCellsCRS_InfoSCell_r13 != null) neighCellsCRS_InfoSCell_r13.print (_sb, "neighCellsCRS_InfoSCell_r13", _level+1);
      if (physicalConfigDedicatedSCell_v1370 != null) physicalConfigDedicatedSCell_v1370.print (_sb, "physicalConfigDedicatedSCell_v1370", _level+1);
      if (crs_IntfMitigEnabled_r15 != null) crs_IntfMitigEnabled_r15.print (_sb, "crs_IntfMitigEnabled_r15", _level+1);
      if (neighCellsCRS_Info_r15 != null) neighCellsCRS_Info_r15.print (_sb, "neighCellsCRS_Info_r15", _level+1);
      if (sps_Config_v1530 != null) sps_Config_v1530.print (_sb, "sps_Config_v1530", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
