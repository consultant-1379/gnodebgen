/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LoggedMeasurementConfiguration_v1080_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LoggedMeasurementConfiguration-v1080-IEs";
   }

   public Asn1OctetString lateNonCriticalExtension_r10;  // optional
   public LoggedMeasurementConfiguration_v1130_IEs nonCriticalExtension;  // optional

   public LoggedMeasurementConfiguration_v1080_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LoggedMeasurementConfiguration_v1080_IEs (
      Asn1OctetString lateNonCriticalExtension_r10_,
      LoggedMeasurementConfiguration_v1130_IEs nonCriticalExtension_
   ) {
      super();
      lateNonCriticalExtension_r10 = lateNonCriticalExtension_r10_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LoggedMeasurementConfiguration_v1080_IEs (byte[] lateNonCriticalExtension_r10_,
      LoggedMeasurementConfiguration_v1130_IEs nonCriticalExtension_
   ) {
      super();
      lateNonCriticalExtension_r10 = new Asn1OctetString (lateNonCriticalExtension_r10_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      lateNonCriticalExtension_r10 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lateNonCriticalExtension_r10;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lateNonCriticalExtension-r10";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lateNonCriticalExtension_r10Present = buffer.decodeBit ("lateNonCriticalExtension_r10Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode lateNonCriticalExtension_r10

      if (lateNonCriticalExtension_r10Present) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension_r10", -1);

         lateNonCriticalExtension_r10 = new Asn1OctetString();
         lateNonCriticalExtension_r10.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension_r10.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension_r10", -1);
      }
      else {
         lateNonCriticalExtension_r10 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new LoggedMeasurementConfiguration_v1130_IEs();
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
      if (lateNonCriticalExtension_r10 != null) lateNonCriticalExtension_r10.print (_sb, "lateNonCriticalExtension_r10", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
