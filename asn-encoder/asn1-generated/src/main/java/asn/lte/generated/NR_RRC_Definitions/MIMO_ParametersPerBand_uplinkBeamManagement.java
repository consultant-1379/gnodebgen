/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_uplinkBeamManagement extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM maxNumberSRS_ResourcePerSet_BM = null;
   public Asn1Integer maxNumberSRS_ResourceSet;

   public MIMO_ParametersPerBand_uplinkBeamManagement () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MIMO_ParametersPerBand_uplinkBeamManagement (
      MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM maxNumberSRS_ResourcePerSet_BM_,
      Asn1Integer maxNumberSRS_ResourceSet_
   ) {
      super();
      maxNumberSRS_ResourcePerSet_BM = maxNumberSRS_ResourcePerSet_BM_;
      maxNumberSRS_ResourceSet = maxNumberSRS_ResourceSet_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MIMO_ParametersPerBand_uplinkBeamManagement (MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM maxNumberSRS_ResourcePerSet_BM_,
      long maxNumberSRS_ResourceSet_
   ) {
      super();
      maxNumberSRS_ResourcePerSet_BM = maxNumberSRS_ResourcePerSet_BM_;
      maxNumberSRS_ResourceSet = new Asn1Integer (maxNumberSRS_ResourceSet_);
   }

   public void init () {
      maxNumberSRS_ResourcePerSet_BM = null;
      maxNumberSRS_ResourceSet = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberSRS_ResourcePerSet_BM;
         case 1: return maxNumberSRS_ResourceSet;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberSRS-ResourcePerSet-BM";
         case 1: return "maxNumberSRS-ResourceSet";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberSRS_ResourcePerSet_BM

      buffer.getContext().eventDispatcher.startElement("maxNumberSRS_ResourcePerSet_BM", -1);

      {
         int tval = MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM.decodeEnumValue (buffer);
         maxNumberSRS_ResourcePerSet_BM = MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberSRS_ResourcePerSet_BM", -1);

      // decode maxNumberSRS_ResourceSet

      buffer.getContext().eventDispatcher.startElement("maxNumberSRS_ResourceSet", -1);

      maxNumberSRS_ResourceSet = new Asn1Integer();
      maxNumberSRS_ResourceSet.decode (buffer, 1, 8);

      buffer.invokeCharacters(maxNumberSRS_ResourceSet.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberSRS_ResourceSet", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberSRS_ResourcePerSet_BM != null) maxNumberSRS_ResourcePerSet_BM.print (_sb, "maxNumberSRS_ResourcePerSet_BM", _level+1);
      if (maxNumberSRS_ResourceSet != null) maxNumberSRS_ResourceSet.print (_sb, "maxNumberSRS_ResourceSet", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
