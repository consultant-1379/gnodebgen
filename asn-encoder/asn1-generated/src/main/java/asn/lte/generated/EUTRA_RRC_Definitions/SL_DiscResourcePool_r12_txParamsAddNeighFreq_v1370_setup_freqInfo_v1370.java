/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscResourcePool_r12_txParamsAddNeighFreq_v1370_setup_freqInfo_v1370 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public AdditionalSpectrumEmission_v10l0 additionalSpectrumEmission_v1370;

   public SL_DiscResourcePool_r12_txParamsAddNeighFreq_v1370_setup_freqInfo_v1370 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_DiscResourcePool_r12_txParamsAddNeighFreq_v1370_setup_freqInfo_v1370 (
      AdditionalSpectrumEmission_v10l0 additionalSpectrumEmission_v1370_
   ) {
      super();
      additionalSpectrumEmission_v1370 = additionalSpectrumEmission_v1370_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_DiscResourcePool_r12_txParamsAddNeighFreq_v1370_setup_freqInfo_v1370 (long additionalSpectrumEmission_v1370_
   ) {
      super();
      additionalSpectrumEmission_v1370 = new AdditionalSpectrumEmission_v10l0 (additionalSpectrumEmission_v1370_);
   }

   public void init () {
      additionalSpectrumEmission_v1370 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return additionalSpectrumEmission_v1370;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "additionalSpectrumEmission-v1370";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode additionalSpectrumEmission_v1370

      buffer.getContext().eventDispatcher.startElement("additionalSpectrumEmission_v1370", -1);

      additionalSpectrumEmission_v1370 = new AdditionalSpectrumEmission_v10l0();
      additionalSpectrumEmission_v1370.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("additionalSpectrumEmission_v1370", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (additionalSpectrumEmission_v1370 != null) additionalSpectrumEmission_v1370.print (_sb, "additionalSpectrumEmission_v1370", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
