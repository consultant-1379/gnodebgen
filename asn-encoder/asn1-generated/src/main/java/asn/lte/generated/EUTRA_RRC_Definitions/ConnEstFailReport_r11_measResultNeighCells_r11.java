/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ConnEstFailReport_r11_measResultNeighCells_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasResultList2EUTRA_r9 measResultListEUTRA_r11;  // optional
   public MeasResultList2UTRA_r9 measResultListUTRA_r11;  // optional
   public MeasResultListGERAN measResultListGERAN_r11;  // optional
   public MeasResultList2CDMA2000_r9 measResultsCDMA2000_r11;  // optional

   public ConnEstFailReport_r11_measResultNeighCells_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ConnEstFailReport_r11_measResultNeighCells_r11 (
      MeasResultList2EUTRA_r9 measResultListEUTRA_r11_,
      MeasResultList2UTRA_r9 measResultListUTRA_r11_,
      MeasResultListGERAN measResultListGERAN_r11_,
      MeasResultList2CDMA2000_r9 measResultsCDMA2000_r11_
   ) {
      super();
      measResultListEUTRA_r11 = measResultListEUTRA_r11_;
      measResultListUTRA_r11 = measResultListUTRA_r11_;
      measResultListGERAN_r11 = measResultListGERAN_r11_;
      measResultsCDMA2000_r11 = measResultsCDMA2000_r11_;
   }

   public void init () {
      measResultListEUTRA_r11 = null;
      measResultListUTRA_r11 = null;
      measResultListGERAN_r11 = null;
      measResultsCDMA2000_r11 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measResultListEUTRA_r11;
         case 1: return measResultListUTRA_r11;
         case 2: return measResultListGERAN_r11;
         case 3: return measResultsCDMA2000_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measResultListEUTRA-r11";
         case 1: return "measResultListUTRA-r11";
         case 2: return "measResultListGERAN-r11";
         case 3: return "measResultsCDMA2000-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measResultListEUTRA_r11Present = buffer.decodeBit ("measResultListEUTRA_r11Present");
      boolean measResultListUTRA_r11Present = buffer.decodeBit ("measResultListUTRA_r11Present");
      boolean measResultListGERAN_r11Present = buffer.decodeBit ("measResultListGERAN_r11Present");
      boolean measResultsCDMA2000_r11Present = buffer.decodeBit ("measResultsCDMA2000_r11Present");

      // decode measResultListEUTRA_r11

      if (measResultListEUTRA_r11Present) {
         buffer.getContext().eventDispatcher.startElement("measResultListEUTRA_r11", -1);

         measResultListEUTRA_r11 = new MeasResultList2EUTRA_r9();
         measResultListEUTRA_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultListEUTRA_r11", -1);
      }
      else {
         measResultListEUTRA_r11 = null;
      }

      // decode measResultListUTRA_r11

      if (measResultListUTRA_r11Present) {
         buffer.getContext().eventDispatcher.startElement("measResultListUTRA_r11", -1);

         measResultListUTRA_r11 = new MeasResultList2UTRA_r9();
         measResultListUTRA_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultListUTRA_r11", -1);
      }
      else {
         measResultListUTRA_r11 = null;
      }

      // decode measResultListGERAN_r11

      if (measResultListGERAN_r11Present) {
         buffer.getContext().eventDispatcher.startElement("measResultListGERAN_r11", -1);

         measResultListGERAN_r11 = new MeasResultListGERAN();
         measResultListGERAN_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultListGERAN_r11", -1);
      }
      else {
         measResultListGERAN_r11 = null;
      }

      // decode measResultsCDMA2000_r11

      if (measResultsCDMA2000_r11Present) {
         buffer.getContext().eventDispatcher.startElement("measResultsCDMA2000_r11", -1);

         measResultsCDMA2000_r11 = new MeasResultList2CDMA2000_r9();
         measResultsCDMA2000_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultsCDMA2000_r11", -1);
      }
      else {
         measResultsCDMA2000_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measResultListEUTRA_r11 != null) measResultListEUTRA_r11.print (_sb, "measResultListEUTRA_r11", _level+1);
      if (measResultListUTRA_r11 != null) measResultListUTRA_r11.print (_sb, "measResultListUTRA_r11", _level+1);
      if (measResultListGERAN_r11 != null) measResultListGERAN_r11.print (_sb, "measResultListGERAN_r11", _level+1);
      if (measResultsCDMA2000_r11 != null) measResultsCDMA2000_r11.print (_sb, "measResultsCDMA2000_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
