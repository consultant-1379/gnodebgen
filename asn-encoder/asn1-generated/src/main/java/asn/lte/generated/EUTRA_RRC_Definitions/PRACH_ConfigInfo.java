/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PRACH_ConfigInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PRACH-ConfigInfo";
   }

   public Asn1Integer prach_ConfigIndex;
   public Asn1Boolean highSpeedFlag;
   public Asn1Integer zeroCorrelationZoneConfig;
   public Asn1Integer prach_FreqOffset;

   public PRACH_ConfigInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PRACH_ConfigInfo (
      Asn1Integer prach_ConfigIndex_,
      Asn1Boolean highSpeedFlag_,
      Asn1Integer zeroCorrelationZoneConfig_,
      Asn1Integer prach_FreqOffset_
   ) {
      super();
      prach_ConfigIndex = prach_ConfigIndex_;
      highSpeedFlag = highSpeedFlag_;
      zeroCorrelationZoneConfig = zeroCorrelationZoneConfig_;
      prach_FreqOffset = prach_FreqOffset_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PRACH_ConfigInfo (long prach_ConfigIndex_,
      boolean highSpeedFlag_,
      long zeroCorrelationZoneConfig_,
      long prach_FreqOffset_
   ) {
      super();
      prach_ConfigIndex = new Asn1Integer (prach_ConfigIndex_);
      highSpeedFlag = new Asn1Boolean (highSpeedFlag_);
      zeroCorrelationZoneConfig = new Asn1Integer (zeroCorrelationZoneConfig_);
      prach_FreqOffset = new Asn1Integer (prach_FreqOffset_);
   }

   public void init () {
      prach_ConfigIndex = null;
      highSpeedFlag = null;
      zeroCorrelationZoneConfig = null;
      prach_FreqOffset = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return prach_ConfigIndex;
         case 1: return highSpeedFlag;
         case 2: return zeroCorrelationZoneConfig;
         case 3: return prach_FreqOffset;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "prach-ConfigIndex";
         case 1: return "highSpeedFlag";
         case 2: return "zeroCorrelationZoneConfig";
         case 3: return "prach-FreqOffset";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode prach_ConfigIndex

      buffer.getContext().eventDispatcher.startElement("prach_ConfigIndex", -1);

      prach_ConfigIndex = new Asn1Integer();
      prach_ConfigIndex.decode (buffer, 0, 63);

      buffer.invokeCharacters(prach_ConfigIndex.toString());
      buffer.getContext().eventDispatcher.endElement("prach_ConfigIndex", -1);

      // decode highSpeedFlag

      buffer.getContext().eventDispatcher.startElement("highSpeedFlag", -1);

      highSpeedFlag = new Asn1Boolean();
      highSpeedFlag.decode (buffer);

      buffer.invokeCharacters(highSpeedFlag.toString());
      buffer.getContext().eventDispatcher.endElement("highSpeedFlag", -1);

      // decode zeroCorrelationZoneConfig

      buffer.getContext().eventDispatcher.startElement("zeroCorrelationZoneConfig", -1);

      zeroCorrelationZoneConfig = new Asn1Integer();
      zeroCorrelationZoneConfig.decode (buffer, 0, 15);

      buffer.invokeCharacters(zeroCorrelationZoneConfig.toString());
      buffer.getContext().eventDispatcher.endElement("zeroCorrelationZoneConfig", -1);

      // decode prach_FreqOffset

      buffer.getContext().eventDispatcher.startElement("prach_FreqOffset", -1);

      prach_FreqOffset = new Asn1Integer();
      prach_FreqOffset.decode (buffer, 0, 94);

      buffer.invokeCharacters(prach_FreqOffset.toString());
      buffer.getContext().eventDispatcher.endElement("prach_FreqOffset", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (prach_ConfigIndex != null) prach_ConfigIndex.print (_sb, "prach_ConfigIndex", _level+1);
      if (highSpeedFlag != null) highSpeedFlag.print (_sb, "highSpeedFlag", _level+1);
      if (zeroCorrelationZoneConfig != null) zeroCorrelationZoneConfig.print (_sb, "zeroCorrelationZoneConfig", _level+1);
      if (prach_FreqOffset != null) prach_FreqOffset.print (_sb, "prach_FreqOffset", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
