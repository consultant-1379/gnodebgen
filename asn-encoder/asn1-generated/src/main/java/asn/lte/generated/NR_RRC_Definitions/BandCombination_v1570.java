/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandCombination_v1570 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombination-v1570";
   }

   public CA_ParametersEUTRA_v1570 ca_ParametersEUTRA_v1570;

   public BandCombination_v1570 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandCombination_v1570 (
      CA_ParametersEUTRA_v1570 ca_ParametersEUTRA_v1570_
   ) {
      super();
      ca_ParametersEUTRA_v1570 = ca_ParametersEUTRA_v1570_;
   }

   public void init () {
      ca_ParametersEUTRA_v1570 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ca_ParametersEUTRA_v1570;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ca-ParametersEUTRA-v1570";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ca_ParametersEUTRA_v1570

      buffer.getContext().eventDispatcher.startElement("ca_ParametersEUTRA_v1570", -1);

      ca_ParametersEUTRA_v1570 = new CA_ParametersEUTRA_v1570();
      ca_ParametersEUTRA_v1570.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ca_ParametersEUTRA_v1570", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ca_ParametersEUTRA_v1570 != null) ca_ParametersEUTRA_v1570.print (_sb, "ca_ParametersEUTRA_v1570", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
