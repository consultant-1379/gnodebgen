/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-Config";
   }

   public SRS_Config_srs_ResourceSetToReleaseList srs_ResourceSetToReleaseList;  // optional
   public SRS_Config_srs_ResourceSetToAddModList srs_ResourceSetToAddModList;  // optional
   public SRS_Config_srs_ResourceToReleaseList srs_ResourceToReleaseList;  // optional
   public SRS_Config_srs_ResourceToAddModList srs_ResourceToAddModList;  // optional
   public SRS_Config_tpc_Accumulation tpc_Accumulation = null;  // optional
   public boolean mV2ExtPresent;
   public Asn1Integer srs_RequestDCI_1_2_r16;  // optional
   public Asn1Integer srs_RequestDCI_0_2_r16;  // optional
   public SRS_Config_srs_ResourceSetToAddModListDCI_0_2_r16 srs_ResourceSetToAddModListDCI_0_2_r16;  // optional
   public SRS_Config_srs_ResourceSetToReleaseListDCI_0_2_r16 srs_ResourceSetToReleaseListDCI_0_2_r16;  // optional
   public SRS_Config_srs_PosResourceSetToReleaseList_r16 srs_PosResourceSetToReleaseList_r16;  // optional
   public SRS_Config_srs_PosResourceSetToAddModList_r16 srs_PosResourceSetToAddModList_r16;  // optional
   public SRS_Config_srs_PosResourceToReleaseList_r16 srs_PosResourceToReleaseList_r16;  // optional
   public SRS_Config_srs_PosResourceToAddModList_r16 srs_PosResourceToAddModList_r16;  // optional
   public Asn1OpenExt extElem1;

   public SRS_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_Config (
      SRS_Config_srs_ResourceSetToReleaseList srs_ResourceSetToReleaseList_,
      SRS_Config_srs_ResourceSetToAddModList srs_ResourceSetToAddModList_,
      SRS_Config_srs_ResourceToReleaseList srs_ResourceToReleaseList_,
      SRS_Config_srs_ResourceToAddModList srs_ResourceToAddModList_,
      SRS_Config_tpc_Accumulation tpc_Accumulation_,
      Asn1Integer srs_RequestDCI_1_2_r16_,
      Asn1Integer srs_RequestDCI_0_2_r16_,
      SRS_Config_srs_ResourceSetToAddModListDCI_0_2_r16 srs_ResourceSetToAddModListDCI_0_2_r16_,
      SRS_Config_srs_ResourceSetToReleaseListDCI_0_2_r16 srs_ResourceSetToReleaseListDCI_0_2_r16_,
      SRS_Config_srs_PosResourceSetToReleaseList_r16 srs_PosResourceSetToReleaseList_r16_,
      SRS_Config_srs_PosResourceSetToAddModList_r16 srs_PosResourceSetToAddModList_r16_,
      SRS_Config_srs_PosResourceToReleaseList_r16 srs_PosResourceToReleaseList_r16_,
      SRS_Config_srs_PosResourceToAddModList_r16 srs_PosResourceToAddModList_r16_
   ) {
      super();
      srs_ResourceSetToReleaseList = srs_ResourceSetToReleaseList_;
      srs_ResourceSetToAddModList = srs_ResourceSetToAddModList_;
      srs_ResourceToReleaseList = srs_ResourceToReleaseList_;
      srs_ResourceToAddModList = srs_ResourceToAddModList_;
      tpc_Accumulation = tpc_Accumulation_;
      srs_RequestDCI_1_2_r16 = srs_RequestDCI_1_2_r16_;
      srs_RequestDCI_0_2_r16 = srs_RequestDCI_0_2_r16_;
      srs_ResourceSetToAddModListDCI_0_2_r16 = srs_ResourceSetToAddModListDCI_0_2_r16_;
      srs_ResourceSetToReleaseListDCI_0_2_r16 = srs_ResourceSetToReleaseListDCI_0_2_r16_;
      srs_PosResourceSetToReleaseList_r16 = srs_PosResourceSetToReleaseList_r16_;
      srs_PosResourceSetToAddModList_r16 = srs_PosResourceSetToAddModList_r16_;
      srs_PosResourceToReleaseList_r16 = srs_PosResourceToReleaseList_r16_;
      srs_PosResourceToAddModList_r16 = srs_PosResourceToAddModList_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_Config (SRS_Config_srs_ResourceSetToReleaseList srs_ResourceSetToReleaseList_,
      SRS_Config_srs_ResourceSetToAddModList srs_ResourceSetToAddModList_,
      SRS_Config_srs_ResourceToReleaseList srs_ResourceToReleaseList_,
      SRS_Config_srs_ResourceToAddModList srs_ResourceToAddModList_,
      SRS_Config_tpc_Accumulation tpc_Accumulation_,
      long srs_RequestDCI_1_2_r16_,
      long srs_RequestDCI_0_2_r16_,
      SRS_Config_srs_ResourceSetToAddModListDCI_0_2_r16 srs_ResourceSetToAddModListDCI_0_2_r16_,
      SRS_Config_srs_ResourceSetToReleaseListDCI_0_2_r16 srs_ResourceSetToReleaseListDCI_0_2_r16_,
      SRS_Config_srs_PosResourceSetToReleaseList_r16 srs_PosResourceSetToReleaseList_r16_,
      SRS_Config_srs_PosResourceSetToAddModList_r16 srs_PosResourceSetToAddModList_r16_,
      SRS_Config_srs_PosResourceToReleaseList_r16 srs_PosResourceToReleaseList_r16_,
      SRS_Config_srs_PosResourceToAddModList_r16 srs_PosResourceToAddModList_r16_
   ) {
      super();
      srs_ResourceSetToReleaseList = srs_ResourceSetToReleaseList_;
      srs_ResourceSetToAddModList = srs_ResourceSetToAddModList_;
      srs_ResourceToReleaseList = srs_ResourceToReleaseList_;
      srs_ResourceToAddModList = srs_ResourceToAddModList_;
      tpc_Accumulation = tpc_Accumulation_;
      srs_RequestDCI_1_2_r16 = new Asn1Integer (srs_RequestDCI_1_2_r16_);
      srs_RequestDCI_0_2_r16 = new Asn1Integer (srs_RequestDCI_0_2_r16_);
      srs_ResourceSetToAddModListDCI_0_2_r16 = srs_ResourceSetToAddModListDCI_0_2_r16_;
      srs_ResourceSetToReleaseListDCI_0_2_r16 = srs_ResourceSetToReleaseListDCI_0_2_r16_;
      srs_PosResourceSetToReleaseList_r16 = srs_PosResourceSetToReleaseList_r16_;
      srs_PosResourceSetToAddModList_r16 = srs_PosResourceSetToAddModList_r16_;
      srs_PosResourceToReleaseList_r16 = srs_PosResourceToReleaseList_r16_;
      srs_PosResourceToAddModList_r16 = srs_PosResourceToAddModList_r16_;
   }

   public void init () {
      srs_ResourceSetToReleaseList = null;
      srs_ResourceSetToAddModList = null;
      srs_ResourceToReleaseList = null;
      srs_ResourceToAddModList = null;
      tpc_Accumulation = null;
      srs_RequestDCI_1_2_r16 = null;
      srs_RequestDCI_0_2_r16 = null;
      srs_ResourceSetToAddModListDCI_0_2_r16 = null;
      srs_ResourceSetToReleaseListDCI_0_2_r16 = null;
      srs_PosResourceSetToReleaseList_r16 = null;
      srs_PosResourceSetToAddModList_r16 = null;
      srs_PosResourceToReleaseList_r16 = null;
      srs_PosResourceToAddModList_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srs_ResourceSetToReleaseList;
         case 1: return srs_ResourceSetToAddModList;
         case 2: return srs_ResourceToReleaseList;
         case 3: return srs_ResourceToAddModList;
         case 4: return tpc_Accumulation;
         case 5: return srs_RequestDCI_1_2_r16;
         case 6: return srs_RequestDCI_0_2_r16;
         case 7: return srs_ResourceSetToAddModListDCI_0_2_r16;
         case 8: return srs_ResourceSetToReleaseListDCI_0_2_r16;
         case 9: return srs_PosResourceSetToReleaseList_r16;
         case 10: return srs_PosResourceSetToAddModList_r16;
         case 11: return srs_PosResourceToReleaseList_r16;
         case 12: return srs_PosResourceToAddModList_r16;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srs-ResourceSetToReleaseList";
         case 1: return "srs-ResourceSetToAddModList";
         case 2: return "srs-ResourceToReleaseList";
         case 3: return "srs-ResourceToAddModList";
         case 4: return "tpc-Accumulation";
         case 5: return "srs-RequestDCI-1-2-r16";
         case 6: return "srs-RequestDCI-0-2-r16";
         case 7: return "srs-ResourceSetToAddModListDCI-0-2-r16";
         case 8: return "srs-ResourceSetToReleaseListDCI-0-2-r16";
         case 9: return "srs-PosResourceSetToReleaseList-r16";
         case 10: return "srs-PosResourceSetToAddModList-r16";
         case 11: return "srs-PosResourceToReleaseList-r16";
         case 12: return "srs-PosResourceToAddModList-r16";
         case 13: return null;
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

      boolean srs_ResourceSetToReleaseListPresent = buffer.decodeBit ("srs_ResourceSetToReleaseListPresent");
      boolean srs_ResourceSetToAddModListPresent = buffer.decodeBit ("srs_ResourceSetToAddModListPresent");
      boolean srs_ResourceToReleaseListPresent = buffer.decodeBit ("srs_ResourceToReleaseListPresent");
      boolean srs_ResourceToAddModListPresent = buffer.decodeBit ("srs_ResourceToAddModListPresent");
      boolean tpc_AccumulationPresent = buffer.decodeBit ("tpc_AccumulationPresent");

      // decode srs_ResourceSetToReleaseList

      if (srs_ResourceSetToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToReleaseList", -1);

         srs_ResourceSetToReleaseList = new SRS_Config_srs_ResourceSetToReleaseList();
         srs_ResourceSetToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToReleaseList", -1);
      }
      else {
         srs_ResourceSetToReleaseList = null;
      }

      // decode srs_ResourceSetToAddModList

      if (srs_ResourceSetToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToAddModList", -1);

         srs_ResourceSetToAddModList = new SRS_Config_srs_ResourceSetToAddModList();
         srs_ResourceSetToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToAddModList", -1);
      }
      else {
         srs_ResourceSetToAddModList = null;
      }

      // decode srs_ResourceToReleaseList

      if (srs_ResourceToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceToReleaseList", -1);

         srs_ResourceToReleaseList = new SRS_Config_srs_ResourceToReleaseList();
         srs_ResourceToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_ResourceToReleaseList", -1);
      }
      else {
         srs_ResourceToReleaseList = null;
      }

      // decode srs_ResourceToAddModList

      if (srs_ResourceToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceToAddModList", -1);

         srs_ResourceToAddModList = new SRS_Config_srs_ResourceToAddModList();
         srs_ResourceToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_ResourceToAddModList", -1);
      }
      else {
         srs_ResourceToAddModList = null;
      }

      // decode tpc_Accumulation

      if (tpc_AccumulationPresent) {
         buffer.getContext().eventDispatcher.startElement("tpc_Accumulation", -1);

         int tval = SRS_Config_tpc_Accumulation.decodeEnumValue (buffer);
         tpc_Accumulation = SRS_Config_tpc_Accumulation.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tpc_Accumulation", -1);
      }
      else {
         tpc_Accumulation = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean srs_RequestDCI_1_2_r16Present = buffer.decodeBit ("srs_RequestDCI_1_2_r16Present");

            boolean srs_RequestDCI_0_2_r16Present = buffer.decodeBit ("srs_RequestDCI_0_2_r16Present");

            boolean srs_ResourceSetToAddModListDCI_0_2_r16Present = buffer.decodeBit ("srs_ResourceSetToAddModListDCI_0_2_r16Present");

            boolean srs_ResourceSetToReleaseListDCI_0_2_r16Present = buffer.decodeBit ("srs_ResourceSetToReleaseListDCI_0_2_r16Present");

            boolean srs_PosResourceSetToReleaseList_r16Present = buffer.decodeBit ("srs_PosResourceSetToReleaseList_r16Present");

            boolean srs_PosResourceSetToAddModList_r16Present = buffer.decodeBit ("srs_PosResourceSetToAddModList_r16Present");

            boolean srs_PosResourceToReleaseList_r16Present = buffer.decodeBit ("srs_PosResourceToReleaseList_r16Present");

            boolean srs_PosResourceToAddModList_r16Present = buffer.decodeBit ("srs_PosResourceToAddModList_r16Present");

            // decode srs_RequestDCI_1_2_r16

            if (srs_RequestDCI_1_2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_RequestDCI_1_2_r16", -1);

               srs_RequestDCI_1_2_r16 = new Asn1Integer();
               srs_RequestDCI_1_2_r16.decode (buffer, 1, 2);

               buffer.invokeCharacters(srs_RequestDCI_1_2_r16.toString());
               buffer.getContext().eventDispatcher.endElement("srs_RequestDCI_1_2_r16", -1);
            }
            else {
               srs_RequestDCI_1_2_r16 = null;
            }

            // decode srs_RequestDCI_0_2_r16

            if (srs_RequestDCI_0_2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_RequestDCI_0_2_r16", -1);

               srs_RequestDCI_0_2_r16 = new Asn1Integer();
               srs_RequestDCI_0_2_r16.decode (buffer, 1, 2);

               buffer.invokeCharacters(srs_RequestDCI_0_2_r16.toString());
               buffer.getContext().eventDispatcher.endElement("srs_RequestDCI_0_2_r16", -1);
            }
            else {
               srs_RequestDCI_0_2_r16 = null;
            }

            // decode srs_ResourceSetToAddModListDCI_0_2_r16

            if (srs_ResourceSetToAddModListDCI_0_2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToAddModListDCI_0_2_r16", -1);

               srs_ResourceSetToAddModListDCI_0_2_r16 = new SRS_Config_srs_ResourceSetToAddModListDCI_0_2_r16();
               srs_ResourceSetToAddModListDCI_0_2_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToAddModListDCI_0_2_r16", -1);
            }
            else {
               srs_ResourceSetToAddModListDCI_0_2_r16 = null;
            }

            // decode srs_ResourceSetToReleaseListDCI_0_2_r16

            if (srs_ResourceSetToReleaseListDCI_0_2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToReleaseListDCI_0_2_r16", -1);

               srs_ResourceSetToReleaseListDCI_0_2_r16 = new SRS_Config_srs_ResourceSetToReleaseListDCI_0_2_r16();
               srs_ResourceSetToReleaseListDCI_0_2_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToReleaseListDCI_0_2_r16", -1);
            }
            else {
               srs_ResourceSetToReleaseListDCI_0_2_r16 = null;
            }

            // decode srs_PosResourceSetToReleaseList_r16

            if (srs_PosResourceSetToReleaseList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_PosResourceSetToReleaseList_r16", -1);

               srs_PosResourceSetToReleaseList_r16 = new SRS_Config_srs_PosResourceSetToReleaseList_r16();
               srs_PosResourceSetToReleaseList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_PosResourceSetToReleaseList_r16", -1);
            }
            else {
               srs_PosResourceSetToReleaseList_r16 = null;
            }

            // decode srs_PosResourceSetToAddModList_r16

            if (srs_PosResourceSetToAddModList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_PosResourceSetToAddModList_r16", -1);

               srs_PosResourceSetToAddModList_r16 = new SRS_Config_srs_PosResourceSetToAddModList_r16();
               srs_PosResourceSetToAddModList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_PosResourceSetToAddModList_r16", -1);
            }
            else {
               srs_PosResourceSetToAddModList_r16 = null;
            }

            // decode srs_PosResourceToReleaseList_r16

            if (srs_PosResourceToReleaseList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_PosResourceToReleaseList_r16", -1);

               srs_PosResourceToReleaseList_r16 = new SRS_Config_srs_PosResourceToReleaseList_r16();
               srs_PosResourceToReleaseList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_PosResourceToReleaseList_r16", -1);
            }
            else {
               srs_PosResourceToReleaseList_r16 = null;
            }

            // decode srs_PosResourceToAddModList_r16

            if (srs_PosResourceToAddModList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("srs_PosResourceToAddModList_r16", -1);

               srs_PosResourceToAddModList_r16 = new SRS_Config_srs_PosResourceToAddModList_r16();
               srs_PosResourceToAddModList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("srs_PosResourceToAddModList_r16", -1);
            }
            else {
               srs_PosResourceToAddModList_r16 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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

      boolean extbit = (mV2ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((srs_ResourceSetToReleaseList != null), null);
      buffer.encodeBit ((srs_ResourceSetToAddModList != null), null);
      buffer.encodeBit ((srs_ResourceToReleaseList != null), null);
      buffer.encodeBit ((srs_ResourceToAddModList != null), null);
      buffer.encodeBit ((tpc_Accumulation != null), null);

      // encode srs_ResourceSetToReleaseList

      if (srs_ResourceSetToReleaseList != null) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToReleaseList", -1);

         srs_ResourceSetToReleaseList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToReleaseList", -1);
      }

      // encode srs_ResourceSetToAddModList

      if (srs_ResourceSetToAddModList != null) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceSetToAddModList", -1);

         srs_ResourceSetToAddModList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_ResourceSetToAddModList", -1);
      }

      // encode srs_ResourceToReleaseList

      if (srs_ResourceToReleaseList != null) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceToReleaseList", -1);

         srs_ResourceToReleaseList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_ResourceToReleaseList", -1);
      }

      // encode srs_ResourceToAddModList

      if (srs_ResourceToAddModList != null) {
         buffer.getContext().eventDispatcher.startElement("srs_ResourceToAddModList", -1);

         srs_ResourceToAddModList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_ResourceToAddModList", -1);
      }

      // encode tpc_Accumulation

      if (tpc_Accumulation != null) {
         buffer.getContext().eventDispatcher.startElement("tpc_Accumulation", -1);

         tpc_Accumulation.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tpc_Accumulation", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((srs_RequestDCI_1_2_r16 != null), "optbit");
            buffer.encodeBit ((srs_RequestDCI_0_2_r16 != null), "optbit");
            buffer.encodeBit ((srs_ResourceSetToAddModListDCI_0_2_r16 != null), "optbit");
            buffer.encodeBit ((srs_ResourceSetToReleaseListDCI_0_2_r16 != null), "optbit");
            buffer.encodeBit ((srs_PosResourceSetToReleaseList_r16 != null), "optbit");
            buffer.encodeBit ((srs_PosResourceSetToAddModList_r16 != null), "optbit");
            buffer.encodeBit ((srs_PosResourceToReleaseList_r16 != null), "optbit");
            buffer.encodeBit ((srs_PosResourceToAddModList_r16 != null), "optbit");
            if (srs_RequestDCI_1_2_r16 != null) {
               srs_RequestDCI_1_2_r16.encode (buffer, 1, 2);
            }
            if (srs_RequestDCI_0_2_r16 != null) {
               srs_RequestDCI_0_2_r16.encode (buffer, 1, 2);
            }
            if (srs_ResourceSetToAddModListDCI_0_2_r16 != null) {
               srs_ResourceSetToAddModListDCI_0_2_r16.encode (buffer);
            }
            if (srs_ResourceSetToReleaseListDCI_0_2_r16 != null) {
               srs_ResourceSetToReleaseListDCI_0_2_r16.encode (buffer);
            }
            if (srs_PosResourceSetToReleaseList_r16 != null) {
               srs_PosResourceSetToReleaseList_r16.encode (buffer);
            }
            if (srs_PosResourceSetToAddModList_r16 != null) {
               srs_PosResourceSetToAddModList_r16.encode (buffer);
            }
            if (srs_PosResourceToReleaseList_r16 != null) {
               srs_PosResourceToReleaseList_r16.encode (buffer);
            }
            if (srs_PosResourceToAddModList_r16 != null) {
               srs_PosResourceToAddModList_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (srs_ResourceSetToReleaseList != null) srs_ResourceSetToReleaseList.print (_sb, "srs_ResourceSetToReleaseList", _level+1);
      if (srs_ResourceSetToAddModList != null) srs_ResourceSetToAddModList.print (_sb, "srs_ResourceSetToAddModList", _level+1);
      if (srs_ResourceToReleaseList != null) srs_ResourceToReleaseList.print (_sb, "srs_ResourceToReleaseList", _level+1);
      if (srs_ResourceToAddModList != null) srs_ResourceToAddModList.print (_sb, "srs_ResourceToAddModList", _level+1);
      if (tpc_Accumulation != null) tpc_Accumulation.print (_sb, "tpc_Accumulation", _level+1);
      if (srs_RequestDCI_1_2_r16 != null) srs_RequestDCI_1_2_r16.print (_sb, "srs_RequestDCI_1_2_r16", _level+1);
      if (srs_RequestDCI_0_2_r16 != null) srs_RequestDCI_0_2_r16.print (_sb, "srs_RequestDCI_0_2_r16", _level+1);
      if (srs_ResourceSetToAddModListDCI_0_2_r16 != null) srs_ResourceSetToAddModListDCI_0_2_r16.print (_sb, "srs_ResourceSetToAddModListDCI_0_2_r16", _level+1);
      if (srs_ResourceSetToReleaseListDCI_0_2_r16 != null) srs_ResourceSetToReleaseListDCI_0_2_r16.print (_sb, "srs_ResourceSetToReleaseListDCI_0_2_r16", _level+1);
      if (srs_PosResourceSetToReleaseList_r16 != null) srs_PosResourceSetToReleaseList_r16.print (_sb, "srs_PosResourceSetToReleaseList_r16", _level+1);
      if (srs_PosResourceSetToAddModList_r16 != null) srs_PosResourceSetToAddModList_r16.print (_sb, "srs_PosResourceSetToAddModList_r16", _level+1);
      if (srs_PosResourceToReleaseList_r16 != null) srs_PosResourceToReleaseList_r16.print (_sb, "srs_PosResourceToReleaseList_r16", _level+1);
      if (srs_PosResourceToAddModList_r16 != null) srs_PosResourceToAddModList_r16.print (_sb, "srs_PosResourceToAddModList_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
