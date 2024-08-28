/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class GUMMEI extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "GUMMEI";
   }

   public GU_Group_ID gU_Group_ID;
   public MME_Code mME_Code;
   public GUMMEI_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public GUMMEI () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public GUMMEI (
      GU_Group_ID gU_Group_ID_,
      MME_Code mME_Code_,
      GUMMEI_iE_Extensions iE_Extensions_
   ) {
      super();
      gU_Group_ID = gU_Group_ID_;
      mME_Code = mME_Code_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public GUMMEI (
      GU_Group_ID gU_Group_ID_,
      MME_Code mME_Code_
   ) {
      super();
      gU_Group_ID = gU_Group_ID_;
      mME_Code = mME_Code_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public GUMMEI (GU_Group_ID gU_Group_ID_,
      byte[] mME_Code_,
      GUMMEI_iE_Extensions iE_Extensions_
   ) {
      super();
      gU_Group_ID = gU_Group_ID_;
      mME_Code = new MME_Code (mME_Code_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public GUMMEI (
      GU_Group_ID gU_Group_ID_,
      byte[] mME_Code_
   ) {
      super();
      gU_Group_ID = gU_Group_ID_;
      mME_Code = new MME_Code (mME_Code_);
   }

   public void init () {
      gU_Group_ID = null;
      mME_Code = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gU_Group_ID;
         case 1: return mME_Code;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gU-Group-ID";
         case 1: return "mME-Code";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode gU_Group_ID

      buffer.getContext().eventDispatcher.startElement("gU_Group_ID", -1);

      gU_Group_ID = new GU_Group_ID();
      gU_Group_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("gU_Group_ID", -1);

      // decode mME_Code

      buffer.getContext().eventDispatcher.startElement("mME_Code", -1);

      mME_Code = new MME_Code();
      mME_Code.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mME_Code", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new GUMMEI_iE_Extensions();
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
      if (gU_Group_ID != null) gU_Group_ID.print (_sb, "gU_Group_ID", _level+1);
      if (mME_Code != null) mME_Code.print (_sb, "mME_Code", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
