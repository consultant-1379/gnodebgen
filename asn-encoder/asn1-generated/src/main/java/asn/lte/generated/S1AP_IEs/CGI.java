/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class CGI extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CGI";
   }

   public PLMNidentity pLMNidentity;
   public LAC lAC;
   public CI cI;
   public RAC rAC;  // optional
   public CGI_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public CGI () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CGI (
      PLMNidentity pLMNidentity_,
      LAC lAC_,
      CI cI_,
      RAC rAC_,
      CGI_iE_Extensions iE_Extensions_
   ) {
      super();
      pLMNidentity = pLMNidentity_;
      lAC = lAC_;
      cI = cI_;
      rAC = rAC_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CGI (
      PLMNidentity pLMNidentity_,
      LAC lAC_,
      CI cI_
   ) {
      super();
      pLMNidentity = pLMNidentity_;
      lAC = lAC_;
      cI = cI_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CGI (byte[] pLMNidentity_,
      byte[] lAC_,
      byte[] cI_,
      byte[] rAC_,
      CGI_iE_Extensions iE_Extensions_
   ) {
      super();
      pLMNidentity = new PLMNidentity (pLMNidentity_);
      lAC = new LAC (lAC_);
      cI = new CI (cI_);
      rAC = new RAC (rAC_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CGI (
      byte[] pLMNidentity_,
      byte[] lAC_,
      byte[] cI_
   ) {
      super();
      pLMNidentity = new PLMNidentity (pLMNidentity_);
      lAC = new LAC (lAC_);
      cI = new CI (cI_);
   }

   public void init () {
      pLMNidentity = null;
      lAC = null;
      cI = null;
      rAC = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pLMNidentity;
         case 1: return lAC;
         case 2: return cI;
         case 3: return rAC;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pLMNidentity";
         case 1: return "lAC";
         case 2: return "cI";
         case 3: return "rAC";
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

      boolean rACPresent = buffer.decodeBit ("rACPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode pLMNidentity

      buffer.getContext().eventDispatcher.startElement("pLMNidentity", -1);

      pLMNidentity = new PLMNidentity();
      pLMNidentity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pLMNidentity", -1);

      // decode lAC

      buffer.getContext().eventDispatcher.startElement("lAC", -1);

      lAC = new LAC();
      lAC.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("lAC", -1);

      // decode cI

      buffer.getContext().eventDispatcher.startElement("cI", -1);

      cI = new CI();
      cI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cI", -1);

      // decode rAC

      if (rACPresent) {
         buffer.getContext().eventDispatcher.startElement("rAC", -1);

         rAC = new RAC();
         rAC.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rAC", -1);
      }
      else {
         rAC = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new CGI_iE_Extensions();
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
      if (pLMNidentity != null) pLMNidentity.print (_sb, "pLMNidentity", _level+1);
      if (lAC != null) lAC.print (_sb, "lAC", _level+1);
      if (cI != null) cI.print (_sb, "cI", _level+1);
      if (rAC != null) rAC.print (_sb, "rAC", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
