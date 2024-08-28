/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_TRPT_Subset_r12 extends Asn1BitString {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-TRPT-Subset-r12";
   }

   /**
    * This constructor creates an empty bit string that can be used in 
    * a decode method call to receive a bit string value.
    */
   public SL_TRPT_Subset_r12 () {
      super();
      value = new byte [1];
   }

   /**
    * This constructor initializes the bit string value with the 
    * given bytes, using all 8 bits of every byte.
    *
    * @param data       Binary bit string contents
    */
   public SL_TRPT_Subset_r12 (byte[] data) {
      this( data.length * 8, data);
   }

   /**
    * This constructor initializes the bit string value with the 
    * given number of bits and data.
    *
    * @param numbits_   Number of bits
    * @param data       Binary bit string contents
    */
   public SL_TRPT_Subset_r12 (int numbits_, byte[] data) {
      super (numbits_, data);
   }

   /**
    * This constructor initializes the bit string value from the given 
    * boolean array.  Each array position corresponds to a bit in the 
    * bit string.
    *
    * @param bitValues  The boolean array
    */
   public SL_TRPT_Subset_r12 (boolean[] bitValues) {
      super (bitValues);
   }

   /**
    * This constructor parses the given ASN.1 value text (either a 
    * binary or hex data string) and assigns the values to the internal
    * bit string.
    *
    * Examples of valid value formats are as follows:
    * Binary string:    "'11010010111001'B"
    * Hex string:       "'0fa56920014abc'H"
    *
    */
   public SL_TRPT_Subset_r12 (String value_) throws Asn1ValueParseException {
      super (value_);
   }

   /**
    * This constructor initializes the bit string value from the given 
    * BitSet object.  The logical length of the BitSet is used 
    * (i.e. position of last set bit).
    *
    * @param bitSet  Java BitSet object
    */
   public SL_TRPT_Subset_r12 (java.util.BitSet bitSet) {
      super (bitSet);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer, 3, 5);

      buffer.invokeCharacters (toString());
   }

}
