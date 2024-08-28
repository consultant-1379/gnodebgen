/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelink_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString scs_60kHz_r16;  // optional
   public Asn1BitString scs_120kHz_r16;  // optional

   public BandSidelink_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandSidelink_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 (
      Asn1BitString scs_60kHz_r16_,
      Asn1BitString scs_120kHz_r16_
   ) {
      super();
      scs_60kHz_r16 = scs_60kHz_r16_;
      scs_120kHz_r16 = scs_120kHz_r16_;
   }

   public void init () {
      scs_60kHz_r16 = null;
      scs_120kHz_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scs_60kHz_r16;
         case 1: return scs_120kHz_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scs-60kHz-r16";
         case 1: return "scs-120kHz-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scs_60kHz_r16Present = buffer.decodeBit ("scs_60kHz_r16Present");
      boolean scs_120kHz_r16Present = buffer.decodeBit ("scs_120kHz_r16Present");

      // decode scs_60kHz_r16

      if (scs_60kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz_r16", -1);

         scs_60kHz_r16 = new Asn1BitString();
         scs_60kHz_r16.decode (buffer, 16, 16);

         buffer.invokeCharacters(scs_60kHz_r16.toString());
         buffer.getContext().eventDispatcher.endElement("scs_60kHz_r16", -1);
      }
      else {
         scs_60kHz_r16 = null;
      }

      // decode scs_120kHz_r16

      if (scs_120kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_120kHz_r16", -1);

         scs_120kHz_r16 = new Asn1BitString();
         scs_120kHz_r16.decode (buffer, 16, 16);

         buffer.invokeCharacters(scs_120kHz_r16.toString());
         buffer.getContext().eventDispatcher.endElement("scs_120kHz_r16", -1);
      }
      else {
         scs_120kHz_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((scs_60kHz_r16 != null), null);
      buffer.encodeBit ((scs_120kHz_r16 != null), null);

      // encode scs_60kHz_r16

      if (scs_60kHz_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz_r16", -1);

         scs_60kHz_r16.encode (buffer, 16, 16);

         buffer.getContext().eventDispatcher.endElement("scs_60kHz_r16", -1);
      }

      // encode scs_120kHz_r16

      if (scs_120kHz_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("scs_120kHz_r16", -1);

         scs_120kHz_r16.encode (buffer, 16, 16);

         buffer.getContext().eventDispatcher.endElement("scs_120kHz_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (scs_60kHz_r16 != null) scs_60kHz_r16.print (_sb, "scs_60kHz_r16", _level+1);
      if (scs_120kHz_r16 != null) scs_120kHz_r16.print (_sb, "scs_120kHz_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
