/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType13_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType13-r9";
   }

   public MBSFN_AreaInfoList_r9 mbsfn_AreaInfoList_r9;
   public MBMS_NotificationConfig_r9 notificationConfig_r9;
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public boolean mV2ExtPresent;
   public MBMS_NotificationConfig_v1430 notificationConfig_v1430;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType13_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType13_r9 (
      MBSFN_AreaInfoList_r9 mbsfn_AreaInfoList_r9_,
      MBMS_NotificationConfig_r9 notificationConfig_r9_,
      Asn1OctetString lateNonCriticalExtension_,
      MBMS_NotificationConfig_v1430 notificationConfig_v1430_
   ) {
      super();
      mbsfn_AreaInfoList_r9 = mbsfn_AreaInfoList_r9_;
      notificationConfig_r9 = notificationConfig_r9_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      notificationConfig_v1430 = notificationConfig_v1430_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType13_r9 (
      MBSFN_AreaInfoList_r9 mbsfn_AreaInfoList_r9_,
      MBMS_NotificationConfig_r9 notificationConfig_r9_
   ) {
      super();
      mbsfn_AreaInfoList_r9 = mbsfn_AreaInfoList_r9_;
      notificationConfig_r9 = notificationConfig_r9_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType13_r9 (MBSFN_AreaInfoList_r9 mbsfn_AreaInfoList_r9_,
      MBMS_NotificationConfig_r9 notificationConfig_r9_,
      byte[] lateNonCriticalExtension_,
      MBMS_NotificationConfig_v1430 notificationConfig_v1430_
   ) {
      super();
      mbsfn_AreaInfoList_r9 = mbsfn_AreaInfoList_r9_;
      notificationConfig_r9 = notificationConfig_r9_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      notificationConfig_v1430 = notificationConfig_v1430_;
   }

   public void init () {
      mbsfn_AreaInfoList_r9 = null;
      notificationConfig_r9 = null;
      lateNonCriticalExtension = null;
      notificationConfig_v1430 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mbsfn_AreaInfoList_r9;
         case 1: return notificationConfig_r9;
         case 2: return lateNonCriticalExtension;
         case 3: return notificationConfig_v1430;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mbsfn-AreaInfoList-r9";
         case 1: return "notificationConfig-r9";
         case 2: return "lateNonCriticalExtension";
         case 3: return "notificationConfig-v1430";
         case 4: return null;
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

      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode mbsfn_AreaInfoList_r9

      buffer.getContext().eventDispatcher.startElement("mbsfn_AreaInfoList_r9", -1);

      mbsfn_AreaInfoList_r9 = new MBSFN_AreaInfoList_r9();
      mbsfn_AreaInfoList_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mbsfn_AreaInfoList_r9", -1);

      // decode notificationConfig_r9

      buffer.getContext().eventDispatcher.startElement("notificationConfig_r9", -1);

      notificationConfig_r9 = new MBMS_NotificationConfig_r9();
      notificationConfig_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("notificationConfig_r9", -1);

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean notificationConfig_v1430Present = buffer.decodeBit ("notificationConfig_v1430Present");

            // decode notificationConfig_v1430

            if (notificationConfig_v1430Present) {
               buffer.getContext().eventDispatcher.startElement("notificationConfig_v1430", -1);

               notificationConfig_v1430 = new MBMS_NotificationConfig_v1430();
               notificationConfig_v1430.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("notificationConfig_v1430", -1);
            }
            else {
               notificationConfig_v1430 = null;
            }

            buffer.moveBitCursor (bitidx);
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
      if (mbsfn_AreaInfoList_r9 != null) mbsfn_AreaInfoList_r9.print (_sb, "mbsfn_AreaInfoList_r9", _level+1);
      if (notificationConfig_r9 != null) notificationConfig_r9.print (_sb, "notificationConfig_r9", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (notificationConfig_v1430 != null) notificationConfig_v1430.print (_sb, "notificationConfig_v1430", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
