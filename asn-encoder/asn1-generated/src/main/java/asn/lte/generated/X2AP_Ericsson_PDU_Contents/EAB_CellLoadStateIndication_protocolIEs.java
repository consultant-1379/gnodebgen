/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_PDU_Contents;

import com.objsys.asn1j.runtime.*;

public class EAB_CellLoadStateIndication_protocolIEs extends Asn1SeqOf {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE OF";
   }

   public EAB_CellLoadStateIndication_protocolIEs_element[] elements;

   public EAB_CellLoadStateIndication_protocolIEs () {
      elements = null;
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given number of elements.  The element values must be manually 
    * populated.
    */
   public EAB_CellLoadStateIndication_protocolIEs (int numRecords) {
      elements = new EAB_CellLoadStateIndication_protocolIEs_element [numRecords];
   }

   /**
    * This constructor initializes the internal array to hold the 
    * given the array.  
    */
   public EAB_CellLoadStateIndication_protocolIEs (EAB_CellLoadStateIndication_protocolIEs_element[] elements_) {
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

      buffer.setSizeConstraint (0, 65535);
      int numElements = (int) buffer.decodeLength();

      elements = new EAB_CellLoadStateIndication_protocolIEs_element [numElements];

      // decode elements

      for (int i = 0; i < elements.length; i++) {
         buffer.getContext().eventDispatcher.startElement("elements", i);

         elements[i] = new EAB_CellLoadStateIndication_protocolIEs_element();
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
