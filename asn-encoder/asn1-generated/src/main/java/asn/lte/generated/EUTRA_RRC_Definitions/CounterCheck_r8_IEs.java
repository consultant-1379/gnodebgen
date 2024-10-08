/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CounterCheck_r8_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CounterCheck-r8-IEs";
   }

   public DRB_CountMSB_InfoList drb_CountMSB_InfoList;
   public CounterCheck_v8a0_IEs nonCriticalExtension;  // optional

   public CounterCheck_r8_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CounterCheck_r8_IEs (
      DRB_CountMSB_InfoList drb_CountMSB_InfoList_,
      CounterCheck_v8a0_IEs nonCriticalExtension_
   ) {
      super();
      drb_CountMSB_InfoList = drb_CountMSB_InfoList_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CounterCheck_r8_IEs (
      DRB_CountMSB_InfoList drb_CountMSB_InfoList_
   ) {
      super();
      drb_CountMSB_InfoList = drb_CountMSB_InfoList_;
   }

   public void init () {
      drb_CountMSB_InfoList = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drb_CountMSB_InfoList;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drb-CountMSB-InfoList";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode drb_CountMSB_InfoList

      buffer.getContext().eventDispatcher.startElement("drb_CountMSB_InfoList", -1);

      drb_CountMSB_InfoList = new DRB_CountMSB_InfoList();
      drb_CountMSB_InfoList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("drb_CountMSB_InfoList", -1);

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CounterCheck_v8a0_IEs();
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
      if (drb_CountMSB_InfoList != null) drb_CountMSB_InfoList.print (_sb, "drb_CountMSB_InfoList", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
