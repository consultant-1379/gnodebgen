/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.S1AP_CommonDataTypes.Criticality;

public class E_RABModificationIndication_protocolIEs_element extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ProtocolIE_ID id;
   public Criticality criticality = null;

   /**
    * id: id-MME-UE-S1AP-ID
    * criticality: Criticality.reject
    * presence: Presence.mandatory
    * ASN.1 type: MME-UE-S1AP-ID
    * Java type: MME_UE_S1AP_ID
    *
    * id: id-eNB-UE-S1AP-ID
    * criticality: Criticality.reject
    * presence: Presence.mandatory
    * ASN.1 type: ENB-UE-S1AP-ID
    * Java type: ENB_UE_S1AP_ID
    *
    * id: id-E-RABToBeModifiedListBearerModInd
    * criticality: Criticality.reject
    * presence: Presence.mandatory
    * ASN.1 type: E-RABToBeModifiedListBearerModInd
    * Java type: E_RABToBeModifiedListBearerModInd
    *
    * id: id-E-RABNotToBeModifiedListBearerModInd
    * criticality: Criticality.reject
    * presence: Presence.optional
    * ASN.1 type: E-RABNotToBeModifiedListBearerModInd
    * Java type: E_RABNotToBeModifiedListBearerModInd
    *
    * id: id-CSGMembershipInfo
    * criticality: Criticality.reject
    * presence: Presence.optional
    * ASN.1 type: CSGMembershipInfo
    * Java type: CSGMembershipInfo
    *
    * id: id-Tunnel-Information-for-BBF
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: TunnelInformation
    * Java type: TunnelInformation
    *
    * id: id-SecondaryRATDataUsageReportList
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: SecondaryRATDataUsageReportList
    * Java type: SecondaryRATDataUsageReportList
    */
   public Asn1Type value;

   public E_RABModificationIndication_protocolIEs_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public E_RABModificationIndication_protocolIEs_element (
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
   public E_RABModificationIndication_protocolIEs_element (long id_,
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
    * Assign fields according to information object having key id-MME-UE-S1AP-ID
    */
   public void setUsing_id_MME_UE_S1AP_ID(asn.lte.generated.S1AP_IEs.MME_UE_S1AP_ID value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_MME_UE_S1AP_ID);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-eNB-UE-S1AP-ID
    */
   public void setUsing_id_eNB_UE_S1AP_ID(asn.lte.generated.S1AP_IEs.ENB_UE_S1AP_ID value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_eNB_UE_S1AP_ID);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-E-RABToBeModifiedListBearerModInd
    */
   public void setUsing_id_E_RABToBeModifiedListBearerModInd(E_RABToBeModifiedListBearerModInd value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_E_RABToBeModifiedListBearerModInd);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-E-RABNotToBeModifiedListBearerModInd
    */
   public void setUsing_id_E_RABNotToBeModifiedListBearerModInd(E_RABNotToBeModifiedListBearerModInd value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_E_RABNotToBeModifiedListBearerModInd);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-CSGMembershipInfo
    */
   public void setUsing_id_CSGMembershipInfo(CSGMembershipInfo value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_CSGMembershipInfo);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-Tunnel-Information-for-BBF
    */
   public void setUsing_id_Tunnel_Information_for_BBF(asn.lte.generated.S1AP_IEs.TunnelInformation value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_Tunnel_Information_for_BBF);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-SecondaryRATDataUsageReportList
    */
   public void setUsing_id_SecondaryRATDataUsageReportList(asn.lte.generated.S1AP_IEs.SecondaryRATDataUsageReportList value) {
      this.id = new asn.lte.generated.S1AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.S1AP_Constants._S1AP_ConstantsValues.id_SecondaryRATDataUsageReportList);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Get value of value with type set according to information object having key id-MME-UE-S1AP-ID
    */
   public asn.lte.generated.S1AP_IEs.MME_UE_S1AP_ID getValueFor_id_MME_UE_S1AP_ID() {
      return (asn.lte.generated.S1AP_IEs.MME_UE_S1AP_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-eNB-UE-S1AP-ID
    */
   public asn.lte.generated.S1AP_IEs.ENB_UE_S1AP_ID getValueFor_id_eNB_UE_S1AP_ID() {
      return (asn.lte.generated.S1AP_IEs.ENB_UE_S1AP_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-E-RABToBeModifiedListBearerModInd
    */
   public E_RABToBeModifiedListBearerModInd getValueFor_id_E_RABToBeModifiedListBearerModInd() {
      return (E_RABToBeModifiedListBearerModInd) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-E-RABNotToBeModifiedListBearerModInd
    */
   public E_RABNotToBeModifiedListBearerModInd getValueFor_id_E_RABNotToBeModifiedListBearerModInd() {
      return (E_RABNotToBeModifiedListBearerModInd) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-CSGMembershipInfo
    */
   public CSGMembershipInfo getValueFor_id_CSGMembershipInfo() {
      return (CSGMembershipInfo) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-Tunnel-Information-for-BBF
    */
   public asn.lte.generated.S1AP_IEs.TunnelInformation getValueFor_id_Tunnel_Information_for_BBF() {
      return (asn.lte.generated.S1AP_IEs.TunnelInformation) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-SecondaryRATDataUsageReportList
    */
   public asn.lte.generated.S1AP_IEs.SecondaryRATDataUsageReportList getValueFor_id_SecondaryRATDataUsageReportList() {
      return (asn.lte.generated.S1AP_IEs.SecondaryRATDataUsageReportList) this.value;
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
      asn.lte.generated.S1AP_Containers.S1AP_PROTOCOL_IES _index = null;
      for(int i=0; i < _S1AP_PDU_ContentsValues.E_RABModificationIndicationIEs.length; i++) {
         if(_S1AP_PDU_ContentsValues.E_RABModificationIndicationIEs[i].id.equals(id)) {
            _index = _S1AP_PDU_ContentsValues.E_RABModificationIndicationIEs[i];
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
      if (id.value == 0) {
         indent (_sb, _level+1);
         _sb.append("id = id-MME-UE-S1AP-ID\n");
      }
      else if (id.value == 8) {
         indent (_sb, _level+1);
         _sb.append("id = id-eNB-UE-S1AP-ID\n");
      }
      else if (id.value == 199) {
         indent (_sb, _level+1);
         _sb.append("id = id-E-RABToBeModifiedListBearerModInd\n");
      }
      else if (id.value == 201) {
         indent (_sb, _level+1);
         _sb.append("id = id-E-RABNotToBeModifiedListBearerModInd\n");
      }
      else if (id.value == 226) {
         indent (_sb, _level+1);
         _sb.append("id = id-CSGMembershipInfo\n");
      }
      else if (id.value == 176) {
         indent (_sb, _level+1);
         _sb.append("id = id-Tunnel-Information-for-BBF\n");
      }
      else if (id.value == 264) {
         indent (_sb, _level+1);
         _sb.append("id = id-SecondaryRATDataUsageReportList\n");
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
