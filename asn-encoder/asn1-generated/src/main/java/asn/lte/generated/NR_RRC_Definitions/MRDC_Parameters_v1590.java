/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MRDC_Parameters_v1590 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MRDC-Parameters-v1590";
   }

   public MRDC_Parameters_v1590_interBandContiguousMRDC interBandContiguousMRDC = null;  // optional

   public MRDC_Parameters_v1590 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MRDC_Parameters_v1590 (
      MRDC_Parameters_v1590_interBandContiguousMRDC interBandContiguousMRDC_
   ) {
      super();
      interBandContiguousMRDC = interBandContiguousMRDC_;
   }

   public void init () {
      interBandContiguousMRDC = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return interBandContiguousMRDC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "interBandContiguousMRDC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean interBandContiguousMRDCPresent = buffer.decodeBit ("interBandContiguousMRDCPresent");

      // decode interBandContiguousMRDC

      if (interBandContiguousMRDCPresent) {
         buffer.getContext().eventDispatcher.startElement("interBandContiguousMRDC", -1);

         int tval = MRDC_Parameters_v1590_interBandContiguousMRDC.decodeEnumValue (buffer);
         interBandContiguousMRDC = MRDC_Parameters_v1590_interBandContiguousMRDC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("interBandContiguousMRDC", -1);
      }
      else {
         interBandContiguousMRDC = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (interBandContiguousMRDC != null) interBandContiguousMRDC.print (_sb, "interBandContiguousMRDC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
