/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersMRDC_Common extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasAndMobParametersMRDC-Common";
   }

   public MeasAndMobParametersMRDC_Common_independentGapConfig independentGapConfig = null;  // optional

   public MeasAndMobParametersMRDC_Common () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersMRDC_Common (
      MeasAndMobParametersMRDC_Common_independentGapConfig independentGapConfig_
   ) {
      super();
      independentGapConfig = independentGapConfig_;
   }

   public void init () {
      independentGapConfig = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return independentGapConfig;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "independentGapConfig";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean independentGapConfigPresent = buffer.decodeBit ("independentGapConfigPresent");

      // decode independentGapConfig

      if (independentGapConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("independentGapConfig", -1);

         int tval = MeasAndMobParametersMRDC_Common_independentGapConfig.decodeEnumValue (buffer);
         independentGapConfig = MeasAndMobParametersMRDC_Common_independentGapConfig.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("independentGapConfig", -1);
      }
      else {
         independentGapConfig = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((independentGapConfig != null), null);

      // encode independentGapConfig

      if (independentGapConfig != null) {
         buffer.getContext().eventDispatcher.startElement("independentGapConfig", -1);

         independentGapConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("independentGapConfig", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (independentGapConfig != null) independentGapConfig.print (_sb, "independentGapConfig", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
