/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandNR_channelBWs_DL_v1590_fr2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString scs_60kHz;  // optional
   public Asn1BitString scs_120kHz;  // optional

   public BandNR_channelBWs_DL_v1590_fr2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandNR_channelBWs_DL_v1590_fr2 (
      Asn1BitString scs_60kHz_,
      Asn1BitString scs_120kHz_
   ) {
      super();
      scs_60kHz = scs_60kHz_;
      scs_120kHz = scs_120kHz_;
   }

   public void init () {
      scs_60kHz = null;
      scs_120kHz = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scs_60kHz;
         case 1: return scs_120kHz;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scs-60kHz";
         case 1: return "scs-120kHz";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scs_60kHzPresent = buffer.decodeBit ("scs_60kHzPresent");
      boolean scs_120kHzPresent = buffer.decodeBit ("scs_120kHzPresent");

      // decode scs_60kHz

      if (scs_60kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz", -1);

         scs_60kHz = new Asn1BitString();
         scs_60kHz.decode (buffer, 8, 8);

         buffer.invokeCharacters(scs_60kHz.toString());
         buffer.getContext().eventDispatcher.endElement("scs_60kHz", -1);
      }
      else {
         scs_60kHz = null;
      }

      // decode scs_120kHz

      if (scs_120kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_120kHz", -1);

         scs_120kHz = new Asn1BitString();
         scs_120kHz.decode (buffer, 8, 8);

         buffer.invokeCharacters(scs_120kHz.toString());
         buffer.getContext().eventDispatcher.endElement("scs_120kHz", -1);
      }
      else {
         scs_120kHz = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((scs_60kHz != null), null);
      buffer.encodeBit ((scs_120kHz != null), null);

      // encode scs_60kHz

      if (scs_60kHz != null) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz", -1);

         scs_60kHz.encode (buffer, 8, 8);

         buffer.getContext().eventDispatcher.endElement("scs_60kHz", -1);
      }

      // encode scs_120kHz

      if (scs_120kHz != null) {
         buffer.getContext().eventDispatcher.startElement("scs_120kHz", -1);

         scs_120kHz.encode (buffer, 8, 8);

         buffer.getContext().eventDispatcher.endElement("scs_120kHz", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (scs_60kHz != null) scs_60kHz.print (_sb, "scs_60kHz", _level+1);
      if (scs_120kHz != null) scs_120kHz.print (_sb, "scs_120kHz", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
