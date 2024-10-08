/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CRS_AssistanceInfo_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CRS-AssistanceInfo-r11";
   }

   public PhysCellId physCellId_r11;
   public CRS_AssistanceInfo_r11_antennaPortsCount_r11 antennaPortsCount_r11 = null;
   public MBSFN_SubframeConfigList mbsfn_SubframeConfigList_r11;
   public boolean mV2ExtPresent;
   public MBSFN_SubframeConfigList_v1430 mbsfn_SubframeConfigList_v1430;  // optional
   public Asn1OpenExt extElem1;

   public CRS_AssistanceInfo_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CRS_AssistanceInfo_r11 (
      PhysCellId physCellId_r11_,
      CRS_AssistanceInfo_r11_antennaPortsCount_r11 antennaPortsCount_r11_,
      MBSFN_SubframeConfigList mbsfn_SubframeConfigList_r11_,
      MBSFN_SubframeConfigList_v1430 mbsfn_SubframeConfigList_v1430_
   ) {
      super();
      physCellId_r11 = physCellId_r11_;
      antennaPortsCount_r11 = antennaPortsCount_r11_;
      mbsfn_SubframeConfigList_r11 = mbsfn_SubframeConfigList_r11_;
      mbsfn_SubframeConfigList_v1430 = mbsfn_SubframeConfigList_v1430_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CRS_AssistanceInfo_r11 (
      PhysCellId physCellId_r11_,
      CRS_AssistanceInfo_r11_antennaPortsCount_r11 antennaPortsCount_r11_,
      MBSFN_SubframeConfigList mbsfn_SubframeConfigList_r11_
   ) {
      super();
      physCellId_r11 = physCellId_r11_;
      antennaPortsCount_r11 = antennaPortsCount_r11_;
      mbsfn_SubframeConfigList_r11 = mbsfn_SubframeConfigList_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CRS_AssistanceInfo_r11 (long physCellId_r11_,
      CRS_AssistanceInfo_r11_antennaPortsCount_r11 antennaPortsCount_r11_,
      MBSFN_SubframeConfigList mbsfn_SubframeConfigList_r11_,
      MBSFN_SubframeConfigList_v1430 mbsfn_SubframeConfigList_v1430_
   ) {
      super();
      physCellId_r11 = new PhysCellId (physCellId_r11_);
      antennaPortsCount_r11 = antennaPortsCount_r11_;
      mbsfn_SubframeConfigList_r11 = mbsfn_SubframeConfigList_r11_;
      mbsfn_SubframeConfigList_v1430 = mbsfn_SubframeConfigList_v1430_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CRS_AssistanceInfo_r11 (
      long physCellId_r11_,
      CRS_AssistanceInfo_r11_antennaPortsCount_r11 antennaPortsCount_r11_,
      MBSFN_SubframeConfigList mbsfn_SubframeConfigList_r11_
   ) {
      super();
      physCellId_r11 = new PhysCellId (physCellId_r11_);
      antennaPortsCount_r11 = antennaPortsCount_r11_;
      mbsfn_SubframeConfigList_r11 = mbsfn_SubframeConfigList_r11_;
   }

   public void init () {
      physCellId_r11 = null;
      antennaPortsCount_r11 = null;
      mbsfn_SubframeConfigList_r11 = null;
      mbsfn_SubframeConfigList_v1430 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId_r11;
         case 1: return antennaPortsCount_r11;
         case 2: return mbsfn_SubframeConfigList_r11;
         case 3: return mbsfn_SubframeConfigList_v1430;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId-r11";
         case 1: return "antennaPortsCount-r11";
         case 2: return "mbsfn-SubframeConfigList-r11";
         case 3: return "mbsfn-SubframeConfigList-v1430";
         case 4: return null;
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

      // decode physCellId_r11

      buffer.getContext().eventDispatcher.startElement("physCellId_r11", -1);

      physCellId_r11 = new PhysCellId();
      physCellId_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r11", -1);

      // decode antennaPortsCount_r11

      buffer.getContext().eventDispatcher.startElement("antennaPortsCount_r11", -1);

      {
         int tval = CRS_AssistanceInfo_r11_antennaPortsCount_r11.decodeEnumValue (buffer);
         antennaPortsCount_r11 = CRS_AssistanceInfo_r11_antennaPortsCount_r11.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("antennaPortsCount_r11", -1);

      // decode mbsfn_SubframeConfigList_r11

      buffer.getContext().eventDispatcher.startElement("mbsfn_SubframeConfigList_r11", -1);

      mbsfn_SubframeConfigList_r11 = new MBSFN_SubframeConfigList();
      mbsfn_SubframeConfigList_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mbsfn_SubframeConfigList_r11", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean mbsfn_SubframeConfigList_v1430Present = buffer.decodeBit ("mbsfn_SubframeConfigList_v1430Present");

            // decode mbsfn_SubframeConfigList_v1430

            if (mbsfn_SubframeConfigList_v1430Present) {
               buffer.getContext().eventDispatcher.startElement("mbsfn_SubframeConfigList_v1430", -1);

               mbsfn_SubframeConfigList_v1430 = new MBSFN_SubframeConfigList_v1430();
               mbsfn_SubframeConfigList_v1430.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("mbsfn_SubframeConfigList_v1430", -1);
            }
            else {
               mbsfn_SubframeConfigList_v1430 = null;
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
      if (physCellId_r11 != null) physCellId_r11.print (_sb, "physCellId_r11", _level+1);
      if (antennaPortsCount_r11 != null) antennaPortsCount_r11.print (_sb, "antennaPortsCount_r11", _level+1);
      if (mbsfn_SubframeConfigList_r11 != null) mbsfn_SubframeConfigList_r11.print (_sb, "mbsfn_SubframeConfigList_r11", _level+1);
      if (mbsfn_SubframeConfigList_v1430 != null) mbsfn_SubframeConfigList_v1430.print (_sb, "mbsfn_SubframeConfigList_v1430", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
