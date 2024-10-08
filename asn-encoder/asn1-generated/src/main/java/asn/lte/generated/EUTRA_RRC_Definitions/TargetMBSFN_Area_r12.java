/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TargetMBSFN_Area_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TargetMBSFN-Area-r12";
   }

   public MBSFN_AreaId_r12 mbsfn_AreaId_r12;  // optional
   public ARFCN_ValueEUTRA_r9 carrierFreq_r12;
   public Asn1OpenExt extElem1;

   public TargetMBSFN_Area_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TargetMBSFN_Area_r12 (
      MBSFN_AreaId_r12 mbsfn_AreaId_r12_,
      ARFCN_ValueEUTRA_r9 carrierFreq_r12_
   ) {
      super();
      mbsfn_AreaId_r12 = mbsfn_AreaId_r12_;
      carrierFreq_r12 = carrierFreq_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public TargetMBSFN_Area_r12 (
      ARFCN_ValueEUTRA_r9 carrierFreq_r12_
   ) {
      super();
      carrierFreq_r12 = carrierFreq_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TargetMBSFN_Area_r12 (long mbsfn_AreaId_r12_,
      long carrierFreq_r12_
   ) {
      super();
      mbsfn_AreaId_r12 = new MBSFN_AreaId_r12 (mbsfn_AreaId_r12_);
      carrierFreq_r12 = new ARFCN_ValueEUTRA_r9 (carrierFreq_r12_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public TargetMBSFN_Area_r12 (
      long carrierFreq_r12_
   ) {
      super();
      carrierFreq_r12 = new ARFCN_ValueEUTRA_r9 (carrierFreq_r12_);
   }

   public void init () {
      mbsfn_AreaId_r12 = null;
      carrierFreq_r12 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mbsfn_AreaId_r12;
         case 1: return carrierFreq_r12;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mbsfn-AreaId-r12";
         case 1: return "carrierFreq-r12";
         case 2: return null;
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

      boolean mbsfn_AreaId_r12Present = buffer.decodeBit ("mbsfn_AreaId_r12Present");

      // decode mbsfn_AreaId_r12

      if (mbsfn_AreaId_r12Present) {
         buffer.getContext().eventDispatcher.startElement("mbsfn_AreaId_r12", -1);

         mbsfn_AreaId_r12 = new MBSFN_AreaId_r12();
         mbsfn_AreaId_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mbsfn_AreaId_r12", -1);
      }
      else {
         mbsfn_AreaId_r12 = null;
      }

      // decode carrierFreq_r12

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r12", -1);

      carrierFreq_r12 = new ARFCN_ValueEUTRA_r9();
      carrierFreq_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r12", -1);

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
      if (mbsfn_AreaId_r12 != null) mbsfn_AreaId_r12.print (_sb, "mbsfn_AreaId_r12", _level+1);
      if (carrierFreq_r12 != null) carrierFreq_r12.print (_sb, "carrierFreq_r12", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
