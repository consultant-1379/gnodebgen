/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersMRDC_XDD_Diff extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasAndMobParametersMRDC-XDD-Diff";
   }

   public MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasPSCell sftd_MeasPSCell = null;  // optional
   public MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasNR_Cell sftd_MeasNR_Cell = null;  // optional

   public MeasAndMobParametersMRDC_XDD_Diff () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersMRDC_XDD_Diff (
      MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasPSCell sftd_MeasPSCell_,
      MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasNR_Cell sftd_MeasNR_Cell_
   ) {
      super();
      sftd_MeasPSCell = sftd_MeasPSCell_;
      sftd_MeasNR_Cell = sftd_MeasNR_Cell_;
   }

   public void init () {
      sftd_MeasPSCell = null;
      sftd_MeasNR_Cell = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sftd_MeasPSCell;
         case 1: return sftd_MeasNR_Cell;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sftd-MeasPSCell";
         case 1: return "sftd-MeasNR-Cell";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sftd_MeasPSCellPresent = buffer.decodeBit ("sftd_MeasPSCellPresent");
      boolean sftd_MeasNR_CellPresent = buffer.decodeBit ("sftd_MeasNR_CellPresent");

      // decode sftd_MeasPSCell

      if (sftd_MeasPSCellPresent) {
         buffer.getContext().eventDispatcher.startElement("sftd_MeasPSCell", -1);

         int tval = MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasPSCell.decodeEnumValue (buffer);
         sftd_MeasPSCell = MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasPSCell.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sftd_MeasPSCell", -1);
      }
      else {
         sftd_MeasPSCell = null;
      }

      // decode sftd_MeasNR_Cell

      if (sftd_MeasNR_CellPresent) {
         buffer.getContext().eventDispatcher.startElement("sftd_MeasNR_Cell", -1);

         int tval = MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasNR_Cell.decodeEnumValue (buffer);
         sftd_MeasNR_Cell = MeasAndMobParametersMRDC_XDD_Diff_sftd_MeasNR_Cell.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sftd_MeasNR_Cell", -1);
      }
      else {
         sftd_MeasNR_Cell = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sftd_MeasPSCell != null), null);
      buffer.encodeBit ((sftd_MeasNR_Cell != null), null);

      // encode sftd_MeasPSCell

      if (sftd_MeasPSCell != null) {
         buffer.getContext().eventDispatcher.startElement("sftd_MeasPSCell", -1);

         sftd_MeasPSCell.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sftd_MeasPSCell", -1);
      }

      // encode sftd_MeasNR_Cell

      if (sftd_MeasNR_Cell != null) {
         buffer.getContext().eventDispatcher.startElement("sftd_MeasNR_Cell", -1);

         sftd_MeasNR_Cell.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sftd_MeasNR_Cell", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sftd_MeasPSCell != null) sftd_MeasPSCell.print (_sb, "sftd_MeasPSCell", _level+1);
      if (sftd_MeasNR_Cell != null) sftd_MeasNR_Cell.print (_sb, "sftd_MeasNR_Cell", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
