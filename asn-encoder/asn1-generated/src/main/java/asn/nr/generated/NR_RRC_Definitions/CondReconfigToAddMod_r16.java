/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CondReconfigToAddMod_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CondReconfigToAddMod-r16";
   }

   public CondReconfigId_r16 condReconfigId_r16;
   public CondReconfigToAddMod_r16_condExecutionCond_r16 condExecutionCond_r16;  // optional
   public RRCReconfiguration condRRCReconfig_r16;  // optional
   public Asn1OpenExt extElem1;

   public CondReconfigToAddMod_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CondReconfigToAddMod_r16 (
      CondReconfigId_r16 condReconfigId_r16_,
      CondReconfigToAddMod_r16_condExecutionCond_r16 condExecutionCond_r16_,
      RRCReconfiguration condRRCReconfig_r16_
   ) {
      super();
      condReconfigId_r16 = condReconfigId_r16_;
      condExecutionCond_r16 = condExecutionCond_r16_;
      condRRCReconfig_r16 = condRRCReconfig_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CondReconfigToAddMod_r16 (
      CondReconfigId_r16 condReconfigId_r16_
   ) {
      super();
      condReconfigId_r16 = condReconfigId_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CondReconfigToAddMod_r16 (long condReconfigId_r16_,
      CondReconfigToAddMod_r16_condExecutionCond_r16 condExecutionCond_r16_,
      RRCReconfiguration condRRCReconfig_r16_
   ) {
      super();
      condReconfigId_r16 = new CondReconfigId_r16 (condReconfigId_r16_);
      condExecutionCond_r16 = condExecutionCond_r16_;
      condRRCReconfig_r16 = condRRCReconfig_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CondReconfigToAddMod_r16 (
      long condReconfigId_r16_
   ) {
      super();
      condReconfigId_r16 = new CondReconfigId_r16 (condReconfigId_r16_);
   }

   public void init () {
      condReconfigId_r16 = null;
      condExecutionCond_r16 = null;
      condRRCReconfig_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return condReconfigId_r16;
         case 1: return condExecutionCond_r16;
         case 2: return condRRCReconfig_r16;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "condReconfigId-r16";
         case 1: return "condExecutionCond-r16";
         case 2: return "condRRCReconfig-r16";
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

      boolean condExecutionCond_r16Present = buffer.decodeBit ("condExecutionCond_r16Present");
      boolean condRRCReconfig_r16Present = buffer.decodeBit ("condRRCReconfig_r16Present");

      // decode condReconfigId_r16

      buffer.getContext().eventDispatcher.startElement("condReconfigId_r16", -1);

      condReconfigId_r16 = new CondReconfigId_r16();
      condReconfigId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("condReconfigId_r16", -1);

      // decode condExecutionCond_r16

      if (condExecutionCond_r16Present) {
         buffer.getContext().eventDispatcher.startElement("condExecutionCond_r16", -1);

         condExecutionCond_r16 = new CondReconfigToAddMod_r16_condExecutionCond_r16();
         condExecutionCond_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("condExecutionCond_r16", -1);
      }
      else {
         condExecutionCond_r16 = null;
      }

      // decode condRRCReconfig_r16

      if (condRRCReconfig_r16Present) {
         buffer.getContext().eventDispatcher.startElement("condRRCReconfig_r16", -1);

         Asn1OctetString condRRCReconfig_r16_outer = new Asn1OctetString();
         condRRCReconfig_r16_outer.decode (buffer);
         if (condRRCReconfig_r16_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( condRRCReconfig_r16_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         condRRCReconfig_r16 = new RRCReconfiguration();
         condRRCReconfig_r16.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("condRRCReconfig_r16", -1);
      }
      else {
         condRRCReconfig_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((condExecutionCond_r16 != null), null);
      buffer.encodeBit ((condRRCReconfig_r16 != null), null);

      // encode condReconfigId_r16

      if (condReconfigId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("condReconfigId_r16", -1);

         condReconfigId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("condReconfigId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("condReconfigId_r16");

      // encode condExecutionCond_r16

      if (condExecutionCond_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("condExecutionCond_r16", -1);

         condExecutionCond_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("condExecutionCond_r16", -1);
      }

      // encode condRRCReconfig_r16

      if (condRRCReconfig_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("condRRCReconfig_r16", -1);

         Asn1OctetString condRRCReconfig_r16_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            condRRCReconfig_r16.encode (buffer);
            condRRCReconfig_r16_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         condRRCReconfig_r16_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("condRRCReconfig_r16", -1);
      }

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
      if (condReconfigId_r16 != null) condReconfigId_r16.print (_sb, "condReconfigId_r16", _level+1);
      if (condExecutionCond_r16 != null) condExecutionCond_r16.print (_sb, "condExecutionCond_r16", _level+1);
      if (condRRCReconfig_r16 != null) condRRCReconfig_r16.print (_sb, "condRRCReconfig_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
