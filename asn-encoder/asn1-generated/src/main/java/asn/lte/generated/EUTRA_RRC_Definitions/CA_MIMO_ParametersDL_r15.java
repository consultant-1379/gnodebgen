/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_MIMO_ParametersDL_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CA-MIMO-ParametersDL-r15";
   }

   public MIMO_CapabilityDL_r10 supportedMIMO_CapabilityDL_r15 = null;  // optional
   public CA_MIMO_ParametersDL_r15_fourLayerTM3_TM4_r15 fourLayerTM3_TM4_r15 = null;  // optional
   public CA_MIMO_ParametersDL_r15_intraBandContiguousCC_InfoList_r15 intraBandContiguousCC_InfoList_r15;  // optional

   public CA_MIMO_ParametersDL_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_MIMO_ParametersDL_r15 (
      MIMO_CapabilityDL_r10 supportedMIMO_CapabilityDL_r15_,
      CA_MIMO_ParametersDL_r15_fourLayerTM3_TM4_r15 fourLayerTM3_TM4_r15_,
      CA_MIMO_ParametersDL_r15_intraBandContiguousCC_InfoList_r15 intraBandContiguousCC_InfoList_r15_
   ) {
      super();
      supportedMIMO_CapabilityDL_r15 = supportedMIMO_CapabilityDL_r15_;
      fourLayerTM3_TM4_r15 = fourLayerTM3_TM4_r15_;
      intraBandContiguousCC_InfoList_r15 = intraBandContiguousCC_InfoList_r15_;
   }

   public void init () {
      supportedMIMO_CapabilityDL_r15 = null;
      fourLayerTM3_TM4_r15 = null;
      intraBandContiguousCC_InfoList_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedMIMO_CapabilityDL_r15;
         case 1: return fourLayerTM3_TM4_r15;
         case 2: return intraBandContiguousCC_InfoList_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedMIMO-CapabilityDL-r15";
         case 1: return "fourLayerTM3-TM4-r15";
         case 2: return "intraBandContiguousCC-InfoList-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedMIMO_CapabilityDL_r15Present = buffer.decodeBit ("supportedMIMO_CapabilityDL_r15Present");
      boolean fourLayerTM3_TM4_r15Present = buffer.decodeBit ("fourLayerTM3_TM4_r15Present");
      boolean intraBandContiguousCC_InfoList_r15Present = buffer.decodeBit ("intraBandContiguousCC_InfoList_r15Present");

      // decode supportedMIMO_CapabilityDL_r15

      if (supportedMIMO_CapabilityDL_r15Present) {
         buffer.getContext().eventDispatcher.startElement("supportedMIMO_CapabilityDL_r15", -1);

         int tval = MIMO_CapabilityDL_r10.decodeEnumValue (buffer);
         supportedMIMO_CapabilityDL_r15 = MIMO_CapabilityDL_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportedMIMO_CapabilityDL_r15", -1);
      }
      else {
         supportedMIMO_CapabilityDL_r15 = null;
      }

      // decode fourLayerTM3_TM4_r15

      if (fourLayerTM3_TM4_r15Present) {
         buffer.getContext().eventDispatcher.startElement("fourLayerTM3_TM4_r15", -1);

         int tval = CA_MIMO_ParametersDL_r15_fourLayerTM3_TM4_r15.decodeEnumValue (buffer);
         fourLayerTM3_TM4_r15 = CA_MIMO_ParametersDL_r15_fourLayerTM3_TM4_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fourLayerTM3_TM4_r15", -1);
      }
      else {
         fourLayerTM3_TM4_r15 = null;
      }

      // decode intraBandContiguousCC_InfoList_r15

      if (intraBandContiguousCC_InfoList_r15Present) {
         buffer.getContext().eventDispatcher.startElement("intraBandContiguousCC_InfoList_r15", -1);

         intraBandContiguousCC_InfoList_r15 = new CA_MIMO_ParametersDL_r15_intraBandContiguousCC_InfoList_r15();
         intraBandContiguousCC_InfoList_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("intraBandContiguousCC_InfoList_r15", -1);
      }
      else {
         intraBandContiguousCC_InfoList_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedMIMO_CapabilityDL_r15 != null) supportedMIMO_CapabilityDL_r15.print (_sb, "supportedMIMO_CapabilityDL_r15", _level+1);
      if (fourLayerTM3_TM4_r15 != null) fourLayerTM3_TM4_r15.print (_sb, "fourLayerTM3_TM4_r15", _level+1);
      if (intraBandContiguousCC_InfoList_r15 != null) intraBandContiguousCC_InfoList_r15.print (_sb, "intraBandContiguousCC_InfoList_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
