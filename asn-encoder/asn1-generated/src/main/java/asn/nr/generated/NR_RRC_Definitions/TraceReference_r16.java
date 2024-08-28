/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TraceReference_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TraceReference-r16";
   }

   public PLMN_Identity plmn_Identity_r16;
   public Asn1OctetString traceId_r16;

   public TraceReference_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TraceReference_r16 (
      PLMN_Identity plmn_Identity_r16_,
      Asn1OctetString traceId_r16_
   ) {
      super();
      plmn_Identity_r16 = plmn_Identity_r16_;
      traceId_r16 = traceId_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TraceReference_r16 (PLMN_Identity plmn_Identity_r16_,
      byte[] traceId_r16_
   ) {
      super();
      plmn_Identity_r16 = plmn_Identity_r16_;
      traceId_r16 = new Asn1OctetString (traceId_r16_);
   }

   public void init () {
      plmn_Identity_r16 = null;
      traceId_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_Identity_r16;
         case 1: return traceId_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-Identity-r16";
         case 1: return "traceId-r16";
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

      // decode traceId_r16

      buffer.getContext().eventDispatcher.startElement("traceId_r16", -1);

      traceId_r16 = new Asn1OctetString();
      traceId_r16.decode (buffer, 3, 3);

      buffer.invokeCharacters(traceId_r16.toString());
      buffer.getContext().eventDispatcher.endElement("traceId_r16", -1);

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

      // encode traceId_r16

      if (traceId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("traceId_r16", -1);

         traceId_r16.encode (buffer, 3, 3);

         buffer.getContext().eventDispatcher.endElement("traceId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("traceId_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_Identity_r16 != null) plmn_Identity_r16.print (_sb, "plmn_Identity_r16", _level+1);
      if (traceId_r16 != null) traceId_r16.print (_sb, "traceId_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
