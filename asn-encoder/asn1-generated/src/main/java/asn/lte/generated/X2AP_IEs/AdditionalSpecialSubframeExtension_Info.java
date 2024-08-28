/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class AdditionalSpecialSubframeExtension_Info extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AdditionalSpecialSubframeExtension-Info";
   }

   public AdditionalSpecialSubframePatternsExtension additionalspecialSubframePatternsExtension = null;
   public CyclicPrefixDL cyclicPrefixDL = null;
   public CyclicPrefixUL cyclicPrefixUL = null;
   public AdditionalSpecialSubframeExtension_Info_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public AdditionalSpecialSubframeExtension_Info () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AdditionalSpecialSubframeExtension_Info (
      AdditionalSpecialSubframePatternsExtension additionalspecialSubframePatternsExtension_,
      CyclicPrefixDL cyclicPrefixDL_,
      CyclicPrefixUL cyclicPrefixUL_,
      AdditionalSpecialSubframeExtension_Info_iE_Extensions iE_Extensions_
   ) {
      super();
      additionalspecialSubframePatternsExtension = additionalspecialSubframePatternsExtension_;
      cyclicPrefixDL = cyclicPrefixDL_;
      cyclicPrefixUL = cyclicPrefixUL_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public AdditionalSpecialSubframeExtension_Info (
      AdditionalSpecialSubframePatternsExtension additionalspecialSubframePatternsExtension_,
      CyclicPrefixDL cyclicPrefixDL_,
      CyclicPrefixUL cyclicPrefixUL_
   ) {
      super();
      additionalspecialSubframePatternsExtension = additionalspecialSubframePatternsExtension_;
      cyclicPrefixDL = cyclicPrefixDL_;
      cyclicPrefixUL = cyclicPrefixUL_;
   }

   public void init () {
      additionalspecialSubframePatternsExtension = null;
      cyclicPrefixDL = null;
      cyclicPrefixUL = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return additionalspecialSubframePatternsExtension;
         case 1: return cyclicPrefixDL;
         case 2: return cyclicPrefixUL;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "additionalspecialSubframePatternsExtension";
         case 1: return "cyclicPrefixDL";
         case 2: return "cyclicPrefixUL";
         case 3: return "iE-Extensions";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode additionalspecialSubframePatternsExtension

      buffer.getContext().eventDispatcher.startElement("additionalspecialSubframePatternsExtension", -1);

      {
         int tval = AdditionalSpecialSubframePatternsExtension.decodeEnumValue (buffer);
         additionalspecialSubframePatternsExtension = AdditionalSpecialSubframePatternsExtension.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("additionalspecialSubframePatternsExtension", -1);

      // decode cyclicPrefixDL

      buffer.getContext().eventDispatcher.startElement("cyclicPrefixDL", -1);

      {
         int tval = CyclicPrefixDL.decodeEnumValue (buffer);
         cyclicPrefixDL = CyclicPrefixDL.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cyclicPrefixDL", -1);

      // decode cyclicPrefixUL

      buffer.getContext().eventDispatcher.startElement("cyclicPrefixUL", -1);

      {
         int tval = CyclicPrefixUL.decodeEnumValue (buffer);
         cyclicPrefixUL = CyclicPrefixUL.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cyclicPrefixUL", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new AdditionalSpecialSubframeExtension_Info_iE_Extensions();
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
      if (additionalspecialSubframePatternsExtension != null) additionalspecialSubframePatternsExtension.print (_sb, "additionalspecialSubframePatternsExtension", _level+1);
      if (cyclicPrefixDL != null) cyclicPrefixDL.print (_sb, "cyclicPrefixDL", _level+1);
      if (cyclicPrefixUL != null) cyclicPrefixUL.print (_sb, "cyclicPrefixUL", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
