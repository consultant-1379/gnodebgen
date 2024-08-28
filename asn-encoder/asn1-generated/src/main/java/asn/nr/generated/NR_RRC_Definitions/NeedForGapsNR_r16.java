/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NeedForGapsNR_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NeedForGapsNR-r16";
   }

   public FreqBandIndicatorNR bandNR_r16;
   public NeedForGapsNR_r16_gapIndication_r16 gapIndication_r16 = null;

   public NeedForGapsNR_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NeedForGapsNR_r16 (
      FreqBandIndicatorNR bandNR_r16_,
      NeedForGapsNR_r16_gapIndication_r16 gapIndication_r16_
   ) {
      super();
      bandNR_r16 = bandNR_r16_;
      gapIndication_r16 = gapIndication_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NeedForGapsNR_r16 (long bandNR_r16_,
      NeedForGapsNR_r16_gapIndication_r16 gapIndication_r16_
   ) {
      super();
      bandNR_r16 = new FreqBandIndicatorNR (bandNR_r16_);
      gapIndication_r16 = gapIndication_r16_;
   }

   public void init () {
      bandNR_r16 = null;
      gapIndication_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandNR_r16;
         case 1: return gapIndication_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandNR-r16";
         case 1: return "gapIndication-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode bandNR_r16

      buffer.getContext().eventDispatcher.startElement("bandNR_r16", -1);

      bandNR_r16 = new FreqBandIndicatorNR();
      bandNR_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandNR_r16", -1);

      // decode gapIndication_r16

      buffer.getContext().eventDispatcher.startElement("gapIndication_r16", -1);

      {
         int tval = NeedForGapsNR_r16_gapIndication_r16.decodeEnumValue (buffer);
         gapIndication_r16 = NeedForGapsNR_r16_gapIndication_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("gapIndication_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode bandNR_r16

      if (bandNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("bandNR_r16", -1);

         bandNR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bandNR_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("bandNR_r16");

      // encode gapIndication_r16

      if (gapIndication_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("gapIndication_r16", -1);

         gapIndication_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("gapIndication_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("gapIndication_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandNR_r16 != null) bandNR_r16.print (_sb, "bandNR_r16", _level+1);
      if (gapIndication_r16 != null) gapIndication_r16.print (_sb, "gapIndication_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
