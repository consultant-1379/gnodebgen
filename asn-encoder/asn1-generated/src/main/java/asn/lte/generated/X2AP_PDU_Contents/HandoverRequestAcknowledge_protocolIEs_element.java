/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class HandoverRequestAcknowledge_protocolIEs_element extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ProtocolIE_ID id;
   public Criticality criticality = null;

   /**
    * id: id-Old-eNB-UE-X2AP-ID
    * criticality: Criticality.ignore
    * presence: Presence.mandatory
    * ASN.1 type: UE-X2AP-ID
    * Java type: UE_X2AP_ID
    *
    * id: id-New-eNB-UE-X2AP-ID
    * criticality: Criticality.ignore
    * presence: Presence.mandatory
    * ASN.1 type: UE-X2AP-ID
    * Java type: UE_X2AP_ID
    *
    * id: id-E-RABs-Admitted-List
    * criticality: Criticality.ignore
    * presence: Presence.mandatory
    * ASN.1 type: E-RABs-Admitted-List
    * Java type: E_RABs_Admitted_List
    *
    * id: id-E-RABs-NotAdmitted-List
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: E-RAB-List
    * Java type: E_RAB_List
    *
    * id: id-TargeteNBtoSource-eNBTransparentContainer
    * criticality: Criticality.ignore
    * presence: Presence.mandatory
    * ASN.1 type: TargeteNBtoSource-eNBTransparentContainer
    * Java type: TargeteNBtoSource_eNBTransparentContainer
    *
    * id: id-CriticalityDiagnostics
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: CriticalityDiagnostics
    * Java type: CriticalityDiagnostics
    *
    * id: id-UE-ContextKeptIndicator
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: UE-ContextKeptIndicator
    * Java type: UE_ContextKeptIndicator
    *
    * id: id-SeNB-UE-X2AP-ID-Extension
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: UE-X2AP-ID-Extension
    * Java type: UE_X2AP_ID_Extension
    *
    * id: id-Old-eNB-UE-X2AP-ID-Extension
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: UE-X2AP-ID-Extension
    * Java type: UE_X2AP_ID_Extension
    *
    * id: id-New-eNB-UE-X2AP-ID-Extension
    * criticality: Criticality.reject
    * presence: Presence.optional
    * ASN.1 type: UE-X2AP-ID-Extension
    * Java type: UE_X2AP_ID_Extension
    *
    * id: id-WT-UE-ContextKeptIndicator
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: UE-ContextKeptIndicator
    * Java type: UE_ContextKeptIndicator
    *
    * id: id-Ericsson-ExtConveyor
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: EAB-HandoverRequestAcknowledge-ExtConveyor
    * Java type: EAB_HandoverRequestAcknowledge_ExtConveyor
    */
   public Asn1Type value;

   public HandoverRequestAcknowledge_protocolIEs_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HandoverRequestAcknowledge_protocolIEs_element (
      ProtocolIE_ID id_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      id = id_;
      criticality = criticality_;
      value = value_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public HandoverRequestAcknowledge_protocolIEs_element (long id_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      id = new ProtocolIE_ID (id_);
      criticality = criticality_;
      value = value_;
   }

   public void init () {
      id = null;
      criticality = null;
      value = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return id;
         case 1: return criticality;
         case 2: return value;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "id";
         case 1: return "criticality";
         case 2: return "value";
         default: return null;
      }
   }


   /**
    * Assign fields according to information object having key id-Old-eNB-UE-X2AP-ID
    */
   public void setUsing_id_Old_eNB_UE_X2AP_ID(asn.lte.generated.X2AP_IEs.UE_X2AP_ID value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_Old_eNB_UE_X2AP_ID);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-New-eNB-UE-X2AP-ID
    */
   public void setUsing_id_New_eNB_UE_X2AP_ID(asn.lte.generated.X2AP_IEs.UE_X2AP_ID value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_New_eNB_UE_X2AP_ID);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-E-RABs-Admitted-List
    */
   public void setUsing_id_E_RABs_Admitted_List(E_RABs_Admitted_List value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_E_RABs_Admitted_List);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-E-RABs-NotAdmitted-List
    */
   public void setUsing_id_E_RABs_NotAdmitted_List(asn.lte.generated.X2AP_IEs.E_RAB_List value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_E_RABs_NotAdmitted_List);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-TargeteNBtoSource-eNBTransparentContainer
    */
   public void setUsing_id_TargeteNBtoSource_eNBTransparentContainer(asn.lte.generated.X2AP_IEs.TargeteNBtoSource_eNBTransparentContainer value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_TargeteNBtoSource_eNBTransparentContainer);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-CriticalityDiagnostics
    */
   public void setUsing_id_CriticalityDiagnostics(asn.lte.generated.X2AP_IEs.CriticalityDiagnostics value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_CriticalityDiagnostics);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-UE-ContextKeptIndicator
    */
   public void setUsing_id_UE_ContextKeptIndicator(asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_UE_ContextKeptIndicator);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-SeNB-UE-X2AP-ID-Extension
    */
   public void setUsing_id_SeNB_UE_X2AP_ID_Extension(asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_SeNB_UE_X2AP_ID_Extension);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-Old-eNB-UE-X2AP-ID-Extension
    */
   public void setUsing_id_Old_eNB_UE_X2AP_ID_Extension(asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_Old_eNB_UE_X2AP_ID_Extension);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-New-eNB-UE-X2AP-ID-Extension
    */
   public void setUsing_id_New_eNB_UE_X2AP_ID_Extension(asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_New_eNB_UE_X2AP_ID_Extension);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-WT-UE-ContextKeptIndicator
    */
   public void setUsing_id_WT_UE_ContextKeptIndicator(asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_WT_UE_ContextKeptIndicator);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-Ericsson-ExtConveyor
    */
   public void setUsing_id_Ericsson_ExtConveyor(asn.lte.generated.X2AP_Ericsson_IEs.EAB_HandoverRequestAcknowledge_ExtConveyor value) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Conveyor._X2AP_Ericsson_ConveyorValues.id_Ericsson_ExtConveyor);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Get value of value with type set according to information object having key id-Old-eNB-UE-X2AP-ID
    */
   public asn.lte.generated.X2AP_IEs.UE_X2AP_ID getValueFor_id_Old_eNB_UE_X2AP_ID() {
      return (asn.lte.generated.X2AP_IEs.UE_X2AP_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-New-eNB-UE-X2AP-ID
    */
   public asn.lte.generated.X2AP_IEs.UE_X2AP_ID getValueFor_id_New_eNB_UE_X2AP_ID() {
      return (asn.lte.generated.X2AP_IEs.UE_X2AP_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-E-RABs-Admitted-List
    */
   public E_RABs_Admitted_List getValueFor_id_E_RABs_Admitted_List() {
      return (E_RABs_Admitted_List) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-E-RABs-NotAdmitted-List
    */
   public asn.lte.generated.X2AP_IEs.E_RAB_List getValueFor_id_E_RABs_NotAdmitted_List() {
      return (asn.lte.generated.X2AP_IEs.E_RAB_List) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-TargeteNBtoSource-eNBTransparentContainer
    */
   public asn.lte.generated.X2AP_IEs.TargeteNBtoSource_eNBTransparentContainer getValueFor_id_TargeteNBtoSource_eNBTransparentContainer() {
      return (asn.lte.generated.X2AP_IEs.TargeteNBtoSource_eNBTransparentContainer) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-CriticalityDiagnostics
    */
   public asn.lte.generated.X2AP_IEs.CriticalityDiagnostics getValueFor_id_CriticalityDiagnostics() {
      return (asn.lte.generated.X2AP_IEs.CriticalityDiagnostics) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-UE-ContextKeptIndicator
    */
   public asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator getValueFor_id_UE_ContextKeptIndicator() {
      return (asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-SeNB-UE-X2AP-ID-Extension
    */
   public asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension getValueFor_id_SeNB_UE_X2AP_ID_Extension() {
      return (asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-Old-eNB-UE-X2AP-ID-Extension
    */
   public asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension getValueFor_id_Old_eNB_UE_X2AP_ID_Extension() {
      return (asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-New-eNB-UE-X2AP-ID-Extension
    */
   public asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension getValueFor_id_New_eNB_UE_X2AP_ID_Extension() {
      return (asn.lte.generated.X2AP_IEs.UE_X2AP_ID_Extension) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-WT-UE-ContextKeptIndicator
    */
   public asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator getValueFor_id_WT_UE_ContextKeptIndicator() {
      return (asn.lte.generated.X2AP_IEs.UE_ContextKeptIndicator) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-Ericsson-ExtConveyor
    */
   public asn.lte.generated.X2AP_Ericsson_IEs.EAB_HandoverRequestAcknowledge_ExtConveyor getValueFor_id_Ericsson_ExtConveyor() {
      return (asn.lte.generated.X2AP_Ericsson_IEs.EAB_HandoverRequestAcknowledge_ExtConveyor) this.value;
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode id

      buffer.getContext().eventDispatcher.startElement("id", -1);

      id = new ProtocolIE_ID();
      id.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("id", -1);

      // decode criticality

      buffer.getContext().eventDispatcher.startElement("criticality", -1);

      {
         int tval = Criticality.decodeEnumValue (buffer);
         criticality = Criticality.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("criticality", -1);

      // decode value

      buffer.getContext().eventDispatcher.startElement("value", -1);

      value = new Asn1OpenType();
      value.decode (buffer);

      buffer.invokeCharacters(value.toString());
      buffer.getContext().eventDispatcher.endElement("value", -1);

      checkTC (true, buffer.getLazyOpenTypeDecode() ? 0 : 2, buffer.isAligned(), buffer.getContext().eventDispatcher);
   }

   public void checkTC(boolean decode, int decodeOpenTypeFlag, boolean aligned, Asn1NamedEventDispatcher eventDispatcher)
      throws Asn1Exception
   {
      /* check id */
      asn.lte.generated.X2AP_Containers.X2AP_PROTOCOL_IES _index = null;
      for(int i=0; i < _X2AP_PDU_ContentsValues.HandoverRequestAcknowledge_IEs.length; i++) {
         if(_X2AP_PDU_ContentsValues.HandoverRequestAcknowledge_IEs[i].id.equals(id)) {
            _index = _X2AP_PDU_ContentsValues.HandoverRequestAcknowledge_IEs[i];
            break;
         }
      }
      if (null == _index) {
         return;
      }

      /* check value */
      if( decode && decodeOpenTypeFlag >=1 ) {
         try {
            Asn1PerDecodeBuffer buffer = new Asn1PerDecodeBuffer(((Asn1OpenType)value).value, aligned);
            buffer.setLazyOpenTypeDecode(decodeOpenTypeFlag == 1);
            if (eventDispatcher != null)buffer.getContext().eventDispatcher = eventDispatcher;
            buffer.getContext().eventDispatcher.startElement("value", -1);

            String className = _index.Value.actualType.getName();
            if (className.lastIndexOf('.') > 0) {
               className = className.substring (className.lastIndexOf (".")+1);
            }
            buffer.getContext().eventDispatcher.startElement(className, -1);

            value = Asn1Type.decode(buffer, _index.Value);

            buffer.getContext().eventDispatcher.endElement(className, -1);

            buffer.getContext().eventDispatcher.endElement("value", -1);
         }
         catch (java.io.IOException e) {
            throw new Asn1Exception(e.toString());
         }
      }

      /* use -strict option to validate the "criticality" element */
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (id.value == 10) {
         indent (_sb, _level+1);
         _sb.append("id = id-Old-eNB-UE-X2AP-ID\n");
      }
      else if (id.value == 9) {
         indent (_sb, _level+1);
         _sb.append("id = id-New-eNB-UE-X2AP-ID\n");
      }
      else if (id.value == 1) {
         indent (_sb, _level+1);
         _sb.append("id = id-E-RABs-Admitted-List\n");
      }
      else if (id.value == 3) {
         indent (_sb, _level+1);
         _sb.append("id = id-E-RABs-NotAdmitted-List\n");
      }
      else if (id.value == 12) {
         indent (_sb, _level+1);
         _sb.append("id = id-TargeteNBtoSource-eNBTransparentContainer\n");
      }
      else if (id.value == 17) {
         indent (_sb, _level+1);
         _sb.append("id = id-CriticalityDiagnostics\n");
      }
      else if (id.value == 154) {
         indent (_sb, _level+1);
         _sb.append("id = id-UE-ContextKeptIndicator\n");
      }
      else if (id.value == 158) {
         indent (_sb, _level+1);
         _sb.append("id = id-SeNB-UE-X2AP-ID-Extension\n");
      }
      else if (id.value == 156) {
         indent (_sb, _level+1);
         _sb.append("id = id-Old-eNB-UE-X2AP-ID-Extension\n");
      }
      else if (id.value == 155) {
         indent (_sb, _level+1);
         _sb.append("id = id-New-eNB-UE-X2AP-ID-Extension\n");
      }
      else if (id.value == 183) {
         indent (_sb, _level+1);
         _sb.append("id = id-WT-UE-ContextKeptIndicator\n");
      }
      else if (id.value == 43229) {
         indent (_sb, _level+1);
         _sb.append("id = id-Ericsson-ExtConveyor\n");
      }

      if (criticality != null) {
         criticality.print (_sb, "criticality", _level+1);
      }
      if (value != null) {
         String tmpName = value.getAsn1TypeName();
         if (tmpName != null && tmpName != "")  {
            tmpName = "value" + " (" + tmpName + ")";
         }
         else  {
            tmpName = "value";
         }
         value.print (_sb, tmpName, _level+1);
      }
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
