/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPDCCH_Elements_r15_setup_resourceBlockAssignment_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer numberRB_InFreq_domain_r15;
   public Asn1BitString resourceBlockAssignment_r15;

   public SPDCCH_Elements_r15_setup_resourceBlockAssignment_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SPDCCH_Elements_r15_setup_resourceBlockAssignment_r15 (
      Asn1Integer numberRB_InFreq_domain_r15_,
      Asn1BitString resourceBlockAssignment_r15_
   ) {
      super();
      numberRB_InFreq_domain_r15 = numberRB_InFreq_domain_r15_;
      resourceBlockAssignment_r15 = resourceBlockAssignment_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SPDCCH_Elements_r15_setup_resourceBlockAssignment_r15 (long numberRB_InFreq_domain_r15_,
      Asn1BitString resourceBlockAssignment_r15_
   ) {
      super();
      numberRB_InFreq_domain_r15 = new Asn1Integer (numberRB_InFreq_domain_r15_);
      resourceBlockAssignment_r15 = resourceBlockAssignment_r15_;
   }

   public void init () {
      numberRB_InFreq_domain_r15 = null;
      resourceBlockAssignment_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return numberRB_InFreq_domain_r15;
         case 1: return resourceBlockAssignment_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "numberRB-InFreq-domain-r15";
         case 1: return "resourceBlockAssignment-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode numberRB_InFreq_domain_r15

      buffer.getContext().eventDispatcher.startElement("numberRB_InFreq_domain_r15", -1);

      numberRB_InFreq_domain_r15 = new Asn1Integer();
      numberRB_InFreq_domain_r15.decode (buffer, 2, 100);

      buffer.invokeCharacters(numberRB_InFreq_domain_r15.toString());
      buffer.getContext().eventDispatcher.endElement("numberRB_InFreq_domain_r15", -1);

      // decode resourceBlockAssignment_r15

      buffer.getContext().eventDispatcher.startElement("resourceBlockAssignment_r15", -1);

      resourceBlockAssignment_r15 = new Asn1BitString();
      resourceBlockAssignment_r15.decode (buffer, 98, 98);

      buffer.invokeCharacters(resourceBlockAssignment_r15.toString());
      buffer.getContext().eventDispatcher.endElement("resourceBlockAssignment_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (numberRB_InFreq_domain_r15 != null) numberRB_InFreq_domain_r15.print (_sb, "numberRB_InFreq_domain_r15", _level+1);
      if (resourceBlockAssignment_r15 != null) resourceBlockAssignment_r15.print (_sb, "resourceBlockAssignment_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
