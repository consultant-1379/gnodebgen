/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RAN_AreaConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RAN-AreaConfig";
   }

   public TrackingAreaCode trackingAreaCode;
   public RAN_AreaConfig_ran_AreaCodeList ran_AreaCodeList;  // optional

   public RAN_AreaConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RAN_AreaConfig (
      TrackingAreaCode trackingAreaCode_,
      RAN_AreaConfig_ran_AreaCodeList ran_AreaCodeList_
   ) {
      super();
      trackingAreaCode = trackingAreaCode_;
      ran_AreaCodeList = ran_AreaCodeList_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RAN_AreaConfig (
      TrackingAreaCode trackingAreaCode_
   ) {
      super();
      trackingAreaCode = trackingAreaCode_;
   }

   public void init () {
      trackingAreaCode = null;
      ran_AreaCodeList = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return trackingAreaCode;
         case 1: return ran_AreaCodeList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "trackingAreaCode";
         case 1: return "ran-AreaCodeList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ran_AreaCodeListPresent = buffer.decodeBit ("ran_AreaCodeListPresent");

      // decode trackingAreaCode

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode", -1);

      trackingAreaCode = new TrackingAreaCode();
      trackingAreaCode.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode", -1);

      // decode ran_AreaCodeList

      if (ran_AreaCodeListPresent) {
         buffer.getContext().eventDispatcher.startElement("ran_AreaCodeList", -1);

         ran_AreaCodeList = new RAN_AreaConfig_ran_AreaCodeList();
         ran_AreaCodeList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ran_AreaCodeList", -1);
      }
      else {
         ran_AreaCodeList = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((ran_AreaCodeList != null), null);

      // encode trackingAreaCode

      if (trackingAreaCode != null) {
         buffer.getContext().eventDispatcher.startElement("trackingAreaCode", -1);

         trackingAreaCode.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("trackingAreaCode", -1);
      }
      else throw new Asn1MissingRequiredException ("trackingAreaCode");

      // encode ran_AreaCodeList

      if (ran_AreaCodeList != null) {
         buffer.getContext().eventDispatcher.startElement("ran_AreaCodeList", -1);

         ran_AreaCodeList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ran_AreaCodeList", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (trackingAreaCode != null) trackingAreaCode.print (_sb, "trackingAreaCode", _level+1);
      if (ran_AreaCodeList != null) ran_AreaCodeList.print (_sb, "ran_AreaCodeList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
