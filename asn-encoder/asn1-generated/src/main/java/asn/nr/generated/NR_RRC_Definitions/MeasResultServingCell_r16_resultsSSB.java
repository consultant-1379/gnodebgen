/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultServingCell_r16_resultsSSB extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SSB_Index best_ssb_Index;
   public MeasQuantityResults best_ssb_Results;
   public Asn1Integer numberOfGoodSSB;

   public MeasResultServingCell_r16_resultsSSB () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultServingCell_r16_resultsSSB (
      SSB_Index best_ssb_Index_,
      MeasQuantityResults best_ssb_Results_,
      Asn1Integer numberOfGoodSSB_
   ) {
      super();
      best_ssb_Index = best_ssb_Index_;
      best_ssb_Results = best_ssb_Results_;
      numberOfGoodSSB = numberOfGoodSSB_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultServingCell_r16_resultsSSB (long best_ssb_Index_,
      MeasQuantityResults best_ssb_Results_,
      long numberOfGoodSSB_
   ) {
      super();
      best_ssb_Index = new SSB_Index (best_ssb_Index_);
      best_ssb_Results = best_ssb_Results_;
      numberOfGoodSSB = new Asn1Integer (numberOfGoodSSB_);
   }

   public void init () {
      best_ssb_Index = null;
      best_ssb_Results = null;
      numberOfGoodSSB = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return best_ssb_Index;
         case 1: return best_ssb_Results;
         case 2: return numberOfGoodSSB;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "best-ssb-Index";
         case 1: return "best-ssb-Results";
         case 2: return "numberOfGoodSSB";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode best_ssb_Index

      buffer.getContext().eventDispatcher.startElement("best_ssb_Index", -1);

      best_ssb_Index = new SSB_Index();
      best_ssb_Index.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("best_ssb_Index", -1);

      // decode best_ssb_Results

      buffer.getContext().eventDispatcher.startElement("best_ssb_Results", -1);

      best_ssb_Results = new MeasQuantityResults();
      best_ssb_Results.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("best_ssb_Results", -1);

      // decode numberOfGoodSSB

      buffer.getContext().eventDispatcher.startElement("numberOfGoodSSB", -1);

      numberOfGoodSSB = new Asn1Integer();
      numberOfGoodSSB.decode (buffer, 1, 64);

      buffer.invokeCharacters(numberOfGoodSSB.toString());
      buffer.getContext().eventDispatcher.endElement("numberOfGoodSSB", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode best_ssb_Index

      if (best_ssb_Index != null) {
         buffer.getContext().eventDispatcher.startElement("best_ssb_Index", -1);

         best_ssb_Index.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("best_ssb_Index", -1);
      }
      else throw new Asn1MissingRequiredException ("best_ssb_Index");

      // encode best_ssb_Results

      if (best_ssb_Results != null) {
         buffer.getContext().eventDispatcher.startElement("best_ssb_Results", -1);

         best_ssb_Results.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("best_ssb_Results", -1);
      }
      else throw new Asn1MissingRequiredException ("best_ssb_Results");

      // encode numberOfGoodSSB

      if (numberOfGoodSSB != null) {
         buffer.getContext().eventDispatcher.startElement("numberOfGoodSSB", -1);

         numberOfGoodSSB.encode (buffer, 1, 64);

         buffer.getContext().eventDispatcher.endElement("numberOfGoodSSB", -1);
      }
      else throw new Asn1MissingRequiredException ("numberOfGoodSSB");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (best_ssb_Index != null) best_ssb_Index.print (_sb, "best_ssb_Index", _level+1);
      if (best_ssb_Results != null) best_ssb_Results.print (_sb, "best_ssb_Results", _level+1);
      if (numberOfGoodSSB != null) numberOfGoodSSB.print (_sb, "numberOfGoodSSB", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
