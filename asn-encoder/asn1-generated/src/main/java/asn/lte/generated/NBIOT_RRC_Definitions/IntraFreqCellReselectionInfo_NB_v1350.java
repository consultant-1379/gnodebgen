/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IntraFreqCellReselectionInfo_NB_v1350 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IntraFreqCellReselectionInfo-NB-v1350";
   }

   public Asn1Integer delta_RxLevMin_v1350;

   public IntraFreqCellReselectionInfo_NB_v1350 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IntraFreqCellReselectionInfo_NB_v1350 (
      Asn1Integer delta_RxLevMin_v1350_
   ) {
      super();
      delta_RxLevMin_v1350 = delta_RxLevMin_v1350_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public IntraFreqCellReselectionInfo_NB_v1350 (long delta_RxLevMin_v1350_
   ) {
      super();
      delta_RxLevMin_v1350 = new Asn1Integer (delta_RxLevMin_v1350_);
   }

   public void init () {
      delta_RxLevMin_v1350 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return delta_RxLevMin_v1350;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "delta-RxLevMin-v1350";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode delta_RxLevMin_v1350

      buffer.getContext().eventDispatcher.startElement("delta_RxLevMin_v1350", -1);

      delta_RxLevMin_v1350 = new Asn1Integer();
      delta_RxLevMin_v1350.decode (buffer, -8, -1);

      buffer.invokeCharacters(delta_RxLevMin_v1350.toString());
      buffer.getContext().eventDispatcher.endElement("delta_RxLevMin_v1350", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (delta_RxLevMin_v1350 != null) delta_RxLevMin_v1350.print (_sb, "delta_RxLevMin_v1350", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
