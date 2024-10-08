/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class P0_PUSCH_AlphaSet extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "P0-PUSCH-AlphaSet";
   }

   public P0_PUSCH_AlphaSetId p0_PUSCH_AlphaSetId;
   public Asn1Integer p0;  // optional
   public Alpha alpha = null;  // optional

   public P0_PUSCH_AlphaSet () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public P0_PUSCH_AlphaSet (
      P0_PUSCH_AlphaSetId p0_PUSCH_AlphaSetId_,
      Asn1Integer p0_,
      Alpha alpha_
   ) {
      super();
      p0_PUSCH_AlphaSetId = p0_PUSCH_AlphaSetId_;
      p0 = p0_;
      alpha = alpha_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public P0_PUSCH_AlphaSet (
      P0_PUSCH_AlphaSetId p0_PUSCH_AlphaSetId_
   ) {
      super();
      p0_PUSCH_AlphaSetId = p0_PUSCH_AlphaSetId_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public P0_PUSCH_AlphaSet (long p0_PUSCH_AlphaSetId_,
      long p0_,
      Alpha alpha_
   ) {
      super();
      p0_PUSCH_AlphaSetId = new P0_PUSCH_AlphaSetId (p0_PUSCH_AlphaSetId_);
      p0 = new Asn1Integer (p0_);
      alpha = alpha_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public P0_PUSCH_AlphaSet (
      long p0_PUSCH_AlphaSetId_
   ) {
      super();
      p0_PUSCH_AlphaSetId = new P0_PUSCH_AlphaSetId (p0_PUSCH_AlphaSetId_);
   }

   public void init () {
      p0_PUSCH_AlphaSetId = null;
      p0 = null;
      alpha = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p0_PUSCH_AlphaSetId;
         case 1: return p0;
         case 2: return alpha;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p0-PUSCH-AlphaSetId";
         case 1: return "p0";
         case 2: return "alpha";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean p0Present = buffer.decodeBit ("p0Present");
      boolean alphaPresent = buffer.decodeBit ("alphaPresent");

      // decode p0_PUSCH_AlphaSetId

      buffer.getContext().eventDispatcher.startElement("p0_PUSCH_AlphaSetId", -1);

      p0_PUSCH_AlphaSetId = new P0_PUSCH_AlphaSetId();
      p0_PUSCH_AlphaSetId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("p0_PUSCH_AlphaSetId", -1);

      // decode p0

      if (p0Present) {
         buffer.getContext().eventDispatcher.startElement("p0", -1);

         p0 = new Asn1Integer();
         p0.decode (buffer, -16, 15);

         buffer.invokeCharacters(p0.toString());
         buffer.getContext().eventDispatcher.endElement("p0", -1);
      }
      else {
         p0 = null;
      }

      // decode alpha

      if (alphaPresent) {
         buffer.getContext().eventDispatcher.startElement("alpha", -1);

         int tval = Alpha.decodeEnumValue (buffer);
         alpha = Alpha.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("alpha", -1);
      }
      else {
         alpha = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p0_PUSCH_AlphaSetId != null) p0_PUSCH_AlphaSetId.print (_sb, "p0_PUSCH_AlphaSetId", _level+1);
      if (p0 != null) p0.print (_sb, "p0", _level+1);
      if (alpha != null) alpha.print (_sb, "alpha", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
