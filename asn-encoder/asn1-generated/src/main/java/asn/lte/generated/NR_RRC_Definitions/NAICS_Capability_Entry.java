/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NAICS_Capability_Entry extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NAICS-Capability-Entry";
   }

   public Asn1Integer numberOfNAICS_CapableCC;
   public NAICS_Capability_Entry_numberOfAggregatedPRB numberOfAggregatedPRB = null;
   public Asn1OpenExt extElem1;

   public NAICS_Capability_Entry () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NAICS_Capability_Entry (
      Asn1Integer numberOfNAICS_CapableCC_,
      NAICS_Capability_Entry_numberOfAggregatedPRB numberOfAggregatedPRB_
   ) {
      super();
      numberOfNAICS_CapableCC = numberOfNAICS_CapableCC_;
      numberOfAggregatedPRB = numberOfAggregatedPRB_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NAICS_Capability_Entry (long numberOfNAICS_CapableCC_,
      NAICS_Capability_Entry_numberOfAggregatedPRB numberOfAggregatedPRB_
   ) {
      super();
      numberOfNAICS_CapableCC = new Asn1Integer (numberOfNAICS_CapableCC_);
      numberOfAggregatedPRB = numberOfAggregatedPRB_;
   }

   public void init () {
      numberOfNAICS_CapableCC = null;
      numberOfAggregatedPRB = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return numberOfNAICS_CapableCC;
         case 1: return numberOfAggregatedPRB;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "numberOfNAICS-CapableCC";
         case 1: return "numberOfAggregatedPRB";
         case 2: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode numberOfNAICS_CapableCC

      buffer.getContext().eventDispatcher.startElement("numberOfNAICS_CapableCC", -1);

      numberOfNAICS_CapableCC = new Asn1Integer();
      numberOfNAICS_CapableCC.decode (buffer, 1, 5);

      buffer.invokeCharacters(numberOfNAICS_CapableCC.toString());
      buffer.getContext().eventDispatcher.endElement("numberOfNAICS_CapableCC", -1);

      // decode numberOfAggregatedPRB

      buffer.getContext().eventDispatcher.startElement("numberOfAggregatedPRB", -1);

      {
         int tval = NAICS_Capability_Entry_numberOfAggregatedPRB.decodeEnumValue (buffer);
         numberOfAggregatedPRB = NAICS_Capability_Entry_numberOfAggregatedPRB.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("numberOfAggregatedPRB", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (numberOfNAICS_CapableCC != null) numberOfNAICS_CapableCC.print (_sb, "numberOfNAICS_CapableCC", _level+1);
      if (numberOfAggregatedPRB != null) numberOfAggregatedPRB.print (_sb, "numberOfAggregatedPRB", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
