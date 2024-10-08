/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_ConfigAp_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-ConfigAp-v1310";
   }

   public Asn1Integer transmissionCombAp_v1310;  // optional
   public SRS_ConfigAp_v1310_cyclicShiftAp_v1310 cyclicShiftAp_v1310 = null;  // optional
   public SRS_ConfigAp_v1310_transmissionCombNum_r13 transmissionCombNum_r13 = null;  // optional

   public SRS_ConfigAp_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_ConfigAp_v1310 (
      Asn1Integer transmissionCombAp_v1310_,
      SRS_ConfigAp_v1310_cyclicShiftAp_v1310 cyclicShiftAp_v1310_,
      SRS_ConfigAp_v1310_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      transmissionCombAp_v1310 = transmissionCombAp_v1310_;
      cyclicShiftAp_v1310 = cyclicShiftAp_v1310_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_ConfigAp_v1310 (long transmissionCombAp_v1310_,
      SRS_ConfigAp_v1310_cyclicShiftAp_v1310 cyclicShiftAp_v1310_,
      SRS_ConfigAp_v1310_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      transmissionCombAp_v1310 = new Asn1Integer (transmissionCombAp_v1310_);
      cyclicShiftAp_v1310 = cyclicShiftAp_v1310_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   public void init () {
      transmissionCombAp_v1310 = null;
      cyclicShiftAp_v1310 = null;
      transmissionCombNum_r13 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return transmissionCombAp_v1310;
         case 1: return cyclicShiftAp_v1310;
         case 2: return transmissionCombNum_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "transmissionCombAp-v1310";
         case 1: return "cyclicShiftAp-v1310";
         case 2: return "transmissionCombNum-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean transmissionCombAp_v1310Present = buffer.decodeBit ("transmissionCombAp_v1310Present");
      boolean cyclicShiftAp_v1310Present = buffer.decodeBit ("cyclicShiftAp_v1310Present");
      boolean transmissionCombNum_r13Present = buffer.decodeBit ("transmissionCombNum_r13Present");

      // decode transmissionCombAp_v1310

      if (transmissionCombAp_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("transmissionCombAp_v1310", -1);

         transmissionCombAp_v1310 = new Asn1Integer();
         transmissionCombAp_v1310.decode (buffer, 2, 3);

         buffer.invokeCharacters(transmissionCombAp_v1310.toString());
         buffer.getContext().eventDispatcher.endElement("transmissionCombAp_v1310", -1);
      }
      else {
         transmissionCombAp_v1310 = null;
      }

      // decode cyclicShiftAp_v1310

      if (cyclicShiftAp_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("cyclicShiftAp_v1310", -1);

         int tval = SRS_ConfigAp_v1310_cyclicShiftAp_v1310.decodeEnumValue (buffer);
         cyclicShiftAp_v1310 = SRS_ConfigAp_v1310_cyclicShiftAp_v1310.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cyclicShiftAp_v1310", -1);
      }
      else {
         cyclicShiftAp_v1310 = null;
      }

      // decode transmissionCombNum_r13

      if (transmissionCombNum_r13Present) {
         buffer.getContext().eventDispatcher.startElement("transmissionCombNum_r13", -1);

         int tval = SRS_ConfigAp_v1310_transmissionCombNum_r13.decodeEnumValue (buffer);
         transmissionCombNum_r13 = SRS_ConfigAp_v1310_transmissionCombNum_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("transmissionCombNum_r13", -1);
      }
      else {
         transmissionCombNum_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (transmissionCombAp_v1310 != null) transmissionCombAp_v1310.print (_sb, "transmissionCombAp_v1310", _level+1);
      if (cyclicShiftAp_v1310 != null) cyclicShiftAp_v1310.print (_sb, "cyclicShiftAp_v1310", _level+1);
      if (transmissionCombNum_r13 != null) transmissionCombNum_r13.print (_sb, "transmissionCombNum_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
