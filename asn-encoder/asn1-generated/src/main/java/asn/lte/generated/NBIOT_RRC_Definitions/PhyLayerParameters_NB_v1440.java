/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhyLayerParameters_NB_v1440 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhyLayerParameters-NB-v1440";
   }

   public PhyLayerParameters_NB_v1440_interferenceRandomisation_r14 interferenceRandomisation_r14 = null;  // optional

   public PhyLayerParameters_NB_v1440 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhyLayerParameters_NB_v1440 (
      PhyLayerParameters_NB_v1440_interferenceRandomisation_r14 interferenceRandomisation_r14_
   ) {
      super();
      interferenceRandomisation_r14 = interferenceRandomisation_r14_;
   }

   public void init () {
      interferenceRandomisation_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return interferenceRandomisation_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "interferenceRandomisation-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean interferenceRandomisation_r14Present = buffer.decodeBit ("interferenceRandomisation_r14Present");

      // decode interferenceRandomisation_r14

      if (interferenceRandomisation_r14Present) {
         buffer.getContext().eventDispatcher.startElement("interferenceRandomisation_r14", -1);

         int tval = PhyLayerParameters_NB_v1440_interferenceRandomisation_r14.decodeEnumValue (buffer);
         interferenceRandomisation_r14 = PhyLayerParameters_NB_v1440_interferenceRandomisation_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("interferenceRandomisation_r14", -1);
      }
      else {
         interferenceRandomisation_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (interferenceRandomisation_r14 != null) interferenceRandomisation_r14.print (_sb, "interferenceRandomisation_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
