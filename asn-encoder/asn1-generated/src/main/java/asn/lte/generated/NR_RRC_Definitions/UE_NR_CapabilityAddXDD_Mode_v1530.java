/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_NR_CapabilityAddXDD_Mode_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-NR-CapabilityAddXDD-Mode-v1530";
   }

   public EUTRA_ParametersXDD_Diff eutra_ParametersXDD_Diff;

   public UE_NR_CapabilityAddXDD_Mode_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_NR_CapabilityAddXDD_Mode_v1530 (
      EUTRA_ParametersXDD_Diff eutra_ParametersXDD_Diff_
   ) {
      super();
      eutra_ParametersXDD_Diff = eutra_ParametersXDD_Diff_;
   }

   public void init () {
      eutra_ParametersXDD_Diff = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eutra_ParametersXDD_Diff;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eutra-ParametersXDD-Diff";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode eutra_ParametersXDD_Diff

      buffer.getContext().eventDispatcher.startElement("eutra_ParametersXDD_Diff", -1);

      eutra_ParametersXDD_Diff = new EUTRA_ParametersXDD_Diff();
      eutra_ParametersXDD_Diff.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eutra_ParametersXDD_Diff", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eutra_ParametersXDD_Diff != null) eutra_ParametersXDD_Diff.print (_sb, "eutra_ParametersXDD_Diff", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
