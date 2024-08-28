/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_CBR_PSSCH_TxConfig_r14;

public class SL_CBR_PreconfigTxConfigList_r14_sl_CBR_PSSCH_TxConfigList_r14 extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE OF";
   }

   public SL_CBR_PSSCH_TxConfig_r14[] elements;

   public SL_CBR_PreconfigTxConfigList_r14_sl_CBR_PSSCH_TxConfigList_r14 () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public SL_CBR_PreconfigTxConfigList_r14_sl_CBR_PSSCH_TxConfigList_r14 (int numRecords) {
      elements = new SL_CBR_PSSCH_TxConfig_r14 [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public SL_CBR_PreconfigTxConfigList_r14_sl_CBR_PSSCH_TxConfigList_r14 (SL_CBR_PSSCH_TxConfig_r14[] elements_) {
      elements = elements_;
   }

   /** Returns the number of elements in the SEQUENCE OF. */
   public int getLength() {
      return elements.length;
   }

   public Asn1Type[] getElementValues() { return elements; }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // decode length determinant

      buffer.setSizeConstraint (1, 128);
      int numElements = (int) buffer.decodeLength();

      elements = new SL_CBR_PSSCH_TxConfig_r14 [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new SL_CBR_PSSCH_TxConfig_r14();
         elements[i].decode (buffer);

         buffer.getContext().eventDispatcher.endElement("elements", i);

      }

   }

   public void decodeContent (Asn1PerDecodeBuffer buffer, long numElements)
      throws Asn1Exception, java.io.IOException
   {
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      if (elements != null) {
         for (int i = 0; i < elements.length; i++) {
            String name = _varName + " [" + i + "]";
            elements[i].print (_sb, name, _level);
         }
      }
   }

}
