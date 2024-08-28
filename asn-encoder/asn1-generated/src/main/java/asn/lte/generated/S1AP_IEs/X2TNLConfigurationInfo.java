/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class X2TNLConfigurationInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "X2TNLConfigurationInfo";
   }

   public ENBX2TLAs eNBX2TransportLayerAddresses;
   public X2TNLConfigurationInfo_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public X2TNLConfigurationInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public X2TNLConfigurationInfo (
      ENBX2TLAs eNBX2TransportLayerAddresses_,
      X2TNLConfigurationInfo_iE_Extensions iE_Extensions_
   ) {
      super();
      eNBX2TransportLayerAddresses = eNBX2TransportLayerAddresses_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public X2TNLConfigurationInfo (
      ENBX2TLAs eNBX2TransportLayerAddresses_
   ) {
      super();
      eNBX2TransportLayerAddresses = eNBX2TransportLayerAddresses_;
   }

   public void init () {
      eNBX2TransportLayerAddresses = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eNBX2TransportLayerAddresses;
         case 1: return iE_Extensions;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eNBX2TransportLayerAddresses";
         case 1: return "iE-Extensions";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode eNBX2TransportLayerAddresses

      buffer.getContext().eventDispatcher.startElement("eNBX2TransportLayerAddresses", -1);

      eNBX2TransportLayerAddresses = new ENBX2TLAs();
      eNBX2TransportLayerAddresses.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eNBX2TransportLayerAddresses", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new X2TNLConfigurationInfo_iE_Extensions();
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
      if (eNBX2TransportLayerAddresses != null) eNBX2TransportLayerAddresses.print (_sb, "eNBX2TransportLayerAddresses", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
