/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_NR_Capability_v1550 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-NR-Capability-v1550";
   }

   public UE_NR_Capability_v1550_reducedCP_Latency reducedCP_Latency = null;  // optional
   public UE_NR_Capability_v1560 nonCriticalExtension;  // optional

   public UE_NR_Capability_v1550 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_NR_Capability_v1550 (
      UE_NR_Capability_v1550_reducedCP_Latency reducedCP_Latency_,
      UE_NR_Capability_v1560 nonCriticalExtension_
   ) {
      super();
      reducedCP_Latency = reducedCP_Latency_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      reducedCP_Latency = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reducedCP_Latency;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reducedCP-Latency";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean reducedCP_LatencyPresent = buffer.decodeBit ("reducedCP_LatencyPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode reducedCP_Latency

      if (reducedCP_LatencyPresent) {
         buffer.getContext().eventDispatcher.startElement("reducedCP_Latency", -1);

         int tval = UE_NR_Capability_v1550_reducedCP_Latency.decodeEnumValue (buffer);
         reducedCP_Latency = UE_NR_Capability_v1550_reducedCP_Latency.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reducedCP_Latency", -1);
      }
      else {
         reducedCP_Latency = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_NR_Capability_v1560();
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
      if (reducedCP_Latency != null) reducedCP_Latency.print (_sb, "reducedCP_Latency", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
