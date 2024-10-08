/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EIMTA_MainConfigServCell_r12_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer eimta_UL_DL_ConfigIndex_r12;
   public EIMTA_MainConfigServCell_r12_setup_eimta_HARQ_ReferenceConfig_r12 eimta_HARQ_ReferenceConfig_r12 = null;
   public EIMTA_MainConfigServCell_r12_setup_mbsfn_SubframeConfigList_v1250 mbsfn_SubframeConfigList_v1250;

   public EIMTA_MainConfigServCell_r12_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EIMTA_MainConfigServCell_r12_setup (
      Asn1Integer eimta_UL_DL_ConfigIndex_r12_,
      EIMTA_MainConfigServCell_r12_setup_eimta_HARQ_ReferenceConfig_r12 eimta_HARQ_ReferenceConfig_r12_,
      EIMTA_MainConfigServCell_r12_setup_mbsfn_SubframeConfigList_v1250 mbsfn_SubframeConfigList_v1250_
   ) {
      super();
      eimta_UL_DL_ConfigIndex_r12 = eimta_UL_DL_ConfigIndex_r12_;
      eimta_HARQ_ReferenceConfig_r12 = eimta_HARQ_ReferenceConfig_r12_;
      mbsfn_SubframeConfigList_v1250 = mbsfn_SubframeConfigList_v1250_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EIMTA_MainConfigServCell_r12_setup (long eimta_UL_DL_ConfigIndex_r12_,
      EIMTA_MainConfigServCell_r12_setup_eimta_HARQ_ReferenceConfig_r12 eimta_HARQ_ReferenceConfig_r12_,
      EIMTA_MainConfigServCell_r12_setup_mbsfn_SubframeConfigList_v1250 mbsfn_SubframeConfigList_v1250_
   ) {
      super();
      eimta_UL_DL_ConfigIndex_r12 = new Asn1Integer (eimta_UL_DL_ConfigIndex_r12_);
      eimta_HARQ_ReferenceConfig_r12 = eimta_HARQ_ReferenceConfig_r12_;
      mbsfn_SubframeConfigList_v1250 = mbsfn_SubframeConfigList_v1250_;
   }

   public void init () {
      eimta_UL_DL_ConfigIndex_r12 = null;
      eimta_HARQ_ReferenceConfig_r12 = null;
      mbsfn_SubframeConfigList_v1250 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eimta_UL_DL_ConfigIndex_r12;
         case 1: return eimta_HARQ_ReferenceConfig_r12;
         case 2: return mbsfn_SubframeConfigList_v1250;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eimta-UL-DL-ConfigIndex-r12";
         case 1: return "eimta-HARQ-ReferenceConfig-r12";
         case 2: return "mbsfn-SubframeConfigList-v1250";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode eimta_UL_DL_ConfigIndex_r12

      buffer.getContext().eventDispatcher.startElement("eimta_UL_DL_ConfigIndex_r12", -1);

      eimta_UL_DL_ConfigIndex_r12 = new Asn1Integer();
      eimta_UL_DL_ConfigIndex_r12.decode (buffer, 1, 5);

      buffer.invokeCharacters(eimta_UL_DL_ConfigIndex_r12.toString());
      buffer.getContext().eventDispatcher.endElement("eimta_UL_DL_ConfigIndex_r12", -1);

      // decode eimta_HARQ_ReferenceConfig_r12

      buffer.getContext().eventDispatcher.startElement("eimta_HARQ_ReferenceConfig_r12", -1);

      {
         int tval = EIMTA_MainConfigServCell_r12_setup_eimta_HARQ_ReferenceConfig_r12.decodeEnumValue (buffer);
         eimta_HARQ_ReferenceConfig_r12 = EIMTA_MainConfigServCell_r12_setup_eimta_HARQ_ReferenceConfig_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("eimta_HARQ_ReferenceConfig_r12", -1);

      // decode mbsfn_SubframeConfigList_v1250

      buffer.getContext().eventDispatcher.startElement("mbsfn_SubframeConfigList_v1250", -1);

      mbsfn_SubframeConfigList_v1250 = new EIMTA_MainConfigServCell_r12_setup_mbsfn_SubframeConfigList_v1250();
      mbsfn_SubframeConfigList_v1250.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mbsfn_SubframeConfigList_v1250", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eimta_UL_DL_ConfigIndex_r12 != null) eimta_UL_DL_ConfigIndex_r12.print (_sb, "eimta_UL_DL_ConfigIndex_r12", _level+1);
      if (eimta_HARQ_ReferenceConfig_r12 != null) eimta_HARQ_ReferenceConfig_r12.print (_sb, "eimta_HARQ_ReferenceConfig_r12", _level+1);
      if (mbsfn_SubframeConfigList_v1250 != null) mbsfn_SubframeConfigList_v1250.print (_sb, "mbsfn_SubframeConfigList_v1250", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
