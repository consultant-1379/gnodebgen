/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResults_measResultPCell_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RS_SINR_Range_r13 rs_sinr_Result_r13;

   public MeasResults_measResultPCell_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResults_measResultPCell_v1310 (
      RS_SINR_Range_r13 rs_sinr_Result_r13_
   ) {
      super();
      rs_sinr_Result_r13 = rs_sinr_Result_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResults_measResultPCell_v1310 (long rs_sinr_Result_r13_
   ) {
      super();
      rs_sinr_Result_r13 = new RS_SINR_Range_r13 (rs_sinr_Result_r13_);
   }

   public void init () {
      rs_sinr_Result_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rs_sinr_Result_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rs-sinr-Result-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rs_sinr_Result_r13

      buffer.getContext().eventDispatcher.startElement("rs_sinr_Result_r13", -1);

      rs_sinr_Result_r13 = new RS_SINR_Range_r13();
      rs_sinr_Result_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rs_sinr_Result_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rs_sinr_Result_r13 != null) rs_sinr_Result_r13.print (_sb, "rs_sinr_Result_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
