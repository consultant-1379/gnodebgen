/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RMTC_Config_r13_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RMTC_Config_r13_setup_rmtc_Period_r13 rmtc_Period_r13 = null;
   public Asn1Integer rmtc_SubframeOffset_r13;  // optional
   public RMTC_Config_r13_setup_measDuration_r13 measDuration_r13 = null;
   public Asn1OpenExt extElem1;

   public RMTC_Config_r13_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RMTC_Config_r13_setup (
      RMTC_Config_r13_setup_rmtc_Period_r13 rmtc_Period_r13_,
      Asn1Integer rmtc_SubframeOffset_r13_,
      RMTC_Config_r13_setup_measDuration_r13 measDuration_r13_
   ) {
      super();
      rmtc_Period_r13 = rmtc_Period_r13_;
      rmtc_SubframeOffset_r13 = rmtc_SubframeOffset_r13_;
      measDuration_r13 = measDuration_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RMTC_Config_r13_setup (
      RMTC_Config_r13_setup_rmtc_Period_r13 rmtc_Period_r13_,
      RMTC_Config_r13_setup_measDuration_r13 measDuration_r13_
   ) {
      super();
      rmtc_Period_r13 = rmtc_Period_r13_;
      measDuration_r13 = measDuration_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RMTC_Config_r13_setup (RMTC_Config_r13_setup_rmtc_Period_r13 rmtc_Period_r13_,
      long rmtc_SubframeOffset_r13_,
      RMTC_Config_r13_setup_measDuration_r13 measDuration_r13_
   ) {
      super();
      rmtc_Period_r13 = rmtc_Period_r13_;
      rmtc_SubframeOffset_r13 = new Asn1Integer (rmtc_SubframeOffset_r13_);
      measDuration_r13 = measDuration_r13_;
   }

   public void init () {
      rmtc_Period_r13 = null;
      rmtc_SubframeOffset_r13 = null;
      measDuration_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rmtc_Period_r13;
         case 1: return rmtc_SubframeOffset_r13;
         case 2: return measDuration_r13;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rmtc-Period-r13";
         case 1: return "rmtc-SubframeOffset-r13";
         case 2: return "measDuration-r13";
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

      boolean rmtc_SubframeOffset_r13Present = buffer.decodeBit ("rmtc_SubframeOffset_r13Present");

      // decode rmtc_Period_r13

      buffer.getContext().eventDispatcher.startElement("rmtc_Period_r13", -1);

      {
         int tval = RMTC_Config_r13_setup_rmtc_Period_r13.decodeEnumValue (buffer);
         rmtc_Period_r13 = RMTC_Config_r13_setup_rmtc_Period_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("rmtc_Period_r13", -1);

      // decode rmtc_SubframeOffset_r13

      if (rmtc_SubframeOffset_r13Present) {
         buffer.getContext().eventDispatcher.startElement("rmtc_SubframeOffset_r13", -1);

         rmtc_SubframeOffset_r13 = new Asn1Integer();
         rmtc_SubframeOffset_r13.decode (buffer, 0, 639);

         buffer.invokeCharacters(rmtc_SubframeOffset_r13.toString());
         buffer.getContext().eventDispatcher.endElement("rmtc_SubframeOffset_r13", -1);
      }
      else {
         rmtc_SubframeOffset_r13 = null;
      }

      // decode measDuration_r13

      buffer.getContext().eventDispatcher.startElement("measDuration_r13", -1);

      {
         int tval = RMTC_Config_r13_setup_measDuration_r13.decodeEnumValue (buffer);
         measDuration_r13 = RMTC_Config_r13_setup_measDuration_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measDuration_r13", -1);

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
      if (rmtc_Period_r13 != null) rmtc_Period_r13.print (_sb, "rmtc_Period_r13", _level+1);
      if (rmtc_SubframeOffset_r13 != null) rmtc_SubframeOffset_r13.print (_sb, "rmtc_SubframeOffset_r13", _level+1);
      if (measDuration_r13 != null) measDuration_r13.print (_sb, "measDuration_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
