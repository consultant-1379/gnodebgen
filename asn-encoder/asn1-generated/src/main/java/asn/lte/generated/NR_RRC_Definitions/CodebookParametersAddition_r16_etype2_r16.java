/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookParametersAddition_r16_etype2_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CodebookParametersAddition_r16_etype2_r16_etype2R1_r16 etype2R1_r16;
   public CodebookParametersAddition_r16_etype2_r16_etype2R2_r16 etype2R2_r16;  // optional
   public CodebookParametersAddition_r16_etype2_r16_paramComb7_8_r16 paramComb7_8_r16 = null;  // optional
   public CodebookParametersAddition_r16_etype2_r16_rank3_4_r16 rank3_4_r16 = null;  // optional
   public CodebookParametersAddition_r16_etype2_r16_amplitudeSubsetRestriction_r16 amplitudeSubsetRestriction_r16 = null;  // optional

   public CodebookParametersAddition_r16_etype2_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CodebookParametersAddition_r16_etype2_r16 (
      CodebookParametersAddition_r16_etype2_r16_etype2R1_r16 etype2R1_r16_,
      CodebookParametersAddition_r16_etype2_r16_etype2R2_r16 etype2R2_r16_,
      CodebookParametersAddition_r16_etype2_r16_paramComb7_8_r16 paramComb7_8_r16_,
      CodebookParametersAddition_r16_etype2_r16_rank3_4_r16 rank3_4_r16_,
      CodebookParametersAddition_r16_etype2_r16_amplitudeSubsetRestriction_r16 amplitudeSubsetRestriction_r16_
   ) {
      super();
      etype2R1_r16 = etype2R1_r16_;
      etype2R2_r16 = etype2R2_r16_;
      paramComb7_8_r16 = paramComb7_8_r16_;
      rank3_4_r16 = rank3_4_r16_;
      amplitudeSubsetRestriction_r16 = amplitudeSubsetRestriction_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CodebookParametersAddition_r16_etype2_r16 (
      CodebookParametersAddition_r16_etype2_r16_etype2R1_r16 etype2R1_r16_
   ) {
      super();
      etype2R1_r16 = etype2R1_r16_;
   }

   public void init () {
      etype2R1_r16 = null;
      etype2R2_r16 = null;
      paramComb7_8_r16 = null;
      rank3_4_r16 = null;
      amplitudeSubsetRestriction_r16 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return etype2R1_r16;
         case 1: return etype2R2_r16;
         case 2: return paramComb7_8_r16;
         case 3: return rank3_4_r16;
         case 4: return amplitudeSubsetRestriction_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "etype2R1-r16";
         case 1: return "etype2R2-r16";
         case 2: return "paramComb7-8-r16";
         case 3: return "rank3-4-r16";
         case 4: return "amplitudeSubsetRestriction-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean etype2R2_r16Present = buffer.decodeBit ("etype2R2_r16Present");
      boolean paramComb7_8_r16Present = buffer.decodeBit ("paramComb7_8_r16Present");
      boolean rank3_4_r16Present = buffer.decodeBit ("rank3_4_r16Present");
      boolean amplitudeSubsetRestriction_r16Present = buffer.decodeBit ("amplitudeSubsetRestriction_r16Present");

      // decode etype2R1_r16

      buffer.getContext().eventDispatcher.startElement("etype2R1_r16", -1);

      etype2R1_r16 = new CodebookParametersAddition_r16_etype2_r16_etype2R1_r16();
      etype2R1_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("etype2R1_r16", -1);

      // decode etype2R2_r16

      if (etype2R2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("etype2R2_r16", -1);

         etype2R2_r16 = new CodebookParametersAddition_r16_etype2_r16_etype2R2_r16();
         etype2R2_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("etype2R2_r16", -1);
      }
      else {
         etype2R2_r16 = null;
      }

      // decode paramComb7_8_r16

      if (paramComb7_8_r16Present) {
         buffer.getContext().eventDispatcher.startElement("paramComb7_8_r16", -1);

         int tval = CodebookParametersAddition_r16_etype2_r16_paramComb7_8_r16.decodeEnumValue (buffer);
         paramComb7_8_r16 = CodebookParametersAddition_r16_etype2_r16_paramComb7_8_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("paramComb7_8_r16", -1);
      }
      else {
         paramComb7_8_r16 = null;
      }

      // decode rank3_4_r16

      if (rank3_4_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rank3_4_r16", -1);

         int tval = CodebookParametersAddition_r16_etype2_r16_rank3_4_r16.decodeEnumValue (buffer);
         rank3_4_r16 = CodebookParametersAddition_r16_etype2_r16_rank3_4_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rank3_4_r16", -1);
      }
      else {
         rank3_4_r16 = null;
      }

      // decode amplitudeSubsetRestriction_r16

      if (amplitudeSubsetRestriction_r16Present) {
         buffer.getContext().eventDispatcher.startElement("amplitudeSubsetRestriction_r16", -1);

         int tval = CodebookParametersAddition_r16_etype2_r16_amplitudeSubsetRestriction_r16.decodeEnumValue (buffer);
         amplitudeSubsetRestriction_r16 = CodebookParametersAddition_r16_etype2_r16_amplitudeSubsetRestriction_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("amplitudeSubsetRestriction_r16", -1);
      }
      else {
         amplitudeSubsetRestriction_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (etype2R1_r16 != null) etype2R1_r16.print (_sb, "etype2R1_r16", _level+1);
      if (etype2R2_r16 != null) etype2R2_r16.print (_sb, "etype2R2_r16", _level+1);
      if (paramComb7_8_r16 != null) paramComb7_8_r16.print (_sb, "paramComb7_8_r16", _level+1);
      if (rank3_4_r16 != null) rank3_4_r16.print (_sb, "rank3_4_r16", _level+1);
      if (amplitudeSubsetRestriction_r16 != null) amplitudeSubsetRestriction_r16.print (_sb, "amplitudeSubsetRestriction_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
