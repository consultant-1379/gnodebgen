/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResult2EUTRA_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResult2EUTRA-r16";
   }

   public ARFCN_ValueEUTRA carrierFreq_r16;
   public MeasResultListEUTRA measResultList_r16;

   public MeasResult2EUTRA_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResult2EUTRA_r16 (
      ARFCN_ValueEUTRA carrierFreq_r16_,
      MeasResultListEUTRA measResultList_r16_
   ) {
      super();
      carrierFreq_r16 = carrierFreq_r16_;
      measResultList_r16 = measResultList_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResult2EUTRA_r16 (long carrierFreq_r16_,
      MeasResultListEUTRA measResultList_r16_
   ) {
      super();
      carrierFreq_r16 = new ARFCN_ValueEUTRA (carrierFreq_r16_);
      measResultList_r16 = measResultList_r16_;
   }

   public void init () {
      carrierFreq_r16 = null;
      measResultList_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r16;
         case 1: return measResultList_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r16";
         case 1: return "measResultList-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode carrierFreq_r16

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r16", -1);

      carrierFreq_r16 = new ARFCN_ValueEUTRA();
      carrierFreq_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r16", -1);

      // decode measResultList_r16

      buffer.getContext().eventDispatcher.startElement("measResultList_r16", -1);

      measResultList_r16 = new MeasResultListEUTRA();
      measResultList_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measResultList_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq_r16 != null) carrierFreq_r16.print (_sb, "carrierFreq_r16", _level+1);
      if (measResultList_r16 != null) measResultList_r16.print (_sb, "measResultList_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
