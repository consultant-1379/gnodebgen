/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType10";
   }

   public Asn1BitString messageIdentifier;
   public Asn1BitString serialNumber;
   public Asn1OctetString warningType;
   public Asn1OctetString dummy;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType10 (
      Asn1BitString messageIdentifier_,
      Asn1BitString serialNumber_,
      Asn1OctetString warningType_,
      Asn1OctetString dummy_,
      Asn1OctetString lateNonCriticalExtension_
   ) {
      super();
      messageIdentifier = messageIdentifier_;
      serialNumber = serialNumber_;
      warningType = warningType_;
      dummy = dummy_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType10 (
      Asn1BitString messageIdentifier_,
      Asn1BitString serialNumber_,
      Asn1OctetString warningType_
   ) {
      super();
      messageIdentifier = messageIdentifier_;
      serialNumber = serialNumber_;
      warningType = warningType_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType10 (Asn1BitString messageIdentifier_,
      Asn1BitString serialNumber_,
      byte[] warningType_,
      byte[] dummy_,
      byte[] lateNonCriticalExtension_
   ) {
      super();
      messageIdentifier = messageIdentifier_;
      serialNumber = serialNumber_;
      warningType = new Asn1OctetString (warningType_);
      dummy = new Asn1OctetString (dummy_);
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SystemInformationBlockType10 (
      Asn1BitString messageIdentifier_,
      Asn1BitString serialNumber_,
      byte[] warningType_
   ) {
      super();
      messageIdentifier = messageIdentifier_;
      serialNumber = serialNumber_;
      warningType = new Asn1OctetString (warningType_);
   }

   public void init () {
      messageIdentifier = null;
      serialNumber = null;
      warningType = null;
      dummy = null;
      lateNonCriticalExtension = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return messageIdentifier;
         case 1: return serialNumber;
         case 2: return warningType;
         case 3: return dummy;
         case 4: return lateNonCriticalExtension;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "messageIdentifier";
         case 1: return "serialNumber";
         case 2: return "warningType";
         case 3: return "dummy";
         case 4: return "lateNonCriticalExtension";
         case 5: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean dummyPresent = buffer.decodeBit ("dummyPresent");

      // decode messageIdentifier

      buffer.getContext().eventDispatcher.startElement("messageIdentifier", -1);

      messageIdentifier = new Asn1BitString();
      messageIdentifier.decode (buffer, 16, 16);

      buffer.invokeCharacters(messageIdentifier.toString());
      buffer.getContext().eventDispatcher.endElement("messageIdentifier", -1);

      // decode serialNumber

      buffer.getContext().eventDispatcher.startElement("serialNumber", -1);

      serialNumber = new Asn1BitString();
      serialNumber.decode (buffer, 16, 16);

      buffer.invokeCharacters(serialNumber.toString());
      buffer.getContext().eventDispatcher.endElement("serialNumber", -1);

      // decode warningType

      buffer.getContext().eventDispatcher.startElement("warningType", -1);

      warningType = new Asn1OctetString();
      warningType.decode (buffer, 2, 2);

      buffer.invokeCharacters(warningType.toString());
      buffer.getContext().eventDispatcher.endElement("warningType", -1);

      // decode dummy

      if (dummyPresent) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy = new Asn1OctetString();
         dummy.decode (buffer, 50, 50);

         buffer.invokeCharacters(dummy.toString());
         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else {
         dummy = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("lateNonCriticalExtensionPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode lateNonCriticalExtension

         if (i < bitcnt && bitmap[i++]) {
            buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

            long _curidx = buffer.getBitOffset();
            bitidx = buffer.decodeExtLength ();
            if (bitidx - _curidx >= 131088)  {
               throw new Asn1Exception ("PER fragmentation not enabled: add -perindef to decode");
            }

            lateNonCriticalExtension = new Asn1OctetString();
            lateNonCriticalExtension.decode (buffer);

            buffer.moveBitCursor (bitidx);

            buffer.invokeCharacters (lateNonCriticalExtension.toString());
            buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);

         }
         else {
            lateNonCriticalExtension = null;
         }

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (messageIdentifier != null) messageIdentifier.print (_sb, "messageIdentifier", _level+1);
      if (serialNumber != null) serialNumber.print (_sb, "serialNumber", _level+1);
      if (warningType != null) warningType.print (_sb, "warningType", _level+1);
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
