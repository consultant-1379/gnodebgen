/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandInfoEUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandInfoEUTRA";
   }

   public InterFreqBandList interFreqBandList;
   public InterRAT_BandList interRAT_BandList;  // optional

   public BandInfoEUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandInfoEUTRA (
      InterFreqBandList interFreqBandList_,
      InterRAT_BandList interRAT_BandList_
   ) {
      super();
      interFreqBandList = interFreqBandList_;
      interRAT_BandList = interRAT_BandList_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandInfoEUTRA (
      InterFreqBandList interFreqBandList_
   ) {
      super();
      interFreqBandList = interFreqBandList_;
   }

   public void init () {
      interFreqBandList = null;
      interRAT_BandList = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return interFreqBandList;
         case 1: return interRAT_BandList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "interFreqBandList";
         case 1: return "interRAT-BandList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean interRAT_BandListPresent = buffer.decodeBit ("interRAT_BandListPresent");

      // decode interFreqBandList

      buffer.getContext().eventDispatcher.startElement("interFreqBandList", -1);

      interFreqBandList = new InterFreqBandList();
      interFreqBandList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("interFreqBandList", -1);

      // decode interRAT_BandList

      if (interRAT_BandListPresent) {
         buffer.getContext().eventDispatcher.startElement("interRAT_BandList", -1);

         interRAT_BandList = new InterRAT_BandList();
         interRAT_BandList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interRAT_BandList", -1);
      }
      else {
         interRAT_BandList = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (interFreqBandList != null) interFreqBandList.print (_sb, "interFreqBandList", _level+1);
      if (interRAT_BandList != null) interRAT_BandList.print (_sb, "interRAT_BandList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
