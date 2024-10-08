/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SupportedBandNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SupportedBandNR-r15";
   }

   public FreqBandIndicatorNR_r15 bandNR_r15;

   public SupportedBandNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SupportedBandNR_r15 (
      FreqBandIndicatorNR_r15 bandNR_r15_
   ) {
      super();
      bandNR_r15 = bandNR_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SupportedBandNR_r15 (long bandNR_r15_
   ) {
      super();
      bandNR_r15 = new FreqBandIndicatorNR_r15 (bandNR_r15_);
   }

   public void init () {
      bandNR_r15 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandNR_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandNR-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode bandNR_r15

      buffer.getContext().eventDispatcher.startElement("bandNR_r15", -1);

      bandNR_r15 = new FreqBandIndicatorNR_r15();
      bandNR_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandNR_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandNR_r15 != null) bandNR_r15.print (_sb, "bandNR_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
