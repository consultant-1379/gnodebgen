/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingRequestConfig_v1530_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer sr_SlotSPUCCH_IndexFH_r15;  // optional
   public Asn1Integer sr_SlotSPUCCH_IndexNoFH_r15;  // optional
   public SR_SubslotSPUCCH_ResourceList_r15 sr_SubslotSPUCCH_ResourceList_r15;  // optional
   public Asn1Integer sr_ConfigIndexSlot_r15;  // optional
   public Asn1Integer sr_ConfigIndexSubslot_r15;  // optional
   public SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15 dssr_TransMax_r15 = null;

   public SchedulingRequestConfig_v1530_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SchedulingRequestConfig_v1530_setup (
      Asn1Integer sr_SlotSPUCCH_IndexFH_r15_,
      Asn1Integer sr_SlotSPUCCH_IndexNoFH_r15_,
      SR_SubslotSPUCCH_ResourceList_r15 sr_SubslotSPUCCH_ResourceList_r15_,
      Asn1Integer sr_ConfigIndexSlot_r15_,
      Asn1Integer sr_ConfigIndexSubslot_r15_,
      SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15 dssr_TransMax_r15_
   ) {
      super();
      sr_SlotSPUCCH_IndexFH_r15 = sr_SlotSPUCCH_IndexFH_r15_;
      sr_SlotSPUCCH_IndexNoFH_r15 = sr_SlotSPUCCH_IndexNoFH_r15_;
      sr_SubslotSPUCCH_ResourceList_r15 = sr_SubslotSPUCCH_ResourceList_r15_;
      sr_ConfigIndexSlot_r15 = sr_ConfigIndexSlot_r15_;
      sr_ConfigIndexSubslot_r15 = sr_ConfigIndexSubslot_r15_;
      dssr_TransMax_r15 = dssr_TransMax_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SchedulingRequestConfig_v1530_setup (
      SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15 dssr_TransMax_r15_
   ) {
      super();
      dssr_TransMax_r15 = dssr_TransMax_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SchedulingRequestConfig_v1530_setup (long sr_SlotSPUCCH_IndexFH_r15_,
      long sr_SlotSPUCCH_IndexNoFH_r15_,
      SR_SubslotSPUCCH_ResourceList_r15 sr_SubslotSPUCCH_ResourceList_r15_,
      long sr_ConfigIndexSlot_r15_,
      long sr_ConfigIndexSubslot_r15_,
      SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15 dssr_TransMax_r15_
   ) {
      super();
      sr_SlotSPUCCH_IndexFH_r15 = new Asn1Integer (sr_SlotSPUCCH_IndexFH_r15_);
      sr_SlotSPUCCH_IndexNoFH_r15 = new Asn1Integer (sr_SlotSPUCCH_IndexNoFH_r15_);
      sr_SubslotSPUCCH_ResourceList_r15 = sr_SubslotSPUCCH_ResourceList_r15_;
      sr_ConfigIndexSlot_r15 = new Asn1Integer (sr_ConfigIndexSlot_r15_);
      sr_ConfigIndexSubslot_r15 = new Asn1Integer (sr_ConfigIndexSubslot_r15_);
      dssr_TransMax_r15 = dssr_TransMax_r15_;
   }

   public void init () {
      sr_SlotSPUCCH_IndexFH_r15 = null;
      sr_SlotSPUCCH_IndexNoFH_r15 = null;
      sr_SubslotSPUCCH_ResourceList_r15 = null;
      sr_ConfigIndexSlot_r15 = null;
      sr_ConfigIndexSubslot_r15 = null;
      dssr_TransMax_r15 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sr_SlotSPUCCH_IndexFH_r15;
         case 1: return sr_SlotSPUCCH_IndexNoFH_r15;
         case 2: return sr_SubslotSPUCCH_ResourceList_r15;
         case 3: return sr_ConfigIndexSlot_r15;
         case 4: return sr_ConfigIndexSubslot_r15;
         case 5: return dssr_TransMax_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sr-SlotSPUCCH-IndexFH-r15";
         case 1: return "sr-SlotSPUCCH-IndexNoFH-r15";
         case 2: return "sr-SubslotSPUCCH-ResourceList-r15";
         case 3: return "sr-ConfigIndexSlot-r15";
         case 4: return "sr-ConfigIndexSubslot-r15";
         case 5: return "dssr-TransMax-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sr_SlotSPUCCH_IndexFH_r15Present = buffer.decodeBit ("sr_SlotSPUCCH_IndexFH_r15Present");
      boolean sr_SlotSPUCCH_IndexNoFH_r15Present = buffer.decodeBit ("sr_SlotSPUCCH_IndexNoFH_r15Present");
      boolean sr_SubslotSPUCCH_ResourceList_r15Present = buffer.decodeBit ("sr_SubslotSPUCCH_ResourceList_r15Present");
      boolean sr_ConfigIndexSlot_r15Present = buffer.decodeBit ("sr_ConfigIndexSlot_r15Present");
      boolean sr_ConfigIndexSubslot_r15Present = buffer.decodeBit ("sr_ConfigIndexSubslot_r15Present");

      // decode sr_SlotSPUCCH_IndexFH_r15

      if (sr_SlotSPUCCH_IndexFH_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_SlotSPUCCH_IndexFH_r15", -1);

         sr_SlotSPUCCH_IndexFH_r15 = new Asn1Integer();
         sr_SlotSPUCCH_IndexFH_r15.decode (buffer, 0, 1319);

         buffer.invokeCharacters(sr_SlotSPUCCH_IndexFH_r15.toString());
         buffer.getContext().eventDispatcher.endElement("sr_SlotSPUCCH_IndexFH_r15", -1);
      }
      else {
         sr_SlotSPUCCH_IndexFH_r15 = null;
      }

      // decode sr_SlotSPUCCH_IndexNoFH_r15

      if (sr_SlotSPUCCH_IndexNoFH_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_SlotSPUCCH_IndexNoFH_r15", -1);

         sr_SlotSPUCCH_IndexNoFH_r15 = new Asn1Integer();
         sr_SlotSPUCCH_IndexNoFH_r15.decode (buffer, 0, 3959);

         buffer.invokeCharacters(sr_SlotSPUCCH_IndexNoFH_r15.toString());
         buffer.getContext().eventDispatcher.endElement("sr_SlotSPUCCH_IndexNoFH_r15", -1);
      }
      else {
         sr_SlotSPUCCH_IndexNoFH_r15 = null;
      }

      // decode sr_SubslotSPUCCH_ResourceList_r15

      if (sr_SubslotSPUCCH_ResourceList_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_SubslotSPUCCH_ResourceList_r15", -1);

         sr_SubslotSPUCCH_ResourceList_r15 = new SR_SubslotSPUCCH_ResourceList_r15();
         sr_SubslotSPUCCH_ResourceList_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sr_SubslotSPUCCH_ResourceList_r15", -1);
      }
      else {
         sr_SubslotSPUCCH_ResourceList_r15 = null;
      }

      // decode sr_ConfigIndexSlot_r15

      if (sr_ConfigIndexSlot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_ConfigIndexSlot_r15", -1);

         sr_ConfigIndexSlot_r15 = new Asn1Integer();
         sr_ConfigIndexSlot_r15.decode (buffer, 0, 36);

         buffer.invokeCharacters(sr_ConfigIndexSlot_r15.toString());
         buffer.getContext().eventDispatcher.endElement("sr_ConfigIndexSlot_r15", -1);
      }
      else {
         sr_ConfigIndexSlot_r15 = null;
      }

      // decode sr_ConfigIndexSubslot_r15

      if (sr_ConfigIndexSubslot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sr_ConfigIndexSubslot_r15", -1);

         sr_ConfigIndexSubslot_r15 = new Asn1Integer();
         sr_ConfigIndexSubslot_r15.decode (buffer, 0, 122);

         buffer.invokeCharacters(sr_ConfigIndexSubslot_r15.toString());
         buffer.getContext().eventDispatcher.endElement("sr_ConfigIndexSubslot_r15", -1);
      }
      else {
         sr_ConfigIndexSubslot_r15 = null;
      }

      // decode dssr_TransMax_r15

      buffer.getContext().eventDispatcher.startElement("dssr_TransMax_r15", -1);

      {
         int tval = SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15.decodeEnumValue (buffer);
         dssr_TransMax_r15 = SchedulingRequestConfig_v1530_setup_dssr_TransMax_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("dssr_TransMax_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sr_SlotSPUCCH_IndexFH_r15 != null) sr_SlotSPUCCH_IndexFH_r15.print (_sb, "sr_SlotSPUCCH_IndexFH_r15", _level+1);
      if (sr_SlotSPUCCH_IndexNoFH_r15 != null) sr_SlotSPUCCH_IndexNoFH_r15.print (_sb, "sr_SlotSPUCCH_IndexNoFH_r15", _level+1);
      if (sr_SubslotSPUCCH_ResourceList_r15 != null) sr_SubslotSPUCCH_ResourceList_r15.print (_sb, "sr_SubslotSPUCCH_ResourceList_r15", _level+1);
      if (sr_ConfigIndexSlot_r15 != null) sr_ConfigIndexSlot_r15.print (_sb, "sr_ConfigIndexSlot_r15", _level+1);
      if (sr_ConfigIndexSubslot_r15 != null) sr_ConfigIndexSubslot_r15.print (_sb, "sr_ConfigIndexSubslot_r15", _level+1);
      if (dssr_TransMax_r15 != null) dssr_TransMax_r15.print (_sb, "dssr_TransMax_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
