/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DataBLER_MCH_Result_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DataBLER-MCH-Result-r12";
   }

   public Asn1Integer mch_Index_r12;
   public BLER_Result_r12 dataBLER_Result_r12;

   public DataBLER_MCH_Result_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DataBLER_MCH_Result_r12 (
      Asn1Integer mch_Index_r12_,
      BLER_Result_r12 dataBLER_Result_r12_
   ) {
      super();
      mch_Index_r12 = mch_Index_r12_;
      dataBLER_Result_r12 = dataBLER_Result_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DataBLER_MCH_Result_r12 (long mch_Index_r12_,
      BLER_Result_r12 dataBLER_Result_r12_
   ) {
      super();
      mch_Index_r12 = new Asn1Integer (mch_Index_r12_);
      dataBLER_Result_r12 = dataBLER_Result_r12_;
   }

   public void init () {
      mch_Index_r12 = null;
      dataBLER_Result_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mch_Index_r12;
         case 1: return dataBLER_Result_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mch-Index-r12";
         case 1: return "dataBLER-Result-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode mch_Index_r12

      buffer.getContext().eventDispatcher.startElement("mch_Index_r12", -1);

      mch_Index_r12 = new Asn1Integer();
      mch_Index_r12.decode (buffer, 1, 15);

      buffer.invokeCharacters(mch_Index_r12.toString());
      buffer.getContext().eventDispatcher.endElement("mch_Index_r12", -1);

      // decode dataBLER_Result_r12

      buffer.getContext().eventDispatcher.startElement("dataBLER_Result_r12", -1);

      dataBLER_Result_r12 = new BLER_Result_r12();
      dataBLER_Result_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dataBLER_Result_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mch_Index_r12 != null) mch_Index_r12.print (_sb, "mch_Index_r12", _level+1);
      if (dataBLER_Result_r12 != null) dataBLER_Result_r12.print (_sb, "dataBLER_Result_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
