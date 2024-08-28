/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TDD-Config";
   }

   public TDD_Config_subframeAssignment subframeAssignment = null;
   public TDD_Config_specialSubframePatterns specialSubframePatterns = null;

   public TDD_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TDD_Config (
      TDD_Config_subframeAssignment subframeAssignment_,
      TDD_Config_specialSubframePatterns specialSubframePatterns_
   ) {
      super();
      subframeAssignment = subframeAssignment_;
      specialSubframePatterns = specialSubframePatterns_;
   }

   public void init () {
      subframeAssignment = null;
      specialSubframePatterns = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return subframeAssignment;
         case 1: return specialSubframePatterns;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "subframeAssignment";
         case 1: return "specialSubframePatterns";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode subframeAssignment

      buffer.getContext().eventDispatcher.startElement("subframeAssignment", -1);

      {
         int tval = TDD_Config_subframeAssignment.decodeEnumValue (buffer);
         subframeAssignment = TDD_Config_subframeAssignment.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("subframeAssignment", -1);

      // decode specialSubframePatterns

      buffer.getContext().eventDispatcher.startElement("specialSubframePatterns", -1);

      {
         int tval = TDD_Config_specialSubframePatterns.decodeEnumValue (buffer);
         specialSubframePatterns = TDD_Config_specialSubframePatterns.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("specialSubframePatterns", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (subframeAssignment != null) subframeAssignment.print (_sb, "subframeAssignment", _level+1);
      if (specialSubframePatterns != null) specialSubframePatterns.print (_sb, "specialSubframePatterns", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
