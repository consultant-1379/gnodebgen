/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeDurationForCI_r16 timeDurationForCI_r16 = null;  // optional
   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16 timeGranularityForCI_r16 = null;
   public Asn1Integer frequencyRegionForCI_r16;
   public Asn1Integer deltaOffset_r16;
   public Asn1OpenExt extElem1;

   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 (
      CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeDurationForCI_r16 timeDurationForCI_r16_,
      CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16 timeGranularityForCI_r16_,
      Asn1Integer frequencyRegionForCI_r16_,
      Asn1Integer deltaOffset_r16_
   ) {
      super();
      timeDurationForCI_r16 = timeDurationForCI_r16_;
      timeGranularityForCI_r16 = timeGranularityForCI_r16_;
      frequencyRegionForCI_r16 = frequencyRegionForCI_r16_;
      deltaOffset_r16 = deltaOffset_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 (
      CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16 timeGranularityForCI_r16_,
      Asn1Integer frequencyRegionForCI_r16_,
      Asn1Integer deltaOffset_r16_
   ) {
      super();
      timeGranularityForCI_r16 = timeGranularityForCI_r16_;
      frequencyRegionForCI_r16 = frequencyRegionForCI_r16_;
      deltaOffset_r16 = deltaOffset_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 (CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeDurationForCI_r16 timeDurationForCI_r16_,
      CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16 timeGranularityForCI_r16_,
      long frequencyRegionForCI_r16_,
      long deltaOffset_r16_
   ) {
      super();
      timeDurationForCI_r16 = timeDurationForCI_r16_;
      timeGranularityForCI_r16 = timeGranularityForCI_r16_;
      frequencyRegionForCI_r16 = new Asn1Integer (frequencyRegionForCI_r16_);
      deltaOffset_r16 = new Asn1Integer (deltaOffset_r16_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16 (
      CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16 timeGranularityForCI_r16_,
      long frequencyRegionForCI_r16_,
      long deltaOffset_r16_
   ) {
      super();
      timeGranularityForCI_r16 = timeGranularityForCI_r16_;
      frequencyRegionForCI_r16 = new Asn1Integer (frequencyRegionForCI_r16_);
      deltaOffset_r16 = new Asn1Integer (deltaOffset_r16_);
   }

   public void init () {
      timeDurationForCI_r16 = null;
      timeGranularityForCI_r16 = null;
      frequencyRegionForCI_r16 = null;
      deltaOffset_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return timeDurationForCI_r16;
         case 1: return timeGranularityForCI_r16;
         case 2: return frequencyRegionForCI_r16;
         case 3: return deltaOffset_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "timeDurationForCI-r16";
         case 1: return "timeGranularityForCI-r16";
         case 2: return "frequencyRegionForCI-r16";
         case 3: return "deltaOffset-r16";
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

      boolean timeDurationForCI_r16Present = buffer.decodeBit ("timeDurationForCI_r16Present");

      // decode timeDurationForCI_r16

      if (timeDurationForCI_r16Present) {
         buffer.getContext().eventDispatcher.startElement("timeDurationForCI_r16", -1);

         int tval = CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeDurationForCI_r16.decodeEnumValue (buffer);
         timeDurationForCI_r16 = CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeDurationForCI_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("timeDurationForCI_r16", -1);
      }
      else {
         timeDurationForCI_r16 = null;
      }

      // decode timeGranularityForCI_r16

      buffer.getContext().eventDispatcher.startElement("timeGranularityForCI_r16", -1);

      {
         int tval = CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16.decodeEnumValue (buffer);
         timeGranularityForCI_r16 = CI_ConfigurationPerServingCell_r16_timeFrequencyRegion_r16_timeGranularityForCI_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("timeGranularityForCI_r16", -1);

      // decode frequencyRegionForCI_r16

      buffer.getContext().eventDispatcher.startElement("frequencyRegionForCI_r16", -1);

      frequencyRegionForCI_r16 = new Asn1Integer();
      frequencyRegionForCI_r16.decode (buffer, 0, 37949);

      buffer.invokeCharacters(frequencyRegionForCI_r16.toString());
      buffer.getContext().eventDispatcher.endElement("frequencyRegionForCI_r16", -1);

      // decode deltaOffset_r16

      buffer.getContext().eventDispatcher.startElement("deltaOffset_r16", -1);

      deltaOffset_r16 = new Asn1Integer();
      deltaOffset_r16.decode (buffer, 0, 2);

      buffer.invokeCharacters(deltaOffset_r16.toString());
      buffer.getContext().eventDispatcher.endElement("deltaOffset_r16", -1);

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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((timeDurationForCI_r16 != null), null);

      // encode timeDurationForCI_r16

      if (timeDurationForCI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("timeDurationForCI_r16", -1);

         timeDurationForCI_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("timeDurationForCI_r16", -1);
      }

      // encode timeGranularityForCI_r16

      if (timeGranularityForCI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("timeGranularityForCI_r16", -1);

         timeGranularityForCI_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("timeGranularityForCI_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("timeGranularityForCI_r16");

      // encode frequencyRegionForCI_r16

      if (frequencyRegionForCI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("frequencyRegionForCI_r16", -1);

         frequencyRegionForCI_r16.encode (buffer, 0, 37949);

         buffer.getContext().eventDispatcher.endElement("frequencyRegionForCI_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("frequencyRegionForCI_r16");

      // encode deltaOffset_r16

      if (deltaOffset_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("deltaOffset_r16", -1);

         deltaOffset_r16.encode (buffer, 0, 2);

         buffer.getContext().eventDispatcher.endElement("deltaOffset_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("deltaOffset_r16");

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (timeDurationForCI_r16 != null) timeDurationForCI_r16.print (_sb, "timeDurationForCI_r16", _level+1);
      if (timeGranularityForCI_r16 != null) timeGranularityForCI_r16.print (_sb, "timeGranularityForCI_r16", _level+1);
      if (frequencyRegionForCI_r16 != null) frequencyRegionForCI_r16.print (_sb, "frequencyRegionForCI_r16", _level+1);
      if (deltaOffset_r16 != null) deltaOffset_r16.print (_sb, "deltaOffset_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
