/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.DL_DCCH_Message;

public class HandoverCommand_r8_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HandoverCommand-r8-IEs";
   }

   public DL_DCCH_Message handoverCommandMessage;
   public HandoverCommand_r8_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public HandoverCommand_r8_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HandoverCommand_r8_IEs (
      DL_DCCH_Message handoverCommandMessage_,
      HandoverCommand_r8_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      handoverCommandMessage = handoverCommandMessage_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public HandoverCommand_r8_IEs (
      DL_DCCH_Message handoverCommandMessage_
   ) {
      super();
      handoverCommandMessage = handoverCommandMessage_;
   }

   public void init () {
      handoverCommandMessage = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return handoverCommandMessage;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "handoverCommandMessage";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode handoverCommandMessage

      buffer.getContext().eventDispatcher.startElement("handoverCommandMessage", -1);

      {
         Asn1OctetString handoverCommandMessage_outer = new Asn1OctetString();
         handoverCommandMessage_outer.decode (buffer);
         if (handoverCommandMessage_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( handoverCommandMessage_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         handoverCommandMessage = new DL_DCCH_Message();
         handoverCommandMessage.decode (buffer);
         buffer = savedBuffer;
      }
      buffer.getContext().eventDispatcher.endElement("handoverCommandMessage", -1);

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new HandoverCommand_r8_IEs_nonCriticalExtension();
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
      if (handoverCommandMessage != null) handoverCommandMessage.print (_sb, "handoverCommandMessage", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
