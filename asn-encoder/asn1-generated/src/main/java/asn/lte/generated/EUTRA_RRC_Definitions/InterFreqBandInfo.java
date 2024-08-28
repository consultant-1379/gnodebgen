/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InterFreqBandInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InterFreqBandInfo";
   }

   public Asn1Boolean interFreqNeedForGaps;

   public InterFreqBandInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InterFreqBandInfo (
      Asn1Boolean interFreqNeedForGaps_
   ) {
      super();
      interFreqNeedForGaps = interFreqNeedForGaps_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public InterFreqBandInfo (boolean interFreqNeedForGaps_
   ) {
      super();
      interFreqNeedForGaps = new Asn1Boolean (interFreqNeedForGaps_);
   }

   public void init () {
      interFreqNeedForGaps = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return interFreqNeedForGaps;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "interFreqNeedForGaps";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode interFreqNeedForGaps

      buffer.getContext().eventDispatcher.startElement("interFreqNeedForGaps", -1);

      interFreqNeedForGaps = new Asn1Boolean();
      interFreqNeedForGaps.decode (buffer);

      buffer.invokeCharacters(interFreqNeedForGaps.toString());
      buffer.getContext().eventDispatcher.endElement("interFreqNeedForGaps", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (interFreqNeedForGaps != null) interFreqNeedForGaps.print (_sb, "interFreqNeedForGaps", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
