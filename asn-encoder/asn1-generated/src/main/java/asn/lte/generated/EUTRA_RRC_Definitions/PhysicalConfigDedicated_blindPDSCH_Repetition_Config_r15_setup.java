/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Boolean blindSubframePDSCH_Repetitions_r15;
   public Asn1Boolean blindSlotSubslotPDSCH_Repetitions_r15;
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SubframePDSCH_Repetitions_r15 maxNumber_SubframePDSCH_Repetitions_r15 = null;  // optional
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SlotSubslotPDSCH_Repetitions_r15 maxNumber_SlotSubslotPDSCH_Repetitions_r15 = null;  // optional
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SubframePDSCH_Repetitions_r15 rv_SubframePDSCH_Repetitions_r15 = null;  // optional
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SlotsublotPDSCH_Repetitions_r15 rv_SlotsublotPDSCH_Repetitions_r15 = null;  // optional
   public Asn1Integer numberOfProcesses_SubframePDSCH_Repetitions_r15;  // optional
   public Asn1Integer numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15;  // optional
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSubframePDSCH_Repetitions_r15 mcs_restrictionSubframePDSCH_Repetitions_r15 = null;  // optional
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = null;  // optional

   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup (
      Asn1Boolean blindSubframePDSCH_Repetitions_r15_,
      Asn1Boolean blindSlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SubframePDSCH_Repetitions_r15 maxNumber_SubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SlotSubslotPDSCH_Repetitions_r15 maxNumber_SlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SubframePDSCH_Repetitions_r15 rv_SubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SlotsublotPDSCH_Repetitions_r15 rv_SlotsublotPDSCH_Repetitions_r15_,
      Asn1Integer numberOfProcesses_SubframePDSCH_Repetitions_r15_,
      Asn1Integer numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSubframePDSCH_Repetitions_r15 mcs_restrictionSubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 mcs_restrictionSlotSubslotPDSCH_Repetitions_r15_
   ) {
      super();
      blindSubframePDSCH_Repetitions_r15 = blindSubframePDSCH_Repetitions_r15_;
      blindSlotSubslotPDSCH_Repetitions_r15 = blindSlotSubslotPDSCH_Repetitions_r15_;
      maxNumber_SubframePDSCH_Repetitions_r15 = maxNumber_SubframePDSCH_Repetitions_r15_;
      maxNumber_SlotSubslotPDSCH_Repetitions_r15 = maxNumber_SlotSubslotPDSCH_Repetitions_r15_;
      rv_SubframePDSCH_Repetitions_r15 = rv_SubframePDSCH_Repetitions_r15_;
      rv_SlotsublotPDSCH_Repetitions_r15 = rv_SlotsublotPDSCH_Repetitions_r15_;
      numberOfProcesses_SubframePDSCH_Repetitions_r15 = numberOfProcesses_SubframePDSCH_Repetitions_r15_;
      numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 = numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15_;
      mcs_restrictionSubframePDSCH_Repetitions_r15 = mcs_restrictionSubframePDSCH_Repetitions_r15_;
      mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = mcs_restrictionSlotSubslotPDSCH_Repetitions_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup (
      Asn1Boolean blindSubframePDSCH_Repetitions_r15_,
      Asn1Boolean blindSlotSubslotPDSCH_Repetitions_r15_
   ) {
      super();
      blindSubframePDSCH_Repetitions_r15 = blindSubframePDSCH_Repetitions_r15_;
      blindSlotSubslotPDSCH_Repetitions_r15 = blindSlotSubslotPDSCH_Repetitions_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup (boolean blindSubframePDSCH_Repetitions_r15_,
      boolean blindSlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SubframePDSCH_Repetitions_r15 maxNumber_SubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SlotSubslotPDSCH_Repetitions_r15 maxNumber_SlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SubframePDSCH_Repetitions_r15 rv_SubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SlotsublotPDSCH_Repetitions_r15 rv_SlotsublotPDSCH_Repetitions_r15_,
      long numberOfProcesses_SubframePDSCH_Repetitions_r15_,
      long numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSubframePDSCH_Repetitions_r15 mcs_restrictionSubframePDSCH_Repetitions_r15_,
      PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 mcs_restrictionSlotSubslotPDSCH_Repetitions_r15_
   ) {
      super();
      blindSubframePDSCH_Repetitions_r15 = new Asn1Boolean (blindSubframePDSCH_Repetitions_r15_);
      blindSlotSubslotPDSCH_Repetitions_r15 = new Asn1Boolean (blindSlotSubslotPDSCH_Repetitions_r15_);
      maxNumber_SubframePDSCH_Repetitions_r15 = maxNumber_SubframePDSCH_Repetitions_r15_;
      maxNumber_SlotSubslotPDSCH_Repetitions_r15 = maxNumber_SlotSubslotPDSCH_Repetitions_r15_;
      rv_SubframePDSCH_Repetitions_r15 = rv_SubframePDSCH_Repetitions_r15_;
      rv_SlotsublotPDSCH_Repetitions_r15 = rv_SlotsublotPDSCH_Repetitions_r15_;
      numberOfProcesses_SubframePDSCH_Repetitions_r15 = new Asn1Integer (numberOfProcesses_SubframePDSCH_Repetitions_r15_);
      numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 = new Asn1Integer (numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15_);
      mcs_restrictionSubframePDSCH_Repetitions_r15 = mcs_restrictionSubframePDSCH_Repetitions_r15_;
      mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = mcs_restrictionSlotSubslotPDSCH_Repetitions_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup (
      boolean blindSubframePDSCH_Repetitions_r15_,
      boolean blindSlotSubslotPDSCH_Repetitions_r15_
   ) {
      super();
      blindSubframePDSCH_Repetitions_r15 = new Asn1Boolean (blindSubframePDSCH_Repetitions_r15_);
      blindSlotSubslotPDSCH_Repetitions_r15 = new Asn1Boolean (blindSlotSubslotPDSCH_Repetitions_r15_);
   }

   public void init () {
      blindSubframePDSCH_Repetitions_r15 = null;
      blindSlotSubslotPDSCH_Repetitions_r15 = null;
      maxNumber_SubframePDSCH_Repetitions_r15 = null;
      maxNumber_SlotSubslotPDSCH_Repetitions_r15 = null;
      rv_SubframePDSCH_Repetitions_r15 = null;
      rv_SlotsublotPDSCH_Repetitions_r15 = null;
      numberOfProcesses_SubframePDSCH_Repetitions_r15 = null;
      numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 = null;
      mcs_restrictionSubframePDSCH_Repetitions_r15 = null;
      mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return blindSubframePDSCH_Repetitions_r15;
         case 1: return blindSlotSubslotPDSCH_Repetitions_r15;
         case 2: return maxNumber_SubframePDSCH_Repetitions_r15;
         case 3: return maxNumber_SlotSubslotPDSCH_Repetitions_r15;
         case 4: return rv_SubframePDSCH_Repetitions_r15;
         case 5: return rv_SlotsublotPDSCH_Repetitions_r15;
         case 6: return numberOfProcesses_SubframePDSCH_Repetitions_r15;
         case 7: return numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15;
         case 8: return mcs_restrictionSubframePDSCH_Repetitions_r15;
         case 9: return mcs_restrictionSlotSubslotPDSCH_Repetitions_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "blindSubframePDSCH-Repetitions-r15";
         case 1: return "blindSlotSubslotPDSCH-Repetitions-r15";
         case 2: return "maxNumber-SubframePDSCH-Repetitions-r15";
         case 3: return "maxNumber-SlotSubslotPDSCH-Repetitions-r15";
         case 4: return "rv-SubframePDSCH-Repetitions-r15";
         case 5: return "rv-SlotsublotPDSCH-Repetitions-r15";
         case 6: return "numberOfProcesses-SubframePDSCH-Repetitions-r15";
         case 7: return "numberOfProcesses-SlotSubslotPDSCH-Repetitions-r15";
         case 8: return "mcs-restrictionSubframePDSCH-Repetitions-r15";
         case 9: return "mcs-restrictionSlotSubslotPDSCH-Repetitions-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean maxNumber_SubframePDSCH_Repetitions_r15Present = buffer.decodeBit ("maxNumber_SubframePDSCH_Repetitions_r15Present");
      boolean maxNumber_SlotSubslotPDSCH_Repetitions_r15Present = buffer.decodeBit ("maxNumber_SlotSubslotPDSCH_Repetitions_r15Present");
      boolean rv_SubframePDSCH_Repetitions_r15Present = buffer.decodeBit ("rv_SubframePDSCH_Repetitions_r15Present");
      boolean rv_SlotsublotPDSCH_Repetitions_r15Present = buffer.decodeBit ("rv_SlotsublotPDSCH_Repetitions_r15Present");
      boolean numberOfProcesses_SubframePDSCH_Repetitions_r15Present = buffer.decodeBit ("numberOfProcesses_SubframePDSCH_Repetitions_r15Present");
      boolean numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15Present = buffer.decodeBit ("numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15Present");
      boolean mcs_restrictionSubframePDSCH_Repetitions_r15Present = buffer.decodeBit ("mcs_restrictionSubframePDSCH_Repetitions_r15Present");
      boolean mcs_restrictionSlotSubslotPDSCH_Repetitions_r15Present = buffer.decodeBit ("mcs_restrictionSlotSubslotPDSCH_Repetitions_r15Present");

      // decode blindSubframePDSCH_Repetitions_r15

      buffer.getContext().eventDispatcher.startElement("blindSubframePDSCH_Repetitions_r15", -1);

      blindSubframePDSCH_Repetitions_r15 = new Asn1Boolean();
      blindSubframePDSCH_Repetitions_r15.decode (buffer);

      buffer.invokeCharacters(blindSubframePDSCH_Repetitions_r15.toString());
      buffer.getContext().eventDispatcher.endElement("blindSubframePDSCH_Repetitions_r15", -1);

      // decode blindSlotSubslotPDSCH_Repetitions_r15

      buffer.getContext().eventDispatcher.startElement("blindSlotSubslotPDSCH_Repetitions_r15", -1);

      blindSlotSubslotPDSCH_Repetitions_r15 = new Asn1Boolean();
      blindSlotSubslotPDSCH_Repetitions_r15.decode (buffer);

      buffer.invokeCharacters(blindSlotSubslotPDSCH_Repetitions_r15.toString());
      buffer.getContext().eventDispatcher.endElement("blindSlotSubslotPDSCH_Repetitions_r15", -1);

      // decode maxNumber_SubframePDSCH_Repetitions_r15

      if (maxNumber_SubframePDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumber_SubframePDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SubframePDSCH_Repetitions_r15.decodeEnumValue (buffer);
         maxNumber_SubframePDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SubframePDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumber_SubframePDSCH_Repetitions_r15", -1);
      }
      else {
         maxNumber_SubframePDSCH_Repetitions_r15 = null;
      }

      // decode maxNumber_SlotSubslotPDSCH_Repetitions_r15

      if (maxNumber_SlotSubslotPDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumber_SlotSubslotPDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SlotSubslotPDSCH_Repetitions_r15.decodeEnumValue (buffer);
         maxNumber_SlotSubslotPDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_maxNumber_SlotSubslotPDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumber_SlotSubslotPDSCH_Repetitions_r15", -1);
      }
      else {
         maxNumber_SlotSubslotPDSCH_Repetitions_r15 = null;
      }

      // decode rv_SubframePDSCH_Repetitions_r15

      if (rv_SubframePDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("rv_SubframePDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SubframePDSCH_Repetitions_r15.decodeEnumValue (buffer);
         rv_SubframePDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SubframePDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rv_SubframePDSCH_Repetitions_r15", -1);
      }
      else {
         rv_SubframePDSCH_Repetitions_r15 = null;
      }

      // decode rv_SlotsublotPDSCH_Repetitions_r15

      if (rv_SlotsublotPDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("rv_SlotsublotPDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SlotsublotPDSCH_Repetitions_r15.decodeEnumValue (buffer);
         rv_SlotsublotPDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_rv_SlotsublotPDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rv_SlotsublotPDSCH_Repetitions_r15", -1);
      }
      else {
         rv_SlotsublotPDSCH_Repetitions_r15 = null;
      }

      // decode numberOfProcesses_SubframePDSCH_Repetitions_r15

      if (numberOfProcesses_SubframePDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("numberOfProcesses_SubframePDSCH_Repetitions_r15", -1);

         numberOfProcesses_SubframePDSCH_Repetitions_r15 = new Asn1Integer();
         numberOfProcesses_SubframePDSCH_Repetitions_r15.decode (buffer, 1, 16);

         buffer.invokeCharacters(numberOfProcesses_SubframePDSCH_Repetitions_r15.toString());
         buffer.getContext().eventDispatcher.endElement("numberOfProcesses_SubframePDSCH_Repetitions_r15", -1);
      }
      else {
         numberOfProcesses_SubframePDSCH_Repetitions_r15 = null;
      }

      // decode numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15

      if (numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15", -1);

         numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 = new Asn1Integer();
         numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15.decode (buffer, 1, 16);

         buffer.invokeCharacters(numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15.toString());
         buffer.getContext().eventDispatcher.endElement("numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15", -1);
      }
      else {
         numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 = null;
      }

      // decode mcs_restrictionSubframePDSCH_Repetitions_r15

      if (mcs_restrictionSubframePDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("mcs_restrictionSubframePDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSubframePDSCH_Repetitions_r15.decodeEnumValue (buffer);
         mcs_restrictionSubframePDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSubframePDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mcs_restrictionSubframePDSCH_Repetitions_r15", -1);
      }
      else {
         mcs_restrictionSubframePDSCH_Repetitions_r15 = null;
      }

      // decode mcs_restrictionSlotSubslotPDSCH_Repetitions_r15

      if (mcs_restrictionSlotSubslotPDSCH_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("mcs_restrictionSlotSubslotPDSCH_Repetitions_r15", -1);

         int tval = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSlotSubslotPDSCH_Repetitions_r15.decodeEnumValue (buffer);
         mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = PhysicalConfigDedicated_blindPDSCH_Repetition_Config_r15_setup_mcs_restrictionSlotSubslotPDSCH_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mcs_restrictionSlotSubslotPDSCH_Repetitions_r15", -1);
      }
      else {
         mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (blindSubframePDSCH_Repetitions_r15 != null) blindSubframePDSCH_Repetitions_r15.print (_sb, "blindSubframePDSCH_Repetitions_r15", _level+1);
      if (blindSlotSubslotPDSCH_Repetitions_r15 != null) blindSlotSubslotPDSCH_Repetitions_r15.print (_sb, "blindSlotSubslotPDSCH_Repetitions_r15", _level+1);
      if (maxNumber_SubframePDSCH_Repetitions_r15 != null) maxNumber_SubframePDSCH_Repetitions_r15.print (_sb, "maxNumber_SubframePDSCH_Repetitions_r15", _level+1);
      if (maxNumber_SlotSubslotPDSCH_Repetitions_r15 != null) maxNumber_SlotSubslotPDSCH_Repetitions_r15.print (_sb, "maxNumber_SlotSubslotPDSCH_Repetitions_r15", _level+1);
      if (rv_SubframePDSCH_Repetitions_r15 != null) rv_SubframePDSCH_Repetitions_r15.print (_sb, "rv_SubframePDSCH_Repetitions_r15", _level+1);
      if (rv_SlotsublotPDSCH_Repetitions_r15 != null) rv_SlotsublotPDSCH_Repetitions_r15.print (_sb, "rv_SlotsublotPDSCH_Repetitions_r15", _level+1);
      if (numberOfProcesses_SubframePDSCH_Repetitions_r15 != null) numberOfProcesses_SubframePDSCH_Repetitions_r15.print (_sb, "numberOfProcesses_SubframePDSCH_Repetitions_r15", _level+1);
      if (numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15 != null) numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15.print (_sb, "numberOfProcesses_SlotSubslotPDSCH_Repetitions_r15", _level+1);
      if (mcs_restrictionSubframePDSCH_Repetitions_r15 != null) mcs_restrictionSubframePDSCH_Repetitions_r15.print (_sb, "mcs_restrictionSubframePDSCH_Repetitions_r15", _level+1);
      if (mcs_restrictionSlotSubslotPDSCH_Repetitions_r15 != null) mcs_restrictionSlotSubslotPDSCH_Repetitions_r15.print (_sb, "mcs_restrictionSlotSubslotPDSCH_Repetitions_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
