/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersMRDC_FRX_Diff extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasAndMobParametersMRDC-FRX-Diff";
   }

   public MeasAndMobParametersMRDC_FRX_Diff_simultaneousRxDataSSB_DiffNumerology simultaneousRxDataSSB_DiffNumerology = null;  // optional

   public MeasAndMobParametersMRDC_FRX_Diff () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersMRDC_FRX_Diff (
      MeasAndMobParametersMRDC_FRX_Diff_simultaneousRxDataSSB_DiffNumerology simultaneousRxDataSSB_DiffNumerology_
   ) {
      super();
      simultaneousRxDataSSB_DiffNumerology = simultaneousRxDataSSB_DiffNumerology_;
   }

   public void init () {
      simultaneousRxDataSSB_DiffNumerology = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return simultaneousRxDataSSB_DiffNumerology;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "simultaneousRxDataSSB-DiffNumerology";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean simultaneousRxDataSSB_DiffNumerologyPresent = buffer.decodeBit ("simultaneousRxDataSSB_DiffNumerologyPresent");

      // decode simultaneousRxDataSSB_DiffNumerology

      if (simultaneousRxDataSSB_DiffNumerologyPresent) {
         buffer.getContext().eventDispatcher.startElement("simultaneousRxDataSSB_DiffNumerology", -1);

         int tval = MeasAndMobParametersMRDC_FRX_Diff_simultaneousRxDataSSB_DiffNumerology.decodeEnumValue (buffer);
         simultaneousRxDataSSB_DiffNumerology = MeasAndMobParametersMRDC_FRX_Diff_simultaneousRxDataSSB_DiffNumerology.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simultaneousRxDataSSB_DiffNumerology", -1);
      }
      else {
         simultaneousRxDataSSB_DiffNumerology = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((simultaneousRxDataSSB_DiffNumerology != null), null);

      // encode simultaneousRxDataSSB_DiffNumerology

      if (simultaneousRxDataSSB_DiffNumerology != null) {
         buffer.getContext().eventDispatcher.startElement("simultaneousRxDataSSB_DiffNumerology", -1);

         simultaneousRxDataSSB_DiffNumerology.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("simultaneousRxDataSSB_DiffNumerology", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (simultaneousRxDataSSB_DiffNumerology != null) simultaneousRxDataSSB_DiffNumerology.print (_sb, "simultaneousRxDataSSB_DiffNumerology", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
