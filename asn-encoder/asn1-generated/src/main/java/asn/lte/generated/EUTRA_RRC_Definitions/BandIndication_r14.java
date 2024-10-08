/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandIndication_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandIndication-r14";
   }

   public FreqBandIndicator_r11 bandEUTRA_r14;
   public CA_BandwidthClass_r10 ca_BandwidthClassDL_r14 = null;
   public CA_BandwidthClass_r10 ca_BandwidthClassUL_r14 = null;  // optional

   public BandIndication_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandIndication_r14 (
      FreqBandIndicator_r11 bandEUTRA_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassDL_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassUL_r14_
   ) {
      super();
      bandEUTRA_r14 = bandEUTRA_r14_;
      ca_BandwidthClassDL_r14 = ca_BandwidthClassDL_r14_;
      ca_BandwidthClassUL_r14 = ca_BandwidthClassUL_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandIndication_r14 (
      FreqBandIndicator_r11 bandEUTRA_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassDL_r14_
   ) {
      super();
      bandEUTRA_r14 = bandEUTRA_r14_;
      ca_BandwidthClassDL_r14 = ca_BandwidthClassDL_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandIndication_r14 (long bandEUTRA_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassDL_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassUL_r14_
   ) {
      super();
      bandEUTRA_r14 = new FreqBandIndicator_r11 (bandEUTRA_r14_);
      ca_BandwidthClassDL_r14 = ca_BandwidthClassDL_r14_;
      ca_BandwidthClassUL_r14 = ca_BandwidthClassUL_r14_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public BandIndication_r14 (
      long bandEUTRA_r14_,
      CA_BandwidthClass_r10 ca_BandwidthClassDL_r14_
   ) {
      super();
      bandEUTRA_r14 = new FreqBandIndicator_r11 (bandEUTRA_r14_);
      ca_BandwidthClassDL_r14 = ca_BandwidthClassDL_r14_;
   }

   public void init () {
      bandEUTRA_r14 = null;
      ca_BandwidthClassDL_r14 = null;
      ca_BandwidthClassUL_r14 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandEUTRA_r14;
         case 1: return ca_BandwidthClassDL_r14;
         case 2: return ca_BandwidthClassUL_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandEUTRA-r14";
         case 1: return "ca-BandwidthClassDL-r14";
         case 2: return "ca-BandwidthClassUL-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ca_BandwidthClassUL_r14Present = buffer.decodeBit ("ca_BandwidthClassUL_r14Present");

      // decode bandEUTRA_r14

      buffer.getContext().eventDispatcher.startElement("bandEUTRA_r14", -1);

      bandEUTRA_r14 = new FreqBandIndicator_r11();
      bandEUTRA_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandEUTRA_r14", -1);

      // decode ca_BandwidthClassDL_r14

      buffer.getContext().eventDispatcher.startElement("ca_BandwidthClassDL_r14", -1);

      {
         int tval = CA_BandwidthClass_r10.decodeEnumValue (buffer);
         ca_BandwidthClassDL_r14 = CA_BandwidthClass_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ca_BandwidthClassDL_r14", -1);

      // decode ca_BandwidthClassUL_r14

      if (ca_BandwidthClassUL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("ca_BandwidthClassUL_r14", -1);

         int tval = CA_BandwidthClass_r10.decodeEnumValue (buffer);
         ca_BandwidthClassUL_r14 = CA_BandwidthClass_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ca_BandwidthClassUL_r14", -1);
      }
      else {
         ca_BandwidthClassUL_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandEUTRA_r14 != null) bandEUTRA_r14.print (_sb, "bandEUTRA_r14", _level+1);
      if (ca_BandwidthClassDL_r14 != null) ca_BandwidthClassDL_r14.print (_sb, "ca_BandwidthClassDL_r14", _level+1);
      if (ca_BandwidthClassUL_r14 != null) ca_BandwidthClassUL_r14.print (_sb, "ca_BandwidthClassUL_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
