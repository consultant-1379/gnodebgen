/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class CellInformation_Item_iE_Extensions_element extends Asn1Seq {
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
    * id: id-ABSInformation
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: ABSInformation
    * Java type: ABSInformation
    *
    * id: id-InvokeIndication
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: InvokeIndication
    * Java type: InvokeIndication
    *
    * id: id-IntendedULDLConfiguration
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: SubframeAssignment
    * Java type: SubframeAssignment
    *
    * id: id-ExtendedULInterferenceOverloadInfo
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: ExtendedULInterferenceOverloadInfo
    * Java type: ExtendedULInterferenceOverloadInfo
    *
    * id: id-CoMPInformation
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: CoMPInformation
    * Java type: CoMPInformation
    *
    * id: id-DynamicDLTransmissionInformation
    * criticality: Criticality.ignore
    * presence: Presence.optional
    * ASN.1 type: DynamicDLTransmissionInformation
    * Java type: DynamicDLTransmissionInformation
    */
   public Asn1Type extensionValue;

   public CellInformation_Item_iE_Extensions_element () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellInformation_Item_iE_Extensions_element (
      ProtocolIE_ID id_,
      Criticality criticality_,
      Asn1Type extensionValue_
   ) {
      super();
      id = id_;
      criticality = criticality_;
      extensionValue = extensionValue_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellInformation_Item_iE_Extensions_element (long id_,
      Criticality criticality_,
      Asn1Type extensionValue_
   ) {
      super();
      id = new ProtocolIE_ID (id_);
      criticality = criticality_;
      extensionValue = extensionValue_;
   }

   public void init () {
      id = null;
      criticality = null;
      extensionValue = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return id;
         case 1: return criticality;
         case 2: return extensionValue;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "id";
         case 1: return "criticality";
         case 2: return "extensionValue";
         default: return null;
      }
   }


   /**
    * Assign fields according to information object having key id-ABSInformation
    */
   public void setUsing_id_ABSInformation(asn.lte.generated.X2AP_IEs.ABSInformation extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_ABSInformation);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Assign fields according to information object having key id-InvokeIndication
    */
   public void setUsing_id_InvokeIndication(asn.lte.generated.X2AP_IEs.InvokeIndication extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_InvokeIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Assign fields according to information object having key id-IntendedULDLConfiguration
    */
   public void setUsing_id_IntendedULDLConfiguration(asn.lte.generated.X2AP_IEs.SubframeAssignment extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_IntendedULDLConfiguration);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Assign fields according to information object having key id-ExtendedULInterferenceOverloadInfo
    */
   public void setUsing_id_ExtendedULInterferenceOverloadInfo(asn.lte.generated.X2AP_IEs.ExtendedULInterferenceOverloadInfo extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_ExtendedULInterferenceOverloadInfo);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Assign fields according to information object having key id-CoMPInformation
    */
   public void setUsing_id_CoMPInformation(asn.lte.generated.X2AP_IEs.CoMPInformation extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_CoMPInformation);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Assign fields according to information object having key id-DynamicDLTransmissionInformation
    */
   public void setUsing_id_DynamicDLTransmissionInformation(asn.lte.generated.X2AP_IEs.DynamicDLTransmissionInformation extensionValue) {
      this.id = new asn.lte.generated.X2AP_CommonDataTypes.ProtocolIE_ID(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_DynamicDLTransmissionInformation);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.extensionValue = extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-ABSInformation
    */
   public asn.lte.generated.X2AP_IEs.ABSInformation getExtensionValueFor_id_ABSInformation() {
      return (asn.lte.generated.X2AP_IEs.ABSInformation) this.extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-InvokeIndication
    */
   public asn.lte.generated.X2AP_IEs.InvokeIndication getExtensionValueFor_id_InvokeIndication() {
      return (asn.lte.generated.X2AP_IEs.InvokeIndication) this.extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-IntendedULDLConfiguration
    */
   public asn.lte.generated.X2AP_IEs.SubframeAssignment getExtensionValueFor_id_IntendedULDLConfiguration() {
      return (asn.lte.generated.X2AP_IEs.SubframeAssignment) this.extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-ExtendedULInterferenceOverloadInfo
    */
   public asn.lte.generated.X2AP_IEs.ExtendedULInterferenceOverloadInfo getExtensionValueFor_id_ExtendedULInterferenceOverloadInfo() {
      return (asn.lte.generated.X2AP_IEs.ExtendedULInterferenceOverloadInfo) this.extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-CoMPInformation
    */
   public asn.lte.generated.X2AP_IEs.CoMPInformation getExtensionValueFor_id_CoMPInformation() {
      return (asn.lte.generated.X2AP_IEs.CoMPInformation) this.extensionValue;
   }

   /**
    * Get value of extensionValue with type set according to information object having key id-DynamicDLTransmissionInformation
    */
   public asn.lte.generated.X2AP_IEs.DynamicDLTransmissionInformation getExtensionValueFor_id_DynamicDLTransmissionInformation() {
      return (asn.lte.generated.X2AP_IEs.DynamicDLTransmissionInformation) this.extensionValue;
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

      // decode extensionValue

      buffer.getContext().eventDispatcher.startElement("extensionValue", -1);

      extensionValue = new Asn1OpenType();
      extensionValue.decode (buffer);

      buffer.invokeCharacters(extensionValue.toString());
      buffer.getContext().eventDispatcher.endElement("extensionValue", -1);

      checkTC (true, buffer.getLazyOpenTypeDecode() ? 0 : 2, buffer.isAligned(), buffer.getContext().eventDispatcher);
   }

   public void checkTC(boolean decode, int decodeOpenTypeFlag, boolean aligned, Asn1NamedEventDispatcher eventDispatcher)
      throws Asn1Exception
   {
      /* check id */
      asn.lte.generated.X2AP_Containers.X2AP_PROTOCOL_EXTENSION _index = null;
      for(int i=0; i < _X2AP_PDU_ContentsValues.CellInformation_Item_ExtIEs.length; i++) {
         if(_X2AP_PDU_ContentsValues.CellInformation_Item_ExtIEs[i].id.equals(id)) {
            _index = _X2AP_PDU_ContentsValues.CellInformation_Item_ExtIEs[i];
            break;
         }
      }
      if (null == _index) {
         return;
      }

      /* check extensionValue */
      if( decode && decodeOpenTypeFlag >=1 ) {
         try {
            Asn1PerDecodeBuffer buffer = new Asn1PerDecodeBuffer(((Asn1OpenType)extensionValue).value, aligned);
            buffer.setLazyOpenTypeDecode(decodeOpenTypeFlag == 1);
            if (eventDispatcher != null)buffer.getContext().eventDispatcher = eventDispatcher;
            buffer.getContext().eventDispatcher.startElement("extensionValue", -1);

            String className = _index.Extension.actualType.getName();
            if (className.lastIndexOf('.') > 0) {
               className = className.substring (className.lastIndexOf (".")+1);
            }
            buffer.getContext().eventDispatcher.startElement(className, -1);

            extensionValue = Asn1Type.decode(buffer, _index.Extension);

            buffer.getContext().eventDispatcher.endElement(className, -1);

            buffer.getContext().eventDispatcher.endElement("extensionValue", -1);
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
      if (id.value == 61) {
         indent (_sb, _level+1);
         _sb.append("id = id-ABSInformation\n");
      }
      else if (id.value == 62) {
         indent (_sb, _level+1);
         _sb.append("id = id-InvokeIndication\n");
      }
      else if (id.value == 99) {
         indent (_sb, _level+1);
         _sb.append("id = id-IntendedULDLConfiguration\n");
      }
      else if (id.value == 100) {
         indent (_sb, _level+1);
         _sb.append("id = id-ExtendedULInterferenceOverloadInfo\n");
      }
      else if (id.value == 108) {
         indent (_sb, _level+1);
         _sb.append("id = id-CoMPInformation\n");
      }
      else if (id.value == 106) {
         indent (_sb, _level+1);
         _sb.append("id = id-DynamicDLTransmissionInformation\n");
      }

      if (criticality != null) {
         criticality.print (_sb, "criticality", _level+1);
      }
      if (extensionValue != null) {
         String tmpName = extensionValue.getAsn1TypeName();
         if (tmpName != null && tmpName != "")  {
            tmpName = "extensionValue" + " (" + tmpName + ")";
         }
         else  {
            tmpName = "extensionValue";
         }
         extensionValue.print (_sb, tmpName, _level+1);
      }
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
