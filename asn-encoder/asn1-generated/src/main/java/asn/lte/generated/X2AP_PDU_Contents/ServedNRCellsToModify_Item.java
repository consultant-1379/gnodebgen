/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.NRCGI;
import asn.lte.generated.X2AP_IEs.NRNeighbour_Information;
import asn.lte.generated.X2AP_IEs.DeactivationIndication;

public class ServedNRCellsToModify_Item extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ServedNRCellsToModify-Item";
   }

   public NRCGI old_nrcgi;
   public ServedNRCell_Information servedNRCellInformation;
   public NRNeighbour_Information nrNeighbourInformation;  // optional
   public DeactivationIndication nrDeactivationIndication = null;  // optional
   public ServedNRCellsToModify_Item_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public ServedNRCellsToModify_Item () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ServedNRCellsToModify_Item (
      NRCGI old_nrcgi_,
      ServedNRCell_Information servedNRCellInformation_,
      NRNeighbour_Information nrNeighbourInformation_,
      DeactivationIndication nrDeactivationIndication_,
      ServedNRCellsToModify_Item_iE_Extensions iE_Extensions_
   ) {
      super();
      old_nrcgi = old_nrcgi_;
      servedNRCellInformation = servedNRCellInformation_;
      nrNeighbourInformation = nrNeighbourInformation_;
      nrDeactivationIndication = nrDeactivationIndication_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ServedNRCellsToModify_Item (
      NRCGI old_nrcgi_,
      ServedNRCell_Information servedNRCellInformation_
   ) {
      super();
      old_nrcgi = old_nrcgi_;
      servedNRCellInformation = servedNRCellInformation_;
   }

   public void init () {
      old_nrcgi = null;
      servedNRCellInformation = null;
      nrNeighbourInformation = null;
      nrDeactivationIndication = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return old_nrcgi;
         case 1: return servedNRCellInformation;
         case 2: return nrNeighbourInformation;
         case 3: return nrDeactivationIndication;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "old-nrcgi";
         case 1: return "servedNRCellInformation";
         case 2: return "nrNeighbourInformation";
         case 3: return "nrDeactivationIndication";
         case 4: return "iE-Extensions";
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

      boolean nrNeighbourInformationPresent = buffer.decodeBit ("nrNeighbourInformationPresent");
      boolean nrDeactivationIndicationPresent = buffer.decodeBit ("nrDeactivationIndicationPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode old_nrcgi

      buffer.getContext().eventDispatcher.startElement("old_nrcgi", -1);

      old_nrcgi = new NRCGI();
      old_nrcgi.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("old_nrcgi", -1);

      // decode servedNRCellInformation

      buffer.getContext().eventDispatcher.startElement("servedNRCellInformation", -1);

      servedNRCellInformation = new ServedNRCell_Information();
      servedNRCellInformation.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servedNRCellInformation", -1);

      // decode nrNeighbourInformation

      if (nrNeighbourInformationPresent) {
         buffer.getContext().eventDispatcher.startElement("nrNeighbourInformation", -1);

         nrNeighbourInformation = new NRNeighbour_Information();
         nrNeighbourInformation.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nrNeighbourInformation", -1);
      }
      else {
         nrNeighbourInformation = null;
      }

      // decode nrDeactivationIndication

      if (nrDeactivationIndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("nrDeactivationIndication", -1);

         int tval = DeactivationIndication.decodeEnumValue (buffer);
         nrDeactivationIndication = DeactivationIndication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nrDeactivationIndication", -1);
      }
      else {
         nrDeactivationIndication = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new ServedNRCellsToModify_Item_iE_Extensions();
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
      if (old_nrcgi != null) old_nrcgi.print (_sb, "old_nrcgi", _level+1);
      if (servedNRCellInformation != null) servedNRCellInformation.print (_sb, "servedNRCellInformation", _level+1);
      if (nrNeighbourInformation != null) nrNeighbourInformation.print (_sb, "nrNeighbourInformation", _level+1);
      if (nrDeactivationIndication != null) nrDeactivationIndication.print (_sb, "nrDeactivationIndication", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
