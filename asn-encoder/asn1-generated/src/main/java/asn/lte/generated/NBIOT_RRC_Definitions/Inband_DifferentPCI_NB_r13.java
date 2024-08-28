/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Inband_DifferentPCI_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Inband-DifferentPCI-NB-r13";
   }

   public Inband_DifferentPCI_NB_r13_eutra_NumCRS_Ports_r13 eutra_NumCRS_Ports_r13 = null;
   public ChannelRasterOffset_NB_r13 rasterOffset_r13 = null;
   public Asn1BitString spare;

   public Inband_DifferentPCI_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Inband_DifferentPCI_NB_r13 (
      Inband_DifferentPCI_NB_r13_eutra_NumCRS_Ports_r13 eutra_NumCRS_Ports_r13_,
      ChannelRasterOffset_NB_r13 rasterOffset_r13_,
      Asn1BitString spare_
   ) {
      super();
      eutra_NumCRS_Ports_r13 = eutra_NumCRS_Ports_r13_;
      rasterOffset_r13 = rasterOffset_r13_;
      spare = spare_;
   }

   public void init () {
      eutra_NumCRS_Ports_r13 = null;
      rasterOffset_r13 = null;
      spare = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eutra_NumCRS_Ports_r13;
         case 1: return rasterOffset_r13;
         case 2: return spare;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eutra-NumCRS-Ports-r13";
         case 1: return "rasterOffset-r13";
         case 2: return "spare";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode eutra_NumCRS_Ports_r13

      buffer.getContext().eventDispatcher.startElement("eutra_NumCRS_Ports_r13", -1);

      {
         int tval = Inband_DifferentPCI_NB_r13_eutra_NumCRS_Ports_r13.decodeEnumValue (buffer);
         eutra_NumCRS_Ports_r13 = Inband_DifferentPCI_NB_r13_eutra_NumCRS_Ports_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("eutra_NumCRS_Ports_r13", -1);

      // decode rasterOffset_r13

      buffer.getContext().eventDispatcher.startElement("rasterOffset_r13", -1);

      {
         int tval = ChannelRasterOffset_NB_r13.decodeEnumValue (buffer);
         rasterOffset_r13 = ChannelRasterOffset_NB_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("rasterOffset_r13", -1);

      // decode spare

      buffer.getContext().eventDispatcher.startElement("spare", -1);

      spare = new Asn1BitString();
      spare.decode (buffer, 2, 2);

      buffer.invokeCharacters(spare.toString());
      buffer.getContext().eventDispatcher.endElement("spare", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eutra_NumCRS_Ports_r13 != null) eutra_NumCRS_Ports_r13.print (_sb, "eutra_NumCRS_Ports_r13", _level+1);
      if (rasterOffset_r13 != null) rasterOffset_r13.print (_sb, "rasterOffset_r13", _level+1);
      if (spare != null) spare.print (_sb, "spare", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
