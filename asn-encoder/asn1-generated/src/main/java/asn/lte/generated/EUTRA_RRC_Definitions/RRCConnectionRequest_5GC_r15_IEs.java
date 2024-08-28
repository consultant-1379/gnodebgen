/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionRequest_5GC_r15_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionRequest-5GC-r15-IEs";
   }

   public InitialUE_Identity_5GC ue_Identity;
   public EstablishmentCause_5GC establishmentCause = null;
   public Asn1BitString spare;

   public RRCConnectionRequest_5GC_r15_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionRequest_5GC_r15_IEs (
      InitialUE_Identity_5GC ue_Identity_,
      EstablishmentCause_5GC establishmentCause_,
      Asn1BitString spare_
   ) {
      super();
      ue_Identity = ue_Identity_;
      establishmentCause = establishmentCause_;
      spare = spare_;
   }

   public void init () {
      ue_Identity = null;
      establishmentCause = null;
      spare = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_Identity;
         case 1: return establishmentCause;
         case 2: return spare;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-Identity";
         case 1: return "establishmentCause";
         case 2: return "spare";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ue_Identity

      buffer.getContext().eventDispatcher.startElement("ue_Identity", -1);

      ue_Identity = new InitialUE_Identity_5GC();
      ue_Identity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ue_Identity", -1);

      // decode establishmentCause

      buffer.getContext().eventDispatcher.startElement("establishmentCause", -1);

      {
         int tval = EstablishmentCause_5GC.decodeEnumValue (buffer);
         establishmentCause = EstablishmentCause_5GC.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("establishmentCause", -1);

      // decode spare

      buffer.getContext().eventDispatcher.startElement("spare", -1);

      spare = new Asn1BitString();
      spare.decode (buffer, 1, 1);

      buffer.invokeCharacters(spare.toString());
      buffer.getContext().eventDispatcher.endElement("spare", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ue_Identity != null) ue_Identity.print (_sb, "ue_Identity", _level+1);
      if (establishmentCause != null) establishmentCause.print (_sb, "establishmentCause", _level+1);
      if (spare != null) spare.print (_sb, "spare", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
