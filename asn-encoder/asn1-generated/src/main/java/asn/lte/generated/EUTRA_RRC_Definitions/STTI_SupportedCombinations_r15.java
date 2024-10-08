/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class STTI_SupportedCombinations_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "STTI-SupportedCombinations-r15";
   }

   public DL_UL_CCs_r15 combination_22_r15;  // optional
   public DL_UL_CCs_r15 combination_77_r15;  // optional
   public DL_UL_CCs_r15 combination_27_r15;  // optional
   public STTI_SupportedCombinations_r15_combination_22_27_r15 combination_22_27_r15;  // optional
   public STTI_SupportedCombinations_r15_combination_77_22_r15 combination_77_22_r15;  // optional
   public STTI_SupportedCombinations_r15_combination_77_27_r15 combination_77_27_r15;  // optional

   public STTI_SupportedCombinations_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public STTI_SupportedCombinations_r15 (
      DL_UL_CCs_r15 combination_22_r15_,
      DL_UL_CCs_r15 combination_77_r15_,
      DL_UL_CCs_r15 combination_27_r15_,
      STTI_SupportedCombinations_r15_combination_22_27_r15 combination_22_27_r15_,
      STTI_SupportedCombinations_r15_combination_77_22_r15 combination_77_22_r15_,
      STTI_SupportedCombinations_r15_combination_77_27_r15 combination_77_27_r15_
   ) {
      super();
      combination_22_r15 = combination_22_r15_;
      combination_77_r15 = combination_77_r15_;
      combination_27_r15 = combination_27_r15_;
      combination_22_27_r15 = combination_22_27_r15_;
      combination_77_22_r15 = combination_77_22_r15_;
      combination_77_27_r15 = combination_77_27_r15_;
   }

   public void init () {
      combination_22_r15 = null;
      combination_77_r15 = null;
      combination_27_r15 = null;
      combination_22_27_r15 = null;
      combination_77_22_r15 = null;
      combination_77_27_r15 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return combination_22_r15;
         case 1: return combination_77_r15;
         case 2: return combination_27_r15;
         case 3: return combination_22_27_r15;
         case 4: return combination_77_22_r15;
         case 5: return combination_77_27_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "combination-22-r15";
         case 1: return "combination-77-r15";
         case 2: return "combination-27-r15";
         case 3: return "combination-22-27-r15";
         case 4: return "combination-77-22-r15";
         case 5: return "combination-77-27-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean combination_22_r15Present = buffer.decodeBit ("combination_22_r15Present");
      boolean combination_77_r15Present = buffer.decodeBit ("combination_77_r15Present");
      boolean combination_27_r15Present = buffer.decodeBit ("combination_27_r15Present");
      boolean combination_22_27_r15Present = buffer.decodeBit ("combination_22_27_r15Present");
      boolean combination_77_22_r15Present = buffer.decodeBit ("combination_77_22_r15Present");
      boolean combination_77_27_r15Present = buffer.decodeBit ("combination_77_27_r15Present");

      // decode combination_22_r15

      if (combination_22_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_22_r15", -1);

         combination_22_r15 = new DL_UL_CCs_r15();
         combination_22_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_22_r15", -1);
      }
      else {
         combination_22_r15 = null;
      }

      // decode combination_77_r15

      if (combination_77_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_77_r15", -1);

         combination_77_r15 = new DL_UL_CCs_r15();
         combination_77_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_77_r15", -1);
      }
      else {
         combination_77_r15 = null;
      }

      // decode combination_27_r15

      if (combination_27_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_27_r15", -1);

         combination_27_r15 = new DL_UL_CCs_r15();
         combination_27_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_27_r15", -1);
      }
      else {
         combination_27_r15 = null;
      }

      // decode combination_22_27_r15

      if (combination_22_27_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_22_27_r15", -1);

         combination_22_27_r15 = new STTI_SupportedCombinations_r15_combination_22_27_r15();
         combination_22_27_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_22_27_r15", -1);
      }
      else {
         combination_22_27_r15 = null;
      }

      // decode combination_77_22_r15

      if (combination_77_22_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_77_22_r15", -1);

         combination_77_22_r15 = new STTI_SupportedCombinations_r15_combination_77_22_r15();
         combination_77_22_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_77_22_r15", -1);
      }
      else {
         combination_77_22_r15 = null;
      }

      // decode combination_77_27_r15

      if (combination_77_27_r15Present) {
         buffer.getContext().eventDispatcher.startElement("combination_77_27_r15", -1);

         combination_77_27_r15 = new STTI_SupportedCombinations_r15_combination_77_27_r15();
         combination_77_27_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("combination_77_27_r15", -1);
      }
      else {
         combination_77_27_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (combination_22_r15 != null) combination_22_r15.print (_sb, "combination_22_r15", _level+1);
      if (combination_77_r15 != null) combination_77_r15.print (_sb, "combination_77_r15", _level+1);
      if (combination_27_r15 != null) combination_27_r15.print (_sb, "combination_27_r15", _level+1);
      if (combination_22_27_r15 != null) combination_22_27_r15.print (_sb, "combination_22_27_r15", _level+1);
      if (combination_77_22_r15 != null) combination_77_22_r15.print (_sb, "combination_77_22_r15", _level+1);
      if (combination_77_27_r15 != null) combination_77_27_r15.print (_sb, "combination_77_27_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
