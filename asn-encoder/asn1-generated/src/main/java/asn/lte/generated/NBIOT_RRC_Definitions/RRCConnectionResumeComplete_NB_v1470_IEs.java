/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionResumeComplete_NB_v1470_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionResumeComplete-NB-v1470-IEs";
   }

   public MeasResultServCell_NB_r14 measResultServCell_r14;  // optional
   public RRCConnectionResumeComplete_NB_v1470_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCConnectionResumeComplete_NB_v1470_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionResumeComplete_NB_v1470_IEs (
      MeasResultServCell_NB_r14 measResultServCell_r14_,
      RRCConnectionResumeComplete_NB_v1470_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      measResultServCell_r14 = measResultServCell_r14_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      measResultServCell_r14 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measResultServCell_r14;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measResultServCell-r14";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measResultServCell_r14Present = buffer.decodeBit ("measResultServCell_r14Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode measResultServCell_r14

      if (measResultServCell_r14Present) {
         buffer.getContext().eventDispatcher.startElement("measResultServCell_r14", -1);

         measResultServCell_r14 = new MeasResultServCell_NB_r14();
         measResultServCell_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultServCell_r14", -1);
      }
      else {
         measResultServCell_r14 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionResumeComplete_NB_v1470_IEs_nonCriticalExtension();
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
      if (measResultServCell_r14 != null) measResultServCell_r14.print (_sb, "measResultServCell_r14", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
