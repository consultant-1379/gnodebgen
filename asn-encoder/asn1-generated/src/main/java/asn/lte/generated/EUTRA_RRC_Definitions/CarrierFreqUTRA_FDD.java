/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqUTRA_FDD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierFreqUTRA-FDD";
   }

   public ARFCN_ValueUTRA carrierFreq;
   public CellReselectionPriority cellReselectionPriority;  // optional
   public ReselectionThreshold threshX_High;
   public ReselectionThreshold threshX_Low;
   public Asn1Integer q_RxLevMin;
   public Asn1Integer p_MaxUTRA;
   public Asn1Integer q_QualMin;
   public boolean mV2ExtPresent;
   public CarrierFreqUTRA_FDD_threshX_Q_r9 threshX_Q_r9;  // optional
   public Asn1OpenExt extElem1;

   public CarrierFreqUTRA_FDD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqUTRA_FDD (
      ARFCN_ValueUTRA carrierFreq_,
      CellReselectionPriority cellReselectionPriority_,
      ReselectionThreshold threshX_High_,
      ReselectionThreshold threshX_Low_,
      Asn1Integer q_RxLevMin_,
      Asn1Integer p_MaxUTRA_,
      Asn1Integer q_QualMin_,
      CarrierFreqUTRA_FDD_threshX_Q_r9 threshX_Q_r9_
   ) {
      super();
      carrierFreq = carrierFreq_;
      cellReselectionPriority = cellReselectionPriority_;
      threshX_High = threshX_High_;
      threshX_Low = threshX_Low_;
      q_RxLevMin = q_RxLevMin_;
      p_MaxUTRA = p_MaxUTRA_;
      q_QualMin = q_QualMin_;
      threshX_Q_r9 = threshX_Q_r9_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CarrierFreqUTRA_FDD (
      ARFCN_ValueUTRA carrierFreq_,
      ReselectionThreshold threshX_High_,
      ReselectionThreshold threshX_Low_,
      Asn1Integer q_RxLevMin_,
      Asn1Integer p_MaxUTRA_,
      Asn1Integer q_QualMin_
   ) {
      super();
      carrierFreq = carrierFreq_;
      threshX_High = threshX_High_;
      threshX_Low = threshX_Low_;
      q_RxLevMin = q_RxLevMin_;
      p_MaxUTRA = p_MaxUTRA_;
      q_QualMin = q_QualMin_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CarrierFreqUTRA_FDD (long carrierFreq_,
      long cellReselectionPriority_,
      long threshX_High_,
      long threshX_Low_,
      long q_RxLevMin_,
      long p_MaxUTRA_,
      long q_QualMin_,
      CarrierFreqUTRA_FDD_threshX_Q_r9 threshX_Q_r9_
   ) {
      super();
      carrierFreq = new ARFCN_ValueUTRA (carrierFreq_);
      cellReselectionPriority = new CellReselectionPriority (cellReselectionPriority_);
      threshX_High = new ReselectionThreshold (threshX_High_);
      threshX_Low = new ReselectionThreshold (threshX_Low_);
      q_RxLevMin = new Asn1Integer (q_RxLevMin_);
      p_MaxUTRA = new Asn1Integer (p_MaxUTRA_);
      q_QualMin = new Asn1Integer (q_QualMin_);
      threshX_Q_r9 = threshX_Q_r9_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CarrierFreqUTRA_FDD (
      long carrierFreq_,
      long threshX_High_,
      long threshX_Low_,
      long q_RxLevMin_,
      long p_MaxUTRA_,
      long q_QualMin_
   ) {
      super();
      carrierFreq = new ARFCN_ValueUTRA (carrierFreq_);
      threshX_High = new ReselectionThreshold (threshX_High_);
      threshX_Low = new ReselectionThreshold (threshX_Low_);
      q_RxLevMin = new Asn1Integer (q_RxLevMin_);
      p_MaxUTRA = new Asn1Integer (p_MaxUTRA_);
      q_QualMin = new Asn1Integer (q_QualMin_);
   }

   public void init () {
      carrierFreq = null;
      cellReselectionPriority = null;
      threshX_High = null;
      threshX_Low = null;
      q_RxLevMin = null;
      p_MaxUTRA = null;
      q_QualMin = null;
      threshX_Q_r9 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq;
         case 1: return cellReselectionPriority;
         case 2: return threshX_High;
         case 3: return threshX_Low;
         case 4: return q_RxLevMin;
         case 5: return p_MaxUTRA;
         case 6: return q_QualMin;
         case 7: return threshX_Q_r9;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq";
         case 1: return "cellReselectionPriority";
         case 2: return "threshX-High";
         case 3: return "threshX-Low";
         case 4: return "q-RxLevMin";
         case 5: return "p-MaxUTRA";
         case 6: return "q-QualMin";
         case 7: return "threshX-Q-r9";
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

      boolean cellReselectionPriorityPresent = buffer.decodeBit ("cellReselectionPriorityPresent");

      // decode carrierFreq

      buffer.getContext().eventDispatcher.startElement("carrierFreq", -1);

      carrierFreq = new ARFCN_ValueUTRA();
      carrierFreq.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq", -1);

      // decode cellReselectionPriority

      if (cellReselectionPriorityPresent) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionPriority", -1);

         cellReselectionPriority = new CellReselectionPriority();
         cellReselectionPriority.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellReselectionPriority", -1);
      }
      else {
         cellReselectionPriority = null;
      }

      // decode threshX_High

      buffer.getContext().eventDispatcher.startElement("threshX_High", -1);

      threshX_High = new ReselectionThreshold();
      threshX_High.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_High", -1);

      // decode threshX_Low

      buffer.getContext().eventDispatcher.startElement("threshX_Low", -1);

      threshX_Low = new ReselectionThreshold();
      threshX_Low.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_Low", -1);

      // decode q_RxLevMin

      buffer.getContext().eventDispatcher.startElement("q_RxLevMin", -1);

      q_RxLevMin = new Asn1Integer();
      q_RxLevMin.decode (buffer, -60, -13);

      buffer.invokeCharacters(q_RxLevMin.toString());
      buffer.getContext().eventDispatcher.endElement("q_RxLevMin", -1);

      // decode p_MaxUTRA

      buffer.getContext().eventDispatcher.startElement("p_MaxUTRA", -1);

      p_MaxUTRA = new Asn1Integer();
      p_MaxUTRA.decode (buffer, -50, 33);

      buffer.invokeCharacters(p_MaxUTRA.toString());
      buffer.getContext().eventDispatcher.endElement("p_MaxUTRA", -1);

      // decode q_QualMin

      buffer.getContext().eventDispatcher.startElement("q_QualMin", -1);

      q_QualMin = new Asn1Integer();
      q_QualMin.decode (buffer, -24, 0);

      buffer.invokeCharacters(q_QualMin.toString());
      buffer.getContext().eventDispatcher.endElement("q_QualMin", -1);

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

            boolean threshX_Q_r9Present = buffer.decodeBit ("threshX_Q_r9Present");

            // decode threshX_Q_r9

            if (threshX_Q_r9Present) {
               buffer.getContext().eventDispatcher.startElement("threshX_Q_r9", -1);

               threshX_Q_r9 = new CarrierFreqUTRA_FDD_threshX_Q_r9();
               threshX_Q_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("threshX_Q_r9", -1);
            }
            else {
               threshX_Q_r9 = null;
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
      if (carrierFreq != null) carrierFreq.print (_sb, "carrierFreq", _level+1);
      if (cellReselectionPriority != null) cellReselectionPriority.print (_sb, "cellReselectionPriority", _level+1);
      if (threshX_High != null) threshX_High.print (_sb, "threshX_High", _level+1);
      if (threshX_Low != null) threshX_Low.print (_sb, "threshX_Low", _level+1);
      if (q_RxLevMin != null) q_RxLevMin.print (_sb, "q_RxLevMin", _level+1);
      if (p_MaxUTRA != null) p_MaxUTRA.print (_sb, "p_MaxUTRA", _level+1);
      if (q_QualMin != null) q_QualMin.print (_sb, "q_QualMin", _level+1);
      if (threshX_Q_r9 != null) threshX_Q_r9.print (_sb, "threshX_Q_r9", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
