/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReleasePreferenceConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReleasePreferenceConfig-r16";
   }

   public ReleasePreferenceConfig_r16_releasePreferenceProhibitTimer_r16 releasePreferenceProhibitTimer_r16 = null;
   public ReleasePreferenceConfig_r16_connectedReporting connectedReporting = null;  // optional

   public ReleasePreferenceConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReleasePreferenceConfig_r16 (
      ReleasePreferenceConfig_r16_releasePreferenceProhibitTimer_r16 releasePreferenceProhibitTimer_r16_,
      ReleasePreferenceConfig_r16_connectedReporting connectedReporting_
   ) {
      super();
      releasePreferenceProhibitTimer_r16 = releasePreferenceProhibitTimer_r16_;
      connectedReporting = connectedReporting_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ReleasePreferenceConfig_r16 (
      ReleasePreferenceConfig_r16_releasePreferenceProhibitTimer_r16 releasePreferenceProhibitTimer_r16_
   ) {
      super();
      releasePreferenceProhibitTimer_r16 = releasePreferenceProhibitTimer_r16_;
   }

   public void init () {
      releasePreferenceProhibitTimer_r16 = null;
      connectedReporting = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return releasePreferenceProhibitTimer_r16;
         case 1: return connectedReporting;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "releasePreferenceProhibitTimer-r16";
         case 1: return "connectedReporting";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean connectedReportingPresent = buffer.decodeBit ("connectedReportingPresent");

      // decode releasePreferenceProhibitTimer_r16

      buffer.getContext().eventDispatcher.startElement("releasePreferenceProhibitTimer_r16", -1);

      {
         int tval = ReleasePreferenceConfig_r16_releasePreferenceProhibitTimer_r16.decodeEnumValue (buffer);
         releasePreferenceProhibitTimer_r16 = ReleasePreferenceConfig_r16_releasePreferenceProhibitTimer_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("releasePreferenceProhibitTimer_r16", -1);

      // decode connectedReporting

      if (connectedReportingPresent) {
         buffer.getContext().eventDispatcher.startElement("connectedReporting", -1);

         int tval = ReleasePreferenceConfig_r16_connectedReporting.decodeEnumValue (buffer);
         connectedReporting = ReleasePreferenceConfig_r16_connectedReporting.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("connectedReporting", -1);
      }
      else {
         connectedReporting = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (releasePreferenceProhibitTimer_r16 != null) releasePreferenceProhibitTimer_r16.print (_sb, "releasePreferenceProhibitTimer_r16", _level+1);
      if (connectedReporting != null) connectedReporting.print (_sb, "connectedReporting", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
