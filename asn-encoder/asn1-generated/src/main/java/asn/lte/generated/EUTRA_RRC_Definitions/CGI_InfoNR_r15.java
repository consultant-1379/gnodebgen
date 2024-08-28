/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CGI_InfoNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CGI-InfoNR-r15";
   }

   public PLMN_IdentityInfoListNR_r15 plmn_IdentityInfoList_r15;  // optional
   public MultiFrequencyBandListNR_r15 frequencyBandList_15;  // optional
   public CGI_InfoNR_r15_noSIB1_r15 noSIB1_r15;  // optional
   public Asn1OpenExt extElem1;

   public CGI_InfoNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CGI_InfoNR_r15 (
      PLMN_IdentityInfoListNR_r15 plmn_IdentityInfoList_r15_,
      MultiFrequencyBandListNR_r15 frequencyBandList_15_,
      CGI_InfoNR_r15_noSIB1_r15 noSIB1_r15_
   ) {
      super();
      plmn_IdentityInfoList_r15 = plmn_IdentityInfoList_r15_;
      frequencyBandList_15 = frequencyBandList_15_;
      noSIB1_r15 = noSIB1_r15_;
   }

   public void init () {
      plmn_IdentityInfoList_r15 = null;
      frequencyBandList_15 = null;
      noSIB1_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityInfoList_r15;
         case 1: return frequencyBandList_15;
         case 2: return noSIB1_r15;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityInfoList-r15";
         case 1: return "frequencyBandList-15";
         case 2: return "noSIB1-r15";
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

      boolean plmn_IdentityInfoList_r15Present = buffer.decodeBit ("plmn_IdentityInfoList_r15Present");
      boolean frequencyBandList_15Present = buffer.decodeBit ("frequencyBandList_15Present");
      boolean noSIB1_r15Present = buffer.decodeBit ("noSIB1_r15Present");

      // decode plmn_IdentityInfoList_r15

      if (plmn_IdentityInfoList_r15Present) {
         buffer.getContext().eventDispatcher.startElement("plmn_IdentityInfoList_r15", -1);

         plmn_IdentityInfoList_r15 = new PLMN_IdentityInfoListNR_r15();
         plmn_IdentityInfoList_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("plmn_IdentityInfoList_r15", -1);
      }
      else {
         plmn_IdentityInfoList_r15 = null;
      }

      // decode frequencyBandList_15

      if (frequencyBandList_15Present) {
         buffer.getContext().eventDispatcher.startElement("frequencyBandList_15", -1);

         frequencyBandList_15 = new MultiFrequencyBandListNR_r15();
         frequencyBandList_15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("frequencyBandList_15", -1);
      }
      else {
         frequencyBandList_15 = null;
      }

      // decode noSIB1_r15

      if (noSIB1_r15Present) {
         buffer.getContext().eventDispatcher.startElement("noSIB1_r15", -1);

         noSIB1_r15 = new CGI_InfoNR_r15_noSIB1_r15();
         noSIB1_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("noSIB1_r15", -1);
      }
      else {
         noSIB1_r15 = null;
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
      if (plmn_IdentityInfoList_r15 != null) plmn_IdentityInfoList_r15.print (_sb, "plmn_IdentityInfoList_r15", _level+1);
      if (frequencyBandList_15 != null) frequencyBandList_15.print (_sb, "frequencyBandList_15", _level+1);
      if (noSIB1_r15 != null) noSIB1_r15.print (_sb, "noSIB1_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
