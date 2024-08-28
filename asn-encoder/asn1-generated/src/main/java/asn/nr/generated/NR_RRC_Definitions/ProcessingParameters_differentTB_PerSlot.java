/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ProcessingParameters_differentTB_PerSlot extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public NumberOfCarriers upto1;  // optional
   public NumberOfCarriers upto2;  // optional
   public NumberOfCarriers upto4;  // optional
   public NumberOfCarriers upto7;  // optional

   public ProcessingParameters_differentTB_PerSlot () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ProcessingParameters_differentTB_PerSlot (
      NumberOfCarriers upto1_,
      NumberOfCarriers upto2_,
      NumberOfCarriers upto4_,
      NumberOfCarriers upto7_
   ) {
      super();
      upto1 = upto1_;
      upto2 = upto2_;
      upto4 = upto4_;
      upto7 = upto7_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ProcessingParameters_differentTB_PerSlot (long upto1_,
      long upto2_,
      long upto4_,
      long upto7_
   ) {
      super();
      upto1 = new NumberOfCarriers (upto1_);
      upto2 = new NumberOfCarriers (upto2_);
      upto4 = new NumberOfCarriers (upto4_);
      upto7 = new NumberOfCarriers (upto7_);
   }

   public void init () {
      upto1 = null;
      upto2 = null;
      upto4 = null;
      upto7 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return upto1;
         case 1: return upto2;
         case 2: return upto4;
         case 3: return upto7;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "upto1";
         case 1: return "upto2";
         case 2: return "upto4";
         case 3: return "upto7";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean upto1Present = buffer.decodeBit ("upto1Present");
      boolean upto2Present = buffer.decodeBit ("upto2Present");
      boolean upto4Present = buffer.decodeBit ("upto4Present");
      boolean upto7Present = buffer.decodeBit ("upto7Present");

      // decode upto1

      if (upto1Present) {
         buffer.getContext().eventDispatcher.startElement("upto1", -1);

         upto1 = new NumberOfCarriers();
         upto1.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("upto1", -1);
      }
      else {
         upto1 = null;
      }

      // decode upto2

      if (upto2Present) {
         buffer.getContext().eventDispatcher.startElement("upto2", -1);

         upto2 = new NumberOfCarriers();
         upto2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("upto2", -1);
      }
      else {
         upto2 = null;
      }

      // decode upto4

      if (upto4Present) {
         buffer.getContext().eventDispatcher.startElement("upto4", -1);

         upto4 = new NumberOfCarriers();
         upto4.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("upto4", -1);
      }
      else {
         upto4 = null;
      }

      // decode upto7

      if (upto7Present) {
         buffer.getContext().eventDispatcher.startElement("upto7", -1);

         upto7 = new NumberOfCarriers();
         upto7.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("upto7", -1);
      }
      else {
         upto7 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((upto1 != null), null);
      buffer.encodeBit ((upto2 != null), null);
      buffer.encodeBit ((upto4 != null), null);
      buffer.encodeBit ((upto7 != null), null);

      // encode upto1

      if (upto1 != null) {
         buffer.getContext().eventDispatcher.startElement("upto1", -1);

         upto1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("upto1", -1);
      }

      // encode upto2

      if (upto2 != null) {
         buffer.getContext().eventDispatcher.startElement("upto2", -1);

         upto2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("upto2", -1);
      }

      // encode upto4

      if (upto4 != null) {
         buffer.getContext().eventDispatcher.startElement("upto4", -1);

         upto4.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("upto4", -1);
      }

      // encode upto7

      if (upto7 != null) {
         buffer.getContext().eventDispatcher.startElement("upto7", -1);

         upto7.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("upto7", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (upto1 != null) upto1.print (_sb, "upto1", _level+1);
      if (upto2 != null) upto2.print (_sb, "upto2", _level+1);
      if (upto4 != null) upto4.print (_sb, "upto4", _level+1);
      if (upto7 != null) upto7.print (_sb, "upto7", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
