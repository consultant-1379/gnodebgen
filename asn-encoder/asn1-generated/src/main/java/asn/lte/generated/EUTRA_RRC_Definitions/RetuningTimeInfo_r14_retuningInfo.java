/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RetuningTimeInfo_r14_retuningInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeDL_r14 rf_RetuningTimeDL_r14 = null;  // optional
   public RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeUL_r14 rf_RetuningTimeUL_r14 = null;  // optional

   public RetuningTimeInfo_r14_retuningInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RetuningTimeInfo_r14_retuningInfo (
      RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeDL_r14 rf_RetuningTimeDL_r14_,
      RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeUL_r14 rf_RetuningTimeUL_r14_
   ) {
      super();
      rf_RetuningTimeDL_r14 = rf_RetuningTimeDL_r14_;
      rf_RetuningTimeUL_r14 = rf_RetuningTimeUL_r14_;
   }

   public void init () {
      rf_RetuningTimeDL_r14 = null;
      rf_RetuningTimeUL_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rf_RetuningTimeDL_r14;
         case 1: return rf_RetuningTimeUL_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rf-RetuningTimeDL-r14";
         case 1: return "rf-RetuningTimeUL-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rf_RetuningTimeDL_r14Present = buffer.decodeBit ("rf_RetuningTimeDL_r14Present");
      boolean rf_RetuningTimeUL_r14Present = buffer.decodeBit ("rf_RetuningTimeUL_r14Present");

      // decode rf_RetuningTimeDL_r14

      if (rf_RetuningTimeDL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("rf_RetuningTimeDL_r14", -1);

         int tval = RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeDL_r14.decodeEnumValue (buffer);
         rf_RetuningTimeDL_r14 = RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeDL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rf_RetuningTimeDL_r14", -1);
      }
      else {
         rf_RetuningTimeDL_r14 = null;
      }

      // decode rf_RetuningTimeUL_r14

      if (rf_RetuningTimeUL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("rf_RetuningTimeUL_r14", -1);

         int tval = RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeUL_r14.decodeEnumValue (buffer);
         rf_RetuningTimeUL_r14 = RetuningTimeInfo_r14_retuningInfo_rf_RetuningTimeUL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rf_RetuningTimeUL_r14", -1);
      }
      else {
         rf_RetuningTimeUL_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rf_RetuningTimeDL_r14 != null) rf_RetuningTimeDL_r14.print (_sb, "rf_RetuningTimeDL_r14", _level+1);
      if (rf_RetuningTimeUL_r14 != null) rf_RetuningTimeUL_r14.print (_sb, "rf_RetuningTimeUL_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
