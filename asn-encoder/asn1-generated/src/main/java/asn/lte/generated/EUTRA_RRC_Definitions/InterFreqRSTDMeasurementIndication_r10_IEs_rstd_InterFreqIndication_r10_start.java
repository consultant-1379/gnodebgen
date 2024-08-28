/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InterFreqRSTDMeasurementIndication_r10_IEs_rstd_InterFreqIndication_r10_start extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSTD_InterFreqInfoList_r10 rstd_InterFreqInfoList_r10;

   public InterFreqRSTDMeasurementIndication_r10_IEs_rstd_InterFreqIndication_r10_start () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InterFreqRSTDMeasurementIndication_r10_IEs_rstd_InterFreqIndication_r10_start (
      RSTD_InterFreqInfoList_r10 rstd_InterFreqInfoList_r10_
   ) {
      super();
      rstd_InterFreqInfoList_r10 = rstd_InterFreqInfoList_r10_;
   }

   public void init () {
      rstd_InterFreqInfoList_r10 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rstd_InterFreqInfoList_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rstd-InterFreqInfoList-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rstd_InterFreqInfoList_r10

      buffer.getContext().eventDispatcher.startElement("rstd_InterFreqInfoList_r10", -1);

      rstd_InterFreqInfoList_r10 = new RSTD_InterFreqInfoList_r10();
      rstd_InterFreqInfoList_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rstd_InterFreqInfoList_r10", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rstd_InterFreqInfoList_r10 != null) rstd_InterFreqInfoList_r10.print (_sb, "rstd_InterFreqInfoList_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
