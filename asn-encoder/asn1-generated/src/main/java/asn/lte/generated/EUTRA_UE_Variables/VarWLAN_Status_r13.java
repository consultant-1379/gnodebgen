/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.WLAN_Status_r13;
import asn.lte.generated.EUTRA_RRC_Definitions.WLAN_Status_v1430;

public class VarWLAN_Status_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarWLAN-Status-r13";
   }

   public WLAN_Status_r13 status_r13 = null;
   public WLAN_Status_v1430 status_r14 = null;  // optional

   public VarWLAN_Status_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarWLAN_Status_r13 (
      WLAN_Status_r13 status_r13_,
      WLAN_Status_v1430 status_r14_
   ) {
      super();
      status_r13 = status_r13_;
      status_r14 = status_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public VarWLAN_Status_r13 (
      WLAN_Status_r13 status_r13_
   ) {
      super();
      status_r13 = status_r13_;
   }

   public void init () {
      status_r13 = null;
      status_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return status_r13;
         case 1: return status_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "status-r13";
         case 1: return "status-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean status_r14Present = buffer.decodeBit ("status_r14Present");

      // decode status_r13

      buffer.getContext().eventDispatcher.startElement("status_r13", -1);

      {
         int tval = WLAN_Status_r13.decodeEnumValue (buffer);
         status_r13 = WLAN_Status_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("status_r13", -1);

      // decode status_r14

      if (status_r14Present) {
         buffer.getContext().eventDispatcher.startElement("status_r14", -1);

         int tval = WLAN_Status_v1430.decodeEnumValue (buffer);
         status_r14 = WLAN_Status_v1430.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("status_r14", -1);
      }
      else {
         status_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (status_r13 != null) status_r13.print (_sb, "status_r13", _level+1);
      if (status_r14 != null) status_r14.print (_sb, "status_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
