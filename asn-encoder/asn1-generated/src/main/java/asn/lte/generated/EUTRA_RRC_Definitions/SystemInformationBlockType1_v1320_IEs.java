/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_v1320_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType1-v1320-IEs";
   }

   public SystemInformationBlockType1_v1320_IEs_freqHoppingParametersDL_r13 freqHoppingParametersDL_r13;  // optional
   public SystemInformationBlockType1_v1350_IEs nonCriticalExtension;  // optional

   public SystemInformationBlockType1_v1320_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_v1320_IEs (
      SystemInformationBlockType1_v1320_IEs_freqHoppingParametersDL_r13 freqHoppingParametersDL_r13_,
      SystemInformationBlockType1_v1350_IEs nonCriticalExtension_
   ) {
      super();
      freqHoppingParametersDL_r13 = freqHoppingParametersDL_r13_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      freqHoppingParametersDL_r13 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqHoppingParametersDL_r13;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqHoppingParametersDL-r13";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean freqHoppingParametersDL_r13Present = buffer.decodeBit ("freqHoppingParametersDL_r13Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode freqHoppingParametersDL_r13

      if (freqHoppingParametersDL_r13Present) {
         buffer.getContext().eventDispatcher.startElement("freqHoppingParametersDL_r13", -1);

         freqHoppingParametersDL_r13 = new SystemInformationBlockType1_v1320_IEs_freqHoppingParametersDL_r13();
         freqHoppingParametersDL_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("freqHoppingParametersDL_r13", -1);
      }
      else {
         freqHoppingParametersDL_r13 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SystemInformationBlockType1_v1350_IEs();
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
      if (freqHoppingParametersDL_r13 != null) freqHoppingParametersDL_r13.print (_sb, "freqHoppingParametersDL_r13", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
