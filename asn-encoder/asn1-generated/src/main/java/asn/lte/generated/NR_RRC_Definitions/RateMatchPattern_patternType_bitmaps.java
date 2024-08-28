/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RateMatchPattern_patternType_bitmaps extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString resourceBlocks;
   public RateMatchPattern_patternType_bitmaps_symbolsInResourceBlock symbolsInResourceBlock;
   public RateMatchPattern_patternType_bitmaps_periodicityAndPattern periodicityAndPattern;  // optional
   public Asn1OpenExt extElem1;

   public RateMatchPattern_patternType_bitmaps () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RateMatchPattern_patternType_bitmaps (
      Asn1BitString resourceBlocks_,
      RateMatchPattern_patternType_bitmaps_symbolsInResourceBlock symbolsInResourceBlock_,
      RateMatchPattern_patternType_bitmaps_periodicityAndPattern periodicityAndPattern_
   ) {
      super();
      resourceBlocks = resourceBlocks_;
      symbolsInResourceBlock = symbolsInResourceBlock_;
      periodicityAndPattern = periodicityAndPattern_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RateMatchPattern_patternType_bitmaps (
      Asn1BitString resourceBlocks_,
      RateMatchPattern_patternType_bitmaps_symbolsInResourceBlock symbolsInResourceBlock_
   ) {
      super();
      resourceBlocks = resourceBlocks_;
      symbolsInResourceBlock = symbolsInResourceBlock_;
   }

   public void init () {
      resourceBlocks = null;
      symbolsInResourceBlock = null;
      periodicityAndPattern = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return resourceBlocks;
         case 1: return symbolsInResourceBlock;
         case 2: return periodicityAndPattern;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "resourceBlocks";
         case 1: return "symbolsInResourceBlock";
         case 2: return "periodicityAndPattern";
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

      boolean periodicityAndPatternPresent = buffer.decodeBit ("periodicityAndPatternPresent");

      // decode resourceBlocks

      buffer.getContext().eventDispatcher.startElement("resourceBlocks", -1);

      resourceBlocks = new Asn1BitString();
      resourceBlocks.decode (buffer, 275, 275);

      buffer.invokeCharacters(resourceBlocks.toString());
      buffer.getContext().eventDispatcher.endElement("resourceBlocks", -1);

      // decode symbolsInResourceBlock

      buffer.getContext().eventDispatcher.startElement("symbolsInResourceBlock", -1);

      symbolsInResourceBlock = new RateMatchPattern_patternType_bitmaps_symbolsInResourceBlock();
      symbolsInResourceBlock.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("symbolsInResourceBlock", -1);

      // decode periodicityAndPattern

      if (periodicityAndPatternPresent) {
         buffer.getContext().eventDispatcher.startElement("periodicityAndPattern", -1);

         periodicityAndPattern = new RateMatchPattern_patternType_bitmaps_periodicityAndPattern();
         periodicityAndPattern.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("periodicityAndPattern", -1);
      }
      else {
         periodicityAndPattern = null;
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
      if (resourceBlocks != null) resourceBlocks.print (_sb, "resourceBlocks", _level+1);
      if (symbolsInResourceBlock != null) symbolsInResourceBlock.print (_sb, "symbolsInResourceBlock", _level+1);
      if (periodicityAndPattern != null) periodicityAndPattern.print (_sb, "periodicityAndPattern", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
