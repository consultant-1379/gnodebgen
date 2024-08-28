/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PMCH_Config_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PMCH-Config-r9";
   }

   public Asn1Integer sf_AllocEnd_r9;
   public Asn1Integer dataMCS_r9;
   public PMCH_Config_r9_mch_SchedulingPeriod_r9 mch_SchedulingPeriod_r9 = null;
   public Asn1OpenExt extElem1;

   public PMCH_Config_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PMCH_Config_r9 (
      Asn1Integer sf_AllocEnd_r9_,
      Asn1Integer dataMCS_r9_,
      PMCH_Config_r9_mch_SchedulingPeriod_r9 mch_SchedulingPeriod_r9_
   ) {
      super();
      sf_AllocEnd_r9 = sf_AllocEnd_r9_;
      dataMCS_r9 = dataMCS_r9_;
      mch_SchedulingPeriod_r9 = mch_SchedulingPeriod_r9_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PMCH_Config_r9 (long sf_AllocEnd_r9_,
      long dataMCS_r9_,
      PMCH_Config_r9_mch_SchedulingPeriod_r9 mch_SchedulingPeriod_r9_
   ) {
      super();
      sf_AllocEnd_r9 = new Asn1Integer (sf_AllocEnd_r9_);
      dataMCS_r9 = new Asn1Integer (dataMCS_r9_);
      mch_SchedulingPeriod_r9 = mch_SchedulingPeriod_r9_;
   }

   public void init () {
      sf_AllocEnd_r9 = null;
      dataMCS_r9 = null;
      mch_SchedulingPeriod_r9 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sf_AllocEnd_r9;
         case 1: return dataMCS_r9;
         case 2: return mch_SchedulingPeriod_r9;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sf-AllocEnd-r9";
         case 1: return "dataMCS-r9";
         case 2: return "mch-SchedulingPeriod-r9";
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

      // decode sf_AllocEnd_r9

      buffer.getContext().eventDispatcher.startElement("sf_AllocEnd_r9", -1);

      sf_AllocEnd_r9 = new Asn1Integer();
      sf_AllocEnd_r9.decode (buffer, 0, 1535);

      buffer.invokeCharacters(sf_AllocEnd_r9.toString());
      buffer.getContext().eventDispatcher.endElement("sf_AllocEnd_r9", -1);

      // decode dataMCS_r9

      buffer.getContext().eventDispatcher.startElement("dataMCS_r9", -1);

      dataMCS_r9 = new Asn1Integer();
      dataMCS_r9.decode (buffer, 0, 28);

      buffer.invokeCharacters(dataMCS_r9.toString());
      buffer.getContext().eventDispatcher.endElement("dataMCS_r9", -1);

      // decode mch_SchedulingPeriod_r9

      buffer.getContext().eventDispatcher.startElement("mch_SchedulingPeriod_r9", -1);

      {
         int tval = PMCH_Config_r9_mch_SchedulingPeriod_r9.decodeEnumValue (buffer);
         mch_SchedulingPeriod_r9 = PMCH_Config_r9_mch_SchedulingPeriod_r9.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mch_SchedulingPeriod_r9", -1);

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
      if (sf_AllocEnd_r9 != null) sf_AllocEnd_r9.print (_sb, "sf_AllocEnd_r9", _level+1);
      if (dataMCS_r9 != null) dataMCS_r9.print (_sb, "dataMCS_r9", _level+1);
      if (mch_SchedulingPeriod_r9 != null) mch_SchedulingPeriod_r9.print (_sb, "mch_SchedulingPeriod_r9", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
