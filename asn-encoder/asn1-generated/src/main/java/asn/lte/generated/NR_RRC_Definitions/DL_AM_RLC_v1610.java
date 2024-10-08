/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_AM_RLC_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DL-AM-RLC-v1610";
   }

   public T_StatusProhibit_v1610 t_StatusProhibit_v1610 = null;  // optional
   public Asn1OpenExt extElem1;

   public DL_AM_RLC_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_AM_RLC_v1610 (
      T_StatusProhibit_v1610 t_StatusProhibit_v1610_
   ) {
      super();
      t_StatusProhibit_v1610 = t_StatusProhibit_v1610_;
   }

   public void init () {
      t_StatusProhibit_v1610 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return t_StatusProhibit_v1610;
         case 1: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "t-StatusProhibit-v1610";
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

      // optional bits

      boolean t_StatusProhibit_v1610Present = buffer.decodeBit ("t_StatusProhibit_v1610Present");

      // decode t_StatusProhibit_v1610

      if (t_StatusProhibit_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("t_StatusProhibit_v1610", -1);

         int tval = T_StatusProhibit_v1610.decodeEnumValue (buffer);
         t_StatusProhibit_v1610 = T_StatusProhibit_v1610.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("t_StatusProhibit_v1610", -1);
      }
      else {
         t_StatusProhibit_v1610 = null;
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
      if (t_StatusProhibit_v1610 != null) t_StatusProhibit_v1610.print (_sb, "t_StatusProhibit_v1610", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
