/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SupportedUDC_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SupportedUDC-r15";
   }

   public SupportedUDC_r15_supportedStandardDic_r15 supportedStandardDic_r15 = null;  // optional
   public SupportedOperatorDic_r15 supportedOperatorDic_r15;  // optional

   public SupportedUDC_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SupportedUDC_r15 (
      SupportedUDC_r15_supportedStandardDic_r15 supportedStandardDic_r15_,
      SupportedOperatorDic_r15 supportedOperatorDic_r15_
   ) {
      super();
      supportedStandardDic_r15 = supportedStandardDic_r15_;
      supportedOperatorDic_r15 = supportedOperatorDic_r15_;
   }

   public void init () {
      supportedStandardDic_r15 = null;
      supportedOperatorDic_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedStandardDic_r15;
         case 1: return supportedOperatorDic_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedStandardDic-r15";
         case 1: return "supportedOperatorDic-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedStandardDic_r15Present = buffer.decodeBit ("supportedStandardDic_r15Present");
      boolean supportedOperatorDic_r15Present = buffer.decodeBit ("supportedOperatorDic_r15Present");

      // decode supportedStandardDic_r15

      if (supportedStandardDic_r15Present) {
         buffer.getContext().eventDispatcher.startElement("supportedStandardDic_r15", -1);

         int tval = SupportedUDC_r15_supportedStandardDic_r15.decodeEnumValue (buffer);
         supportedStandardDic_r15 = SupportedUDC_r15_supportedStandardDic_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportedStandardDic_r15", -1);
      }
      else {
         supportedStandardDic_r15 = null;
      }

      // decode supportedOperatorDic_r15

      if (supportedOperatorDic_r15Present) {
         buffer.getContext().eventDispatcher.startElement("supportedOperatorDic_r15", -1);

         supportedOperatorDic_r15 = new SupportedOperatorDic_r15();
         supportedOperatorDic_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedOperatorDic_r15", -1);
      }
      else {
         supportedOperatorDic_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedStandardDic_r15 != null) supportedStandardDic_r15.print (_sb, "supportedStandardDic_r15", _level+1);
      if (supportedOperatorDic_r15 != null) supportedOperatorDic_r15.print (_sb, "supportedOperatorDic_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
