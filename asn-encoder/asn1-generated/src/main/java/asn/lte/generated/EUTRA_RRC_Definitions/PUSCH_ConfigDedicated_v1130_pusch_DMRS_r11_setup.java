/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigDedicated_v1130_pusch_DMRS_r11_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer nPUSCH_Identity_r11;
   public Asn1Integer nDMRS_CSH_Identity_r11;

   public PUSCH_ConfigDedicated_v1130_pusch_DMRS_r11_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigDedicated_v1130_pusch_DMRS_r11_setup (
      Asn1Integer nPUSCH_Identity_r11_,
      Asn1Integer nDMRS_CSH_Identity_r11_
   ) {
      super();
      nPUSCH_Identity_r11 = nPUSCH_Identity_r11_;
      nDMRS_CSH_Identity_r11 = nDMRS_CSH_Identity_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_ConfigDedicated_v1130_pusch_DMRS_r11_setup (long nPUSCH_Identity_r11_,
      long nDMRS_CSH_Identity_r11_
   ) {
      super();
      nPUSCH_Identity_r11 = new Asn1Integer (nPUSCH_Identity_r11_);
      nDMRS_CSH_Identity_r11 = new Asn1Integer (nDMRS_CSH_Identity_r11_);
   }

   public void init () {
      nPUSCH_Identity_r11 = null;
      nDMRS_CSH_Identity_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nPUSCH_Identity_r11;
         case 1: return nDMRS_CSH_Identity_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nPUSCH-Identity-r11";
         case 1: return "nDMRS-CSH-Identity-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode nPUSCH_Identity_r11

      buffer.getContext().eventDispatcher.startElement("nPUSCH_Identity_r11", -1);

      nPUSCH_Identity_r11 = new Asn1Integer();
      nPUSCH_Identity_r11.decode (buffer, 0, 509);

      buffer.invokeCharacters(nPUSCH_Identity_r11.toString());
      buffer.getContext().eventDispatcher.endElement("nPUSCH_Identity_r11", -1);

      // decode nDMRS_CSH_Identity_r11

      buffer.getContext().eventDispatcher.startElement("nDMRS_CSH_Identity_r11", -1);

      nDMRS_CSH_Identity_r11 = new Asn1Integer();
      nDMRS_CSH_Identity_r11.decode (buffer, 0, 509);

      buffer.invokeCharacters(nDMRS_CSH_Identity_r11.toString());
      buffer.getContext().eventDispatcher.endElement("nDMRS_CSH_Identity_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (nPUSCH_Identity_r11 != null) nPUSCH_Identity_r11.print (_sb, "nPUSCH_Identity_r11", _level+1);
      if (nDMRS_CSH_Identity_r11 != null) nDMRS_CSH_Identity_r11.print (_sb, "nDMRS_CSH_Identity_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
