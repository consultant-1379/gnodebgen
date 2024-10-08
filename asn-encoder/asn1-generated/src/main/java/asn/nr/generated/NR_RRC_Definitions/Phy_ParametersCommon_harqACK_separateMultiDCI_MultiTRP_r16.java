/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16_maxNumberLongPUCCHs_r16 maxNumberLongPUCCHs_r16 = null;  // optional

   public Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16 (
      Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16_maxNumberLongPUCCHs_r16 maxNumberLongPUCCHs_r16_
   ) {
      super();
      maxNumberLongPUCCHs_r16 = maxNumberLongPUCCHs_r16_;
   }

   public void init () {
      maxNumberLongPUCCHs_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberLongPUCCHs_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberLongPUCCHs-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean maxNumberLongPUCCHs_r16Present = buffer.decodeBit ("maxNumberLongPUCCHs_r16Present");

      // decode maxNumberLongPUCCHs_r16

      if (maxNumberLongPUCCHs_r16Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumberLongPUCCHs_r16", -1);

         int tval = Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16_maxNumberLongPUCCHs_r16.decodeEnumValue (buffer);
         maxNumberLongPUCCHs_r16 = Phy_ParametersCommon_harqACK_separateMultiDCI_MultiTRP_r16_maxNumberLongPUCCHs_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumberLongPUCCHs_r16", -1);
      }
      else {
         maxNumberLongPUCCHs_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((maxNumberLongPUCCHs_r16 != null), null);

      // encode maxNumberLongPUCCHs_r16

      if (maxNumberLongPUCCHs_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberLongPUCCHs_r16", -1);

         maxNumberLongPUCCHs_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberLongPUCCHs_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberLongPUCCHs_r16 != null) maxNumberLongPUCCHs_r16.print (_sb, "maxNumberLongPUCCHs_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
