/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters_v10i0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RF-Parameters-v10i0";
   }

   public SupportedBandCombination_v10i0 supportedBandCombination_v10i0;  // optional

   public RF_Parameters_v10i0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters_v10i0 (
      SupportedBandCombination_v10i0 supportedBandCombination_v10i0_
   ) {
      super();
      supportedBandCombination_v10i0 = supportedBandCombination_v10i0_;
   }

   public void init () {
      supportedBandCombination_v10i0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandCombination_v10i0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandCombination-v10i0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportedBandCombination_v10i0Present = buffer.decodeBit ("supportedBandCombination_v10i0Present");

      // decode supportedBandCombination_v10i0

      if (supportedBandCombination_v10i0Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombination_v10i0", -1);

         supportedBandCombination_v10i0 = new SupportedBandCombination_v10i0();
         supportedBandCombination_v10i0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombination_v10i0", -1);
      }
      else {
         supportedBandCombination_v10i0 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedBandCombination_v10i0 != null) supportedBandCombination_v10i0.print (_sb, "supportedBandCombination_v10i0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
