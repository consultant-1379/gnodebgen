/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.RRC_TransactionIdentifier;

public class RRCReconfigurationSidelink extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCReconfigurationSidelink";
   }

   public RRC_TransactionIdentifier rrc_TransactionIdentifier_r16;
   public RRCReconfigurationSidelink_criticalExtensions criticalExtensions;

   public RRCReconfigurationSidelink () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCReconfigurationSidelink (
      RRC_TransactionIdentifier rrc_TransactionIdentifier_r16_,
      RRCReconfigurationSidelink_criticalExtensions criticalExtensions_
   ) {
      super();
      rrc_TransactionIdentifier_r16 = rrc_TransactionIdentifier_r16_;
      criticalExtensions = criticalExtensions_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCReconfigurationSidelink (long rrc_TransactionIdentifier_r16_,
      RRCReconfigurationSidelink_criticalExtensions criticalExtensions_
   ) {
      super();
      rrc_TransactionIdentifier_r16 = new RRC_TransactionIdentifier (rrc_TransactionIdentifier_r16_);
      criticalExtensions = criticalExtensions_;
   }

   public void init () {
      rrc_TransactionIdentifier_r16 = null;
      criticalExtensions = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rrc_TransactionIdentifier_r16;
         case 1: return criticalExtensions;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rrc-TransactionIdentifier-r16";
         case 1: return "criticalExtensions";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rrc_TransactionIdentifier_r16

      buffer.getContext().eventDispatcher.startElement("rrc_TransactionIdentifier_r16", -1);

      rrc_TransactionIdentifier_r16 = new RRC_TransactionIdentifier();
      rrc_TransactionIdentifier_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rrc_TransactionIdentifier_r16", -1);

      // decode criticalExtensions

      buffer.getContext().eventDispatcher.startElement("criticalExtensions", -1);

      criticalExtensions = new RRCReconfigurationSidelink_criticalExtensions();
      criticalExtensions.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("criticalExtensions", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rrc_TransactionIdentifier_r16 != null) rrc_TransactionIdentifier_r16.print (_sb, "rrc_TransactionIdentifier_r16", _level+1);
      if (criticalExtensions != null) criticalExtensions.print (_sb, "criticalExtensions", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
