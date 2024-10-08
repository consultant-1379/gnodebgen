/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_MIMO_ParametersDL_v10i0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CA-MIMO-ParametersDL-v10i0";
   }

   public CA_MIMO_ParametersDL_v10i0_fourLayerTM3_TM4_r10 fourLayerTM3_TM4_r10 = null;  // optional

   public CA_MIMO_ParametersDL_v10i0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_MIMO_ParametersDL_v10i0 (
      CA_MIMO_ParametersDL_v10i0_fourLayerTM3_TM4_r10 fourLayerTM3_TM4_r10_
   ) {
      super();
      fourLayerTM3_TM4_r10 = fourLayerTM3_TM4_r10_;
   }

   public void init () {
      fourLayerTM3_TM4_r10 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return fourLayerTM3_TM4_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "fourLayerTM3-TM4-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean fourLayerTM3_TM4_r10Present = buffer.decodeBit ("fourLayerTM3_TM4_r10Present");

      // decode fourLayerTM3_TM4_r10

      if (fourLayerTM3_TM4_r10Present) {
         buffer.getContext().eventDispatcher.startElement("fourLayerTM3_TM4_r10", -1);

         int tval = CA_MIMO_ParametersDL_v10i0_fourLayerTM3_TM4_r10.decodeEnumValue (buffer);
         fourLayerTM3_TM4_r10 = CA_MIMO_ParametersDL_v10i0_fourLayerTM3_TM4_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fourLayerTM3_TM4_r10", -1);
      }
      else {
         fourLayerTM3_TM4_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (fourLayerTM3_TM4_r10 != null) fourLayerTM3_TM4_r10.print (_sb, "fourLayerTM3_TM4_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
