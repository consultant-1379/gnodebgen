/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AntennaInfoDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AntennaInfoDedicated";
   }

   public AntennaInfoDedicated_transmissionMode transmissionMode = null;
   public AntennaInfoDedicated_codebookSubsetRestriction codebookSubsetRestriction;  // optional
   public AntennaInfoDedicated_ue_TransmitAntennaSelection ue_TransmitAntennaSelection;

   public AntennaInfoDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AntennaInfoDedicated (
      AntennaInfoDedicated_transmissionMode transmissionMode_,
      AntennaInfoDedicated_codebookSubsetRestriction codebookSubsetRestriction_,
      AntennaInfoDedicated_ue_TransmitAntennaSelection ue_TransmitAntennaSelection_
   ) {
      super();
      transmissionMode = transmissionMode_;
      codebookSubsetRestriction = codebookSubsetRestriction_;
      ue_TransmitAntennaSelection = ue_TransmitAntennaSelection_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public AntennaInfoDedicated (
      AntennaInfoDedicated_transmissionMode transmissionMode_,
      AntennaInfoDedicated_ue_TransmitAntennaSelection ue_TransmitAntennaSelection_
   ) {
      super();
      transmissionMode = transmissionMode_;
      ue_TransmitAntennaSelection = ue_TransmitAntennaSelection_;
   }

   public void init () {
      transmissionMode = null;
      codebookSubsetRestriction = null;
      ue_TransmitAntennaSelection = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return transmissionMode;
         case 1: return codebookSubsetRestriction;
         case 2: return ue_TransmitAntennaSelection;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "transmissionMode";
         case 1: return "codebookSubsetRestriction";
         case 2: return "ue-TransmitAntennaSelection";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean codebookSubsetRestrictionPresent = buffer.decodeBit ("codebookSubsetRestrictionPresent");

      // decode transmissionMode

      buffer.getContext().eventDispatcher.startElement("transmissionMode", -1);

      {
         int tval = AntennaInfoDedicated_transmissionMode.decodeEnumValue (buffer);
         transmissionMode = AntennaInfoDedicated_transmissionMode.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("transmissionMode", -1);

      // decode codebookSubsetRestriction

      if (codebookSubsetRestrictionPresent) {
         buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction", -1);

         codebookSubsetRestriction = new AntennaInfoDedicated_codebookSubsetRestriction();
         codebookSubsetRestriction.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction", -1);
      }
      else {
         codebookSubsetRestriction = null;
      }

      // decode ue_TransmitAntennaSelection

      buffer.getContext().eventDispatcher.startElement("ue_TransmitAntennaSelection", -1);

      ue_TransmitAntennaSelection = new AntennaInfoDedicated_ue_TransmitAntennaSelection();
      ue_TransmitAntennaSelection.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ue_TransmitAntennaSelection", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (transmissionMode != null) transmissionMode.print (_sb, "transmissionMode", _level+1);
      if (codebookSubsetRestriction != null) codebookSubsetRestriction.print (_sb, "codebookSubsetRestriction", _level+1);
      if (ue_TransmitAntennaSelection != null) ue_TransmitAntennaSelection.print (_sb, "ue_TransmitAntennaSelection", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
