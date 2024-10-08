/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_IEs;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.ECGI;

public class EAB_eNB1_OverlaidCell_Item extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-eNB1-OverlaidCell-Item";
   }

   public ECGI eNB1_Cell_ID;
   public EAB_eNB2_OverlaidCell_List eNB1_OverlaidCell_List;  // optional
   public EAB_eNB1_OverlaidCell_Item_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public EAB_eNB1_OverlaidCell_Item () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_eNB1_OverlaidCell_Item (
      ECGI eNB1_Cell_ID_,
      EAB_eNB2_OverlaidCell_List eNB1_OverlaidCell_List_,
      EAB_eNB1_OverlaidCell_Item_iE_Extensions iE_Extensions_
   ) {
      super();
      eNB1_Cell_ID = eNB1_Cell_ID_;
      eNB1_OverlaidCell_List = eNB1_OverlaidCell_List_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public EAB_eNB1_OverlaidCell_Item (
      ECGI eNB1_Cell_ID_
   ) {
      super();
      eNB1_Cell_ID = eNB1_Cell_ID_;
   }

   public void init () {
      eNB1_Cell_ID = null;
      eNB1_OverlaidCell_List = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eNB1_Cell_ID;
         case 1: return eNB1_OverlaidCell_List;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eNB1-Cell-ID";
         case 1: return "eNB1-OverlaidCell-List";
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

      boolean eNB1_OverlaidCell_ListPresent = buffer.decodeBit ("eNB1_OverlaidCell_ListPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode eNB1_Cell_ID

      buffer.getContext().eventDispatcher.startElement("eNB1_Cell_ID", -1);

      eNB1_Cell_ID = new ECGI();
      eNB1_Cell_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eNB1_Cell_ID", -1);

      // decode eNB1_OverlaidCell_List

      if (eNB1_OverlaidCell_ListPresent) {
         buffer.getContext().eventDispatcher.startElement("eNB1_OverlaidCell_List", -1);

         eNB1_OverlaidCell_List = new EAB_eNB2_OverlaidCell_List();
         eNB1_OverlaidCell_List.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("eNB1_OverlaidCell_List", -1);
      }
      else {
         eNB1_OverlaidCell_List = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new EAB_eNB1_OverlaidCell_Item_iE_Extensions();
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
      if (eNB1_Cell_ID != null) eNB1_Cell_ID.print (_sb, "eNB1_Cell_ID", _level+1);
      if (eNB1_OverlaidCell_List != null) eNB1_OverlaidCell_List.print (_sb, "eNB1_OverlaidCell_List", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
