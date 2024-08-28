/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_IEs.E_RAB_ID;

public class E_RABModifyItemBearerModRes extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "E-RABModifyItemBearerModRes";
   }

   public E_RAB_ID e_RAB_ID;
   public E_RABModifyItemBearerModRes_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public E_RABModifyItemBearerModRes () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public E_RABModifyItemBearerModRes (
      E_RAB_ID e_RAB_ID_,
      E_RABModifyItemBearerModRes_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_ID = e_RAB_ID_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public E_RABModifyItemBearerModRes (
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
   public E_RABModifyItemBearerModRes (long e_RAB_ID_,
      E_RABModifyItemBearerModRes_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_ID = new E_RAB_ID (e_RAB_ID_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public E_RABModifyItemBearerModRes (
      long e_RAB_ID_
   ) {
      super();
      e_RAB_ID = new E_RAB_ID (e_RAB_ID_);
   }

   public void init () {
      e_RAB_ID = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return e_RAB_ID;
         case 1: return iE_Extensions;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "e-RAB-ID";
         case 1: return "iE-Extensions";
         case 2: return null;
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode e_RAB_ID

      buffer.getContext().eventDispatcher.startElement("e_RAB_ID", -1);

      e_RAB_ID = new E_RAB_ID();
      e_RAB_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_ID", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new E_RABModifyItemBearerModRes_iE_Extensions();
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
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
