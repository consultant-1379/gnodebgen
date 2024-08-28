/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_SemiPersistentOnPUSCH_TriggerState extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-SemiPersistentOnPUSCH-TriggerState";
   }

   public CSI_ReportConfigId associatedReportConfigInfo;
   public Asn1OpenExt extElem1;

   public CSI_SemiPersistentOnPUSCH_TriggerState () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_SemiPersistentOnPUSCH_TriggerState (
      CSI_ReportConfigId associatedReportConfigInfo_
   ) {
      super();
      associatedReportConfigInfo = associatedReportConfigInfo_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_SemiPersistentOnPUSCH_TriggerState (long associatedReportConfigInfo_
   ) {
      super();
      associatedReportConfigInfo = new CSI_ReportConfigId (associatedReportConfigInfo_);
   }

   public void init () {
      associatedReportConfigInfo = null;
      extElem1 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return associatedReportConfigInfo;
         case 1: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "associatedReportConfigInfo";
         case 1: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode associatedReportConfigInfo

      buffer.getContext().eventDispatcher.startElement("associatedReportConfigInfo", -1);

      associatedReportConfigInfo = new CSI_ReportConfigId();
      associatedReportConfigInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("associatedReportConfigInfo", -1);

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
      if (associatedReportConfigInfo != null) associatedReportConfigInfo.print (_sb, "associatedReportConfigInfo", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
