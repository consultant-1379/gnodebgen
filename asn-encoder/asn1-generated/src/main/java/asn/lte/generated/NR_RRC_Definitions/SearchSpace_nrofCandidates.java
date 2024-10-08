/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpace_nrofCandidates extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SearchSpace_nrofCandidates_aggregationLevel1 aggregationLevel1 = null;
   public SearchSpace_nrofCandidates_aggregationLevel2 aggregationLevel2 = null;
   public SearchSpace_nrofCandidates_aggregationLevel4 aggregationLevel4 = null;
   public SearchSpace_nrofCandidates_aggregationLevel8 aggregationLevel8 = null;
   public SearchSpace_nrofCandidates_aggregationLevel16 aggregationLevel16 = null;

   public SearchSpace_nrofCandidates () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SearchSpace_nrofCandidates (
      SearchSpace_nrofCandidates_aggregationLevel1 aggregationLevel1_,
      SearchSpace_nrofCandidates_aggregationLevel2 aggregationLevel2_,
      SearchSpace_nrofCandidates_aggregationLevel4 aggregationLevel4_,
      SearchSpace_nrofCandidates_aggregationLevel8 aggregationLevel8_,
      SearchSpace_nrofCandidates_aggregationLevel16 aggregationLevel16_
   ) {
      super();
      aggregationLevel1 = aggregationLevel1_;
      aggregationLevel2 = aggregationLevel2_;
      aggregationLevel4 = aggregationLevel4_;
      aggregationLevel8 = aggregationLevel8_;
      aggregationLevel16 = aggregationLevel16_;
   }

   public void init () {
      aggregationLevel1 = null;
      aggregationLevel2 = null;
      aggregationLevel4 = null;
      aggregationLevel8 = null;
      aggregationLevel16 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return aggregationLevel1;
         case 1: return aggregationLevel2;
         case 2: return aggregationLevel4;
         case 3: return aggregationLevel8;
         case 4: return aggregationLevel16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "aggregationLevel1";
         case 1: return "aggregationLevel2";
         case 2: return "aggregationLevel4";
         case 3: return "aggregationLevel8";
         case 4: return "aggregationLevel16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode aggregationLevel1

      buffer.getContext().eventDispatcher.startElement("aggregationLevel1", -1);

      {
         int tval = SearchSpace_nrofCandidates_aggregationLevel1.decodeEnumValue (buffer);
         aggregationLevel1 = SearchSpace_nrofCandidates_aggregationLevel1.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("aggregationLevel1", -1);

      // decode aggregationLevel2

      buffer.getContext().eventDispatcher.startElement("aggregationLevel2", -1);

      {
         int tval = SearchSpace_nrofCandidates_aggregationLevel2.decodeEnumValue (buffer);
         aggregationLevel2 = SearchSpace_nrofCandidates_aggregationLevel2.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("aggregationLevel2", -1);

      // decode aggregationLevel4

      buffer.getContext().eventDispatcher.startElement("aggregationLevel4", -1);

      {
         int tval = SearchSpace_nrofCandidates_aggregationLevel4.decodeEnumValue (buffer);
         aggregationLevel4 = SearchSpace_nrofCandidates_aggregationLevel4.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("aggregationLevel4", -1);

      // decode aggregationLevel8

      buffer.getContext().eventDispatcher.startElement("aggregationLevel8", -1);

      {
         int tval = SearchSpace_nrofCandidates_aggregationLevel8.decodeEnumValue (buffer);
         aggregationLevel8 = SearchSpace_nrofCandidates_aggregationLevel8.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("aggregationLevel8", -1);

      // decode aggregationLevel16

      buffer.getContext().eventDispatcher.startElement("aggregationLevel16", -1);

      {
         int tval = SearchSpace_nrofCandidates_aggregationLevel16.decodeEnumValue (buffer);
         aggregationLevel16 = SearchSpace_nrofCandidates_aggregationLevel16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("aggregationLevel16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (aggregationLevel1 != null) aggregationLevel1.print (_sb, "aggregationLevel1", _level+1);
      if (aggregationLevel2 != null) aggregationLevel2.print (_sb, "aggregationLevel2", _level+1);
      if (aggregationLevel4 != null) aggregationLevel4.print (_sb, "aggregationLevel4", _level+1);
      if (aggregationLevel8 != null) aggregationLevel8.print (_sb, "aggregationLevel8", _level+1);
      if (aggregationLevel16 != null) aggregationLevel16.print (_sb, "aggregationLevel16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
