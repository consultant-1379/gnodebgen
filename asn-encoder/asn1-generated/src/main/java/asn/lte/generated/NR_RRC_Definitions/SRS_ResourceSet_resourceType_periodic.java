/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_ResourceSet_resourceType_periodic extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public NZP_CSI_RS_ResourceId associatedCSI_RS;  // optional
   public Asn1OpenExt extElem1;

   public SRS_ResourceSet_resourceType_periodic () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_ResourceSet_resourceType_periodic (
      NZP_CSI_RS_ResourceId associatedCSI_RS_
   ) {
      super();
      associatedCSI_RS = associatedCSI_RS_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_ResourceSet_resourceType_periodic (long associatedCSI_RS_
   ) {
      super();
      associatedCSI_RS = new NZP_CSI_RS_ResourceId (associatedCSI_RS_);
   }

   public void init () {
      associatedCSI_RS = null;
      extElem1 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return associatedCSI_RS;
         case 1: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "associatedCSI-RS";
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

      boolean associatedCSI_RSPresent = buffer.decodeBit ("associatedCSI_RSPresent");

      // decode associatedCSI_RS

      if (associatedCSI_RSPresent) {
         buffer.getContext().eventDispatcher.startElement("associatedCSI_RS", -1);

         associatedCSI_RS = new NZP_CSI_RS_ResourceId();
         associatedCSI_RS.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("associatedCSI_RS", -1);
      }
      else {
         associatedCSI_RS = null;
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
      if (associatedCSI_RS != null) associatedCSI_RS.print (_sb, "associatedCSI_RS", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
