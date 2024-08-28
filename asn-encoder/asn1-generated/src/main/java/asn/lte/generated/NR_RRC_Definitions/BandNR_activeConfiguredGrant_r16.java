/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandNR_activeConfiguredGrant_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public BandNR_activeConfiguredGrant_r16_maxNumberConfigsPerBWP_r16 maxNumberConfigsPerBWP_r16 = null;
   public Asn1Integer maxNumberConfigsAllCC_r16;

   public BandNR_activeConfiguredGrant_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandNR_activeConfiguredGrant_r16 (
      BandNR_activeConfiguredGrant_r16_maxNumberConfigsPerBWP_r16 maxNumberConfigsPerBWP_r16_,
      Asn1Integer maxNumberConfigsAllCC_r16_
   ) {
      super();
      maxNumberConfigsPerBWP_r16 = maxNumberConfigsPerBWP_r16_;
      maxNumberConfigsAllCC_r16 = maxNumberConfigsAllCC_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandNR_activeConfiguredGrant_r16 (BandNR_activeConfiguredGrant_r16_maxNumberConfigsPerBWP_r16 maxNumberConfigsPerBWP_r16_,
      long maxNumberConfigsAllCC_r16_
   ) {
      super();
      maxNumberConfigsPerBWP_r16 = maxNumberConfigsPerBWP_r16_;
      maxNumberConfigsAllCC_r16 = new Asn1Integer (maxNumberConfigsAllCC_r16_);
   }

   public void init () {
      maxNumberConfigsPerBWP_r16 = null;
      maxNumberConfigsAllCC_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberConfigsPerBWP_r16;
         case 1: return maxNumberConfigsAllCC_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberConfigsPerBWP-r16";
         case 1: return "maxNumberConfigsAllCC-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberConfigsPerBWP_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberConfigsPerBWP_r16", -1);

      {
         int tval = BandNR_activeConfiguredGrant_r16_maxNumberConfigsPerBWP_r16.decodeEnumValue (buffer);
         maxNumberConfigsPerBWP_r16 = BandNR_activeConfiguredGrant_r16_maxNumberConfigsPerBWP_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberConfigsPerBWP_r16", -1);

      // decode maxNumberConfigsAllCC_r16

      buffer.getContext().eventDispatcher.startElement("maxNumberConfigsAllCC_r16", -1);

      maxNumberConfigsAllCC_r16 = new Asn1Integer();
      maxNumberConfigsAllCC_r16.decode (buffer, 2, 32);

      buffer.invokeCharacters(maxNumberConfigsAllCC_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberConfigsAllCC_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberConfigsPerBWP_r16 != null) maxNumberConfigsPerBWP_r16.print (_sb, "maxNumberConfigsPerBWP_r16", _level+1);
      if (maxNumberConfigsAllCC_r16 != null) maxNumberConfigsAllCC_r16.print (_sb, "maxNumberConfigsAllCC_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
