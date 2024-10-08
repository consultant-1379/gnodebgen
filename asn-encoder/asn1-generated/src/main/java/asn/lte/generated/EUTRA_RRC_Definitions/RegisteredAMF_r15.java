/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RegisteredAMF_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RegisteredAMF-r15";
   }

   public PLMN_Identity plmn_Identity_r15;  // optional
   public AMF_Identifier_r15 amf_Identifier_r15;

   public RegisteredAMF_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RegisteredAMF_r15 (
      PLMN_Identity plmn_Identity_r15_,
      AMF_Identifier_r15 amf_Identifier_r15_
   ) {
      super();
      plmn_Identity_r15 = plmn_Identity_r15_;
      amf_Identifier_r15 = amf_Identifier_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RegisteredAMF_r15 (
      AMF_Identifier_r15 amf_Identifier_r15_
   ) {
      super();
      amf_Identifier_r15 = amf_Identifier_r15_;
   }

   public void init () {
      plmn_Identity_r15 = null;
      amf_Identifier_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_Identity_r15;
         case 1: return amf_Identifier_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-Identity-r15";
         case 1: return "amf-Identifier-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean plmn_Identity_r15Present = buffer.decodeBit ("plmn_Identity_r15Present");

      // decode plmn_Identity_r15

      if (plmn_Identity_r15Present) {
         buffer.getContext().eventDispatcher.startElement("plmn_Identity_r15", -1);

         plmn_Identity_r15 = new PLMN_Identity();
         plmn_Identity_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("plmn_Identity_r15", -1);
      }
      else {
         plmn_Identity_r15 = null;
      }

      // decode amf_Identifier_r15

      buffer.getContext().eventDispatcher.startElement("amf_Identifier_r15", -1);

      amf_Identifier_r15 = new AMF_Identifier_r15();
      amf_Identifier_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("amf_Identifier_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_Identity_r15 != null) plmn_Identity_r15.print (_sb, "plmn_Identity_r15", _level+1);
      if (amf_Identifier_r15 != null) amf_Identifier_r15.print (_sb, "amf_Identifier_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
