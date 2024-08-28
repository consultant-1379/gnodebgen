/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NR_MultiBandInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NR-MultiBandInfo";
   }

   public FreqBandIndicatorNR freqBandIndicatorNR;  // optional
   public NR_NS_PmaxList nr_NS_PmaxList;  // optional

   public NR_MultiBandInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NR_MultiBandInfo (
      FreqBandIndicatorNR freqBandIndicatorNR_,
      NR_NS_PmaxList nr_NS_PmaxList_
   ) {
      super();
      freqBandIndicatorNR = freqBandIndicatorNR_;
      nr_NS_PmaxList = nr_NS_PmaxList_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NR_MultiBandInfo (long freqBandIndicatorNR_,
      NR_NS_PmaxList nr_NS_PmaxList_
   ) {
      super();
      freqBandIndicatorNR = new FreqBandIndicatorNR (freqBandIndicatorNR_);
      nr_NS_PmaxList = nr_NS_PmaxList_;
   }

   public void init () {
      freqBandIndicatorNR = null;
      nr_NS_PmaxList = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqBandIndicatorNR;
         case 1: return nr_NS_PmaxList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqBandIndicatorNR";
         case 1: return "nr-NS-PmaxList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean freqBandIndicatorNRPresent = buffer.decodeBit ("freqBandIndicatorNRPresent");
      boolean nr_NS_PmaxListPresent = buffer.decodeBit ("nr_NS_PmaxListPresent");

      // decode freqBandIndicatorNR

      if (freqBandIndicatorNRPresent) {
         buffer.getContext().eventDispatcher.startElement("freqBandIndicatorNR", -1);

         freqBandIndicatorNR = new FreqBandIndicatorNR();
         freqBandIndicatorNR.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("freqBandIndicatorNR", -1);
      }
      else {
         freqBandIndicatorNR = null;
      }

      // decode nr_NS_PmaxList

      if (nr_NS_PmaxListPresent) {
         buffer.getContext().eventDispatcher.startElement("nr_NS_PmaxList", -1);

         nr_NS_PmaxList = new NR_NS_PmaxList();
         nr_NS_PmaxList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nr_NS_PmaxList", -1);
      }
      else {
         nr_NS_PmaxList = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((freqBandIndicatorNR != null), null);
      buffer.encodeBit ((nr_NS_PmaxList != null), null);

      // encode freqBandIndicatorNR

      if (freqBandIndicatorNR != null) {
         buffer.getContext().eventDispatcher.startElement("freqBandIndicatorNR", -1);

         freqBandIndicatorNR.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("freqBandIndicatorNR", -1);
      }

      // encode nr_NS_PmaxList

      if (nr_NS_PmaxList != null) {
         buffer.getContext().eventDispatcher.startElement("nr_NS_PmaxList", -1);

         nr_NS_PmaxList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nr_NS_PmaxList", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (freqBandIndicatorNR != null) freqBandIndicatorNR.print (_sb, "freqBandIndicatorNR", _level+1);
      if (nr_NS_PmaxList != null) nr_NS_PmaxList.print (_sb, "nr_NS_PmaxList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
