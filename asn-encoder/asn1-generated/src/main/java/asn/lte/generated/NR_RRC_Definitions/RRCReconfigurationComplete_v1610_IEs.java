/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCReconfigurationComplete_v1610_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCReconfigurationComplete-v1610-IEs";
   }

   public UE_MeasurementsAvailable_r16 ue_MeasurementsAvailable_r16;  // optional
   public NeedForGapsInfoNR_r16 needForGapsInfoNR_r16;  // optional
   public RRCReconfigurationComplete_v1610_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCReconfigurationComplete_v1610_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCReconfigurationComplete_v1610_IEs (
      UE_MeasurementsAvailable_r16 ue_MeasurementsAvailable_r16_,
      NeedForGapsInfoNR_r16 needForGapsInfoNR_r16_,
      RRCReconfigurationComplete_v1610_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ue_MeasurementsAvailable_r16 = ue_MeasurementsAvailable_r16_;
      needForGapsInfoNR_r16 = needForGapsInfoNR_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_MeasurementsAvailable_r16 = null;
      needForGapsInfoNR_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_MeasurementsAvailable_r16;
         case 1: return needForGapsInfoNR_r16;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-MeasurementsAvailable-r16";
         case 1: return "needForGapsInfoNR-r16";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_MeasurementsAvailable_r16Present = buffer.decodeBit ("ue_MeasurementsAvailable_r16Present");
      boolean needForGapsInfoNR_r16Present = buffer.decodeBit ("needForGapsInfoNR_r16Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_MeasurementsAvailable_r16

      if (ue_MeasurementsAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ue_MeasurementsAvailable_r16", -1);

         ue_MeasurementsAvailable_r16 = new UE_MeasurementsAvailable_r16();
         ue_MeasurementsAvailable_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ue_MeasurementsAvailable_r16", -1);
      }
      else {
         ue_MeasurementsAvailable_r16 = null;
      }

      // decode needForGapsInfoNR_r16

      if (needForGapsInfoNR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("needForGapsInfoNR_r16", -1);

         needForGapsInfoNR_r16 = new NeedForGapsInfoNR_r16();
         needForGapsInfoNR_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("needForGapsInfoNR_r16", -1);
      }
      else {
         needForGapsInfoNR_r16 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCReconfigurationComplete_v1610_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ue_MeasurementsAvailable_r16 != null) ue_MeasurementsAvailable_r16.print (_sb, "ue_MeasurementsAvailable_r16", _level+1);
      if (needForGapsInfoNR_r16 != null) needForGapsInfoNR_r16.print (_sb, "needForGapsInfoNR_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
