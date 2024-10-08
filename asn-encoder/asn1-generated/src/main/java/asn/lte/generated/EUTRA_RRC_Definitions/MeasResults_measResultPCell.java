/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResults_measResultPCell extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_Range rsrpResult;
   public RSRQ_Range rsrqResult;

   public MeasResults_measResultPCell () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResults_measResultPCell (
      RSRP_Range rsrpResult_,
      RSRQ_Range rsrqResult_
   ) {
      super();
      rsrpResult = rsrpResult_;
      rsrqResult = rsrqResult_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResults_measResultPCell (long rsrpResult_,
      long rsrqResult_
   ) {
      super();
      rsrpResult = new RSRP_Range (rsrpResult_);
      rsrqResult = new RSRQ_Range (rsrqResult_);
   }

   public void init () {
      rsrpResult = null;
      rsrqResult = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rsrpResult;
         case 1: return rsrqResult;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rsrpResult";
         case 1: return "rsrqResult";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rsrpResult

      buffer.getContext().eventDispatcher.startElement("rsrpResult", -1);

      rsrpResult = new RSRP_Range();
      rsrpResult.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrpResult", -1);

      // decode rsrqResult

      buffer.getContext().eventDispatcher.startElement("rsrqResult", -1);

      rsrqResult = new RSRQ_Range();
      rsrqResult.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrqResult", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rsrpResult != null) rsrpResult.print (_sb, "rsrpResult", _level+1);
      if (rsrqResult != null) rsrqResult.print (_sb, "rsrqResult", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
