/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EPDCCH_Config_r11_config_r11_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public EPDCCH_Config_r11_config_r11_setup_subframePatternConfig_r11 subframePatternConfig_r11;  // optional
   public Asn1Integer startSymbol_r11;  // optional
   public EPDCCH_SetConfigToReleaseList_r11 setConfigToReleaseList_r11;  // optional
   public EPDCCH_SetConfigToAddModList_r11 setConfigToAddModList_r11;  // optional

   public EPDCCH_Config_r11_config_r11_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EPDCCH_Config_r11_config_r11_setup (
      EPDCCH_Config_r11_config_r11_setup_subframePatternConfig_r11 subframePatternConfig_r11_,
      Asn1Integer startSymbol_r11_,
      EPDCCH_SetConfigToReleaseList_r11 setConfigToReleaseList_r11_,
      EPDCCH_SetConfigToAddModList_r11 setConfigToAddModList_r11_
   ) {
      super();
      subframePatternConfig_r11 = subframePatternConfig_r11_;
      startSymbol_r11 = startSymbol_r11_;
      setConfigToReleaseList_r11 = setConfigToReleaseList_r11_;
      setConfigToAddModList_r11 = setConfigToAddModList_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EPDCCH_Config_r11_config_r11_setup (EPDCCH_Config_r11_config_r11_setup_subframePatternConfig_r11 subframePatternConfig_r11_,
      long startSymbol_r11_,
      EPDCCH_SetConfigToReleaseList_r11 setConfigToReleaseList_r11_,
      EPDCCH_SetConfigToAddModList_r11 setConfigToAddModList_r11_
   ) {
      super();
      subframePatternConfig_r11 = subframePatternConfig_r11_;
      startSymbol_r11 = new Asn1Integer (startSymbol_r11_);
      setConfigToReleaseList_r11 = setConfigToReleaseList_r11_;
      setConfigToAddModList_r11 = setConfigToAddModList_r11_;
   }

   public void init () {
      subframePatternConfig_r11 = null;
      startSymbol_r11 = null;
      setConfigToReleaseList_r11 = null;
      setConfigToAddModList_r11 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return subframePatternConfig_r11;
         case 1: return startSymbol_r11;
         case 2: return setConfigToReleaseList_r11;
         case 3: return setConfigToAddModList_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "subframePatternConfig-r11";
         case 1: return "startSymbol-r11";
         case 2: return "setConfigToReleaseList-r11";
         case 3: return "setConfigToAddModList-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean subframePatternConfig_r11Present = buffer.decodeBit ("subframePatternConfig_r11Present");
      boolean startSymbol_r11Present = buffer.decodeBit ("startSymbol_r11Present");
      boolean setConfigToReleaseList_r11Present = buffer.decodeBit ("setConfigToReleaseList_r11Present");
      boolean setConfigToAddModList_r11Present = buffer.decodeBit ("setConfigToAddModList_r11Present");

      // decode subframePatternConfig_r11

      if (subframePatternConfig_r11Present) {
         buffer.getContext().eventDispatcher.startElement("subframePatternConfig_r11", -1);

         subframePatternConfig_r11 = new EPDCCH_Config_r11_config_r11_setup_subframePatternConfig_r11();
         subframePatternConfig_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("subframePatternConfig_r11", -1);
      }
      else {
         subframePatternConfig_r11 = null;
      }

      // decode startSymbol_r11

      if (startSymbol_r11Present) {
         buffer.getContext().eventDispatcher.startElement("startSymbol_r11", -1);

         startSymbol_r11 = new Asn1Integer();
         startSymbol_r11.decode (buffer, 1, 4);

         buffer.invokeCharacters(startSymbol_r11.toString());
         buffer.getContext().eventDispatcher.endElement("startSymbol_r11", -1);
      }
      else {
         startSymbol_r11 = null;
      }

      // decode setConfigToReleaseList_r11

      if (setConfigToReleaseList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("setConfigToReleaseList_r11", -1);

         setConfigToReleaseList_r11 = new EPDCCH_SetConfigToReleaseList_r11();
         setConfigToReleaseList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("setConfigToReleaseList_r11", -1);
      }
      else {
         setConfigToReleaseList_r11 = null;
      }

      // decode setConfigToAddModList_r11

      if (setConfigToAddModList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("setConfigToAddModList_r11", -1);

         setConfigToAddModList_r11 = new EPDCCH_SetConfigToAddModList_r11();
         setConfigToAddModList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("setConfigToAddModList_r11", -1);
      }
      else {
         setConfigToAddModList_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (subframePatternConfig_r11 != null) subframePatternConfig_r11.print (_sb, "subframePatternConfig_r11", _level+1);
      if (startSymbol_r11 != null) startSymbol_r11.print (_sb, "startSymbol_r11", _level+1);
      if (setConfigToReleaseList_r11 != null) setConfigToReleaseList_r11.print (_sb, "setConfigToReleaseList_r11", _level+1);
      if (setConfigToAddModList_r11 != null) setConfigToAddModList_r11.print (_sb, "setConfigToAddModList_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
