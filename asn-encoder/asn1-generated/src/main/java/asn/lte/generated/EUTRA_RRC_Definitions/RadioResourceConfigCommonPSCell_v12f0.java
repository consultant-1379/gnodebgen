/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RadioResourceConfigCommonPSCell_v12f0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RadioResourceConfigCommonPSCell-v12f0";
   }

   public RadioResourceConfigCommonSCell_v10l0 basicFields_v12f0;

   public RadioResourceConfigCommonPSCell_v12f0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RadioResourceConfigCommonPSCell_v12f0 (
      RadioResourceConfigCommonSCell_v10l0 basicFields_v12f0_
   ) {
      super();
      basicFields_v12f0 = basicFields_v12f0_;
   }

   public void init () {
      basicFields_v12f0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return basicFields_v12f0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "basicFields-v12f0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode basicFields_v12f0

      buffer.getContext().eventDispatcher.startElement("basicFields_v12f0", -1);

      basicFields_v12f0 = new RadioResourceConfigCommonSCell_v10l0();
      basicFields_v12f0.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("basicFields_v12f0", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (basicFields_v12f0 != null) basicFields_v12f0.print (_sb, "basicFields_v12f0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
