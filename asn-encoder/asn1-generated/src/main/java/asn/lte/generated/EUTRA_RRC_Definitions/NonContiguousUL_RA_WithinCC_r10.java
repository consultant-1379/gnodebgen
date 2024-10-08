/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NonContiguousUL_RA_WithinCC_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NonContiguousUL-RA-WithinCC-r10";
   }

   public NonContiguousUL_RA_WithinCC_r10_nonContiguousUL_RA_WithinCC_Info_r10 nonContiguousUL_RA_WithinCC_Info_r10 = null;  // optional

   public NonContiguousUL_RA_WithinCC_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NonContiguousUL_RA_WithinCC_r10 (
      NonContiguousUL_RA_WithinCC_r10_nonContiguousUL_RA_WithinCC_Info_r10 nonContiguousUL_RA_WithinCC_Info_r10_
   ) {
      super();
      nonContiguousUL_RA_WithinCC_Info_r10 = nonContiguousUL_RA_WithinCC_Info_r10_;
   }

   public void init () {
      nonContiguousUL_RA_WithinCC_Info_r10 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nonContiguousUL_RA_WithinCC_Info_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nonContiguousUL-RA-WithinCC-Info-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonContiguousUL_RA_WithinCC_Info_r10Present = buffer.decodeBit ("nonContiguousUL_RA_WithinCC_Info_r10Present");

      // decode nonContiguousUL_RA_WithinCC_Info_r10

      if (nonContiguousUL_RA_WithinCC_Info_r10Present) {
         buffer.getContext().eventDispatcher.startElement("nonContiguousUL_RA_WithinCC_Info_r10", -1);

         int tval = NonContiguousUL_RA_WithinCC_r10_nonContiguousUL_RA_WithinCC_Info_r10.decodeEnumValue (buffer);
         nonContiguousUL_RA_WithinCC_Info_r10 = NonContiguousUL_RA_WithinCC_r10_nonContiguousUL_RA_WithinCC_Info_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nonContiguousUL_RA_WithinCC_Info_r10", -1);
      }
      else {
         nonContiguousUL_RA_WithinCC_Info_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (nonContiguousUL_RA_WithinCC_Info_r10 != null) nonContiguousUL_RA_WithinCC_Info_r10.print (_sb, "nonContiguousUL_RA_WithinCC_Info_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
