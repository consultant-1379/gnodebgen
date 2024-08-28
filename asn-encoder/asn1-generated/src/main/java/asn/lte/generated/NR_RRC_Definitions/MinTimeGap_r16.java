/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MinTimeGap_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MinTimeGap-r16";
   }

   public MinTimeGap_r16_scs_15kHz_r16 scs_15kHz_r16 = null;  // optional
   public MinTimeGap_r16_scs_30kHz_r16 scs_30kHz_r16 = null;  // optional
   public MinTimeGap_r16_scs_60kHz_r16 scs_60kHz_r16 = null;  // optional
   public MinTimeGap_r16_scs_120kHz_r16 scs_120kHz_r16 = null;  // optional

   public MinTimeGap_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MinTimeGap_r16 (
      MinTimeGap_r16_scs_15kHz_r16 scs_15kHz_r16_,
      MinTimeGap_r16_scs_30kHz_r16 scs_30kHz_r16_,
      MinTimeGap_r16_scs_60kHz_r16 scs_60kHz_r16_,
      MinTimeGap_r16_scs_120kHz_r16 scs_120kHz_r16_
   ) {
      super();
      scs_15kHz_r16 = scs_15kHz_r16_;
      scs_30kHz_r16 = scs_30kHz_r16_;
      scs_60kHz_r16 = scs_60kHz_r16_;
      scs_120kHz_r16 = scs_120kHz_r16_;
   }

   public void init () {
      scs_15kHz_r16 = null;
      scs_30kHz_r16 = null;
      scs_60kHz_r16 = null;
      scs_120kHz_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scs_15kHz_r16;
         case 1: return scs_30kHz_r16;
         case 2: return scs_60kHz_r16;
         case 3: return scs_120kHz_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scs-15kHz-r16";
         case 1: return "scs-30kHz-r16";
         case 2: return "scs-60kHz-r16";
         case 3: return "scs-120kHz-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scs_15kHz_r16Present = buffer.decodeBit ("scs_15kHz_r16Present");
      boolean scs_30kHz_r16Present = buffer.decodeBit ("scs_30kHz_r16Present");
      boolean scs_60kHz_r16Present = buffer.decodeBit ("scs_60kHz_r16Present");
      boolean scs_120kHz_r16Present = buffer.decodeBit ("scs_120kHz_r16Present");

      // decode scs_15kHz_r16

      if (scs_15kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_15kHz_r16", -1);

         int tval = MinTimeGap_r16_scs_15kHz_r16.decodeEnumValue (buffer);
         scs_15kHz_r16 = MinTimeGap_r16_scs_15kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scs_15kHz_r16", -1);
      }
      else {
         scs_15kHz_r16 = null;
      }

      // decode scs_30kHz_r16

      if (scs_30kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_30kHz_r16", -1);

         int tval = MinTimeGap_r16_scs_30kHz_r16.decodeEnumValue (buffer);
         scs_30kHz_r16 = MinTimeGap_r16_scs_30kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scs_30kHz_r16", -1);
      }
      else {
         scs_30kHz_r16 = null;
      }

      // decode scs_60kHz_r16

      if (scs_60kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz_r16", -1);

         int tval = MinTimeGap_r16_scs_60kHz_r16.decodeEnumValue (buffer);
         scs_60kHz_r16 = MinTimeGap_r16_scs_60kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scs_60kHz_r16", -1);
      }
      else {
         scs_60kHz_r16 = null;
      }

      // decode scs_120kHz_r16

      if (scs_120kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scs_120kHz_r16", -1);

         int tval = MinTimeGap_r16_scs_120kHz_r16.decodeEnumValue (buffer);
         scs_120kHz_r16 = MinTimeGap_r16_scs_120kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scs_120kHz_r16", -1);
      }
      else {
         scs_120kHz_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (scs_15kHz_r16 != null) scs_15kHz_r16.print (_sb, "scs_15kHz_r16", _level+1);
      if (scs_30kHz_r16 != null) scs_30kHz_r16.print (_sb, "scs_30kHz_r16", _level+1);
      if (scs_60kHz_r16 != null) scs_60kHz_r16.print (_sb, "scs_60kHz_r16", _level+1);
      if (scs_120kHz_r16 != null) scs_120kHz_r16.print (_sb, "scs_120kHz_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
