/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.CellIdentity;
import asn.lte.generated.EUTRA_RRC_Definitions.ShortMAC_I;

public class AdditionalReestabInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AdditionalReestabInfo";
   }

   public CellIdentity cellIdentity;
   public Key_eNodeB_Star key_eNodeB_Star;
   public ShortMAC_I shortMAC_I;

   public AdditionalReestabInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AdditionalReestabInfo (
      CellIdentity cellIdentity_,
      Key_eNodeB_Star key_eNodeB_Star_,
      ShortMAC_I shortMAC_I_
   ) {
      super();
      cellIdentity = cellIdentity_;
      key_eNodeB_Star = key_eNodeB_Star_;
      shortMAC_I = shortMAC_I_;
   }

   public void init () {
      cellIdentity = null;
      key_eNodeB_Star = null;
      shortMAC_I = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellIdentity;
         case 1: return key_eNodeB_Star;
         case 2: return shortMAC_I;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellIdentity";
         case 1: return "key-eNodeB-Star";
         case 2: return "shortMAC-I";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cellIdentity

      buffer.getContext().eventDispatcher.startElement("cellIdentity", -1);

      cellIdentity = new CellIdentity();
      cellIdentity.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity", -1);

      // decode key_eNodeB_Star

      buffer.getContext().eventDispatcher.startElement("key_eNodeB_Star", -1);

      key_eNodeB_Star = new Key_eNodeB_Star();
      key_eNodeB_Star.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("key_eNodeB_Star", -1);

      // decode shortMAC_I

      buffer.getContext().eventDispatcher.startElement("shortMAC_I", -1);

      shortMAC_I = new ShortMAC_I();
      shortMAC_I.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("shortMAC_I", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellIdentity != null) cellIdentity.print (_sb, "cellIdentity", _level+1);
      if (key_eNodeB_Star != null) key_eNodeB_Star.print (_sb, "key_eNodeB_Star", _level+1);
      if (shortMAC_I != null) shortMAC_I.print (_sb, "shortMAC_I", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
