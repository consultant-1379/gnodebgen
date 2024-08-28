/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.SRS_ResourceId;

public class SRS_RSRP_TriggeredList_r16 extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-RSRP-TriggeredList-r16";
   }

   public SRS_ResourceId[] elements;

   public SRS_RSRP_TriggeredList_r16 () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public SRS_RSRP_TriggeredList_r16 (int numRecords) {
      elements = new SRS_ResourceId [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public SRS_RSRP_TriggeredList_r16 (SRS_ResourceId[] elements_) {
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

      buffer.setSizeConstraint (1, 32);
      int numElements = (int) buffer.decodeLength();

      elements = new SRS_ResourceId [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new SRS_ResourceId();
         elements[i].decode (buffer);

         buffer.getContext().eventDispatcher.endElement("elements", i);

      }

   }

   public void decodeContent (Asn1PerDecodeBuffer buffer, long numElements)
      throws Asn1Exception, java.io.IOException
   {
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode length determinant

      buffer.encodeLength (elements.length, 1, 32);

      // encode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("element", i);

         elements[i].encode (buffer);

         buffer.getContext().eventDispatcher.endElement("element", i);
      }
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
