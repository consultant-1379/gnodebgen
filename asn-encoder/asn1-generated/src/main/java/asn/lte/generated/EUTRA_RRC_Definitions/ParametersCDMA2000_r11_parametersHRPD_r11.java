/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ParametersCDMA2000_r11_parametersHRPD_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PreRegistrationInfoHRPD preRegistrationInfoHRPD_r11;
   public CellReselectionParametersCDMA2000_r11 cellReselectionParametersHRPD_r11;  // optional

   public ParametersCDMA2000_r11_parametersHRPD_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ParametersCDMA2000_r11_parametersHRPD_r11 (
      PreRegistrationInfoHRPD preRegistrationInfoHRPD_r11_,
      CellReselectionParametersCDMA2000_r11 cellReselectionParametersHRPD_r11_
   ) {
      super();
      preRegistrationInfoHRPD_r11 = preRegistrationInfoHRPD_r11_;
      cellReselectionParametersHRPD_r11 = cellReselectionParametersHRPD_r11_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ParametersCDMA2000_r11_parametersHRPD_r11 (
      PreRegistrationInfoHRPD preRegistrationInfoHRPD_r11_
   ) {
      super();
      preRegistrationInfoHRPD_r11 = preRegistrationInfoHRPD_r11_;
   }

   public void init () {
      preRegistrationInfoHRPD_r11 = null;
      cellReselectionParametersHRPD_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return preRegistrationInfoHRPD_r11;
         case 1: return cellReselectionParametersHRPD_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "preRegistrationInfoHRPD-r11";
         case 1: return "cellReselectionParametersHRPD-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cellReselectionParametersHRPD_r11Present = buffer.decodeBit ("cellReselectionParametersHRPD_r11Present");

      // decode preRegistrationInfoHRPD_r11

      buffer.getContext().eventDispatcher.startElement("preRegistrationInfoHRPD_r11", -1);

      preRegistrationInfoHRPD_r11 = new PreRegistrationInfoHRPD();
      preRegistrationInfoHRPD_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("preRegistrationInfoHRPD_r11", -1);

      // decode cellReselectionParametersHRPD_r11

      if (cellReselectionParametersHRPD_r11Present) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionParametersHRPD_r11", -1);

         cellReselectionParametersHRPD_r11 = new CellReselectionParametersCDMA2000_r11();
         cellReselectionParametersHRPD_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellReselectionParametersHRPD_r11", -1);
      }
      else {
         cellReselectionParametersHRPD_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (preRegistrationInfoHRPD_r11 != null) preRegistrationInfoHRPD_r11.print (_sb, "preRegistrationInfoHRPD_r11", _level+1);
      if (cellReselectionParametersHRPD_r11 != null) cellReselectionParametersHRPD_r11.print (_sb, "cellReselectionParametersHRPD_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
