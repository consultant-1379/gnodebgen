/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRB_ToAddMod extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRB-ToAddMod";
   }

   public SRB_Identity srb_Identity;
   public SRB_ToAddMod_reestablishPDCP reestablishPDCP = null;  // optional
   public SRB_ToAddMod_discardOnPDCP discardOnPDCP = null;  // optional
   public PDCP_Config pdcp_Config;  // optional
   public Asn1OpenExt extElem1;

   public SRB_ToAddMod () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRB_ToAddMod (
      SRB_Identity srb_Identity_,
      SRB_ToAddMod_reestablishPDCP reestablishPDCP_,
      SRB_ToAddMod_discardOnPDCP discardOnPDCP_,
      PDCP_Config pdcp_Config_
   ) {
      super();
      srb_Identity = srb_Identity_;
      reestablishPDCP = reestablishPDCP_;
      discardOnPDCP = discardOnPDCP_;
      pdcp_Config = pdcp_Config_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SRB_ToAddMod (
      SRB_Identity srb_Identity_
   ) {
      super();
      srb_Identity = srb_Identity_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRB_ToAddMod (long srb_Identity_,
      SRB_ToAddMod_reestablishPDCP reestablishPDCP_,
      SRB_ToAddMod_discardOnPDCP discardOnPDCP_,
      PDCP_Config pdcp_Config_
   ) {
      super();
      srb_Identity = new SRB_Identity (srb_Identity_);
      reestablishPDCP = reestablishPDCP_;
      discardOnPDCP = discardOnPDCP_;
      pdcp_Config = pdcp_Config_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SRB_ToAddMod (
      long srb_Identity_
   ) {
      super();
      srb_Identity = new SRB_Identity (srb_Identity_);
   }

   public void init () {
      srb_Identity = null;
      reestablishPDCP = null;
      discardOnPDCP = null;
      pdcp_Config = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srb_Identity;
         case 1: return reestablishPDCP;
         case 2: return discardOnPDCP;
         case 3: return pdcp_Config;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srb-Identity";
         case 1: return "reestablishPDCP";
         case 2: return "discardOnPDCP";
         case 3: return "pdcp-Config";
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

      boolean reestablishPDCPPresent = buffer.decodeBit ("reestablishPDCPPresent");
      boolean discardOnPDCPPresent = buffer.decodeBit ("discardOnPDCPPresent");
      boolean pdcp_ConfigPresent = buffer.decodeBit ("pdcp_ConfigPresent");

      // decode srb_Identity

      buffer.getContext().eventDispatcher.startElement("srb_Identity", -1);

      srb_Identity = new SRB_Identity();
      srb_Identity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("srb_Identity", -1);

      // decode reestablishPDCP

      if (reestablishPDCPPresent) {
         buffer.getContext().eventDispatcher.startElement("reestablishPDCP", -1);

         int tval = SRB_ToAddMod_reestablishPDCP.decodeEnumValue (buffer);
         reestablishPDCP = SRB_ToAddMod_reestablishPDCP.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reestablishPDCP", -1);
      }
      else {
         reestablishPDCP = null;
      }

      // decode discardOnPDCP

      if (discardOnPDCPPresent) {
         buffer.getContext().eventDispatcher.startElement("discardOnPDCP", -1);

         int tval = SRB_ToAddMod_discardOnPDCP.decodeEnumValue (buffer);
         discardOnPDCP = SRB_ToAddMod_discardOnPDCP.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("discardOnPDCP", -1);
      }
      else {
         discardOnPDCP = null;
      }

      // decode pdcp_Config

      if (pdcp_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_Config", -1);

         pdcp_Config = new PDCP_Config();
         pdcp_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcp_Config", -1);
      }
      else {
         pdcp_Config = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((reestablishPDCP != null), null);
      buffer.encodeBit ((discardOnPDCP != null), null);
      buffer.encodeBit ((pdcp_Config != null), null);

      // encode srb_Identity

      if (srb_Identity != null) {
         buffer.getContext().eventDispatcher.startElement("srb_Identity", -1);

         srb_Identity.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srb_Identity", -1);
      }
      else throw new Asn1MissingRequiredException ("srb_Identity");

      // encode reestablishPDCP

      if (reestablishPDCP != null) {
         buffer.getContext().eventDispatcher.startElement("reestablishPDCP", -1);

         reestablishPDCP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reestablishPDCP", -1);
      }

      // encode discardOnPDCP

      if (discardOnPDCP != null) {
         buffer.getContext().eventDispatcher.startElement("discardOnPDCP", -1);

         discardOnPDCP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("discardOnPDCP", -1);
      }

      // encode pdcp_Config

      if (pdcp_Config != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_Config", -1);

         pdcp_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_Config", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srb_Identity != null) srb_Identity.print (_sb, "srb_Identity", _level+1);
      if (reestablishPDCP != null) reestablishPDCP.print (_sb, "reestablishPDCP", _level+1);
      if (discardOnPDCP != null) discardOnPDCP.print (_sb, "discardOnPDCP", _level+1);
      if (pdcp_Config != null) pdcp_Config.print (_sb, "pdcp_Config", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
