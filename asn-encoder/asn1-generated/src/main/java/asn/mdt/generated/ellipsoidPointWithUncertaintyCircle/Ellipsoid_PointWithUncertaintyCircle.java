/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 30-Dec-2020.
 */
package asn.mdt.generated.ellipsoidPointWithUncertaintyCircle;

import com.objsys.asn1j.runtime.*;

public class Ellipsoid_PointWithUncertaintyCircle extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_ellipsoidPointWithUncertaintyCircleRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Ellipsoid-PointWithUncertaintyCircle";
   }

   public Ellipsoid_PointWithUncertaintyCircle_latitudeSign latitudeSign = null;
   public Asn1Integer degreesLatitude;
   public Asn1Integer degreesLongitude;
   public Asn1Integer uncertainty;

   public Ellipsoid_PointWithUncertaintyCircle () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Ellipsoid_PointWithUncertaintyCircle (
      Ellipsoid_PointWithUncertaintyCircle_latitudeSign latitudeSign_,
      Asn1Integer degreesLatitude_,
      Asn1Integer degreesLongitude_,
      Asn1Integer uncertainty_
   ) {
      super();
      latitudeSign = latitudeSign_;
      degreesLatitude = degreesLatitude_;
      degreesLongitude = degreesLongitude_;
      uncertainty = uncertainty_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Ellipsoid_PointWithUncertaintyCircle (Ellipsoid_PointWithUncertaintyCircle_latitudeSign latitudeSign_,
      long degreesLatitude_,
      long degreesLongitude_,
      long uncertainty_
   ) {
      super();
      latitudeSign = latitudeSign_;
      degreesLatitude = new Asn1Integer (degreesLatitude_);
      degreesLongitude = new Asn1Integer (degreesLongitude_);
      uncertainty = new Asn1Integer (uncertainty_);
   }

   public void init () {
      latitudeSign = null;
      degreesLatitude = null;
      degreesLongitude = null;
      uncertainty = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return latitudeSign;
         case 1: return degreesLatitude;
         case 2: return degreesLongitude;
         case 3: return uncertainty;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "latitudeSign";
         case 1: return "degreesLatitude";
         case 2: return "degreesLongitude";
         case 3: return "uncertainty";
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
         int tval = Ellipsoid_PointWithUncertaintyCircle_latitudeSign.decodeEnumValue (buffer);
         latitudeSign = Ellipsoid_PointWithUncertaintyCircle_latitudeSign.valueOf (tval);
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

      // decode uncertainty

      buffer.getContext().eventDispatcher.startElement("uncertainty", -1);

      uncertainty = new Asn1Integer();
      uncertainty.decode (buffer, 0, 127);
      buffer.getContext().eventDispatcher.endElement("uncertainty", -1);

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

      // encode uncertainty

      if (uncertainty != null) {
         buffer.getContext().eventDispatcher.startElement("uncertainty", -1);

         uncertainty.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("uncertainty", -1);
      }
      else throw new Asn1MissingRequiredException ("uncertainty");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (latitudeSign != null) latitudeSign.print (_sb, "latitudeSign", _level+1);
      if (degreesLatitude != null) degreesLatitude.print (_sb, "degreesLatitude", _level+1);
      if (degreesLongitude != null) degreesLongitude.print (_sb, "degreesLongitude", _level+1);
      if (uncertainty != null) uncertainty.print (_sb, "uncertainty", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
