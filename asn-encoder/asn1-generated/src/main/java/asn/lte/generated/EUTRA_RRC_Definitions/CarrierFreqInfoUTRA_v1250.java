/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqInfoUTRA_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierFreqInfoUTRA-v1250";
   }

   public CarrierFreqInfoUTRA_v1250_reducedMeasPerformance_r12 reducedMeasPerformance_r12 = null;  // optional

   public CarrierFreqInfoUTRA_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqInfoUTRA_v1250 (
      CarrierFreqInfoUTRA_v1250_reducedMeasPerformance_r12 reducedMeasPerformance_r12_
   ) {
      super();
      reducedMeasPerformance_r12 = reducedMeasPerformance_r12_;
   }

   public void init () {
      reducedMeasPerformance_r12 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reducedMeasPerformance_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reducedMeasPerformance-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean reducedMeasPerformance_r12Present = buffer.decodeBit ("reducedMeasPerformance_r12Present");

      // decode reducedMeasPerformance_r12

      if (reducedMeasPerformance_r12Present) {
         buffer.getContext().eventDispatcher.startElement("reducedMeasPerformance_r12", -1);

         int tval = CarrierFreqInfoUTRA_v1250_reducedMeasPerformance_r12.decodeEnumValue (buffer);
         reducedMeasPerformance_r12 = CarrierFreqInfoUTRA_v1250_reducedMeasPerformance_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reducedMeasPerformance_r12", -1);
      }
      else {
         reducedMeasPerformance_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reducedMeasPerformance_r12 != null) reducedMeasPerformance_r12.print (_sb, "reducedMeasPerformance_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
