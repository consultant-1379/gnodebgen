/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CAG_IdentityInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CAG-IdentityInfo-r16";
   }

   public Asn1BitString cag_Identity_r16;
   public CAG_IdentityInfo_r16_manualCAGselectionAllowed_r16 manualCAGselectionAllowed_r16 = null;  // optional

   public CAG_IdentityInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CAG_IdentityInfo_r16 (
      Asn1BitString cag_Identity_r16_,
      CAG_IdentityInfo_r16_manualCAGselectionAllowed_r16 manualCAGselectionAllowed_r16_
   ) {
      super();
      cag_Identity_r16 = cag_Identity_r16_;
      manualCAGselectionAllowed_r16 = manualCAGselectionAllowed_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CAG_IdentityInfo_r16 (
      Asn1BitString cag_Identity_r16_
   ) {
      super();
      cag_Identity_r16 = cag_Identity_r16_;
   }

   public void init () {
      cag_Identity_r16 = null;
      manualCAGselectionAllowed_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cag_Identity_r16;
         case 1: return manualCAGselectionAllowed_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cag-Identity-r16";
         case 1: return "manualCAGselectionAllowed-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean manualCAGselectionAllowed_r16Present = buffer.decodeBit ("manualCAGselectionAllowed_r16Present");

      // decode cag_Identity_r16

      buffer.getContext().eventDispatcher.startElement("cag_Identity_r16", -1);

      cag_Identity_r16 = new Asn1BitString();
      cag_Identity_r16.decode (buffer, 32, 32);

      buffer.invokeCharacters(cag_Identity_r16.toString());
      buffer.getContext().eventDispatcher.endElement("cag_Identity_r16", -1);

      // decode manualCAGselectionAllowed_r16

      if (manualCAGselectionAllowed_r16Present) {
         buffer.getContext().eventDispatcher.startElement("manualCAGselectionAllowed_r16", -1);

         int tval = CAG_IdentityInfo_r16_manualCAGselectionAllowed_r16.decodeEnumValue (buffer);
         manualCAGselectionAllowed_r16 = CAG_IdentityInfo_r16_manualCAGselectionAllowed_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("manualCAGselectionAllowed_r16", -1);
      }
      else {
         manualCAGselectionAllowed_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((manualCAGselectionAllowed_r16 != null), null);

      // encode cag_Identity_r16

      if (cag_Identity_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("cag_Identity_r16", -1);

         cag_Identity_r16.encode (buffer, 32, 32);

         buffer.getContext().eventDispatcher.endElement("cag_Identity_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("cag_Identity_r16");

      // encode manualCAGselectionAllowed_r16

      if (manualCAGselectionAllowed_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("manualCAGselectionAllowed_r16", -1);

         manualCAGselectionAllowed_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("manualCAGselectionAllowed_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cag_Identity_r16 != null) cag_Identity_r16.print (_sb, "cag_Identity_r16", _level+1);
      if (manualCAGselectionAllowed_r16 != null) manualCAGselectionAllowed_r16.print (_sb, "manualCAGselectionAllowed_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
