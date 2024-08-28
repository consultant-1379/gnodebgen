/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.ReestabUE_Identity;

public class RRCConnectionReestablishmentRequest_NB_r13_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionReestablishmentRequest-NB-r13-IEs";
   }

   public ReestabUE_Identity ue_Identity_r13;
   public ReestablishmentCause_NB_r13 reestablishmentCause_r13 = null;
   public CQI_NPDCCH_NB_r14 cqi_NPDCCH_r14 = null;
   public Asn1Boolean earlyContentionResolution_r14;
   public Asn1BitString spare;

   public RRCConnectionReestablishmentRequest_NB_r13_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReestablishmentRequest_NB_r13_IEs (
      ReestabUE_Identity ue_Identity_r13_,
      ReestablishmentCause_NB_r13 reestablishmentCause_r13_,
      CQI_NPDCCH_NB_r14 cqi_NPDCCH_r14_,
      Asn1Boolean earlyContentionResolution_r14_,
      Asn1BitString spare_
   ) {
      super();
      ue_Identity_r13 = ue_Identity_r13_;
      reestablishmentCause_r13 = reestablishmentCause_r13_;
      cqi_NPDCCH_r14 = cqi_NPDCCH_r14_;
      earlyContentionResolution_r14 = earlyContentionResolution_r14_;
      spare = spare_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCConnectionReestablishmentRequest_NB_r13_IEs (ReestabUE_Identity ue_Identity_r13_,
      ReestablishmentCause_NB_r13 reestablishmentCause_r13_,
      CQI_NPDCCH_NB_r14 cqi_NPDCCH_r14_,
      boolean earlyContentionResolution_r14_,
      Asn1BitString spare_
   ) {
      super();
      ue_Identity_r13 = ue_Identity_r13_;
      reestablishmentCause_r13 = reestablishmentCause_r13_;
      cqi_NPDCCH_r14 = cqi_NPDCCH_r14_;
      earlyContentionResolution_r14 = new Asn1Boolean (earlyContentionResolution_r14_);
      spare = spare_;
   }

   public void init () {
      ue_Identity_r13 = null;
      reestablishmentCause_r13 = null;
      cqi_NPDCCH_r14 = null;
      earlyContentionResolution_r14 = null;
      spare = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_Identity_r13;
         case 1: return reestablishmentCause_r13;
         case 2: return cqi_NPDCCH_r14;
         case 3: return earlyContentionResolution_r14;
         case 4: return spare;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-Identity-r13";
         case 1: return "reestablishmentCause-r13";
         case 2: return "cqi-NPDCCH-r14";
         case 3: return "earlyContentionResolution-r14";
         case 4: return "spare";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ue_Identity_r13

      buffer.getContext().eventDispatcher.startElement("ue_Identity_r13", -1);

      ue_Identity_r13 = new ReestabUE_Identity();
      ue_Identity_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ue_Identity_r13", -1);

      // decode reestablishmentCause_r13

      buffer.getContext().eventDispatcher.startElement("reestablishmentCause_r13", -1);

      {
         int tval = ReestablishmentCause_NB_r13.decodeEnumValue (buffer);
         reestablishmentCause_r13 = ReestablishmentCause_NB_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reestablishmentCause_r13", -1);

      // decode cqi_NPDCCH_r14

      buffer.getContext().eventDispatcher.startElement("cqi_NPDCCH_r14", -1);

      {
         int tval = CQI_NPDCCH_NB_r14.decodeEnumValue (buffer);
         cqi_NPDCCH_r14 = CQI_NPDCCH_NB_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cqi_NPDCCH_r14", -1);

      // decode earlyContentionResolution_r14

      buffer.getContext().eventDispatcher.startElement("earlyContentionResolution_r14", -1);

      earlyContentionResolution_r14 = new Asn1Boolean();
      earlyContentionResolution_r14.decode (buffer);

      buffer.invokeCharacters(earlyContentionResolution_r14.toString());
      buffer.getContext().eventDispatcher.endElement("earlyContentionResolution_r14", -1);

      // decode spare

      buffer.getContext().eventDispatcher.startElement("spare", -1);

      spare = new Asn1BitString();
      spare.decode (buffer, 20, 20);

      buffer.invokeCharacters(spare.toString());
      buffer.getContext().eventDispatcher.endElement("spare", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ue_Identity_r13 != null) ue_Identity_r13.print (_sb, "ue_Identity_r13", _level+1);
      if (reestablishmentCause_r13 != null) reestablishmentCause_r13.print (_sb, "reestablishmentCause_r13", _level+1);
      if (cqi_NPDCCH_r14 != null) cqi_NPDCCH_r14.print (_sb, "cqi_NPDCCH_r14", _level+1);
      if (earlyContentionResolution_r14 != null) earlyContentionResolution_r14.print (_sb, "earlyContentionResolution_r14", _level+1);
      if (spare != null) spare.print (_sb, "spare", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
