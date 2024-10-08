/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v1360_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-Capability-v1360-IEs";
   }

   public Other_Parameters_v1360 other_Parameters_v1360;  // optional
   public UE_EUTRA_Capability_v1430_IEs nonCriticalExtension;  // optional

   public UE_EUTRA_Capability_v1360_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_v1360_IEs (
      Other_Parameters_v1360 other_Parameters_v1360_,
      UE_EUTRA_Capability_v1430_IEs nonCriticalExtension_
   ) {
      super();
      other_Parameters_v1360 = other_Parameters_v1360_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      other_Parameters_v1360 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return other_Parameters_v1360;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "other-Parameters-v1360";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean other_Parameters_v1360Present = buffer.decodeBit ("other_Parameters_v1360Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode other_Parameters_v1360

      if (other_Parameters_v1360Present) {
         buffer.getContext().eventDispatcher.startElement("other_Parameters_v1360", -1);

         other_Parameters_v1360 = new Other_Parameters_v1360();
         other_Parameters_v1360.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("other_Parameters_v1360", -1);
      }
      else {
         other_Parameters_v1360 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_EUTRA_Capability_v1430_IEs();
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
      if (other_Parameters_v1360 != null) other_Parameters_v1360.print (_sb, "other_Parameters_v1360", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
