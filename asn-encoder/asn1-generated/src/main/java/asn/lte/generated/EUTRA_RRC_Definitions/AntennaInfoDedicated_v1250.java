/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AntennaInfoDedicated_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AntennaInfoDedicated-v1250";
   }

   public Asn1Boolean alternativeCodebookEnabledFor4TX_r12;

   public AntennaInfoDedicated_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AntennaInfoDedicated_v1250 (
      Asn1Boolean alternativeCodebookEnabledFor4TX_r12_
   ) {
      super();
      alternativeCodebookEnabledFor4TX_r12 = alternativeCodebookEnabledFor4TX_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public AntennaInfoDedicated_v1250 (boolean alternativeCodebookEnabledFor4TX_r12_
   ) {
      super();
      alternativeCodebookEnabledFor4TX_r12 = new Asn1Boolean (alternativeCodebookEnabledFor4TX_r12_);
   }

   public void init () {
      alternativeCodebookEnabledFor4TX_r12 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return alternativeCodebookEnabledFor4TX_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "alternativeCodebookEnabledFor4TX-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode alternativeCodebookEnabledFor4TX_r12

      buffer.getContext().eventDispatcher.startElement("alternativeCodebookEnabledFor4TX_r12", -1);

      alternativeCodebookEnabledFor4TX_r12 = new Asn1Boolean();
      alternativeCodebookEnabledFor4TX_r12.decode (buffer);

      buffer.invokeCharacters(alternativeCodebookEnabledFor4TX_r12.toString());
      buffer.getContext().eventDispatcher.endElement("alternativeCodebookEnabledFor4TX_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (alternativeCodebookEnabledFor4TX_r12 != null) alternativeCodebookEnabledFor4TX_r12.print (_sb, "alternativeCodebookEnabledFor4TX_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
