/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 31-Dec-2020.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCSystemInfoRequest_r15_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCSystemInfoRequest-r15-IEs";
   }

   public Asn1BitString requested_SI_List;
   public Asn1BitString spare;

   public RRCSystemInfoRequest_r15_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCSystemInfoRequest_r15_IEs (
      Asn1BitString requested_SI_List_,
      Asn1BitString spare_
   ) {
      super();
      requested_SI_List = requested_SI_List_;
      spare = spare_;
   }

   public void init () {
      requested_SI_List = null;
      spare = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return requested_SI_List;
         case 1: return spare;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "requested-SI-List";
         case 1: return "spare";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode requested_SI_List

      buffer.getContext().eventDispatcher.startElement("requested_SI_List", -1);

      requested_SI_List = new Asn1BitString();
      requested_SI_List.decode (buffer, 32, 32);
      buffer.getContext().eventDispatcher.endElement("requested_SI_List", -1);

      // decode spare

      buffer.getContext().eventDispatcher.startElement("spare", -1);

      spare = new Asn1BitString();
      spare.decode (buffer, 12, 12);
      buffer.getContext().eventDispatcher.endElement("spare", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode requested_SI_List

      if (requested_SI_List != null) {
         buffer.getContext().eventDispatcher.startElement("requested_SI_List", -1);

         requested_SI_List.encode (buffer, 32, 32);

         buffer.getContext().eventDispatcher.endElement("requested_SI_List", -1);
      }
      else throw new Asn1MissingRequiredException ("requested_SI_List");

      // encode spare

      if (spare != null) {
         buffer.getContext().eventDispatcher.startElement("spare", -1);

         spare.encode (buffer, 12, 12);

         buffer.getContext().eventDispatcher.endElement("spare", -1);
      }
      else throw new Asn1MissingRequiredException ("spare");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (requested_SI_List != null) requested_SI_List.print (_sb, "requested_SI_List", _level+1);
      if (spare != null) spare.print (_sb, "spare", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
