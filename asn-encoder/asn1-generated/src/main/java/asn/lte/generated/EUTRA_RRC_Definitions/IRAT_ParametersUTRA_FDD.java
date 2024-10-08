/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IRAT_ParametersUTRA_FDD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IRAT-ParametersUTRA-FDD";
   }

   public SupportedBandListUTRA_FDD supportedBandListUTRA_FDD;

   public IRAT_ParametersUTRA_FDD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IRAT_ParametersUTRA_FDD (
      SupportedBandListUTRA_FDD supportedBandListUTRA_FDD_
   ) {
      super();
      supportedBandListUTRA_FDD = supportedBandListUTRA_FDD_;
   }

   public void init () {
      supportedBandListUTRA_FDD = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandListUTRA_FDD;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandListUTRA-FDD";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode supportedBandListUTRA_FDD

      buffer.getContext().eventDispatcher.startElement("supportedBandListUTRA_FDD", -1);

      supportedBandListUTRA_FDD = new SupportedBandListUTRA_FDD();
      supportedBandListUTRA_FDD.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedBandListUTRA_FDD", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedBandListUTRA_FDD != null) supportedBandListUTRA_FDD.print (_sb, "supportedBandListUTRA_FDD", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
