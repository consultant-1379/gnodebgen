/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBSFNAreaConfiguration_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MBSFNAreaConfiguration-r9";
   }

   public CommonSF_AllocPatternList_r9 commonSF_Alloc_r9;
   public MBSFNAreaConfiguration_r9_commonSF_AllocPeriod_r9 commonSF_AllocPeriod_r9 = null;
   public PMCH_InfoList_r9 pmch_InfoList_r9;
   public MBSFNAreaConfiguration_v930_IEs nonCriticalExtension;  // optional

   public MBSFNAreaConfiguration_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MBSFNAreaConfiguration_r9 (
      CommonSF_AllocPatternList_r9 commonSF_Alloc_r9_,
      MBSFNAreaConfiguration_r9_commonSF_AllocPeriod_r9 commonSF_AllocPeriod_r9_,
      PMCH_InfoList_r9 pmch_InfoList_r9_,
      MBSFNAreaConfiguration_v930_IEs nonCriticalExtension_
   ) {
      super();
      commonSF_Alloc_r9 = commonSF_Alloc_r9_;
      commonSF_AllocPeriod_r9 = commonSF_AllocPeriod_r9_;
      pmch_InfoList_r9 = pmch_InfoList_r9_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MBSFNAreaConfiguration_r9 (
      CommonSF_AllocPatternList_r9 commonSF_Alloc_r9_,
      MBSFNAreaConfiguration_r9_commonSF_AllocPeriod_r9 commonSF_AllocPeriod_r9_,
      PMCH_InfoList_r9 pmch_InfoList_r9_
   ) {
      super();
      commonSF_Alloc_r9 = commonSF_Alloc_r9_;
      commonSF_AllocPeriod_r9 = commonSF_AllocPeriod_r9_;
      pmch_InfoList_r9 = pmch_InfoList_r9_;
   }

   public void init () {
      commonSF_Alloc_r9 = null;
      commonSF_AllocPeriod_r9 = null;
      pmch_InfoList_r9 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return commonSF_Alloc_r9;
         case 1: return commonSF_AllocPeriod_r9;
         case 2: return pmch_InfoList_r9;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "commonSF-Alloc-r9";
         case 1: return "commonSF-AllocPeriod-r9";
         case 2: return "pmch-InfoList-r9";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode commonSF_Alloc_r9

      buffer.getContext().eventDispatcher.startElement("commonSF_Alloc_r9", -1);

      commonSF_Alloc_r9 = new CommonSF_AllocPatternList_r9();
      commonSF_Alloc_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("commonSF_Alloc_r9", -1);

      // decode commonSF_AllocPeriod_r9

      buffer.getContext().eventDispatcher.startElement("commonSF_AllocPeriod_r9", -1);

      {
         int tval = MBSFNAreaConfiguration_r9_commonSF_AllocPeriod_r9.decodeEnumValue (buffer);
         commonSF_AllocPeriod_r9 = MBSFNAreaConfiguration_r9_commonSF_AllocPeriod_r9.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("commonSF_AllocPeriod_r9", -1);

      // decode pmch_InfoList_r9

      buffer.getContext().eventDispatcher.startElement("pmch_InfoList_r9", -1);

      pmch_InfoList_r9 = new PMCH_InfoList_r9();
      pmch_InfoList_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pmch_InfoList_r9", -1);

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new MBSFNAreaConfiguration_v930_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (commonSF_Alloc_r9 != null) commonSF_Alloc_r9.print (_sb, "commonSF_Alloc_r9", _level+1);
      if (commonSF_AllocPeriod_r9 != null) commonSF_AllocPeriod_r9.print (_sb, "commonSF_AllocPeriod_r9", _level+1);
      if (pmch_InfoList_r9 != null) pmch_InfoList_r9.print (_sb, "pmch_InfoList_r9", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
