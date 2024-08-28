/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PosSIB_ReqInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PosSIB-ReqInfo-r16";
   }

   public GNSS_ID_r16 gnss_id_r16;  // optional
   public SBAS_ID_r16 sbas_id_r16;  // optional
   public PosSIB_ReqInfo_r16_posSibType_r16 posSibType_r16 = null;

   public PosSIB_ReqInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PosSIB_ReqInfo_r16 (
      GNSS_ID_r16 gnss_id_r16_,
      SBAS_ID_r16 sbas_id_r16_,
      PosSIB_ReqInfo_r16_posSibType_r16 posSibType_r16_
   ) {
      super();
      gnss_id_r16 = gnss_id_r16_;
      sbas_id_r16 = sbas_id_r16_;
      posSibType_r16 = posSibType_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PosSIB_ReqInfo_r16 (
      PosSIB_ReqInfo_r16_posSibType_r16 posSibType_r16_
   ) {
      super();
      posSibType_r16 = posSibType_r16_;
   }

   public void init () {
      gnss_id_r16 = null;
      sbas_id_r16 = null;
      posSibType_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gnss_id_r16;
         case 1: return sbas_id_r16;
         case 2: return posSibType_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gnss-id-r16";
         case 1: return "sbas-id-r16";
         case 2: return "posSibType-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean gnss_id_r16Present = buffer.decodeBit ("gnss_id_r16Present");
      boolean sbas_id_r16Present = buffer.decodeBit ("sbas_id_r16Present");

      // decode gnss_id_r16

      if (gnss_id_r16Present) {
         buffer.getContext().eventDispatcher.startElement("gnss_id_r16", -1);

         gnss_id_r16 = new GNSS_ID_r16();
         gnss_id_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("gnss_id_r16", -1);
      }
      else {
         gnss_id_r16 = null;
      }

      // decode sbas_id_r16

      if (sbas_id_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sbas_id_r16", -1);

         sbas_id_r16 = new SBAS_ID_r16();
         sbas_id_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sbas_id_r16", -1);
      }
      else {
         sbas_id_r16 = null;
      }

      // decode posSibType_r16

      buffer.getContext().eventDispatcher.startElement("posSibType_r16", -1);

      {
         int tval = PosSIB_ReqInfo_r16_posSibType_r16.decodeEnumValue (buffer);
         posSibType_r16 = PosSIB_ReqInfo_r16_posSibType_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("posSibType_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((gnss_id_r16 != null), null);
      buffer.encodeBit ((sbas_id_r16 != null), null);

      // encode gnss_id_r16

      if (gnss_id_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("gnss_id_r16", -1);

         gnss_id_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("gnss_id_r16", -1);
      }

      // encode sbas_id_r16

      if (sbas_id_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sbas_id_r16", -1);

         sbas_id_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sbas_id_r16", -1);
      }

      // encode posSibType_r16

      if (posSibType_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("posSibType_r16", -1);

         posSibType_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("posSibType_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("posSibType_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (gnss_id_r16 != null) gnss_id_r16.print (_sb, "gnss_id_r16", _level+1);
      if (sbas_id_r16 != null) sbas_id_r16.print (_sb, "sbas_id_r16", _level+1);
      if (posSibType_r16 != null) posSibType_r16.print (_sb, "posSibType_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
