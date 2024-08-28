/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_ParametersFRX_Diff_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-ParametersFRX-Diff-r16";
   }

   public MAC_ParametersFRX_Diff_r16_directMCG_SCellActivation_r16 directMCG_SCellActivation_r16 = null;  // optional
   public MAC_ParametersFRX_Diff_r16_directMCG_SCellActivationResume_r16 directMCG_SCellActivationResume_r16 = null;  // optional
   public MAC_ParametersFRX_Diff_r16_directSCG_SCellActivation_r16 directSCG_SCellActivation_r16 = null;  // optional
   public MAC_ParametersFRX_Diff_r16_directSCG_SCellActivationResume_r16 directSCG_SCellActivationResume_r16 = null;  // optional
   public MAC_ParametersFRX_Diff_r16_drx_Adaptation_r16 drx_Adaptation_r16;  // optional
   public Asn1OpenExt extElem1;

   public MAC_ParametersFRX_Diff_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_ParametersFRX_Diff_r16 (
      MAC_ParametersFRX_Diff_r16_directMCG_SCellActivation_r16 directMCG_SCellActivation_r16_,
      MAC_ParametersFRX_Diff_r16_directMCG_SCellActivationResume_r16 directMCG_SCellActivationResume_r16_,
      MAC_ParametersFRX_Diff_r16_directSCG_SCellActivation_r16 directSCG_SCellActivation_r16_,
      MAC_ParametersFRX_Diff_r16_directSCG_SCellActivationResume_r16 directSCG_SCellActivationResume_r16_,
      MAC_ParametersFRX_Diff_r16_drx_Adaptation_r16 drx_Adaptation_r16_
   ) {
      super();
      directMCG_SCellActivation_r16 = directMCG_SCellActivation_r16_;
      directMCG_SCellActivationResume_r16 = directMCG_SCellActivationResume_r16_;
      directSCG_SCellActivation_r16 = directSCG_SCellActivation_r16_;
      directSCG_SCellActivationResume_r16 = directSCG_SCellActivationResume_r16_;
      drx_Adaptation_r16 = drx_Adaptation_r16_;
   }

   public void init () {
      directMCG_SCellActivation_r16 = null;
      directMCG_SCellActivationResume_r16 = null;
      directSCG_SCellActivation_r16 = null;
      directSCG_SCellActivationResume_r16 = null;
      drx_Adaptation_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return directMCG_SCellActivation_r16;
         case 1: return directMCG_SCellActivationResume_r16;
         case 2: return directSCG_SCellActivation_r16;
         case 3: return directSCG_SCellActivationResume_r16;
         case 4: return drx_Adaptation_r16;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "directMCG-SCellActivation-r16";
         case 1: return "directMCG-SCellActivationResume-r16";
         case 2: return "directSCG-SCellActivation-r16";
         case 3: return "directSCG-SCellActivationResume-r16";
         case 4: return "drx-Adaptation-r16";
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

      boolean directMCG_SCellActivation_r16Present = buffer.decodeBit ("directMCG_SCellActivation_r16Present");
      boolean directMCG_SCellActivationResume_r16Present = buffer.decodeBit ("directMCG_SCellActivationResume_r16Present");
      boolean directSCG_SCellActivation_r16Present = buffer.decodeBit ("directSCG_SCellActivation_r16Present");
      boolean directSCG_SCellActivationResume_r16Present = buffer.decodeBit ("directSCG_SCellActivationResume_r16Present");
      boolean drx_Adaptation_r16Present = buffer.decodeBit ("drx_Adaptation_r16Present");

      // decode directMCG_SCellActivation_r16

      if (directMCG_SCellActivation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("directMCG_SCellActivation_r16", -1);

         int tval = MAC_ParametersFRX_Diff_r16_directMCG_SCellActivation_r16.decodeEnumValue (buffer);
         directMCG_SCellActivation_r16 = MAC_ParametersFRX_Diff_r16_directMCG_SCellActivation_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("directMCG_SCellActivation_r16", -1);
      }
      else {
         directMCG_SCellActivation_r16 = null;
      }

      // decode directMCG_SCellActivationResume_r16

      if (directMCG_SCellActivationResume_r16Present) {
         buffer.getContext().eventDispatcher.startElement("directMCG_SCellActivationResume_r16", -1);

         int tval = MAC_ParametersFRX_Diff_r16_directMCG_SCellActivationResume_r16.decodeEnumValue (buffer);
         directMCG_SCellActivationResume_r16 = MAC_ParametersFRX_Diff_r16_directMCG_SCellActivationResume_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("directMCG_SCellActivationResume_r16", -1);
      }
      else {
         directMCG_SCellActivationResume_r16 = null;
      }

      // decode directSCG_SCellActivation_r16

      if (directSCG_SCellActivation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("directSCG_SCellActivation_r16", -1);

         int tval = MAC_ParametersFRX_Diff_r16_directSCG_SCellActivation_r16.decodeEnumValue (buffer);
         directSCG_SCellActivation_r16 = MAC_ParametersFRX_Diff_r16_directSCG_SCellActivation_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("directSCG_SCellActivation_r16", -1);
      }
      else {
         directSCG_SCellActivation_r16 = null;
      }

      // decode directSCG_SCellActivationResume_r16

      if (directSCG_SCellActivationResume_r16Present) {
         buffer.getContext().eventDispatcher.startElement("directSCG_SCellActivationResume_r16", -1);

         int tval = MAC_ParametersFRX_Diff_r16_directSCG_SCellActivationResume_r16.decodeEnumValue (buffer);
         directSCG_SCellActivationResume_r16 = MAC_ParametersFRX_Diff_r16_directSCG_SCellActivationResume_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("directSCG_SCellActivationResume_r16", -1);
      }
      else {
         directSCG_SCellActivationResume_r16 = null;
      }

      // decode drx_Adaptation_r16

      if (drx_Adaptation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("drx_Adaptation_r16", -1);

         drx_Adaptation_r16 = new MAC_ParametersFRX_Diff_r16_drx_Adaptation_r16();
         drx_Adaptation_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drx_Adaptation_r16", -1);
      }
      else {
         drx_Adaptation_r16 = null;
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

      buffer.encodeBit ((directMCG_SCellActivation_r16 != null), null);
      buffer.encodeBit ((directMCG_SCellActivationResume_r16 != null), null);
      buffer.encodeBit ((directSCG_SCellActivation_r16 != null), null);
      buffer.encodeBit ((directSCG_SCellActivationResume_r16 != null), null);
      buffer.encodeBit ((drx_Adaptation_r16 != null), null);

      // encode directMCG_SCellActivation_r16

      if (directMCG_SCellActivation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("directMCG_SCellActivation_r16", -1);

         directMCG_SCellActivation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("directMCG_SCellActivation_r16", -1);
      }

      // encode directMCG_SCellActivationResume_r16

      if (directMCG_SCellActivationResume_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("directMCG_SCellActivationResume_r16", -1);

         directMCG_SCellActivationResume_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("directMCG_SCellActivationResume_r16", -1);
      }

      // encode directSCG_SCellActivation_r16

      if (directSCG_SCellActivation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("directSCG_SCellActivation_r16", -1);

         directSCG_SCellActivation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("directSCG_SCellActivation_r16", -1);
      }

      // encode directSCG_SCellActivationResume_r16

      if (directSCG_SCellActivationResume_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("directSCG_SCellActivationResume_r16", -1);

         directSCG_SCellActivationResume_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("directSCG_SCellActivationResume_r16", -1);
      }

      // encode drx_Adaptation_r16

      if (drx_Adaptation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("drx_Adaptation_r16", -1);

         drx_Adaptation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drx_Adaptation_r16", -1);
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
      if (directMCG_SCellActivation_r16 != null) directMCG_SCellActivation_r16.print (_sb, "directMCG_SCellActivation_r16", _level+1);
      if (directMCG_SCellActivationResume_r16 != null) directMCG_SCellActivationResume_r16.print (_sb, "directMCG_SCellActivationResume_r16", _level+1);
      if (directSCG_SCellActivation_r16 != null) directSCG_SCellActivation_r16.print (_sb, "directSCG_SCellActivation_r16", _level+1);
      if (directSCG_SCellActivationResume_r16 != null) directSCG_SCellActivationResume_r16.print (_sb, "directSCG_SCellActivationResume_r16", _level+1);
      if (drx_Adaptation_r16 != null) drx_Adaptation_r16.print (_sb, "drx_Adaptation_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
