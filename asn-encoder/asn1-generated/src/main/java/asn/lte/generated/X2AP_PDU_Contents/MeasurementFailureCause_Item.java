/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.ReportCharacteristics;
import asn.lte.generated.X2AP_IEs.Cause;

public class MeasurementFailureCause_Item extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasurementFailureCause-Item";
   }

   public ReportCharacteristics measurementFailedReportCharacteristics;
   public Cause cause;
   public MeasurementFailureCause_Item_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public MeasurementFailureCause_Item () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasurementFailureCause_Item (
      ReportCharacteristics measurementFailedReportCharacteristics_,
      Cause cause_,
      MeasurementFailureCause_Item_iE_Extensions iE_Extensions_
   ) {
      super();
      measurementFailedReportCharacteristics = measurementFailedReportCharacteristics_;
      cause = cause_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasurementFailureCause_Item (
      ReportCharacteristics measurementFailedReportCharacteristics_,
      Cause cause_
   ) {
      super();
      measurementFailedReportCharacteristics = measurementFailedReportCharacteristics_;
      cause = cause_;
   }

   public void init () {
      measurementFailedReportCharacteristics = null;
      cause = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measurementFailedReportCharacteristics;
         case 1: return cause;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measurementFailedReportCharacteristics";
         case 1: return "cause";
         case 2: return "iE-Extensions";
         case 3: return null;
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode measurementFailedReportCharacteristics

      buffer.getContext().eventDispatcher.startElement("measurementFailedReportCharacteristics", -1);

      measurementFailedReportCharacteristics = new ReportCharacteristics();
      measurementFailedReportCharacteristics.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measurementFailedReportCharacteristics", -1);

      // decode cause

      buffer.getContext().eventDispatcher.startElement("cause", -1);

      cause = new Cause();
      cause.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cause", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new MeasurementFailureCause_Item_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
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
      if (measurementFailedReportCharacteristics != null) measurementFailedReportCharacteristics.print (_sb, "measurementFailedReportCharacteristics", _level+1);
      if (cause != null) cause.print (_sb, "cause", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
