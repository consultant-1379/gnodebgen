/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class AffectedCarrierFreqCombInfoMRDC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AffectedCarrierFreqCombInfoMRDC";
   }

   public VictimSystemType victimSystemType;
   public AffectedCarrierFreqCombInfoMRDC_interferenceDirectionMRDC interferenceDirectionMRDC = null;
   public AffectedCarrierFreqCombInfoMRDC_affectedCarrierFreqCombMRDC affectedCarrierFreqCombMRDC;  // optional

   public AffectedCarrierFreqCombInfoMRDC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AffectedCarrierFreqCombInfoMRDC (
      VictimSystemType victimSystemType_,
      AffectedCarrierFreqCombInfoMRDC_interferenceDirectionMRDC interferenceDirectionMRDC_,
      AffectedCarrierFreqCombInfoMRDC_affectedCarrierFreqCombMRDC affectedCarrierFreqCombMRDC_
   ) {
      super();
      victimSystemType = victimSystemType_;
      interferenceDirectionMRDC = interferenceDirectionMRDC_;
      affectedCarrierFreqCombMRDC = affectedCarrierFreqCombMRDC_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public AffectedCarrierFreqCombInfoMRDC (
      VictimSystemType victimSystemType_,
      AffectedCarrierFreqCombInfoMRDC_interferenceDirectionMRDC interferenceDirectionMRDC_
   ) {
      super();
      victimSystemType = victimSystemType_;
      interferenceDirectionMRDC = interferenceDirectionMRDC_;
   }

   public void init () {
      victimSystemType = null;
      interferenceDirectionMRDC = null;
      affectedCarrierFreqCombMRDC = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return victimSystemType;
         case 1: return interferenceDirectionMRDC;
         case 2: return affectedCarrierFreqCombMRDC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "victimSystemType";
         case 1: return "interferenceDirectionMRDC";
         case 2: return "affectedCarrierFreqCombMRDC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean affectedCarrierFreqCombMRDCPresent = buffer.decodeBit ("affectedCarrierFreqCombMRDCPresent");

      // decode victimSystemType

      buffer.getContext().eventDispatcher.startElement("victimSystemType", -1);

      victimSystemType = new VictimSystemType();
      victimSystemType.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("victimSystemType", -1);

      // decode interferenceDirectionMRDC

      buffer.getContext().eventDispatcher.startElement("interferenceDirectionMRDC", -1);

      {
         int tval = AffectedCarrierFreqCombInfoMRDC_interferenceDirectionMRDC.decodeEnumValue (buffer);
         interferenceDirectionMRDC = AffectedCarrierFreqCombInfoMRDC_interferenceDirectionMRDC.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("interferenceDirectionMRDC", -1);

      // decode affectedCarrierFreqCombMRDC

      if (affectedCarrierFreqCombMRDCPresent) {
         buffer.getContext().eventDispatcher.startElement("affectedCarrierFreqCombMRDC", -1);

         affectedCarrierFreqCombMRDC = new AffectedCarrierFreqCombInfoMRDC_affectedCarrierFreqCombMRDC();
         affectedCarrierFreqCombMRDC.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("affectedCarrierFreqCombMRDC", -1);
      }
      else {
         affectedCarrierFreqCombMRDC = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (victimSystemType != null) victimSystemType.print (_sb, "victimSystemType", _level+1);
      if (interferenceDirectionMRDC != null) interferenceDirectionMRDC.print (_sb, "interferenceDirectionMRDC", _level+1);
      if (affectedCarrierFreqCombMRDC != null) affectedCarrierFreqCombMRDC.print (_sb, "affectedCarrierFreqCombMRDC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
