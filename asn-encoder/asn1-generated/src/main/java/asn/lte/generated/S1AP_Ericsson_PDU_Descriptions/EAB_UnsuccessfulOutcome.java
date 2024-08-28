/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_Ericsson_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_ProcedureCode;
import asn.lte.generated.S1AP_CommonDataTypes.Criticality;

public class EAB_UnsuccessfulOutcome extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_Ericsson_PDU_DescriptionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-UnsuccessfulOutcome";
   }

   public EAB_ProcedureCode procedureCode;
   public Criticality criticality = null;

   /**
    * procedureCode: eid-ThroughputEstimation
    * criticality: Criticality.reject
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-WifiAccessDecision
    * criticality: Criticality.reject
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-ErrorIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    */
   public Asn1Type value;

   public EAB_UnsuccessfulOutcome () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_UnsuccessfulOutcome (
      EAB_ProcedureCode procedureCode_,
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
   public EAB_UnsuccessfulOutcome (long procedureCode_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      procedureCode = new EAB_ProcedureCode (procedureCode_);
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
    * Assign fields according to information object eab-ThroughputEstimation
    */
   public void setUsing_eab_ThroughputEstimation() {
      this.procedureCode = new asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.S1AP_Ericsson_Constants._S1AP_Ericsson_ConstantsValues.eid_ThroughputEstimation);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
   }

   /**
    * Assign fields according to information object eab-WifiAccessDecision
    */
   public void setUsing_eab_WifiAccessDecision() {
      this.procedureCode = new asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.S1AP_Ericsson_Constants._S1AP_Ericsson_ConstantsValues.eid_WifiAccessDecision);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.reject();
   }

   /**
    * Assign fields according to information object eab-ErrorIndication
    */
   public void setUsing_eab_ErrorIndication() {
      this.procedureCode = new asn.lte.generated.S1AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.S1AP_Ericsson_Constants._S1AP_Ericsson_ConstantsValues.eid_ErrorIndication);
      this.criticality = asn.lte.generated.S1AP_CommonDataTypes.Criticality.ignore();
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode procedureCode

      buffer.getContext().eventDispatcher.startElement("procedureCode", -1);

      procedureCode = new EAB_ProcedureCode();
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
      S1AP_EAB_ELEMENTARY_PROCEDURE _index = null;
      for(int i=0; i < _S1AP_Ericsson_PDU_DescriptionsValues.S1AP_EAB_ELEMENTARY_PROCEDURES.length; i++) {
         if(_S1AP_Ericsson_PDU_DescriptionsValues.S1AP_EAB_ELEMENTARY_PROCEDURES[i].procedureCode.equals(procedureCode)) {
            _index = _S1AP_Ericsson_PDU_DescriptionsValues.S1AP_EAB_ELEMENTARY_PROCEDURES[i];
            break;
         }
      }
      if (null == _index) {
         return;
      }

      /* check value */
      if( decode && decodeOpenTypeFlag >=1 ) {
         if(_index.UnsuccessfulOutcome != null)
         {
            try {
               Asn1PerDecodeBuffer buffer = new Asn1PerDecodeBuffer(((Asn1OpenType)value).value, aligned);
               buffer.setLazyOpenTypeDecode(decodeOpenTypeFlag == 1);
               if (eventDispatcher != null)buffer.getContext().eventDispatcher = eventDispatcher;
               buffer.getContext().eventDispatcher.startElement("value", -1);

               String className = _index.UnsuccessfulOutcome.actualType.getName();
               if (className.lastIndexOf('.') > 0) {
                  className = className.substring (className.lastIndexOf (".")+1);
               }
               buffer.getContext().eventDispatcher.startElement(className, -1);

               value = Asn1Type.decode(buffer, _index.UnsuccessfulOutcome);

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
      if (procedureCode.value == 2) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-ThroughputEstimation\n");
      }
      else if (procedureCode.value == 1) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-WifiAccessDecision\n");
      }
      else if (procedureCode.value == 0) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-ErrorIndication\n");
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
