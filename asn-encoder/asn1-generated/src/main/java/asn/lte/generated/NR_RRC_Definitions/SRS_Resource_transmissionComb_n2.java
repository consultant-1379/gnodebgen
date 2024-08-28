/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Resource_transmissionComb_n2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer combOffset_n2;
   public Asn1Integer cyclicShift_n2;

   public SRS_Resource_transmissionComb_n2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_Resource_transmissionComb_n2 (
      Asn1Integer combOffset_n2_,
      Asn1Integer cyclicShift_n2_
   ) {
      super();
      combOffset_n2 = combOffset_n2_;
      cyclicShift_n2 = cyclicShift_n2_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_Resource_transmissionComb_n2 (long combOffset_n2_,
      long cyclicShift_n2_
   ) {
      super();
      combOffset_n2 = new Asn1Integer (combOffset_n2_);
      cyclicShift_n2 = new Asn1Integer (cyclicShift_n2_);
   }

   public void init () {
      combOffset_n2 = null;
      cyclicShift_n2 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return combOffset_n2;
         case 1: return cyclicShift_n2;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "combOffset-n2";
         case 1: return "cyclicShift-n2";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode combOffset_n2

      buffer.getContext().eventDispatcher.startElement("combOffset_n2", -1);

      combOffset_n2 = new Asn1Integer();
      combOffset_n2.decode (buffer, 0, 1);

      buffer.invokeCharacters(combOffset_n2.toString());
      buffer.getContext().eventDispatcher.endElement("combOffset_n2", -1);

      // decode cyclicShift_n2

      buffer.getContext().eventDispatcher.startElement("cyclicShift_n2", -1);

      cyclicShift_n2 = new Asn1Integer();
      cyclicShift_n2.decode (buffer, 0, 7);

      buffer.invokeCharacters(cyclicShift_n2.toString());
      buffer.getContext().eventDispatcher.endElement("cyclicShift_n2", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (combOffset_n2 != null) combOffset_n2.print (_sb, "combOffset_n2", _level+1);
      if (cyclicShift_n2 != null) cyclicShift_n2.print (_sb, "cyclicShift_n2", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
