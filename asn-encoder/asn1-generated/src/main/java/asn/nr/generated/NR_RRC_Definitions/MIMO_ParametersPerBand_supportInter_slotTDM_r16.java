/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_supportInter_slotTDM_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MIMO_ParametersPerBand_supportInter_slotTDM_r16_supportRepNumPDSCH_TDRA_r16 supportRepNumPDSCH_TDRA_r16 = null;
   public MIMO_ParametersPerBand_supportInter_slotTDM_r16_maxTBS_Size_r16 maxTBS_Size_r16 = null;
   public Asn1Integer maxNumberTCI_states_r16;

   public MIMO_ParametersPerBand_supportInter_slotTDM_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MIMO_ParametersPerBand_supportInter_slotTDM_r16 (
      MIMO_ParametersPerBand_supportInter_slotTDM_r16_supportRepNumPDSCH_TDRA_r16 supportRepNumPDSCH_TDRA_r16_,
      MIMO_ParametersPerBand_supportInter_slotTDM_r16_maxTBS_Size_r16 maxTBS_Size_r16_,
      Asn1Integer maxNumberTCI_states_r16_
   ) {
      super();
      supportRepNumPDSCH_TDRA_r16 = supportRepNumPDSCH_TDRA_r16_;
      maxTBS_Size_r16 = maxTBS_Size_r16_;
      maxNumberTCI_states_r16 = maxNumberTCI_states_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MIMO_ParametersPerBand_supportInter_slotTDM_r16 (MIMO_ParametersPerBand_supportInter_slotTDM_r16_supportRepNumPDSCH_TDRA_r16 supportRepNumPDSCH_TDRA_r16_,
      MIMO_ParametersPerBand_supportInter_slotTDM_r16_maxTBS_Size_r16 maxTBS_Size_r16_,
      long maxNumberTCI_states_r16_
   ) {
      super();
      supportRepNumPDSCH_TDRA_r16 = supportRepNumPDSCH_TDRA_r16_;
      maxTBS_Size_r16 = maxTBS_Size_r16_;
      maxNumberTCI_states_r16 = new Asn1Integer (maxNumberTCI_states_r16_);
   }

   public void init () {
      supportRepNumPDSCH_TDRA_r16 = null;
      maxTBS_Size_r16 = null;
      maxNumberTCI_states_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportRepNumPDSCH_TDRA_r16;
         case 1: return maxTBS_Size_r16;
         case 2: return maxNumberTCI_states_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportRepNumPDSCH-TDRA-r16";
         case 1: return "maxTBS-Size-r16";
         case 2: return "maxNumberTCI-states-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode supportRepNumPDSCH_TDRA_r16

      buffer.getContext().eventDispatcher.startElement("supportRepNumPDSCH_TDRA_r16", -1);

      {
         int tval = MIMO_ParametersPerBand_supportInter_slotTDM_r16_supportRepNumPDSCH_TDRA_r16.decodeEnumValue (buffer);
         supportRepNumPDSCH_TDRA_r16 = MIMO_ParametersPerBand_supportInter_slotTDM_r16_supportRepNumPDSCH_TDRA_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportRepNumPDSCH_TDRA_r16", -1);

      // decode maxTBS_Size_r16

      buffer.getContext().eventDispatcher.startElement("maxTBS_Size_r16", -1);

      {
         int tval = MIMO_ParametersPerBand_supportInter_slotTDM_r16_maxTBS_Size_r16.decodeEnumValue (buffer);
         maxTBS_Size_r16 = MIMO_ParametersPerBand_supportInter_slotTDM_r16_maxTBS_Size_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxTBS_Size_r16", -1);

      // decode maxNumberTCI_states_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberTCI_states_r16", -1);

      maxNumberTCI_states_r16 = new Asn1Integer();
      maxNumberTCI_states_r16.decode (buffer, 1, 2);

      buffer.invokeCharacters(maxNumberTCI_states_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberTCI_states_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode supportRepNumPDSCH_TDRA_r16

      if (supportRepNumPDSCH_TDRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("supportRepNumPDSCH_TDRA_r16", -1);

         supportRepNumPDSCH_TDRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportRepNumPDSCH_TDRA_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("supportRepNumPDSCH_TDRA_r16");

      // encode maxTBS_Size_r16

      if (maxTBS_Size_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxTBS_Size_r16", -1);

         maxTBS_Size_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxTBS_Size_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxTBS_Size_r16");

      // encode maxNumberTCI_states_r16

      if (maxNumberTCI_states_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberTCI_states_r16", -1);

         maxNumberTCI_states_r16.encode (buffer, 1, 2);

         buffer.getContext().eventDispatcher.endElement("maxNumberTCI_states_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberTCI_states_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportRepNumPDSCH_TDRA_r16 != null) supportRepNumPDSCH_TDRA_r16.print (_sb, "supportRepNumPDSCH_TDRA_r16", _level+1);
      if (maxTBS_Size_r16 != null) maxTBS_Size_r16.print (_sb, "maxTBS_Size_r16", _level+1);
      if (maxNumberTCI_states_r16 != null) maxNumberTCI_states_r16.print (_sb, "maxNumberTCI_states_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
