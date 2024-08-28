/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCellToAddMod_v10l0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SCellToAddMod-v10l0";
   }

   public RadioResourceConfigCommonSCell_v10l0 radioResourceConfigCommonSCell_v10l0;  // optional

   public SCellToAddMod_v10l0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCellToAddMod_v10l0 (
      RadioResourceConfigCommonSCell_v10l0 radioResourceConfigCommonSCell_v10l0_
   ) {
      super();
      radioResourceConfigCommonSCell_v10l0 = radioResourceConfigCommonSCell_v10l0_;
   }

   public void init () {
      radioResourceConfigCommonSCell_v10l0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return radioResourceConfigCommonSCell_v10l0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "radioResourceConfigCommonSCell-v10l0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean radioResourceConfigCommonSCell_v10l0Present = buffer.decodeBit ("radioResourceConfigCommonSCell_v10l0Present");

      // decode radioResourceConfigCommonSCell_v10l0

      if (radioResourceConfigCommonSCell_v10l0Present) {
         buffer.getContext().eventDispatcher.startElement("radioResourceConfigCommonSCell_v10l0", -1);

         radioResourceConfigCommonSCell_v10l0 = new RadioResourceConfigCommonSCell_v10l0();
         radioResourceConfigCommonSCell_v10l0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("radioResourceConfigCommonSCell_v10l0", -1);
      }
      else {
         radioResourceConfigCommonSCell_v10l0 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (radioResourceConfigCommonSCell_v10l0 != null) radioResourceConfigCommonSCell_v10l0.print (_sb, "radioResourceConfigCommonSCell_v10l0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
