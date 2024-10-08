/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SlotFormatCombination extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SlotFormatCombination";
   }

   public SlotFormatCombinationId slotFormatCombinationId;
   public SlotFormatCombination_slotFormats slotFormats;

   public SlotFormatCombination () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SlotFormatCombination (
      SlotFormatCombinationId slotFormatCombinationId_,
      SlotFormatCombination_slotFormats slotFormats_
   ) {
      super();
      slotFormatCombinationId = slotFormatCombinationId_;
      slotFormats = slotFormats_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SlotFormatCombination (long slotFormatCombinationId_,
      SlotFormatCombination_slotFormats slotFormats_
   ) {
      super();
      slotFormatCombinationId = new SlotFormatCombinationId (slotFormatCombinationId_);
      slotFormats = slotFormats_;
   }

   public void init () {
      slotFormatCombinationId = null;
      slotFormats = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return slotFormatCombinationId;
         case 1: return slotFormats;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "slotFormatCombinationId";
         case 1: return "slotFormats";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode slotFormatCombinationId

      buffer.getContext().eventDispatcher.startElement("slotFormatCombinationId", -1);

      slotFormatCombinationId = new SlotFormatCombinationId();
      slotFormatCombinationId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("slotFormatCombinationId", -1);

      // decode slotFormats

      buffer.getContext().eventDispatcher.startElement("slotFormats", -1);

      slotFormats = new SlotFormatCombination_slotFormats();
      slotFormats.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("slotFormats", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (slotFormatCombinationId != null) slotFormatCombinationId.print (_sb, "slotFormatCombinationId", _level+1);
      if (slotFormats != null) slotFormats.print (_sb, "slotFormats", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
