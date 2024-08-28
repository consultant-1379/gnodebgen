/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_MTC2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SSB-MTC2";
   }

   public SSB_MTC2_pci_List pci_List;  // optional
   public SSB_MTC2_periodicity periodicity = null;

   public SSB_MTC2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SSB_MTC2 (
      SSB_MTC2_pci_List pci_List_,
      SSB_MTC2_periodicity periodicity_
   ) {
      super();
      pci_List = pci_List_;
      periodicity = periodicity_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SSB_MTC2 (
      SSB_MTC2_periodicity periodicity_
   ) {
      super();
      periodicity = periodicity_;
   }

   public void init () {
      pci_List = null;
      periodicity = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pci_List;
         case 1: return periodicity;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pci-List";
         case 1: return "periodicity";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pci_ListPresent = buffer.decodeBit ("pci_ListPresent");

      // decode pci_List

      if (pci_ListPresent) {
         buffer.getContext().eventDispatcher.startElement("pci_List", -1);

         pci_List = new SSB_MTC2_pci_List();
         pci_List.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pci_List", -1);
      }
      else {
         pci_List = null;
      }

      // decode periodicity

      buffer.getContext().eventDispatcher.startElement("periodicity", -1);

      {
         int tval = SSB_MTC2_periodicity.decodeEnumValue (buffer);
         periodicity = SSB_MTC2_periodicity.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("periodicity", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pci_List != null) pci_List.print (_sb, "pci_List", _level+1);
      if (periodicity != null) periodicity.print (_sb, "periodicity", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
