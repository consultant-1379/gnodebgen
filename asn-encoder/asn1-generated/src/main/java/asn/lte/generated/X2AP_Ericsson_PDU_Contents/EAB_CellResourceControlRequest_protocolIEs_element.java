/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class EAB_CellResourceControlRequest_protocolIEs_element extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public EAB_ProtocolIE_ID id;
   public Criticality criticality = null;

   /**
    * id: eid-ENB1-Measurement-ID
    * criticality: Criticality.reject
    * presence: Presence.mandatory
    * ASN.1 type: EAB-ENB-Relation-ID
    * Java type: EAB_ENB_Relation_ID
    *
    * id: eid-ENB2-Measurement-ID
    * criticality: Criticality.reject
    * presence: Presence.conditional
    * ASN.1 type: EAB-ENB-Relation-ID
    * Java type: EAB_ENB_Relation_ID
    *
    * id: eid-CR-RegistrationRequest
    * criticality: Criticality.reject
    * presence: Presence.mandatory
    * ASN.1 type: EAB-CR-RegistrationRequest
    * Java type: EAB_CR_RegistrationRequest
    *
    * id: eid-CR-ElementType
    * criticality: Criticality.ignore
    * presence: Presence.conditional
    * ASN.1 type: EAB-CR-ElementType
    * Java type: EAB_CR_ElementType
    *
    * id: eid-CR-CellsToReport-List
    * criticality: Criticality.ignore
    * presence: Presence.conditional
    * ASN.1 type: EAB-CR-CellsToReport-List
    * Java type: EAB_CR_CellsToReport_List
    */
   public Asn1Type value;

   public EAB_CellResourceControlRequest_protocolIEs_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_CellResourceControlRequest_protocolIEs_element (
      EAB_ProtocolIE_ID id_,
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
   public EAB_CellResourceControlRequest_protocolIEs_element (long id_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      id = new EAB_ProtocolIE_ID (id_);
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
    * Assign fields according to information object having key eid-ENB1-Measurement-ID
    */
   public void setUsing_eid_ENB1_Measurement_ID(asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_ENB1_Measurement_ID);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-ENB2-Measurement-ID
    */
   public void setUsing_eid_ENB2_Measurement_ID(asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_ENB2_Measurement_ID);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-CR-RegistrationRequest
    */
   public void setUsing_eid_CR_RegistrationRequest(asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_RegistrationRequest value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CR_RegistrationRequest);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-CR-ElementType
    */
   public void setUsing_eid_CR_ElementType(asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_ElementType value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CR_ElementType);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-CR-CellsToReport-List
    */
   public void setUsing_eid_CR_CellsToReport_List(EAB_CR_CellsToReport_List value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CR_CellsToReport_List);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Get value of value with type set according to information object having key eid-ENB1-Measurement-ID
    */
   public asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID getValueFor_eid_ENB1_Measurement_ID() {
      return (asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-ENB2-Measurement-ID
    */
   public asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID getValueFor_eid_ENB2_Measurement_ID() {
      return (asn.lte.generated.X2AP_Ericsson_IEs.EAB_ENB_Relation_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-CR-RegistrationRequest
    */
   public asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_RegistrationRequest getValueFor_eid_CR_RegistrationRequest() {
      return (asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_RegistrationRequest) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-CR-ElementType
    */
   public asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_ElementType getValueFor_eid_CR_ElementType() {
      return (asn.lte.generated.X2AP_Ericsson_IEs.EAB_CR_ElementType) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-CR-CellsToReport-List
    */
   public EAB_CR_CellsToReport_List getValueFor_eid_CR_CellsToReport_List() {
      return (EAB_CR_CellsToReport_List) this.value;
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode id

      buffer.getContext().eventDispatcher.startElement("id", -1);

      id = new EAB_ProtocolIE_ID();
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
      asn.lte.generated.X2AP_Ericsson_Containers.X2AP_EAB_PROTOCOL_IES _index = null;
      for(int i=0; i < _X2AP_Ericsson_PDU_ContentsValues.EAB_CellResourceControlRequest_IEs.length; i++) {
         if(_X2AP_Ericsson_PDU_ContentsValues.EAB_CellResourceControlRequest_IEs[i].id.equals(id)) {
            _index = _X2AP_Ericsson_PDU_ContentsValues.EAB_CellResourceControlRequest_IEs[i];
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
         _sb.append("id = eid-ENB1-Measurement-ID\n");
      }
      else if (id.value == 11) {
         indent (_sb, _level+1);
         _sb.append("id = eid-ENB2-Measurement-ID\n");
      }
      else if (id.value == 12) {
         indent (_sb, _level+1);
         _sb.append("id = eid-CR-RegistrationRequest\n");
      }
      else if (id.value == 13) {
         indent (_sb, _level+1);
         _sb.append("id = eid-CR-ElementType\n");
      }
      else if (id.value == 15) {
         indent (_sb, _level+1);
         _sb.append("id = eid-CR-CellsToReport-List\n");
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
