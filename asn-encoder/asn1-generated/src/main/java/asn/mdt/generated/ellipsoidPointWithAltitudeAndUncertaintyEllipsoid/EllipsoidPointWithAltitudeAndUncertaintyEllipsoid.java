/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 30-Dec-2020.
 */
package asn.mdt.generated.ellipsoidPointWithAltitudeAndUncertaintyEllipsoid;

import com.objsys.asn1j.runtime.*;

public class EllipsoidPointWithAltitudeAndUncertaintyEllipsoid extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_ellipsoidPointWithAltitudeAndUncertaintyEllipsoidRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EllipsoidPointWithAltitudeAndUncertaintyEllipsoid";
   }

   public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign latitudeSign = null;
   public Asn1Integer degreesLatitude;
   public Asn1Integer degreesLongitude;
   public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection altitudeDirection = null;
   public Asn1Integer altitude;
   public Asn1Integer uncertaintySemiMajor;
   public Asn1Integer uncertaintySemiMinor;
   public Asn1Integer orientationMajorAxis;
   public Asn1Integer uncertaintyAltitude;
   public Asn1Integer confidence;

   public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid (
      EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign latitudeSign_,
      Asn1Integer degreesLatitude_,
      Asn1Integer degreesLongitude_,
      EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection altitudeDirection_,
      Asn1Integer altitude_,
      Asn1Integer uncertaintySemiMajor_,
      Asn1Integer uncertaintySemiMinor_,
      Asn1Integer orientationMajorAxis_,
      Asn1Integer uncertaintyAltitude_,
      Asn1Integer confidence_
   ) {
      super();
      latitudeSign = latitudeSign_;
      degreesLatitude = degreesLatitude_;
      degreesLongitude = degreesLongitude_;
      altitudeDirection = altitudeDirection_;
      altitude = altitude_;
      uncertaintySemiMajor = uncertaintySemiMajor_;
      uncertaintySemiMinor = uncertaintySemiMinor_;
      orientationMajorAxis = orientationMajorAxis_;
      uncertaintyAltitude = uncertaintyAltitude_;
      confidence = confidence_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid (EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign latitudeSign_,
      long degreesLatitude_,
      long degreesLongitude_,
      EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection altitudeDirection_,
      long altitude_,
      long uncertaintySemiMajor_,
      long uncertaintySemiMinor_,
      long orientationMajorAxis_,
      long uncertaintyAltitude_,
      long confidence_
   ) {
      super();
      latitudeSign = latitudeSign_;
      degreesLatitude = new Asn1Integer (degreesLatitude_);
      degreesLongitude = new Asn1Integer (degreesLongitude_);
      altitudeDirection = altitudeDirection_;
      altitude = new Asn1Integer (altitude_);
      uncertaintySemiMajor = new Asn1Integer (uncertaintySemiMajor_);
      uncertaintySemiMinor = new Asn1Integer (uncertaintySemiMinor_);
      orientationMajorAxis = new Asn1Integer (orientationMajorAxis_);
      uncertaintyAltitude = new Asn1Integer (uncertaintyAltitude_);
      confidence = new Asn1Integer (confidence_);
   }

   public void init () {
      latitudeSign = null;
      degreesLatitude = null;
      degreesLongitude = null;
      altitudeDirection = null;
      altitude = null;
      uncertaintySemiMajor = null;
      uncertaintySemiMinor = null;
      orientationMajorAxis = null;
      uncertaintyAltitude = null;
      confidence = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return latitudeSign;
         case 1: return degreesLatitude;
         case 2: return degreesLongitude;
         case 3: return altitudeDirection;
         case 4: return altitude;
         case 5: return uncertaintySemiMajor;
         case 6: return uncertaintySemiMinor;
         case 7: return orientationMajorAxis;
         case 8: return uncertaintyAltitude;
         case 9: return confidence;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "latitudeSign";
         case 1: return "degreesLatitude";
         case 2: return "degreesLongitude";
         case 3: return "altitudeDirection";
         case 4: return "altitude";
         case 5: return "uncertaintySemiMajor";
         case 6: return "uncertaintySemiMinor";
         case 7: return "orientationMajorAxis";
         case 8: return "uncertaintyAltitude";
         case 9: return "confidence";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode latitudeSign

      buffer.getContext().eventDispatcher.startElement("latitudeSign", -1);

      {
         int tval = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign.decodeEnumValue (buffer);
         latitudeSign = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("latitudeSign", -1);

      // decode degreesLatitude

      buffer.getContext().eventDispatcher.startElement("degreesLatitude", -1);

      degreesLatitude = new Asn1Integer();
      degreesLatitude.decode (buffer, 0, 8388607);
      buffer.getContext().eventDispatcher.endElement("degreesLatitude", -1);

      // decode degreesLongitude

      buffer.getContext().eventDispatcher.startElement("degreesLongitude", -1);

      degreesLongitude = new Asn1Integer();
      degreesLongitude.decode (buffer, -8388608, 8388607);
      buffer.getContext().eventDispatcher.endElement("degreesLongitude", -1);

      // decode altitudeDirection

      buffer.getContext().eventDispatcher.startElement("altitudeDirection", -1);

      {
         int tval = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection.decodeEnumValue (buffer);
         altitudeDirection = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("altitudeDirection", -1);

      // decode altitude

      buffer.getContext().eventDispatcher.startElement("altitude", -1);

      altitude = new Asn1Integer();
      altitude.decode (buffer, 0, 32767);
      buffer.getContext().eventDispatcher.endElement("altitude", -1);

      // decode uncertaintySemiMajor

      buffer.getContext().eventDispatcher.startElement("uncertaintySemiMajor", -1);

      uncertaintySemiMajor = new Asn1Integer();
      uncertaintySemiMajor.decode (buffer, 0, 127);
      buffer.getContext().eventDispatcher.endElement("uncertaintySemiMajor", -1);

      // decode uncertaintySemiMinor

      buffer.getContext().eventDispatcher.startElement("uncertaintySemiMinor", -1);

      uncertaintySemiMinor = new Asn1Integer();
      uncertaintySemiMinor.decode (buffer, 0, 127);
      buffer.getContext().eventDispatcher.endElement("uncertaintySemiMinor", -1);

      // decode orientationMajorAxis

      buffer.getContext().eventDispatcher.startElement("orientationMajorAxis", -1);

      orientationMajorAxis = new Asn1Integer();
      orientationMajorAxis.decode (buffer, 0, 179);
      buffer.getContext().eventDispatcher.endElement("orientationMajorAxis", -1);

      // decode uncertaintyAltitude

      buffer.getContext().eventDispatcher.startElement("uncertaintyAltitude", -1);

      uncertaintyAltitude = new Asn1Integer();
      uncertaintyAltitude.decode (buffer, 0, 127);
      buffer.getContext().eventDispatcher.endElement("uncertaintyAltitude", -1);

      // decode confidence

      buffer.getContext().eventDispatcher.startElement("confidence", -1);

      confidence = new Asn1Integer();
      confidence.decode (buffer, 0, 100);
      buffer.getContext().eventDispatcher.endElement("confidence", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode latitudeSign

      if (latitudeSign != null) {
         buffer.getContext().eventDispatcher.startElement("latitudeSign", -1);

         latitudeSign.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("latitudeSign", -1);
      }
      else throw new Asn1MissingRequiredException ("latitudeSign");

      // encode degreesLatitude

      if (degreesLatitude != null) {
         buffer.getContext().eventDispatcher.startElement("degreesLatitude", -1);

         degreesLatitude.encode (buffer, 0, 8388607);

         buffer.getContext().eventDispatcher.endElement("degreesLatitude", -1);
      }
      else throw new Asn1MissingRequiredException ("degreesLatitude");

      // encode degreesLongitude

      if (degreesLongitude != null) {
         buffer.getContext().eventDispatcher.startElement("degreesLongitude", -1);

         degreesLongitude.encode (buffer, -8388608, 8388607);

         buffer.getContext().eventDispatcher.endElement("degreesLongitude", -1);
      }
      else throw new Asn1MissingRequiredException ("degreesLongitude");

      // encode altitudeDirection

      if (altitudeDirection != null) {
         buffer.getContext().eventDispatcher.startElement("altitudeDirection", -1);

         altitudeDirection.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("altitudeDirection", -1);
      }
      else throw new Asn1MissingRequiredException ("altitudeDirection");

      // encode altitude

      if (altitude != null) {
         buffer.getContext().eventDispatcher.startElement("altitude", -1);

         altitude.encode (buffer, 0, 32767);

         buffer.getContext().eventDispatcher.endElement("altitude", -1);
      }
      else throw new Asn1MissingRequiredException ("altitude");

      // encode uncertaintySemiMajor

      if (uncertaintySemiMajor != null) {
         buffer.getContext().eventDispatcher.startElement("uncertaintySemiMajor", -1);

         uncertaintySemiMajor.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("uncertaintySemiMajor", -1);
      }
      else throw new Asn1MissingRequiredException ("uncertaintySemiMajor");

      // encode uncertaintySemiMinor

      if (uncertaintySemiMinor != null) {
         buffer.getContext().eventDispatcher.startElement("uncertaintySemiMinor", -1);

         uncertaintySemiMinor.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("uncertaintySemiMinor", -1);
      }
      else throw new Asn1MissingRequiredException ("uncertaintySemiMinor");

      // encode orientationMajorAxis

      if (orientationMajorAxis != null) {
         buffer.getContext().eventDispatcher.startElement("orientationMajorAxis", -1);

         orientationMajorAxis.encode (buffer, 0, 179);

         buffer.getContext().eventDispatcher.endElement("orientationMajorAxis", -1);
      }
      else throw new Asn1MissingRequiredException ("orientationMajorAxis");

      // encode uncertaintyAltitude

      if (uncertaintyAltitude != null) {
         buffer.getContext().eventDispatcher.startElement("uncertaintyAltitude", -1);

         uncertaintyAltitude.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("uncertaintyAltitude", -1);
      }
      else throw new Asn1MissingRequiredException ("uncertaintyAltitude");

      // encode confidence

      if (confidence != null) {
         buffer.getContext().eventDispatcher.startElement("confidence", -1);

         confidence.encode (buffer, 0, 100);

         buffer.getContext().eventDispatcher.endElement("confidence", -1);
      }
      else throw new Asn1MissingRequiredException ("confidence");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (latitudeSign != null) latitudeSign.print (_sb, "latitudeSign", _level+1);
      if (degreesLatitude != null) degreesLatitude.print (_sb, "degreesLatitude", _level+1);
      if (degreesLongitude != null) degreesLongitude.print (_sb, "degreesLongitude", _level+1);
      if (altitudeDirection != null) altitudeDirection.print (_sb, "altitudeDirection", _level+1);
      if (altitude != null) altitude.print (_sb, "altitude", _level+1);
      if (uncertaintySemiMajor != null) uncertaintySemiMajor.print (_sb, "uncertaintySemiMajor", _level+1);
      if (uncertaintySemiMinor != null) uncertaintySemiMinor.print (_sb, "uncertaintySemiMinor", _level+1);
      if (orientationMajorAxis != null) orientationMajorAxis.print (_sb, "orientationMajorAxis", _level+1);
      if (uncertaintyAltitude != null) uncertaintyAltitude.print (_sb, "uncertaintyAltitude", _level+1);
      if (confidence != null) confidence.print (_sb, "confidence", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
