/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SubbandCQI extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SubbandCQI";
   }

   public SubbandCQICodeword0 subbandCQICodeword0;
   public SubbandCQICodeword1 subbandCQICodeword1;  // optional
   public SubbandCQI_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public SubbandCQI () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SubbandCQI (
      SubbandCQICodeword0 subbandCQICodeword0_,
      SubbandCQICodeword1 subbandCQICodeword1_,
      SubbandCQI_iE_Extensions iE_Extensions_
   ) {
      super();
      subbandCQICodeword0 = subbandCQICodeword0_;
      subbandCQICodeword1 = subbandCQICodeword1_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SubbandCQI (
      SubbandCQICodeword0 subbandCQICodeword0_
   ) {
      super();
      subbandCQICodeword0 = subbandCQICodeword0_;
   }

   public void init () {
      subbandCQICodeword0 = null;
      subbandCQICodeword1 = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return subbandCQICodeword0;
         case 1: return subbandCQICodeword1;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "subbandCQICodeword0";
         case 1: return "subbandCQICodeword1";
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

      boolean subbandCQICodeword1Present = buffer.decodeBit ("subbandCQICodeword1Present");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode subbandCQICodeword0

      buffer.getContext().eventDispatcher.startElement("subbandCQICodeword0", -1);

      subbandCQICodeword0 = new SubbandCQICodeword0();
      subbandCQICodeword0.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("subbandCQICodeword0", -1);

      // decode subbandCQICodeword1

      if (subbandCQICodeword1Present) {
         buffer.getContext().eventDispatcher.startElement("subbandCQICodeword1", -1);

         subbandCQICodeword1 = new SubbandCQICodeword1();
         subbandCQICodeword1.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("subbandCQICodeword1", -1);
      }
      else {
         subbandCQICodeword1 = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new SubbandCQI_iE_Extensions();
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
      if (subbandCQICodeword0 != null) subbandCQICodeword0.print (_sb, "subbandCQICodeword0", _level+1);
      if (subbandCQICodeword1 != null) subbandCQICodeword1.print (_sb, "subbandCQICodeword1", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
