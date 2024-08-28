/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxNumberPerCORESET_Pool_r16 maxNumberPerCORESET_Pool_r16 = null;
   public MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxTotalNumberAcrossCORESET_Pool_r16 maxTotalNumberAcrossCORESET_Pool_r16 = null;

   public MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16 (
      MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxNumberPerCORESET_Pool_r16 maxNumberPerCORESET_Pool_r16_,
      MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxTotalNumberAcrossCORESET_Pool_r16 maxTotalNumberAcrossCORESET_Pool_r16_
   ) {
      super();
      maxNumberPerCORESET_Pool_r16 = maxNumberPerCORESET_Pool_r16_;
      maxTotalNumberAcrossCORESET_Pool_r16 = maxTotalNumberAcrossCORESET_Pool_r16_;
   }

   public void init () {
      maxNumberPerCORESET_Pool_r16 = null;
      maxTotalNumberAcrossCORESET_Pool_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberPerCORESET_Pool_r16;
         case 1: return maxTotalNumberAcrossCORESET_Pool_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberPerCORESET-Pool-r16";
         case 1: return "maxTotalNumberAcrossCORESET-Pool-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberPerCORESET_Pool_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberPerCORESET_Pool_r16", -1);

      {
         int tval = MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxNumberPerCORESET_Pool_r16.decodeEnumValue (buffer);
         maxNumberPerCORESET_Pool_r16 = MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxNumberPerCORESET_Pool_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberPerCORESET_Pool_r16", -1);

      // decode maxTotalNumberAcrossCORESET_Pool_r16

      buffer.getContext().eventDispatcher.startElement("maxTotalNumberAcrossCORESET_Pool_r16", -1);

      {
         int tval = MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxTotalNumberAcrossCORESET_Pool_r16.decodeEnumValue (buffer);
         maxTotalNumberAcrossCORESET_Pool_r16 = MIMO_ParametersPerBand_multiDCI_multiTRP_Parameters_r16_maxNumberActivatedTCI_States_r16_maxTotalNumberAcrossCORESET_Pool_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxTotalNumberAcrossCORESET_Pool_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberPerCORESET_Pool_r16

      if (maxNumberPerCORESET_Pool_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPerCORESET_Pool_r16", -1);

         maxNumberPerCORESET_Pool_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberPerCORESET_Pool_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberPerCORESET_Pool_r16");

      // encode maxTotalNumberAcrossCORESET_Pool_r16

      if (maxTotalNumberAcrossCORESET_Pool_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxTotalNumberAcrossCORESET_Pool_r16", -1);

         maxTotalNumberAcrossCORESET_Pool_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxTotalNumberAcrossCORESET_Pool_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxTotalNumberAcrossCORESET_Pool_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberPerCORESET_Pool_r16 != null) maxNumberPerCORESET_Pool_r16.print (_sb, "maxNumberPerCORESET_Pool_r16", _level+1);
      if (maxTotalNumberAcrossCORESET_Pool_r16 != null) maxTotalNumberAcrossCORESET_Pool_r16.print (_sb, "maxTotalNumberAcrossCORESET_Pool_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
