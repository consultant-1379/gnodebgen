/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SDAP_Parameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SDAP-Parameters";
   }

   public SDAP_Parameters_as_ReflectiveQoS as_ReflectiveQoS = null;  // optional
   public boolean mV2ExtPresent;
   public SDAP_Parameters_sdap_QOS_IAB_r16 sdap_QOS_IAB_r16 = null;  // optional
   public SDAP_Parameters_sdapHeaderIAB_r16 sdapHeaderIAB_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public SDAP_Parameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SDAP_Parameters (
      SDAP_Parameters_as_ReflectiveQoS as_ReflectiveQoS_,
      SDAP_Parameters_sdap_QOS_IAB_r16 sdap_QOS_IAB_r16_,
      SDAP_Parameters_sdapHeaderIAB_r16 sdapHeaderIAB_r16_
   ) {
      super();
      as_ReflectiveQoS = as_ReflectiveQoS_;
      sdap_QOS_IAB_r16 = sdap_QOS_IAB_r16_;
      sdapHeaderIAB_r16 = sdapHeaderIAB_r16_;
   }

   public void init () {
      as_ReflectiveQoS = null;
      sdap_QOS_IAB_r16 = null;
      sdapHeaderIAB_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return as_ReflectiveQoS;
         case 1: return sdap_QOS_IAB_r16;
         case 2: return sdapHeaderIAB_r16;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "as-ReflectiveQoS";
         case 1: return "sdap-QOS-IAB-r16";
         case 2: return "sdapHeaderIAB-r16";
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

      boolean as_ReflectiveQoSPresent = buffer.decodeBit ("as_ReflectiveQoSPresent");

      // decode as_ReflectiveQoS

      if (as_ReflectiveQoSPresent) {
         buffer.getContext().eventDispatcher.startElement("as_ReflectiveQoS", -1);

         int tval = SDAP_Parameters_as_ReflectiveQoS.decodeEnumValue (buffer);
         as_ReflectiveQoS = SDAP_Parameters_as_ReflectiveQoS.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("as_ReflectiveQoS", -1);
      }
      else {
         as_ReflectiveQoS = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean sdap_QOS_IAB_r16Present = buffer.decodeBit ("sdap_QOS_IAB_r16Present");

            boolean sdapHeaderIAB_r16Present = buffer.decodeBit ("sdapHeaderIAB_r16Present");

            // decode sdap_QOS_IAB_r16

            if (sdap_QOS_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sdap_QOS_IAB_r16", -1);

               int tval = SDAP_Parameters_sdap_QOS_IAB_r16.decodeEnumValue (buffer);
               sdap_QOS_IAB_r16 = SDAP_Parameters_sdap_QOS_IAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sdap_QOS_IAB_r16", -1);
            }
            else {
               sdap_QOS_IAB_r16 = null;
            }

            // decode sdapHeaderIAB_r16

            if (sdapHeaderIAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sdapHeaderIAB_r16", -1);

               int tval = SDAP_Parameters_sdapHeaderIAB_r16.decodeEnumValue (buffer);
               sdapHeaderIAB_r16 = SDAP_Parameters_sdapHeaderIAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sdapHeaderIAB_r16", -1);
            }
            else {
               sdapHeaderIAB_r16 = null;
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
      if (as_ReflectiveQoS != null) as_ReflectiveQoS.print (_sb, "as_ReflectiveQoS", _level+1);
      if (sdap_QOS_IAB_r16 != null) sdap_QOS_IAB_r16.print (_sb, "sdap_QOS_IAB_r16", _level+1);
      if (sdapHeaderIAB_r16 != null) sdapHeaderIAB_r16.print (_sb, "sdapHeaderIAB_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
