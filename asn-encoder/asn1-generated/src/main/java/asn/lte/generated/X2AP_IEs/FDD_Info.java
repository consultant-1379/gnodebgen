/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class FDD_Info extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FDD-Info";
   }

   public EARFCN uL_EARFCN;
   public EARFCN dL_EARFCN;
   public Transmission_Bandwidth uL_Transmission_Bandwidth = null;
   public Transmission_Bandwidth dL_Transmission_Bandwidth = null;
   public FDD_Info_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public FDD_Info () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FDD_Info (
      EARFCN uL_EARFCN_,
      EARFCN dL_EARFCN_,
      Transmission_Bandwidth uL_Transmission_Bandwidth_,
      Transmission_Bandwidth dL_Transmission_Bandwidth_,
      FDD_Info_iE_Extensions iE_Extensions_
   ) {
      super();
      uL_EARFCN = uL_EARFCN_;
      dL_EARFCN = dL_EARFCN_;
      uL_Transmission_Bandwidth = uL_Transmission_Bandwidth_;
      dL_Transmission_Bandwidth = dL_Transmission_Bandwidth_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FDD_Info (
      EARFCN uL_EARFCN_,
      EARFCN dL_EARFCN_,
      Transmission_Bandwidth uL_Transmission_Bandwidth_,
      Transmission_Bandwidth dL_Transmission_Bandwidth_
   ) {
      super();
      uL_EARFCN = uL_EARFCN_;
      dL_EARFCN = dL_EARFCN_;
      uL_Transmission_Bandwidth = uL_Transmission_Bandwidth_;
      dL_Transmission_Bandwidth = dL_Transmission_Bandwidth_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public FDD_Info (long uL_EARFCN_,
      long dL_EARFCN_,
      Transmission_Bandwidth uL_Transmission_Bandwidth_,
      Transmission_Bandwidth dL_Transmission_Bandwidth_,
      FDD_Info_iE_Extensions iE_Extensions_
   ) {
      super();
      uL_EARFCN = new EARFCN (uL_EARFCN_);
      dL_EARFCN = new EARFCN (dL_EARFCN_);
      uL_Transmission_Bandwidth = uL_Transmission_Bandwidth_;
      dL_Transmission_Bandwidth = dL_Transmission_Bandwidth_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public FDD_Info (
      long uL_EARFCN_,
      long dL_EARFCN_,
      Transmission_Bandwidth uL_Transmission_Bandwidth_,
      Transmission_Bandwidth dL_Transmission_Bandwidth_
   ) {
      super();
      uL_EARFCN = new EARFCN (uL_EARFCN_);
      dL_EARFCN = new EARFCN (dL_EARFCN_);
      uL_Transmission_Bandwidth = uL_Transmission_Bandwidth_;
      dL_Transmission_Bandwidth = dL_Transmission_Bandwidth_;
   }

   public void init () {
      uL_EARFCN = null;
      dL_EARFCN = null;
      uL_Transmission_Bandwidth = null;
      dL_Transmission_Bandwidth = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return uL_EARFCN;
         case 1: return dL_EARFCN;
         case 2: return uL_Transmission_Bandwidth;
         case 3: return dL_Transmission_Bandwidth;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "uL-EARFCN";
         case 1: return "dL-EARFCN";
         case 2: return "uL-Transmission-Bandwidth";
         case 3: return "dL-Transmission-Bandwidth";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode uL_EARFCN

      buffer.getContext().eventDispatcher.startElement("uL_EARFCN", -1);

      uL_EARFCN = new EARFCN();
      uL_EARFCN.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uL_EARFCN", -1);

      // decode dL_EARFCN

      buffer.getContext().eventDispatcher.startElement("dL_EARFCN", -1);

      dL_EARFCN = new EARFCN();
      dL_EARFCN.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dL_EARFCN", -1);

      // decode uL_Transmission_Bandwidth

      buffer.getContext().eventDispatcher.startElement("uL_Transmission_Bandwidth", -1);

      {
         int tval = Transmission_Bandwidth.decodeEnumValue (buffer);
         uL_Transmission_Bandwidth = Transmission_Bandwidth.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("uL_Transmission_Bandwidth", -1);

      // decode dL_Transmission_Bandwidth

      buffer.getContext().eventDispatcher.startElement("dL_Transmission_Bandwidth", -1);

      {
         int tval = Transmission_Bandwidth.decodeEnumValue (buffer);
         dL_Transmission_Bandwidth = Transmission_Bandwidth.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("dL_Transmission_Bandwidth", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new FDD_Info_iE_Extensions();
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
      if (uL_EARFCN != null) uL_EARFCN.print (_sb, "uL_EARFCN", _level+1);
      if (dL_EARFCN != null) dL_EARFCN.print (_sb, "dL_EARFCN", _level+1);
      if (uL_Transmission_Bandwidth != null) uL_Transmission_Bandwidth.print (_sb, "uL_Transmission_Bandwidth", _level+1);
      if (dL_Transmission_Bandwidth != null) dL_Transmission_Bandwidth.print (_sb, "dL_Transmission_Bandwidth", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
