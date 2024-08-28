/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SlotBased_v1630 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SlotBased-v1630";
   }

   public SlotBased_v1630_tciMapping_r16 tciMapping_r16 = null;
   public Asn1Integer sequenceOffsetForRV_r16;

   public SlotBased_v1630 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SlotBased_v1630 (
      SlotBased_v1630_tciMapping_r16 tciMapping_r16_,
      Asn1Integer sequenceOffsetForRV_r16_
   ) {
      super();
      tciMapping_r16 = tciMapping_r16_;
      sequenceOffsetForRV_r16 = sequenceOffsetForRV_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SlotBased_v1630 (SlotBased_v1630_tciMapping_r16 tciMapping_r16_,
      long sequenceOffsetForRV_r16_
   ) {
      super();
      tciMapping_r16 = tciMapping_r16_;
      sequenceOffsetForRV_r16 = new Asn1Integer (sequenceOffsetForRV_r16_);
   }

   public void init () {
      tciMapping_r16 = null;
      sequenceOffsetForRV_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tciMapping_r16;
         case 1: return sequenceOffsetForRV_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tciMapping-r16";
         case 1: return "sequenceOffsetForRV-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode tciMapping_r16

      buffer.getContext().eventDispatcher.startElement("tciMapping_r16", -1);

      {
         int tval = SlotBased_v1630_tciMapping_r16.decodeEnumValue (buffer);
         tciMapping_r16 = SlotBased_v1630_tciMapping_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("tciMapping_r16", -1);

      // decode sequenceOffsetForRV_r16

      buffer.getContext().eventDispatcher.startElement("sequenceOffsetForRV_r16", -1);

      sequenceOffsetForRV_r16 = new Asn1Integer();
      sequenceOffsetForRV_r16.decode (buffer, 0, 0);

      buffer.invokeCharacters(sequenceOffsetForRV_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sequenceOffsetForRV_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tciMapping_r16 != null) tciMapping_r16.print (_sb, "tciMapping_r16", _level+1);
      if (sequenceOffsetForRV_r16 != null) sequenceOffsetForRV_r16.print (_sb, "sequenceOffsetForRV_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
