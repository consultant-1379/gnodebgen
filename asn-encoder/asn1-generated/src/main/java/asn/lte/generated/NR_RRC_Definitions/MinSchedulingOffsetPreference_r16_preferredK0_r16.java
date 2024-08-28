/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MinSchedulingOffsetPreference_r16_preferredK0_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_15kHz_r16 preferredK0_SCS_15kHz_r16 = null;  // optional
   public MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 preferredK0_SCS_30kHz_r16 = null;  // optional
   public MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_60kHz_r16 preferredK0_SCS_60kHz_r16 = null;  // optional
   public MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_120kHz_r16 preferredK0_SCS_120kHz_r16 = null;  // optional

   public MinSchedulingOffsetPreference_r16_preferredK0_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MinSchedulingOffsetPreference_r16_preferredK0_r16 (
      MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_15kHz_r16 preferredK0_SCS_15kHz_r16_,
      MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 preferredK0_SCS_30kHz_r16_,
      MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_60kHz_r16 preferredK0_SCS_60kHz_r16_,
      MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_120kHz_r16 preferredK0_SCS_120kHz_r16_
   ) {
      super();
      preferredK0_SCS_15kHz_r16 = preferredK0_SCS_15kHz_r16_;
      preferredK0_SCS_30kHz_r16 = preferredK0_SCS_30kHz_r16_;
      preferredK0_SCS_60kHz_r16 = preferredK0_SCS_60kHz_r16_;
      preferredK0_SCS_120kHz_r16 = preferredK0_SCS_120kHz_r16_;
   }

   public void init () {
      preferredK0_SCS_15kHz_r16 = null;
      preferredK0_SCS_30kHz_r16 = null;
      preferredK0_SCS_60kHz_r16 = null;
      preferredK0_SCS_120kHz_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return preferredK0_SCS_15kHz_r16;
         case 1: return preferredK0_SCS_30kHz_r16;
         case 2: return preferredK0_SCS_60kHz_r16;
         case 3: return preferredK0_SCS_120kHz_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "preferredK0-SCS-15kHz-r16";
         case 1: return "preferredK0-SCS-30kHz-r16";
         case 2: return "preferredK0-SCS-60kHz-r16";
         case 3: return "preferredK0-SCS-120kHz-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean preferredK0_SCS_15kHz_r16Present = buffer.decodeBit ("preferredK0_SCS_15kHz_r16Present");
      boolean preferredK0_SCS_30kHz_r16Present = buffer.decodeBit ("preferredK0_SCS_30kHz_r16Present");
      boolean preferredK0_SCS_60kHz_r16Present = buffer.decodeBit ("preferredK0_SCS_60kHz_r16Present");
      boolean preferredK0_SCS_120kHz_r16Present = buffer.decodeBit ("preferredK0_SCS_120kHz_r16Present");

      // decode preferredK0_SCS_15kHz_r16

      if (preferredK0_SCS_15kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("preferredK0_SCS_15kHz_r16", -1);

         int tval = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_15kHz_r16.decodeEnumValue (buffer);
         preferredK0_SCS_15kHz_r16 = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_15kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("preferredK0_SCS_15kHz_r16", -1);
      }
      else {
         preferredK0_SCS_15kHz_r16 = null;
      }

      // decode preferredK0_SCS_30kHz_r16

      if (preferredK0_SCS_30kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("preferredK0_SCS_30kHz_r16", -1);

         int tval = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16.decodeEnumValue (buffer);
         preferredK0_SCS_30kHz_r16 = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("preferredK0_SCS_30kHz_r16", -1);
      }
      else {
         preferredK0_SCS_30kHz_r16 = null;
      }

      // decode preferredK0_SCS_60kHz_r16

      if (preferredK0_SCS_60kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("preferredK0_SCS_60kHz_r16", -1);

         int tval = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_60kHz_r16.decodeEnumValue (buffer);
         preferredK0_SCS_60kHz_r16 = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_60kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("preferredK0_SCS_60kHz_r16", -1);
      }
      else {
         preferredK0_SCS_60kHz_r16 = null;
      }

      // decode preferredK0_SCS_120kHz_r16

      if (preferredK0_SCS_120kHz_r16Present) {
         buffer.getContext().eventDispatcher.startElement("preferredK0_SCS_120kHz_r16", -1);

         int tval = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_120kHz_r16.decodeEnumValue (buffer);
         preferredK0_SCS_120kHz_r16 = MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_120kHz_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("preferredK0_SCS_120kHz_r16", -1);
      }
      else {
         preferredK0_SCS_120kHz_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (preferredK0_SCS_15kHz_r16 != null) preferredK0_SCS_15kHz_r16.print (_sb, "preferredK0_SCS_15kHz_r16", _level+1);
      if (preferredK0_SCS_30kHz_r16 != null) preferredK0_SCS_30kHz_r16.print (_sb, "preferredK0_SCS_30kHz_r16", _level+1);
      if (preferredK0_SCS_60kHz_r16 != null) preferredK0_SCS_60kHz_r16.print (_sb, "preferredK0_SCS_60kHz_r16", _level+1);
      if (preferredK0_SCS_120kHz_r16 != null) preferredK0_SCS_120kHz_r16.print (_sb, "preferredK0_SCS_120kHz_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
