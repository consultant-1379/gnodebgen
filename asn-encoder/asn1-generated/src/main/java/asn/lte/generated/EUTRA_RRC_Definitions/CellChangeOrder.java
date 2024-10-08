/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellChangeOrder extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellChangeOrder";
   }

   public CellChangeOrder_t304 t304 = null;
   public CellChangeOrder_targetRAT_Type targetRAT_Type;

   public CellChangeOrder () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellChangeOrder (
      CellChangeOrder_t304 t304_,
      CellChangeOrder_targetRAT_Type targetRAT_Type_
   ) {
      super();
      t304 = t304_;
      targetRAT_Type = targetRAT_Type_;
   }

   public void init () {
      t304 = null;
      targetRAT_Type = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return t304;
         case 1: return targetRAT_Type;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "t304";
         case 1: return "targetRAT-Type";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode t304

      buffer.getContext().eventDispatcher.startElement("t304", -1);

      {
         int tval = CellChangeOrder_t304.decodeEnumValue (buffer);
         t304 = CellChangeOrder_t304.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t304", -1);

      // decode targetRAT_Type

      buffer.getContext().eventDispatcher.startElement("targetRAT_Type", -1);

      targetRAT_Type = new CellChangeOrder_targetRAT_Type();
      targetRAT_Type.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("targetRAT_Type", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (t304 != null) t304.print (_sb, "t304", _level+1);
      if (targetRAT_Type != null) targetRAT_Type.print (_sb, "targetRAT_Type", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
