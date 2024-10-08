/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRB_CountMSB_Info extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DRB-CountMSB-Info";
   }

   public DRB_Identity drb_Identity;
   public Asn1Integer countMSB_Uplink;
   public Asn1Integer countMSB_Downlink;

   public DRB_CountMSB_Info () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRB_CountMSB_Info (
      DRB_Identity drb_Identity_,
      Asn1Integer countMSB_Uplink_,
      Asn1Integer countMSB_Downlink_
   ) {
      super();
      drb_Identity = drb_Identity_;
      countMSB_Uplink = countMSB_Uplink_;
      countMSB_Downlink = countMSB_Downlink_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DRB_CountMSB_Info (long drb_Identity_,
      long countMSB_Uplink_,
      long countMSB_Downlink_
   ) {
      super();
      drb_Identity = new DRB_Identity (drb_Identity_);
      countMSB_Uplink = new Asn1Integer (countMSB_Uplink_);
      countMSB_Downlink = new Asn1Integer (countMSB_Downlink_);
   }

   public void init () {
      drb_Identity = null;
      countMSB_Uplink = null;
      countMSB_Downlink = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drb_Identity;
         case 1: return countMSB_Uplink;
         case 2: return countMSB_Downlink;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drb-Identity";
         case 1: return "countMSB-Uplink";
         case 2: return "countMSB-Downlink";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode drb_Identity

      buffer.getContext().eventDispatcher.startElement("drb_Identity", -1);

      drb_Identity = new DRB_Identity();
      drb_Identity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("drb_Identity", -1);

      // decode countMSB_Uplink

      buffer.getContext().eventDispatcher.startElement("countMSB_Uplink", -1);

      countMSB_Uplink = new Asn1Integer();
      countMSB_Uplink.decode (buffer, 0, 33554431);

      buffer.invokeCharacters(countMSB_Uplink.toString());
      buffer.getContext().eventDispatcher.endElement("countMSB_Uplink", -1);

      // decode countMSB_Downlink

      buffer.getContext().eventDispatcher.startElement("countMSB_Downlink", -1);

      countMSB_Downlink = new Asn1Integer();
      countMSB_Downlink.decode (buffer, 0, 33554431);

      buffer.invokeCharacters(countMSB_Downlink.toString());
      buffer.getContext().eventDispatcher.endElement("countMSB_Downlink", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (drb_Identity != null) drb_Identity.print (_sb, "drb_Identity", _level+1);
      if (countMSB_Uplink != null) countMSB_Uplink.print (_sb, "countMSB_Uplink", _level+1);
      if (countMSB_Downlink != null) countMSB_Downlink.print (_sb, "countMSB_Downlink", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
