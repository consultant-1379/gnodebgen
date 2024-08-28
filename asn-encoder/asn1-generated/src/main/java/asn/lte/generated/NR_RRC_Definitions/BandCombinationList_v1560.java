/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandCombinationList_v1560 extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombinationList-v1560";
   }

   public BandCombination_v1560[] elements;

   public BandCombinationList_v1560 () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public BandCombinationList_v1560 (int numRecords) {
      elements = new BandCombination_v1560 [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public BandCombinationList_v1560 (BandCombination_v1560[] elements_) {
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
      int fraglen = 0;
      java.util.LinkedList<BandCombination_v1560> tmplist = 
         new java.util.LinkedList<BandCombination_v1560>();
      BandCombination_v1560 value;

      for (;;) {
         buffer.setSizeConstraint (1, 65536);
         fraglen = (int) buffer.decodeLength ();
         if (fraglen == 0) break;

         // decode elements
         for (int i = 0; i < fraglen; i++) {
            buffer.getContext().eventDispatcher.startElement("elements", i);

            value = new BandCombination_v1560();
            value.decode (buffer);

            buffer.getContext().eventDispatcher.endElement("elements", i);

            tmplist.add (value);
         }

         if (fraglen < 16384) break;
      }

      elements = new BandCombination_v1560 [tmplist.size()];
      tmplist.toArray (elements);
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
