/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class OldBSS_ToNewBSS_Information extends Asn1OctetString {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "OldBSS-ToNewBSS-Information";
   }

   public OldBSS_ToNewBSS_Information () {
      super();
   }

   /**
    * This constructor initializes an octet string from the given 
    * byte array by setting the 'value' public member variable in the 
    * base class to the given value.
    *
    * @param data  Byte array containing an octet string 
    *              in binary form.
    */
   public OldBSS_ToNewBSS_Information (byte[] data) {
      super (data);
   }

   /**
    * This constructor initializes an octet string from a portion 
    * of the given byte array.  A new byte array is created starting 
    * at the given offset and consisting of the given number of bytes.
    *
    * @param data       Byte array containing an octet string 
    *                   in binary form.
    * @param offset     Starting offset in data from which to copy bytes
    * @param nbytes     Number of bytes to copy from target array
    */
   public OldBSS_ToNewBSS_Information (byte[] data, int offset, int nbytes) {
      super (data, offset, nbytes);
   }

   /**
    * This constructor parses the given ASN.1 value text (either a 
    * binary or hex data string) and assigns the values to the internal
    * bit string.
    *
    * Examples of valid value formats are as follows:
    * Binary string:    "'11010010111001'B"
    * Hex string:       "'0fa56920014abc'H"
    * Char string:      "'abcdefg'"
    *
    * Note: if the text contains no internal single-quote
    * marks ('), it is assumed to be a character string.
    *
    * @param value_     The ASN.1 value specification text
    */
   public OldBSS_ToNewBSS_Information (String value_) throws Asn1ValueParseException {
      super (value_);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      super.decode (buffer);

      buffer.invokeCharacters (toString());
   }

}
