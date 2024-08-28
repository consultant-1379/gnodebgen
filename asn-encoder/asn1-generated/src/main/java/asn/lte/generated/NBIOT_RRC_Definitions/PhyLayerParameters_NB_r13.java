/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhyLayerParameters_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhyLayerParameters-NB-r13";
   }

   public PhyLayerParameters_NB_r13_multiTone_r13 multiTone_r13 = null;  // optional
   public PhyLayerParameters_NB_r13_multiCarrier_r13 multiCarrier_r13 = null;  // optional

   public PhyLayerParameters_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhyLayerParameters_NB_r13 (
      PhyLayerParameters_NB_r13_multiTone_r13 multiTone_r13_,
      PhyLayerParameters_NB_r13_multiCarrier_r13 multiCarrier_r13_
   ) {
      super();
      multiTone_r13 = multiTone_r13_;
      multiCarrier_r13 = multiCarrier_r13_;
   }

   public void init () {
      multiTone_r13 = null;
      multiCarrier_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return multiTone_r13;
         case 1: return multiCarrier_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "multiTone-r13";
         case 1: return "multiCarrier-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean multiTone_r13Present = buffer.decodeBit ("multiTone_r13Present");
      boolean multiCarrier_r13Present = buffer.decodeBit ("multiCarrier_r13Present");

      // decode multiTone_r13

      if (multiTone_r13Present) {
         buffer.getContext().eventDispatcher.startElement("multiTone_r13", -1);

         int tval = PhyLayerParameters_NB_r13_multiTone_r13.decodeEnumValue (buffer);
         multiTone_r13 = PhyLayerParameters_NB_r13_multiTone_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("multiTone_r13", -1);
      }
      else {
         multiTone_r13 = null;
      }

      // decode multiCarrier_r13

      if (multiCarrier_r13Present) {
         buffer.getContext().eventDispatcher.startElement("multiCarrier_r13", -1);

         int tval = PhyLayerParameters_NB_r13_multiCarrier_r13.decodeEnumValue (buffer);
         multiCarrier_r13 = PhyLayerParameters_NB_r13_multiCarrier_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("multiCarrier_r13", -1);
      }
      else {
         multiCarrier_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (multiTone_r13 != null) multiTone_r13.print (_sb, "multiTone_r13", _level+1);
      if (multiCarrier_r13 != null) multiCarrier_r13.print (_sb, "multiCarrier_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
