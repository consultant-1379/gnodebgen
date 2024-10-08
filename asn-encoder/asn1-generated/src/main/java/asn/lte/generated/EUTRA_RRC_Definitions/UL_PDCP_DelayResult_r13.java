/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_PDCP_DelayResult_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UL-PDCP-DelayResult-r13";
   }

   public UL_PDCP_DelayResult_r13_qci_Id_r13 qci_Id_r13 = null;
   public Asn1Integer excessDelay_r13;
   public Asn1OpenExt extElem1;

   public UL_PDCP_DelayResult_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UL_PDCP_DelayResult_r13 (
      UL_PDCP_DelayResult_r13_qci_Id_r13 qci_Id_r13_,
      Asn1Integer excessDelay_r13_
   ) {
      super();
      qci_Id_r13 = qci_Id_r13_;
      excessDelay_r13 = excessDelay_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UL_PDCP_DelayResult_r13 (UL_PDCP_DelayResult_r13_qci_Id_r13 qci_Id_r13_,
      long excessDelay_r13_
   ) {
      super();
      qci_Id_r13 = qci_Id_r13_;
      excessDelay_r13 = new Asn1Integer (excessDelay_r13_);
   }

   public void init () {
      qci_Id_r13 = null;
      excessDelay_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return qci_Id_r13;
         case 1: return excessDelay_r13;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "qci-Id-r13";
         case 1: return "excessDelay-r13";
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

      // decode qci_Id_r13

      buffer.getContext().eventDispatcher.startElement("qci_Id_r13", -1);

      {
         int tval = UL_PDCP_DelayResult_r13_qci_Id_r13.decodeEnumValue (buffer);
         qci_Id_r13 = UL_PDCP_DelayResult_r13_qci_Id_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("qci_Id_r13", -1);

      // decode excessDelay_r13

      buffer.getContext().eventDispatcher.startElement("excessDelay_r13", -1);

      excessDelay_r13 = new Asn1Integer();
      excessDelay_r13.decode (buffer, 0, 31);

      buffer.invokeCharacters(excessDelay_r13.toString());
      buffer.getContext().eventDispatcher.endElement("excessDelay_r13", -1);

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
      if (qci_Id_r13 != null) qci_Id_r13.print (_sb, "qci_Id_r13", _level+1);
      if (excessDelay_r13 != null) excessDelay_r13.print (_sb, "excessDelay_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
