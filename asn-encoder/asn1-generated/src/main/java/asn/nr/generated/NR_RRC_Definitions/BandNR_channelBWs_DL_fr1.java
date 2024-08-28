/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandNR_channelBWs_DL_fr1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString scs_15kHz;  // optional
   public Asn1BitString scs_30kHz;  // optional
   public Asn1BitString scs_60kHz;  // optional

   public BandNR_channelBWs_DL_fr1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandNR_channelBWs_DL_fr1 (
      Asn1BitString scs_15kHz_,
      Asn1BitString scs_30kHz_,
      Asn1BitString scs_60kHz_
   ) {
      super();
      scs_15kHz = scs_15kHz_;
      scs_30kHz = scs_30kHz_;
      scs_60kHz = scs_60kHz_;
   }

   public void init () {
      scs_15kHz = null;
      scs_30kHz = null;
      scs_60kHz = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scs_15kHz;
         case 1: return scs_30kHz;
         case 2: return scs_60kHz;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scs-15kHz";
         case 1: return "scs-30kHz";
         case 2: return "scs-60kHz";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scs_15kHzPresent = buffer.decodeBit ("scs_15kHzPresent");
      boolean scs_30kHzPresent = buffer.decodeBit ("scs_30kHzPresent");
      boolean scs_60kHzPresent = buffer.decodeBit ("scs_60kHzPresent");

      // decode scs_15kHz

      if (scs_15kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_15kHz", -1);

         scs_15kHz = new Asn1BitString();
         scs_15kHz.decode (buffer, 10, 10);

         buffer.invokeCharacters(scs_15kHz.toString());
         buffer.getContext().eventDispatcher.endElement("scs_15kHz", -1);
      }
      else {
         scs_15kHz = null;
      }

      // decode scs_30kHz

      if (scs_30kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_30kHz", -1);

         scs_30kHz = new Asn1BitString();
         scs_30kHz.decode (buffer, 10, 10);

         buffer.invokeCharacters(scs_30kHz.toString());
         buffer.getContext().eventDispatcher.endElement("scs_30kHz", -1);
      }
      else {
         scs_30kHz = null;
      }

      // decode scs_60kHz

      if (scs_60kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz", -1);

         scs_60kHz = new Asn1BitString();
         scs_60kHz.decode (buffer, 10, 10);

         buffer.invokeCharacters(scs_60kHz.toString());
         buffer.getContext().eventDispatcher.endElement("scs_60kHz", -1);
      }
      else {
         scs_60kHz = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((scs_15kHz != null), null);
      buffer.encodeBit ((scs_30kHz != null), null);
      buffer.encodeBit ((scs_60kHz != null), null);

      // encode scs_15kHz

      if (scs_15kHz != null) {
         buffer.getContext().eventDispatcher.startElement("scs_15kHz", -1);

         scs_15kHz.encode (buffer, 10, 10);

         buffer.getContext().eventDispatcher.endElement("scs_15kHz", -1);
      }

      // encode scs_30kHz

      if (scs_30kHz != null) {
         buffer.getContext().eventDispatcher.startElement("scs_30kHz", -1);

         scs_30kHz.encode (buffer, 10, 10);

         buffer.getContext().eventDispatcher.endElement("scs_30kHz", -1);
      }

      // encode scs_60kHz

      if (scs_60kHz != null) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz", -1);

         scs_60kHz.encode (buffer, 10, 10);

         buffer.getContext().eventDispatcher.endElement("scs_60kHz", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (scs_15kHz != null) scs_15kHz.print (_sb, "scs_15kHz", _level+1);
      if (scs_30kHz != null) scs_30kHz.print (_sb, "scs_30kHz", _level+1);
      if (scs_60kHz != null) scs_60kHz.print (_sb, "scs_60kHz", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
