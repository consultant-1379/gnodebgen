/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MCCH_Message extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MCCH-Message";
   }

   public MCCH_MessageType message;

   public MCCH_Message () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MCCH_Message (
      MCCH_MessageType message_
   ) {
      super();
      message = message_;
   }

   public void init () {
      message = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return message;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "message";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode message

      buffer.getContext().eventDispatcher.startElement("message", -1);

      message = new MCCH_MessageType();
      message.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("message", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (message != null) message.print (_sb, "message", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
