/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RF_Parameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RF-Parameters";
   }

   public SupportedBandListEUTRA supportedBandListEUTRA;

   public RF_Parameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RF_Parameters (
      SupportedBandListEUTRA supportedBandListEUTRA_
   ) {
      super();
      supportedBandListEUTRA = supportedBandListEUTRA_;
   }

   public void init () {
      supportedBandListEUTRA = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedBandListEUTRA;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedBandListEUTRA";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode supportedBandListEUTRA

      buffer.getContext().eventDispatcher.startElement("supportedBandListEUTRA", -1);

      supportedBandListEUTRA = new SupportedBandListEUTRA();
      supportedBandListEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedBandListEUTRA", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedBandListEUTRA != null) supportedBandListEUTRA.print (_sb, "supportedBandListEUTRA", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
