/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersMRDC_v1560 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasAndMobParametersMRDC-v1560";
   }

   public MeasAndMobParametersMRDC_XDD_Diff_v1560 measAndMobParametersMRDC_XDD_Diff_v1560;  // optional

   public MeasAndMobParametersMRDC_v1560 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersMRDC_v1560 (
      MeasAndMobParametersMRDC_XDD_Diff_v1560 measAndMobParametersMRDC_XDD_Diff_v1560_
   ) {
      super();
      measAndMobParametersMRDC_XDD_Diff_v1560 = measAndMobParametersMRDC_XDD_Diff_v1560_;
   }

   public void init () {
      measAndMobParametersMRDC_XDD_Diff_v1560 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measAndMobParametersMRDC_XDD_Diff_v1560;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measAndMobParametersMRDC-XDD-Diff-v1560";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measAndMobParametersMRDC_XDD_Diff_v1560Present = buffer.decodeBit ("measAndMobParametersMRDC_XDD_Diff_v1560Present");

      // decode measAndMobParametersMRDC_XDD_Diff_v1560

      if (measAndMobParametersMRDC_XDD_Diff_v1560Present) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersMRDC_XDD_Diff_v1560", -1);

         measAndMobParametersMRDC_XDD_Diff_v1560 = new MeasAndMobParametersMRDC_XDD_Diff_v1560();
         measAndMobParametersMRDC_XDD_Diff_v1560.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measAndMobParametersMRDC_XDD_Diff_v1560", -1);
      }
      else {
         measAndMobParametersMRDC_XDD_Diff_v1560 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measAndMobParametersMRDC_XDD_Diff_v1560 != null), null);

      // encode measAndMobParametersMRDC_XDD_Diff_v1560

      if (measAndMobParametersMRDC_XDD_Diff_v1560 != null) {
         buffer.getContext().eventDispatcher.startElement("measAndMobParametersMRDC_XDD_Diff_v1560", -1);

         measAndMobParametersMRDC_XDD_Diff_v1560.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measAndMobParametersMRDC_XDD_Diff_v1560", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measAndMobParametersMRDC_XDD_Diff_v1560 != null) measAndMobParametersMRDC_XDD_Diff_v1560.print (_sb, "measAndMobParametersMRDC_XDD_Diff_v1560", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
