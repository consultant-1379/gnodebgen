/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SecurityAlgorithmConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SecurityAlgorithmConfig";
   }

   public CipheringAlgorithm_r12 cipheringAlgorithm = null;
   public SecurityAlgorithmConfig_integrityProtAlgorithm integrityProtAlgorithm = null;

   public SecurityAlgorithmConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SecurityAlgorithmConfig (
      CipheringAlgorithm_r12 cipheringAlgorithm_,
      SecurityAlgorithmConfig_integrityProtAlgorithm integrityProtAlgorithm_
   ) {
      super();
      cipheringAlgorithm = cipheringAlgorithm_;
      integrityProtAlgorithm = integrityProtAlgorithm_;
   }

   public void init () {
      cipheringAlgorithm = null;
      integrityProtAlgorithm = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cipheringAlgorithm;
         case 1: return integrityProtAlgorithm;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cipheringAlgorithm";
         case 1: return "integrityProtAlgorithm";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cipheringAlgorithm

      buffer.getContext().eventDispatcher.startElement("cipheringAlgorithm", -1);

      {
         int tval = CipheringAlgorithm_r12.decodeEnumValue (buffer);
         cipheringAlgorithm = CipheringAlgorithm_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cipheringAlgorithm", -1);

      // decode integrityProtAlgorithm

      buffer.getContext().eventDispatcher.startElement("integrityProtAlgorithm", -1);

      {
         int tval = SecurityAlgorithmConfig_integrityProtAlgorithm.decodeEnumValue (buffer);
         integrityProtAlgorithm = SecurityAlgorithmConfig_integrityProtAlgorithm.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("integrityProtAlgorithm", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cipheringAlgorithm != null) cipheringAlgorithm.print (_sb, "cipheringAlgorithm", _level+1);
      if (integrityProtAlgorithm != null) integrityProtAlgorithm.print (_sb, "integrityProtAlgorithm", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
