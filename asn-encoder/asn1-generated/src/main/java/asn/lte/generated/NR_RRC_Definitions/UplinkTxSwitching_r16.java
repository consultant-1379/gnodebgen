/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkTxSwitching_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkTxSwitching-r16";
   }

   public Asn1Boolean uplinkTxSwitchingPeriodLocation_r16;
   public UplinkTxSwitching_r16_uplinkTxSwitchingCarrier_r16 uplinkTxSwitchingCarrier_r16 = null;

   public UplinkTxSwitching_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkTxSwitching_r16 (
      Asn1Boolean uplinkTxSwitchingPeriodLocation_r16_,
      UplinkTxSwitching_r16_uplinkTxSwitchingCarrier_r16 uplinkTxSwitchingCarrier_r16_
   ) {
      super();
      uplinkTxSwitchingPeriodLocation_r16 = uplinkTxSwitchingPeriodLocation_r16_;
      uplinkTxSwitchingCarrier_r16 = uplinkTxSwitchingCarrier_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UplinkTxSwitching_r16 (boolean uplinkTxSwitchingPeriodLocation_r16_,
      UplinkTxSwitching_r16_uplinkTxSwitchingCarrier_r16 uplinkTxSwitchingCarrier_r16_
   ) {
      super();
      uplinkTxSwitchingPeriodLocation_r16 = new Asn1Boolean (uplinkTxSwitchingPeriodLocation_r16_);
      uplinkTxSwitchingCarrier_r16 = uplinkTxSwitchingCarrier_r16_;
   }

   public void init () {
      uplinkTxSwitchingPeriodLocation_r16 = null;
      uplinkTxSwitchingCarrier_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return uplinkTxSwitchingPeriodLocation_r16;
         case 1: return uplinkTxSwitchingCarrier_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "uplinkTxSwitchingPeriodLocation-r16";
         case 1: return "uplinkTxSwitchingCarrier-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode uplinkTxSwitchingPeriodLocation_r16

      buffer.getContext().eventDispatcher.startElement("uplinkTxSwitchingPeriodLocation_r16", -1);

      uplinkTxSwitchingPeriodLocation_r16 = new Asn1Boolean();
      uplinkTxSwitchingPeriodLocation_r16.decode (buffer);

      buffer.invokeCharacters(uplinkTxSwitchingPeriodLocation_r16.toString());
      buffer.getContext().eventDispatcher.endElement("uplinkTxSwitchingPeriodLocation_r16", -1);

      // decode uplinkTxSwitchingCarrier_r16

      buffer.getContext().eventDispatcher.startElement("uplinkTxSwitchingCarrier_r16", -1);

      {
         int tval = UplinkTxSwitching_r16_uplinkTxSwitchingCarrier_r16.decodeEnumValue (buffer);
         uplinkTxSwitchingCarrier_r16 = UplinkTxSwitching_r16_uplinkTxSwitchingCarrier_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("uplinkTxSwitchingCarrier_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (uplinkTxSwitchingPeriodLocation_r16 != null) uplinkTxSwitchingPeriodLocation_r16.print (_sb, "uplinkTxSwitchingPeriodLocation_r16", _level+1);
      if (uplinkTxSwitchingCarrier_r16 != null) uplinkTxSwitchingCarrier_r16.print (_sb, "uplinkTxSwitchingCarrier_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
