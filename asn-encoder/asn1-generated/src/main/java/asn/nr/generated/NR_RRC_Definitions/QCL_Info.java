/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QCL_Info extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QCL-Info";
   }

   public ServCellIndex cell;  // optional
   public BWP_Id bwp_Id;  // optional
   public QCL_Info_referenceSignal referenceSignal;
   public QCL_Info_qcl_Type qcl_Type = null;
   public Asn1OpenExt extElem1;

   public QCL_Info () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QCL_Info (
      ServCellIndex cell_,
      BWP_Id bwp_Id_,
      QCL_Info_referenceSignal referenceSignal_,
      QCL_Info_qcl_Type qcl_Type_
   ) {
      super();
      cell = cell_;
      bwp_Id = bwp_Id_;
      referenceSignal = referenceSignal_;
      qcl_Type = qcl_Type_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public QCL_Info (
      QCL_Info_referenceSignal referenceSignal_,
      QCL_Info_qcl_Type qcl_Type_
   ) {
      super();
      referenceSignal = referenceSignal_;
      qcl_Type = qcl_Type_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public QCL_Info (long cell_,
      long bwp_Id_,
      QCL_Info_referenceSignal referenceSignal_,
      QCL_Info_qcl_Type qcl_Type_
   ) {
      super();
      cell = new ServCellIndex (cell_);
      bwp_Id = new BWP_Id (bwp_Id_);
      referenceSignal = referenceSignal_;
      qcl_Type = qcl_Type_;
   }

   public void init () {
      cell = null;
      bwp_Id = null;
      referenceSignal = null;
      qcl_Type = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cell;
         case 1: return bwp_Id;
         case 2: return referenceSignal;
         case 3: return qcl_Type;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cell";
         case 1: return "bwp-Id";
         case 2: return "referenceSignal";
         case 3: return "qcl-Type";
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

      boolean cellPresent = buffer.decodeBit ("cellPresent");
      boolean bwp_IdPresent = buffer.decodeBit ("bwp_IdPresent");

      // decode cell

      if (cellPresent) {
         buffer.getContext().eventDispatcher.startElement("cell", -1);

         cell = new ServCellIndex();
         cell.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cell", -1);
      }
      else {
         cell = null;
      }

      // decode bwp_Id

      if (bwp_IdPresent) {
         buffer.getContext().eventDispatcher.startElement("bwp_Id", -1);

         bwp_Id = new BWP_Id();
         bwp_Id.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bwp_Id", -1);
      }
      else {
         bwp_Id = null;
      }

      // decode referenceSignal

      buffer.getContext().eventDispatcher.startElement("referenceSignal", -1);

      referenceSignal = new QCL_Info_referenceSignal();
      referenceSignal.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("referenceSignal", -1);

      // decode qcl_Type

      buffer.getContext().eventDispatcher.startElement("qcl_Type", -1);

      {
         int tval = QCL_Info_qcl_Type.decodeEnumValue (buffer);
         qcl_Type = QCL_Info_qcl_Type.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("qcl_Type", -1);

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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((cell != null), null);
      buffer.encodeBit ((bwp_Id != null), null);

      // encode cell

      if (cell != null) {
         buffer.getContext().eventDispatcher.startElement("cell", -1);

         cell.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cell", -1);
      }

      // encode bwp_Id

      if (bwp_Id != null) {
         buffer.getContext().eventDispatcher.startElement("bwp_Id", -1);

         bwp_Id.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bwp_Id", -1);
      }

      // encode referenceSignal

      if (referenceSignal != null) {
         buffer.getContext().eventDispatcher.startElement("referenceSignal", -1);

         referenceSignal.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("referenceSignal", -1);
      }
      else throw new Asn1MissingRequiredException ("referenceSignal");

      // encode qcl_Type

      if (qcl_Type != null) {
         buffer.getContext().eventDispatcher.startElement("qcl_Type", -1);

         qcl_Type.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("qcl_Type", -1);
      }
      else throw new Asn1MissingRequiredException ("qcl_Type");

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cell != null) cell.print (_sb, "cell", _level+1);
      if (bwp_Id != null) bwp_Id.print (_sb, "bwp_Id", _level+1);
      if (referenceSignal != null) referenceSignal.print (_sb, "referenceSignal", _level+1);
      if (qcl_Type != null) qcl_Type.print (_sb, "qcl_Type", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
