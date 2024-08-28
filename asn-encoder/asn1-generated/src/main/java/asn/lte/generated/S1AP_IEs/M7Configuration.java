/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class M7Configuration extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "M7Configuration";
   }

   public M7period m7period;
   public Links_to_log m7_links_to_log = null;
   public M7Configuration_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public M7Configuration () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public M7Configuration (
      M7period m7period_,
      Links_to_log m7_links_to_log_,
      M7Configuration_iE_Extensions iE_Extensions_
   ) {
      super();
      m7period = m7period_;
      m7_links_to_log = m7_links_to_log_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public M7Configuration (
      M7period m7period_,
      Links_to_log m7_links_to_log_
   ) {
      super();
      m7period = m7period_;
      m7_links_to_log = m7_links_to_log_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public M7Configuration (long m7period_,
      Links_to_log m7_links_to_log_,
      M7Configuration_iE_Extensions iE_Extensions_
   ) {
      super();
      m7period = new M7period (m7period_);
      m7_links_to_log = m7_links_to_log_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public M7Configuration (
      long m7period_,
      Links_to_log m7_links_to_log_
   ) {
      super();
      m7period = new M7period (m7period_);
      m7_links_to_log = m7_links_to_log_;
   }

   public void init () {
      m7period = null;
      m7_links_to_log = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return m7period;
         case 1: return m7_links_to_log;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "m7period";
         case 1: return "m7-links-to-log";
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

      // decode m7period

      buffer.getContext().eventDispatcher.startElement("m7period", -1);

      m7period = new M7period();
      m7period.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("m7period", -1);

      // decode m7_links_to_log

      buffer.getContext().eventDispatcher.startElement("m7_links_to_log", -1);

      {
         int tval = Links_to_log.decodeEnumValue (buffer);
         m7_links_to_log = Links_to_log.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("m7_links_to_log", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new M7Configuration_iE_Extensions();
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
      if (m7period != null) m7period.print (_sb, "m7period", _level+1);
      if (m7_links_to_log != null) m7_links_to_log.print (_sb, "m7_links_to_log", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
