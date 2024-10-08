/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkConfigCommon extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkConfigCommon";
   }

   public FrequencyInfoUL frequencyInfoUL;  // optional
   public BWP_UplinkCommon initialUplinkBWP;  // optional
   public TimeAlignmentTimer dummy = null;

   public UplinkConfigCommon () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkConfigCommon (
      FrequencyInfoUL frequencyInfoUL_,
      BWP_UplinkCommon initialUplinkBWP_,
      TimeAlignmentTimer dummy_
   ) {
      super();
      frequencyInfoUL = frequencyInfoUL_;
      initialUplinkBWP = initialUplinkBWP_;
      dummy = dummy_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UplinkConfigCommon (
      TimeAlignmentTimer dummy_
   ) {
      super();
      dummy = dummy_;
   }

   public void init () {
      frequencyInfoUL = null;
      initialUplinkBWP = null;
      dummy = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return frequencyInfoUL;
         case 1: return initialUplinkBWP;
         case 2: return dummy;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "frequencyInfoUL";
         case 1: return "initialUplinkBWP";
         case 2: return "dummy";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean frequencyInfoULPresent = buffer.decodeBit ("frequencyInfoULPresent");
      boolean initialUplinkBWPPresent = buffer.decodeBit ("initialUplinkBWPPresent");

      // decode frequencyInfoUL

      if (frequencyInfoULPresent) {
         buffer.getContext().eventDispatcher.startElement("frequencyInfoUL", -1);

         frequencyInfoUL = new FrequencyInfoUL();
         frequencyInfoUL.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("frequencyInfoUL", -1);
      }
      else {
         frequencyInfoUL = null;
      }

      // decode initialUplinkBWP

      if (initialUplinkBWPPresent) {
         buffer.getContext().eventDispatcher.startElement("initialUplinkBWP", -1);

         initialUplinkBWP = new BWP_UplinkCommon();
         initialUplinkBWP.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("initialUplinkBWP", -1);
      }
      else {
         initialUplinkBWP = null;
      }

      // decode dummy

      buffer.getContext().eventDispatcher.startElement("dummy", -1);

      {
         int tval = TimeAlignmentTimer.decodeEnumValue (buffer);
         dummy = TimeAlignmentTimer.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("dummy", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((frequencyInfoUL != null), null);
      buffer.encodeBit ((initialUplinkBWP != null), null);

      // encode frequencyInfoUL

      if (frequencyInfoUL != null) {
         buffer.getContext().eventDispatcher.startElement("frequencyInfoUL", -1);

         frequencyInfoUL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("frequencyInfoUL", -1);
      }

      // encode initialUplinkBWP

      if (initialUplinkBWP != null) {
         buffer.getContext().eventDispatcher.startElement("initialUplinkBWP", -1);

         initialUplinkBWP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("initialUplinkBWP", -1);
      }

      // encode dummy

      if (dummy != null) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else throw new Asn1MissingRequiredException ("dummy");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (frequencyInfoUL != null) frequencyInfoUL.print (_sb, "frequencyInfoUL", _level+1);
      if (initialUplinkBWP != null) initialUplinkBWP.print (_sb, "initialUplinkBWP", _level+1);
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
