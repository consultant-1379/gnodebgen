/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_k_max_r14 k_max_r14 = null;
   public PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_p_a_must_r14 p_a_must_r14 = null;  // optional

   public PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup (
      PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_k_max_r14 k_max_r14_,
      PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_p_a_must_r14 p_a_must_r14_
   ) {
      super();
      k_max_r14 = k_max_r14_;
      p_a_must_r14 = p_a_must_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup (
      PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_k_max_r14 k_max_r14_
   ) {
      super();
      k_max_r14 = k_max_r14_;
   }

   public void init () {
      k_max_r14 = null;
      p_a_must_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return k_max_r14;
         case 1: return p_a_must_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "k-max-r14";
         case 1: return "p-a-must-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean p_a_must_r14Present = buffer.decodeBit ("p_a_must_r14Present");

      // decode k_max_r14

      buffer.getContext().eventDispatcher.startElement("k_max_r14", -1);

      {
         int tval = PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_k_max_r14.decodeEnumValue (buffer);
         k_max_r14 = PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_k_max_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("k_max_r14", -1);

      // decode p_a_must_r14

      if (p_a_must_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p_a_must_r14", -1);

         int tval = PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_p_a_must_r14.decodeEnumValue (buffer);
         p_a_must_r14 = PhysicalConfigDedicatedSCell_r10_must_Config_r14_setup_p_a_must_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("p_a_must_r14", -1);
      }
      else {
         p_a_must_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (k_max_r14 != null) k_max_r14.print (_sb, "k_max_r14", _level+1);
      if (p_a_must_r14 != null) p_a_must_r14.print (_sb, "p_a_must_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
