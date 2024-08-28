/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.DedicatedInfoNAS;

public class RRCEarlyDataComplete_NB_r15_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCEarlyDataComplete-NB-r15-IEs";
   }

   public DedicatedInfoNAS dedicatedInfoNAS_r15;  // optional
   public Asn1Integer extendedWaitTime_r15;  // optional
   public RedirectedCarrierInfo_NB_r13 redirectedCarrierInfo_r15;  // optional
   public RedirectedCarrierInfo_NB_v1430 redirectedCarrierInfoExt_r15;  // optional
   public RRCEarlyDataComplete_NB_r15_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCEarlyDataComplete_NB_r15_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCEarlyDataComplete_NB_r15_IEs (
      DedicatedInfoNAS dedicatedInfoNAS_r15_,
      Asn1Integer extendedWaitTime_r15_,
      RedirectedCarrierInfo_NB_r13 redirectedCarrierInfo_r15_,
      RedirectedCarrierInfo_NB_v1430 redirectedCarrierInfoExt_r15_,
      RRCEarlyDataComplete_NB_r15_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      dedicatedInfoNAS_r15 = dedicatedInfoNAS_r15_;
      extendedWaitTime_r15 = extendedWaitTime_r15_;
      redirectedCarrierInfo_r15 = redirectedCarrierInfo_r15_;
      redirectedCarrierInfoExt_r15 = redirectedCarrierInfoExt_r15_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCEarlyDataComplete_NB_r15_IEs (byte[] dedicatedInfoNAS_r15_,
      long extendedWaitTime_r15_,
      RedirectedCarrierInfo_NB_r13 redirectedCarrierInfo_r15_,
      RedirectedCarrierInfo_NB_v1430 redirectedCarrierInfoExt_r15_,
      RRCEarlyDataComplete_NB_r15_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      dedicatedInfoNAS_r15 = new DedicatedInfoNAS (dedicatedInfoNAS_r15_);
      extendedWaitTime_r15 = new Asn1Integer (extendedWaitTime_r15_);
      redirectedCarrierInfo_r15 = redirectedCarrierInfo_r15_;
      redirectedCarrierInfoExt_r15 = redirectedCarrierInfoExt_r15_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      dedicatedInfoNAS_r15 = null;
      extendedWaitTime_r15 = null;
      redirectedCarrierInfo_r15 = null;
      redirectedCarrierInfoExt_r15 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dedicatedInfoNAS_r15;
         case 1: return extendedWaitTime_r15;
         case 2: return redirectedCarrierInfo_r15;
         case 3: return redirectedCarrierInfoExt_r15;
         case 4: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dedicatedInfoNAS-r15";
         case 1: return "extendedWaitTime-r15";
         case 2: return "redirectedCarrierInfo-r15";
         case 3: return "redirectedCarrierInfoExt-r15";
         case 4: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dedicatedInfoNAS_r15Present = buffer.decodeBit ("dedicatedInfoNAS_r15Present");
      boolean extendedWaitTime_r15Present = buffer.decodeBit ("extendedWaitTime_r15Present");
      boolean redirectedCarrierInfo_r15Present = buffer.decodeBit ("redirectedCarrierInfo_r15Present");
      boolean redirectedCarrierInfoExt_r15Present = buffer.decodeBit ("redirectedCarrierInfoExt_r15Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode dedicatedInfoNAS_r15

      if (dedicatedInfoNAS_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dedicatedInfoNAS_r15", -1);

         dedicatedInfoNAS_r15 = new DedicatedInfoNAS();
         dedicatedInfoNAS_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dedicatedInfoNAS_r15", -1);
      }
      else {
         dedicatedInfoNAS_r15 = null;
      }

      // decode extendedWaitTime_r15

      if (extendedWaitTime_r15Present) {
         buffer.getContext().eventDispatcher.startElement("extendedWaitTime_r15", -1);

         extendedWaitTime_r15 = new Asn1Integer();
         extendedWaitTime_r15.decode (buffer, 1, 1800);

         buffer.invokeCharacters(extendedWaitTime_r15.toString());
         buffer.getContext().eventDispatcher.endElement("extendedWaitTime_r15", -1);
      }
      else {
         extendedWaitTime_r15 = null;
      }

      // decode redirectedCarrierInfo_r15

      if (redirectedCarrierInfo_r15Present) {
         buffer.getContext().eventDispatcher.startElement("redirectedCarrierInfo_r15", -1);

         redirectedCarrierInfo_r15 = new RedirectedCarrierInfo_NB_r13();
         redirectedCarrierInfo_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redirectedCarrierInfo_r15", -1);
      }
      else {
         redirectedCarrierInfo_r15 = null;
      }

      // decode redirectedCarrierInfoExt_r15

      if (redirectedCarrierInfoExt_r15Present) {
         buffer.getContext().eventDispatcher.startElement("redirectedCarrierInfoExt_r15", -1);

         redirectedCarrierInfoExt_r15 = new RedirectedCarrierInfo_NB_v1430();
         redirectedCarrierInfoExt_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redirectedCarrierInfoExt_r15", -1);
      }
      else {
         redirectedCarrierInfoExt_r15 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCEarlyDataComplete_NB_r15_IEs_nonCriticalExtension();
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
      if (dedicatedInfoNAS_r15 != null) dedicatedInfoNAS_r15.print (_sb, "dedicatedInfoNAS_r15", _level+1);
      if (extendedWaitTime_r15 != null) extendedWaitTime_r15.print (_sb, "extendedWaitTime_r15", _level+1);
      if (redirectedCarrierInfo_r15 != null) redirectedCarrierInfo_r15.print (_sb, "redirectedCarrierInfo_r15", _level+1);
      if (redirectedCarrierInfoExt_r15 != null) redirectedCarrierInfoExt_r15.print (_sb, "redirectedCarrierInfoExt_r15", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
