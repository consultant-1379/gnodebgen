/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_AM_RLC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DL-AM-RLC";
   }

   public SN_FieldLengthAM sn_FieldLength = null;  // optional
   public T_Reassembly t_Reassembly = null;
   public T_StatusProhibit t_StatusProhibit = null;

   public DL_AM_RLC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_AM_RLC (
      SN_FieldLengthAM sn_FieldLength_,
      T_Reassembly t_Reassembly_,
      T_StatusProhibit t_StatusProhibit_
   ) {
      super();
      sn_FieldLength = sn_FieldLength_;
      t_Reassembly = t_Reassembly_;
      t_StatusProhibit = t_StatusProhibit_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DL_AM_RLC (
      T_Reassembly t_Reassembly_,
      T_StatusProhibit t_StatusProhibit_
   ) {
      super();
      t_Reassembly = t_Reassembly_;
      t_StatusProhibit = t_StatusProhibit_;
   }

   public void init () {
      sn_FieldLength = null;
      t_Reassembly = null;
      t_StatusProhibit = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sn_FieldLength;
         case 1: return t_Reassembly;
         case 2: return t_StatusProhibit;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sn-FieldLength";
         case 1: return "t-Reassembly";
         case 2: return "t-StatusProhibit";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sn_FieldLengthPresent = buffer.decodeBit ("sn_FieldLengthPresent");

      // decode sn_FieldLength

      if (sn_FieldLengthPresent) {
         buffer.getContext().eventDispatcher.startElement("sn_FieldLength", -1);

         int tval = SN_FieldLengthAM.decodeEnumValue (buffer);
         sn_FieldLength = SN_FieldLengthAM.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sn_FieldLength", -1);
      }
      else {
         sn_FieldLength = null;
      }

      // decode t_Reassembly

      buffer.getContext().eventDispatcher.startElement("t_Reassembly", -1);

      {
         int tval = T_Reassembly.decodeEnumValue (buffer);
         t_Reassembly = T_Reassembly.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t_Reassembly", -1);

      // decode t_StatusProhibit

      buffer.getContext().eventDispatcher.startElement("t_StatusProhibit", -1);

      {
         int tval = T_StatusProhibit.decodeEnumValue (buffer);
         t_StatusProhibit = T_StatusProhibit.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t_StatusProhibit", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sn_FieldLength != null), null);

      // encode sn_FieldLength

      if (sn_FieldLength != null) {
         buffer.getContext().eventDispatcher.startElement("sn_FieldLength", -1);

         sn_FieldLength.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sn_FieldLength", -1);
      }

      // encode t_Reassembly

      if (t_Reassembly != null) {
         buffer.getContext().eventDispatcher.startElement("t_Reassembly", -1);

         t_Reassembly.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("t_Reassembly", -1);
      }
      else throw new Asn1MissingRequiredException ("t_Reassembly");

      // encode t_StatusProhibit

      if (t_StatusProhibit != null) {
         buffer.getContext().eventDispatcher.startElement("t_StatusProhibit", -1);

         t_StatusProhibit.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("t_StatusProhibit", -1);
      }
      else throw new Asn1MissingRequiredException ("t_StatusProhibit");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sn_FieldLength != null) sn_FieldLength.print (_sb, "sn_FieldLength", _level+1);
      if (t_Reassembly != null) t_Reassembly.print (_sb, "t_Reassembly", _level+1);
      if (t_StatusProhibit != null) t_StatusProhibit.print (_sb, "t_StatusProhibit", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
