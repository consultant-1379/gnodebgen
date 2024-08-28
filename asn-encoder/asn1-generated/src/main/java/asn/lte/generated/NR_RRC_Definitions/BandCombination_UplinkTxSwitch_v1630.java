/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandCombination_UplinkTxSwitch_v1630 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombination-UplinkTxSwitch-v1630";
   }

   public BandCombination_v1630 bandCombination_v1630;  // optional

   public BandCombination_UplinkTxSwitch_v1630 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandCombination_UplinkTxSwitch_v1630 (
      BandCombination_v1630 bandCombination_v1630_
   ) {
      super();
      bandCombination_v1630 = bandCombination_v1630_;
   }

   public void init () {
      bandCombination_v1630 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandCombination_v1630;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandCombination-v1630";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bandCombination_v1630Present = buffer.decodeBit ("bandCombination_v1630Present");

      // decode bandCombination_v1630

      if (bandCombination_v1630Present) {
         buffer.getContext().eventDispatcher.startElement("bandCombination_v1630", -1);

         bandCombination_v1630 = new BandCombination_v1630();
         bandCombination_v1630.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandCombination_v1630", -1);
      }
      else {
         bandCombination_v1630 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandCombination_v1630 != null) bandCombination_v1630.print (_sb, "bandCombination_v1630", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
