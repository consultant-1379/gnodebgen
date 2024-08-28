/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SuspendConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SuspendConfig";
   }

   public I_RNTI_Value fullI_RNTI;
   public ShortI_RNTI_Value shortI_RNTI;
   public PagingCycle ran_PagingCycle = null;
   public RAN_NotificationAreaInfo ran_NotificationAreaInfo;  // optional
   public PeriodicRNAU_TimerValue t380 = null;  // optional
   public NextHopChainingCount nextHopChainingCount;
   public Asn1OpenExt extElem1;

   public SuspendConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SuspendConfig (
      I_RNTI_Value fullI_RNTI_,
      ShortI_RNTI_Value shortI_RNTI_,
      PagingCycle ran_PagingCycle_,
      RAN_NotificationAreaInfo ran_NotificationAreaInfo_,
      PeriodicRNAU_TimerValue t380_,
      NextHopChainingCount nextHopChainingCount_
   ) {
      super();
      fullI_RNTI = fullI_RNTI_;
      shortI_RNTI = shortI_RNTI_;
      ran_PagingCycle = ran_PagingCycle_;
      ran_NotificationAreaInfo = ran_NotificationAreaInfo_;
      t380 = t380_;
      nextHopChainingCount = nextHopChainingCount_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SuspendConfig (
      I_RNTI_Value fullI_RNTI_,
      ShortI_RNTI_Value shortI_RNTI_,
      PagingCycle ran_PagingCycle_,
      NextHopChainingCount nextHopChainingCount_
   ) {
      super();
      fullI_RNTI = fullI_RNTI_;
      shortI_RNTI = shortI_RNTI_;
      ran_PagingCycle = ran_PagingCycle_;
      nextHopChainingCount = nextHopChainingCount_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SuspendConfig (I_RNTI_Value fullI_RNTI_,
      ShortI_RNTI_Value shortI_RNTI_,
      PagingCycle ran_PagingCycle_,
      RAN_NotificationAreaInfo ran_NotificationAreaInfo_,
      PeriodicRNAU_TimerValue t380_,
      long nextHopChainingCount_
   ) {
      super();
      fullI_RNTI = fullI_RNTI_;
      shortI_RNTI = shortI_RNTI_;
      ran_PagingCycle = ran_PagingCycle_;
      ran_NotificationAreaInfo = ran_NotificationAreaInfo_;
      t380 = t380_;
      nextHopChainingCount = new NextHopChainingCount (nextHopChainingCount_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SuspendConfig (
      I_RNTI_Value fullI_RNTI_,
      ShortI_RNTI_Value shortI_RNTI_,
      PagingCycle ran_PagingCycle_,
      long nextHopChainingCount_
   ) {
      super();
      fullI_RNTI = fullI_RNTI_;
      shortI_RNTI = shortI_RNTI_;
      ran_PagingCycle = ran_PagingCycle_;
      nextHopChainingCount = new NextHopChainingCount (nextHopChainingCount_);
   }

   public void init () {
      fullI_RNTI = null;
      shortI_RNTI = null;
      ran_PagingCycle = null;
      ran_NotificationAreaInfo = null;
      t380 = null;
      nextHopChainingCount = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return fullI_RNTI;
         case 1: return shortI_RNTI;
         case 2: return ran_PagingCycle;
         case 3: return ran_NotificationAreaInfo;
         case 4: return t380;
         case 5: return nextHopChainingCount;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "fullI-RNTI";
         case 1: return "shortI-RNTI";
         case 2: return "ran-PagingCycle";
         case 3: return "ran-NotificationAreaInfo";
         case 4: return "t380";
         case 5: return "nextHopChainingCount";
         case 6: return null;
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

      boolean ran_NotificationAreaInfoPresent = buffer.decodeBit ("ran_NotificationAreaInfoPresent");
      boolean t380Present = buffer.decodeBit ("t380Present");

      // decode fullI_RNTI

      buffer.getContext().eventDispatcher.startElement("fullI_RNTI", -1);

      fullI_RNTI = new I_RNTI_Value();
      fullI_RNTI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("fullI_RNTI", -1);

      // decode shortI_RNTI

      buffer.getContext().eventDispatcher.startElement("shortI_RNTI", -1);

      shortI_RNTI = new ShortI_RNTI_Value();
      shortI_RNTI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("shortI_RNTI", -1);

      // decode ran_PagingCycle

      buffer.getContext().eventDispatcher.startElement("ran_PagingCycle", -1);

      {
         int tval = PagingCycle.decodeEnumValue (buffer);
         ran_PagingCycle = PagingCycle.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ran_PagingCycle", -1);

      // decode ran_NotificationAreaInfo

      if (ran_NotificationAreaInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("ran_NotificationAreaInfo", -1);

         ran_NotificationAreaInfo = new RAN_NotificationAreaInfo();
         ran_NotificationAreaInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ran_NotificationAreaInfo", -1);
      }
      else {
         ran_NotificationAreaInfo = null;
      }

      // decode t380

      if (t380Present) {
         buffer.getContext().eventDispatcher.startElement("t380", -1);

         int tval = PeriodicRNAU_TimerValue.decodeEnumValue (buffer);
         t380 = PeriodicRNAU_TimerValue.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("t380", -1);
      }
      else {
         t380 = null;
      }

      // decode nextHopChainingCount

      buffer.getContext().eventDispatcher.startElement("nextHopChainingCount", -1);

      nextHopChainingCount = new NextHopChainingCount();
      nextHopChainingCount.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nextHopChainingCount", -1);

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

      buffer.encodeBit ((ran_NotificationAreaInfo != null), null);
      buffer.encodeBit ((t380 != null), null);

      // encode fullI_RNTI

      if (fullI_RNTI != null) {
         buffer.getContext().eventDispatcher.startElement("fullI_RNTI", -1);

         fullI_RNTI.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("fullI_RNTI", -1);
      }
      else throw new Asn1MissingRequiredException ("fullI_RNTI");

      // encode shortI_RNTI

      if (shortI_RNTI != null) {
         buffer.getContext().eventDispatcher.startElement("shortI_RNTI", -1);

         shortI_RNTI.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("shortI_RNTI", -1);
      }
      else throw new Asn1MissingRequiredException ("shortI_RNTI");

      // encode ran_PagingCycle

      if (ran_PagingCycle != null) {
         buffer.getContext().eventDispatcher.startElement("ran_PagingCycle", -1);

         ran_PagingCycle.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ran_PagingCycle", -1);
      }
      else throw new Asn1MissingRequiredException ("ran_PagingCycle");

      // encode ran_NotificationAreaInfo

      if (ran_NotificationAreaInfo != null) {
         buffer.getContext().eventDispatcher.startElement("ran_NotificationAreaInfo", -1);

         ran_NotificationAreaInfo.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ran_NotificationAreaInfo", -1);
      }

      // encode t380

      if (t380 != null) {
         buffer.getContext().eventDispatcher.startElement("t380", -1);

         t380.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("t380", -1);
      }

      // encode nextHopChainingCount

      if (nextHopChainingCount != null) {
         buffer.getContext().eventDispatcher.startElement("nextHopChainingCount", -1);

         nextHopChainingCount.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nextHopChainingCount", -1);
      }
      else throw new Asn1MissingRequiredException ("nextHopChainingCount");

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
      if (fullI_RNTI != null) fullI_RNTI.print (_sb, "fullI_RNTI", _level+1);
      if (shortI_RNTI != null) shortI_RNTI.print (_sb, "shortI_RNTI", _level+1);
      if (ran_PagingCycle != null) ran_PagingCycle.print (_sb, "ran_PagingCycle", _level+1);
      if (ran_NotificationAreaInfo != null) ran_NotificationAreaInfo.print (_sb, "ran_NotificationAreaInfo", _level+1);
      if (t380 != null) t380.print (_sb, "t380", _level+1);
      if (nextHopChainingCount != null) nextHopChainingCount.print (_sb, "nextHopChainingCount", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
