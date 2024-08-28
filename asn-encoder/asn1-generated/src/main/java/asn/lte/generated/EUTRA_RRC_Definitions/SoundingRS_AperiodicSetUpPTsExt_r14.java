/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_AperiodicSetUpPTsExt_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SoundingRS-AperiodicSetUpPTsExt-r14";
   }

   public SoundingRS_AperiodicSetUpPTsExt_r14_srs_CC_SetIndexList_r14 srs_CC_SetIndexList_r14;  // optional
   public SoundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r13 soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14;

   public SoundingRS_AperiodicSetUpPTsExt_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SoundingRS_AperiodicSetUpPTsExt_r14 (
      SoundingRS_AperiodicSetUpPTsExt_r14_srs_CC_SetIndexList_r14 srs_CC_SetIndexList_r14_,
      SoundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r13 soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14_
   ) {
      super();
      srs_CC_SetIndexList_r14 = srs_CC_SetIndexList_r14_;
      soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14 = soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SoundingRS_AperiodicSetUpPTsExt_r14 (
      SoundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r13 soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14_
   ) {
      super();
      soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14 = soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14_;
   }

   public void init () {
      srs_CC_SetIndexList_r14 = null;
      soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srs_CC_SetIndexList_r14;
         case 1: return soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srs-CC-SetIndexList-r14";
         case 1: return "soundingRS-UL-ConfigDedicatedAperiodicUpPTsExt-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean srs_CC_SetIndexList_r14Present = buffer.decodeBit ("srs_CC_SetIndexList_r14Present");

      // decode srs_CC_SetIndexList_r14

      if (srs_CC_SetIndexList_r14Present) {
         buffer.getContext().eventDispatcher.startElement("srs_CC_SetIndexList_r14", -1);

         srs_CC_SetIndexList_r14 = new SoundingRS_AperiodicSetUpPTsExt_r14_srs_CC_SetIndexList_r14();
         srs_CC_SetIndexList_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_CC_SetIndexList_r14", -1);
      }
      else {
         srs_CC_SetIndexList_r14 = null;
      }

      // decode soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14

      buffer.getContext().eventDispatcher.startElement("soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14", -1);

      soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14 = new SoundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r13();
      soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srs_CC_SetIndexList_r14 != null) srs_CC_SetIndexList_r14.print (_sb, "srs_CC_SetIndexList_r14", _level+1);
      if (soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14 != null) soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14.print (_sb, "soundingRS_UL_ConfigDedicatedAperiodicUpPTsExt_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
