/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IntraFreqNeighCellInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IntraFreqNeighCellInfo";
   }

   public PhysCellId physCellId;
   public Q_OffsetRange q_OffsetCell = null;
   public Asn1Integer q_RxLevMinOffsetCell;  // optional
   public Asn1Integer q_RxLevMinOffsetCellSUL;  // optional
   public Asn1Integer q_QualMinOffsetCell;  // optional
   public Asn1OpenExt extElem1;

   public IntraFreqNeighCellInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IntraFreqNeighCellInfo (
      PhysCellId physCellId_,
      Q_OffsetRange q_OffsetCell_,
      Asn1Integer q_RxLevMinOffsetCell_,
      Asn1Integer q_RxLevMinOffsetCellSUL_,
      Asn1Integer q_QualMinOffsetCell_
   ) {
      super();
      physCellId = physCellId_;
      q_OffsetCell = q_OffsetCell_;
      q_RxLevMinOffsetCell = q_RxLevMinOffsetCell_;
      q_RxLevMinOffsetCellSUL = q_RxLevMinOffsetCellSUL_;
      q_QualMinOffsetCell = q_QualMinOffsetCell_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public IntraFreqNeighCellInfo (
      PhysCellId physCellId_,
      Q_OffsetRange q_OffsetCell_
   ) {
      super();
      physCellId = physCellId_;
      q_OffsetCell = q_OffsetCell_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public IntraFreqNeighCellInfo (long physCellId_,
      Q_OffsetRange q_OffsetCell_,
      long q_RxLevMinOffsetCell_,
      long q_RxLevMinOffsetCellSUL_,
      long q_QualMinOffsetCell_
   ) {
      super();
      physCellId = new PhysCellId (physCellId_);
      q_OffsetCell = q_OffsetCell_;
      q_RxLevMinOffsetCell = new Asn1Integer (q_RxLevMinOffsetCell_);
      q_RxLevMinOffsetCellSUL = new Asn1Integer (q_RxLevMinOffsetCellSUL_);
      q_QualMinOffsetCell = new Asn1Integer (q_QualMinOffsetCell_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public IntraFreqNeighCellInfo (
      long physCellId_,
      Q_OffsetRange q_OffsetCell_
   ) {
      super();
      physCellId = new PhysCellId (physCellId_);
      q_OffsetCell = q_OffsetCell_;
   }

   public void init () {
      physCellId = null;
      q_OffsetCell = null;
      q_RxLevMinOffsetCell = null;
      q_RxLevMinOffsetCellSUL = null;
      q_QualMinOffsetCell = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId;
         case 1: return q_OffsetCell;
         case 2: return q_RxLevMinOffsetCell;
         case 3: return q_RxLevMinOffsetCellSUL;
         case 4: return q_QualMinOffsetCell;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId";
         case 1: return "q-OffsetCell";
         case 2: return "q-RxLevMinOffsetCell";
         case 3: return "q-RxLevMinOffsetCellSUL";
         case 4: return "q-QualMinOffsetCell";
         case 5: return null;
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

      boolean q_RxLevMinOffsetCellPresent = buffer.decodeBit ("q_RxLevMinOffsetCellPresent");
      boolean q_RxLevMinOffsetCellSULPresent = buffer.decodeBit ("q_RxLevMinOffsetCellSULPresent");
      boolean q_QualMinOffsetCellPresent = buffer.decodeBit ("q_QualMinOffsetCellPresent");

      // decode physCellId

      buffer.getContext().eventDispatcher.startElement("physCellId", -1);

      physCellId = new PhysCellId();
      physCellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId", -1);

      // decode q_OffsetCell

      buffer.getContext().eventDispatcher.startElement("q_OffsetCell", -1);

      {
         int tval = Q_OffsetRange.decodeEnumValue (buffer);
         q_OffsetCell = Q_OffsetRange.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("q_OffsetCell", -1);

      // decode q_RxLevMinOffsetCell

      if (q_RxLevMinOffsetCellPresent) {
         buffer.getContext().eventDispatcher.startElement("q_RxLevMinOffsetCell", -1);

         q_RxLevMinOffsetCell = new Asn1Integer();
         q_RxLevMinOffsetCell.decode (buffer, 1, 8);

         buffer.invokeCharacters(q_RxLevMinOffsetCell.toString());
         buffer.getContext().eventDispatcher.endElement("q_RxLevMinOffsetCell", -1);
      }
      else {
         q_RxLevMinOffsetCell = null;
      }

      // decode q_RxLevMinOffsetCellSUL

      if (q_RxLevMinOffsetCellSULPresent) {
         buffer.getContext().eventDispatcher.startElement("q_RxLevMinOffsetCellSUL", -1);

         q_RxLevMinOffsetCellSUL = new Asn1Integer();
         q_RxLevMinOffsetCellSUL.decode (buffer, 1, 8);

         buffer.invokeCharacters(q_RxLevMinOffsetCellSUL.toString());
         buffer.getContext().eventDispatcher.endElement("q_RxLevMinOffsetCellSUL", -1);
      }
      else {
         q_RxLevMinOffsetCellSUL = null;
      }

      // decode q_QualMinOffsetCell

      if (q_QualMinOffsetCellPresent) {
         buffer.getContext().eventDispatcher.startElement("q_QualMinOffsetCell", -1);

         q_QualMinOffsetCell = new Asn1Integer();
         q_QualMinOffsetCell.decode (buffer, 1, 8);

         buffer.invokeCharacters(q_QualMinOffsetCell.toString());
         buffer.getContext().eventDispatcher.endElement("q_QualMinOffsetCell", -1);
      }
      else {
         q_QualMinOffsetCell = null;
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
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (q_OffsetCell != null) q_OffsetCell.print (_sb, "q_OffsetCell", _level+1);
      if (q_RxLevMinOffsetCell != null) q_RxLevMinOffsetCell.print (_sb, "q_RxLevMinOffsetCell", _level+1);
      if (q_RxLevMinOffsetCellSUL != null) q_RxLevMinOffsetCellSUL.print (_sb, "q_RxLevMinOffsetCellSUL", _level+1);
      if (q_QualMinOffsetCell != null) q_QualMinOffsetCell.print (_sb, "q_QualMinOffsetCell", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
