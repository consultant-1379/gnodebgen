/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionResume_r13_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionResume-r13-IEs";
   }

   public RadioResourceConfigDedicated radioResourceConfigDedicated_r13;  // optional
   public NextHopChainingCount nextHopChainingCount_r13;
   public MeasConfig measConfig_r13;  // optional
   public AntennaInfoDedicated_v10i0 antennaInfoDedicatedPCell_r13;  // optional
   public RRCConnectionResume_r13_IEs_drb_ContinueROHC_r13 drb_ContinueROHC_r13 = null;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public RRCConnectionResume_v1430_IEs rrcConnectionResume_v1430_IEs;  // optional

   public RRCConnectionResume_r13_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionResume_r13_IEs (
      RadioResourceConfigDedicated radioResourceConfigDedicated_r13_,
      NextHopChainingCount nextHopChainingCount_r13_,
      MeasConfig measConfig_r13_,
      AntennaInfoDedicated_v10i0 antennaInfoDedicatedPCell_r13_,
      RRCConnectionResume_r13_IEs_drb_ContinueROHC_r13 drb_ContinueROHC_r13_,
      Asn1OctetString lateNonCriticalExtension_,
      RRCConnectionResume_v1430_IEs rrcConnectionResume_v1430_IEs_
   ) {
      super();
      radioResourceConfigDedicated_r13 = radioResourceConfigDedicated_r13_;
      nextHopChainingCount_r13 = nextHopChainingCount_r13_;
      measConfig_r13 = measConfig_r13_;
      antennaInfoDedicatedPCell_r13 = antennaInfoDedicatedPCell_r13_;
      drb_ContinueROHC_r13 = drb_ContinueROHC_r13_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      rrcConnectionResume_v1430_IEs = rrcConnectionResume_v1430_IEs_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RRCConnectionResume_r13_IEs (
      NextHopChainingCount nextHopChainingCount_r13_
   ) {
      super();
      nextHopChainingCount_r13 = nextHopChainingCount_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCConnectionResume_r13_IEs (RadioResourceConfigDedicated radioResourceConfigDedicated_r13_,
      long nextHopChainingCount_r13_,
      MeasConfig measConfig_r13_,
      AntennaInfoDedicated_v10i0 antennaInfoDedicatedPCell_r13_,
      RRCConnectionResume_r13_IEs_drb_ContinueROHC_r13 drb_ContinueROHC_r13_,
      byte[] lateNonCriticalExtension_,
      RRCConnectionResume_v1430_IEs rrcConnectionResume_v1430_IEs_
   ) {
      super();
      radioResourceConfigDedicated_r13 = radioResourceConfigDedicated_r13_;
      nextHopChainingCount_r13 = new NextHopChainingCount (nextHopChainingCount_r13_);
      measConfig_r13 = measConfig_r13_;
      antennaInfoDedicatedPCell_r13 = antennaInfoDedicatedPCell_r13_;
      drb_ContinueROHC_r13 = drb_ContinueROHC_r13_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      rrcConnectionResume_v1430_IEs = rrcConnectionResume_v1430_IEs_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RRCConnectionResume_r13_IEs (
      long nextHopChainingCount_r13_
   ) {
      super();
      nextHopChainingCount_r13 = new NextHopChainingCount (nextHopChainingCount_r13_);
   }

   public void init () {
      radioResourceConfigDedicated_r13 = null;
      nextHopChainingCount_r13 = null;
      measConfig_r13 = null;
      antennaInfoDedicatedPCell_r13 = null;
      drb_ContinueROHC_r13 = null;
      lateNonCriticalExtension = null;
      rrcConnectionResume_v1430_IEs = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return radioResourceConfigDedicated_r13;
         case 1: return nextHopChainingCount_r13;
         case 2: return measConfig_r13;
         case 3: return antennaInfoDedicatedPCell_r13;
         case 4: return drb_ContinueROHC_r13;
         case 5: return lateNonCriticalExtension;
         case 6: return rrcConnectionResume_v1430_IEs;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "radioResourceConfigDedicated-r13";
         case 1: return "nextHopChainingCount-r13";
         case 2: return "measConfig-r13";
         case 3: return "antennaInfoDedicatedPCell-r13";
         case 4: return "drb-ContinueROHC-r13";
         case 5: return "lateNonCriticalExtension";
         case 6: return "rrcConnectionResume-v1430-IEs";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean radioResourceConfigDedicated_r13Present = buffer.decodeBit ("radioResourceConfigDedicated_r13Present");
      boolean measConfig_r13Present = buffer.decodeBit ("measConfig_r13Present");
      boolean antennaInfoDedicatedPCell_r13Present = buffer.decodeBit ("antennaInfoDedicatedPCell_r13Present");
      boolean drb_ContinueROHC_r13Present = buffer.decodeBit ("drb_ContinueROHC_r13Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean rrcConnectionResume_v1430_IEsPresent = buffer.decodeBit ("rrcConnectionResume_v1430_IEsPresent");

      // decode radioResourceConfigDedicated_r13

      if (radioResourceConfigDedicated_r13Present) {
         buffer.getContext().eventDispatcher.startElement("radioResourceConfigDedicated_r13", -1);

         radioResourceConfigDedicated_r13 = new RadioResourceConfigDedicated();
         radioResourceConfigDedicated_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("radioResourceConfigDedicated_r13", -1);
      }
      else {
         radioResourceConfigDedicated_r13 = null;
      }

      // decode nextHopChainingCount_r13

      buffer.getContext().eventDispatcher.startElement("nextHopChainingCount_r13", -1);

      nextHopChainingCount_r13 = new NextHopChainingCount();
      nextHopChainingCount_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nextHopChainingCount_r13", -1);

      // decode measConfig_r13

      if (measConfig_r13Present) {
         buffer.getContext().eventDispatcher.startElement("measConfig_r13", -1);

         measConfig_r13 = new MeasConfig();
         measConfig_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measConfig_r13", -1);
      }
      else {
         measConfig_r13 = null;
      }

      // decode antennaInfoDedicatedPCell_r13

      if (antennaInfoDedicatedPCell_r13Present) {
         buffer.getContext().eventDispatcher.startElement("antennaInfoDedicatedPCell_r13", -1);

         antennaInfoDedicatedPCell_r13 = new AntennaInfoDedicated_v10i0();
         antennaInfoDedicatedPCell_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("antennaInfoDedicatedPCell_r13", -1);
      }
      else {
         antennaInfoDedicatedPCell_r13 = null;
      }

      // decode drb_ContinueROHC_r13

      if (drb_ContinueROHC_r13Present) {
         buffer.getContext().eventDispatcher.startElement("drb_ContinueROHC_r13", -1);

         int tval = RRCConnectionResume_r13_IEs_drb_ContinueROHC_r13.decodeEnumValue (buffer);
         drb_ContinueROHC_r13 = RRCConnectionResume_r13_IEs_drb_ContinueROHC_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("drb_ContinueROHC_r13", -1);
      }
      else {
         drb_ContinueROHC_r13 = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode rrcConnectionResume_v1430_IEs

      if (rrcConnectionResume_v1430_IEsPresent) {
         buffer.getContext().eventDispatcher.startElement("rrcConnectionResume_v1430_IEs", -1);

         rrcConnectionResume_v1430_IEs = new RRCConnectionResume_v1430_IEs();
         rrcConnectionResume_v1430_IEs.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rrcConnectionResume_v1430_IEs", -1);
      }
      else {
         rrcConnectionResume_v1430_IEs = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (radioResourceConfigDedicated_r13 != null) radioResourceConfigDedicated_r13.print (_sb, "radioResourceConfigDedicated_r13", _level+1);
      if (nextHopChainingCount_r13 != null) nextHopChainingCount_r13.print (_sb, "nextHopChainingCount_r13", _level+1);
      if (measConfig_r13 != null) measConfig_r13.print (_sb, "measConfig_r13", _level+1);
      if (antennaInfoDedicatedPCell_r13 != null) antennaInfoDedicatedPCell_r13.print (_sb, "antennaInfoDedicatedPCell_r13", _level+1);
      if (drb_ContinueROHC_r13 != null) drb_ContinueROHC_r13.print (_sb, "drb_ContinueROHC_r13", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (rrcConnectionResume_v1430_IEs != null) rrcConnectionResume_v1430_IEs.print (_sb, "rrcConnectionResume_v1430_IEs", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
