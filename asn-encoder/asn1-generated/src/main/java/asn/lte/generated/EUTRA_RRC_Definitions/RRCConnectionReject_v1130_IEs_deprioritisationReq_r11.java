/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReject_v1130_IEs_deprioritisationReq_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationType_r11 deprioritisationType_r11 = null;
   public RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationTimer_r11 deprioritisationTimer_r11 = null;

   public RRCConnectionReject_v1130_IEs_deprioritisationReq_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReject_v1130_IEs_deprioritisationReq_r11 (
      RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationType_r11 deprioritisationType_r11_,
      RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationTimer_r11 deprioritisationTimer_r11_
   ) {
      super();
      deprioritisationType_r11 = deprioritisationType_r11_;
      deprioritisationTimer_r11 = deprioritisationTimer_r11_;
   }

   public void init () {
      deprioritisationType_r11 = null;
      deprioritisationTimer_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return deprioritisationType_r11;
         case 1: return deprioritisationTimer_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "deprioritisationType-r11";
         case 1: return "deprioritisationTimer-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode deprioritisationType_r11

      buffer.getContext().eventDispatcher.startElement("deprioritisationType_r11", -1);

      {
         int tval = RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationType_r11.decodeEnumValue (buffer);
         deprioritisationType_r11 = RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationType_r11.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deprioritisationType_r11", -1);

      // decode deprioritisationTimer_r11

      buffer.getContext().eventDispatcher.startElement("deprioritisationTimer_r11", -1);

      {
         int tval = RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationTimer_r11.decodeEnumValue (buffer);
         deprioritisationTimer_r11 = RRCConnectionReject_v1130_IEs_deprioritisationReq_r11_deprioritisationTimer_r11.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deprioritisationTimer_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (deprioritisationType_r11 != null) deprioritisationType_r11.print (_sb, "deprioritisationType_r11", _level+1);
      if (deprioritisationTimer_r11 != null) deprioritisationTimer_r11.print (_sb, "deprioritisationTimer_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
