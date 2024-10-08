/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportQuantityNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportQuantityNR-r15";
   }

   public Asn1Boolean ss_rsrp;
   public Asn1Boolean ss_rsrq;
   public Asn1Boolean ss_sinr;

   public ReportQuantityNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportQuantityNR_r15 (
      Asn1Boolean ss_rsrp_,
      Asn1Boolean ss_rsrq_,
      Asn1Boolean ss_sinr_
   ) {
      super();
      ss_rsrp = ss_rsrp_;
      ss_rsrq = ss_rsrq_;
      ss_sinr = ss_sinr_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportQuantityNR_r15 (boolean ss_rsrp_,
      boolean ss_rsrq_,
      boolean ss_sinr_
   ) {
      super();
      ss_rsrp = new Asn1Boolean (ss_rsrp_);
      ss_rsrq = new Asn1Boolean (ss_rsrq_);
      ss_sinr = new Asn1Boolean (ss_sinr_);
   }

   public void init () {
      ss_rsrp = null;
      ss_rsrq = null;
      ss_sinr = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ss_rsrp;
         case 1: return ss_rsrq;
         case 2: return ss_sinr;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ss-rsrp";
         case 1: return "ss-rsrq";
         case 2: return "ss-sinr";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ss_rsrp

      buffer.getContext().eventDispatcher.startElement("ss_rsrp", -1);

      ss_rsrp = new Asn1Boolean();
      ss_rsrp.decode (buffer);

      buffer.invokeCharacters(ss_rsrp.toString());
      buffer.getContext().eventDispatcher.endElement("ss_rsrp", -1);

      // decode ss_rsrq

      buffer.getContext().eventDispatcher.startElement("ss_rsrq", -1);

      ss_rsrq = new Asn1Boolean();
      ss_rsrq.decode (buffer);

      buffer.invokeCharacters(ss_rsrq.toString());
      buffer.getContext().eventDispatcher.endElement("ss_rsrq", -1);

      // decode ss_sinr

      buffer.getContext().eventDispatcher.startElement("ss_sinr", -1);

      ss_sinr = new Asn1Boolean();
      ss_sinr.decode (buffer);

      buffer.invokeCharacters(ss_sinr.toString());
      buffer.getContext().eventDispatcher.endElement("ss_sinr", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ss_rsrp != null) ss_rsrp.print (_sb, "ss_rsrp", _level+1);
      if (ss_rsrq != null) ss_rsrq.print (_sb, "ss_rsrq", _level+1);
      if (ss_sinr != null) ss_sinr.print (_sb, "ss_sinr", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
