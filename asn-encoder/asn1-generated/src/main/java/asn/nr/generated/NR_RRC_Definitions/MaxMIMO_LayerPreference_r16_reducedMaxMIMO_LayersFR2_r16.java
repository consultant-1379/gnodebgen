/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MaxMIMO_LayerPreference_r16_reducedMaxMIMO_LayersFR2_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer reducedMIMO_LayersFR2_DL_r16;
   public Asn1Integer reducedMIMO_LayersFR2_UL_r16;

   public MaxMIMO_LayerPreference_r16_reducedMaxMIMO_LayersFR2_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MaxMIMO_LayerPreference_r16_reducedMaxMIMO_LayersFR2_r16 (
      Asn1Integer reducedMIMO_LayersFR2_DL_r16_,
      Asn1Integer reducedMIMO_LayersFR2_UL_r16_
   ) {
      super();
      reducedMIMO_LayersFR2_DL_r16 = reducedMIMO_LayersFR2_DL_r16_;
      reducedMIMO_LayersFR2_UL_r16 = reducedMIMO_LayersFR2_UL_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MaxMIMO_LayerPreference_r16_reducedMaxMIMO_LayersFR2_r16 (long reducedMIMO_LayersFR2_DL_r16_,
      long reducedMIMO_LayersFR2_UL_r16_
   ) {
      super();
      reducedMIMO_LayersFR2_DL_r16 = new Asn1Integer (reducedMIMO_LayersFR2_DL_r16_);
      reducedMIMO_LayersFR2_UL_r16 = new Asn1Integer (reducedMIMO_LayersFR2_UL_r16_);
   }

   public void init () {
      reducedMIMO_LayersFR2_DL_r16 = null;
      reducedMIMO_LayersFR2_UL_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reducedMIMO_LayersFR2_DL_r16;
         case 1: return reducedMIMO_LayersFR2_UL_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reducedMIMO-LayersFR2-DL-r16";
         case 1: return "reducedMIMO-LayersFR2-UL-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reducedMIMO_LayersFR2_DL_r16

      buffer.getContext().eventDispatcher.startElement("reducedMIMO_LayersFR2_DL_r16", -1);

      reducedMIMO_LayersFR2_DL_r16 = new Asn1Integer();
      reducedMIMO_LayersFR2_DL_r16.decode (buffer, 1, 8);

      buffer.invokeCharacters(reducedMIMO_LayersFR2_DL_r16.toString());
      buffer.getContext().eventDispatcher.endElement("reducedMIMO_LayersFR2_DL_r16", -1);

      // decode reducedMIMO_LayersFR2_UL_r16

      buffer.getContext().eventDispatcher.startElement("reducedMIMO_LayersFR2_UL_r16", -1);

      reducedMIMO_LayersFR2_UL_r16 = new Asn1Integer();
      reducedMIMO_LayersFR2_UL_r16.decode (buffer, 1, 4);

      buffer.invokeCharacters(reducedMIMO_LayersFR2_UL_r16.toString());
      buffer.getContext().eventDispatcher.endElement("reducedMIMO_LayersFR2_UL_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode reducedMIMO_LayersFR2_DL_r16

      if (reducedMIMO_LayersFR2_DL_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reducedMIMO_LayersFR2_DL_r16", -1);

         reducedMIMO_LayersFR2_DL_r16.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("reducedMIMO_LayersFR2_DL_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("reducedMIMO_LayersFR2_DL_r16");

      // encode reducedMIMO_LayersFR2_UL_r16

      if (reducedMIMO_LayersFR2_UL_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reducedMIMO_LayersFR2_UL_r16", -1);

         reducedMIMO_LayersFR2_UL_r16.encode (buffer, 1, 4);

         buffer.getContext().eventDispatcher.endElement("reducedMIMO_LayersFR2_UL_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("reducedMIMO_LayersFR2_UL_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reducedMIMO_LayersFR2_DL_r16 != null) reducedMIMO_LayersFR2_DL_r16.print (_sb, "reducedMIMO_LayersFR2_DL_r16", _level+1);
      if (reducedMIMO_LayersFR2_UL_r16 != null) reducedMIMO_LayersFR2_UL_r16.print (_sb, "reducedMIMO_LayersFR2_UL_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
