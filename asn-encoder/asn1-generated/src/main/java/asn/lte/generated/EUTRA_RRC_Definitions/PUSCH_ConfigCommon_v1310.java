/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigCommon_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-ConfigCommon-v1310";
   }

   public PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeA_r13 pusch_maxNumRepetitionCEmodeA_r13 = null;  // optional
   public PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeB_r13 pusch_maxNumRepetitionCEmodeB_r13 = null;  // optional
   public Asn1Integer pusch_HoppingOffset_v1310;  // optional

   public PUSCH_ConfigCommon_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigCommon_v1310 (
      PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeA_r13 pusch_maxNumRepetitionCEmodeA_r13_,
      PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeB_r13 pusch_maxNumRepetitionCEmodeB_r13_,
      Asn1Integer pusch_HoppingOffset_v1310_
   ) {
      super();
      pusch_maxNumRepetitionCEmodeA_r13 = pusch_maxNumRepetitionCEmodeA_r13_;
      pusch_maxNumRepetitionCEmodeB_r13 = pusch_maxNumRepetitionCEmodeB_r13_;
      pusch_HoppingOffset_v1310 = pusch_HoppingOffset_v1310_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_ConfigCommon_v1310 (PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeA_r13 pusch_maxNumRepetitionCEmodeA_r13_,
      PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeB_r13 pusch_maxNumRepetitionCEmodeB_r13_,
      long pusch_HoppingOffset_v1310_
   ) {
      super();
      pusch_maxNumRepetitionCEmodeA_r13 = pusch_maxNumRepetitionCEmodeA_r13_;
      pusch_maxNumRepetitionCEmodeB_r13 = pusch_maxNumRepetitionCEmodeB_r13_;
      pusch_HoppingOffset_v1310 = new Asn1Integer (pusch_HoppingOffset_v1310_);
   }

   public void init () {
      pusch_maxNumRepetitionCEmodeA_r13 = null;
      pusch_maxNumRepetitionCEmodeB_r13 = null;
      pusch_HoppingOffset_v1310 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pusch_maxNumRepetitionCEmodeA_r13;
         case 1: return pusch_maxNumRepetitionCEmodeB_r13;
         case 2: return pusch_HoppingOffset_v1310;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pusch-maxNumRepetitionCEmodeA-r13";
         case 1: return "pusch-maxNumRepetitionCEmodeB-r13";
         case 2: return "pusch-HoppingOffset-v1310";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pusch_maxNumRepetitionCEmodeA_r13Present = buffer.decodeBit ("pusch_maxNumRepetitionCEmodeA_r13Present");
      boolean pusch_maxNumRepetitionCEmodeB_r13Present = buffer.decodeBit ("pusch_maxNumRepetitionCEmodeB_r13Present");
      boolean pusch_HoppingOffset_v1310Present = buffer.decodeBit ("pusch_HoppingOffset_v1310Present");

      // decode pusch_maxNumRepetitionCEmodeA_r13

      if (pusch_maxNumRepetitionCEmodeA_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_maxNumRepetitionCEmodeA_r13", -1);

         int tval = PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeA_r13.decodeEnumValue (buffer);
         pusch_maxNumRepetitionCEmodeA_r13 = PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeA_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pusch_maxNumRepetitionCEmodeA_r13", -1);
      }
      else {
         pusch_maxNumRepetitionCEmodeA_r13 = null;
      }

      // decode pusch_maxNumRepetitionCEmodeB_r13

      if (pusch_maxNumRepetitionCEmodeB_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_maxNumRepetitionCEmodeB_r13", -1);

         int tval = PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeB_r13.decodeEnumValue (buffer);
         pusch_maxNumRepetitionCEmodeB_r13 = PUSCH_ConfigCommon_v1310_pusch_maxNumRepetitionCEmodeB_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pusch_maxNumRepetitionCEmodeB_r13", -1);
      }
      else {
         pusch_maxNumRepetitionCEmodeB_r13 = null;
      }

      // decode pusch_HoppingOffset_v1310

      if (pusch_HoppingOffset_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_HoppingOffset_v1310", -1);

         pusch_HoppingOffset_v1310 = new Asn1Integer();
         pusch_HoppingOffset_v1310.decode (buffer, 1, 16);

         buffer.invokeCharacters(pusch_HoppingOffset_v1310.toString());
         buffer.getContext().eventDispatcher.endElement("pusch_HoppingOffset_v1310", -1);
      }
      else {
         pusch_HoppingOffset_v1310 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pusch_maxNumRepetitionCEmodeA_r13 != null) pusch_maxNumRepetitionCEmodeA_r13.print (_sb, "pusch_maxNumRepetitionCEmodeA_r13", _level+1);
      if (pusch_maxNumRepetitionCEmodeB_r13 != null) pusch_maxNumRepetitionCEmodeB_r13.print (_sb, "pusch_maxNumRepetitionCEmodeB_r13", _level+1);
      if (pusch_HoppingOffset_v1310 != null) pusch_HoppingOffset_v1310.print (_sb, "pusch_HoppingOffset_v1310", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
