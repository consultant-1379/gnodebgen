/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CommonLocationInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CommonLocationInfo-r16";
   }

   public Asn1OctetString gnss_TOD_msec_r16;  // optional
   public Asn1OctetString locationTimestamp_r16;  // optional
   public Asn1OctetString locationCoordinate_r16;  // optional
   public Asn1OctetString locationError_r16;  // optional
   public Asn1OctetString locationSource_r16;  // optional
   public Asn1OctetString velocityEstimate_r16;  // optional

   public CommonLocationInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CommonLocationInfo_r16 (
      Asn1OctetString gnss_TOD_msec_r16_,
      Asn1OctetString locationTimestamp_r16_,
      Asn1OctetString locationCoordinate_r16_,
      Asn1OctetString locationError_r16_,
      Asn1OctetString locationSource_r16_,
      Asn1OctetString velocityEstimate_r16_
   ) {
      super();
      gnss_TOD_msec_r16 = gnss_TOD_msec_r16_;
      locationTimestamp_r16 = locationTimestamp_r16_;
      locationCoordinate_r16 = locationCoordinate_r16_;
      locationError_r16 = locationError_r16_;
      locationSource_r16 = locationSource_r16_;
      velocityEstimate_r16 = velocityEstimate_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CommonLocationInfo_r16 (byte[] gnss_TOD_msec_r16_,
      byte[] locationTimestamp_r16_,
      byte[] locationCoordinate_r16_,
      byte[] locationError_r16_,
      byte[] locationSource_r16_,
      byte[] velocityEstimate_r16_
   ) {
      super();
      gnss_TOD_msec_r16 = new Asn1OctetString (gnss_TOD_msec_r16_);
      locationTimestamp_r16 = new Asn1OctetString (locationTimestamp_r16_);
      locationCoordinate_r16 = new Asn1OctetString (locationCoordinate_r16_);
      locationError_r16 = new Asn1OctetString (locationError_r16_);
      locationSource_r16 = new Asn1OctetString (locationSource_r16_);
      velocityEstimate_r16 = new Asn1OctetString (velocityEstimate_r16_);
   }

   public void init () {
      gnss_TOD_msec_r16 = null;
      locationTimestamp_r16 = null;
      locationCoordinate_r16 = null;
      locationError_r16 = null;
      locationSource_r16 = null;
      velocityEstimate_r16 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gnss_TOD_msec_r16;
         case 1: return locationTimestamp_r16;
         case 2: return locationCoordinate_r16;
         case 3: return locationError_r16;
         case 4: return locationSource_r16;
         case 5: return velocityEstimate_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gnss-TOD-msec-r16";
         case 1: return "locationTimestamp-r16";
         case 2: return "locationCoordinate-r16";
         case 3: return "locationError-r16";
         case 4: return "locationSource-r16";
         case 5: return "velocityEstimate-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean gnss_TOD_msec_r16Present = buffer.decodeBit ("gnss_TOD_msec_r16Present");
      boolean locationTimestamp_r16Present = buffer.decodeBit ("locationTimestamp_r16Present");
      boolean locationCoordinate_r16Present = buffer.decodeBit ("locationCoordinate_r16Present");
      boolean locationError_r16Present = buffer.decodeBit ("locationError_r16Present");
      boolean locationSource_r16Present = buffer.decodeBit ("locationSource_r16Present");
      boolean velocityEstimate_r16Present = buffer.decodeBit ("velocityEstimate_r16Present");

      // decode gnss_TOD_msec_r16

      if (gnss_TOD_msec_r16Present) {
         buffer.getContext().eventDispatcher.startElement("gnss_TOD_msec_r16", -1);

         gnss_TOD_msec_r16 = new Asn1OctetString();
         gnss_TOD_msec_r16.decode (buffer);

         buffer.invokeCharacters(gnss_TOD_msec_r16.toString());
         buffer.getContext().eventDispatcher.endElement("gnss_TOD_msec_r16", -1);
      }
      else {
         gnss_TOD_msec_r16 = null;
      }

      // decode locationTimestamp_r16

      if (locationTimestamp_r16Present) {
         buffer.getContext().eventDispatcher.startElement("locationTimestamp_r16", -1);

         locationTimestamp_r16 = new Asn1OctetString();
         locationTimestamp_r16.decode (buffer);

         buffer.invokeCharacters(locationTimestamp_r16.toString());
         buffer.getContext().eventDispatcher.endElement("locationTimestamp_r16", -1);
      }
      else {
         locationTimestamp_r16 = null;
      }

      // decode locationCoordinate_r16

      if (locationCoordinate_r16Present) {
         buffer.getContext().eventDispatcher.startElement("locationCoordinate_r16", -1);

         locationCoordinate_r16 = new Asn1OctetString();
         locationCoordinate_r16.decode (buffer);

         buffer.invokeCharacters(locationCoordinate_r16.toString());
         buffer.getContext().eventDispatcher.endElement("locationCoordinate_r16", -1);
      }
      else {
         locationCoordinate_r16 = null;
      }

      // decode locationError_r16

      if (locationError_r16Present) {
         buffer.getContext().eventDispatcher.startElement("locationError_r16", -1);

         locationError_r16 = new Asn1OctetString();
         locationError_r16.decode (buffer);

         buffer.invokeCharacters(locationError_r16.toString());
         buffer.getContext().eventDispatcher.endElement("locationError_r16", -1);
      }
      else {
         locationError_r16 = null;
      }

      // decode locationSource_r16

      if (locationSource_r16Present) {
         buffer.getContext().eventDispatcher.startElement("locationSource_r16", -1);

         locationSource_r16 = new Asn1OctetString();
         locationSource_r16.decode (buffer);

         buffer.invokeCharacters(locationSource_r16.toString());
         buffer.getContext().eventDispatcher.endElement("locationSource_r16", -1);
      }
      else {
         locationSource_r16 = null;
      }

      // decode velocityEstimate_r16

      if (velocityEstimate_r16Present) {
         buffer.getContext().eventDispatcher.startElement("velocityEstimate_r16", -1);

         velocityEstimate_r16 = new Asn1OctetString();
         velocityEstimate_r16.decode (buffer);

         buffer.invokeCharacters(velocityEstimate_r16.toString());
         buffer.getContext().eventDispatcher.endElement("velocityEstimate_r16", -1);
      }
      else {
         velocityEstimate_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (gnss_TOD_msec_r16 != null) gnss_TOD_msec_r16.print (_sb, "gnss_TOD_msec_r16", _level+1);
      if (locationTimestamp_r16 != null) locationTimestamp_r16.print (_sb, "locationTimestamp_r16", _level+1);
      if (locationCoordinate_r16 != null) locationCoordinate_r16.print (_sb, "locationCoordinate_r16", _level+1);
      if (locationError_r16 != null) locationError_r16.print (_sb, "locationError_r16", _level+1);
      if (locationSource_r16 != null) locationSource_r16.print (_sb, "locationSource_r16", _level+1);
      if (velocityEstimate_r16 != null) velocityEstimate_r16.print (_sb, "velocityEstimate_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
