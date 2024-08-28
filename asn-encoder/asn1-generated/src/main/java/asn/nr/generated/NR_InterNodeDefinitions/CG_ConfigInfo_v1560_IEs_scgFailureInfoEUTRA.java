/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA failureTypeEUTRA = null;
   public Asn1OctetString measResultSCG_EUTRA;

   public CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA (
      CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA failureTypeEUTRA_,
      Asn1OctetString measResultSCG_EUTRA_
   ) {
      super();
      failureTypeEUTRA = failureTypeEUTRA_;
      measResultSCG_EUTRA = measResultSCG_EUTRA_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA (CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA failureTypeEUTRA_,
      byte[] measResultSCG_EUTRA_
   ) {
      super();
      failureTypeEUTRA = failureTypeEUTRA_;
      measResultSCG_EUTRA = new Asn1OctetString (measResultSCG_EUTRA_);
   }

   public void init () {
      failureTypeEUTRA = null;
      measResultSCG_EUTRA = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return failureTypeEUTRA;
         case 1: return measResultSCG_EUTRA;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "failureTypeEUTRA";
         case 1: return "measResultSCG-EUTRA";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode failureTypeEUTRA

      buffer.getContext().eventDispatcher.startElement("failureTypeEUTRA", -1);

      {
         int tval = CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA.decodeEnumValue (buffer);
         failureTypeEUTRA = CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("failureTypeEUTRA", -1);

      // decode measResultSCG_EUTRA

      buffer.getContext().eventDispatcher.startElement("measResultSCG_EUTRA", -1);

      measResultSCG_EUTRA = new Asn1OctetString();
      measResultSCG_EUTRA.decode (buffer);

      buffer.invokeCharacters(measResultSCG_EUTRA.toString());
      buffer.getContext().eventDispatcher.endElement("measResultSCG_EUTRA", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode failureTypeEUTRA

      if (failureTypeEUTRA != null) {
         buffer.getContext().eventDispatcher.startElement("failureTypeEUTRA", -1);

         failureTypeEUTRA.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("failureTypeEUTRA", -1);
      }
      else throw new Asn1MissingRequiredException ("failureTypeEUTRA");

      // encode measResultSCG_EUTRA

      if (measResultSCG_EUTRA != null) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_EUTRA", -1);

         measResultSCG_EUTRA.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultSCG_EUTRA", -1);
      }
      else throw new Asn1MissingRequiredException ("measResultSCG_EUTRA");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (failureTypeEUTRA != null) failureTypeEUTRA.print (_sb, "failureTypeEUTRA", _level+1);
      if (measResultSCG_EUTRA != null) measResultSCG_EUTRA.print (_sb, "measResultSCG_EUTRA", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
