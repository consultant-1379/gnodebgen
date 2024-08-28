/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogicalChannelConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LogicalChannelConfig";
   }

   public LogicalChannelConfig_ul_SpecificParameters ul_SpecificParameters;  // optional
   public boolean mV2ExtPresent;
   public LogicalChannelConfig_logicalChannelSR_Mask_r9 logicalChannelSR_Mask_r9 = null;  // optional
   public boolean mV3ExtPresent;
   public Asn1Boolean logicalChannelSR_Prohibit_r12;  // optional
   public boolean mV4ExtPresent;
   public Asn1Boolean laa_UL_Allowed_r14;  // optional
   public LogicalChannelConfig_bitRateQueryProhibitTimer_r14 bitRateQueryProhibitTimer_r14 = null;  // optional
   public boolean mV5ExtPresent;
   public LogicalChannelConfig_allowedTTI_Lengths_r15 allowedTTI_Lengths_r15;  // optional
   public LogicalChannelConfig_logicalChannelSR_Restriction_r15 logicalChannelSR_Restriction_r15;  // optional
   public LogicalChannelConfig_channellAccessPriority_r15 channellAccessPriority_r15;  // optional
   public Asn1BitString lch_CellRestriction_r15;  // optional
   public Asn1OpenExt extElem1;

   public LogicalChannelConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LogicalChannelConfig (
      LogicalChannelConfig_ul_SpecificParameters ul_SpecificParameters_,
      LogicalChannelConfig_logicalChannelSR_Mask_r9 logicalChannelSR_Mask_r9_,
      Asn1Boolean logicalChannelSR_Prohibit_r12_,
      Asn1Boolean laa_UL_Allowed_r14_,
      LogicalChannelConfig_bitRateQueryProhibitTimer_r14 bitRateQueryProhibitTimer_r14_,
      LogicalChannelConfig_allowedTTI_Lengths_r15 allowedTTI_Lengths_r15_,
      LogicalChannelConfig_logicalChannelSR_Restriction_r15 logicalChannelSR_Restriction_r15_,
      LogicalChannelConfig_channellAccessPriority_r15 channellAccessPriority_r15_,
      Asn1BitString lch_CellRestriction_r15_
   ) {
      super();
      ul_SpecificParameters = ul_SpecificParameters_;
      logicalChannelSR_Mask_r9 = logicalChannelSR_Mask_r9_;
      logicalChannelSR_Prohibit_r12 = logicalChannelSR_Prohibit_r12_;
      laa_UL_Allowed_r14 = laa_UL_Allowed_r14_;
      bitRateQueryProhibitTimer_r14 = bitRateQueryProhibitTimer_r14_;
      allowedTTI_Lengths_r15 = allowedTTI_Lengths_r15_;
      logicalChannelSR_Restriction_r15 = logicalChannelSR_Restriction_r15_;
      channellAccessPriority_r15 = channellAccessPriority_r15_;
      lch_CellRestriction_r15 = lch_CellRestriction_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LogicalChannelConfig (LogicalChannelConfig_ul_SpecificParameters ul_SpecificParameters_,
      LogicalChannelConfig_logicalChannelSR_Mask_r9 logicalChannelSR_Mask_r9_,
      boolean logicalChannelSR_Prohibit_r12_,
      boolean laa_UL_Allowed_r14_,
      LogicalChannelConfig_bitRateQueryProhibitTimer_r14 bitRateQueryProhibitTimer_r14_,
      LogicalChannelConfig_allowedTTI_Lengths_r15 allowedTTI_Lengths_r15_,
      LogicalChannelConfig_logicalChannelSR_Restriction_r15 logicalChannelSR_Restriction_r15_,
      LogicalChannelConfig_channellAccessPriority_r15 channellAccessPriority_r15_,
      Asn1BitString lch_CellRestriction_r15_
   ) {
      super();
      ul_SpecificParameters = ul_SpecificParameters_;
      logicalChannelSR_Mask_r9 = logicalChannelSR_Mask_r9_;
      logicalChannelSR_Prohibit_r12 = new Asn1Boolean (logicalChannelSR_Prohibit_r12_);
      laa_UL_Allowed_r14 = new Asn1Boolean (laa_UL_Allowed_r14_);
      bitRateQueryProhibitTimer_r14 = bitRateQueryProhibitTimer_r14_;
      allowedTTI_Lengths_r15 = allowedTTI_Lengths_r15_;
      logicalChannelSR_Restriction_r15 = logicalChannelSR_Restriction_r15_;
      channellAccessPriority_r15 = channellAccessPriority_r15_;
      lch_CellRestriction_r15 = lch_CellRestriction_r15_;
   }

   public void init () {
      ul_SpecificParameters = null;
      logicalChannelSR_Mask_r9 = null;
      logicalChannelSR_Prohibit_r12 = null;
      laa_UL_Allowed_r14 = null;
      bitRateQueryProhibitTimer_r14 = null;
      allowedTTI_Lengths_r15 = null;
      logicalChannelSR_Restriction_r15 = null;
      channellAccessPriority_r15 = null;
      lch_CellRestriction_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_SpecificParameters;
         case 1: return logicalChannelSR_Mask_r9;
         case 2: return logicalChannelSR_Prohibit_r12;
         case 3: return laa_UL_Allowed_r14;
         case 4: return bitRateQueryProhibitTimer_r14;
         case 5: return allowedTTI_Lengths_r15;
         case 6: return logicalChannelSR_Restriction_r15;
         case 7: return channellAccessPriority_r15;
         case 8: return lch_CellRestriction_r15;
         case 9: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-SpecificParameters";
         case 1: return "logicalChannelSR-Mask-r9";
         case 2: return "logicalChannelSR-Prohibit-r12";
         case 3: return "laa-UL-Allowed-r14";
         case 4: return "bitRateQueryProhibitTimer-r14";
         case 5: return "allowedTTI-Lengths-r15";
         case 6: return "logicalChannelSR-Restriction-r15";
         case 7: return "channellAccessPriority-r15";
         case 8: return "lch-CellRestriction-r15";
         case 9: return null;
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

      boolean ul_SpecificParametersPresent = buffer.decodeBit ("ul_SpecificParametersPresent");

      // decode ul_SpecificParameters

      if (ul_SpecificParametersPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_SpecificParameters", -1);

         ul_SpecificParameters = new LogicalChannelConfig_ul_SpecificParameters();
         ul_SpecificParameters.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_SpecificParameters", -1);
      }
      else {
         ul_SpecificParameters = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean logicalChannelSR_Mask_r9Present = buffer.decodeBit ("logicalChannelSR_Mask_r9Present");

            // decode logicalChannelSR_Mask_r9

            if (logicalChannelSR_Mask_r9Present) {
               buffer.getContext().eventDispatcher.startElement("logicalChannelSR_Mask_r9", -1);

               int tval = LogicalChannelConfig_logicalChannelSR_Mask_r9.decodeEnumValue (buffer);
               logicalChannelSR_Mask_r9 = LogicalChannelConfig_logicalChannelSR_Mask_r9.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("logicalChannelSR_Mask_r9", -1);
            }
            else {
               logicalChannelSR_Mask_r9 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean logicalChannelSR_Prohibit_r12Present = buffer.decodeBit ("logicalChannelSR_Prohibit_r12Present");

            // decode logicalChannelSR_Prohibit_r12

            if (logicalChannelSR_Prohibit_r12Present) {
               buffer.getContext().eventDispatcher.startElement("logicalChannelSR_Prohibit_r12", -1);

               logicalChannelSR_Prohibit_r12 = new Asn1Boolean();
               logicalChannelSR_Prohibit_r12.decode (buffer);

               buffer.invokeCharacters(logicalChannelSR_Prohibit_r12.toString());
               buffer.getContext().eventDispatcher.endElement("logicalChannelSR_Prohibit_r12", -1);
            }
            else {
               logicalChannelSR_Prohibit_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean laa_UL_Allowed_r14Present = buffer.decodeBit ("laa_UL_Allowed_r14Present");

            boolean bitRateQueryProhibitTimer_r14Present = buffer.decodeBit ("bitRateQueryProhibitTimer_r14Present");

            // decode laa_UL_Allowed_r14

            if (laa_UL_Allowed_r14Present) {
               buffer.getContext().eventDispatcher.startElement("laa_UL_Allowed_r14", -1);

               laa_UL_Allowed_r14 = new Asn1Boolean();
               laa_UL_Allowed_r14.decode (buffer);

               buffer.invokeCharacters(laa_UL_Allowed_r14.toString());
               buffer.getContext().eventDispatcher.endElement("laa_UL_Allowed_r14", -1);
            }
            else {
               laa_UL_Allowed_r14 = null;
            }

            // decode bitRateQueryProhibitTimer_r14

            if (bitRateQueryProhibitTimer_r14Present) {
               buffer.getContext().eventDispatcher.startElement("bitRateQueryProhibitTimer_r14", -1);

               int tval = LogicalChannelConfig_bitRateQueryProhibitTimer_r14.decodeEnumValue (buffer);
               bitRateQueryProhibitTimer_r14 = LogicalChannelConfig_bitRateQueryProhibitTimer_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("bitRateQueryProhibitTimer_r14", -1);
            }
            else {
               bitRateQueryProhibitTimer_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean allowedTTI_Lengths_r15Present = buffer.decodeBit ("allowedTTI_Lengths_r15Present");

            boolean logicalChannelSR_Restriction_r15Present = buffer.decodeBit ("logicalChannelSR_Restriction_r15Present");

            boolean channellAccessPriority_r15Present = buffer.decodeBit ("channellAccessPriority_r15Present");

            boolean lch_CellRestriction_r15Present = buffer.decodeBit ("lch_CellRestriction_r15Present");

            // decode allowedTTI_Lengths_r15

            if (allowedTTI_Lengths_r15Present) {
               buffer.getContext().eventDispatcher.startElement("allowedTTI_Lengths_r15", -1);

               allowedTTI_Lengths_r15 = new LogicalChannelConfig_allowedTTI_Lengths_r15();
               allowedTTI_Lengths_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("allowedTTI_Lengths_r15", -1);
            }
            else {
               allowedTTI_Lengths_r15 = null;
            }

            // decode logicalChannelSR_Restriction_r15

            if (logicalChannelSR_Restriction_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logicalChannelSR_Restriction_r15", -1);

               logicalChannelSR_Restriction_r15 = new LogicalChannelConfig_logicalChannelSR_Restriction_r15();
               logicalChannelSR_Restriction_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("logicalChannelSR_Restriction_r15", -1);
            }
            else {
               logicalChannelSR_Restriction_r15 = null;
            }

            // decode channellAccessPriority_r15

            if (channellAccessPriority_r15Present) {
               buffer.getContext().eventDispatcher.startElement("channellAccessPriority_r15", -1);

               channellAccessPriority_r15 = new LogicalChannelConfig_channellAccessPriority_r15();
               channellAccessPriority_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("channellAccessPriority_r15", -1);
            }
            else {
               channellAccessPriority_r15 = null;
            }

            // decode lch_CellRestriction_r15

            if (lch_CellRestriction_r15Present) {
               buffer.getContext().eventDispatcher.startElement("lch_CellRestriction_r15", -1);

               lch_CellRestriction_r15 = new Asn1BitString();
               lch_CellRestriction_r15.decode (buffer, 32, 32);

               buffer.invokeCharacters(lch_CellRestriction_r15.toString());
               buffer.getContext().eventDispatcher.endElement("lch_CellRestriction_r15", -1);
            }
            else {
               lch_CellRestriction_r15 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (ul_SpecificParameters != null) ul_SpecificParameters.print (_sb, "ul_SpecificParameters", _level+1);
      if (logicalChannelSR_Mask_r9 != null) logicalChannelSR_Mask_r9.print (_sb, "logicalChannelSR_Mask_r9", _level+1);
      if (logicalChannelSR_Prohibit_r12 != null) logicalChannelSR_Prohibit_r12.print (_sb, "logicalChannelSR_Prohibit_r12", _level+1);
      if (laa_UL_Allowed_r14 != null) laa_UL_Allowed_r14.print (_sb, "laa_UL_Allowed_r14", _level+1);
      if (bitRateQueryProhibitTimer_r14 != null) bitRateQueryProhibitTimer_r14.print (_sb, "bitRateQueryProhibitTimer_r14", _level+1);
      if (allowedTTI_Lengths_r15 != null) allowedTTI_Lengths_r15.print (_sb, "allowedTTI_Lengths_r15", _level+1);
      if (logicalChannelSR_Restriction_r15 != null) logicalChannelSR_Restriction_r15.print (_sb, "logicalChannelSR_Restriction_r15", _level+1);
      if (channellAccessPriority_r15 != null) channellAccessPriority_r15.print (_sb, "channellAccessPriority_r15", _level+1);
      if (lch_CellRestriction_r15 != null) lch_CellRestriction_r15.print (_sb, "lch_CellRestriction_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
