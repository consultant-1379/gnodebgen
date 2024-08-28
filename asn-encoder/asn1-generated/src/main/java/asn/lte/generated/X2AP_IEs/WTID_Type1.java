/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class WTID_Type1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "WTID-Type1";
   }

   public PLMN_Identity pLMN_Identity;
   public Asn1BitString shortWTID;
   public Asn1OpenExt extElem1;

   public WTID_Type1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WTID_Type1 (
      PLMN_Identity pLMN_Identity_,
      Asn1BitString shortWTID_
   ) {
      super();
      pLMN_Identity = pLMN_Identity_;
      shortWTID = shortWTID_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WTID_Type1 (byte[] pLMN_Identity_,
      Asn1BitString shortWTID_
   ) {
      super();
      pLMN_Identity = new PLMN_Identity (pLMN_Identity_);
      shortWTID = shortWTID_;
   }

   public void init () {
      pLMN_Identity = null;
      shortWTID = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pLMN_Identity;
         case 1: return shortWTID;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pLMN-Identity";
         case 1: return "shortWTID";
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

      // decode pLMN_Identity

      buffer.getContext().eventDispatcher.startElement("pLMN_Identity", -1);

      pLMN_Identity = new PLMN_Identity();
      pLMN_Identity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pLMN_Identity", -1);

      // decode shortWTID

      buffer.getContext().eventDispatcher.startElement("shortWTID", -1);

      shortWTID = new Asn1BitString();
      shortWTID.decode (buffer, 24, 24);

      buffer.invokeCharacters(shortWTID.toString());
      buffer.getContext().eventDispatcher.endElement("shortWTID", -1);

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
      if (pLMN_Identity != null) pLMN_Identity.print (_sb, "pLMN_Identity", _level+1);
      if (shortWTID != null) shortWTID.print (_sb, "shortWTID", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
