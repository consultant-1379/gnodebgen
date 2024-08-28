/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer threeTone_BaseSequence_r13;  // optional
   public Asn1Integer threeTone_CyclicShift_r13;
   public Asn1Integer sixTone_BaseSequence_r13;  // optional
   public Asn1Integer sixTone_CyclicShift_r13;
   public Asn1Integer twelveTone_BaseSequence_r13;  // optional

   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 (
      Asn1Integer threeTone_BaseSequence_r13_,
      Asn1Integer threeTone_CyclicShift_r13_,
      Asn1Integer sixTone_BaseSequence_r13_,
      Asn1Integer sixTone_CyclicShift_r13_,
      Asn1Integer twelveTone_BaseSequence_r13_
   ) {
      super();
      threeTone_BaseSequence_r13 = threeTone_BaseSequence_r13_;
      threeTone_CyclicShift_r13 = threeTone_CyclicShift_r13_;
      sixTone_BaseSequence_r13 = sixTone_BaseSequence_r13_;
      sixTone_CyclicShift_r13 = sixTone_CyclicShift_r13_;
      twelveTone_BaseSequence_r13 = twelveTone_BaseSequence_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 (
      Asn1Integer threeTone_CyclicShift_r13_,
      Asn1Integer sixTone_CyclicShift_r13_
   ) {
      super();
      threeTone_CyclicShift_r13 = threeTone_CyclicShift_r13_;
      sixTone_CyclicShift_r13 = sixTone_CyclicShift_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 (long threeTone_BaseSequence_r13_,
      long threeTone_CyclicShift_r13_,
      long sixTone_BaseSequence_r13_,
      long sixTone_CyclicShift_r13_,
      long twelveTone_BaseSequence_r13_
   ) {
      super();
      threeTone_BaseSequence_r13 = new Asn1Integer (threeTone_BaseSequence_r13_);
      threeTone_CyclicShift_r13 = new Asn1Integer (threeTone_CyclicShift_r13_);
      sixTone_BaseSequence_r13 = new Asn1Integer (sixTone_BaseSequence_r13_);
      sixTone_CyclicShift_r13 = new Asn1Integer (sixTone_CyclicShift_r13_);
      twelveTone_BaseSequence_r13 = new Asn1Integer (twelveTone_BaseSequence_r13_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public NPUSCH_ConfigCommon_NB_r13_dmrs_Config_r13 (
      long threeTone_CyclicShift_r13_,
      long sixTone_CyclicShift_r13_
   ) {
      super();
      threeTone_CyclicShift_r13 = new Asn1Integer (threeTone_CyclicShift_r13_);
      sixTone_CyclicShift_r13 = new Asn1Integer (sixTone_CyclicShift_r13_);
   }

   public void init () {
      threeTone_BaseSequence_r13 = null;
      threeTone_CyclicShift_r13 = null;
      sixTone_BaseSequence_r13 = null;
      sixTone_CyclicShift_r13 = null;
      twelveTone_BaseSequence_r13 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return threeTone_BaseSequence_r13;
         case 1: return threeTone_CyclicShift_r13;
         case 2: return sixTone_BaseSequence_r13;
         case 3: return sixTone_CyclicShift_r13;
         case 4: return twelveTone_BaseSequence_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "threeTone-BaseSequence-r13";
         case 1: return "threeTone-CyclicShift-r13";
         case 2: return "sixTone-BaseSequence-r13";
         case 3: return "sixTone-CyclicShift-r13";
         case 4: return "twelveTone-BaseSequence-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean threeTone_BaseSequence_r13Present = buffer.decodeBit ("threeTone_BaseSequence_r13Present");
      boolean sixTone_BaseSequence_r13Present = buffer.decodeBit ("sixTone_BaseSequence_r13Present");
      boolean twelveTone_BaseSequence_r13Present = buffer.decodeBit ("twelveTone_BaseSequence_r13Present");

      // decode threeTone_BaseSequence_r13

      if (threeTone_BaseSequence_r13Present) {
         buffer.getContext().eventDispatcher.startElement("threeTone_BaseSequence_r13", -1);

         threeTone_BaseSequence_r13 = new Asn1Integer();
         threeTone_BaseSequence_r13.decode (buffer, 0, 12);

         buffer.invokeCharacters(threeTone_BaseSequence_r13.toString());
         buffer.getContext().eventDispatcher.endElement("threeTone_BaseSequence_r13", -1);
      }
      else {
         threeTone_BaseSequence_r13 = null;
      }

      // decode threeTone_CyclicShift_r13

      buffer.getContext().eventDispatcher.startElement("threeTone_CyclicShift_r13", -1);

      threeTone_CyclicShift_r13 = new Asn1Integer();
      threeTone_CyclicShift_r13.decode (buffer, 0, 2);

      buffer.invokeCharacters(threeTone_CyclicShift_r13.toString());
      buffer.getContext().eventDispatcher.endElement("threeTone_CyclicShift_r13", -1);

      // decode sixTone_BaseSequence_r13

      if (sixTone_BaseSequence_r13Present) {
         buffer.getContext().eventDispatcher.startElement("sixTone_BaseSequence_r13", -1);

         sixTone_BaseSequence_r13 = new Asn1Integer();
         sixTone_BaseSequence_r13.decode (buffer, 0, 14);

         buffer.invokeCharacters(sixTone_BaseSequence_r13.toString());
         buffer.getContext().eventDispatcher.endElement("sixTone_BaseSequence_r13", -1);
      }
      else {
         sixTone_BaseSequence_r13 = null;
      }

      // decode sixTone_CyclicShift_r13

      buffer.getContext().eventDispatcher.startElement("sixTone_CyclicShift_r13", -1);

      sixTone_CyclicShift_r13 = new Asn1Integer();
      sixTone_CyclicShift_r13.decode (buffer, 0, 3);

      buffer.invokeCharacters(sixTone_CyclicShift_r13.toString());
      buffer.getContext().eventDispatcher.endElement("sixTone_CyclicShift_r13", -1);

      // decode twelveTone_BaseSequence_r13

      if (twelveTone_BaseSequence_r13Present) {
         buffer.getContext().eventDispatcher.startElement("twelveTone_BaseSequence_r13", -1);

         twelveTone_BaseSequence_r13 = new Asn1Integer();
         twelveTone_BaseSequence_r13.decode (buffer, 0, 30);

         buffer.invokeCharacters(twelveTone_BaseSequence_r13.toString());
         buffer.getContext().eventDispatcher.endElement("twelveTone_BaseSequence_r13", -1);
      }
      else {
         twelveTone_BaseSequence_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (threeTone_BaseSequence_r13 != null) threeTone_BaseSequence_r13.print (_sb, "threeTone_BaseSequence_r13", _level+1);
      if (threeTone_CyclicShift_r13 != null) threeTone_CyclicShift_r13.print (_sb, "threeTone_CyclicShift_r13", _level+1);
      if (sixTone_BaseSequence_r13 != null) sixTone_BaseSequence_r13.print (_sb, "sixTone_BaseSequence_r13", _level+1);
      if (sixTone_CyclicShift_r13 != null) sixTone_CyclicShift_r13.print (_sb, "sixTone_CyclicShift_r13", _level+1);
      if (twelveTone_BaseSequence_r13 != null) twelveTone_BaseSequence_r13.print (_sb, "twelveTone_BaseSequence_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
