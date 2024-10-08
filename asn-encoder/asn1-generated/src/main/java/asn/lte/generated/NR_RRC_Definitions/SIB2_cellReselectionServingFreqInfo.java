/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB2_cellReselectionServingFreqInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ReselectionThreshold s_NonIntraSearchP;  // optional
   public ReselectionThresholdQ s_NonIntraSearchQ;  // optional
   public ReselectionThreshold threshServingLowP;
   public ReselectionThresholdQ threshServingLowQ;  // optional
   public CellReselectionPriority cellReselectionPriority;
   public CellReselectionSubPriority cellReselectionSubPriority = null;  // optional
   public Asn1OpenExt extElem1;

   public SIB2_cellReselectionServingFreqInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SIB2_cellReselectionServingFreqInfo (
      ReselectionThreshold s_NonIntraSearchP_,
      ReselectionThresholdQ s_NonIntraSearchQ_,
      ReselectionThreshold threshServingLowP_,
      ReselectionThresholdQ threshServingLowQ_,
      CellReselectionPriority cellReselectionPriority_,
      CellReselectionSubPriority cellReselectionSubPriority_
   ) {
      super();
      s_NonIntraSearchP = s_NonIntraSearchP_;
      s_NonIntraSearchQ = s_NonIntraSearchQ_;
      threshServingLowP = threshServingLowP_;
      threshServingLowQ = threshServingLowQ_;
      cellReselectionPriority = cellReselectionPriority_;
      cellReselectionSubPriority = cellReselectionSubPriority_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SIB2_cellReselectionServingFreqInfo (
      ReselectionThreshold threshServingLowP_,
      CellReselectionPriority cellReselectionPriority_
   ) {
      super();
      threshServingLowP = threshServingLowP_;
      cellReselectionPriority = cellReselectionPriority_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SIB2_cellReselectionServingFreqInfo (long s_NonIntraSearchP_,
      long s_NonIntraSearchQ_,
      long threshServingLowP_,
      long threshServingLowQ_,
      long cellReselectionPriority_,
      CellReselectionSubPriority cellReselectionSubPriority_
   ) {
      super();
      s_NonIntraSearchP = new ReselectionThreshold (s_NonIntraSearchP_);
      s_NonIntraSearchQ = new ReselectionThresholdQ (s_NonIntraSearchQ_);
      threshServingLowP = new ReselectionThreshold (threshServingLowP_);
      threshServingLowQ = new ReselectionThresholdQ (threshServingLowQ_);
      cellReselectionPriority = new CellReselectionPriority (cellReselectionPriority_);
      cellReselectionSubPriority = cellReselectionSubPriority_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SIB2_cellReselectionServingFreqInfo (
      long threshServingLowP_,
      long cellReselectionPriority_
   ) {
      super();
      threshServingLowP = new ReselectionThreshold (threshServingLowP_);
      cellReselectionPriority = new CellReselectionPriority (cellReselectionPriority_);
   }

   public void init () {
      s_NonIntraSearchP = null;
      s_NonIntraSearchQ = null;
      threshServingLowP = null;
      threshServingLowQ = null;
      cellReselectionPriority = null;
      cellReselectionSubPriority = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return s_NonIntraSearchP;
         case 1: return s_NonIntraSearchQ;
         case 2: return threshServingLowP;
         case 3: return threshServingLowQ;
         case 4: return cellReselectionPriority;
         case 5: return cellReselectionSubPriority;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "s-NonIntraSearchP";
         case 1: return "s-NonIntraSearchQ";
         case 2: return "threshServingLowP";
         case 3: return "threshServingLowQ";
         case 4: return "cellReselectionPriority";
         case 5: return "cellReselectionSubPriority";
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

      boolean s_NonIntraSearchPPresent = buffer.decodeBit ("s_NonIntraSearchPPresent");
      boolean s_NonIntraSearchQPresent = buffer.decodeBit ("s_NonIntraSearchQPresent");
      boolean threshServingLowQPresent = buffer.decodeBit ("threshServingLowQPresent");
      boolean cellReselectionSubPriorityPresent = buffer.decodeBit ("cellReselectionSubPriorityPresent");

      // decode s_NonIntraSearchP

      if (s_NonIntraSearchPPresent) {
         buffer.getContext().eventDispatcher.startElement("s_NonIntraSearchP", -1);

         s_NonIntraSearchP = new ReselectionThreshold();
         s_NonIntraSearchP.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("s_NonIntraSearchP", -1);
      }
      else {
         s_NonIntraSearchP = null;
      }

      // decode s_NonIntraSearchQ

      if (s_NonIntraSearchQPresent) {
         buffer.getContext().eventDispatcher.startElement("s_NonIntraSearchQ", -1);

         s_NonIntraSearchQ = new ReselectionThresholdQ();
         s_NonIntraSearchQ.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("s_NonIntraSearchQ", -1);
      }
      else {
         s_NonIntraSearchQ = null;
      }

      // decode threshServingLowP

      buffer.getContext().eventDispatcher.startElement("threshServingLowP", -1);

      threshServingLowP = new ReselectionThreshold();
      threshServingLowP.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshServingLowP", -1);

      // decode threshServingLowQ

      if (threshServingLowQPresent) {
         buffer.getContext().eventDispatcher.startElement("threshServingLowQ", -1);

         threshServingLowQ = new ReselectionThresholdQ();
         threshServingLowQ.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("threshServingLowQ", -1);
      }
      else {
         threshServingLowQ = null;
      }

      // decode cellReselectionPriority

      buffer.getContext().eventDispatcher.startElement("cellReselectionPriority", -1);

      cellReselectionPriority = new CellReselectionPriority();
      cellReselectionPriority.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionPriority", -1);

      // decode cellReselectionSubPriority

      if (cellReselectionSubPriorityPresent) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionSubPriority", -1);

         int tval = CellReselectionSubPriority.decodeEnumValue (buffer);
         cellReselectionSubPriority = CellReselectionSubPriority.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cellReselectionSubPriority", -1);
      }
      else {
         cellReselectionSubPriority = null;
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
      if (s_NonIntraSearchP != null) s_NonIntraSearchP.print (_sb, "s_NonIntraSearchP", _level+1);
      if (s_NonIntraSearchQ != null) s_NonIntraSearchQ.print (_sb, "s_NonIntraSearchQ", _level+1);
      if (threshServingLowP != null) threshServingLowP.print (_sb, "threshServingLowP", _level+1);
      if (threshServingLowQ != null) threshServingLowQ.print (_sb, "threshServingLowQ", _level+1);
      if (cellReselectionPriority != null) cellReselectionPriority.print (_sb, "cellReselectionPriority", _level+1);
      if (cellReselectionSubPriority != null) cellReselectionSubPriority.print (_sb, "cellReselectionSubPriority", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
