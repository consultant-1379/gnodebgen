/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class GBR_QosInformation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "GBR-QosInformation";
   }

   public BitRate e_RAB_MaximumBitrateDL;
   public BitRate e_RAB_MaximumBitrateUL;
   public BitRate e_RAB_GuaranteedBitrateDL;
   public BitRate e_RAB_GuaranteedBitrateUL;
   public GBR_QosInformation_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public GBR_QosInformation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public GBR_QosInformation (
      BitRate e_RAB_MaximumBitrateDL_,
      BitRate e_RAB_MaximumBitrateUL_,
      BitRate e_RAB_GuaranteedBitrateDL_,
      BitRate e_RAB_GuaranteedBitrateUL_,
      GBR_QosInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_MaximumBitrateDL = e_RAB_MaximumBitrateDL_;
      e_RAB_MaximumBitrateUL = e_RAB_MaximumBitrateUL_;
      e_RAB_GuaranteedBitrateDL = e_RAB_GuaranteedBitrateDL_;
      e_RAB_GuaranteedBitrateUL = e_RAB_GuaranteedBitrateUL_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public GBR_QosInformation (
      BitRate e_RAB_MaximumBitrateDL_,
      BitRate e_RAB_MaximumBitrateUL_,
      BitRate e_RAB_GuaranteedBitrateDL_,
      BitRate e_RAB_GuaranteedBitrateUL_
   ) {
      super();
      e_RAB_MaximumBitrateDL = e_RAB_MaximumBitrateDL_;
      e_RAB_MaximumBitrateUL = e_RAB_MaximumBitrateUL_;
      e_RAB_GuaranteedBitrateDL = e_RAB_GuaranteedBitrateDL_;
      e_RAB_GuaranteedBitrateUL = e_RAB_GuaranteedBitrateUL_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public GBR_QosInformation (long e_RAB_MaximumBitrateDL_,
      long e_RAB_MaximumBitrateUL_,
      long e_RAB_GuaranteedBitrateDL_,
      long e_RAB_GuaranteedBitrateUL_,
      GBR_QosInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      e_RAB_MaximumBitrateDL = new BitRate (e_RAB_MaximumBitrateDL_);
      e_RAB_MaximumBitrateUL = new BitRate (e_RAB_MaximumBitrateUL_);
      e_RAB_GuaranteedBitrateDL = new BitRate (e_RAB_GuaranteedBitrateDL_);
      e_RAB_GuaranteedBitrateUL = new BitRate (e_RAB_GuaranteedBitrateUL_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public GBR_QosInformation (
      long e_RAB_MaximumBitrateDL_,
      long e_RAB_MaximumBitrateUL_,
      long e_RAB_GuaranteedBitrateDL_,
      long e_RAB_GuaranteedBitrateUL_
   ) {
      super();
      e_RAB_MaximumBitrateDL = new BitRate (e_RAB_MaximumBitrateDL_);
      e_RAB_MaximumBitrateUL = new BitRate (e_RAB_MaximumBitrateUL_);
      e_RAB_GuaranteedBitrateDL = new BitRate (e_RAB_GuaranteedBitrateDL_);
      e_RAB_GuaranteedBitrateUL = new BitRate (e_RAB_GuaranteedBitrateUL_);
   }

   public void init () {
      e_RAB_MaximumBitrateDL = null;
      e_RAB_MaximumBitrateUL = null;
      e_RAB_GuaranteedBitrateDL = null;
      e_RAB_GuaranteedBitrateUL = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return e_RAB_MaximumBitrateDL;
         case 1: return e_RAB_MaximumBitrateUL;
         case 2: return e_RAB_GuaranteedBitrateDL;
         case 3: return e_RAB_GuaranteedBitrateUL;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "e-RAB-MaximumBitrateDL";
         case 1: return "e-RAB-MaximumBitrateUL";
         case 2: return "e-RAB-GuaranteedBitrateDL";
         case 3: return "e-RAB-GuaranteedBitrateUL";
         case 4: return "iE-Extensions";
         case 5: return null;
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

      // decode e_RAB_MaximumBitrateDL

      buffer.getContext().eventDispatcher.startElement("e_RAB_MaximumBitrateDL", -1);

      e_RAB_MaximumBitrateDL = new BitRate();
      e_RAB_MaximumBitrateDL.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_MaximumBitrateDL", -1);

      // decode e_RAB_MaximumBitrateUL

      buffer.getContext().eventDispatcher.startElement("e_RAB_MaximumBitrateUL", -1);

      e_RAB_MaximumBitrateUL = new BitRate();
      e_RAB_MaximumBitrateUL.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_MaximumBitrateUL", -1);

      // decode e_RAB_GuaranteedBitrateDL

      buffer.getContext().eventDispatcher.startElement("e_RAB_GuaranteedBitrateDL", -1);

      e_RAB_GuaranteedBitrateDL = new BitRate();
      e_RAB_GuaranteedBitrateDL.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_GuaranteedBitrateDL", -1);

      // decode e_RAB_GuaranteedBitrateUL

      buffer.getContext().eventDispatcher.startElement("e_RAB_GuaranteedBitrateUL", -1);

      e_RAB_GuaranteedBitrateUL = new BitRate();
      e_RAB_GuaranteedBitrateUL.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("e_RAB_GuaranteedBitrateUL", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new GBR_QosInformation_iE_Extensions();
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
      if (e_RAB_MaximumBitrateDL != null) e_RAB_MaximumBitrateDL.print (_sb, "e_RAB_MaximumBitrateDL", _level+1);
      if (e_RAB_MaximumBitrateUL != null) e_RAB_MaximumBitrateUL.print (_sb, "e_RAB_MaximumBitrateUL", _level+1);
      if (e_RAB_GuaranteedBitrateDL != null) e_RAB_GuaranteedBitrateDL.print (_sb, "e_RAB_GuaranteedBitrateDL", _level+1);
      if (e_RAB_GuaranteedBitrateUL != null) e_RAB_GuaranteedBitrateUL.print (_sb, "e_RAB_GuaranteedBitrateUL", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
