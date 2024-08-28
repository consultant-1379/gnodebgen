/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_ParametersMRDC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCP-ParametersMRDC";
   }

   public PDCP_ParametersMRDC_pdcp_DuplicationSplitSRB pdcp_DuplicationSplitSRB = null;  // optional
   public PDCP_ParametersMRDC_pdcp_DuplicationSplitDRB pdcp_DuplicationSplitDRB = null;  // optional

   public PDCP_ParametersMRDC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_ParametersMRDC (
      PDCP_ParametersMRDC_pdcp_DuplicationSplitSRB pdcp_DuplicationSplitSRB_,
      PDCP_ParametersMRDC_pdcp_DuplicationSplitDRB pdcp_DuplicationSplitDRB_
   ) {
      super();
      pdcp_DuplicationSplitSRB = pdcp_DuplicationSplitSRB_;
      pdcp_DuplicationSplitDRB = pdcp_DuplicationSplitDRB_;
   }

   public void init () {
      pdcp_DuplicationSplitSRB = null;
      pdcp_DuplicationSplitDRB = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pdcp_DuplicationSplitSRB;
         case 1: return pdcp_DuplicationSplitDRB;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pdcp-DuplicationSplitSRB";
         case 1: return "pdcp-DuplicationSplitDRB";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pdcp_DuplicationSplitSRBPresent = buffer.decodeBit ("pdcp_DuplicationSplitSRBPresent");
      boolean pdcp_DuplicationSplitDRBPresent = buffer.decodeBit ("pdcp_DuplicationSplitDRBPresent");

      // decode pdcp_DuplicationSplitSRB

      if (pdcp_DuplicationSplitSRBPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSplitSRB", -1);

         int tval = PDCP_ParametersMRDC_pdcp_DuplicationSplitSRB.decodeEnumValue (buffer);
         pdcp_DuplicationSplitSRB = PDCP_ParametersMRDC_pdcp_DuplicationSplitSRB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSplitSRB", -1);
      }
      else {
         pdcp_DuplicationSplitSRB = null;
      }

      // decode pdcp_DuplicationSplitDRB

      if (pdcp_DuplicationSplitDRBPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSplitDRB", -1);

         int tval = PDCP_ParametersMRDC_pdcp_DuplicationSplitDRB.decodeEnumValue (buffer);
         pdcp_DuplicationSplitDRB = PDCP_ParametersMRDC_pdcp_DuplicationSplitDRB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSplitDRB", -1);
      }
      else {
         pdcp_DuplicationSplitDRB = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((pdcp_DuplicationSplitSRB != null), null);
      buffer.encodeBit ((pdcp_DuplicationSplitDRB != null), null);

      // encode pdcp_DuplicationSplitSRB

      if (pdcp_DuplicationSplitSRB != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSplitSRB", -1);

         pdcp_DuplicationSplitSRB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSplitSRB", -1);
      }

      // encode pdcp_DuplicationSplitDRB

      if (pdcp_DuplicationSplitDRB != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSplitDRB", -1);

         pdcp_DuplicationSplitDRB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSplitDRB", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pdcp_DuplicationSplitSRB != null) pdcp_DuplicationSplitSRB.print (_sb, "pdcp_DuplicationSplitSRB", _level+1);
      if (pdcp_DuplicationSplitDRB != null) pdcp_DuplicationSplitDRB.print (_sb, "pdcp_DuplicationSplitDRB", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
