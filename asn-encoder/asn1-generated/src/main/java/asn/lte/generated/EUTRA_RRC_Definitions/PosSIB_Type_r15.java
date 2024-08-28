/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PosSIB_Type_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PosSIB-Type-r15";
   }

   public PosSIB_Type_r15_encrypted_r15 encrypted_r15 = null;  // optional
   public GNSS_ID_r15 gnss_id_r15;  // optional
   public SBAS_ID_r15 sbas_id_r15;  // optional
   public PosSIB_Type_r15_posSibType_r15 posSibType_r15 = null;
   public Asn1OpenExt extElem1;

   public PosSIB_Type_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PosSIB_Type_r15 (
      PosSIB_Type_r15_encrypted_r15 encrypted_r15_,
      GNSS_ID_r15 gnss_id_r15_,
      SBAS_ID_r15 sbas_id_r15_,
      PosSIB_Type_r15_posSibType_r15 posSibType_r15_
   ) {
      super();
      encrypted_r15 = encrypted_r15_;
      gnss_id_r15 = gnss_id_r15_;
      sbas_id_r15 = sbas_id_r15_;
      posSibType_r15 = posSibType_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PosSIB_Type_r15 (
      PosSIB_Type_r15_posSibType_r15 posSibType_r15_
   ) {
      super();
      posSibType_r15 = posSibType_r15_;
   }

   public void init () {
      encrypted_r15 = null;
      gnss_id_r15 = null;
      sbas_id_r15 = null;
      posSibType_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return encrypted_r15;
         case 1: return gnss_id_r15;
         case 2: return sbas_id_r15;
         case 3: return posSibType_r15;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "encrypted-r15";
         case 1: return "gnss-id-r15";
         case 2: return "sbas-id-r15";
         case 3: return "posSibType-r15";
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

      boolean encrypted_r15Present = buffer.decodeBit ("encrypted_r15Present");
      boolean gnss_id_r15Present = buffer.decodeBit ("gnss_id_r15Present");
      boolean sbas_id_r15Present = buffer.decodeBit ("sbas_id_r15Present");

      // decode encrypted_r15

      if (encrypted_r15Present) {
         buffer.getContext().eventDispatcher.startElement("encrypted_r15", -1);

         int tval = PosSIB_Type_r15_encrypted_r15.decodeEnumValue (buffer);
         encrypted_r15 = PosSIB_Type_r15_encrypted_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("encrypted_r15", -1);
      }
      else {
         encrypted_r15 = null;
      }

      // decode gnss_id_r15

      if (gnss_id_r15Present) {
         buffer.getContext().eventDispatcher.startElement("gnss_id_r15", -1);

         gnss_id_r15 = new GNSS_ID_r15();
         gnss_id_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("gnss_id_r15", -1);
      }
      else {
         gnss_id_r15 = null;
      }

      // decode sbas_id_r15

      if (sbas_id_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sbas_id_r15", -1);

         sbas_id_r15 = new SBAS_ID_r15();
         sbas_id_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sbas_id_r15", -1);
      }
      else {
         sbas_id_r15 = null;
      }

      // decode posSibType_r15

      buffer.getContext().eventDispatcher.startElement("posSibType_r15", -1);

      {
         int tval = PosSIB_Type_r15_posSibType_r15.decodeEnumValue (buffer);
         posSibType_r15 = PosSIB_Type_r15_posSibType_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("posSibType_r15", -1);

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
      if (encrypted_r15 != null) encrypted_r15.print (_sb, "encrypted_r15", _level+1);
      if (gnss_id_r15 != null) gnss_id_r15.print (_sb, "gnss_id_r15", _level+1);
      if (sbas_id_r15 != null) sbas_id_r15.print (_sb, "sbas_id_r15", _level+1);
      if (posSibType_r15 != null) posSibType_r15.print (_sb, "posSibType_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
