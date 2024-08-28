/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_TPC_PDCCH_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-TPC-PDCCH-Config";
   }

   public SRS_TPC_PDCCH_Config_srs_CC_SetIndexlist srs_CC_SetIndexlist;  // optional

   public SRS_TPC_PDCCH_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_TPC_PDCCH_Config (
      SRS_TPC_PDCCH_Config_srs_CC_SetIndexlist srs_CC_SetIndexlist_
   ) {
      super();
      srs_CC_SetIndexlist = srs_CC_SetIndexlist_;
   }

   public void init () {
      srs_CC_SetIndexlist = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srs_CC_SetIndexlist;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srs-CC-SetIndexlist";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean srs_CC_SetIndexlistPresent = buffer.decodeBit ("srs_CC_SetIndexlistPresent");

      // decode srs_CC_SetIndexlist

      if (srs_CC_SetIndexlistPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_CC_SetIndexlist", -1);

         srs_CC_SetIndexlist = new SRS_TPC_PDCCH_Config_srs_CC_SetIndexlist();
         srs_CC_SetIndexlist.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_CC_SetIndexlist", -1);
      }
      else {
         srs_CC_SetIndexlist = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((srs_CC_SetIndexlist != null), null);

      // encode srs_CC_SetIndexlist

      if (srs_CC_SetIndexlist != null) {
         buffer.getContext().eventDispatcher.startElement("srs_CC_SetIndexlist", -1);

         srs_CC_SetIndexlist.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_CC_SetIndexlist", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srs_CC_SetIndexlist != null) srs_CC_SetIndexlist.print (_sb, "srs_CC_SetIndexlist", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
