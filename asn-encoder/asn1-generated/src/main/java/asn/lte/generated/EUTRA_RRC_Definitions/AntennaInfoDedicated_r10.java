/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AntennaInfoDedicated_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AntennaInfoDedicated-r10";
   }

   public AntennaInfoDedicated_r10_transmissionMode_r10 transmissionMode_r10 = null;
   public Asn1BitString codebookSubsetRestriction_r10;  // optional
   public AntennaInfoDedicated_r10_ue_TransmitAntennaSelection ue_TransmitAntennaSelection;

   public AntennaInfoDedicated_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AntennaInfoDedicated_r10 (
      AntennaInfoDedicated_r10_transmissionMode_r10 transmissionMode_r10_,
      Asn1BitString codebookSubsetRestriction_r10_,
      AntennaInfoDedicated_r10_ue_TransmitAntennaSelection ue_TransmitAntennaSelection_
   ) {
      super();
      transmissionMode_r10 = transmissionMode_r10_;
      codebookSubsetRestriction_r10 = codebookSubsetRestriction_r10_;
      ue_TransmitAntennaSelection = ue_TransmitAntennaSelection_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public AntennaInfoDedicated_r10 (
      AntennaInfoDedicated_r10_transmissionMode_r10 transmissionMode_r10_,
      AntennaInfoDedicated_r10_ue_TransmitAntennaSelection ue_TransmitAntennaSelection_
   ) {
      super();
      transmissionMode_r10 = transmissionMode_r10_;
      ue_TransmitAntennaSelection = ue_TransmitAntennaSelection_;
   }

   public void init () {
      transmissionMode_r10 = null;
      codebookSubsetRestriction_r10 = null;
      ue_TransmitAntennaSelection = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return transmissionMode_r10;
         case 1: return codebookSubsetRestriction_r10;
         case 2: return ue_TransmitAntennaSelection;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "transmissionMode-r10";
         case 1: return "codebookSubsetRestriction-r10";
         case 2: return "ue-TransmitAntennaSelection";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean codebookSubsetRestriction_r10Present = buffer.decodeBit ("codebookSubsetRestriction_r10Present");

      // decode transmissionMode_r10

      buffer.getContext().eventDispatcher.startElement("transmissionMode_r10", -1);

      {
         int tval = AntennaInfoDedicated_r10_transmissionMode_r10.decodeEnumValue (buffer);
         transmissionMode_r10 = AntennaInfoDedicated_r10_transmissionMode_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("transmissionMode_r10", -1);

      // decode codebookSubsetRestriction_r10

      if (codebookSubsetRestriction_r10Present) {
         buffer.getContext().eventDispatcher.startElement("codebookSubsetRestriction_r10", -1);

         codebookSubsetRestriction_r10 = new Asn1BitString();
         codebookSubsetRestriction_r10.decode (buffer);

         buffer.invokeCharacters(codebookSubsetRestriction_r10.toString());
         buffer.getContext().eventDispatcher.endElement("codebookSubsetRestriction_r10", -1);
      }
      else {
         codebookSubsetRestriction_r10 = null;
      }

      // decode ue_TransmitAntennaSelection

      buffer.getContext().eventDispatcher.startElement("ue_TransmitAntennaSelection", -1);

      ue_TransmitAntennaSelection = new AntennaInfoDedicated_r10_ue_TransmitAntennaSelection();
      ue_TransmitAntennaSelection.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ue_TransmitAntennaSelection", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (transmissionMode_r10 != null) transmissionMode_r10.print (_sb, "transmissionMode_r10", _level+1);
      if (codebookSubsetRestriction_r10 != null) codebookSubsetRestriction_r10.print (_sb, "codebookSubsetRestriction_r10", _level+1);
      if (ue_TransmitAntennaSelection != null) ue_TransmitAntennaSelection.print (_sb, "ue_TransmitAntennaSelection", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
