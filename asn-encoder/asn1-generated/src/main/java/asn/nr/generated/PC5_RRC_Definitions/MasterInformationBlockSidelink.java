/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MasterInformationBlockSidelink extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MasterInformationBlockSidelink";
   }

   public Asn1BitString sl_TDD_Config_r16;
   public Asn1Boolean inCoverage_r16;
   public Asn1BitString directFrameNumber_r16;
   public Asn1BitString slotIndex_r16;
   public Asn1BitString reservedBits_r16;

   public MasterInformationBlockSidelink () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MasterInformationBlockSidelink (
      Asn1BitString sl_TDD_Config_r16_,
      Asn1Boolean inCoverage_r16_,
      Asn1BitString directFrameNumber_r16_,
      Asn1BitString slotIndex_r16_,
      Asn1BitString reservedBits_r16_
   ) {
      super();
      sl_TDD_Config_r16 = sl_TDD_Config_r16_;
      inCoverage_r16 = inCoverage_r16_;
      directFrameNumber_r16 = directFrameNumber_r16_;
      slotIndex_r16 = slotIndex_r16_;
      reservedBits_r16 = reservedBits_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MasterInformationBlockSidelink (Asn1BitString sl_TDD_Config_r16_,
      boolean inCoverage_r16_,
      Asn1BitString directFrameNumber_r16_,
      Asn1BitString slotIndex_r16_,
      Asn1BitString reservedBits_r16_
   ) {
      super();
      sl_TDD_Config_r16 = sl_TDD_Config_r16_;
      inCoverage_r16 = new Asn1Boolean (inCoverage_r16_);
      directFrameNumber_r16 = directFrameNumber_r16_;
      slotIndex_r16 = slotIndex_r16_;
      reservedBits_r16 = reservedBits_r16_;
   }

   public void init () {
      sl_TDD_Config_r16 = null;
      inCoverage_r16 = null;
      directFrameNumber_r16 = null;
      slotIndex_r16 = null;
      reservedBits_r16 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_TDD_Config_r16;
         case 1: return inCoverage_r16;
         case 2: return directFrameNumber_r16;
         case 3: return slotIndex_r16;
         case 4: return reservedBits_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-TDD-Config-r16";
         case 1: return "inCoverage-r16";
         case 2: return "directFrameNumber-r16";
         case 3: return "slotIndex-r16";
         case 4: return "reservedBits-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode sl_TDD_Config_r16

      buffer.getContext().eventDispatcher.startElement("sl_TDD_Config_r16", -1);

      sl_TDD_Config_r16 = new Asn1BitString();
      sl_TDD_Config_r16.decode (buffer, 12, 12);

      buffer.invokeCharacters(sl_TDD_Config_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sl_TDD_Config_r16", -1);

      // decode inCoverage_r16

      buffer.getContext().eventDispatcher.startElement("inCoverage_r16", -1);

      inCoverage_r16 = new Asn1Boolean();
      inCoverage_r16.decode (buffer);

      buffer.invokeCharacters(inCoverage_r16.toString());
      buffer.getContext().eventDispatcher.endElement("inCoverage_r16", -1);

      // decode directFrameNumber_r16

      buffer.getContext().eventDispatcher.startElement("directFrameNumber_r16", -1);

      directFrameNumber_r16 = new Asn1BitString();
      directFrameNumber_r16.decode (buffer, 10, 10);

      buffer.invokeCharacters(directFrameNumber_r16.toString());
      buffer.getContext().eventDispatcher.endElement("directFrameNumber_r16", -1);

      // decode slotIndex_r16

      buffer.getContext().eventDispatcher.startElement("slotIndex_r16", -1);

      slotIndex_r16 = new Asn1BitString();
      slotIndex_r16.decode (buffer, 7, 7);

      buffer.invokeCharacters(slotIndex_r16.toString());
      buffer.getContext().eventDispatcher.endElement("slotIndex_r16", -1);

      // decode reservedBits_r16

      buffer.getContext().eventDispatcher.startElement("reservedBits_r16", -1);

      reservedBits_r16 = new Asn1BitString();
      reservedBits_r16.decode (buffer, 2, 2);

      buffer.invokeCharacters(reservedBits_r16.toString());
      buffer.getContext().eventDispatcher.endElement("reservedBits_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode sl_TDD_Config_r16

      if (sl_TDD_Config_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_TDD_Config_r16", -1);

         sl_TDD_Config_r16.encode (buffer, 12, 12);

         buffer.getContext().eventDispatcher.endElement("sl_TDD_Config_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("sl_TDD_Config_r16");

      // encode inCoverage_r16

      if (inCoverage_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("inCoverage_r16", -1);

         inCoverage_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("inCoverage_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("inCoverage_r16");

      // encode directFrameNumber_r16

      if (directFrameNumber_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("directFrameNumber_r16", -1);

         directFrameNumber_r16.encode (buffer, 10, 10);

         buffer.getContext().eventDispatcher.endElement("directFrameNumber_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("directFrameNumber_r16");

      // encode slotIndex_r16

      if (slotIndex_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("slotIndex_r16", -1);

         slotIndex_r16.encode (buffer, 7, 7);

         buffer.getContext().eventDispatcher.endElement("slotIndex_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("slotIndex_r16");

      // encode reservedBits_r16

      if (reservedBits_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reservedBits_r16", -1);

         reservedBits_r16.encode (buffer, 2, 2);

         buffer.getContext().eventDispatcher.endElement("reservedBits_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("reservedBits_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_TDD_Config_r16 != null) sl_TDD_Config_r16.print (_sb, "sl_TDD_Config_r16", _level+1);
      if (inCoverage_r16 != null) inCoverage_r16.print (_sb, "inCoverage_r16", _level+1);
      if (directFrameNumber_r16 != null) directFrameNumber_r16.print (_sb, "directFrameNumber_r16", _level+1);
      if (slotIndex_r16 != null) slotIndex_r16.print (_sb, "slotIndex_r16", _level+1);
      if (reservedBits_r16 != null) reservedBits_r16.print (_sb, "reservedBits_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
