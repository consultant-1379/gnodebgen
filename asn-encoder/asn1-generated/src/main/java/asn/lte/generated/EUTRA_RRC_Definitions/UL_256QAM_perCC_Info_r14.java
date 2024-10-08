/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_256QAM_perCC_Info_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UL-256QAM-perCC-Info-r14";
   }

   public UL_256QAM_perCC_Info_r14_ul_256QAM_perCC_r14 ul_256QAM_perCC_r14 = null;  // optional

   public UL_256QAM_perCC_Info_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UL_256QAM_perCC_Info_r14 (
      UL_256QAM_perCC_Info_r14_ul_256QAM_perCC_r14 ul_256QAM_perCC_r14_
   ) {
      super();
      ul_256QAM_perCC_r14 = ul_256QAM_perCC_r14_;
   }

   public void init () {
      ul_256QAM_perCC_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_256QAM_perCC_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-256QAM-perCC-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ul_256QAM_perCC_r14Present = buffer.decodeBit ("ul_256QAM_perCC_r14Present");

      // decode ul_256QAM_perCC_r14

      if (ul_256QAM_perCC_r14Present) {
         buffer.getContext().eventDispatcher.startElement("ul_256QAM_perCC_r14", -1);

         int tval = UL_256QAM_perCC_Info_r14_ul_256QAM_perCC_r14.decodeEnumValue (buffer);
         ul_256QAM_perCC_r14 = UL_256QAM_perCC_Info_r14_ul_256QAM_perCC_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_256QAM_perCC_r14", -1);
      }
      else {
         ul_256QAM_perCC_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_256QAM_perCC_r14 != null) ul_256QAM_perCC_r14.print (_sb, "ul_256QAM_perCC_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
