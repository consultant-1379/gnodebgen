/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_ENSA_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class ENSA_SuccessfulOutcome extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_ENSA_PDU_DescriptionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENSA-SuccessfulOutcome";
   }

   public ProcedureCode procedureCode;
   public Criticality criticality = null;

   /**
    * procedureCode: xid-X2Setup
    * criticality: Criticality.reject
    * ASN.1 type: ENSA-X2SetupResponse
    * Java type: ENSA_X2SetupResponse
    *
    * procedureCode: xid-ConfigurationUpdate
    * criticality: Criticality.reject
    * ASN.1 type: ENSA-ConfigurationUpdateAcknowledge
    * Java type: ENSA_ConfigurationUpdateAcknowledge
    *
    * procedureCode: xid-sgNBAdditionPreparation
    * criticality: Criticality.reject
    * ASN.1 type: ENSA-SgNBAdditionRequestAcknowledge
    * Java type: ENSA_SgNBAdditionRequestAcknowledge
    *
    * procedureCode: xid-ErrorIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: xid-sgNBReconfigurationCompletion
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    */
   public Asn1Type value;

   public ENSA_SuccessfulOutcome () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ENSA_SuccessfulOutcome (
      ProcedureCode procedureCode_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      procedureCode = procedureCode_;
      criticality = criticality_;
      value = value_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ENSA_SuccessfulOutcome (long procedureCode_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      procedureCode = new ProcedureCode (procedureCode_);
      criticality = criticality_;
      value = value_;
   }

   public void init () {
      procedureCode = null;
      criticality = null;
      value = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return procedureCode;
         case 1: return criticality;
         case 2: return value;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "procedureCode";
         case 1: return "criticality";
         case 2: return "value";
         default: return null;
      }
   }


   /**
    * Assign fields according to information object ensa-X2Setup
    */
   public void setUsing_ensa_X2Setup(asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_X2Setup);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object ensa-ConfigurationUpdate
    */
   public void setUsing_ensa_ConfigurationUpdate(asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdateAcknowledge value) {
      this.procedureCode = new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_ConfigurationUpdate);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object ensa-sgNBAdditionPreparation
    */
   public void setUsing_ensa_sgNBAdditionPreparation(asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequestAcknowledge value) {
      this.procedureCode = new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_sgNBAdditionPreparation);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object ensa-ErrorIndication
    */
   public void setUsing_ensa_ErrorIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_ErrorIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object ensa-sgNBReconfigurationCompletion
    */
   public void setUsing_ensa_sgNBReconfigurationCompletion() {
      this.procedureCode = new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_sgNBReconfigurationCompletion);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Get value of value with type set according to information object ensa-X2Setup
    */
   public asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupResponse getValueFor_ensa_X2Setup() {
      return (asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object ensa-ConfigurationUpdate
    */
   public asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdateAcknowledge getValueFor_ensa_ConfigurationUpdate() {
      return (asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdateAcknowledge) this.value;
   }

   /**
    * Get value of value with type set according to information object ensa-sgNBAdditionPreparation
    */
   public asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequestAcknowledge getValueFor_ensa_sgNBAdditionPreparation() {
      return (asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequestAcknowledge) this.value;
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode procedureCode

      buffer.getContext().eventDispatcher.startElement("procedureCode", -1);

      procedureCode = new ProcedureCode();
      procedureCode.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("procedureCode", -1);

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
      /* check procedureCode */
      X2AP_ENSA_ELEMENTARY_PROCEDURE _index = null;
      for(int i=0; i < _X2AP_ENSA_PDU_DescriptionsValues.X2AP_ENSA_ELEMENTARY_PROCEDURES.length; i++) {
         if(_X2AP_ENSA_PDU_DescriptionsValues.X2AP_ENSA_ELEMENTARY_PROCEDURES[i].procedureCode.equals(procedureCode)) {
            _index = _X2AP_ENSA_PDU_DescriptionsValues.X2AP_ENSA_ELEMENTARY_PROCEDURES[i];
            break;
         }
      }
      if (null == _index) {
         return;
      }

      /* check value */
      if( decode && decodeOpenTypeFlag >=1 ) {
         if(_index.SuccessfulOutcome != null)
         {
            try {
               Asn1PerDecodeBuffer buffer = new Asn1PerDecodeBuffer(((Asn1OpenType)value).value, aligned);
               buffer.setLazyOpenTypeDecode(decodeOpenTypeFlag == 1);
               if (eventDispatcher != null)buffer.getContext().eventDispatcher = eventDispatcher;
               buffer.getContext().eventDispatcher.startElement("value", -1);

               String className = _index.SuccessfulOutcome.actualType.getName();
               if (className.lastIndexOf('.') > 0) {
                  className = className.substring (className.lastIndexOf (".")+1);
               }
               buffer.getContext().eventDispatcher.startElement(className, -1);

               value = Asn1Type.decode(buffer, _index.SuccessfulOutcome);

               buffer.getContext().eventDispatcher.endElement(className, -1);

               buffer.getContext().eventDispatcher.endElement("value", -1);
            }
            catch (java.io.IOException e) {
               throw new Asn1Exception(e.toString());
            }
         }
      }

      /* use -strict option to validate the "criticality" element */
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (procedureCode.value == 145) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = xid-X2Setup\n");
      }
      else if (procedureCode.value == 146) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = xid-ConfigurationUpdate\n");
      }
      else if (procedureCode.value == 147) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = xid-sgNBAdditionPreparation\n");
      }
      else if (procedureCode.value == 144) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = xid-ErrorIndication\n");
      }
      else if (procedureCode.value == 148) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = xid-sgNBReconfigurationCompletion\n");
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
