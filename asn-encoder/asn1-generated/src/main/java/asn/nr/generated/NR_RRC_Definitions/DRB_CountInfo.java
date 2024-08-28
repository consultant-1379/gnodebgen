/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRB_CountInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DRB-CountInfo";
   }

   public DRB_Identity drb_Identity;
   public Asn1Integer count_Uplink;
   public Asn1Integer count_Downlink;

   public DRB_CountInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRB_CountInfo (
      DRB_Identity drb_Identity_,
      Asn1Integer count_Uplink_,
      Asn1Integer count_Downlink_
   ) {
      super();
      drb_Identity = drb_Identity_;
      count_Uplink = count_Uplink_;
      count_Downlink = count_Downlink_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DRB_CountInfo (long drb_Identity_,
      long count_Uplink_,
      long count_Downlink_
   ) {
      super();
      drb_Identity = new DRB_Identity (drb_Identity_);
      count_Uplink = new Asn1Integer (count_Uplink_);
      count_Downlink = new Asn1Integer (count_Downlink_);
   }

   public void init () {
      drb_Identity = null;
      count_Uplink = null;
      count_Downlink = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drb_Identity;
         case 1: return count_Uplink;
         case 2: return count_Downlink;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drb-Identity";
         case 1: return "count-Uplink";
         case 2: return "count-Downlink";
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

      // decode count_Uplink

      buffer.getContext().eventDispatcher.startElement("count_Uplink", -1);

      count_Uplink = new Asn1Integer();
      count_Uplink.decode (buffer, 0, 4294967295L);

      buffer.invokeCharacters(count_Uplink.toString());
      buffer.getContext().eventDispatcher.endElement("count_Uplink", -1);

      // decode count_Downlink

      buffer.getContext().eventDispatcher.startElement("count_Downlink", -1);

      count_Downlink = new Asn1Integer();
      count_Downlink.decode (buffer, 0, 4294967295L);

      buffer.invokeCharacters(count_Downlink.toString());
      buffer.getContext().eventDispatcher.endElement("count_Downlink", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode drb_Identity

      if (drb_Identity != null) {
         buffer.getContext().eventDispatcher.startElement("drb_Identity", -1);

         drb_Identity.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drb_Identity", -1);
      }
      else throw new Asn1MissingRequiredException ("drb_Identity");

      // encode count_Uplink

      if (count_Uplink != null) {
         buffer.getContext().eventDispatcher.startElement("count_Uplink", -1);

         count_Uplink.encode (buffer, 0, 4294967295L);

         buffer.getContext().eventDispatcher.endElement("count_Uplink", -1);
      }
      else throw new Asn1MissingRequiredException ("count_Uplink");

      // encode count_Downlink

      if (count_Downlink != null) {
         buffer.getContext().eventDispatcher.startElement("count_Downlink", -1);

         count_Downlink.encode (buffer, 0, 4294967295L);

         buffer.getContext().eventDispatcher.endElement("count_Downlink", -1);
      }
      else throw new Asn1MissingRequiredException ("count_Downlink");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (drb_Identity != null) drb_Identity.print (_sb, "drb_Identity", _level+1);
      if (count_Uplink != null) count_Uplink.print (_sb, "count_Uplink", _level+1);
      if (count_Downlink != null) count_Downlink.print (_sb, "count_Downlink", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
