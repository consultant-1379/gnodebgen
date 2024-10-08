/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QuantityConfigNR extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QuantityConfigNR";
   }

   public QuantityConfigRS quantityConfigCell;
   public QuantityConfigRS quantityConfigRS_Index;  // optional

   public QuantityConfigNR () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QuantityConfigNR (
      QuantityConfigRS quantityConfigCell_,
      QuantityConfigRS quantityConfigRS_Index_
   ) {
      super();
      quantityConfigCell = quantityConfigCell_;
      quantityConfigRS_Index = quantityConfigRS_Index_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public QuantityConfigNR (
      QuantityConfigRS quantityConfigCell_
   ) {
      super();
      quantityConfigCell = quantityConfigCell_;
   }

   public void init () {
      quantityConfigCell = null;
      quantityConfigRS_Index = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return quantityConfigCell;
         case 1: return quantityConfigRS_Index;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "quantityConfigCell";
         case 1: return "quantityConfigRS-Index";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean quantityConfigRS_IndexPresent = buffer.decodeBit ("quantityConfigRS_IndexPresent");

      // decode quantityConfigCell

      buffer.getContext().eventDispatcher.startElement("quantityConfigCell", -1);

      quantityConfigCell = new QuantityConfigRS();
      quantityConfigCell.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("quantityConfigCell", -1);

      // decode quantityConfigRS_Index

      if (quantityConfigRS_IndexPresent) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigRS_Index", -1);

         quantityConfigRS_Index = new QuantityConfigRS();
         quantityConfigRS_Index.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfigRS_Index", -1);
      }
      else {
         quantityConfigRS_Index = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((quantityConfigRS_Index != null), null);

      // encode quantityConfigCell

      if (quantityConfigCell != null) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigCell", -1);

         quantityConfigCell.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("quantityConfigCell", -1);
      }
      else throw new Asn1MissingRequiredException ("quantityConfigCell");

      // encode quantityConfigRS_Index

      if (quantityConfigRS_Index != null) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigRS_Index", -1);

         quantityConfigRS_Index.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("quantityConfigRS_Index", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (quantityConfigCell != null) quantityConfigCell.print (_sb, "quantityConfigCell", _level+1);
      if (quantityConfigRS_Index != null) quantityConfigRS_Index.print (_sb, "quantityConfigRS_Index", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
