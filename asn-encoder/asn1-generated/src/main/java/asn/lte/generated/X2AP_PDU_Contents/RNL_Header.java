/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.GlobalENB_ID;

public class RNL_Header extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RNL-Header";
   }

   public GlobalENB_ID source_GlobalENB_ID;
   public GlobalENB_ID target_GlobalENB_ID;  // optional
   public RNL_Header_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public RNL_Header () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RNL_Header (
      GlobalENB_ID source_GlobalENB_ID_,
      GlobalENB_ID target_GlobalENB_ID_,
      RNL_Header_iE_Extensions iE_Extensions_
   ) {
      super();
      source_GlobalENB_ID = source_GlobalENB_ID_;
      target_GlobalENB_ID = target_GlobalENB_ID_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RNL_Header (
      GlobalENB_ID source_GlobalENB_ID_
   ) {
      super();
      source_GlobalENB_ID = source_GlobalENB_ID_;
   }

   public void init () {
      source_GlobalENB_ID = null;
      target_GlobalENB_ID = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return source_GlobalENB_ID;
         case 1: return target_GlobalENB_ID;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "source-GlobalENB-ID";
         case 1: return "target-GlobalENB-ID";
         case 2: return "iE-Extensions";
         case 3: return null;
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

      boolean target_GlobalENB_IDPresent = buffer.decodeBit ("target_GlobalENB_IDPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode source_GlobalENB_ID

      buffer.getContext().eventDispatcher.startElement("source_GlobalENB_ID", -1);

      source_GlobalENB_ID = new GlobalENB_ID();
      source_GlobalENB_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("source_GlobalENB_ID", -1);

      // decode target_GlobalENB_ID

      if (target_GlobalENB_IDPresent) {
         buffer.getContext().eventDispatcher.startElement("target_GlobalENB_ID", -1);

         target_GlobalENB_ID = new GlobalENB_ID();
         target_GlobalENB_ID.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("target_GlobalENB_ID", -1);
      }
      else {
         target_GlobalENB_ID = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new RNL_Header_iE_Extensions();
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
      if (source_GlobalENB_ID != null) source_GlobalENB_ID.print (_sb, "source_GlobalENB_ID", _level+1);
      if (target_GlobalENB_ID != null) target_GlobalENB_ID.print (_sb, "target_GlobalENB_ID", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
