/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqGERAN extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierFreqGERAN";
   }

   public ARFCN_ValueGERAN arfcn;
   public BandIndicatorGERAN bandIndicator = null;

   public CarrierFreqGERAN () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqGERAN (
      ARFCN_ValueGERAN arfcn_,
      BandIndicatorGERAN bandIndicator_
   ) {
      super();
      arfcn = arfcn_;
      bandIndicator = bandIndicator_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CarrierFreqGERAN (long arfcn_,
      BandIndicatorGERAN bandIndicator_
   ) {
      super();
      arfcn = new ARFCN_ValueGERAN (arfcn_);
      bandIndicator = bandIndicator_;
   }

   public void init () {
      arfcn = null;
      bandIndicator = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return arfcn;
         case 1: return bandIndicator;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "arfcn";
         case 1: return "bandIndicator";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode arfcn

      buffer.getContext().eventDispatcher.startElement("arfcn", -1);

      arfcn = new ARFCN_ValueGERAN();
      arfcn.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("arfcn", -1);

      // decode bandIndicator

      buffer.getContext().eventDispatcher.startElement("bandIndicator", -1);

      {
         int tval = BandIndicatorGERAN.decodeEnumValue (buffer);
         bandIndicator = BandIndicatorGERAN.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("bandIndicator", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (arfcn != null) arfcn.print (_sb, "arfcn", _level+1);
      if (bandIndicator != null) bandIndicator.print (_sb, "bandIndicator", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
