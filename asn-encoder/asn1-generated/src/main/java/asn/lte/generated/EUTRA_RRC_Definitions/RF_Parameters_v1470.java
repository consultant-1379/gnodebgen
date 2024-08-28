/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters_v1470 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RF-Parameters-v1470";
   }

   public SupportedBandCombination_v1470 supportedBandCombination_v1470;  // optional
   public SupportedBandCombinationAdd_v1470 supportedBandCombinationAdd_v1470;  // optional
   public SupportedBandCombinationReduced_v1470 supportedBandCombinationReduced_v1470;  // optional

   public RF_Parameters_v1470 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters_v1470 (
      SupportedBandCombination_v1470 supportedBandCombination_v1470_,
      SupportedBandCombinationAdd_v1470 supportedBandCombinationAdd_v1470_,
      SupportedBandCombinationReduced_v1470 supportedBandCombinationReduced_v1470_
   ) {
      super();
      supportedBandCombination_v1470 = supportedBandCombination_v1470_;
      supportedBandCombinationAdd_v1470 = supportedBandCombinationAdd_v1470_;
      supportedBandCombinationReduced_v1470 = supportedBandCombinationReduced_v1470_;
   }

   public void init () {
      supportedBandCombination_v1470 = null;
      supportedBandCombinationAdd_v1470 = null;
      supportedBandCombinationReduced_v1470 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandCombination_v1470;
         case 1: return supportedBandCombinationAdd_v1470;
         case 2: return supportedBandCombinationReduced_v1470;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandCombination-v1470";
         case 1: return "supportedBandCombinationAdd-v1470";
         case 2: return "supportedBandCombinationReduced-v1470";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedBandCombination_v1470Present = buffer.decodeBit ("supportedBandCombination_v1470Present");
      boolean supportedBandCombinationAdd_v1470Present = buffer.decodeBit ("supportedBandCombinationAdd_v1470Present");
      boolean supportedBandCombinationReduced_v1470Present = buffer.decodeBit ("supportedBandCombinationReduced_v1470Present");

      // decode supportedBandCombination_v1470

      if (supportedBandCombination_v1470Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombination_v1470", -1);

         supportedBandCombination_v1470 = new SupportedBandCombination_v1470();
         supportedBandCombination_v1470.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombination_v1470", -1);
      }
      else {
         supportedBandCombination_v1470 = null;
      }

      // decode supportedBandCombinationAdd_v1470

      if (supportedBandCombinationAdd_v1470Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombinationAdd_v1470", -1);

         supportedBandCombinationAdd_v1470 = new SupportedBandCombinationAdd_v1470();
         supportedBandCombinationAdd_v1470.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombinationAdd_v1470", -1);
      }
      else {
         supportedBandCombinationAdd_v1470 = null;
      }

      // decode supportedBandCombinationReduced_v1470

      if (supportedBandCombinationReduced_v1470Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombinationReduced_v1470", -1);

         supportedBandCombinationReduced_v1470 = new SupportedBandCombinationReduced_v1470();
         supportedBandCombinationReduced_v1470.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombinationReduced_v1470", -1);
      }
      else {
         supportedBandCombinationReduced_v1470 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedBandCombination_v1470 != null) supportedBandCombination_v1470.print (_sb, "supportedBandCombination_v1470", _level+1);
      if (supportedBandCombinationAdd_v1470 != null) supportedBandCombinationAdd_v1470.print (_sb, "supportedBandCombinationAdd_v1470", _level+1);
      if (supportedBandCombinationReduced_v1470 != null) supportedBandCombinationReduced_v1470.print (_sb, "supportedBandCombinationReduced_v1470", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
