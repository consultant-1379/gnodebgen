/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NZP_CSI_RS_ResourceSet extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NZP-CSI-RS-ResourceSet";
   }

   public NZP_CSI_RS_ResourceSetId nzp_CSI_ResourceSetId;
   public NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources nzp_CSI_RS_Resources;
   public NZP_CSI_RS_ResourceSet_repetition repetition = null;  // optional
   public Asn1Integer aperiodicTriggeringOffset;  // optional
   public NZP_CSI_RS_ResourceSet_trs_Info trs_Info = null;  // optional
   public boolean mV2ExtPresent;
   public Asn1Integer aperiodicTriggeringOffset_r16;  // optional
   public Asn1OpenExt extElem1;

   public NZP_CSI_RS_ResourceSet () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NZP_CSI_RS_ResourceSet (
      NZP_CSI_RS_ResourceSetId nzp_CSI_ResourceSetId_,
      NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources nzp_CSI_RS_Resources_,
      NZP_CSI_RS_ResourceSet_repetition repetition_,
      Asn1Integer aperiodicTriggeringOffset_,
      NZP_CSI_RS_ResourceSet_trs_Info trs_Info_,
      Asn1Integer aperiodicTriggeringOffset_r16_
   ) {
      super();
      nzp_CSI_ResourceSetId = nzp_CSI_ResourceSetId_;
      nzp_CSI_RS_Resources = nzp_CSI_RS_Resources_;
      repetition = repetition_;
      aperiodicTriggeringOffset = aperiodicTriggeringOffset_;
      trs_Info = trs_Info_;
      aperiodicTriggeringOffset_r16 = aperiodicTriggeringOffset_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NZP_CSI_RS_ResourceSet (
      NZP_CSI_RS_ResourceSetId nzp_CSI_ResourceSetId_,
      NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources nzp_CSI_RS_Resources_
   ) {
      super();
      nzp_CSI_ResourceSetId = nzp_CSI_ResourceSetId_;
      nzp_CSI_RS_Resources = nzp_CSI_RS_Resources_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NZP_CSI_RS_ResourceSet (long nzp_CSI_ResourceSetId_,
      NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources nzp_CSI_RS_Resources_,
      NZP_CSI_RS_ResourceSet_repetition repetition_,
      long aperiodicTriggeringOffset_,
      NZP_CSI_RS_ResourceSet_trs_Info trs_Info_,
      long aperiodicTriggeringOffset_r16_
   ) {
      super();
      nzp_CSI_ResourceSetId = new NZP_CSI_RS_ResourceSetId (nzp_CSI_ResourceSetId_);
      nzp_CSI_RS_Resources = nzp_CSI_RS_Resources_;
      repetition = repetition_;
      aperiodicTriggeringOffset = new Asn1Integer (aperiodicTriggeringOffset_);
      trs_Info = trs_Info_;
      aperiodicTriggeringOffset_r16 = new Asn1Integer (aperiodicTriggeringOffset_r16_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public NZP_CSI_RS_ResourceSet (
      long nzp_CSI_ResourceSetId_,
      NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources nzp_CSI_RS_Resources_
   ) {
      super();
      nzp_CSI_ResourceSetId = new NZP_CSI_RS_ResourceSetId (nzp_CSI_ResourceSetId_);
      nzp_CSI_RS_Resources = nzp_CSI_RS_Resources_;
   }

   public void init () {
      nzp_CSI_ResourceSetId = null;
      nzp_CSI_RS_Resources = null;
      repetition = null;
      aperiodicTriggeringOffset = null;
      trs_Info = null;
      aperiodicTriggeringOffset_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nzp_CSI_ResourceSetId;
         case 1: return nzp_CSI_RS_Resources;
         case 2: return repetition;
         case 3: return aperiodicTriggeringOffset;
         case 4: return trs_Info;
         case 5: return aperiodicTriggeringOffset_r16;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nzp-CSI-ResourceSetId";
         case 1: return "nzp-CSI-RS-Resources";
         case 2: return "repetition";
         case 3: return "aperiodicTriggeringOffset";
         case 4: return "trs-Info";
         case 5: return "aperiodicTriggeringOffset-r16";
         case 6: return null;
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

      boolean repetitionPresent = buffer.decodeBit ("repetitionPresent");
      boolean aperiodicTriggeringOffsetPresent = buffer.decodeBit ("aperiodicTriggeringOffsetPresent");
      boolean trs_InfoPresent = buffer.decodeBit ("trs_InfoPresent");

      // decode nzp_CSI_ResourceSetId

      buffer.getContext().eventDispatcher.startElement("nzp_CSI_ResourceSetId", -1);

      nzp_CSI_ResourceSetId = new NZP_CSI_RS_ResourceSetId();
      nzp_CSI_ResourceSetId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nzp_CSI_ResourceSetId", -1);

      // decode nzp_CSI_RS_Resources

      buffer.getContext().eventDispatcher.startElement("nzp_CSI_RS_Resources", -1);

      nzp_CSI_RS_Resources = new NZP_CSI_RS_ResourceSet_nzp_CSI_RS_Resources();
      nzp_CSI_RS_Resources.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nzp_CSI_RS_Resources", -1);

      // decode repetition

      if (repetitionPresent) {
         buffer.getContext().eventDispatcher.startElement("repetition", -1);

         int tval = NZP_CSI_RS_ResourceSet_repetition.decodeEnumValue (buffer);
         repetition = NZP_CSI_RS_ResourceSet_repetition.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("repetition", -1);
      }
      else {
         repetition = null;
      }

      // decode aperiodicTriggeringOffset

      if (aperiodicTriggeringOffsetPresent) {
         buffer.getContext().eventDispatcher.startElement("aperiodicTriggeringOffset", -1);

         aperiodicTriggeringOffset = new Asn1Integer();
         aperiodicTriggeringOffset.decode (buffer, 0, 6);

         buffer.invokeCharacters(aperiodicTriggeringOffset.toString());
         buffer.getContext().eventDispatcher.endElement("aperiodicTriggeringOffset", -1);
      }
      else {
         aperiodicTriggeringOffset = null;
      }

      // decode trs_Info

      if (trs_InfoPresent) {
         buffer.getContext().eventDispatcher.startElement("trs_Info", -1);

         int tval = NZP_CSI_RS_ResourceSet_trs_Info.decodeEnumValue (buffer);
         trs_Info = NZP_CSI_RS_ResourceSet_trs_Info.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("trs_Info", -1);
      }
      else {
         trs_Info = null;
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

            boolean aperiodicTriggeringOffset_r16Present = buffer.decodeBit ("aperiodicTriggeringOffset_r16Present");

            // decode aperiodicTriggeringOffset_r16

            if (aperiodicTriggeringOffset_r16Present) {
               buffer.getContext().eventDispatcher.startElement("aperiodicTriggeringOffset_r16", -1);

               aperiodicTriggeringOffset_r16 = new Asn1Integer();
               aperiodicTriggeringOffset_r16.decode (buffer, 0, 31);

               buffer.invokeCharacters(aperiodicTriggeringOffset_r16.toString());
               buffer.getContext().eventDispatcher.endElement("aperiodicTriggeringOffset_r16", -1);
            }
            else {
               aperiodicTriggeringOffset_r16 = null;
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

      buffer.encodeBit ((repetition != null), null);
      buffer.encodeBit ((aperiodicTriggeringOffset != null), null);
      buffer.encodeBit ((trs_Info != null), null);

      // encode nzp_CSI_ResourceSetId

      if (nzp_CSI_ResourceSetId != null) {
         buffer.getContext().eventDispatcher.startElement("nzp_CSI_ResourceSetId", -1);

         nzp_CSI_ResourceSetId.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nzp_CSI_ResourceSetId", -1);
      }
      else throw new Asn1MissingRequiredException ("nzp_CSI_ResourceSetId");

      // encode nzp_CSI_RS_Resources

      if (nzp_CSI_RS_Resources != null) {
         buffer.getContext().eventDispatcher.startElement("nzp_CSI_RS_Resources", -1);

         nzp_CSI_RS_Resources.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nzp_CSI_RS_Resources", -1);
      }
      else throw new Asn1MissingRequiredException ("nzp_CSI_RS_Resources");

      // encode repetition

      if (repetition != null) {
         buffer.getContext().eventDispatcher.startElement("repetition", -1);

         repetition.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("repetition", -1);
      }

      // encode aperiodicTriggeringOffset

      if (aperiodicTriggeringOffset != null) {
         buffer.getContext().eventDispatcher.startElement("aperiodicTriggeringOffset", -1);

         aperiodicTriggeringOffset.encode (buffer, 0, 6);

         buffer.getContext().eventDispatcher.endElement("aperiodicTriggeringOffset", -1);
      }

      // encode trs_Info

      if (trs_Info != null) {
         buffer.getContext().eventDispatcher.startElement("trs_Info", -1);

         trs_Info.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("trs_Info", -1);
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
            buffer.encodeBit ((aperiodicTriggeringOffset_r16 != null), "optbit");
            if (aperiodicTriggeringOffset_r16 != null) {
               aperiodicTriggeringOffset_r16.encode (buffer, 0, 31);
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
      if (nzp_CSI_ResourceSetId != null) nzp_CSI_ResourceSetId.print (_sb, "nzp_CSI_ResourceSetId", _level+1);
      if (nzp_CSI_RS_Resources != null) nzp_CSI_RS_Resources.print (_sb, "nzp_CSI_RS_Resources", _level+1);
      if (repetition != null) repetition.print (_sb, "repetition", _level+1);
      if (aperiodicTriggeringOffset != null) aperiodicTriggeringOffset.print (_sb, "aperiodicTriggeringOffset", _level+1);
      if (trs_Info != null) trs_Info.print (_sb, "trs_Info", _level+1);
      if (aperiodicTriggeringOffset_r16 != null) aperiodicTriggeringOffset_r16.print (_sb, "aperiodicTriggeringOffset_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
