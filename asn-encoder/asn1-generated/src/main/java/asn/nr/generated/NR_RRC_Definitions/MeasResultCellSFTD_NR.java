/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultCellSFTD_NR extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultCellSFTD-NR";
   }

   public PhysCellId physCellId;
   public Asn1Integer sfn_OffsetResult;
   public Asn1Integer frameBoundaryOffsetResult;
   public RSRP_Range rsrp_Result;  // optional

   public MeasResultCellSFTD_NR () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultCellSFTD_NR (
      PhysCellId physCellId_,
      Asn1Integer sfn_OffsetResult_,
      Asn1Integer frameBoundaryOffsetResult_,
      RSRP_Range rsrp_Result_
   ) {
      super();
      physCellId = physCellId_;
      sfn_OffsetResult = sfn_OffsetResult_;
      frameBoundaryOffsetResult = frameBoundaryOffsetResult_;
      rsrp_Result = rsrp_Result_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultCellSFTD_NR (
      PhysCellId physCellId_,
      Asn1Integer sfn_OffsetResult_,
      Asn1Integer frameBoundaryOffsetResult_
   ) {
      super();
      physCellId = physCellId_;
      sfn_OffsetResult = sfn_OffsetResult_;
      frameBoundaryOffsetResult = frameBoundaryOffsetResult_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultCellSFTD_NR (long physCellId_,
      long sfn_OffsetResult_,
      long frameBoundaryOffsetResult_,
      long rsrp_Result_
   ) {
      super();
      physCellId = new PhysCellId (physCellId_);
      sfn_OffsetResult = new Asn1Integer (sfn_OffsetResult_);
      frameBoundaryOffsetResult = new Asn1Integer (frameBoundaryOffsetResult_);
      rsrp_Result = new RSRP_Range (rsrp_Result_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultCellSFTD_NR (
      long physCellId_,
      long sfn_OffsetResult_,
      long frameBoundaryOffsetResult_
   ) {
      super();
      physCellId = new PhysCellId (physCellId_);
      sfn_OffsetResult = new Asn1Integer (sfn_OffsetResult_);
      frameBoundaryOffsetResult = new Asn1Integer (frameBoundaryOffsetResult_);
   }

   public void init () {
      physCellId = null;
      sfn_OffsetResult = null;
      frameBoundaryOffsetResult = null;
      rsrp_Result = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId;
         case 1: return sfn_OffsetResult;
         case 2: return frameBoundaryOffsetResult;
         case 3: return rsrp_Result;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId";
         case 1: return "sfn-OffsetResult";
         case 2: return "frameBoundaryOffsetResult";
         case 3: return "rsrp-Result";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rsrp_ResultPresent = buffer.decodeBit ("rsrp_ResultPresent");

      // decode physCellId

      buffer.getContext().eventDispatcher.startElement("physCellId", -1);

      physCellId = new PhysCellId();
      physCellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId", -1);

      // decode sfn_OffsetResult

      buffer.getContext().eventDispatcher.startElement("sfn_OffsetResult", -1);

      sfn_OffsetResult = new Asn1Integer();
      sfn_OffsetResult.decode (buffer, 0, 1023);

      buffer.invokeCharacters(sfn_OffsetResult.toString());
      buffer.getContext().eventDispatcher.endElement("sfn_OffsetResult", -1);

      // decode frameBoundaryOffsetResult

      buffer.getContext().eventDispatcher.startElement("frameBoundaryOffsetResult", -1);

      frameBoundaryOffsetResult = new Asn1Integer();
      frameBoundaryOffsetResult.decode (buffer, -30720, 30719);

      buffer.invokeCharacters(frameBoundaryOffsetResult.toString());
      buffer.getContext().eventDispatcher.endElement("frameBoundaryOffsetResult", -1);

      // decode rsrp_Result

      if (rsrp_ResultPresent) {
         buffer.getContext().eventDispatcher.startElement("rsrp_Result", -1);

         rsrp_Result = new RSRP_Range();
         rsrp_Result.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrp_Result", -1);
      }
      else {
         rsrp_Result = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((rsrp_Result != null), null);

      // encode physCellId

      if (physCellId != null) {
         buffer.getContext().eventDispatcher.startElement("physCellId", -1);

         physCellId.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("physCellId", -1);
      }
      else throw new Asn1MissingRequiredException ("physCellId");

      // encode sfn_OffsetResult

      if (sfn_OffsetResult != null) {
         buffer.getContext().eventDispatcher.startElement("sfn_OffsetResult", -1);

         sfn_OffsetResult.encode (buffer, 0, 1023);

         buffer.getContext().eventDispatcher.endElement("sfn_OffsetResult", -1);
      }
      else throw new Asn1MissingRequiredException ("sfn_OffsetResult");

      // encode frameBoundaryOffsetResult

      if (frameBoundaryOffsetResult != null) {
         buffer.getContext().eventDispatcher.startElement("frameBoundaryOffsetResult", -1);

         frameBoundaryOffsetResult.encode (buffer, -30720, 30719);

         buffer.getContext().eventDispatcher.endElement("frameBoundaryOffsetResult", -1);
      }
      else throw new Asn1MissingRequiredException ("frameBoundaryOffsetResult");

      // encode rsrp_Result

      if (rsrp_Result != null) {
         buffer.getContext().eventDispatcher.startElement("rsrp_Result", -1);

         rsrp_Result.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rsrp_Result", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (sfn_OffsetResult != null) sfn_OffsetResult.print (_sb, "sfn_OffsetResult", _level+1);
      if (frameBoundaryOffsetResult != null) frameBoundaryOffsetResult.print (_sb, "frameBoundaryOffsetResult", _level+1);
      if (rsrp_Result != null) rsrp_Result.print (_sb, "rsrp_Result", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
