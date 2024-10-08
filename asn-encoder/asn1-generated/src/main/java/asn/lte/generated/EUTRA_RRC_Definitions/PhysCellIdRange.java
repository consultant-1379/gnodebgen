/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysCellIdRange extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhysCellIdRange";
   }

   public PhysCellId start;
   public PhysCellIdRange_range range = null;  // optional

   public PhysCellIdRange () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysCellIdRange (
      PhysCellId start_,
      PhysCellIdRange_range range_
   ) {
      super();
      start = start_;
      range = range_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PhysCellIdRange (
      PhysCellId start_
   ) {
      super();
      start = start_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PhysCellIdRange (long start_,
      PhysCellIdRange_range range_
   ) {
      super();
      start = new PhysCellId (start_);
      range = range_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PhysCellIdRange (
      long start_
   ) {
      super();
      start = new PhysCellId (start_);
   }

   public void init () {
      start = null;
      range = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return start;
         case 1: return range;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "start";
         case 1: return "range";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rangePresent = buffer.decodeBit ("rangePresent");

      // decode start

      buffer.getContext().eventDispatcher.startElement("start", -1);

      start = new PhysCellId();
      start.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("start", -1);

      // decode range

      if (rangePresent) {
         buffer.getContext().eventDispatcher.startElement("range", -1);

         int tval = PhysCellIdRange_range.decodeEnumValue (buffer);
         range = PhysCellIdRange_range.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("range", -1);
      }
      else {
         range = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (start != null) start.print (_sb, "start", _level+1);
      if (range != null) range.print (_sb, "range", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
