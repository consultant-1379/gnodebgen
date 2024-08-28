/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.AntennaInfoDedicated_v10i0;

public class AS_Config_v10j0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AS-Config-v10j0";
   }

   public AntennaInfoDedicated_v10i0 antennaInfoDedicatedPCell_v10i0;  // optional

   public AS_Config_v10j0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AS_Config_v10j0 (
      AntennaInfoDedicated_v10i0 antennaInfoDedicatedPCell_v10i0_
   ) {
      super();
      antennaInfoDedicatedPCell_v10i0 = antennaInfoDedicatedPCell_v10i0_;
   }

   public void init () {
      antennaInfoDedicatedPCell_v10i0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return antennaInfoDedicatedPCell_v10i0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "antennaInfoDedicatedPCell-v10i0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean antennaInfoDedicatedPCell_v10i0Present = buffer.decodeBit ("antennaInfoDedicatedPCell_v10i0Present");

      // decode antennaInfoDedicatedPCell_v10i0

      if (antennaInfoDedicatedPCell_v10i0Present) {
         buffer.getContext().eventDispatcher.startElement("antennaInfoDedicatedPCell_v10i0", -1);

         antennaInfoDedicatedPCell_v10i0 = new AntennaInfoDedicated_v10i0();
         antennaInfoDedicatedPCell_v10i0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("antennaInfoDedicatedPCell_v10i0", -1);
      }
      else {
         antennaInfoDedicatedPCell_v10i0 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (antennaInfoDedicatedPCell_v10i0 != null) antennaInfoDedicatedPCell_v10i0.print (_sb, "antennaInfoDedicatedPCell_v10i0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
