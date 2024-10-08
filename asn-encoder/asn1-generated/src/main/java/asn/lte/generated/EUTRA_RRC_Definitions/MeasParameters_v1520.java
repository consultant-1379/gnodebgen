/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasParameters_v1520 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasParameters-v1520";
   }

   public Asn1BitString measGapPatterns_v1520;  // optional

   public MeasParameters_v1520 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasParameters_v1520 (
      Asn1BitString measGapPatterns_v1520_
   ) {
      super();
      measGapPatterns_v1520 = measGapPatterns_v1520_;
   }

   public void init () {
      measGapPatterns_v1520 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measGapPatterns_v1520;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measGapPatterns-v1520";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measGapPatterns_v1520Present = buffer.decodeBit ("measGapPatterns_v1520Present");

      // decode measGapPatterns_v1520

      if (measGapPatterns_v1520Present) {
         buffer.getContext().eventDispatcher.startElement("measGapPatterns_v1520", -1);

         measGapPatterns_v1520 = new Asn1BitString();
         measGapPatterns_v1520.decode (buffer, 8, 8);

         buffer.invokeCharacters(measGapPatterns_v1520.toString());
         buffer.getContext().eventDispatcher.endElement("measGapPatterns_v1520", -1);
      }
      else {
         measGapPatterns_v1520 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measGapPatterns_v1520 != null) measGapPatterns_v1520.print (_sb, "measGapPatterns_v1520", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
