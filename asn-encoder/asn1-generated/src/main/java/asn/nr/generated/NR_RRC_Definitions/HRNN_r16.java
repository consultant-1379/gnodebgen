/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class HRNN_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HRNN-r16";
   }

   public Asn1OctetString hrnn_r16;  // optional

   public HRNN_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HRNN_r16 (
      Asn1OctetString hrnn_r16_
   ) {
      super();
      hrnn_r16 = hrnn_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public HRNN_r16 (byte[] hrnn_r16_
   ) {
      super();
      hrnn_r16 = new Asn1OctetString (hrnn_r16_);
   }

   public void init () {
      hrnn_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return hrnn_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "hrnn-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean hrnn_r16Present = buffer.decodeBit ("hrnn_r16Present");

      // decode hrnn_r16

      if (hrnn_r16Present) {
         buffer.getContext().eventDispatcher.startElement("hrnn_r16", -1);

         hrnn_r16 = new Asn1OctetString();
         hrnn_r16.decode (buffer, 1, 48);

         buffer.invokeCharacters(hrnn_r16.toString());
         buffer.getContext().eventDispatcher.endElement("hrnn_r16", -1);
      }
      else {
         hrnn_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((hrnn_r16 != null), null);

      // encode hrnn_r16

      if (hrnn_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("hrnn_r16", -1);

         hrnn_r16.encode (buffer, 1, 48);

         buffer.getContext().eventDispatcher.endElement("hrnn_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (hrnn_r16 != null) hrnn_r16.print (_sb, "hrnn_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
