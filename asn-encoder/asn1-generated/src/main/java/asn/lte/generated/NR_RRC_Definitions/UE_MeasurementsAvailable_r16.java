/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_MeasurementsAvailable_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-MeasurementsAvailable-r16";
   }

   public UE_MeasurementsAvailable_r16_logMeasAvailable_r16 logMeasAvailable_r16 = null;  // optional
   public UE_MeasurementsAvailable_r16_logMeasAvailableBT_r16 logMeasAvailableBT_r16 = null;  // optional
   public UE_MeasurementsAvailable_r16_logMeasAvailableWLAN_r16 logMeasAvailableWLAN_r16 = null;  // optional
   public UE_MeasurementsAvailable_r16_connEstFailInfoAvailable_r16 connEstFailInfoAvailable_r16 = null;  // optional
   public UE_MeasurementsAvailable_r16_rlf_InfoAvailable_r16 rlf_InfoAvailable_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public UE_MeasurementsAvailable_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_MeasurementsAvailable_r16 (
      UE_MeasurementsAvailable_r16_logMeasAvailable_r16 logMeasAvailable_r16_,
      UE_MeasurementsAvailable_r16_logMeasAvailableBT_r16 logMeasAvailableBT_r16_,
      UE_MeasurementsAvailable_r16_logMeasAvailableWLAN_r16 logMeasAvailableWLAN_r16_,
      UE_MeasurementsAvailable_r16_connEstFailInfoAvailable_r16 connEstFailInfoAvailable_r16_,
      UE_MeasurementsAvailable_r16_rlf_InfoAvailable_r16 rlf_InfoAvailable_r16_
   ) {
      super();
      logMeasAvailable_r16 = logMeasAvailable_r16_;
      logMeasAvailableBT_r16 = logMeasAvailableBT_r16_;
      logMeasAvailableWLAN_r16 = logMeasAvailableWLAN_r16_;
      connEstFailInfoAvailable_r16 = connEstFailInfoAvailable_r16_;
      rlf_InfoAvailable_r16 = rlf_InfoAvailable_r16_;
   }

   public void init () {
      logMeasAvailable_r16 = null;
      logMeasAvailableBT_r16 = null;
      logMeasAvailableWLAN_r16 = null;
      connEstFailInfoAvailable_r16 = null;
      rlf_InfoAvailable_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return logMeasAvailable_r16;
         case 1: return logMeasAvailableBT_r16;
         case 2: return logMeasAvailableWLAN_r16;
         case 3: return connEstFailInfoAvailable_r16;
         case 4: return rlf_InfoAvailable_r16;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "logMeasAvailable-r16";
         case 1: return "logMeasAvailableBT-r16";
         case 2: return "logMeasAvailableWLAN-r16";
         case 3: return "connEstFailInfoAvailable-r16";
         case 4: return "rlf-InfoAvailable-r16";
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

      boolean logMeasAvailable_r16Present = buffer.decodeBit ("logMeasAvailable_r16Present");
      boolean logMeasAvailableBT_r16Present = buffer.decodeBit ("logMeasAvailableBT_r16Present");
      boolean logMeasAvailableWLAN_r16Present = buffer.decodeBit ("logMeasAvailableWLAN_r16Present");
      boolean connEstFailInfoAvailable_r16Present = buffer.decodeBit ("connEstFailInfoAvailable_r16Present");
      boolean rlf_InfoAvailable_r16Present = buffer.decodeBit ("rlf_InfoAvailable_r16Present");

      // decode logMeasAvailable_r16

      if (logMeasAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailable_r16", -1);

         int tval = UE_MeasurementsAvailable_r16_logMeasAvailable_r16.decodeEnumValue (buffer);
         logMeasAvailable_r16 = UE_MeasurementsAvailable_r16_logMeasAvailable_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailable_r16", -1);
      }
      else {
         logMeasAvailable_r16 = null;
      }

      // decode logMeasAvailableBT_r16

      if (logMeasAvailableBT_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailableBT_r16", -1);

         int tval = UE_MeasurementsAvailable_r16_logMeasAvailableBT_r16.decodeEnumValue (buffer);
         logMeasAvailableBT_r16 = UE_MeasurementsAvailable_r16_logMeasAvailableBT_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailableBT_r16", -1);
      }
      else {
         logMeasAvailableBT_r16 = null;
      }

      // decode logMeasAvailableWLAN_r16

      if (logMeasAvailableWLAN_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailableWLAN_r16", -1);

         int tval = UE_MeasurementsAvailable_r16_logMeasAvailableWLAN_r16.decodeEnumValue (buffer);
         logMeasAvailableWLAN_r16 = UE_MeasurementsAvailable_r16_logMeasAvailableWLAN_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailableWLAN_r16", -1);
      }
      else {
         logMeasAvailableWLAN_r16 = null;
      }

      // decode connEstFailInfoAvailable_r16

      if (connEstFailInfoAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("connEstFailInfoAvailable_r16", -1);

         int tval = UE_MeasurementsAvailable_r16_connEstFailInfoAvailable_r16.decodeEnumValue (buffer);
         connEstFailInfoAvailable_r16 = UE_MeasurementsAvailable_r16_connEstFailInfoAvailable_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("connEstFailInfoAvailable_r16", -1);
      }
      else {
         connEstFailInfoAvailable_r16 = null;
      }

      // decode rlf_InfoAvailable_r16

      if (rlf_InfoAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rlf_InfoAvailable_r16", -1);

         int tval = UE_MeasurementsAvailable_r16_rlf_InfoAvailable_r16.decodeEnumValue (buffer);
         rlf_InfoAvailable_r16 = UE_MeasurementsAvailable_r16_rlf_InfoAvailable_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rlf_InfoAvailable_r16", -1);
      }
      else {
         rlf_InfoAvailable_r16 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

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
      if (logMeasAvailable_r16 != null) logMeasAvailable_r16.print (_sb, "logMeasAvailable_r16", _level+1);
      if (logMeasAvailableBT_r16 != null) logMeasAvailableBT_r16.print (_sb, "logMeasAvailableBT_r16", _level+1);
      if (logMeasAvailableWLAN_r16 != null) logMeasAvailableWLAN_r16.print (_sb, "logMeasAvailableWLAN_r16", _level+1);
      if (connEstFailInfoAvailable_r16 != null) connEstFailInfoAvailable_r16.print (_sb, "connEstFailInfoAvailable_r16", _level+1);
      if (rlf_InfoAvailable_r16 != null) rlf_InfoAvailable_r16.print (_sb, "rlf_InfoAvailable_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
