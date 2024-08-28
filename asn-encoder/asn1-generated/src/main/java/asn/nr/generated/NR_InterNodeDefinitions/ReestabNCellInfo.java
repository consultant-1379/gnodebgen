/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.CellIdentity;
import asn.nr.generated.NR_RRC_Definitions.ShortMAC_I;

public class ReestabNCellInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReestabNCellInfo";
   }

   public CellIdentity cellIdentity;
   public Asn1BitString key_gNodeB_Star;
   public ShortMAC_I shortMAC_I;

   public ReestabNCellInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReestabNCellInfo (
      CellIdentity cellIdentity_,
      Asn1BitString key_gNodeB_Star_,
      ShortMAC_I shortMAC_I_
   ) {
      super();
      cellIdentity = cellIdentity_;
      key_gNodeB_Star = key_gNodeB_Star_;
      shortMAC_I = shortMAC_I_;
   }

   public void init () {
      cellIdentity = null;
      key_gNodeB_Star = null;
      shortMAC_I = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellIdentity;
         case 1: return key_gNodeB_Star;
         case 2: return shortMAC_I;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellIdentity";
         case 1: return "key-gNodeB-Star";
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

      // decode key_gNodeB_Star

      buffer.getContext().eventDispatcher.startElement("key_gNodeB_Star", -1);

      key_gNodeB_Star = new Asn1BitString();
      key_gNodeB_Star.decode (buffer, 256, 256);

      buffer.invokeCharacters(key_gNodeB_Star.toString());
      buffer.getContext().eventDispatcher.endElement("key_gNodeB_Star", -1);

      // decode shortMAC_I

      buffer.getContext().eventDispatcher.startElement("shortMAC_I", -1);

      shortMAC_I = new ShortMAC_I();
      shortMAC_I.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("shortMAC_I", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode cellIdentity

      if (cellIdentity != null) {
         buffer.getContext().eventDispatcher.startElement("cellIdentity", -1);

         cellIdentity.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellIdentity", -1);
      }
      else throw new Asn1MissingRequiredException ("cellIdentity");

      // encode key_gNodeB_Star

      if (key_gNodeB_Star != null) {
         buffer.getContext().eventDispatcher.startElement("key_gNodeB_Star", -1);

         key_gNodeB_Star.encode (buffer, 256, 256);

         buffer.getContext().eventDispatcher.endElement("key_gNodeB_Star", -1);
      }
      else throw new Asn1MissingRequiredException ("key_gNodeB_Star");

      // encode shortMAC_I

      if (shortMAC_I != null) {
         buffer.getContext().eventDispatcher.startElement("shortMAC_I", -1);

         shortMAC_I.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("shortMAC_I", -1);
      }
      else throw new Asn1MissingRequiredException ("shortMAC_I");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellIdentity != null) cellIdentity.print (_sb, "cellIdentity", _level+1);
      if (key_gNodeB_Star != null) key_gNodeB_Star.print (_sb, "key_gNodeB_Star", _level+1);
      if (shortMAC_I != null) shortMAC_I.print (_sb, "shortMAC_I", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
