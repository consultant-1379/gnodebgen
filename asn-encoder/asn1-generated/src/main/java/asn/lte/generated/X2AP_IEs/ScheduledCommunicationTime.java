/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ScheduledCommunicationTime extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ScheduledCommunicationTime";
   }

   public Asn1BitString dayofWeek;  // optional
   public Asn1Integer timeofDayStart;  // optional
   public Asn1Integer timeofDayEnd;  // optional
   public ScheduledCommunicationTime_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public ScheduledCommunicationTime () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ScheduledCommunicationTime (
      Asn1BitString dayofWeek_,
      Asn1Integer timeofDayStart_,
      Asn1Integer timeofDayEnd_,
      ScheduledCommunicationTime_iE_Extensions iE_Extensions_
   ) {
      super();
      dayofWeek = dayofWeek_;
      timeofDayStart = timeofDayStart_;
      timeofDayEnd = timeofDayEnd_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ScheduledCommunicationTime (Asn1BitString dayofWeek_,
      long timeofDayStart_,
      long timeofDayEnd_,
      ScheduledCommunicationTime_iE_Extensions iE_Extensions_
   ) {
      super();
      dayofWeek = dayofWeek_;
      timeofDayStart = new Asn1Integer (timeofDayStart_);
      timeofDayEnd = new Asn1Integer (timeofDayEnd_);
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      dayofWeek = null;
      timeofDayStart = null;
      timeofDayEnd = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dayofWeek;
         case 1: return timeofDayStart;
         case 2: return timeofDayEnd;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dayofWeek";
         case 1: return "timeofDayStart";
         case 2: return "timeofDayEnd";
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

      boolean dayofWeekPresent = buffer.decodeBit ("dayofWeekPresent");
      boolean timeofDayStartPresent = buffer.decodeBit ("timeofDayStartPresent");
      boolean timeofDayEndPresent = buffer.decodeBit ("timeofDayEndPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode dayofWeek

      if (dayofWeekPresent) {
         buffer.getContext().eventDispatcher.startElement("dayofWeek", -1);

         dayofWeek = new Asn1BitString();
         dayofWeek.decode (buffer, 7, 7);

         buffer.invokeCharacters(dayofWeek.toString());
         buffer.getContext().eventDispatcher.endElement("dayofWeek", -1);
      }
      else {
         dayofWeek = null;
      }

      // decode timeofDayStart

      if (timeofDayStartPresent) {
         buffer.getContext().eventDispatcher.startElement("timeofDayStart", -1);

         timeofDayStart = new Asn1Integer();
         boolean extbit_1 = buffer.decodeBit ("extbit_1");
         if (!extbit_1) {
            timeofDayStart.decode (buffer, 0, 86399);
         }
         else {
            timeofDayStart.decode (buffer);
         }

         buffer.invokeCharacters(timeofDayStart.toString());
         buffer.getContext().eventDispatcher.endElement("timeofDayStart", -1);
      }
      else {
         timeofDayStart = null;
      }

      // decode timeofDayEnd

      if (timeofDayEndPresent) {
         buffer.getContext().eventDispatcher.startElement("timeofDayEnd", -1);

         timeofDayEnd = new Asn1Integer();
         boolean extbit_2 = buffer.decodeBit ("extbit_2");
         if (!extbit_2) {
            timeofDayEnd.decode (buffer, 0, 86399);
         }
         else {
            timeofDayEnd.decode (buffer);
         }

         buffer.invokeCharacters(timeofDayEnd.toString());
         buffer.getContext().eventDispatcher.endElement("timeofDayEnd", -1);
      }
      else {
         timeofDayEnd = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new ScheduledCommunicationTime_iE_Extensions();
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
      if (dayofWeek != null) dayofWeek.print (_sb, "dayofWeek", _level+1);
      if (timeofDayStart != null) timeofDayStart.print (_sb, "timeofDayStart", _level+1);
      if (timeofDayEnd != null) timeofDayEnd.print (_sb, "timeofDayEnd", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
