/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_TimeDomainResourceAllocation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-TimeDomainResourceAllocation";
   }

   public Asn1Integer k2;  // optional
   public PUSCH_TimeDomainResourceAllocation_mappingType mappingType = null;
   public Asn1Integer startSymbolAndLength;

   public PUSCH_TimeDomainResourceAllocation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_TimeDomainResourceAllocation (
      Asn1Integer k2_,
      PUSCH_TimeDomainResourceAllocation_mappingType mappingType_,
      Asn1Integer startSymbolAndLength_
   ) {
      super();
      k2 = k2_;
      mappingType = mappingType_;
      startSymbolAndLength = startSymbolAndLength_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PUSCH_TimeDomainResourceAllocation (
      PUSCH_TimeDomainResourceAllocation_mappingType mappingType_,
      Asn1Integer startSymbolAndLength_
   ) {
      super();
      mappingType = mappingType_;
      startSymbolAndLength = startSymbolAndLength_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_TimeDomainResourceAllocation (long k2_,
      PUSCH_TimeDomainResourceAllocation_mappingType mappingType_,
      long startSymbolAndLength_
   ) {
      super();
      k2 = new Asn1Integer (k2_);
      mappingType = mappingType_;
      startSymbolAndLength = new Asn1Integer (startSymbolAndLength_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PUSCH_TimeDomainResourceAllocation (
      PUSCH_TimeDomainResourceAllocation_mappingType mappingType_,
      long startSymbolAndLength_
   ) {
      super();
      mappingType = mappingType_;
      startSymbolAndLength = new Asn1Integer (startSymbolAndLength_);
   }

   public void init () {
      k2 = null;
      mappingType = null;
      startSymbolAndLength = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return k2;
         case 1: return mappingType;
         case 2: return startSymbolAndLength;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "k2";
         case 1: return "mappingType";
         case 2: return "startSymbolAndLength";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean k2Present = buffer.decodeBit ("k2Present");

      // decode k2

      if (k2Present) {
         buffer.getContext().eventDispatcher.startElement("k2", -1);

         k2 = new Asn1Integer();
         k2.decode (buffer, 0, 32);

         buffer.invokeCharacters(k2.toString());
         buffer.getContext().eventDispatcher.endElement("k2", -1);
      }
      else {
         k2 = null;
      }

      // decode mappingType

      buffer.getContext().eventDispatcher.startElement("mappingType", -1);

      {
         int tval = PUSCH_TimeDomainResourceAllocation_mappingType.decodeEnumValue (buffer);
         mappingType = PUSCH_TimeDomainResourceAllocation_mappingType.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("mappingType", -1);

      // decode startSymbolAndLength

      buffer.getContext().eventDispatcher.startElement("startSymbolAndLength", -1);

      startSymbolAndLength = new Asn1Integer();
      startSymbolAndLength.decode (buffer, 0, 127);

      buffer.invokeCharacters(startSymbolAndLength.toString());
      buffer.getContext().eventDispatcher.endElement("startSymbolAndLength", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((k2 != null), null);

      // encode k2

      if (k2 != null) {
         buffer.getContext().eventDispatcher.startElement("k2", -1);

         k2.encode (buffer, 0, 32);

         buffer.getContext().eventDispatcher.endElement("k2", -1);
      }

      // encode mappingType

      if (mappingType != null) {
         buffer.getContext().eventDispatcher.startElement("mappingType", -1);

         mappingType.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mappingType", -1);
      }
      else throw new Asn1MissingRequiredException ("mappingType");

      // encode startSymbolAndLength

      if (startSymbolAndLength != null) {
         buffer.getContext().eventDispatcher.startElement("startSymbolAndLength", -1);

         startSymbolAndLength.encode (buffer, 0, 127);

         buffer.getContext().eventDispatcher.endElement("startSymbolAndLength", -1);
      }
      else throw new Asn1MissingRequiredException ("startSymbolAndLength");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (k2 != null) k2.print (_sb, "k2", _level+1);
      if (mappingType != null) mappingType.print (_sb, "mappingType", _level+1);
      if (startSymbolAndLength != null) startSymbolAndLength.print (_sb, "startSymbolAndLength", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
