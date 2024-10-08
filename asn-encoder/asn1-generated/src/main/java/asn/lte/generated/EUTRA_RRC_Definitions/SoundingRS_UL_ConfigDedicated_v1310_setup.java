/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_UL_ConfigDedicated_v1310_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer transmissionComb_v1310;  // optional
   public SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cyclicShift_v1310 = null;  // optional
   public SoundingRS_UL_ConfigDedicated_v1310_setup_transmissionCombNum_r13 transmissionCombNum_r13 = null;  // optional

   public SoundingRS_UL_ConfigDedicated_v1310_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SoundingRS_UL_ConfigDedicated_v1310_setup (
      Asn1Integer transmissionComb_v1310_,
      SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cyclicShift_v1310_,
      SoundingRS_UL_ConfigDedicated_v1310_setup_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      transmissionComb_v1310 = transmissionComb_v1310_;
      cyclicShift_v1310 = cyclicShift_v1310_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SoundingRS_UL_ConfigDedicated_v1310_setup (long transmissionComb_v1310_,
      SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cyclicShift_v1310_,
      SoundingRS_UL_ConfigDedicated_v1310_setup_transmissionCombNum_r13 transmissionCombNum_r13_
   ) {
      super();
      transmissionComb_v1310 = new Asn1Integer (transmissionComb_v1310_);
      cyclicShift_v1310 = cyclicShift_v1310_;
      transmissionCombNum_r13 = transmissionCombNum_r13_;
   }

   public void init () {
      transmissionComb_v1310 = null;
      cyclicShift_v1310 = null;
      transmissionCombNum_r13 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return transmissionComb_v1310;
         case 1: return cyclicShift_v1310;
         case 2: return transmissionCombNum_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "transmissionComb-v1310";
         case 1: return "cyclicShift-v1310";
         case 2: return "transmissionCombNum-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean transmissionComb_v1310Present = buffer.decodeBit ("transmissionComb_v1310Present");
      boolean cyclicShift_v1310Present = buffer.decodeBit ("cyclicShift_v1310Present");
      boolean transmissionCombNum_r13Present = buffer.decodeBit ("transmissionCombNum_r13Present");

      // decode transmissionComb_v1310

      if (transmissionComb_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("transmissionComb_v1310", -1);

         transmissionComb_v1310 = new Asn1Integer();
         transmissionComb_v1310.decode (buffer, 2, 3);

         buffer.invokeCharacters(transmissionComb_v1310.toString());
         buffer.getContext().eventDispatcher.endElement("transmissionComb_v1310", -1);
      }
      else {
         transmissionComb_v1310 = null;
      }

      // decode cyclicShift_v1310

      if (cyclicShift_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("cyclicShift_v1310", -1);

         int tval = SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310.decodeEnumValue (buffer);
         cyclicShift_v1310 = SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cyclicShift_v1310", -1);
      }
      else {
         cyclicShift_v1310 = null;
      }

      // decode transmissionCombNum_r13

      if (transmissionCombNum_r13Present) {
         buffer.getContext().eventDispatcher.startElement("transmissionCombNum_r13", -1);

         int tval = SoundingRS_UL_ConfigDedicated_v1310_setup_transmissionCombNum_r13.decodeEnumValue (buffer);
         transmissionCombNum_r13 = SoundingRS_UL_ConfigDedicated_v1310_setup_transmissionCombNum_r13.valueOf (tval);
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
      if (transmissionComb_v1310 != null) transmissionComb_v1310.print (_sb, "transmissionComb_v1310", _level+1);
      if (cyclicShift_v1310 != null) cyclicShift_v1310.print (_sb, "cyclicShift_v1310", _level+1);
      if (transmissionCombNum_r13 != null) transmissionCombNum_r13.print (_sb, "transmissionCombNum_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
