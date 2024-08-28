/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasSubframePatternConfigNeigh_r10_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasSubframePattern_r10 measSubframePatternNeigh_r10;
   public MeasSubframeCellList_r10 measSubframeCellList_r10;  // optional

   public MeasSubframePatternConfigNeigh_r10_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasSubframePatternConfigNeigh_r10_setup (
      MeasSubframePattern_r10 measSubframePatternNeigh_r10_,
      MeasSubframeCellList_r10 measSubframeCellList_r10_
   ) {
      super();
      measSubframePatternNeigh_r10 = measSubframePatternNeigh_r10_;
      measSubframeCellList_r10 = measSubframeCellList_r10_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasSubframePatternConfigNeigh_r10_setup (
      MeasSubframePattern_r10 measSubframePatternNeigh_r10_
   ) {
      super();
      measSubframePatternNeigh_r10 = measSubframePatternNeigh_r10_;
   }

   public void init () {
      measSubframePatternNeigh_r10 = null;
      measSubframeCellList_r10 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measSubframePatternNeigh_r10;
         case 1: return measSubframeCellList_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measSubframePatternNeigh-r10";
         case 1: return "measSubframeCellList-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measSubframeCellList_r10Present = buffer.decodeBit ("measSubframeCellList_r10Present");

      // decode measSubframePatternNeigh_r10

      buffer.getContext().eventDispatcher.startElement("measSubframePatternNeigh_r10", -1);

      measSubframePatternNeigh_r10 = new MeasSubframePattern_r10();
      measSubframePatternNeigh_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measSubframePatternNeigh_r10", -1);

      // decode measSubframeCellList_r10

      if (measSubframeCellList_r10Present) {
         buffer.getContext().eventDispatcher.startElement("measSubframeCellList_r10", -1);

         measSubframeCellList_r10 = new MeasSubframeCellList_r10();
         measSubframeCellList_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measSubframeCellList_r10", -1);
      }
      else {
         measSubframeCellList_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measSubframePatternNeigh_r10 != null) measSubframePatternNeigh_r10.print (_sb, "measSubframePatternNeigh_r10", _level+1);
      if (measSubframeCellList_r10 != null) measSubframeCellList_r10.print (_sb, "measSubframeCellList_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
