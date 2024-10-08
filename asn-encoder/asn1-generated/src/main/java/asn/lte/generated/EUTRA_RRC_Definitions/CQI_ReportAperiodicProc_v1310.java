/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportAperiodicProc_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CQI-ReportAperiodicProc-v1310";
   }

   public Asn1Boolean trigger001_r13;
   public Asn1Boolean trigger010_r13;
   public Asn1Boolean trigger011_r13;
   public Asn1Boolean trigger100_r13;
   public Asn1Boolean trigger101_r13;
   public Asn1Boolean trigger110_r13;
   public Asn1Boolean trigger111_r13;

   public CQI_ReportAperiodicProc_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportAperiodicProc_v1310 (
      Asn1Boolean trigger001_r13_,
      Asn1Boolean trigger010_r13_,
      Asn1Boolean trigger011_r13_,
      Asn1Boolean trigger100_r13_,
      Asn1Boolean trigger101_r13_,
      Asn1Boolean trigger110_r13_,
      Asn1Boolean trigger111_r13_
   ) {
      super();
      trigger001_r13 = trigger001_r13_;
      trigger010_r13 = trigger010_r13_;
      trigger011_r13 = trigger011_r13_;
      trigger100_r13 = trigger100_r13_;
      trigger101_r13 = trigger101_r13_;
      trigger110_r13 = trigger110_r13_;
      trigger111_r13 = trigger111_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CQI_ReportAperiodicProc_v1310 (boolean trigger001_r13_,
      boolean trigger010_r13_,
      boolean trigger011_r13_,
      boolean trigger100_r13_,
      boolean trigger101_r13_,
      boolean trigger110_r13_,
      boolean trigger111_r13_
   ) {
      super();
      trigger001_r13 = new Asn1Boolean (trigger001_r13_);
      trigger010_r13 = new Asn1Boolean (trigger010_r13_);
      trigger011_r13 = new Asn1Boolean (trigger011_r13_);
      trigger100_r13 = new Asn1Boolean (trigger100_r13_);
      trigger101_r13 = new Asn1Boolean (trigger101_r13_);
      trigger110_r13 = new Asn1Boolean (trigger110_r13_);
      trigger111_r13 = new Asn1Boolean (trigger111_r13_);
   }

   public void init () {
      trigger001_r13 = null;
      trigger010_r13 = null;
      trigger011_r13 = null;
      trigger100_r13 = null;
      trigger101_r13 = null;
      trigger110_r13 = null;
      trigger111_r13 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return trigger001_r13;
         case 1: return trigger010_r13;
         case 2: return trigger011_r13;
         case 3: return trigger100_r13;
         case 4: return trigger101_r13;
         case 5: return trigger110_r13;
         case 6: return trigger111_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "trigger001-r13";
         case 1: return "trigger010-r13";
         case 2: return "trigger011-r13";
         case 3: return "trigger100-r13";
         case 4: return "trigger101-r13";
         case 5: return "trigger110-r13";
         case 6: return "trigger111-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode trigger001_r13

      buffer.getContext().eventDispatcher.startElement("trigger001_r13", -1);

      trigger001_r13 = new Asn1Boolean();
      trigger001_r13.decode (buffer);

      buffer.invokeCharacters(trigger001_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger001_r13", -1);

      // decode trigger010_r13

      buffer.getContext().eventDispatcher.startElement("trigger010_r13", -1);

      trigger010_r13 = new Asn1Boolean();
      trigger010_r13.decode (buffer);

      buffer.invokeCharacters(trigger010_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger010_r13", -1);

      // decode trigger011_r13

      buffer.getContext().eventDispatcher.startElement("trigger011_r13", -1);

      trigger011_r13 = new Asn1Boolean();
      trigger011_r13.decode (buffer);

      buffer.invokeCharacters(trigger011_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger011_r13", -1);

      // decode trigger100_r13

      buffer.getContext().eventDispatcher.startElement("trigger100_r13", -1);

      trigger100_r13 = new Asn1Boolean();
      trigger100_r13.decode (buffer);

      buffer.invokeCharacters(trigger100_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger100_r13", -1);

      // decode trigger101_r13

      buffer.getContext().eventDispatcher.startElement("trigger101_r13", -1);

      trigger101_r13 = new Asn1Boolean();
      trigger101_r13.decode (buffer);

      buffer.invokeCharacters(trigger101_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger101_r13", -1);

      // decode trigger110_r13

      buffer.getContext().eventDispatcher.startElement("trigger110_r13", -1);

      trigger110_r13 = new Asn1Boolean();
      trigger110_r13.decode (buffer);

      buffer.invokeCharacters(trigger110_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger110_r13", -1);

      // decode trigger111_r13

      buffer.getContext().eventDispatcher.startElement("trigger111_r13", -1);

      trigger111_r13 = new Asn1Boolean();
      trigger111_r13.decode (buffer);

      buffer.invokeCharacters(trigger111_r13.toString());
      buffer.getContext().eventDispatcher.endElement("trigger111_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (trigger001_r13 != null) trigger001_r13.print (_sb, "trigger001_r13", _level+1);
      if (trigger010_r13 != null) trigger010_r13.print (_sb, "trigger010_r13", _level+1);
      if (trigger011_r13 != null) trigger011_r13.print (_sb, "trigger011_r13", _level+1);
      if (trigger100_r13 != null) trigger100_r13.print (_sb, "trigger100_r13", _level+1);
      if (trigger101_r13 != null) trigger101_r13.print (_sb, "trigger101_r13", _level+1);
      if (trigger110_r13 != null) trigger110_r13.print (_sb, "trigger110_r13", _level+1);
      if (trigger111_r13 != null) trigger111_r13.print (_sb, "trigger111_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
