/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OLPC_SRS_Pos_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "OLPC-SRS-Pos-r16";
   }

   public OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Serving_r16 olpc_SRS_PosBasedOnPRS_Serving_r16 = null;  // optional
   public OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnSSB_Neigh_r16 olpc_SRS_PosBasedOnSSB_Neigh_r16 = null;  // optional
   public OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Neigh_r16 olpc_SRS_PosBasedOnPRS_Neigh_r16 = null;  // optional
   public OLPC_SRS_Pos_r16_maxNumberPathLossEstimatePerServing_r16 maxNumberPathLossEstimatePerServing_r16 = null;  // optional

   public OLPC_SRS_Pos_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public OLPC_SRS_Pos_r16 (
      OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Serving_r16 olpc_SRS_PosBasedOnPRS_Serving_r16_,
      OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnSSB_Neigh_r16 olpc_SRS_PosBasedOnSSB_Neigh_r16_,
      OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Neigh_r16 olpc_SRS_PosBasedOnPRS_Neigh_r16_,
      OLPC_SRS_Pos_r16_maxNumberPathLossEstimatePerServing_r16 maxNumberPathLossEstimatePerServing_r16_
   ) {
      super();
      olpc_SRS_PosBasedOnPRS_Serving_r16 = olpc_SRS_PosBasedOnPRS_Serving_r16_;
      olpc_SRS_PosBasedOnSSB_Neigh_r16 = olpc_SRS_PosBasedOnSSB_Neigh_r16_;
      olpc_SRS_PosBasedOnPRS_Neigh_r16 = olpc_SRS_PosBasedOnPRS_Neigh_r16_;
      maxNumberPathLossEstimatePerServing_r16 = maxNumberPathLossEstimatePerServing_r16_;
   }

   public void init () {
      olpc_SRS_PosBasedOnPRS_Serving_r16 = null;
      olpc_SRS_PosBasedOnSSB_Neigh_r16 = null;
      olpc_SRS_PosBasedOnPRS_Neigh_r16 = null;
      maxNumberPathLossEstimatePerServing_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return olpc_SRS_PosBasedOnPRS_Serving_r16;
         case 1: return olpc_SRS_PosBasedOnSSB_Neigh_r16;
         case 2: return olpc_SRS_PosBasedOnPRS_Neigh_r16;
         case 3: return maxNumberPathLossEstimatePerServing_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "olpc-SRS-PosBasedOnPRS-Serving-r16";
         case 1: return "olpc-SRS-PosBasedOnSSB-Neigh-r16";
         case 2: return "olpc-SRS-PosBasedOnPRS-Neigh-r16";
         case 3: return "maxNumberPathLossEstimatePerServing-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean olpc_SRS_PosBasedOnPRS_Serving_r16Present = buffer.decodeBit ("olpc_SRS_PosBasedOnPRS_Serving_r16Present");
      boolean olpc_SRS_PosBasedOnSSB_Neigh_r16Present = buffer.decodeBit ("olpc_SRS_PosBasedOnSSB_Neigh_r16Present");
      boolean olpc_SRS_PosBasedOnPRS_Neigh_r16Present = buffer.decodeBit ("olpc_SRS_PosBasedOnPRS_Neigh_r16Present");
      boolean maxNumberPathLossEstimatePerServing_r16Present = buffer.decodeBit ("maxNumberPathLossEstimatePerServing_r16Present");

      // decode olpc_SRS_PosBasedOnPRS_Serving_r16

      if (olpc_SRS_PosBasedOnPRS_Serving_r16Present) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnPRS_Serving_r16", -1);

         int tval = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Serving_r16.decodeEnumValue (buffer);
         olpc_SRS_PosBasedOnPRS_Serving_r16 = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Serving_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnPRS_Serving_r16", -1);
      }
      else {
         olpc_SRS_PosBasedOnPRS_Serving_r16 = null;
      }

      // decode olpc_SRS_PosBasedOnSSB_Neigh_r16

      if (olpc_SRS_PosBasedOnSSB_Neigh_r16Present) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnSSB_Neigh_r16", -1);

         int tval = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnSSB_Neigh_r16.decodeEnumValue (buffer);
         olpc_SRS_PosBasedOnSSB_Neigh_r16 = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnSSB_Neigh_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnSSB_Neigh_r16", -1);
      }
      else {
         olpc_SRS_PosBasedOnSSB_Neigh_r16 = null;
      }

      // decode olpc_SRS_PosBasedOnPRS_Neigh_r16

      if (olpc_SRS_PosBasedOnPRS_Neigh_r16Present) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnPRS_Neigh_r16", -1);

         int tval = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Neigh_r16.decodeEnumValue (buffer);
         olpc_SRS_PosBasedOnPRS_Neigh_r16 = OLPC_SRS_Pos_r16_olpc_SRS_PosBasedOnPRS_Neigh_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnPRS_Neigh_r16", -1);
      }
      else {
         olpc_SRS_PosBasedOnPRS_Neigh_r16 = null;
      }

      // decode maxNumberPathLossEstimatePerServing_r16

      if (maxNumberPathLossEstimatePerServing_r16Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPathLossEstimatePerServing_r16", -1);

         int tval = OLPC_SRS_Pos_r16_maxNumberPathLossEstimatePerServing_r16.decodeEnumValue (buffer);
         maxNumberPathLossEstimatePerServing_r16 = OLPC_SRS_Pos_r16_maxNumberPathLossEstimatePerServing_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumberPathLossEstimatePerServing_r16", -1);
      }
      else {
         maxNumberPathLossEstimatePerServing_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((olpc_SRS_PosBasedOnPRS_Serving_r16 != null), null);
      buffer.encodeBit ((olpc_SRS_PosBasedOnSSB_Neigh_r16 != null), null);
      buffer.encodeBit ((olpc_SRS_PosBasedOnPRS_Neigh_r16 != null), null);
      buffer.encodeBit ((maxNumberPathLossEstimatePerServing_r16 != null), null);

      // encode olpc_SRS_PosBasedOnPRS_Serving_r16

      if (olpc_SRS_PosBasedOnPRS_Serving_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnPRS_Serving_r16", -1);

         olpc_SRS_PosBasedOnPRS_Serving_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnPRS_Serving_r16", -1);
      }

      // encode olpc_SRS_PosBasedOnSSB_Neigh_r16

      if (olpc_SRS_PosBasedOnSSB_Neigh_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnSSB_Neigh_r16", -1);

         olpc_SRS_PosBasedOnSSB_Neigh_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnSSB_Neigh_r16", -1);
      }

      // encode olpc_SRS_PosBasedOnPRS_Neigh_r16

      if (olpc_SRS_PosBasedOnPRS_Neigh_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("olpc_SRS_PosBasedOnPRS_Neigh_r16", -1);

         olpc_SRS_PosBasedOnPRS_Neigh_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("olpc_SRS_PosBasedOnPRS_Neigh_r16", -1);
      }

      // encode maxNumberPathLossEstimatePerServing_r16

      if (maxNumberPathLossEstimatePerServing_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPathLossEstimatePerServing_r16", -1);

         maxNumberPathLossEstimatePerServing_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberPathLossEstimatePerServing_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (olpc_SRS_PosBasedOnPRS_Serving_r16 != null) olpc_SRS_PosBasedOnPRS_Serving_r16.print (_sb, "olpc_SRS_PosBasedOnPRS_Serving_r16", _level+1);
      if (olpc_SRS_PosBasedOnSSB_Neigh_r16 != null) olpc_SRS_PosBasedOnSSB_Neigh_r16.print (_sb, "olpc_SRS_PosBasedOnSSB_Neigh_r16", _level+1);
      if (olpc_SRS_PosBasedOnPRS_Neigh_r16 != null) olpc_SRS_PosBasedOnPRS_Neigh_r16.print (_sb, "olpc_SRS_PosBasedOnPRS_Neigh_r16", _level+1);
      if (maxNumberPathLossEstimatePerServing_r16 != null) maxNumberPathLossEstimatePerServing_r16.print (_sb, "maxNumberPathLossEstimatePerServing_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
