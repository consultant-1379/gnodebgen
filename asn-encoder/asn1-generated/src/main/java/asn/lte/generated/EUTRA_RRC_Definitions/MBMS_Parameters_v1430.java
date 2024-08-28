/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBMS_Parameters_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MBMS-Parameters-v1430";
   }

   public MBMS_Parameters_v1430_fembmsDedicatedCell_r14 fembmsDedicatedCell_r14 = null;  // optional
   public MBMS_Parameters_v1430_fembmsMixedCell_r14 fembmsMixedCell_r14 = null;  // optional
   public MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz7dot5_r14 subcarrierSpacingMBMS_khz7dot5_r14 = null;  // optional
   public MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz1dot25_r14 subcarrierSpacingMBMS_khz1dot25_r14 = null;  // optional

   public MBMS_Parameters_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MBMS_Parameters_v1430 (
      MBMS_Parameters_v1430_fembmsDedicatedCell_r14 fembmsDedicatedCell_r14_,
      MBMS_Parameters_v1430_fembmsMixedCell_r14 fembmsMixedCell_r14_,
      MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz7dot5_r14 subcarrierSpacingMBMS_khz7dot5_r14_,
      MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz1dot25_r14 subcarrierSpacingMBMS_khz1dot25_r14_
   ) {
      super();
      fembmsDedicatedCell_r14 = fembmsDedicatedCell_r14_;
      fembmsMixedCell_r14 = fembmsMixedCell_r14_;
      subcarrierSpacingMBMS_khz7dot5_r14 = subcarrierSpacingMBMS_khz7dot5_r14_;
      subcarrierSpacingMBMS_khz1dot25_r14 = subcarrierSpacingMBMS_khz1dot25_r14_;
   }

   public void init () {
      fembmsDedicatedCell_r14 = null;
      fembmsMixedCell_r14 = null;
      subcarrierSpacingMBMS_khz7dot5_r14 = null;
      subcarrierSpacingMBMS_khz1dot25_r14 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return fembmsDedicatedCell_r14;
         case 1: return fembmsMixedCell_r14;
         case 2: return subcarrierSpacingMBMS_khz7dot5_r14;
         case 3: return subcarrierSpacingMBMS_khz1dot25_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "fembmsDedicatedCell-r14";
         case 1: return "fembmsMixedCell-r14";
         case 2: return "subcarrierSpacingMBMS-khz7dot5-r14";
         case 3: return "subcarrierSpacingMBMS-khz1dot25-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean fembmsDedicatedCell_r14Present = buffer.decodeBit ("fembmsDedicatedCell_r14Present");
      boolean fembmsMixedCell_r14Present = buffer.decodeBit ("fembmsMixedCell_r14Present");
      boolean subcarrierSpacingMBMS_khz7dot5_r14Present = buffer.decodeBit ("subcarrierSpacingMBMS_khz7dot5_r14Present");
      boolean subcarrierSpacingMBMS_khz1dot25_r14Present = buffer.decodeBit ("subcarrierSpacingMBMS_khz1dot25_r14Present");

      // decode fembmsDedicatedCell_r14

      if (fembmsDedicatedCell_r14Present) {
         buffer.getContext().eventDispatcher.startElement("fembmsDedicatedCell_r14", -1);

         int tval = MBMS_Parameters_v1430_fembmsDedicatedCell_r14.decodeEnumValue (buffer);
         fembmsDedicatedCell_r14 = MBMS_Parameters_v1430_fembmsDedicatedCell_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fembmsDedicatedCell_r14", -1);
      }
      else {
         fembmsDedicatedCell_r14 = null;
      }

      // decode fembmsMixedCell_r14

      if (fembmsMixedCell_r14Present) {
         buffer.getContext().eventDispatcher.startElement("fembmsMixedCell_r14", -1);

         int tval = MBMS_Parameters_v1430_fembmsMixedCell_r14.decodeEnumValue (buffer);
         fembmsMixedCell_r14 = MBMS_Parameters_v1430_fembmsMixedCell_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fembmsMixedCell_r14", -1);
      }
      else {
         fembmsMixedCell_r14 = null;
      }

      // decode subcarrierSpacingMBMS_khz7dot5_r14

      if (subcarrierSpacingMBMS_khz7dot5_r14Present) {
         buffer.getContext().eventDispatcher.startElement("subcarrierSpacingMBMS_khz7dot5_r14", -1);

         int tval = MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz7dot5_r14.decodeEnumValue (buffer);
         subcarrierSpacingMBMS_khz7dot5_r14 = MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz7dot5_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("subcarrierSpacingMBMS_khz7dot5_r14", -1);
      }
      else {
         subcarrierSpacingMBMS_khz7dot5_r14 = null;
      }

      // decode subcarrierSpacingMBMS_khz1dot25_r14

      if (subcarrierSpacingMBMS_khz1dot25_r14Present) {
         buffer.getContext().eventDispatcher.startElement("subcarrierSpacingMBMS_khz1dot25_r14", -1);

         int tval = MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz1dot25_r14.decodeEnumValue (buffer);
         subcarrierSpacingMBMS_khz1dot25_r14 = MBMS_Parameters_v1430_subcarrierSpacingMBMS_khz1dot25_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("subcarrierSpacingMBMS_khz1dot25_r14", -1);
      }
      else {
         subcarrierSpacingMBMS_khz1dot25_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (fembmsDedicatedCell_r14 != null) fembmsDedicatedCell_r14.print (_sb, "fembmsDedicatedCell_r14", _level+1);
      if (fembmsMixedCell_r14 != null) fembmsMixedCell_r14.print (_sb, "fembmsMixedCell_r14", _level+1);
      if (subcarrierSpacingMBMS_khz7dot5_r14 != null) subcarrierSpacingMBMS_khz7dot5_r14.print (_sb, "subcarrierSpacingMBMS_khz7dot5_r14", _level+1);
      if (subcarrierSpacingMBMS_khz1dot25_r14 != null) subcarrierSpacingMBMS_khz1dot25_r14.print (_sb, "subcarrierSpacingMBMS_khz1dot25_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
