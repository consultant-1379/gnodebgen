/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandParameters-r13";
   }

   public FreqBandIndicator_r11 bandEUTRA_r13;
   public BandParametersUL_r13 bandParametersUL_r13;  // optional
   public BandParametersDL_r13 bandParametersDL_r13;  // optional
   public BandParameters_r13_supportedCSI_Proc_r13 supportedCSI_Proc_r13 = null;  // optional

   public BandParameters_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParameters_r13 (
      FreqBandIndicator_r11 bandEUTRA_r13_,
      BandParametersUL_r13 bandParametersUL_r13_,
      BandParametersDL_r13 bandParametersDL_r13_,
      BandParameters_r13_supportedCSI_Proc_r13 supportedCSI_Proc_r13_
   ) {
      super();
      bandEUTRA_r13 = bandEUTRA_r13_;
      bandParametersUL_r13 = bandParametersUL_r13_;
      bandParametersDL_r13 = bandParametersDL_r13_;
      supportedCSI_Proc_r13 = supportedCSI_Proc_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandParameters_r13 (
      FreqBandIndicator_r11 bandEUTRA_r13_
   ) {
      super();
      bandEUTRA_r13 = bandEUTRA_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandParameters_r13 (long bandEUTRA_r13_,
      BandParametersUL_r13 bandParametersUL_r13_,
      BandParametersDL_r13 bandParametersDL_r13_,
      BandParameters_r13_supportedCSI_Proc_r13 supportedCSI_Proc_r13_
   ) {
      super();
      bandEUTRA_r13 = new FreqBandIndicator_r11 (bandEUTRA_r13_);
      bandParametersUL_r13 = bandParametersUL_r13_;
      bandParametersDL_r13 = bandParametersDL_r13_;
      supportedCSI_Proc_r13 = supportedCSI_Proc_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public BandParameters_r13 (
      long bandEUTRA_r13_
   ) {
      super();
      bandEUTRA_r13 = new FreqBandIndicator_r11 (bandEUTRA_r13_);
   }

   public void init () {
      bandEUTRA_r13 = null;
      bandParametersUL_r13 = null;
      bandParametersDL_r13 = null;
      supportedCSI_Proc_r13 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandEUTRA_r13;
         case 1: return bandParametersUL_r13;
         case 2: return bandParametersDL_r13;
         case 3: return supportedCSI_Proc_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandEUTRA-r13";
         case 1: return "bandParametersUL-r13";
         case 2: return "bandParametersDL-r13";
         case 3: return "supportedCSI-Proc-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bandParametersUL_r13Present = buffer.decodeBit ("bandParametersUL_r13Present");
      boolean bandParametersDL_r13Present = buffer.decodeBit ("bandParametersDL_r13Present");
      boolean supportedCSI_Proc_r13Present = buffer.decodeBit ("supportedCSI_Proc_r13Present");

      // decode bandEUTRA_r13

      buffer.getContext().eventDispatcher.startElement("bandEUTRA_r13", -1);

      bandEUTRA_r13 = new FreqBandIndicator_r11();
      bandEUTRA_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandEUTRA_r13", -1);

      // decode bandParametersUL_r13

      if (bandParametersUL_r13Present) {
         buffer.getContext().eventDispatcher.startElement("bandParametersUL_r13", -1);

         bandParametersUL_r13 = new BandParametersUL_r13();
         bandParametersUL_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandParametersUL_r13", -1);
      }
      else {
         bandParametersUL_r13 = null;
      }

      // decode bandParametersDL_r13

      if (bandParametersDL_r13Present) {
         buffer.getContext().eventDispatcher.startElement("bandParametersDL_r13", -1);

         bandParametersDL_r13 = new BandParametersDL_r13();
         bandParametersDL_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandParametersDL_r13", -1);
      }
      else {
         bandParametersDL_r13 = null;
      }

      // decode supportedCSI_Proc_r13

      if (supportedCSI_Proc_r13Present) {
         buffer.getContext().eventDispatcher.startElement("supportedCSI_Proc_r13", -1);

         int tval = BandParameters_r13_supportedCSI_Proc_r13.decodeEnumValue (buffer);
         supportedCSI_Proc_r13 = BandParameters_r13_supportedCSI_Proc_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportedCSI_Proc_r13", -1);
      }
      else {
         supportedCSI_Proc_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandEUTRA_r13 != null) bandEUTRA_r13.print (_sb, "bandEUTRA_r13", _level+1);
      if (bandParametersUL_r13 != null) bandParametersUL_r13.print (_sb, "bandParametersUL_r13", _level+1);
      if (bandParametersDL_r13 != null) bandParametersDL_r13.print (_sb, "bandParametersDL_r13", _level+1);
      if (supportedCSI_Proc_r13 != null) supportedCSI_Proc_r13.print (_sb, "supportedCSI_Proc_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
