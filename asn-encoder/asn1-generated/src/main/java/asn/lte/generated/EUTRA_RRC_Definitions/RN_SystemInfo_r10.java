/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RN_SystemInfo_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RN-SystemInfo-r10";
   }

   public SystemInformationBlockType1 systemInformationBlockType1_r10;  // optional
   public SystemInformationBlockType2 systemInformationBlockType2_r10;  // optional
   public Asn1OpenExt extElem1;

   public RN_SystemInfo_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RN_SystemInfo_r10 (
      SystemInformationBlockType1 systemInformationBlockType1_r10_,
      SystemInformationBlockType2 systemInformationBlockType2_r10_
   ) {
      super();
      systemInformationBlockType1_r10 = systemInformationBlockType1_r10_;
      systemInformationBlockType2_r10 = systemInformationBlockType2_r10_;
   }

   public void init () {
      systemInformationBlockType1_r10 = null;
      systemInformationBlockType2_r10 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return systemInformationBlockType1_r10;
         case 1: return systemInformationBlockType2_r10;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "systemInformationBlockType1-r10";
         case 1: return "systemInformationBlockType2-r10";
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

      // optional bits

      boolean systemInformationBlockType1_r10Present = buffer.decodeBit ("systemInformationBlockType1_r10Present");
      boolean systemInformationBlockType2_r10Present = buffer.decodeBit ("systemInformationBlockType2_r10Present");

      // decode systemInformationBlockType1_r10

      if (systemInformationBlockType1_r10Present) {
         buffer.getContext().eventDispatcher.startElement("systemInformationBlockType1_r10", -1);

         Asn1OctetString systemInformationBlockType1_r10_outer = new Asn1OctetString();
         systemInformationBlockType1_r10_outer.decode (buffer);
         if (systemInformationBlockType1_r10_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( systemInformationBlockType1_r10_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         systemInformationBlockType1_r10 = new SystemInformationBlockType1();
         systemInformationBlockType1_r10.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("systemInformationBlockType1_r10", -1);
      }
      else {
         systemInformationBlockType1_r10 = null;
      }

      // decode systemInformationBlockType2_r10

      if (systemInformationBlockType2_r10Present) {
         buffer.getContext().eventDispatcher.startElement("systemInformationBlockType2_r10", -1);

         systemInformationBlockType2_r10 = new SystemInformationBlockType2();
         systemInformationBlockType2_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("systemInformationBlockType2_r10", -1);
      }
      else {
         systemInformationBlockType2_r10 = null;
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
      if (systemInformationBlockType1_r10 != null) systemInformationBlockType1_r10.print (_sb, "systemInformationBlockType1_r10", _level+1);
      if (systemInformationBlockType2_r10 != null) systemInformationBlockType2_r10.print (_sb, "systemInformationBlockType2_r10", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
