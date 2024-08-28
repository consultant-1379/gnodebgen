/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionSetupComplete_v1430_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionSetupComplete-v1430-IEs";
   }

   public Asn1Integer dcn_ID_r14;  // optional
   public RRCConnectionSetupComplete_v1530_IEs nonCriticalExtension;  // optional

   public RRCConnectionSetupComplete_v1430_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionSetupComplete_v1430_IEs (
      Asn1Integer dcn_ID_r14_,
      RRCConnectionSetupComplete_v1530_IEs nonCriticalExtension_
   ) {
      super();
      dcn_ID_r14 = dcn_ID_r14_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCConnectionSetupComplete_v1430_IEs (long dcn_ID_r14_,
      RRCConnectionSetupComplete_v1530_IEs nonCriticalExtension_
   ) {
      super();
      dcn_ID_r14 = new Asn1Integer (dcn_ID_r14_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      dcn_ID_r14 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dcn_ID_r14;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dcn-ID-r14";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dcn_ID_r14Present = buffer.decodeBit ("dcn_ID_r14Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode dcn_ID_r14

      if (dcn_ID_r14Present) {
         buffer.getContext().eventDispatcher.startElement("dcn_ID_r14", -1);

         dcn_ID_r14 = new Asn1Integer();
         dcn_ID_r14.decode (buffer, 0, 65535);

         buffer.invokeCharacters(dcn_ID_r14.toString());
         buffer.getContext().eventDispatcher.endElement("dcn_ID_r14", -1);
      }
      else {
         dcn_ID_r14 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionSetupComplete_v1530_IEs();
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
      if (dcn_ID_r14 != null) dcn_ID_r14.print (_sb, "dcn_ID_r14", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
