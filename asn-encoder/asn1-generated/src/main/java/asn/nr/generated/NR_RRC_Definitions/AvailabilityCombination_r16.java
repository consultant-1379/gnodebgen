/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AvailabilityCombination_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AvailabilityCombination-r16";
   }

   public AvailabilityCombinationId_r16 availabilityCombinationId_r16;
   public AvailabilityCombination_r16_resourceAvailability_r16 resourceAvailability_r16;

   public AvailabilityCombination_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AvailabilityCombination_r16 (
      AvailabilityCombinationId_r16 availabilityCombinationId_r16_,
      AvailabilityCombination_r16_resourceAvailability_r16 resourceAvailability_r16_
   ) {
      super();
      availabilityCombinationId_r16 = availabilityCombinationId_r16_;
      resourceAvailability_r16 = resourceAvailability_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public AvailabilityCombination_r16 (long availabilityCombinationId_r16_,
      AvailabilityCombination_r16_resourceAvailability_r16 resourceAvailability_r16_
   ) {
      super();
      availabilityCombinationId_r16 = new AvailabilityCombinationId_r16 (availabilityCombinationId_r16_);
      resourceAvailability_r16 = resourceAvailability_r16_;
   }

   public void init () {
      availabilityCombinationId_r16 = null;
      resourceAvailability_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return availabilityCombinationId_r16;
         case 1: return resourceAvailability_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "availabilityCombinationId-r16";
         case 1: return "resourceAvailability-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode availabilityCombinationId_r16

      buffer.getContext().eventDispatcher.startElement("availabilityCombinationId_r16", -1);

      availabilityCombinationId_r16 = new AvailabilityCombinationId_r16();
      availabilityCombinationId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("availabilityCombinationId_r16", -1);

      // decode resourceAvailability_r16

      buffer.getContext().eventDispatcher.startElement("resourceAvailability_r16", -1);

      resourceAvailability_r16 = new AvailabilityCombination_r16_resourceAvailability_r16();
      resourceAvailability_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("resourceAvailability_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode availabilityCombinationId_r16

      if (availabilityCombinationId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("availabilityCombinationId_r16", -1);

         availabilityCombinationId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("availabilityCombinationId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("availabilityCombinationId_r16");

      // encode resourceAvailability_r16

      if (resourceAvailability_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("resourceAvailability_r16", -1);

         resourceAvailability_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("resourceAvailability_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("resourceAvailability_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (availabilityCombinationId_r16 != null) availabilityCombinationId_r16.print (_sb, "availabilityCombinationId_r16", _level+1);
      if (resourceAvailability_r16 != null) resourceAvailability_r16.print (_sb, "resourceAvailability_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
