/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_IEs;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class EAB_X2SetupResponse_ExtConveyor_protocolIEs_element extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public EAB_ProtocolIE_ID id;
   public Criticality criticality = null;

   /**
    * id: eid-EAB-X2AP-Version
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: EAB-X2AP-Version
    * Java type: EAB_X2AP_Version
    *
    * id: eid-eNB-FeatureList
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: EAB-eNB-FeatureList
    * Java type: EAB_eNB_FeatureList
    *
    * id: eid-ServedCellAttribute-List
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: EAB-ServedCellAttribute-List
    * Java type: EAB_ServedCellAttribute_List
    *
    * id: eid-LAA-ServedCells
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: EAB-LAA-ServedCells-List
    * Java type: EAB_LAA_ServedCells_List
    */
   public Asn1Type value;

   public EAB_X2SetupResponse_ExtConveyor_protocolIEs_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_X2SetupResponse_ExtConveyor_protocolIEs_element (
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
   public EAB_X2SetupResponse_ExtConveyor_protocolIEs_element (long id_,
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
    * Assign fields according to information object having key eid-EAB-X2AP-Version
    */
   public void setUsing_eid_EAB_X2AP_Version(EAB_X2AP_Version value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_EAB_X2AP_Version);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-eNB-FeatureList
    */
   public void setUsing_eid_eNB_FeatureList(EAB_eNB_FeatureList value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_eNB_FeatureList);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-ServedCellAttribute-List
    */
   public void setUsing_eid_ServedCellAttribute_List(EAB_ServedCellAttribute_List value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_ServedCellAttribute_List);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key eid-LAA-ServedCells
    */
   public void setUsing_eid_LAA_ServedCells(EAB_LAA_ServedCells_List value) {
      this.id = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProtocolIE_ID(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_LAA_ServedCells);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Get value of value with type set according to information object having key eid-EAB-X2AP-Version
    */
   public EAB_X2AP_Version getValueFor_eid_EAB_X2AP_Version() {
      return (EAB_X2AP_Version) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-eNB-FeatureList
    */
   public EAB_eNB_FeatureList getValueFor_eid_eNB_FeatureList() {
      return (EAB_eNB_FeatureList) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-ServedCellAttribute-List
    */
   public EAB_ServedCellAttribute_List getValueFor_eid_ServedCellAttribute_List() {
      return (EAB_ServedCellAttribute_List) this.value;
   }

   /**
    * Get value of value with type set according to information object having key eid-LAA-ServedCells
    */
   public EAB_LAA_ServedCells_List getValueFor_eid_LAA_ServedCells() {
      return (EAB_LAA_ServedCells_List) this.value;
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
      for(int i=0; i < _X2AP_Ericsson_IEsValues.EAB_X2SetupResponse_IEs.length; i++) {
         if(_X2AP_Ericsson_IEsValues.EAB_X2SetupResponse_IEs[i].id.equals(id)) {
            _index = _X2AP_Ericsson_IEsValues.EAB_X2SetupResponse_IEs[i];
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
      if (id.value == 4096) {
         indent (_sb, _level+1);
         _sb.append("id = eid-EAB-X2AP-Version\n");
      }
      else if (id.value == 4097) {
         indent (_sb, _level+1);
         _sb.append("id = eid-eNB-FeatureList\n");
      }
      else if (id.value == 4130) {
         indent (_sb, _level+1);
         _sb.append("id = eid-ServedCellAttribute-List\n");
      }
      else if (id.value == 4164) {
         indent (_sb, _level+1);
         _sb.append("id = eid-LAA-ServedCells\n");
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
