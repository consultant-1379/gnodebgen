/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultSensing_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultSensing-r15";
   }

   public Asn1Integer sl_SubframeRef_r15;
   public MeasResultSensing_r15_sensingResult_r15 sensingResult_r15;

   public MeasResultSensing_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultSensing_r15 (
      Asn1Integer sl_SubframeRef_r15_,
      MeasResultSensing_r15_sensingResult_r15 sensingResult_r15_
   ) {
      super();
      sl_SubframeRef_r15 = sl_SubframeRef_r15_;
      sensingResult_r15 = sensingResult_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultSensing_r15 (long sl_SubframeRef_r15_,
      MeasResultSensing_r15_sensingResult_r15 sensingResult_r15_
   ) {
      super();
      sl_SubframeRef_r15 = new Asn1Integer (sl_SubframeRef_r15_);
      sensingResult_r15 = sensingResult_r15_;
   }

   public void init () {
      sl_SubframeRef_r15 = null;
      sensingResult_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_SubframeRef_r15;
         case 1: return sensingResult_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-SubframeRef-r15";
         case 1: return "sensingResult-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode sl_SubframeRef_r15

      buffer.getContext().eventDispatcher.startElement("sl_SubframeRef_r15", -1);

      sl_SubframeRef_r15 = new Asn1Integer();
      sl_SubframeRef_r15.decode (buffer, 0, 10239);

      buffer.invokeCharacters(sl_SubframeRef_r15.toString());
      buffer.getContext().eventDispatcher.endElement("sl_SubframeRef_r15", -1);

      // decode sensingResult_r15

      buffer.getContext().eventDispatcher.startElement("sensingResult_r15", -1);

      sensingResult_r15 = new MeasResultSensing_r15_sensingResult_r15();
      sensingResult_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sensingResult_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_SubframeRef_r15 != null) sl_SubframeRef_r15.print (_sb, "sl_SubframeRef_r15", _level+1);
      if (sensingResult_r15 != null) sensingResult_r15.print (_sb, "sensingResult_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
