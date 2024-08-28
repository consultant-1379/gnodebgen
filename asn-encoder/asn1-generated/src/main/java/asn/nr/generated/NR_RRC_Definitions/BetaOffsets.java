/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BetaOffsets extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BetaOffsets";
   }

   public Asn1Integer betaOffsetACK_Index1;  // optional
   public Asn1Integer betaOffsetACK_Index2;  // optional
   public Asn1Integer betaOffsetACK_Index3;  // optional
   public Asn1Integer betaOffsetCSI_Part1_Index1;  // optional
   public Asn1Integer betaOffsetCSI_Part1_Index2;  // optional
   public Asn1Integer betaOffsetCSI_Part2_Index1;  // optional
   public Asn1Integer betaOffsetCSI_Part2_Index2;  // optional

   public BetaOffsets () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BetaOffsets (
      Asn1Integer betaOffsetACK_Index1_,
      Asn1Integer betaOffsetACK_Index2_,
      Asn1Integer betaOffsetACK_Index3_,
      Asn1Integer betaOffsetCSI_Part1_Index1_,
      Asn1Integer betaOffsetCSI_Part1_Index2_,
      Asn1Integer betaOffsetCSI_Part2_Index1_,
      Asn1Integer betaOffsetCSI_Part2_Index2_
   ) {
      super();
      betaOffsetACK_Index1 = betaOffsetACK_Index1_;
      betaOffsetACK_Index2 = betaOffsetACK_Index2_;
      betaOffsetACK_Index3 = betaOffsetACK_Index3_;
      betaOffsetCSI_Part1_Index1 = betaOffsetCSI_Part1_Index1_;
      betaOffsetCSI_Part1_Index2 = betaOffsetCSI_Part1_Index2_;
      betaOffsetCSI_Part2_Index1 = betaOffsetCSI_Part2_Index1_;
      betaOffsetCSI_Part2_Index2 = betaOffsetCSI_Part2_Index2_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BetaOffsets (long betaOffsetACK_Index1_,
      long betaOffsetACK_Index2_,
      long betaOffsetACK_Index3_,
      long betaOffsetCSI_Part1_Index1_,
      long betaOffsetCSI_Part1_Index2_,
      long betaOffsetCSI_Part2_Index1_,
      long betaOffsetCSI_Part2_Index2_
   ) {
      super();
      betaOffsetACK_Index1 = new Asn1Integer (betaOffsetACK_Index1_);
      betaOffsetACK_Index2 = new Asn1Integer (betaOffsetACK_Index2_);
      betaOffsetACK_Index3 = new Asn1Integer (betaOffsetACK_Index3_);
      betaOffsetCSI_Part1_Index1 = new Asn1Integer (betaOffsetCSI_Part1_Index1_);
      betaOffsetCSI_Part1_Index2 = new Asn1Integer (betaOffsetCSI_Part1_Index2_);
      betaOffsetCSI_Part2_Index1 = new Asn1Integer (betaOffsetCSI_Part2_Index1_);
      betaOffsetCSI_Part2_Index2 = new Asn1Integer (betaOffsetCSI_Part2_Index2_);
   }

   public void init () {
      betaOffsetACK_Index1 = null;
      betaOffsetACK_Index2 = null;
      betaOffsetACK_Index3 = null;
      betaOffsetCSI_Part1_Index1 = null;
      betaOffsetCSI_Part1_Index2 = null;
      betaOffsetCSI_Part2_Index1 = null;
      betaOffsetCSI_Part2_Index2 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return betaOffsetACK_Index1;
         case 1: return betaOffsetACK_Index2;
         case 2: return betaOffsetACK_Index3;
         case 3: return betaOffsetCSI_Part1_Index1;
         case 4: return betaOffsetCSI_Part1_Index2;
         case 5: return betaOffsetCSI_Part2_Index1;
         case 6: return betaOffsetCSI_Part2_Index2;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "betaOffsetACK-Index1";
         case 1: return "betaOffsetACK-Index2";
         case 2: return "betaOffsetACK-Index3";
         case 3: return "betaOffsetCSI-Part1-Index1";
         case 4: return "betaOffsetCSI-Part1-Index2";
         case 5: return "betaOffsetCSI-Part2-Index1";
         case 6: return "betaOffsetCSI-Part2-Index2";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean betaOffsetACK_Index1Present = buffer.decodeBit ("betaOffsetACK_Index1Present");
      boolean betaOffsetACK_Index2Present = buffer.decodeBit ("betaOffsetACK_Index2Present");
      boolean betaOffsetACK_Index3Present = buffer.decodeBit ("betaOffsetACK_Index3Present");
      boolean betaOffsetCSI_Part1_Index1Present = buffer.decodeBit ("betaOffsetCSI_Part1_Index1Present");
      boolean betaOffsetCSI_Part1_Index2Present = buffer.decodeBit ("betaOffsetCSI_Part1_Index2Present");
      boolean betaOffsetCSI_Part2_Index1Present = buffer.decodeBit ("betaOffsetCSI_Part2_Index1Present");
      boolean betaOffsetCSI_Part2_Index2Present = buffer.decodeBit ("betaOffsetCSI_Part2_Index2Present");

      // decode betaOffsetACK_Index1

      if (betaOffsetACK_Index1Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index1", -1);

         betaOffsetACK_Index1 = new Asn1Integer();
         betaOffsetACK_Index1.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetACK_Index1.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index1", -1);
      }
      else {
         betaOffsetACK_Index1 = null;
      }

      // decode betaOffsetACK_Index2

      if (betaOffsetACK_Index2Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index2", -1);

         betaOffsetACK_Index2 = new Asn1Integer();
         betaOffsetACK_Index2.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetACK_Index2.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index2", -1);
      }
      else {
         betaOffsetACK_Index2 = null;
      }

      // decode betaOffsetACK_Index3

      if (betaOffsetACK_Index3Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index3", -1);

         betaOffsetACK_Index3 = new Asn1Integer();
         betaOffsetACK_Index3.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetACK_Index3.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index3", -1);
      }
      else {
         betaOffsetACK_Index3 = null;
      }

      // decode betaOffsetCSI_Part1_Index1

      if (betaOffsetCSI_Part1_Index1Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part1_Index1", -1);

         betaOffsetCSI_Part1_Index1 = new Asn1Integer();
         betaOffsetCSI_Part1_Index1.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetCSI_Part1_Index1.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part1_Index1", -1);
      }
      else {
         betaOffsetCSI_Part1_Index1 = null;
      }

      // decode betaOffsetCSI_Part1_Index2

      if (betaOffsetCSI_Part1_Index2Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part1_Index2", -1);

         betaOffsetCSI_Part1_Index2 = new Asn1Integer();
         betaOffsetCSI_Part1_Index2.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetCSI_Part1_Index2.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part1_Index2", -1);
      }
      else {
         betaOffsetCSI_Part1_Index2 = null;
      }

      // decode betaOffsetCSI_Part2_Index1

      if (betaOffsetCSI_Part2_Index1Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part2_Index1", -1);

         betaOffsetCSI_Part2_Index1 = new Asn1Integer();
         betaOffsetCSI_Part2_Index1.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetCSI_Part2_Index1.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part2_Index1", -1);
      }
      else {
         betaOffsetCSI_Part2_Index1 = null;
      }

      // decode betaOffsetCSI_Part2_Index2

      if (betaOffsetCSI_Part2_Index2Present) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part2_Index2", -1);

         betaOffsetCSI_Part2_Index2 = new Asn1Integer();
         betaOffsetCSI_Part2_Index2.decode (buffer, 0, 31);

         buffer.invokeCharacters(betaOffsetCSI_Part2_Index2.toString());
         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part2_Index2", -1);
      }
      else {
         betaOffsetCSI_Part2_Index2 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((betaOffsetACK_Index1 != null), null);
      buffer.encodeBit ((betaOffsetACK_Index2 != null), null);
      buffer.encodeBit ((betaOffsetACK_Index3 != null), null);
      buffer.encodeBit ((betaOffsetCSI_Part1_Index1 != null), null);
      buffer.encodeBit ((betaOffsetCSI_Part1_Index2 != null), null);
      buffer.encodeBit ((betaOffsetCSI_Part2_Index1 != null), null);
      buffer.encodeBit ((betaOffsetCSI_Part2_Index2 != null), null);

      // encode betaOffsetACK_Index1

      if (betaOffsetACK_Index1 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index1", -1);

         betaOffsetACK_Index1.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index1", -1);
      }

      // encode betaOffsetACK_Index2

      if (betaOffsetACK_Index2 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index2", -1);

         betaOffsetACK_Index2.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index2", -1);
      }

      // encode betaOffsetACK_Index3

      if (betaOffsetACK_Index3 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetACK_Index3", -1);

         betaOffsetACK_Index3.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetACK_Index3", -1);
      }

      // encode betaOffsetCSI_Part1_Index1

      if (betaOffsetCSI_Part1_Index1 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part1_Index1", -1);

         betaOffsetCSI_Part1_Index1.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part1_Index1", -1);
      }

      // encode betaOffsetCSI_Part1_Index2

      if (betaOffsetCSI_Part1_Index2 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part1_Index2", -1);

         betaOffsetCSI_Part1_Index2.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part1_Index2", -1);
      }

      // encode betaOffsetCSI_Part2_Index1

      if (betaOffsetCSI_Part2_Index1 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part2_Index1", -1);

         betaOffsetCSI_Part2_Index1.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part2_Index1", -1);
      }

      // encode betaOffsetCSI_Part2_Index2

      if (betaOffsetCSI_Part2_Index2 != null) {
         buffer.getContext().eventDispatcher.startElement("betaOffsetCSI_Part2_Index2", -1);

         betaOffsetCSI_Part2_Index2.encode (buffer, 0, 31);

         buffer.getContext().eventDispatcher.endElement("betaOffsetCSI_Part2_Index2", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (betaOffsetACK_Index1 != null) betaOffsetACK_Index1.print (_sb, "betaOffsetACK_Index1", _level+1);
      if (betaOffsetACK_Index2 != null) betaOffsetACK_Index2.print (_sb, "betaOffsetACK_Index2", _level+1);
      if (betaOffsetACK_Index3 != null) betaOffsetACK_Index3.print (_sb, "betaOffsetACK_Index3", _level+1);
      if (betaOffsetCSI_Part1_Index1 != null) betaOffsetCSI_Part1_Index1.print (_sb, "betaOffsetCSI_Part1_Index1", _level+1);
      if (betaOffsetCSI_Part1_Index2 != null) betaOffsetCSI_Part1_Index2.print (_sb, "betaOffsetCSI_Part1_Index2", _level+1);
      if (betaOffsetCSI_Part2_Index1 != null) betaOffsetCSI_Part2_Index1.print (_sb, "betaOffsetCSI_Part2_Index1", _level+1);
      if (betaOffsetCSI_Part2_Index2 != null) betaOffsetCSI_Part2_Index2.print (_sb, "betaOffsetCSI_Part2_Index2", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
