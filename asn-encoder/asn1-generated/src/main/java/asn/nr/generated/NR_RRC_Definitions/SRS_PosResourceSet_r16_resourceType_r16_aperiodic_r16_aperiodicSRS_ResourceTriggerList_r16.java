/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_PosResourceSet_r16_resourceType_r16_aperiodic_r16_aperiodicSRS_ResourceTriggerList_r16 extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE OF";
   }

   public Asn1Integer[] elements;

   public SRS_PosResourceSet_r16_resourceType_r16_aperiodic_r16_aperiodicSRS_ResourceTriggerList_r16 () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public SRS_PosResourceSet_r16_resourceType_r16_aperiodic_r16_aperiodicSRS_ResourceTriggerList_r16 (int numRecords) {
      elements = new Asn1Integer [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public SRS_PosResourceSet_r16_resourceType_r16_aperiodic_r16_aperiodicSRS_ResourceTriggerList_r16 (Asn1Integer[] elements_) {
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

      buffer.setSizeConstraint (1, 3);
      int numElements = (int) buffer.decodeLength();

      elements = new Asn1Integer [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new Asn1Integer();
         elements[i].decode (buffer, 1, 3);

         buffer.invokeCharacters (elements[i].toString());
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

      buffer.encodeLength (elements.length, 1, 3);

      // encode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("element", i);

         elements[i].encode (buffer, 1, 3);

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
