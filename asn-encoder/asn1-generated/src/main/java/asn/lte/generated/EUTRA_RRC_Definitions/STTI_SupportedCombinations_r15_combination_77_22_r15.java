/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class STTI_SupportedCombinations_r15_combination_77_22_r15 extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE OF";
   }

   public DL_UL_CCs_r15[] elements;

   public STTI_SupportedCombinations_r15_combination_77_22_r15 () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public STTI_SupportedCombinations_r15_combination_77_22_r15 (int numRecords) {
      elements = new DL_UL_CCs_r15 [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public STTI_SupportedCombinations_r15_combination_77_22_r15 (DL_UL_CCs_r15[] elements_) {
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

      buffer.setSizeConstraint (1, 2);
      int numElements = (int) buffer.decodeLength();

      elements = new DL_UL_CCs_r15 [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new DL_UL_CCs_r15();
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
