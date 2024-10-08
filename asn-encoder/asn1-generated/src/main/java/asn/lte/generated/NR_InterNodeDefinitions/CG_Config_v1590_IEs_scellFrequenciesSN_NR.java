/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.ARFCN_ValueNR;

public class CG_Config_v1590_IEs_scellFrequenciesSN_NR extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE OF";
   }

   public ARFCN_ValueNR[] elements;

   public CG_Config_v1590_IEs_scellFrequenciesSN_NR () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public CG_Config_v1590_IEs_scellFrequenciesSN_NR (int numRecords) {
      elements = new ARFCN_ValueNR [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public CG_Config_v1590_IEs_scellFrequenciesSN_NR (ARFCN_ValueNR[] elements_) {
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

      buffer.setSizeConstraint (1, 31);
      int numElements = (int) buffer.decodeLength();

      elements = new ARFCN_ValueNR [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new ARFCN_ValueNR();
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
