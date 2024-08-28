/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_IEs;

import com.objsys.asn1j.runtime.*;

public class EAB_eNB_DL_CA_Capability extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-eNB-DL-CA-Capability";
   }

   public Asn1Integer dl_AggregationCapacity;
   public EAB_CA_IntraBandCapability dl_IntraBandCapability = null;
   public EAB_eNB_DL_CA_Capability_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public EAB_eNB_DL_CA_Capability () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_eNB_DL_CA_Capability (
      Asn1Integer dl_AggregationCapacity_,
      EAB_CA_IntraBandCapability dl_IntraBandCapability_,
      EAB_eNB_DL_CA_Capability_iE_Extensions iE_Extensions_
   ) {
      super();
      dl_AggregationCapacity = dl_AggregationCapacity_;
      dl_IntraBandCapability = dl_IntraBandCapability_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public EAB_eNB_DL_CA_Capability (
      Asn1Integer dl_AggregationCapacity_,
      EAB_CA_IntraBandCapability dl_IntraBandCapability_
   ) {
      super();
      dl_AggregationCapacity = dl_AggregationCapacity_;
      dl_IntraBandCapability = dl_IntraBandCapability_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EAB_eNB_DL_CA_Capability (long dl_AggregationCapacity_,
      EAB_CA_IntraBandCapability dl_IntraBandCapability_,
      EAB_eNB_DL_CA_Capability_iE_Extensions iE_Extensions_
   ) {
      super();
      dl_AggregationCapacity = new Asn1Integer (dl_AggregationCapacity_);
      dl_IntraBandCapability = dl_IntraBandCapability_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public EAB_eNB_DL_CA_Capability (
      long dl_AggregationCapacity_,
      EAB_CA_IntraBandCapability dl_IntraBandCapability_
   ) {
      super();
      dl_AggregationCapacity = new Asn1Integer (dl_AggregationCapacity_);
      dl_IntraBandCapability = dl_IntraBandCapability_;
   }

   public void init () {
      dl_AggregationCapacity = null;
      dl_IntraBandCapability = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_AggregationCapacity;
         case 1: return dl_IntraBandCapability;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-AggregationCapacity";
         case 1: return "dl-IntraBandCapability";
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

      // decode dl_AggregationCapacity

      buffer.getContext().eventDispatcher.startElement("dl_AggregationCapacity", -1);

      dl_AggregationCapacity = new Asn1Integer();
      boolean extbit_1 = buffer.decodeBit ("extbit_1");
      if (!extbit_1) {
         dl_AggregationCapacity.decode (buffer, 2, 9);
      }
      else {
         dl_AggregationCapacity.decode (buffer);
      }

      buffer.invokeCharacters(dl_AggregationCapacity.toString());
      buffer.getContext().eventDispatcher.endElement("dl_AggregationCapacity", -1);

      // decode dl_IntraBandCapability

      buffer.getContext().eventDispatcher.startElement("dl_IntraBandCapability", -1);

      {
         int tval = EAB_CA_IntraBandCapability.decodeEnumValue (buffer);
         dl_IntraBandCapability = EAB_CA_IntraBandCapability.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("dl_IntraBandCapability", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new EAB_eNB_DL_CA_Capability_iE_Extensions();
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
      if (dl_AggregationCapacity != null) dl_AggregationCapacity.print (_sb, "dl_AggregationCapacity", _level+1);
      if (dl_IntraBandCapability != null) dl_IntraBandCapability.print (_sb, "dl_IntraBandCapability", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
