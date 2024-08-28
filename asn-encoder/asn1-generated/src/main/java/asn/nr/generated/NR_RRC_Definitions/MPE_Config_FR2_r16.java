/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MPE_Config_FR2_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MPE-Config-FR2-r16";
   }

   public MPE_Config_FR2_r16_mpe_ProhibitTimer_r16 mpe_ProhibitTimer_r16 = null;
   public MPE_Config_FR2_r16_mpe_Threshold_r16 mpe_Threshold_r16 = null;

   public MPE_Config_FR2_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MPE_Config_FR2_r16 (
      MPE_Config_FR2_r16_mpe_ProhibitTimer_r16 mpe_ProhibitTimer_r16_,
      MPE_Config_FR2_r16_mpe_Threshold_r16 mpe_Threshold_r16_
   ) {
      super();
      mpe_ProhibitTimer_r16 = mpe_ProhibitTimer_r16_;
      mpe_Threshold_r16 = mpe_Threshold_r16_;
   }

   public void init () {
      mpe_ProhibitTimer_r16 = null;
      mpe_Threshold_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mpe_ProhibitTimer_r16;
         case 1: return mpe_Threshold_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mpe-ProhibitTimer-r16";
         case 1: return "mpe-Threshold-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode mpe_ProhibitTimer_r16

      buffer.getContext().eventDispatcher.startElement("mpe_ProhibitTimer_r16", -1);

      {
         int tval = MPE_Config_FR2_r16_mpe_ProhibitTimer_r16.decodeEnumValue (buffer);
         mpe_ProhibitTimer_r16 = MPE_Config_FR2_r16_mpe_ProhibitTimer_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mpe_ProhibitTimer_r16", -1);

      // decode mpe_Threshold_r16

      buffer.getContext().eventDispatcher.startElement("mpe_Threshold_r16", -1);

      {
         int tval = MPE_Config_FR2_r16_mpe_Threshold_r16.decodeEnumValue (buffer);
         mpe_Threshold_r16 = MPE_Config_FR2_r16_mpe_Threshold_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mpe_Threshold_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode mpe_ProhibitTimer_r16

      if (mpe_ProhibitTimer_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mpe_ProhibitTimer_r16", -1);

         mpe_ProhibitTimer_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mpe_ProhibitTimer_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("mpe_ProhibitTimer_r16");

      // encode mpe_Threshold_r16

      if (mpe_Threshold_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mpe_Threshold_r16", -1);

         mpe_Threshold_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mpe_Threshold_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("mpe_Threshold_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mpe_ProhibitTimer_r16 != null) mpe_ProhibitTimer_r16.print (_sb, "mpe_ProhibitTimer_r16", _level+1);
      if (mpe_Threshold_r16 != null) mpe_Threshold_r16.print (_sb, "mpe_Threshold_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
