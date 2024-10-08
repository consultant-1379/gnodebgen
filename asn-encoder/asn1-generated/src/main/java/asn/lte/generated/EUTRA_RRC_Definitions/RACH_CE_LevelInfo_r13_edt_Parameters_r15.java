/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_CE_LevelInfo_r13_edt_Parameters_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer edt_LastPreamble_r15;
   public Asn1Boolean edt_SmallTBS_Enabled_r15;
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 edt_TBS_r15 = null;
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 mac_ContentionResolutionTimer_r15 = null;  // optional

   public RACH_CE_LevelInfo_r13_edt_Parameters_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15 (
      Asn1Integer edt_LastPreamble_r15_,
      Asn1Boolean edt_SmallTBS_Enabled_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 edt_TBS_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 mac_ContentionResolutionTimer_r15_
   ) {
      super();
      edt_LastPreamble_r15 = edt_LastPreamble_r15_;
      edt_SmallTBS_Enabled_r15 = edt_SmallTBS_Enabled_r15_;
      edt_TBS_r15 = edt_TBS_r15_;
      mac_ContentionResolutionTimer_r15 = mac_ContentionResolutionTimer_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15 (
      Asn1Integer edt_LastPreamble_r15_,
      Asn1Boolean edt_SmallTBS_Enabled_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 edt_TBS_r15_
   ) {
      super();
      edt_LastPreamble_r15 = edt_LastPreamble_r15_;
      edt_SmallTBS_Enabled_r15 = edt_SmallTBS_Enabled_r15_;
      edt_TBS_r15 = edt_TBS_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15 (long edt_LastPreamble_r15_,
      boolean edt_SmallTBS_Enabled_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 edt_TBS_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 mac_ContentionResolutionTimer_r15_
   ) {
      super();
      edt_LastPreamble_r15 = new Asn1Integer (edt_LastPreamble_r15_);
      edt_SmallTBS_Enabled_r15 = new Asn1Boolean (edt_SmallTBS_Enabled_r15_);
      edt_TBS_r15 = edt_TBS_r15_;
      mac_ContentionResolutionTimer_r15 = mac_ContentionResolutionTimer_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RACH_CE_LevelInfo_r13_edt_Parameters_r15 (
      long edt_LastPreamble_r15_,
      boolean edt_SmallTBS_Enabled_r15_,
      RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 edt_TBS_r15_
   ) {
      super();
      edt_LastPreamble_r15 = new Asn1Integer (edt_LastPreamble_r15_);
      edt_SmallTBS_Enabled_r15 = new Asn1Boolean (edt_SmallTBS_Enabled_r15_);
      edt_TBS_r15 = edt_TBS_r15_;
   }

   public void init () {
      edt_LastPreamble_r15 = null;
      edt_SmallTBS_Enabled_r15 = null;
      edt_TBS_r15 = null;
      mac_ContentionResolutionTimer_r15 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return edt_LastPreamble_r15;
         case 1: return edt_SmallTBS_Enabled_r15;
         case 2: return edt_TBS_r15;
         case 3: return mac_ContentionResolutionTimer_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "edt-LastPreamble-r15";
         case 1: return "edt-SmallTBS-Enabled-r15";
         case 2: return "edt-TBS-r15";
         case 3: return "mac-ContentionResolutionTimer-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mac_ContentionResolutionTimer_r15Present = buffer.decodeBit ("mac_ContentionResolutionTimer_r15Present");

      // decode edt_LastPreamble_r15

      buffer.getContext().eventDispatcher.startElement("edt_LastPreamble_r15", -1);

      edt_LastPreamble_r15 = new Asn1Integer();
      edt_LastPreamble_r15.decode (buffer, 0, 63);

      buffer.invokeCharacters(edt_LastPreamble_r15.toString());
      buffer.getContext().eventDispatcher.endElement("edt_LastPreamble_r15", -1);

      // decode edt_SmallTBS_Enabled_r15

      buffer.getContext().eventDispatcher.startElement("edt_SmallTBS_Enabled_r15", -1);

      edt_SmallTBS_Enabled_r15 = new Asn1Boolean();
      edt_SmallTBS_Enabled_r15.decode (buffer);

      buffer.invokeCharacters(edt_SmallTBS_Enabled_r15.toString());
      buffer.getContext().eventDispatcher.endElement("edt_SmallTBS_Enabled_r15", -1);

      // decode edt_TBS_r15

      buffer.getContext().eventDispatcher.startElement("edt_TBS_r15", -1);

      {
         int tval = RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15.decodeEnumValue (buffer);
         edt_TBS_r15 = RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("edt_TBS_r15", -1);

      // decode mac_ContentionResolutionTimer_r15

      if (mac_ContentionResolutionTimer_r15Present) {
         buffer.getContext().eventDispatcher.startElement("mac_ContentionResolutionTimer_r15", -1);

         int tval = RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15.decodeEnumValue (buffer);
         mac_ContentionResolutionTimer_r15 = RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mac_ContentionResolutionTimer_r15", -1);
      }
      else {
         mac_ContentionResolutionTimer_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (edt_LastPreamble_r15 != null) edt_LastPreamble_r15.print (_sb, "edt_LastPreamble_r15", _level+1);
      if (edt_SmallTBS_Enabled_r15 != null) edt_SmallTBS_Enabled_r15.print (_sb, "edt_SmallTBS_Enabled_r15", _level+1);
      if (edt_TBS_r15 != null) edt_TBS_r15.print (_sb, "edt_TBS_r15", _level+1);
      if (mac_ContentionResolutionTimer_r15 != null) mac_ContentionResolutionTimer_r15.print (_sb, "mac_ContentionResolutionTimer_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
