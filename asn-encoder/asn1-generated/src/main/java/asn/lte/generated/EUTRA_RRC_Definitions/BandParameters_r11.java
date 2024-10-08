/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandParameters-r11";
   }

   public FreqBandIndicator_r11 bandEUTRA_r11;
   public BandParametersUL_r10 bandParametersUL_r11;  // optional
   public BandParametersDL_r10 bandParametersDL_r11;  // optional
   public BandParameters_r11_supportedCSI_Proc_r11 supportedCSI_Proc_r11 = null;  // optional

   public BandParameters_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParameters_r11 (
      FreqBandIndicator_r11 bandEUTRA_r11_,
      BandParametersUL_r10 bandParametersUL_r11_,
      BandParametersDL_r10 bandParametersDL_r11_,
      BandParameters_r11_supportedCSI_Proc_r11 supportedCSI_Proc_r11_
   ) {
      super();
      bandEUTRA_r11 = bandEUTRA_r11_;
      bandParametersUL_r11 = bandParametersUL_r11_;
      bandParametersDL_r11 = bandParametersDL_r11_;
      supportedCSI_Proc_r11 = supportedCSI_Proc_r11_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandParameters_r11 (
      FreqBandIndicator_r11 bandEUTRA_r11_
   ) {
      super();
      bandEUTRA_r11 = bandEUTRA_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandParameters_r11 (long bandEUTRA_r11_,
      BandParametersUL_r10 bandParametersUL_r11_,
      BandParametersDL_r10 bandParametersDL_r11_,
      BandParameters_r11_supportedCSI_Proc_r11 supportedCSI_Proc_r11_
   ) {
      super();
      bandEUTRA_r11 = new FreqBandIndicator_r11 (bandEUTRA_r11_);
      bandParametersUL_r11 = bandParametersUL_r11_;
      bandParametersDL_r11 = bandParametersDL_r11_;
      supportedCSI_Proc_r11 = supportedCSI_Proc_r11_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public BandParameters_r11 (
      long bandEUTRA_r11_
   ) {
      super();
      bandEUTRA_r11 = new FreqBandIndicator_r11 (bandEUTRA_r11_);
   }

   public void init () {
      bandEUTRA_r11 = null;
      bandParametersUL_r11 = null;
      bandParametersDL_r11 = null;
      supportedCSI_Proc_r11 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandEUTRA_r11;
         case 1: return bandParametersUL_r11;
         case 2: return bandParametersDL_r11;
         case 3: return supportedCSI_Proc_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandEUTRA-r11";
         case 1: return "bandParametersUL-r11";
         case 2: return "bandParametersDL-r11";
         case 3: return "supportedCSI-Proc-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bandParametersUL_r11Present = buffer.decodeBit ("bandParametersUL_r11Present");
      boolean bandParametersDL_r11Present = buffer.decodeBit ("bandParametersDL_r11Present");
      boolean supportedCSI_Proc_r11Present = buffer.decodeBit ("supportedCSI_Proc_r11Present");

      // decode bandEUTRA_r11

      buffer.getContext().eventDispatcher.startElement("bandEUTRA_r11", -1);

      bandEUTRA_r11 = new FreqBandIndicator_r11();
      bandEUTRA_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandEUTRA_r11", -1);

      // decode bandParametersUL_r11

      if (bandParametersUL_r11Present) {
         buffer.getContext().eventDispatcher.startElement("bandParametersUL_r11", -1);

         bandParametersUL_r11 = new BandParametersUL_r10();
         bandParametersUL_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandParametersUL_r11", -1);
      }
      else {
         bandParametersUL_r11 = null;
      }

      // decode bandParametersDL_r11

      if (bandParametersDL_r11Present) {
         buffer.getContext().eventDispatcher.startElement("bandParametersDL_r11", -1);

         bandParametersDL_r11 = new BandParametersDL_r10();
         bandParametersDL_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandParametersDL_r11", -1);
      }
      else {
         bandParametersDL_r11 = null;
      }

      // decode supportedCSI_Proc_r11

      if (supportedCSI_Proc_r11Present) {
         buffer.getContext().eventDispatcher.startElement("supportedCSI_Proc_r11", -1);

         int tval = BandParameters_r11_supportedCSI_Proc_r11.decodeEnumValue (buffer);
         supportedCSI_Proc_r11 = BandParameters_r11_supportedCSI_Proc_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportedCSI_Proc_r11", -1);
      }
      else {
         supportedCSI_Proc_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandEUTRA_r11 != null) bandEUTRA_r11.print (_sb, "bandEUTRA_r11", _level+1);
      if (bandParametersUL_r11 != null) bandParametersUL_r11.print (_sb, "bandParametersUL_r11", _level+1);
      if (bandParametersDL_r11 != null) bandParametersDL_r11.print (_sb, "bandParametersDL_r11", _level+1);
      if (supportedCSI_Proc_r11 != null) supportedCSI_Proc_r11.print (_sb, "supportedCSI_Proc_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
