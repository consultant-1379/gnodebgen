/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RadioResourceConfigDedicatedPSCell_v13c0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RadioResourceConfigDedicatedPSCell-v13c0";
   }

   public PhysicalConfigDedicated_v13c0 physicalConfigDedicatedPSCell_v13c0;

   public RadioResourceConfigDedicatedPSCell_v13c0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RadioResourceConfigDedicatedPSCell_v13c0 (
      PhysicalConfigDedicated_v13c0 physicalConfigDedicatedPSCell_v13c0_
   ) {
      super();
      physicalConfigDedicatedPSCell_v13c0 = physicalConfigDedicatedPSCell_v13c0_;
   }

   public void init () {
      physicalConfigDedicatedPSCell_v13c0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physicalConfigDedicatedPSCell_v13c0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physicalConfigDedicatedPSCell-v13c0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode physicalConfigDedicatedPSCell_v13c0

      buffer.getContext().eventDispatcher.startElement("physicalConfigDedicatedPSCell_v13c0", -1);

      physicalConfigDedicatedPSCell_v13c0 = new PhysicalConfigDedicated_v13c0();
      physicalConfigDedicatedPSCell_v13c0.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physicalConfigDedicatedPSCell_v13c0", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physicalConfigDedicatedPSCell_v13c0 != null) physicalConfigDedicatedPSCell_v13c0.print (_sb, "physicalConfigDedicatedPSCell_v13c0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
