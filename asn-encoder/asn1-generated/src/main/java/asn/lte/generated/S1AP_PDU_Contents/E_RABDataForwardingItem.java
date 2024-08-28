/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_IEs.E_RAB_ID;
import asn.lte.generated.S1AP_IEs.TransportLayerAddress;
import asn.lte.generated.S1AP_IEs.GTP_TEID;

public class E_RABDataForwardingItem extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "E-RABDataForwardingItem";
   }

   public E_RAB_ID e_RAB_ID;
   public TransportLayerAddress dL_transportLayerAddress;  // optional
   public GTP_TEID dL_gTP_TEID;  // optional
   public TransportLayerAddress uL_TransportLayerAddress;  // optional
   public GTP_TEID uL_GTP_TEID;  // optional
   public E_RABDataForwardingItem_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public E_RABDataForwardingItem () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public E_RABDataForwardingItem (
      E_RAB_ID e_RAB_ID_,
      TransportLayerAddress dL_transportLayerAddress_,
      GTP_TEID dL_gTP_TEID_,
      TransportLayerAddress uL_TransportLayerAddress_,
      GTP_TEID uL_GTP_TEID_,
      E_RABDataForwardingItem_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_ID = e_RAB_ID_;
      dL_transportLayerAddress = dL_transportLayerAddress_;
      dL_gTP_TEID = dL_gTP_TEID_;
      uL_TransportLayerAddress = uL_TransportLayerAddress_;
      uL_GTP_TEID = uL_GTP_TEID_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public E_RABDataForwardingItem (
      E_RAB_ID e_RAB_ID_
   ) {
      super();
      e_RAB_ID = e_RAB_ID_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public E_RABDataForwardingItem (long e_RAB_ID_,
      TransportLayerAddress dL_transportLayerAddress_,
      byte[] dL_gTP_TEID_,
      TransportLayerAddress uL_TransportLayerAddress_,
      byte[] uL_GTP_TEID_,
      E_RABDataForwardingItem_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_ID = new E_RAB_ID (e_RAB_ID_);
      dL_transportLayerAddress = dL_transportLayerAddress_;
      dL_gTP_TEID = new GTP_TEID (dL_gTP_TEID_);
      uL_TransportLayerAddress = uL_TransportLayerAddress_;
      uL_GTP_TEID = new GTP_TEID (uL_GTP_TEID_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public E_RABDataForwardingItem (
      long e_RAB_ID_
   ) {
      super();
      e_RAB_ID = new E_RAB_ID (e_RAB_ID_);
   }

   public void init () {
      e_RAB_ID = null;
      dL_transportLayerAddress = null;
      dL_gTP_TEID = null;
      uL_TransportLayerAddress = null;
      uL_GTP_TEID = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return e_RAB_ID;
         case 1: return dL_transportLayerAddress;
         case 2: return dL_gTP_TEID;
         case 3: return uL_TransportLayerAddress;
         case 4: return uL_GTP_TEID;
         case 5: return iE_Extensions;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "e-RAB-ID";
         case 1: return "dL-transportLayerAddress";
         case 2: return "dL-gTP-TEID";
         case 3: return "uL-TransportLayerAddress";
         case 4: return "uL-GTP-TEID";
         case 5: return "iE-Extensions";
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

      boolean dL_transportLayerAddressPresent = buffer.decodeBit ("dL_transportLayerAddressPresent");
      boolean dL_gTP_TEIDPresent = buffer.decodeBit ("dL_gTP_TEIDPresent");
      boolean uL_TransportLayerAddressPresent = buffer.decodeBit ("uL_TransportLayerAddressPresent");
      boolean uL_GTP_TEIDPresent = buffer.decodeBit ("uL_GTP_TEIDPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode e_RAB_ID

      buffer.getContext().eventDispatcher.startElement("e_RAB_ID", -1);

      e_RAB_ID = new E_RAB_ID();
      e_RAB_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_ID", -1);

      // decode dL_transportLayerAddress

      if (dL_transportLayerAddressPresent) {
         buffer.getContext().eventDispatcher.startElement("dL_transportLayerAddress", -1);

         dL_transportLayerAddress = new TransportLayerAddress();
         dL_transportLayerAddress.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dL_transportLayerAddress", -1);
      }
      else {
         dL_transportLayerAddress = null;
      }

      // decode dL_gTP_TEID

      if (dL_gTP_TEIDPresent) {
         buffer.getContext().eventDispatcher.startElement("dL_gTP_TEID", -1);

         dL_gTP_TEID = new GTP_TEID();
         dL_gTP_TEID.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dL_gTP_TEID", -1);
      }
      else {
         dL_gTP_TEID = null;
      }

      // decode uL_TransportLayerAddress

      if (uL_TransportLayerAddressPresent) {
         buffer.getContext().eventDispatcher.startElement("uL_TransportLayerAddress", -1);

         uL_TransportLayerAddress = new TransportLayerAddress();
         uL_TransportLayerAddress.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uL_TransportLayerAddress", -1);
      }
      else {
         uL_TransportLayerAddress = null;
      }

      // decode uL_GTP_TEID

      if (uL_GTP_TEIDPresent) {
         buffer.getContext().eventDispatcher.startElement("uL_GTP_TEID", -1);

         uL_GTP_TEID = new GTP_TEID();
         uL_GTP_TEID.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uL_GTP_TEID", -1);
      }
      else {
         uL_GTP_TEID = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new E_RABDataForwardingItem_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
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

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (e_RAB_ID != null) e_RAB_ID.print (_sb, "e_RAB_ID", _level+1);
      if (dL_transportLayerAddress != null) dL_transportLayerAddress.print (_sb, "dL_transportLayerAddress", _level+1);
      if (dL_gTP_TEID != null) dL_gTP_TEID.print (_sb, "dL_gTP_TEID", _level+1);
      if (uL_TransportLayerAddress != null) uL_TransportLayerAddress.print (_sb, "uL_TransportLayerAddress", _level+1);
      if (uL_GTP_TEID != null) uL_GTP_TEID.print (_sb, "uL_GTP_TEID", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
