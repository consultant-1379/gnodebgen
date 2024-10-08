/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ServedGUMMEIsItem extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ServedGUMMEIsItem";
   }

   public ServedPLMNs servedPLMNs;
   public ServedGroupIDs servedGroupIDs;
   public ServedMMECs servedMMECs;
   public ServedGUMMEIsItem_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public ServedGUMMEIsItem () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ServedGUMMEIsItem (
      ServedPLMNs servedPLMNs_,
      ServedGroupIDs servedGroupIDs_,
      ServedMMECs servedMMECs_,
      ServedGUMMEIsItem_iE_Extensions iE_Extensions_
   ) {
      super();
      servedPLMNs = servedPLMNs_;
      servedGroupIDs = servedGroupIDs_;
      servedMMECs = servedMMECs_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ServedGUMMEIsItem (
      ServedPLMNs servedPLMNs_,
      ServedGroupIDs servedGroupIDs_,
      ServedMMECs servedMMECs_
   ) {
      super();
      servedPLMNs = servedPLMNs_;
      servedGroupIDs = servedGroupIDs_;
      servedMMECs = servedMMECs_;
   }

   public void init () {
      servedPLMNs = null;
      servedGroupIDs = null;
      servedMMECs = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return servedPLMNs;
         case 1: return servedGroupIDs;
         case 2: return servedMMECs;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "servedPLMNs";
         case 1: return "servedGroupIDs";
         case 2: return "servedMMECs";
         case 3: return "iE-Extensions";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode servedPLMNs

      buffer.getContext().eventDispatcher.startElement("servedPLMNs", -1);

      servedPLMNs = new ServedPLMNs();
      servedPLMNs.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servedPLMNs", -1);

      // decode servedGroupIDs

      buffer.getContext().eventDispatcher.startElement("servedGroupIDs", -1);

      servedGroupIDs = new ServedGroupIDs();
      servedGroupIDs.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servedGroupIDs", -1);

      // decode servedMMECs

      buffer.getContext().eventDispatcher.startElement("servedMMECs", -1);

      servedMMECs = new ServedMMECs();
      servedMMECs.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servedMMECs", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new ServedGUMMEIsItem_iE_Extensions();
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
      if (servedPLMNs != null) servedPLMNs.print (_sb, "servedPLMNs", _level+1);
      if (servedGroupIDs != null) servedGroupIDs.print (_sb, "servedGroupIDs", _level+1);
      if (servedMMECs != null) servedMMECs.print (_sb, "servedMMECs", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
