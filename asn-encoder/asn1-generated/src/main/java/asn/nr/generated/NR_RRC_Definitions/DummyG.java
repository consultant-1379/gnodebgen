/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyG extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DummyG";
   }

   public DummyG_maxNumberSSB_CSI_RS_ResourceOneTx maxNumberSSB_CSI_RS_ResourceOneTx = null;
   public DummyG_maxNumberSSB_CSI_RS_ResourceTwoTx maxNumberSSB_CSI_RS_ResourceTwoTx = null;
   public DummyG_supportedCSI_RS_Density supportedCSI_RS_Density = null;

   public DummyG () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DummyG (
      DummyG_maxNumberSSB_CSI_RS_ResourceOneTx maxNumberSSB_CSI_RS_ResourceOneTx_,
      DummyG_maxNumberSSB_CSI_RS_ResourceTwoTx maxNumberSSB_CSI_RS_ResourceTwoTx_,
      DummyG_supportedCSI_RS_Density supportedCSI_RS_Density_
   ) {
      super();
      maxNumberSSB_CSI_RS_ResourceOneTx = maxNumberSSB_CSI_RS_ResourceOneTx_;
      maxNumberSSB_CSI_RS_ResourceTwoTx = maxNumberSSB_CSI_RS_ResourceTwoTx_;
      supportedCSI_RS_Density = supportedCSI_RS_Density_;
   }

   public void init () {
      maxNumberSSB_CSI_RS_ResourceOneTx = null;
      maxNumberSSB_CSI_RS_ResourceTwoTx = null;
      supportedCSI_RS_Density = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberSSB_CSI_RS_ResourceOneTx;
         case 1: return maxNumberSSB_CSI_RS_ResourceTwoTx;
         case 2: return supportedCSI_RS_Density;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberSSB-CSI-RS-ResourceOneTx";
         case 1: return "maxNumberSSB-CSI-RS-ResourceTwoTx";
         case 2: return "supportedCSI-RS-Density";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberSSB_CSI_RS_ResourceOneTx

      buffer.getContext().eventDispatcher.startElement("maxNumberSSB_CSI_RS_ResourceOneTx", -1);

      {
         int tval = DummyG_maxNumberSSB_CSI_RS_ResourceOneTx.decodeEnumValue (buffer);
         maxNumberSSB_CSI_RS_ResourceOneTx = DummyG_maxNumberSSB_CSI_RS_ResourceOneTx.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberSSB_CSI_RS_ResourceOneTx", -1);

      // decode maxNumberSSB_CSI_RS_ResourceTwoTx

      buffer.getContext().eventDispatcher.startElement("maxNumberSSB_CSI_RS_ResourceTwoTx", -1);

      {
         int tval = DummyG_maxNumberSSB_CSI_RS_ResourceTwoTx.decodeEnumValue (buffer);
         maxNumberSSB_CSI_RS_ResourceTwoTx = DummyG_maxNumberSSB_CSI_RS_ResourceTwoTx.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberSSB_CSI_RS_ResourceTwoTx", -1);

      // decode supportedCSI_RS_Density

      buffer.getContext().eventDispatcher.startElement("supportedCSI_RS_Density", -1);

      {
         int tval = DummyG_supportedCSI_RS_Density.decodeEnumValue (buffer);
         supportedCSI_RS_Density = DummyG_supportedCSI_RS_Density.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportedCSI_RS_Density", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberSSB_CSI_RS_ResourceOneTx

      if (maxNumberSSB_CSI_RS_ResourceOneTx != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSSB_CSI_RS_ResourceOneTx", -1);

         maxNumberSSB_CSI_RS_ResourceOneTx.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberSSB_CSI_RS_ResourceOneTx", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSSB_CSI_RS_ResourceOneTx");

      // encode maxNumberSSB_CSI_RS_ResourceTwoTx

      if (maxNumberSSB_CSI_RS_ResourceTwoTx != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSSB_CSI_RS_ResourceTwoTx", -1);

         maxNumberSSB_CSI_RS_ResourceTwoTx.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberSSB_CSI_RS_ResourceTwoTx", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSSB_CSI_RS_ResourceTwoTx");

      // encode supportedCSI_RS_Density

      if (supportedCSI_RS_Density != null) {
         buffer.getContext().eventDispatcher.startElement("supportedCSI_RS_Density", -1);

         supportedCSI_RS_Density.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedCSI_RS_Density", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedCSI_RS_Density");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberSSB_CSI_RS_ResourceOneTx != null) maxNumberSSB_CSI_RS_ResourceOneTx.print (_sb, "maxNumberSSB_CSI_RS_ResourceOneTx", _level+1);
      if (maxNumberSSB_CSI_RS_ResourceTwoTx != null) maxNumberSSB_CSI_RS_ResourceTwoTx.print (_sb, "maxNumberSSB_CSI_RS_ResourceTwoTx", _level+1);
      if (supportedCSI_RS_Density != null) supportedCSI_RS_Density.print (_sb, "supportedCSI_RS_Density", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
