/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SI_RequestConfig_rach_OccasionsSI extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RACH_ConfigGeneric rach_ConfigSI;
   public SI_RequestConfig_rach_OccasionsSI_ssb_perRACH_Occasion ssb_perRACH_Occasion = null;

   public SI_RequestConfig_rach_OccasionsSI () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SI_RequestConfig_rach_OccasionsSI (
      RACH_ConfigGeneric rach_ConfigSI_,
      SI_RequestConfig_rach_OccasionsSI_ssb_perRACH_Occasion ssb_perRACH_Occasion_
   ) {
      super();
      rach_ConfigSI = rach_ConfigSI_;
      ssb_perRACH_Occasion = ssb_perRACH_Occasion_;
   }

   public void init () {
      rach_ConfigSI = null;
      ssb_perRACH_Occasion = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rach_ConfigSI;
         case 1: return ssb_perRACH_Occasion;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rach-ConfigSI";
         case 1: return "ssb-perRACH-Occasion";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rach_ConfigSI

      buffer.getContext().eventDispatcher.startElement("rach_ConfigSI", -1);

      rach_ConfigSI = new RACH_ConfigGeneric();
      rach_ConfigSI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rach_ConfigSI", -1);

      // decode ssb_perRACH_Occasion

      buffer.getContext().eventDispatcher.startElement("ssb_perRACH_Occasion", -1);

      {
         int tval = SI_RequestConfig_rach_OccasionsSI_ssb_perRACH_Occasion.decodeEnumValue (buffer);
         ssb_perRACH_Occasion = SI_RequestConfig_rach_OccasionsSI_ssb_perRACH_Occasion.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ssb_perRACH_Occasion", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rach_ConfigSI != null) rach_ConfigSI.print (_sb, "rach_ConfigSI", _level+1);
      if (ssb_perRACH_Occasion != null) ssb_perRACH_Occasion.print (_sb, "ssb_perRACH_Occasion", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
