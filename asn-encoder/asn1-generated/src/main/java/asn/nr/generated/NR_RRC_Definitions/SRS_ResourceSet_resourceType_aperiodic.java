/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_ResourceSet_resourceType_aperiodic extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer aperiodicSRS_ResourceTrigger;
   public NZP_CSI_RS_ResourceId csi_RS;  // optional
   public Asn1Integer slotOffset;  // optional
   public boolean mV2ExtPresent;
   public SRS_ResourceSet_resourceType_aperiodic_aperiodicSRS_ResourceTriggerList aperiodicSRS_ResourceTriggerList;  // optional
   public Asn1OpenExt extElem1;

   public SRS_ResourceSet_resourceType_aperiodic () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_ResourceSet_resourceType_aperiodic (
      Asn1Integer aperiodicSRS_ResourceTrigger_,
      NZP_CSI_RS_ResourceId csi_RS_,
      Asn1Integer slotOffset_,
      SRS_ResourceSet_resourceType_aperiodic_aperiodicSRS_ResourceTriggerList aperiodicSRS_ResourceTriggerList_
   ) {
      super();
      aperiodicSRS_ResourceTrigger = aperiodicSRS_ResourceTrigger_;
      csi_RS = csi_RS_;
      slotOffset = slotOffset_;
      aperiodicSRS_ResourceTriggerList = aperiodicSRS_ResourceTriggerList_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SRS_ResourceSet_resourceType_aperiodic (
      Asn1Integer aperiodicSRS_ResourceTrigger_
   ) {
      super();
      aperiodicSRS_ResourceTrigger = aperiodicSRS_ResourceTrigger_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_ResourceSet_resourceType_aperiodic (long aperiodicSRS_ResourceTrigger_,
      long csi_RS_,
      long slotOffset_,
      SRS_ResourceSet_resourceType_aperiodic_aperiodicSRS_ResourceTriggerList aperiodicSRS_ResourceTriggerList_
   ) {
      super();
      aperiodicSRS_ResourceTrigger = new Asn1Integer (aperiodicSRS_ResourceTrigger_);
      csi_RS = new NZP_CSI_RS_ResourceId (csi_RS_);
      slotOffset = new Asn1Integer (slotOffset_);
      aperiodicSRS_ResourceTriggerList = aperiodicSRS_ResourceTriggerList_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SRS_ResourceSet_resourceType_aperiodic (
      long aperiodicSRS_ResourceTrigger_
   ) {
      super();
      aperiodicSRS_ResourceTrigger = new Asn1Integer (aperiodicSRS_ResourceTrigger_);
   }

   public void init () {
      aperiodicSRS_ResourceTrigger = null;
      csi_RS = null;
      slotOffset = null;
      aperiodicSRS_ResourceTriggerList = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return aperiodicSRS_ResourceTrigger;
         case 1: return csi_RS;
         case 2: return slotOffset;
         case 3: return aperiodicSRS_ResourceTriggerList;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "aperiodicSRS-ResourceTrigger";
         case 1: return "csi-RS";
         case 2: return "slotOffset";
         case 3: return "aperiodicSRS-ResourceTriggerList";
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

      boolean csi_RSPresent = buffer.decodeBit ("csi_RSPresent");
      boolean slotOffsetPresent = buffer.decodeBit ("slotOffsetPresent");

      // decode aperiodicSRS_ResourceTrigger

      buffer.getContext().eventDispatcher.startElement("aperiodicSRS_ResourceTrigger", -1);

      aperiodicSRS_ResourceTrigger = new Asn1Integer();
      aperiodicSRS_ResourceTrigger.decode (buffer, 1, 3);

      buffer.invokeCharacters(aperiodicSRS_ResourceTrigger.toString());
      buffer.getContext().eventDispatcher.endElement("aperiodicSRS_ResourceTrigger", -1);

      // decode csi_RS

      if (csi_RSPresent) {
         buffer.getContext().eventDispatcher.startElement("csi_RS", -1);

         csi_RS = new NZP_CSI_RS_ResourceId();
         csi_RS.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csi_RS", -1);
      }
      else {
         csi_RS = null;
      }

      // decode slotOffset

      if (slotOffsetPresent) {
         buffer.getContext().eventDispatcher.startElement("slotOffset", -1);

         slotOffset = new Asn1Integer();
         slotOffset.decode (buffer, 1, 32);

         buffer.invokeCharacters(slotOffset.toString());
         buffer.getContext().eventDispatcher.endElement("slotOffset", -1);
      }
      else {
         slotOffset = null;
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

            boolean aperiodicSRS_ResourceTriggerListPresent = buffer.decodeBit ("aperiodicSRS_ResourceTriggerListPresent");

            // decode aperiodicSRS_ResourceTriggerList

            if (aperiodicSRS_ResourceTriggerListPresent) {
               buffer.getContext().eventDispatcher.startElement("aperiodicSRS_ResourceTriggerList", -1);

               aperiodicSRS_ResourceTriggerList = new SRS_ResourceSet_resourceType_aperiodic_aperiodicSRS_ResourceTriggerList();
               aperiodicSRS_ResourceTriggerList.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("aperiodicSRS_ResourceTriggerList", -1);
            }
            else {
               aperiodicSRS_ResourceTriggerList = null;
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

      buffer.encodeBit ((csi_RS != null), null);
      buffer.encodeBit ((slotOffset != null), null);

      // encode aperiodicSRS_ResourceTrigger

      if (aperiodicSRS_ResourceTrigger != null) {
         buffer.getContext().eventDispatcher.startElement("aperiodicSRS_ResourceTrigger", -1);

         aperiodicSRS_ResourceTrigger.encode (buffer, 1, 3);

         buffer.getContext().eventDispatcher.endElement("aperiodicSRS_ResourceTrigger", -1);
      }
      else throw new Asn1MissingRequiredException ("aperiodicSRS_ResourceTrigger");

      // encode csi_RS

      if (csi_RS != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RS", -1);

         csi_RS.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RS", -1);
      }

      // encode slotOffset

      if (slotOffset != null) {
         buffer.getContext().eventDispatcher.startElement("slotOffset", -1);

         slotOffset.encode (buffer, 1, 32);

         buffer.getContext().eventDispatcher.endElement("slotOffset", -1);
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
            buffer.encodeBit ((aperiodicSRS_ResourceTriggerList != null), "optbit");
            if (aperiodicSRS_ResourceTriggerList != null) {
               aperiodicSRS_ResourceTriggerList.encode (buffer);
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
      if (aperiodicSRS_ResourceTrigger != null) aperiodicSRS_ResourceTrigger.print (_sb, "aperiodicSRS_ResourceTrigger", _level+1);
      if (csi_RS != null) csi_RS.print (_sb, "csi_RS", _level+1);
      if (slotOffset != null) slotOffset.print (_sb, "slotOffset", _level+1);
      if (aperiodicSRS_ResourceTriggerList != null) aperiodicSRS_ResourceTriggerList.print (_sb, "aperiodicSRS_ResourceTriggerList", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
