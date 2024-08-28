/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.ServCellIndex_r10;
import asn.lte.generated.EUTRA_RRC_Definitions.ServCellIndex_r13;

public class MeasResultServCellSCG_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultServCellSCG-r12";
   }

   public ServCellIndex_r10 servCellId_r12;
   public MeasResultServCellSCG_r12_measResultSCell_r12 measResultSCell_r12;
   public boolean mV2ExtPresent;
   public ServCellIndex_r13 servCellId_r13;  // optional
   public MeasResultServCellSCG_r12_measResultSCell_v1310 measResultSCell_v1310;  // optional
   public Asn1OpenExt extElem1;

   public MeasResultServCellSCG_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultServCellSCG_r12 (
      ServCellIndex_r10 servCellId_r12_,
      MeasResultServCellSCG_r12_measResultSCell_r12 measResultSCell_r12_,
      ServCellIndex_r13 servCellId_r13_,
      MeasResultServCellSCG_r12_measResultSCell_v1310 measResultSCell_v1310_
   ) {
      super();
      servCellId_r12 = servCellId_r12_;
      measResultSCell_r12 = measResultSCell_r12_;
      servCellId_r13 = servCellId_r13_;
      measResultSCell_v1310 = measResultSCell_v1310_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultServCellSCG_r12 (
      ServCellIndex_r10 servCellId_r12_,
      MeasResultServCellSCG_r12_measResultSCell_r12 measResultSCell_r12_
   ) {
      super();
      servCellId_r12 = servCellId_r12_;
      measResultSCell_r12 = measResultSCell_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultServCellSCG_r12 (long servCellId_r12_,
      MeasResultServCellSCG_r12_measResultSCell_r12 measResultSCell_r12_,
      long servCellId_r13_,
      MeasResultServCellSCG_r12_measResultSCell_v1310 measResultSCell_v1310_
   ) {
      super();
      servCellId_r12 = new ServCellIndex_r10 (servCellId_r12_);
      measResultSCell_r12 = measResultSCell_r12_;
      servCellId_r13 = new ServCellIndex_r13 (servCellId_r13_);
      measResultSCell_v1310 = measResultSCell_v1310_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultServCellSCG_r12 (
      long servCellId_r12_,
      MeasResultServCellSCG_r12_measResultSCell_r12 measResultSCell_r12_
   ) {
      super();
      servCellId_r12 = new ServCellIndex_r10 (servCellId_r12_);
      measResultSCell_r12 = measResultSCell_r12_;
   }

   public void init () {
      servCellId_r12 = null;
      measResultSCell_r12 = null;
      servCellId_r13 = null;
      measResultSCell_v1310 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return servCellId_r12;
         case 1: return measResultSCell_r12;
         case 2: return servCellId_r13;
         case 3: return measResultSCell_v1310;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "servCellId-r12";
         case 1: return "measResultSCell-r12";
         case 2: return "servCellId-r13";
         case 3: return "measResultSCell-v1310";
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

      // decode servCellId_r12

      buffer.getContext().eventDispatcher.startElement("servCellId_r12", -1);

      servCellId_r12 = new ServCellIndex_r10();
      servCellId_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servCellId_r12", -1);

      // decode measResultSCell_r12

      buffer.getContext().eventDispatcher.startElement("measResultSCell_r12", -1);

      measResultSCell_r12 = new MeasResultServCellSCG_r12_measResultSCell_r12();
      measResultSCell_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measResultSCell_r12", -1);

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

            boolean servCellId_r13Present = buffer.decodeBit ("servCellId_r13Present");

            boolean measResultSCell_v1310Present = buffer.decodeBit ("measResultSCell_v1310Present");

            // decode servCellId_r13

            if (servCellId_r13Present) {
               buffer.getContext().eventDispatcher.startElement("servCellId_r13", -1);

               servCellId_r13 = new ServCellIndex_r13();
               servCellId_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("servCellId_r13", -1);
            }
            else {
               servCellId_r13 = null;
            }

            // decode measResultSCell_v1310

            if (measResultSCell_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("measResultSCell_v1310", -1);

               measResultSCell_v1310 = new MeasResultServCellSCG_r12_measResultSCell_v1310();
               measResultSCell_v1310.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultSCell_v1310", -1);
            }
            else {
               measResultSCell_v1310 = null;
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
      if (servCellId_r12 != null) servCellId_r12.print (_sb, "servCellId_r12", _level+1);
      if (measResultSCell_r12 != null) measResultSCell_r12.print (_sb, "measResultSCell_r12", _level+1);
      if (servCellId_r13 != null) servCellId_r13.print (_sb, "servCellId_r13", _level+1);
      if (measResultSCell_v1310 != null) measResultSCell_v1310.print (_sb, "measResultSCell_v1310", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
