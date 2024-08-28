/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailureReportMCG_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FailureReportMCG-r16";
   }

   public FailureReportMCG_r16_failureType_r16 failureType_r16 = null;  // optional
   public MeasResultList2NR measResultFreqList_r16;  // optional
   public MeasResultList2EUTRA measResultFreqListEUTRA_r16;  // optional
   public MeasResultSCG_Failure measResultSCG_r16;  // optional
   public Asn1OctetString measResultSCG_EUTRA_r16;  // optional
   public MeasResultList2UTRA measResultFreqListUTRA_FDD_r16;  // optional
   public Asn1OpenExt extElem1;

   public FailureReportMCG_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FailureReportMCG_r16 (
      FailureReportMCG_r16_failureType_r16 failureType_r16_,
      MeasResultList2NR measResultFreqList_r16_,
      MeasResultList2EUTRA measResultFreqListEUTRA_r16_,
      MeasResultSCG_Failure measResultSCG_r16_,
      Asn1OctetString measResultSCG_EUTRA_r16_,
      MeasResultList2UTRA measResultFreqListUTRA_FDD_r16_
   ) {
      super();
      failureType_r16 = failureType_r16_;
      measResultFreqList_r16 = measResultFreqList_r16_;
      measResultFreqListEUTRA_r16 = measResultFreqListEUTRA_r16_;
      measResultSCG_r16 = measResultSCG_r16_;
      measResultSCG_EUTRA_r16 = measResultSCG_EUTRA_r16_;
      measResultFreqListUTRA_FDD_r16 = measResultFreqListUTRA_FDD_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public FailureReportMCG_r16 (FailureReportMCG_r16_failureType_r16 failureType_r16_,
      MeasResultList2NR measResultFreqList_r16_,
      MeasResultList2EUTRA measResultFreqListEUTRA_r16_,
      MeasResultSCG_Failure measResultSCG_r16_,
      byte[] measResultSCG_EUTRA_r16_,
      MeasResultList2UTRA measResultFreqListUTRA_FDD_r16_
   ) {
      super();
      failureType_r16 = failureType_r16_;
      measResultFreqList_r16 = measResultFreqList_r16_;
      measResultFreqListEUTRA_r16 = measResultFreqListEUTRA_r16_;
      measResultSCG_r16 = measResultSCG_r16_;
      measResultSCG_EUTRA_r16 = new Asn1OctetString (measResultSCG_EUTRA_r16_);
      measResultFreqListUTRA_FDD_r16 = measResultFreqListUTRA_FDD_r16_;
   }

   public void init () {
      failureType_r16 = null;
      measResultFreqList_r16 = null;
      measResultFreqListEUTRA_r16 = null;
      measResultSCG_r16 = null;
      measResultSCG_EUTRA_r16 = null;
      measResultFreqListUTRA_FDD_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return failureType_r16;
         case 1: return measResultFreqList_r16;
         case 2: return measResultFreqListEUTRA_r16;
         case 3: return measResultSCG_r16;
         case 4: return measResultSCG_EUTRA_r16;
         case 5: return measResultFreqListUTRA_FDD_r16;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "failureType-r16";
         case 1: return "measResultFreqList-r16";
         case 2: return "measResultFreqListEUTRA-r16";
         case 3: return "measResultSCG-r16";
         case 4: return "measResultSCG-EUTRA-r16";
         case 5: return "measResultFreqListUTRA-FDD-r16";
         case 6: return null;
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

      boolean failureType_r16Present = buffer.decodeBit ("failureType_r16Present");
      boolean measResultFreqList_r16Present = buffer.decodeBit ("measResultFreqList_r16Present");
      boolean measResultFreqListEUTRA_r16Present = buffer.decodeBit ("measResultFreqListEUTRA_r16Present");
      boolean measResultSCG_r16Present = buffer.decodeBit ("measResultSCG_r16Present");
      boolean measResultSCG_EUTRA_r16Present = buffer.decodeBit ("measResultSCG_EUTRA_r16Present");
      boolean measResultFreqListUTRA_FDD_r16Present = buffer.decodeBit ("measResultFreqListUTRA_FDD_r16Present");

      // decode failureType_r16

      if (failureType_r16Present) {
         buffer.getContext().eventDispatcher.startElement("failureType_r16", -1);

         int tval = FailureReportMCG_r16_failureType_r16.decodeEnumValue (buffer);
         failureType_r16 = FailureReportMCG_r16_failureType_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("failureType_r16", -1);
      }
      else {
         failureType_r16 = null;
      }

      // decode measResultFreqList_r16

      if (measResultFreqList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultFreqList_r16", -1);

         measResultFreqList_r16 = new MeasResultList2NR();
         measResultFreqList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultFreqList_r16", -1);
      }
      else {
         measResultFreqList_r16 = null;
      }

      // decode measResultFreqListEUTRA_r16

      if (measResultFreqListEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultFreqListEUTRA_r16", -1);

         measResultFreqListEUTRA_r16 = new MeasResultList2EUTRA();
         measResultFreqListEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultFreqListEUTRA_r16", -1);
      }
      else {
         measResultFreqListEUTRA_r16 = null;
      }

      // decode measResultSCG_r16

      if (measResultSCG_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_r16", -1);

         Asn1OctetString measResultSCG_r16_outer = new Asn1OctetString();
         measResultSCG_r16_outer.decode (buffer);
         if (measResultSCG_r16_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( measResultSCG_r16_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         measResultSCG_r16 = new MeasResultSCG_Failure();
         measResultSCG_r16.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("measResultSCG_r16", -1);
      }
      else {
         measResultSCG_r16 = null;
      }

      // decode measResultSCG_EUTRA_r16

      if (measResultSCG_EUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_EUTRA_r16", -1);

         measResultSCG_EUTRA_r16 = new Asn1OctetString();
         measResultSCG_EUTRA_r16.decode (buffer);

         buffer.invokeCharacters(measResultSCG_EUTRA_r16.toString());
         buffer.getContext().eventDispatcher.endElement("measResultSCG_EUTRA_r16", -1);
      }
      else {
         measResultSCG_EUTRA_r16 = null;
      }

      // decode measResultFreqListUTRA_FDD_r16

      if (measResultFreqListUTRA_FDD_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultFreqListUTRA_FDD_r16", -1);

         measResultFreqListUTRA_FDD_r16 = new MeasResultList2UTRA();
         measResultFreqListUTRA_FDD_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultFreqListUTRA_FDD_r16", -1);
      }
      else {
         measResultFreqListUTRA_FDD_r16 = null;
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
      if (failureType_r16 != null) failureType_r16.print (_sb, "failureType_r16", _level+1);
      if (measResultFreqList_r16 != null) measResultFreqList_r16.print (_sb, "measResultFreqList_r16", _level+1);
      if (measResultFreqListEUTRA_r16 != null) measResultFreqListEUTRA_r16.print (_sb, "measResultFreqListEUTRA_r16", _level+1);
      if (measResultSCG_r16 != null) measResultSCG_r16.print (_sb, "measResultSCG_r16", _level+1);
      if (measResultSCG_EUTRA_r16 != null) measResultSCG_EUTRA_r16.print (_sb, "measResultSCG_EUTRA_r16", _level+1);
      if (measResultFreqListUTRA_FDD_r16 != null) measResultFreqListUTRA_FDD_r16.print (_sb, "measResultFreqListUTRA_FDD_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
