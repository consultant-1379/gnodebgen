/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ProSeAuthorized extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ProSeAuthorized";
   }

   public ProSeDirectDiscovery proSeDirectDiscovery = null;  // optional
   public ProSeDirectCommunication proSeDirectCommunication = null;  // optional
   public ProSeAuthorized_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public ProSeAuthorized () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ProSeAuthorized (
      ProSeDirectDiscovery proSeDirectDiscovery_,
      ProSeDirectCommunication proSeDirectCommunication_,
      ProSeAuthorized_iE_Extensions iE_Extensions_
   ) {
      super();
      proSeDirectDiscovery = proSeDirectDiscovery_;
      proSeDirectCommunication = proSeDirectCommunication_;
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      proSeDirectDiscovery = null;
      proSeDirectCommunication = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return proSeDirectDiscovery;
         case 1: return proSeDirectCommunication;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "proSeDirectDiscovery";
         case 1: return "proSeDirectCommunication";
         case 2: return "iE-Extensions";
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

      boolean proSeDirectDiscoveryPresent = buffer.decodeBit ("proSeDirectDiscoveryPresent");
      boolean proSeDirectCommunicationPresent = buffer.decodeBit ("proSeDirectCommunicationPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode proSeDirectDiscovery

      if (proSeDirectDiscoveryPresent) {
         buffer.getContext().eventDispatcher.startElement("proSeDirectDiscovery", -1);

         int tval = ProSeDirectDiscovery.decodeEnumValue (buffer);
         proSeDirectDiscovery = ProSeDirectDiscovery.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("proSeDirectDiscovery", -1);
      }
      else {
         proSeDirectDiscovery = null;
      }

      // decode proSeDirectCommunication

      if (proSeDirectCommunicationPresent) {
         buffer.getContext().eventDispatcher.startElement("proSeDirectCommunication", -1);

         int tval = ProSeDirectCommunication.decodeEnumValue (buffer);
         proSeDirectCommunication = ProSeDirectCommunication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("proSeDirectCommunication", -1);
      }
      else {
         proSeDirectCommunication = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new ProSeAuthorized_iE_Extensions();
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
      if (proSeDirectDiscovery != null) proSeDirectDiscovery.print (_sb, "proSeDirectDiscovery", _level+1);
      if (proSeDirectCommunication != null) proSeDirectCommunication.print (_sb, "proSeDirectCommunication", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
