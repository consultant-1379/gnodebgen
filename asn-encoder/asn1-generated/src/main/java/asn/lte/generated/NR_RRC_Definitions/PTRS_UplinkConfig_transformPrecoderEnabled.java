/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PTRS_UplinkConfig_transformPrecoderEnabled extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PTRS_UplinkConfig_transformPrecoderEnabled_sampleDensity sampleDensity;
   public PTRS_UplinkConfig_transformPrecoderEnabled_timeDensityTransformPrecoding timeDensityTransformPrecoding = null;  // optional

   public PTRS_UplinkConfig_transformPrecoderEnabled () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PTRS_UplinkConfig_transformPrecoderEnabled (
      PTRS_UplinkConfig_transformPrecoderEnabled_sampleDensity sampleDensity_,
      PTRS_UplinkConfig_transformPrecoderEnabled_timeDensityTransformPrecoding timeDensityTransformPrecoding_
   ) {
      super();
      sampleDensity = sampleDensity_;
      timeDensityTransformPrecoding = timeDensityTransformPrecoding_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PTRS_UplinkConfig_transformPrecoderEnabled (
      PTRS_UplinkConfig_transformPrecoderEnabled_sampleDensity sampleDensity_
   ) {
      super();
      sampleDensity = sampleDensity_;
   }

   public void init () {
      sampleDensity = null;
      timeDensityTransformPrecoding = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sampleDensity;
         case 1: return timeDensityTransformPrecoding;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sampleDensity";
         case 1: return "timeDensityTransformPrecoding";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean timeDensityTransformPrecodingPresent = buffer.decodeBit ("timeDensityTransformPrecodingPresent");

      // decode sampleDensity

      buffer.getContext().eventDispatcher.startElement("sampleDensity", -1);

      sampleDensity = new PTRS_UplinkConfig_transformPrecoderEnabled_sampleDensity();
      sampleDensity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sampleDensity", -1);

      // decode timeDensityTransformPrecoding

      if (timeDensityTransformPrecodingPresent) {
         buffer.getContext().eventDispatcher.startElement("timeDensityTransformPrecoding", -1);

         int tval = PTRS_UplinkConfig_transformPrecoderEnabled_timeDensityTransformPrecoding.decodeEnumValue (buffer);
         timeDensityTransformPrecoding = PTRS_UplinkConfig_transformPrecoderEnabled_timeDensityTransformPrecoding.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("timeDensityTransformPrecoding", -1);
      }
      else {
         timeDensityTransformPrecoding = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sampleDensity != null) sampleDensity.print (_sb, "sampleDensity", _level+1);
      if (timeDensityTransformPrecoding != null) timeDensityTransformPrecoding.print (_sb, "timeDensityTransformPrecoding", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
