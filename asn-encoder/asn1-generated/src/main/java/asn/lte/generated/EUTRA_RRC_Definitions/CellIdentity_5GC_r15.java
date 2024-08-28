/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellIdentity_5GC_r15 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellIdentity-5GC-r15";
   }

   // Choice element identifier constants
   public final static byte _CELLIDENTITY_R15 = 1;
   public final static byte _CELLID_INDEX_R15 = 2;

   public CellIdentity_5GC_r15 () {
      super();
   }

   public CellIdentity_5GC_r15 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _CELLIDENTITY_R15: return "cellIdentity_r15";
      case _CELLID_INDEX_R15: return "cellId_Index_r15";
      default: return "UNDEFINED";
      }
   }

   public void set_cellIdentity_r15 (CellIdentity value) {
      setElement (_CELLIDENTITY_R15, value);
   }

   public void set_cellId_Index_r15 (Asn1Integer value) {
      setElement (_CELLID_INDEX_R15, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // cellIdentity_r15
         case 0: { 
            CellIdentity cellIdentity_r15;
            element = cellIdentity_r15 = new CellIdentity();
            cellIdentity_r15.decode (buffer);
            break;
         }

         // cellId_Index_r15
         case 1: { 
            Asn1Integer cellId_Index_r15;
            element = cellId_Index_r15 = new Asn1Integer();
            cellId_Index_r15.decode (buffer, 1, 6);

            buffer.invokeCharacters(cellId_Index_r15.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
