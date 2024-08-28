/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v1340_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-Capability-v1340-IEs";
   }

   public Asn1Integer ue_CategoryUL_v1340;  // optional
   public UE_EUTRA_Capability_v1350_IEs nonCriticalExtension;  // optional

   public UE_EUTRA_Capability_v1340_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_v1340_IEs (
      Asn1Integer ue_CategoryUL_v1340_,
      UE_EUTRA_Capability_v1350_IEs nonCriticalExtension_
   ) {
      super();
      ue_CategoryUL_v1340 = ue_CategoryUL_v1340_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UE_EUTRA_Capability_v1340_IEs (long ue_CategoryUL_v1340_,
      UE_EUTRA_Capability_v1350_IEs nonCriticalExtension_
   ) {
      super();
      ue_CategoryUL_v1340 = new Asn1Integer (ue_CategoryUL_v1340_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_CategoryUL_v1340 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_CategoryUL_v1340;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-CategoryUL-v1340";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_CategoryUL_v1340Present = buffer.decodeBit ("ue_CategoryUL_v1340Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_CategoryUL_v1340

      if (ue_CategoryUL_v1340Present) {
         buffer.getContext().eventDispatcher.startElement("ue_CategoryUL_v1340", -1);

         ue_CategoryUL_v1340 = new Asn1Integer();
         ue_CategoryUL_v1340.decode (buffer, 15, 15);

         buffer.invokeCharacters(ue_CategoryUL_v1340.toString());
         buffer.getContext().eventDispatcher.endElement("ue_CategoryUL_v1340", -1);
      }
      else {
         ue_CategoryUL_v1340 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_EUTRA_Capability_v1350_IEs();
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
      if (ue_CategoryUL_v1340 != null) ue_CategoryUL_v1340.print (_sb, "ue_CategoryUL_v1340", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
