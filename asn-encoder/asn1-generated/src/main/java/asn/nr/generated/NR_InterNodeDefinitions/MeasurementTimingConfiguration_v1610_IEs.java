/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class MeasurementTimingConfiguration_v1610_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasurementTimingConfiguration-v1610-IEs";
   }

   public MeasurementTimingConfiguration_v1610_IEs_csi_RS_Config_r16 csi_RS_Config_r16;
   public MeasurementTimingConfiguration_v1610_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public MeasurementTimingConfiguration_v1610_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasurementTimingConfiguration_v1610_IEs (
      MeasurementTimingConfiguration_v1610_IEs_csi_RS_Config_r16 csi_RS_Config_r16_,
      MeasurementTimingConfiguration_v1610_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      csi_RS_Config_r16 = csi_RS_Config_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasurementTimingConfiguration_v1610_IEs (
      MeasurementTimingConfiguration_v1610_IEs_csi_RS_Config_r16 csi_RS_Config_r16_
   ) {
      super();
      csi_RS_Config_r16 = csi_RS_Config_r16_;
   }

   public void init () {
      csi_RS_Config_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_RS_Config_r16;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-RS-Config-r16";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode csi_RS_Config_r16

      buffer.getContext().eventDispatcher.startElement("csi_RS_Config_r16", -1);

      csi_RS_Config_r16 = new MeasurementTimingConfiguration_v1610_IEs_csi_RS_Config_r16();
      csi_RS_Config_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_RS_Config_r16", -1);

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new MeasurementTimingConfiguration_v1610_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode csi_RS_Config_r16

      if (csi_RS_Config_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_Config_r16", -1);

         csi_RS_Config_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RS_Config_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("csi_RS_Config_r16");

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_RS_Config_r16 != null) csi_RS_Config_r16.print (_sb, "csi_RS_Config_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
