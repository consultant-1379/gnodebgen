/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersMRDC_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasAndMobParametersMRDC-v1610";
   }

   public MeasAndMobParametersMRDC_Common_v1610 measAndMobParametersMRDC_Common_v1610;  // optional
   public MeasAndMobParametersMRDC_v1610_interNR_MeasEUTRA_IAB_r16 interNR_MeasEUTRA_IAB_r16 = null;  // optional

   public MeasAndMobParametersMRDC_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersMRDC_v1610 (
      MeasAndMobParametersMRDC_Common_v1610 measAndMobParametersMRDC_Common_v1610_,
      MeasAndMobParametersMRDC_v1610_interNR_MeasEUTRA_IAB_r16 interNR_MeasEUTRA_IAB_r16_
   ) {
      super();
      measAndMobParametersMRDC_Common_v1610 = measAndMobParametersMRDC_Common_v1610_;
      interNR_MeasEUTRA_IAB_r16 = interNR_MeasEUTRA_IAB_r16_;
   }

   public void init () {
      measAndMobParametersMRDC_Common_v1610 = null;
      interNR_MeasEUTRA_IAB_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measAndMobParametersMRDC_Common_v1610;
         case 1: return interNR_MeasEUTRA_IAB_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measAndMobParametersMRDC-Common-v1610";
         case 1: return "interNR-MeasEUTRA-IAB-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measAndMobParametersMRDC_Common_v1610Present = buffer.decodeBit ("measAndMobParametersMRDC_Common_v1610Present");
      boolean interNR_MeasEUTRA_IAB_r16Present = buffer.decodeBit ("interNR_MeasEUTRA_IAB_r16Present");

      // decode measAndMobParametersMRDC_Common_v1610

      if (measAndMobParametersMRDC_Common_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersMRDC_Common_v1610", -1);

         measAndMobParametersMRDC_Common_v1610 = new MeasAndMobParametersMRDC_Common_v1610();
         measAndMobParametersMRDC_Common_v1610.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measAndMobParametersMRDC_Common_v1610", -1);
      }
      else {
         measAndMobParametersMRDC_Common_v1610 = null;
      }

      // decode interNR_MeasEUTRA_IAB_r16

      if (interNR_MeasEUTRA_IAB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("interNR_MeasEUTRA_IAB_r16", -1);

         int tval = MeasAndMobParametersMRDC_v1610_interNR_MeasEUTRA_IAB_r16.decodeEnumValue (buffer);
         interNR_MeasEUTRA_IAB_r16 = MeasAndMobParametersMRDC_v1610_interNR_MeasEUTRA_IAB_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("interNR_MeasEUTRA_IAB_r16", -1);
      }
      else {
         interNR_MeasEUTRA_IAB_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measAndMobParametersMRDC_Common_v1610 != null), null);
      buffer.encodeBit ((interNR_MeasEUTRA_IAB_r16 != null), null);

      // encode measAndMobParametersMRDC_Common_v1610

      if (measAndMobParametersMRDC_Common_v1610 != null) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersMRDC_Common_v1610", -1);

         measAndMobParametersMRDC_Common_v1610.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measAndMobParametersMRDC_Common_v1610", -1);
      }

      // encode interNR_MeasEUTRA_IAB_r16

      if (interNR_MeasEUTRA_IAB_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("interNR_MeasEUTRA_IAB_r16", -1);

         interNR_MeasEUTRA_IAB_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("interNR_MeasEUTRA_IAB_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measAndMobParametersMRDC_Common_v1610 != null) measAndMobParametersMRDC_Common_v1610.print (_sb, "measAndMobParametersMRDC_Common_v1610", _level+1);
      if (interNR_MeasEUTRA_IAB_r16 != null) interNR_MeasEUTRA_IAB_r16.print (_sb, "interNR_MeasEUTRA_IAB_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
