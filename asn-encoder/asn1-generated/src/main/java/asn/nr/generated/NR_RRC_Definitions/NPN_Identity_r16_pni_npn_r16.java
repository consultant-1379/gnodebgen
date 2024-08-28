/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPN_Identity_r16_pni_npn_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PLMN_Identity plmn_Identity_r16;
   public NPN_Identity_r16_pni_npn_r16_cag_IdentityList_r16 cag_IdentityList_r16;

   public NPN_Identity_r16_pni_npn_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPN_Identity_r16_pni_npn_r16 (
      PLMN_Identity plmn_Identity_r16_,
      NPN_Identity_r16_pni_npn_r16_cag_IdentityList_r16 cag_IdentityList_r16_
   ) {
      super();
      plmn_Identity_r16 = plmn_Identity_r16_;
      cag_IdentityList_r16 = cag_IdentityList_r16_;
   }

   public void init () {
      plmn_Identity_r16 = null;
      cag_IdentityList_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_Identity_r16;
         case 1: return cag_IdentityList_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-Identity-r16";
         case 1: return "cag-IdentityList-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode plmn_Identity_r16

      buffer.getContext().eventDispatcher.startElement("plmn_Identity_r16", -1);

      plmn_Identity_r16 = new PLMN_Identity();
      plmn_Identity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_Identity_r16", -1);

      // decode cag_IdentityList_r16

      buffer.getContext().eventDispatcher.startElement("cag_IdentityList_r16", -1);

      cag_IdentityList_r16 = new NPN_Identity_r16_pni_npn_r16_cag_IdentityList_r16();
      cag_IdentityList_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cag_IdentityList_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode plmn_Identity_r16

      if (plmn_Identity_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("plmn_Identity_r16", -1);

         plmn_Identity_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("plmn_Identity_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("plmn_Identity_r16");

      // encode cag_IdentityList_r16

      if (cag_IdentityList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("cag_IdentityList_r16", -1);

         cag_IdentityList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cag_IdentityList_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("cag_IdentityList_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_Identity_r16 != null) plmn_Identity_r16.print (_sb, "plmn_Identity_r16", _level+1);
      if (cag_IdentityList_r16 != null) cag_IdentityList_r16.print (_sb, "cag_IdentityList_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
