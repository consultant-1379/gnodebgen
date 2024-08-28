/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_TimeDomainResourceAllocation_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDSCH-TimeDomainResourceAllocation-r16";
   }

   public Asn1Integer k0_r16;  // optional
   public PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16 mappingType_r16 = null;
   public Asn1Integer startSymbolAndLength_r16;
   public PDSCH_TimeDomainResourceAllocation_r16_repetitionNumber_r16 repetitionNumber_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public PDSCH_TimeDomainResourceAllocation_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDSCH_TimeDomainResourceAllocation_r16 (
      Asn1Integer k0_r16_,
      PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16 mappingType_r16_,
      Asn1Integer startSymbolAndLength_r16_,
      PDSCH_TimeDomainResourceAllocation_r16_repetitionNumber_r16 repetitionNumber_r16_
   ) {
      super();
      k0_r16 = k0_r16_;
      mappingType_r16 = mappingType_r16_;
      startSymbolAndLength_r16 = startSymbolAndLength_r16_;
      repetitionNumber_r16 = repetitionNumber_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PDSCH_TimeDomainResourceAllocation_r16 (
      PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16 mappingType_r16_,
      Asn1Integer startSymbolAndLength_r16_
   ) {
      super();
      mappingType_r16 = mappingType_r16_;
      startSymbolAndLength_r16 = startSymbolAndLength_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PDSCH_TimeDomainResourceAllocation_r16 (long k0_r16_,
      PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16 mappingType_r16_,
      long startSymbolAndLength_r16_,
      PDSCH_TimeDomainResourceAllocation_r16_repetitionNumber_r16 repetitionNumber_r16_
   ) {
      super();
      k0_r16 = new Asn1Integer (k0_r16_);
      mappingType_r16 = mappingType_r16_;
      startSymbolAndLength_r16 = new Asn1Integer (startSymbolAndLength_r16_);
      repetitionNumber_r16 = repetitionNumber_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PDSCH_TimeDomainResourceAllocation_r16 (
      PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16 mappingType_r16_,
      long startSymbolAndLength_r16_
   ) {
      super();
      mappingType_r16 = mappingType_r16_;
      startSymbolAndLength_r16 = new Asn1Integer (startSymbolAndLength_r16_);
   }

   public void init () {
      k0_r16 = null;
      mappingType_r16 = null;
      startSymbolAndLength_r16 = null;
      repetitionNumber_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return k0_r16;
         case 1: return mappingType_r16;
         case 2: return startSymbolAndLength_r16;
         case 3: return repetitionNumber_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "k0-r16";
         case 1: return "mappingType-r16";
         case 2: return "startSymbolAndLength-r16";
         case 3: return "repetitionNumber-r16";
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

      boolean k0_r16Present = buffer.decodeBit ("k0_r16Present");
      boolean repetitionNumber_r16Present = buffer.decodeBit ("repetitionNumber_r16Present");

      // decode k0_r16

      if (k0_r16Present) {
         buffer.getContext().eventDispatcher.startElement("k0_r16", -1);

         k0_r16 = new Asn1Integer();
         k0_r16.decode (buffer, 0, 32);

         buffer.invokeCharacters(k0_r16.toString());
         buffer.getContext().eventDispatcher.endElement("k0_r16", -1);
      }
      else {
         k0_r16 = null;
      }

      // decode mappingType_r16

      buffer.getContext().eventDispatcher.startElement("mappingType_r16", -1);

      {
         int tval = PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16.decodeEnumValue (buffer);
         mappingType_r16 = PDSCH_TimeDomainResourceAllocation_r16_mappingType_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mappingType_r16", -1);

      // decode startSymbolAndLength_r16

      buffer.getContext().eventDispatcher.startElement("startSymbolAndLength_r16", -1);

      startSymbolAndLength_r16 = new Asn1Integer();
      startSymbolAndLength_r16.decode (buffer, 0, 127);

      buffer.invokeCharacters(startSymbolAndLength_r16.toString());
      buffer.getContext().eventDispatcher.endElement("startSymbolAndLength_r16", -1);

      // decode repetitionNumber_r16

      if (repetitionNumber_r16Present) {
         buffer.getContext().eventDispatcher.startElement("repetitionNumber_r16", -1);

         int tval = PDSCH_TimeDomainResourceAllocation_r16_repetitionNumber_r16.decodeEnumValue (buffer);
         repetitionNumber_r16 = PDSCH_TimeDomainResourceAllocation_r16_repetitionNumber_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("repetitionNumber_r16", -1);
      }
      else {
         repetitionNumber_r16 = null;
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

      buffer.encodeBit ((k0_r16 != null), null);
      buffer.encodeBit ((repetitionNumber_r16 != null), null);

      // encode k0_r16

      if (k0_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("k0_r16", -1);

         k0_r16.encode (buffer, 0, 32);

         buffer.getContext().eventDispatcher.endElement("k0_r16", -1);
      }

      // encode mappingType_r16

      if (mappingType_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mappingType_r16", -1);

         mappingType_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mappingType_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("mappingType_r16");

      // encode startSymbolAndLength_r16

      if (startSymbolAndLength_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("startSymbolAndLength_r16", -1);

         startSymbolAndLength_r16.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("startSymbolAndLength_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("startSymbolAndLength_r16");

      // encode repetitionNumber_r16

      if (repetitionNumber_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("repetitionNumber_r16", -1);

         repetitionNumber_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("repetitionNumber_r16", -1);
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
      if (k0_r16 != null) k0_r16.print (_sb, "k0_r16", _level+1);
      if (mappingType_r16 != null) mappingType_r16.print (_sb, "mappingType_r16", _level+1);
      if (startSymbolAndLength_r16 != null) startSymbolAndLength_r16.print (_sb, "startSymbolAndLength_r16", _level+1);
      if (repetitionNumber_r16 != null) repetitionNumber_r16.print (_sb, "repetitionNumber_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
