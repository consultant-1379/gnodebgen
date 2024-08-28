/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_UL_ConfigDedicatedAperiodic_v1430_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer srs_SubframeIndication_r14;  // optional

   public SoundingRS_UL_ConfigDedicatedAperiodic_v1430_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SoundingRS_UL_ConfigDedicatedAperiodic_v1430_setup (
      Asn1Integer srs_SubframeIndication_r14_
   ) {
      super();
      srs_SubframeIndication_r14 = srs_SubframeIndication_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SoundingRS_UL_ConfigDedicatedAperiodic_v1430_setup (long srs_SubframeIndication_r14_
   ) {
      super();
      srs_SubframeIndication_r14 = new Asn1Integer (srs_SubframeIndication_r14_);
   }

   public void init () {
      srs_SubframeIndication_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srs_SubframeIndication_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srs-SubframeIndication-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean srs_SubframeIndication_r14Present = buffer.decodeBit ("srs_SubframeIndication_r14Present");

      // decode srs_SubframeIndication_r14

      if (srs_SubframeIndication_r14Present) {
         buffer.getContext().eventDispatcher.startElement("srs_SubframeIndication_r14", -1);

         srs_SubframeIndication_r14 = new Asn1Integer();
         srs_SubframeIndication_r14.decode (buffer, 1, 4);

         buffer.invokeCharacters(srs_SubframeIndication_r14.toString());
         buffer.getContext().eventDispatcher.endElement("srs_SubframeIndication_r14", -1);
      }
      else {
         srs_SubframeIndication_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srs_SubframeIndication_r14 != null) srs_SubframeIndication_r14.print (_sb, "srs_SubframeIndication_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
