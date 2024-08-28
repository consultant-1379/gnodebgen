/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class M6Configuration extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "M6Configuration";
   }

   public M6report_interval m6report_interval = null;
   public M6delay_threshold m6delay_threshold = null;  // optional
   public Links_to_log m6_links_to_log = null;
   public M6Configuration_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public M6Configuration () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public M6Configuration (
      M6report_interval m6report_interval_,
      M6delay_threshold m6delay_threshold_,
      Links_to_log m6_links_to_log_,
      M6Configuration_iE_Extensions iE_Extensions_
   ) {
      super();
      m6report_interval = m6report_interval_;
      m6delay_threshold = m6delay_threshold_;
      m6_links_to_log = m6_links_to_log_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public M6Configuration (
      M6report_interval m6report_interval_,
      Links_to_log m6_links_to_log_
   ) {
      super();
      m6report_interval = m6report_interval_;
      m6_links_to_log = m6_links_to_log_;
   }

   public void init () {
      m6report_interval = null;
      m6delay_threshold = null;
      m6_links_to_log = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return m6report_interval;
         case 1: return m6delay_threshold;
         case 2: return m6_links_to_log;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "m6report-interval";
         case 1: return "m6delay-threshold";
         case 2: return "m6-links-to-log";
         case 3: return "iE-Extensions";
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

      boolean m6delay_thresholdPresent = buffer.decodeBit ("m6delay_thresholdPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode m6report_interval

      buffer.getContext().eventDispatcher.startElement("m6report_interval", -1);

      {
         int tval = M6report_interval.decodeEnumValue (buffer);
         m6report_interval = M6report_interval.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("m6report_interval", -1);

      // decode m6delay_threshold

      if (m6delay_thresholdPresent) {
         buffer.getContext().eventDispatcher.startElement("m6delay_threshold", -1);

         int tval = M6delay_threshold.decodeEnumValue (buffer);
         m6delay_threshold = M6delay_threshold.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("m6delay_threshold", -1);
      }
      else {
         m6delay_threshold = null;
      }

      // decode m6_links_to_log

      buffer.getContext().eventDispatcher.startElement("m6_links_to_log", -1);

      {
         int tval = Links_to_log.decodeEnumValue (buffer);
         m6_links_to_log = Links_to_log.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("m6_links_to_log", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new M6Configuration_iE_Extensions();
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
      if (m6report_interval != null) m6report_interval.print (_sb, "m6report_interval", _level+1);
      if (m6delay_threshold != null) m6delay_threshold.print (_sb, "m6delay_threshold", _level+1);
      if (m6_links_to_log != null) m6_links_to_log.print (_sb, "m6_links_to_log", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
