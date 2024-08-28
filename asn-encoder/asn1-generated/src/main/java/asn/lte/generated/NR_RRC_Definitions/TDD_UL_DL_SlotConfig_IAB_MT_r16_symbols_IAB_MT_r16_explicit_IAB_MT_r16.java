/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer nrofDownlinkSymbols_r16;  // optional
   public Asn1Integer nrofUplinkSymbols_r16;  // optional

   public TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 (
      Asn1Integer nrofDownlinkSymbols_r16_,
      Asn1Integer nrofUplinkSymbols_r16_
   ) {
      super();
      nrofDownlinkSymbols_r16 = nrofDownlinkSymbols_r16_;
      nrofUplinkSymbols_r16 = nrofUplinkSymbols_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 (long nrofDownlinkSymbols_r16_,
      long nrofUplinkSymbols_r16_
   ) {
      super();
      nrofDownlinkSymbols_r16 = new Asn1Integer (nrofDownlinkSymbols_r16_);
      nrofUplinkSymbols_r16 = new Asn1Integer (nrofUplinkSymbols_r16_);
   }

   public void init () {
      nrofDownlinkSymbols_r16 = null;
      nrofUplinkSymbols_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nrofDownlinkSymbols_r16;
         case 1: return nrofUplinkSymbols_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nrofDownlinkSymbols-r16";
         case 1: return "nrofUplinkSymbols-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nrofDownlinkSymbols_r16Present = buffer.decodeBit ("nrofDownlinkSymbols_r16Present");
      boolean nrofUplinkSymbols_r16Present = buffer.decodeBit ("nrofUplinkSymbols_r16Present");

      // decode nrofDownlinkSymbols_r16

      if (nrofDownlinkSymbols_r16Present) {
         buffer.getContext().eventDispatcher.startElement("nrofDownlinkSymbols_r16", -1);

         nrofDownlinkSymbols_r16 = new Asn1Integer();
         nrofDownlinkSymbols_r16.decode (buffer, 1, 13);

         buffer.invokeCharacters(nrofDownlinkSymbols_r16.toString());
         buffer.getContext().eventDispatcher.endElement("nrofDownlinkSymbols_r16", -1);
      }
      else {
         nrofDownlinkSymbols_r16 = null;
      }

      // decode nrofUplinkSymbols_r16

      if (nrofUplinkSymbols_r16Present) {
         buffer.getContext().eventDispatcher.startElement("nrofUplinkSymbols_r16", -1);

         nrofUplinkSymbols_r16 = new Asn1Integer();
         nrofUplinkSymbols_r16.decode (buffer, 1, 13);

         buffer.invokeCharacters(nrofUplinkSymbols_r16.toString());
         buffer.getContext().eventDispatcher.endElement("nrofUplinkSymbols_r16", -1);
      }
      else {
         nrofUplinkSymbols_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (nrofDownlinkSymbols_r16 != null) nrofDownlinkSymbols_r16.print (_sb, "nrofDownlinkSymbols_r16", _level+1);
      if (nrofUplinkSymbols_r16 != null) nrofUplinkSymbols_r16.print (_sb, "nrofUplinkSymbols_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
