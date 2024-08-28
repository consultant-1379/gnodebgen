/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEInformationResponse_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UEInformationResponse-r9";
   }

   public RRC_TransactionIdentifier rrc_TransactionIdentifier;
   public UEInformationResponse_r9_criticalExtensions criticalExtensions;

   public UEInformationResponse_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UEInformationResponse_r9 (
      RRC_TransactionIdentifier rrc_TransactionIdentifier_,
      UEInformationResponse_r9_criticalExtensions criticalExtensions_
   ) {
      super();
      rrc_TransactionIdentifier = rrc_TransactionIdentifier_;
      criticalExtensions = criticalExtensions_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UEInformationResponse_r9 (long rrc_TransactionIdentifier_,
      UEInformationResponse_r9_criticalExtensions criticalExtensions_
   ) {
      super();
      rrc_TransactionIdentifier = new RRC_TransactionIdentifier (rrc_TransactionIdentifier_);
      criticalExtensions = criticalExtensions_;
   }

   public void init () {
      rrc_TransactionIdentifier = null;
      criticalExtensions = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rrc_TransactionIdentifier;
         case 1: return criticalExtensions;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rrc-TransactionIdentifier";
         case 1: return "criticalExtensions";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rrc_TransactionIdentifier

      buffer.getContext().eventDispatcher.startElement("rrc_TransactionIdentifier", -1);

      rrc_TransactionIdentifier = new RRC_TransactionIdentifier();
      rrc_TransactionIdentifier.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rrc_TransactionIdentifier", -1);

      // decode criticalExtensions

      buffer.getContext().eventDispatcher.startElement("criticalExtensions", -1);

      criticalExtensions = new UEInformationResponse_r9_criticalExtensions();
      criticalExtensions.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("criticalExtensions", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rrc_TransactionIdentifier != null) rrc_TransactionIdentifier.print (_sb, "rrc_TransactionIdentifier", _level+1);
      if (criticalExtensions != null) criticalExtensions.print (_sb, "criticalExtensions", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
