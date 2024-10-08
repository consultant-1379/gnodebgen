/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RedistributionInterFreqInfo_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RedistributionInterFreqInfo-r13";
   }

   public RedistributionFactor_r13 redistributionFactorFreq_r13;  // optional
   public RedistributionNeighCellList_r13 redistributionNeighCellList_r13;  // optional

   public RedistributionInterFreqInfo_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RedistributionInterFreqInfo_r13 (
      RedistributionFactor_r13 redistributionFactorFreq_r13_,
      RedistributionNeighCellList_r13 redistributionNeighCellList_r13_
   ) {
      super();
      redistributionFactorFreq_r13 = redistributionFactorFreq_r13_;
      redistributionNeighCellList_r13 = redistributionNeighCellList_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RedistributionInterFreqInfo_r13 (long redistributionFactorFreq_r13_,
      RedistributionNeighCellList_r13 redistributionNeighCellList_r13_
   ) {
      super();
      redistributionFactorFreq_r13 = new RedistributionFactor_r13 (redistributionFactorFreq_r13_);
      redistributionNeighCellList_r13 = redistributionNeighCellList_r13_;
   }

   public void init () {
      redistributionFactorFreq_r13 = null;
      redistributionNeighCellList_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return redistributionFactorFreq_r13;
         case 1: return redistributionNeighCellList_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "redistributionFactorFreq-r13";
         case 1: return "redistributionNeighCellList-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean redistributionFactorFreq_r13Present = buffer.decodeBit ("redistributionFactorFreq_r13Present");
      boolean redistributionNeighCellList_r13Present = buffer.decodeBit ("redistributionNeighCellList_r13Present");

      // decode redistributionFactorFreq_r13

      if (redistributionFactorFreq_r13Present) {
         buffer.getContext().eventDispatcher.startElement("redistributionFactorFreq_r13", -1);

         redistributionFactorFreq_r13 = new RedistributionFactor_r13();
         redistributionFactorFreq_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redistributionFactorFreq_r13", -1);
      }
      else {
         redistributionFactorFreq_r13 = null;
      }

      // decode redistributionNeighCellList_r13

      if (redistributionNeighCellList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("redistributionNeighCellList_r13", -1);

         redistributionNeighCellList_r13 = new RedistributionNeighCellList_r13();
         redistributionNeighCellList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("redistributionNeighCellList_r13", -1);
      }
      else {
         redistributionNeighCellList_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (redistributionFactorFreq_r13 != null) redistributionFactorFreq_r13.print (_sb, "redistributionFactorFreq_r13", _level+1);
      if (redistributionNeighCellList_r13 != null) redistributionNeighCellList_r13.print (_sb, "redistributionNeighCellList_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
