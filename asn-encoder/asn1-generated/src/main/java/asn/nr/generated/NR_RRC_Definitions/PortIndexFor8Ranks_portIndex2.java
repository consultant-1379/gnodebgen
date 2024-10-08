/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PortIndexFor8Ranks_portIndex2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PortIndex2 rank1_2;  // optional
   public PortIndexFor8Ranks_portIndex2_rank2_2 rank2_2;  // optional

   public PortIndexFor8Ranks_portIndex2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PortIndexFor8Ranks_portIndex2 (
      PortIndex2 rank1_2_,
      PortIndexFor8Ranks_portIndex2_rank2_2 rank2_2_
   ) {
      super();
      rank1_2 = rank1_2_;
      rank2_2 = rank2_2_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PortIndexFor8Ranks_portIndex2 (long rank1_2_,
      PortIndexFor8Ranks_portIndex2_rank2_2 rank2_2_
   ) {
      super();
      rank1_2 = new PortIndex2 (rank1_2_);
      rank2_2 = rank2_2_;
   }

   public void init () {
      rank1_2 = null;
      rank2_2 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rank1_2;
         case 1: return rank2_2;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rank1-2";
         case 1: return "rank2-2";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rank1_2Present = buffer.decodeBit ("rank1_2Present");
      boolean rank2_2Present = buffer.decodeBit ("rank2_2Present");

      // decode rank1_2

      if (rank1_2Present) {
         buffer.getContext().eventDispatcher.startElement("rank1_2", -1);

         rank1_2 = new PortIndex2();
         rank1_2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rank1_2", -1);
      }
      else {
         rank1_2 = null;
      }

      // decode rank2_2

      if (rank2_2Present) {
         buffer.getContext().eventDispatcher.startElement("rank2_2", -1);

         rank2_2 = new PortIndexFor8Ranks_portIndex2_rank2_2();
         rank2_2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rank2_2", -1);
      }
      else {
         rank2_2 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((rank1_2 != null), null);
      buffer.encodeBit ((rank2_2 != null), null);

      // encode rank1_2

      if (rank1_2 != null) {
         buffer.getContext().eventDispatcher.startElement("rank1_2", -1);

         rank1_2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rank1_2", -1);
      }

      // encode rank2_2

      if (rank2_2 != null) {
         buffer.getContext().eventDispatcher.startElement("rank2_2", -1);

         rank2_2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rank2_2", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rank1_2 != null) rank1_2.print (_sb, "rank1_2", _level+1);
      if (rank2_2 != null) rank2_2.print (_sb, "rank2_2", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
