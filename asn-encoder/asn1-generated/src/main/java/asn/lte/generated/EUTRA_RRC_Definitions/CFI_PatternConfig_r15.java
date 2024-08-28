/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CFI_PatternConfig_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CFI-PatternConfig-r15";
   }

   public CFI_PatternConfig_r15_cfi_PatternSubframe_r15 cfi_PatternSubframe_r15;  // optional
   public CFI_PatternConfig_r15_cfi_PatternSlotSubslot_r15 cfi_PatternSlotSubslot_r15;  // optional

   public CFI_PatternConfig_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CFI_PatternConfig_r15 (
      CFI_PatternConfig_r15_cfi_PatternSubframe_r15 cfi_PatternSubframe_r15_,
      CFI_PatternConfig_r15_cfi_PatternSlotSubslot_r15 cfi_PatternSlotSubslot_r15_
   ) {
      super();
      cfi_PatternSubframe_r15 = cfi_PatternSubframe_r15_;
      cfi_PatternSlotSubslot_r15 = cfi_PatternSlotSubslot_r15_;
   }

   public void init () {
      cfi_PatternSubframe_r15 = null;
      cfi_PatternSlotSubslot_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cfi_PatternSubframe_r15;
         case 1: return cfi_PatternSlotSubslot_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cfi-PatternSubframe-r15";
         case 1: return "cfi-PatternSlotSubslot-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cfi_PatternSubframe_r15Present = buffer.decodeBit ("cfi_PatternSubframe_r15Present");
      boolean cfi_PatternSlotSubslot_r15Present = buffer.decodeBit ("cfi_PatternSlotSubslot_r15Present");

      // decode cfi_PatternSubframe_r15

      if (cfi_PatternSubframe_r15Present) {
         buffer.getContext().eventDispatcher.startElement("cfi_PatternSubframe_r15", -1);

         cfi_PatternSubframe_r15 = new CFI_PatternConfig_r15_cfi_PatternSubframe_r15();
         cfi_PatternSubframe_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cfi_PatternSubframe_r15", -1);
      }
      else {
         cfi_PatternSubframe_r15 = null;
      }

      // decode cfi_PatternSlotSubslot_r15

      if (cfi_PatternSlotSubslot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("cfi_PatternSlotSubslot_r15", -1);

         cfi_PatternSlotSubslot_r15 = new CFI_PatternConfig_r15_cfi_PatternSlotSubslot_r15();
         cfi_PatternSlotSubslot_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cfi_PatternSlotSubslot_r15", -1);
      }
      else {
         cfi_PatternSlotSubslot_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cfi_PatternSubframe_r15 != null) cfi_PatternSubframe_r15.print (_sb, "cfi_PatternSubframe_r15", _level+1);
      if (cfi_PatternSlotSubslot_r15 != null) cfi_PatternSlotSubslot_r15.print (_sb, "cfi_PatternSlotSubslot_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
