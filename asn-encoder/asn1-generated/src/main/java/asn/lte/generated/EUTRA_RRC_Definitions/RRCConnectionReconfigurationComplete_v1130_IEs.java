/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReconfigurationComplete_v1130_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionReconfigurationComplete-v1130-IEs";
   }

   public RRCConnectionReconfigurationComplete_v1130_IEs_connEstFailInfoAvailable_r11 connEstFailInfoAvailable_r11 = null;  // optional
   public RRCConnectionReconfigurationComplete_v1250_IEs nonCriticalExtension;  // optional

   public RRCConnectionReconfigurationComplete_v1130_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReconfigurationComplete_v1130_IEs (
      RRCConnectionReconfigurationComplete_v1130_IEs_connEstFailInfoAvailable_r11 connEstFailInfoAvailable_r11_,
      RRCConnectionReconfigurationComplete_v1250_IEs nonCriticalExtension_
   ) {
      super();
      connEstFailInfoAvailable_r11 = connEstFailInfoAvailable_r11_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      connEstFailInfoAvailable_r11 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return connEstFailInfoAvailable_r11;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "connEstFailInfoAvailable-r11";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean connEstFailInfoAvailable_r11Present = buffer.decodeBit ("connEstFailInfoAvailable_r11Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode connEstFailInfoAvailable_r11

      if (connEstFailInfoAvailable_r11Present) {
         buffer.getContext().eventDispatcher.startElement("connEstFailInfoAvailable_r11", -1);

         int tval = RRCConnectionReconfigurationComplete_v1130_IEs_connEstFailInfoAvailable_r11.decodeEnumValue (buffer);
         connEstFailInfoAvailable_r11 = RRCConnectionReconfigurationComplete_v1130_IEs_connEstFailInfoAvailable_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("connEstFailInfoAvailable_r11", -1);
      }
      else {
         connEstFailInfoAvailable_r11 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionReconfigurationComplete_v1250_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (connEstFailInfoAvailable_r11 != null) connEstFailInfoAvailable_r11.print (_sb, "connEstFailInfoAvailable_r11", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
