/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ConfigSIB_NB_v1530_fmt2_Parameters_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public NPRACH_ParametersListFmt2_NB_r15 nprach_ParametersListFmt2_r15;  // optional
   public NPRACH_ParametersListFmt2_NB_r15 nprach_ParametersListFmt2EDT_r15;  // optional

   public NPRACH_ConfigSIB_NB_v1530_fmt2_Parameters_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPRACH_ConfigSIB_NB_v1530_fmt2_Parameters_r15 (
      NPRACH_ParametersListFmt2_NB_r15 nprach_ParametersListFmt2_r15_,
      NPRACH_ParametersListFmt2_NB_r15 nprach_ParametersListFmt2EDT_r15_
   ) {
      super();
      nprach_ParametersListFmt2_r15 = nprach_ParametersListFmt2_r15_;
      nprach_ParametersListFmt2EDT_r15 = nprach_ParametersListFmt2EDT_r15_;
   }

   public void init () {
      nprach_ParametersListFmt2_r15 = null;
      nprach_ParametersListFmt2EDT_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nprach_ParametersListFmt2_r15;
         case 1: return nprach_ParametersListFmt2EDT_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nprach-ParametersListFmt2-r15";
         case 1: return "nprach-ParametersListFmt2EDT-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nprach_ParametersListFmt2_r15Present = buffer.decodeBit ("nprach_ParametersListFmt2_r15Present");
      boolean nprach_ParametersListFmt2EDT_r15Present = buffer.decodeBit ("nprach_ParametersListFmt2EDT_r15Present");

      // decode nprach_ParametersListFmt2_r15

      if (nprach_ParametersListFmt2_r15Present) {
         buffer.getContext().eventDispatcher.startElement("nprach_ParametersListFmt2_r15", -1);

         nprach_ParametersListFmt2_r15 = new NPRACH_ParametersListFmt2_NB_r15();
         nprach_ParametersListFmt2_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nprach_ParametersListFmt2_r15", -1);
      }
      else {
         nprach_ParametersListFmt2_r15 = null;
      }

      // decode nprach_ParametersListFmt2EDT_r15

      if (nprach_ParametersListFmt2EDT_r15Present) {
         buffer.getContext().eventDispatcher.startElement("nprach_ParametersListFmt2EDT_r15", -1);

         nprach_ParametersListFmt2EDT_r15 = new NPRACH_ParametersListFmt2_NB_r15();
         nprach_ParametersListFmt2EDT_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nprach_ParametersListFmt2EDT_r15", -1);
      }
      else {
         nprach_ParametersListFmt2EDT_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (nprach_ParametersListFmt2_r15 != null) nprach_ParametersListFmt2_r15.print (_sb, "nprach_ParametersListFmt2_r15", _level+1);
      if (nprach_ParametersListFmt2EDT_r15 != null) nprach_ParametersListFmt2EDT_r15.print (_sb, "nprach_ParametersListFmt2EDT_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
