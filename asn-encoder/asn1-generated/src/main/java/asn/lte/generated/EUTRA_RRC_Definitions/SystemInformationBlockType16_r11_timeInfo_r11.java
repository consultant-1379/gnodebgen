/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType16_r11_timeInfo_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer timeInfoUTC_r11;
   public Asn1BitString dayLightSavingTime_r11;  // optional
   public Asn1Integer leapSeconds_r11;  // optional
   public Asn1Integer localTimeOffset_r11;  // optional

   public SystemInformationBlockType16_r11_timeInfo_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType16_r11_timeInfo_r11 (
      Asn1Integer timeInfoUTC_r11_,
      Asn1BitString dayLightSavingTime_r11_,
      Asn1Integer leapSeconds_r11_,
      Asn1Integer localTimeOffset_r11_
   ) {
      super();
      timeInfoUTC_r11 = timeInfoUTC_r11_;
      dayLightSavingTime_r11 = dayLightSavingTime_r11_;
      leapSeconds_r11 = leapSeconds_r11_;
      localTimeOffset_r11 = localTimeOffset_r11_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType16_r11_timeInfo_r11 (
      Asn1Integer timeInfoUTC_r11_
   ) {
      super();
      timeInfoUTC_r11 = timeInfoUTC_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType16_r11_timeInfo_r11 (long timeInfoUTC_r11_,
      Asn1BitString dayLightSavingTime_r11_,
      long leapSeconds_r11_,
      long localTimeOffset_r11_
   ) {
      super();
      timeInfoUTC_r11 = new Asn1Integer (timeInfoUTC_r11_);
      dayLightSavingTime_r11 = dayLightSavingTime_r11_;
      leapSeconds_r11 = new Asn1Integer (leapSeconds_r11_);
      localTimeOffset_r11 = new Asn1Integer (localTimeOffset_r11_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SystemInformationBlockType16_r11_timeInfo_r11 (
      long timeInfoUTC_r11_
   ) {
      super();
      timeInfoUTC_r11 = new Asn1Integer (timeInfoUTC_r11_);
   }

   public void init () {
      timeInfoUTC_r11 = null;
      dayLightSavingTime_r11 = null;
      leapSeconds_r11 = null;
      localTimeOffset_r11 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return timeInfoUTC_r11;
         case 1: return dayLightSavingTime_r11;
         case 2: return leapSeconds_r11;
         case 3: return localTimeOffset_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "timeInfoUTC-r11";
         case 1: return "dayLightSavingTime-r11";
         case 2: return "leapSeconds-r11";
         case 3: return "localTimeOffset-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dayLightSavingTime_r11Present = buffer.decodeBit ("dayLightSavingTime_r11Present");
      boolean leapSeconds_r11Present = buffer.decodeBit ("leapSeconds_r11Present");
      boolean localTimeOffset_r11Present = buffer.decodeBit ("localTimeOffset_r11Present");

      // decode timeInfoUTC_r11

      buffer.getContext().eventDispatcher.startElement("timeInfoUTC_r11", -1);

      timeInfoUTC_r11 = new Asn1Integer();
      timeInfoUTC_r11.decode (buffer, 0, 549755813887L);

      buffer.invokeCharacters(timeInfoUTC_r11.toString());
      buffer.getContext().eventDispatcher.endElement("timeInfoUTC_r11", -1);

      // decode dayLightSavingTime_r11

      if (dayLightSavingTime_r11Present) {
         buffer.getContext().eventDispatcher.startElement("dayLightSavingTime_r11", -1);

         dayLightSavingTime_r11 = new Asn1BitString();
         dayLightSavingTime_r11.decode (buffer, 2, 2);

         buffer.invokeCharacters(dayLightSavingTime_r11.toString());
         buffer.getContext().eventDispatcher.endElement("dayLightSavingTime_r11", -1);
      }
      else {
         dayLightSavingTime_r11 = null;
      }

      // decode leapSeconds_r11

      if (leapSeconds_r11Present) {
         buffer.getContext().eventDispatcher.startElement("leapSeconds_r11", -1);

         leapSeconds_r11 = new Asn1Integer();
         leapSeconds_r11.decode (buffer, -127, 128);

         buffer.invokeCharacters(leapSeconds_r11.toString());
         buffer.getContext().eventDispatcher.endElement("leapSeconds_r11", -1);
      }
      else {
         leapSeconds_r11 = null;
      }

      // decode localTimeOffset_r11

      if (localTimeOffset_r11Present) {
         buffer.getContext().eventDispatcher.startElement("localTimeOffset_r11", -1);

         localTimeOffset_r11 = new Asn1Integer();
         localTimeOffset_r11.decode (buffer, -63, 64);

         buffer.invokeCharacters(localTimeOffset_r11.toString());
         buffer.getContext().eventDispatcher.endElement("localTimeOffset_r11", -1);
      }
      else {
         localTimeOffset_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (timeInfoUTC_r11 != null) timeInfoUTC_r11.print (_sb, "timeInfoUTC_r11", _level+1);
      if (dayLightSavingTime_r11 != null) dayLightSavingTime_r11.print (_sb, "dayLightSavingTime_r11", _level+1);
      if (leapSeconds_r11 != null) leapSeconds_r11.print (_sb, "leapSeconds_r11", _level+1);
      if (localTimeOffset_r11 != null) localTimeOffset_r11.print (_sb, "localTimeOffset_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
