/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_PathlossReferenceRS extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUCCH-PathlossReferenceRS";
   }

   public PUCCH_PathlossReferenceRS_Id pucch_PathlossReferenceRS_Id;
   public PUCCH_PathlossReferenceRS_referenceSignal referenceSignal;

   public PUCCH_PathlossReferenceRS () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUCCH_PathlossReferenceRS (
      PUCCH_PathlossReferenceRS_Id pucch_PathlossReferenceRS_Id_,
      PUCCH_PathlossReferenceRS_referenceSignal referenceSignal_
   ) {
      super();
      pucch_PathlossReferenceRS_Id = pucch_PathlossReferenceRS_Id_;
      referenceSignal = referenceSignal_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUCCH_PathlossReferenceRS (long pucch_PathlossReferenceRS_Id_,
      PUCCH_PathlossReferenceRS_referenceSignal referenceSignal_
   ) {
      super();
      pucch_PathlossReferenceRS_Id = new PUCCH_PathlossReferenceRS_Id (pucch_PathlossReferenceRS_Id_);
      referenceSignal = referenceSignal_;
   }

   public void init () {
      pucch_PathlossReferenceRS_Id = null;
      referenceSignal = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pucch_PathlossReferenceRS_Id;
         case 1: return referenceSignal;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pucch-PathlossReferenceRS-Id";
         case 1: return "referenceSignal";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode pucch_PathlossReferenceRS_Id

      buffer.getContext().eventDispatcher.startElement("pucch_PathlossReferenceRS_Id", -1);

      pucch_PathlossReferenceRS_Id = new PUCCH_PathlossReferenceRS_Id();
      pucch_PathlossReferenceRS_Id.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pucch_PathlossReferenceRS_Id", -1);

      // decode referenceSignal

      buffer.getContext().eventDispatcher.startElement("referenceSignal", -1);

      referenceSignal = new PUCCH_PathlossReferenceRS_referenceSignal();
      referenceSignal.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("referenceSignal", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pucch_PathlossReferenceRS_Id != null) pucch_PathlossReferenceRS_Id.print (_sb, "pucch_PathlossReferenceRS_Id", _level+1);
      if (referenceSignal != null) referenceSignal.print (_sb, "referenceSignal", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
