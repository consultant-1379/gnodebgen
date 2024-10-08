/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCPTMConfiguration_BR_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SCPTMConfiguration-BR-r14";
   }

   public SC_MTCH_InfoList_BR_r14 sc_mtch_InfoList_r14;
   public SCPTM_NeighbourCellList_r13 scptm_NeighbourCellList_r14;  // optional
   public Asn1Integer p_b_r14;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public SCPTMConfiguration_BR_r14_nonCriticalExtension nonCriticalExtension;  // optional

   public SCPTMConfiguration_BR_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCPTMConfiguration_BR_r14 (
      SC_MTCH_InfoList_BR_r14 sc_mtch_InfoList_r14_,
      SCPTM_NeighbourCellList_r13 scptm_NeighbourCellList_r14_,
      Asn1Integer p_b_r14_,
      Asn1OctetString lateNonCriticalExtension_,
      SCPTMConfiguration_BR_r14_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      sc_mtch_InfoList_r14 = sc_mtch_InfoList_r14_;
      scptm_NeighbourCellList_r14 = scptm_NeighbourCellList_r14_;
      p_b_r14 = p_b_r14_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SCPTMConfiguration_BR_r14 (
      SC_MTCH_InfoList_BR_r14 sc_mtch_InfoList_r14_
   ) {
      super();
      sc_mtch_InfoList_r14 = sc_mtch_InfoList_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SCPTMConfiguration_BR_r14 (SC_MTCH_InfoList_BR_r14 sc_mtch_InfoList_r14_,
      SCPTM_NeighbourCellList_r13 scptm_NeighbourCellList_r14_,
      long p_b_r14_,
      byte[] lateNonCriticalExtension_,
      SCPTMConfiguration_BR_r14_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      sc_mtch_InfoList_r14 = sc_mtch_InfoList_r14_;
      scptm_NeighbourCellList_r14 = scptm_NeighbourCellList_r14_;
      p_b_r14 = new Asn1Integer (p_b_r14_);
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      sc_mtch_InfoList_r14 = null;
      scptm_NeighbourCellList_r14 = null;
      p_b_r14 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sc_mtch_InfoList_r14;
         case 1: return scptm_NeighbourCellList_r14;
         case 2: return p_b_r14;
         case 3: return lateNonCriticalExtension;
         case 4: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sc-mtch-InfoList-r14";
         case 1: return "scptm-NeighbourCellList-r14";
         case 2: return "p-b-r14";
         case 3: return "lateNonCriticalExtension";
         case 4: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scptm_NeighbourCellList_r14Present = buffer.decodeBit ("scptm_NeighbourCellList_r14Present");
      boolean p_b_r14Present = buffer.decodeBit ("p_b_r14Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode sc_mtch_InfoList_r14

      buffer.getContext().eventDispatcher.startElement("sc_mtch_InfoList_r14", -1);

      sc_mtch_InfoList_r14 = new SC_MTCH_InfoList_BR_r14();
      sc_mtch_InfoList_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sc_mtch_InfoList_r14", -1);

      // decode scptm_NeighbourCellList_r14

      if (scptm_NeighbourCellList_r14Present) {
         buffer.getContext().eventDispatcher.startElement("scptm_NeighbourCellList_r14", -1);

         scptm_NeighbourCellList_r14 = new SCPTM_NeighbourCellList_r13();
         scptm_NeighbourCellList_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scptm_NeighbourCellList_r14", -1);
      }
      else {
         scptm_NeighbourCellList_r14 = null;
      }

      // decode p_b_r14

      if (p_b_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p_b_r14", -1);

         p_b_r14 = new Asn1Integer();
         p_b_r14.decode (buffer, 0, 3);

         buffer.invokeCharacters(p_b_r14.toString());
         buffer.getContext().eventDispatcher.endElement("p_b_r14", -1);
      }
      else {
         p_b_r14 = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SCPTMConfiguration_BR_r14_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sc_mtch_InfoList_r14 != null) sc_mtch_InfoList_r14.print (_sb, "sc_mtch_InfoList_r14", _level+1);
      if (scptm_NeighbourCellList_r14 != null) scptm_NeighbourCellList_r14.print (_sb, "scptm_NeighbourCellList_r14", _level+1);
      if (p_b_r14 != null) p_b_r14.print (_sb, "p_b_r14", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
