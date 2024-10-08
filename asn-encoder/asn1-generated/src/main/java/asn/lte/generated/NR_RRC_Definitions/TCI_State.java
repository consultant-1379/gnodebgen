/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TCI_State extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TCI-State";
   }

   public TCI_StateId tci_StateId;
   public QCL_Info qcl_Type1;
   public QCL_Info qcl_Type2;  // optional
   public Asn1OpenExt extElem1;

   public TCI_State () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TCI_State (
      TCI_StateId tci_StateId_,
      QCL_Info qcl_Type1_,
      QCL_Info qcl_Type2_
   ) {
      super();
      tci_StateId = tci_StateId_;
      qcl_Type1 = qcl_Type1_;
      qcl_Type2 = qcl_Type2_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public TCI_State (
      TCI_StateId tci_StateId_,
      QCL_Info qcl_Type1_
   ) {
      super();
      tci_StateId = tci_StateId_;
      qcl_Type1 = qcl_Type1_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TCI_State (long tci_StateId_,
      QCL_Info qcl_Type1_,
      QCL_Info qcl_Type2_
   ) {
      super();
      tci_StateId = new TCI_StateId (tci_StateId_);
      qcl_Type1 = qcl_Type1_;
      qcl_Type2 = qcl_Type2_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public TCI_State (
      long tci_StateId_,
      QCL_Info qcl_Type1_
   ) {
      super();
      tci_StateId = new TCI_StateId (tci_StateId_);
      qcl_Type1 = qcl_Type1_;
   }

   public void init () {
      tci_StateId = null;
      qcl_Type1 = null;
      qcl_Type2 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tci_StateId;
         case 1: return qcl_Type1;
         case 2: return qcl_Type2;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tci-StateId";
         case 1: return "qcl-Type1";
         case 2: return "qcl-Type2";
         case 3: return null;
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

      boolean qcl_Type2Present = buffer.decodeBit ("qcl_Type2Present");

      // decode tci_StateId

      buffer.getContext().eventDispatcher.startElement("tci_StateId", -1);

      tci_StateId = new TCI_StateId();
      tci_StateId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("tci_StateId", -1);

      // decode qcl_Type1

      buffer.getContext().eventDispatcher.startElement("qcl_Type1", -1);

      qcl_Type1 = new QCL_Info();
      qcl_Type1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("qcl_Type1", -1);

      // decode qcl_Type2

      if (qcl_Type2Present) {
         buffer.getContext().eventDispatcher.startElement("qcl_Type2", -1);

         qcl_Type2 = new QCL_Info();
         qcl_Type2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("qcl_Type2", -1);
      }
      else {
         qcl_Type2 = null;
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
      if (tci_StateId != null) tci_StateId.print (_sb, "tci_StateId", _level+1);
      if (qcl_Type1 != null) qcl_Type1.print (_sb, "qcl_Type1", _level+1);
      if (qcl_Type2 != null) qcl_Type2.print (_sb, "qcl_Type2", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
