/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class NB_IoT_Paging_eDRXInformation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NB-IoT-Paging-eDRXInformation";
   }

   public NB_IoT_Paging_eDRX_Cycle nB_IoT_paging_eDRX_Cycle = null;
   public NB_IoT_PagingTimeWindow nB_IoT_pagingTimeWindow = null;  // optional
   public NB_IoT_Paging_eDRXInformation_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public NB_IoT_Paging_eDRXInformation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NB_IoT_Paging_eDRXInformation (
      NB_IoT_Paging_eDRX_Cycle nB_IoT_paging_eDRX_Cycle_,
      NB_IoT_PagingTimeWindow nB_IoT_pagingTimeWindow_,
      NB_IoT_Paging_eDRXInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      nB_IoT_paging_eDRX_Cycle = nB_IoT_paging_eDRX_Cycle_;
      nB_IoT_pagingTimeWindow = nB_IoT_pagingTimeWindow_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NB_IoT_Paging_eDRXInformation (
      NB_IoT_Paging_eDRX_Cycle nB_IoT_paging_eDRX_Cycle_
   ) {
      super();
      nB_IoT_paging_eDRX_Cycle = nB_IoT_paging_eDRX_Cycle_;
   }

   public void init () {
      nB_IoT_paging_eDRX_Cycle = null;
      nB_IoT_pagingTimeWindow = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nB_IoT_paging_eDRX_Cycle;
         case 1: return nB_IoT_pagingTimeWindow;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nB-IoT-paging-eDRX-Cycle";
         case 1: return "nB-IoT-pagingTimeWindow";
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

      boolean nB_IoT_pagingTimeWindowPresent = buffer.decodeBit ("nB_IoT_pagingTimeWindowPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode nB_IoT_paging_eDRX_Cycle

      buffer.getContext().eventDispatcher.startElement("nB_IoT_paging_eDRX_Cycle", -1);

      {
         int tval = NB_IoT_Paging_eDRX_Cycle.decodeEnumValue (buffer);
         nB_IoT_paging_eDRX_Cycle = NB_IoT_Paging_eDRX_Cycle.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("nB_IoT_paging_eDRX_Cycle", -1);

      // decode nB_IoT_pagingTimeWindow

      if (nB_IoT_pagingTimeWindowPresent) {
         buffer.getContext().eventDispatcher.startElement("nB_IoT_pagingTimeWindow", -1);

         int tval = NB_IoT_PagingTimeWindow.decodeEnumValue (buffer);
         nB_IoT_pagingTimeWindow = NB_IoT_PagingTimeWindow.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nB_IoT_pagingTimeWindow", -1);
      }
      else {
         nB_IoT_pagingTimeWindow = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new NB_IoT_Paging_eDRXInformation_iE_Extensions();
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
      if (nB_IoT_paging_eDRX_Cycle != null) nB_IoT_paging_eDRX_Cycle.print (_sb, "nB_IoT_paging_eDRX_Cycle", _level+1);
      if (nB_IoT_pagingTimeWindow != null) nB_IoT_pagingTimeWindow.print (_sb, "nB_IoT_pagingTimeWindow", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
