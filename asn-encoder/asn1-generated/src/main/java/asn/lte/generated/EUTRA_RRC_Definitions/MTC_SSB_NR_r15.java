/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MTC_SSB_NR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MTC-SSB-NR-r15";
   }

   public MTC_SSB_NR_r15_periodicityAndOffset_r15 periodicityAndOffset_r15;
   public MTC_SSB_NR_r15_ssb_Duration_r15 ssb_Duration_r15 = null;

   public MTC_SSB_NR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MTC_SSB_NR_r15 (
      MTC_SSB_NR_r15_periodicityAndOffset_r15 periodicityAndOffset_r15_,
      MTC_SSB_NR_r15_ssb_Duration_r15 ssb_Duration_r15_
   ) {
      super();
      periodicityAndOffset_r15 = periodicityAndOffset_r15_;
      ssb_Duration_r15 = ssb_Duration_r15_;
   }

   public void init () {
      periodicityAndOffset_r15 = null;
      ssb_Duration_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return periodicityAndOffset_r15;
         case 1: return ssb_Duration_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "periodicityAndOffset-r15";
         case 1: return "ssb-Duration-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode periodicityAndOffset_r15

      buffer.getContext().eventDispatcher.startElement("periodicityAndOffset_r15", -1);

      periodicityAndOffset_r15 = new MTC_SSB_NR_r15_periodicityAndOffset_r15();
      periodicityAndOffset_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("periodicityAndOffset_r15", -1);

      // decode ssb_Duration_r15

      buffer.getContext().eventDispatcher.startElement("ssb_Duration_r15", -1);

      {
         int tval = MTC_SSB_NR_r15_ssb_Duration_r15.decodeEnumValue (buffer);
         ssb_Duration_r15 = MTC_SSB_NR_r15_ssb_Duration_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ssb_Duration_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (periodicityAndOffset_r15 != null) periodicityAndOffset_r15.print (_sb, "periodicityAndOffset_r15", _level+1);
      if (ssb_Duration_r15 != null) ssb_Duration_r15.print (_sb, "ssb_Duration_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
