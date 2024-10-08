/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.SidelinkUEInformationNR_r16;

public class CG_ConfigInfo_v1610_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-ConfigInfo-v1610-IEs";
   }

   public DRX_Info2 drx_InfoMCG2;  // optional
   public CG_ConfigInfo_v1610_IEs_alignedDRX_Indication alignedDRX_Indication = null;  // optional
   public CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 scgFailureInfo_r16;  // optional
   public CG_ConfigInfo_v1610_IEs_scgFailureInfoEUTRA_r16 scgFailureInfoEUTRA_r16;  // optional
   public SidelinkUEInformationNR_r16 sidelinkUEInformationNR_r16;  // optional
   public Asn1OctetString sidelinkUEInformationEUTRA_r16;  // optional
   public CG_ConfigInfo_v1620_IEs nonCriticalExtension;  // optional

   public CG_ConfigInfo_v1610_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_v1610_IEs (
      DRX_Info2 drx_InfoMCG2_,
      CG_ConfigInfo_v1610_IEs_alignedDRX_Indication alignedDRX_Indication_,
      CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 scgFailureInfo_r16_,
      CG_ConfigInfo_v1610_IEs_scgFailureInfoEUTRA_r16 scgFailureInfoEUTRA_r16_,
      SidelinkUEInformationNR_r16 sidelinkUEInformationNR_r16_,
      Asn1OctetString sidelinkUEInformationEUTRA_r16_,
      CG_ConfigInfo_v1620_IEs nonCriticalExtension_
   ) {
      super();
      drx_InfoMCG2 = drx_InfoMCG2_;
      alignedDRX_Indication = alignedDRX_Indication_;
      scgFailureInfo_r16 = scgFailureInfo_r16_;
      scgFailureInfoEUTRA_r16 = scgFailureInfoEUTRA_r16_;
      sidelinkUEInformationNR_r16 = sidelinkUEInformationNR_r16_;
      sidelinkUEInformationEUTRA_r16 = sidelinkUEInformationEUTRA_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_ConfigInfo_v1610_IEs (DRX_Info2 drx_InfoMCG2_,
      CG_ConfigInfo_v1610_IEs_alignedDRX_Indication alignedDRX_Indication_,
      CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 scgFailureInfo_r16_,
      CG_ConfigInfo_v1610_IEs_scgFailureInfoEUTRA_r16 scgFailureInfoEUTRA_r16_,
      SidelinkUEInformationNR_r16 sidelinkUEInformationNR_r16_,
      byte[] sidelinkUEInformationEUTRA_r16_,
      CG_ConfigInfo_v1620_IEs nonCriticalExtension_
   ) {
      super();
      drx_InfoMCG2 = drx_InfoMCG2_;
      alignedDRX_Indication = alignedDRX_Indication_;
      scgFailureInfo_r16 = scgFailureInfo_r16_;
      scgFailureInfoEUTRA_r16 = scgFailureInfoEUTRA_r16_;
      sidelinkUEInformationNR_r16 = sidelinkUEInformationNR_r16_;
      sidelinkUEInformationEUTRA_r16 = new Asn1OctetString (sidelinkUEInformationEUTRA_r16_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      drx_InfoMCG2 = null;
      alignedDRX_Indication = null;
      scgFailureInfo_r16 = null;
      scgFailureInfoEUTRA_r16 = null;
      sidelinkUEInformationNR_r16 = null;
      sidelinkUEInformationEUTRA_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drx_InfoMCG2;
         case 1: return alignedDRX_Indication;
         case 2: return scgFailureInfo_r16;
         case 3: return scgFailureInfoEUTRA_r16;
         case 4: return sidelinkUEInformationNR_r16;
         case 5: return sidelinkUEInformationEUTRA_r16;
         case 6: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drx-InfoMCG2";
         case 1: return "alignedDRX-Indication";
         case 2: return "scgFailureInfo-r16";
         case 3: return "scgFailureInfoEUTRA-r16";
         case 4: return "sidelinkUEInformationNR-r16";
         case 5: return "sidelinkUEInformationEUTRA-r16";
         case 6: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean drx_InfoMCG2Present = buffer.decodeBit ("drx_InfoMCG2Present");
      boolean alignedDRX_IndicationPresent = buffer.decodeBit ("alignedDRX_IndicationPresent");
      boolean scgFailureInfo_r16Present = buffer.decodeBit ("scgFailureInfo_r16Present");
      boolean scgFailureInfoEUTRA_r16Present = buffer.decodeBit ("scgFailureInfoEUTRA_r16Present");
      boolean sidelinkUEInformationNR_r16Present = buffer.decodeBit ("sidelinkUEInformationNR_r16Present");
      boolean sidelinkUEInformationEUTRA_r16Present = buffer.decodeBit ("sidelinkUEInformationEUTRA_r16Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode drx_InfoMCG2

      if (drx_InfoMCG2Present) {
         buffer.getContext().eventDispatcher.startElement("drx_InfoMCG2", -1);

         drx_InfoMCG2 = new DRX_Info2();
         drx_InfoMCG2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drx_InfoMCG2", -1);
      }
      else {
         drx_InfoMCG2 = null;
      }

      // decode alignedDRX_Indication

      if (alignedDRX_IndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("alignedDRX_Indication", -1);

         int tval = CG_ConfigInfo_v1610_IEs_alignedDRX_Indication.decodeEnumValue (buffer);
         alignedDRX_Indication = CG_ConfigInfo_v1610_IEs_alignedDRX_Indication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("alignedDRX_Indication", -1);
      }
      else {
         alignedDRX_Indication = null;
      }

      // decode scgFailureInfo_r16

      if (scgFailureInfo_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfo_r16", -1);

         scgFailureInfo_r16 = new CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16();
         scgFailureInfo_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scgFailureInfo_r16", -1);
      }
      else {
         scgFailureInfo_r16 = null;
      }

      // decode scgFailureInfoEUTRA_r16

      if (scgFailureInfoEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfoEUTRA_r16", -1);

         scgFailureInfoEUTRA_r16 = new CG_ConfigInfo_v1610_IEs_scgFailureInfoEUTRA_r16();
         scgFailureInfoEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scgFailureInfoEUTRA_r16", -1);
      }
      else {
         scgFailureInfoEUTRA_r16 = null;
      }

      // decode sidelinkUEInformationNR_r16

      if (sidelinkUEInformationNR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sidelinkUEInformationNR_r16", -1);

         Asn1OctetString sidelinkUEInformationNR_r16_outer = new Asn1OctetString();
         sidelinkUEInformationNR_r16_outer.decode (buffer);
         if (sidelinkUEInformationNR_r16_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( sidelinkUEInformationNR_r16_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         sidelinkUEInformationNR_r16 = new SidelinkUEInformationNR_r16();
         sidelinkUEInformationNR_r16.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("sidelinkUEInformationNR_r16", -1);
      }
      else {
         sidelinkUEInformationNR_r16 = null;
      }

      // decode sidelinkUEInformationEUTRA_r16

      if (sidelinkUEInformationEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sidelinkUEInformationEUTRA_r16", -1);

         sidelinkUEInformationEUTRA_r16 = new Asn1OctetString();
         sidelinkUEInformationEUTRA_r16.decode (buffer);

         buffer.invokeCharacters(sidelinkUEInformationEUTRA_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sidelinkUEInformationEUTRA_r16", -1);
      }
      else {
         sidelinkUEInformationEUTRA_r16 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CG_ConfigInfo_v1620_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((drx_InfoMCG2 != null), null);
      buffer.encodeBit ((alignedDRX_Indication != null), null);
      buffer.encodeBit ((scgFailureInfo_r16 != null), null);
      buffer.encodeBit ((scgFailureInfoEUTRA_r16 != null), null);
      buffer.encodeBit ((sidelinkUEInformationNR_r16 != null), null);
      buffer.encodeBit ((sidelinkUEInformationEUTRA_r16 != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode drx_InfoMCG2

      if (drx_InfoMCG2 != null) {
         buffer.getContext().eventDispatcher.startElement("drx_InfoMCG2", -1);

         drx_InfoMCG2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drx_InfoMCG2", -1);
      }

      // encode alignedDRX_Indication

      if (alignedDRX_Indication != null) {
         buffer.getContext().eventDispatcher.startElement("alignedDRX_Indication", -1);

         alignedDRX_Indication.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("alignedDRX_Indication", -1);
      }

      // encode scgFailureInfo_r16

      if (scgFailureInfo_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfo_r16", -1);

         scgFailureInfo_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("scgFailureInfo_r16", -1);
      }

      // encode scgFailureInfoEUTRA_r16

      if (scgFailureInfoEUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfoEUTRA_r16", -1);

         scgFailureInfoEUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("scgFailureInfoEUTRA_r16", -1);
      }

      // encode sidelinkUEInformationNR_r16

      if (sidelinkUEInformationNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sidelinkUEInformationNR_r16", -1);

         Asn1OctetString sidelinkUEInformationNR_r16_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            sidelinkUEInformationNR_r16.encode (buffer);
            sidelinkUEInformationNR_r16_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         sidelinkUEInformationNR_r16_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sidelinkUEInformationNR_r16", -1);
      }

      // encode sidelinkUEInformationEUTRA_r16

      if (sidelinkUEInformationEUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sidelinkUEInformationEUTRA_r16", -1);

         sidelinkUEInformationEUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sidelinkUEInformationEUTRA_r16", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (drx_InfoMCG2 != null) drx_InfoMCG2.print (_sb, "drx_InfoMCG2", _level+1);
      if (alignedDRX_Indication != null) alignedDRX_Indication.print (_sb, "alignedDRX_Indication", _level+1);
      if (scgFailureInfo_r16 != null) scgFailureInfo_r16.print (_sb, "scgFailureInfo_r16", _level+1);
      if (scgFailureInfoEUTRA_r16 != null) scgFailureInfoEUTRA_r16.print (_sb, "scgFailureInfoEUTRA_r16", _level+1);
      if (sidelinkUEInformationNR_r16 != null) sidelinkUEInformationNR_r16.print (_sb, "sidelinkUEInformationNR_r16", _level+1);
      if (sidelinkUEInformationEUTRA_r16 != null) sidelinkUEInformationEUTRA_r16.print (_sb, "sidelinkUEInformationEUTRA_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
