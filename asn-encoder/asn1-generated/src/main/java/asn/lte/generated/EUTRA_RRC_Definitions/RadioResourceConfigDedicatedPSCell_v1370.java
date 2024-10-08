/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RadioResourceConfigDedicatedPSCell_v1370 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RadioResourceConfigDedicatedPSCell-v1370";
   }

   public PhysicalConfigDedicated_v1370 physicalConfigDedicatedPSCell_v1370;  // optional

   public RadioResourceConfigDedicatedPSCell_v1370 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RadioResourceConfigDedicatedPSCell_v1370 (
      PhysicalConfigDedicated_v1370 physicalConfigDedicatedPSCell_v1370_
   ) {
      super();
      physicalConfigDedicatedPSCell_v1370 = physicalConfigDedicatedPSCell_v1370_;
   }

   public void init () {
      physicalConfigDedicatedPSCell_v1370 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physicalConfigDedicatedPSCell_v1370;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physicalConfigDedicatedPSCell-v1370";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean physicalConfigDedicatedPSCell_v1370Present = buffer.decodeBit ("physicalConfigDedicatedPSCell_v1370Present");

      // decode physicalConfigDedicatedPSCell_v1370

      if (physicalConfigDedicatedPSCell_v1370Present) {
         buffer.getContext().eventDispatcher.startElement("physicalConfigDedicatedPSCell_v1370", -1);

         physicalConfigDedicatedPSCell_v1370 = new PhysicalConfigDedicated_v1370();
         physicalConfigDedicatedPSCell_v1370.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("physicalConfigDedicatedPSCell_v1370", -1);
      }
      else {
         physicalConfigDedicatedPSCell_v1370 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physicalConfigDedicatedPSCell_v1370 != null) physicalConfigDedicatedPSCell_v1370.print (_sb, "physicalConfigDedicatedPSCell_v1370", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
