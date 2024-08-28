/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SI_RequestConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SI-RequestConfig";
   }

   public SI_RequestConfig_rach_OccasionsSI rach_OccasionsSI;  // optional
   public SI_RequestConfig_si_RequestPeriod si_RequestPeriod = null;  // optional
   public SI_RequestConfig_si_RequestResources si_RequestResources;

   public SI_RequestConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SI_RequestConfig (
      SI_RequestConfig_rach_OccasionsSI rach_OccasionsSI_,
      SI_RequestConfig_si_RequestPeriod si_RequestPeriod_,
      SI_RequestConfig_si_RequestResources si_RequestResources_
   ) {
      super();
      rach_OccasionsSI = rach_OccasionsSI_;
      si_RequestPeriod = si_RequestPeriod_;
      si_RequestResources = si_RequestResources_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SI_RequestConfig (
      SI_RequestConfig_si_RequestResources si_RequestResources_
   ) {
      super();
      si_RequestResources = si_RequestResources_;
   }

   public void init () {
      rach_OccasionsSI = null;
      si_RequestPeriod = null;
      si_RequestResources = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rach_OccasionsSI;
         case 1: return si_RequestPeriod;
         case 2: return si_RequestResources;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rach-OccasionsSI";
         case 1: return "si-RequestPeriod";
         case 2: return "si-RequestResources";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rach_OccasionsSIPresent = buffer.decodeBit ("rach_OccasionsSIPresent");
      boolean si_RequestPeriodPresent = buffer.decodeBit ("si_RequestPeriodPresent");

      // decode rach_OccasionsSI

      if (rach_OccasionsSIPresent) {
         buffer.getContext().eventDispatcher.startElement("rach_OccasionsSI", -1);

         rach_OccasionsSI = new SI_RequestConfig_rach_OccasionsSI();
         rach_OccasionsSI.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rach_OccasionsSI", -1);
      }
      else {
         rach_OccasionsSI = null;
      }

      // decode si_RequestPeriod

      if (si_RequestPeriodPresent) {
         buffer.getContext().eventDispatcher.startElement("si_RequestPeriod", -1);

         int tval = SI_RequestConfig_si_RequestPeriod.decodeEnumValue (buffer);
         si_RequestPeriod = SI_RequestConfig_si_RequestPeriod.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("si_RequestPeriod", -1);
      }
      else {
         si_RequestPeriod = null;
      }

      // decode si_RequestResources

      buffer.getContext().eventDispatcher.startElement("si_RequestResources", -1);

      si_RequestResources = new SI_RequestConfig_si_RequestResources();
      si_RequestResources.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("si_RequestResources", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rach_OccasionsSI != null) rach_OccasionsSI.print (_sb, "rach_OccasionsSI", _level+1);
      if (si_RequestPeriod != null) si_RequestPeriod.print (_sb, "si_RequestPeriod", _level+1);
      if (si_RequestResources != null) si_RequestResources.print (_sb, "si_RequestResources", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
