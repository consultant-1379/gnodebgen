/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.M3AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.M3AP_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.M3AP_CommonDataTypes.Criticality;

public class MCEConfigurationUpdate_protocolIEs_element extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_M3AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ProtocolIE_ID id;
   public Criticality criticality = null;

   /**
    * id: id-Global-MCE-ID
    * criticality: Criticality.reject
    * presence: Presence.optional
    * ASN.1 type: Global-MCE-ID
    * Java type: Global_MCE_ID
    *
    * id: id-MCEname
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: MCEname
    * Java type: MCEname
    *
    * id: id-MBMSServiceAreaList
    * criticality: Criticality.reject
    * presence: Presence.optional
    * ASN.1 type: MBMSServiceAreaListItem
    * Java type: MBMSServiceAreaListItem
    */
   public Asn1Type value;

   public MCEConfigurationUpdate_protocolIEs_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MCEConfigurationUpdate_protocolIEs_element (
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
   public MCEConfigurationUpdate_protocolIEs_element (long id_,
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
    * Assign fields according to information object having key id-Global-MCE-ID
    */
   public void setUsing_id_Global_MCE_ID(asn.lte.generated.M3AP_IEs.Global_MCE_ID value) {
      this.id = new asn.lte.generated.M3AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.M3AP_Constants._M3AP_ConstantsValues.id_Global_MCE_ID);
      this.criticality = asn.lte.generated.M3AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-MCEname
    */
   public void setUsing_id_MCEname(asn.lte.generated.M3AP_IEs.MCEname value) {
      this.id = new asn.lte.generated.M3AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.M3AP_Constants._M3AP_ConstantsValues.id_MCEname);
      this.criticality = asn.lte.generated.M3AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object having key id-MBMSServiceAreaList
    */
   public void setUsing_id_MBMSServiceAreaList(MBMSServiceAreaListItem value) {
      this.id = new asn.lte.generated.M3AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.M3AP_Constants._M3AP_ConstantsValues.id_MBMSServiceAreaList);
      this.criticality = asn.lte.generated.M3AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Get value of value with type set according to information object having key id-Global-MCE-ID
    */
   public asn.lte.generated.M3AP_IEs.Global_MCE_ID getValueFor_id_Global_MCE_ID() {
      return (asn.lte.generated.M3AP_IEs.Global_MCE_ID) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-MCEname
    */
   public asn.lte.generated.M3AP_IEs.MCEname getValueFor_id_MCEname() {
      return (asn.lte.generated.M3AP_IEs.MCEname) this.value;
   }

   /**
    * Get value of value with type set according to information object having key id-MBMSServiceAreaList
    */
   public MBMSServiceAreaListItem getValueFor_id_MBMSServiceAreaList() {
      return (MBMSServiceAreaListItem) this.value;
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
      asn.lte.generated.M3AP_Containers.M3AP_PROTOCOL_IES _index = null;
      for(int i=0; i < _M3AP_PDU_ContentsValues.MCEConfigurationUpdateIEs.length; i++) {
         if(_M3AP_PDU_ContentsValues.MCEConfigurationUpdateIEs[i].id.equals(id)) {
            _index = _M3AP_PDU_ContentsValues.MCEConfigurationUpdateIEs[i];
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
      if (id.value == 18) {
         indent (_sb, _level+1);
         _sb.append("id = id-Global-MCE-ID\n");
      }
      else if (id.value == 19) {
         indent (_sb, _level+1);
         _sb.append("id = id-MCEname\n");
      }
      else if (id.value == 20) {
         indent (_sb, _level+1);
         _sb.append("id = id-MBMSServiceAreaList\n");
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
