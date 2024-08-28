/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SpeedStateScaleFactors extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SpeedStateScaleFactors";
   }

   public SpeedStateScaleFactors_sf_Medium sf_Medium = null;
   public SpeedStateScaleFactors_sf_High sf_High = null;

   public SpeedStateScaleFactors () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SpeedStateScaleFactors (
      SpeedStateScaleFactors_sf_Medium sf_Medium_,
      SpeedStateScaleFactors_sf_High sf_High_
   ) {
      super();
      sf_Medium = sf_Medium_;
      sf_High = sf_High_;
   }

   public void init () {
      sf_Medium = null;
      sf_High = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sf_Medium;
         case 1: return sf_High;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sf-Medium";
         case 1: return "sf-High";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode sf_Medium

      buffer.getContext().eventDispatcher.startElement("sf_Medium", -1);

      {
         int tval = SpeedStateScaleFactors_sf_Medium.decodeEnumValue (buffer);
         sf_Medium = SpeedStateScaleFactors_sf_Medium.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sf_Medium", -1);

      // decode sf_High

      buffer.getContext().eventDispatcher.startElement("sf_High", -1);

      {
         int tval = SpeedStateScaleFactors_sf_High.decodeEnumValue (buffer);
         sf_High = SpeedStateScaleFactors_sf_High.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sf_High", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode sf_Medium

      if (sf_Medium != null) {
         buffer.getContext().eventDispatcher.startElement("sf_Medium", -1);

         sf_Medium.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sf_Medium", -1);
      }
      else throw new Asn1MissingRequiredException ("sf_Medium");

      // encode sf_High

      if (sf_High != null) {
         buffer.getContext().eventDispatcher.startElement("sf_High", -1);

         sf_High.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sf_High", -1);
      }
      else throw new Asn1MissingRequiredException ("sf_High");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sf_Medium != null) sf_Medium.print (_sb, "sf_Medium", _level+1);
      if (sf_High != null) sf_High.print (_sb, "sf_High", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
