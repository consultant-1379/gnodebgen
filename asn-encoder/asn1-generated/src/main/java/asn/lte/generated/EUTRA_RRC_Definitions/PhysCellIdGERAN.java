/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhysCellIdGERAN extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhysCellIdGERAN";
   }

   public Asn1BitString networkColourCode;
   public Asn1BitString baseStationColourCode;

   public PhysCellIdGERAN () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhysCellIdGERAN (
      Asn1BitString networkColourCode_,
      Asn1BitString baseStationColourCode_
   ) {
      super();
      networkColourCode = networkColourCode_;
      baseStationColourCode = baseStationColourCode_;
   }

   public void init () {
      networkColourCode = null;
      baseStationColourCode = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return networkColourCode;
         case 1: return baseStationColourCode;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "networkColourCode";
         case 1: return "baseStationColourCode";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode networkColourCode

      buffer.getContext().eventDispatcher.startElement("networkColourCode", -1);

      networkColourCode = new Asn1BitString();
      networkColourCode.decode (buffer, 3, 3);

      buffer.invokeCharacters(networkColourCode.toString());
      buffer.getContext().eventDispatcher.endElement("networkColourCode", -1);

      // decode baseStationColourCode

      buffer.getContext().eventDispatcher.startElement("baseStationColourCode", -1);

      baseStationColourCode = new Asn1BitString();
      baseStationColourCode.decode (buffer, 3, 3);

      buffer.invokeCharacters(baseStationColourCode.toString());
      buffer.getContext().eventDispatcher.endElement("baseStationColourCode", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (networkColourCode != null) networkColourCode.print (_sb, "networkColourCode", _level+1);
      if (baseStationColourCode != null) baseStationColourCode.print (_sb, "baseStationColourCode", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
