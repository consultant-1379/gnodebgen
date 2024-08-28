/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportFrameworkExt_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-ReportFrameworkExt-r16";
   }

   public Asn1Integer maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16;

   public CSI_ReportFrameworkExt_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_ReportFrameworkExt_r16 (
      Asn1Integer maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16_
   ) {
      super();
      maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16 = maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_ReportFrameworkExt_r16 (long maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16_
   ) {
      super();
      maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16 = new Asn1Integer (maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16_);
   }

   public void init () {
      maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberAperiodicCSI-PerBWP-ForCSI-ReportExt-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16", -1);

      maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16 = new Asn1Integer();
      maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16.decode (buffer, 5, 8);

      buffer.invokeCharacters(maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16 != null) maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16.print (_sb, "maxNumberAperiodicCSI_PerBWP_ForCSI_ReportExt_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
