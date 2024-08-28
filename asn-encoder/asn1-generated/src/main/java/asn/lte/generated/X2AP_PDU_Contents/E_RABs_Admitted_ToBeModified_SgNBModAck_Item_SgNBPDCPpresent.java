/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.GTPtunnelEndpoint;
import asn.lte.generated.X2AP_IEs.E_RAB_Level_QoS_Parameters;
import asn.lte.generated.X2AP_IEs.ULConfiguration;

public class E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "E-RABs-Admitted-ToBeModified-SgNBModAck-Item-SgNBPDCPpresent";
   }

   public GTPtunnelEndpoint s1_DL_GTPtunnelEndpoint;  // optional
   public GTPtunnelEndpoint sgNB_UL_GTP_TEIDatPDCP;  // optional
   public E_RAB_Level_QoS_Parameters mCG_E_RAB_Level_QoS_Parameters;  // optional
   public ULConfiguration uL_Configuration;  // optional
   public E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent (
      GTPtunnelEndpoint s1_DL_GTPtunnelEndpoint_,
      GTPtunnelEndpoint sgNB_UL_GTP_TEIDatPDCP_,
      E_RAB_Level_QoS_Parameters mCG_E_RAB_Level_QoS_Parameters_,
      ULConfiguration uL_Configuration_,
      E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent_iE_Extensions iE_Extensions_
   ) {
      super();
      s1_DL_GTPtunnelEndpoint = s1_DL_GTPtunnelEndpoint_;
      sgNB_UL_GTP_TEIDatPDCP = sgNB_UL_GTP_TEIDatPDCP_;
      mCG_E_RAB_Level_QoS_Parameters = mCG_E_RAB_Level_QoS_Parameters_;
      uL_Configuration = uL_Configuration_;
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      s1_DL_GTPtunnelEndpoint = null;
      sgNB_UL_GTP_TEIDatPDCP = null;
      mCG_E_RAB_Level_QoS_Parameters = null;
      uL_Configuration = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return s1_DL_GTPtunnelEndpoint;
         case 1: return sgNB_UL_GTP_TEIDatPDCP;
         case 2: return mCG_E_RAB_Level_QoS_Parameters;
         case 3: return uL_Configuration;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "s1-DL-GTPtunnelEndpoint";
         case 1: return "sgNB-UL-GTP-TEIDatPDCP";
         case 2: return "mCG-E-RAB-Level-QoS-Parameters";
         case 3: return "uL-Configuration";
         case 4: return "iE-Extensions";
         case 5: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean s1_DL_GTPtunnelEndpointPresent = buffer.decodeBit ("s1_DL_GTPtunnelEndpointPresent");
      boolean sgNB_UL_GTP_TEIDatPDCPPresent = buffer.decodeBit ("sgNB_UL_GTP_TEIDatPDCPPresent");
      boolean mCG_E_RAB_Level_QoS_ParametersPresent = buffer.decodeBit ("mCG_E_RAB_Level_QoS_ParametersPresent");
      boolean uL_ConfigurationPresent = buffer.decodeBit ("uL_ConfigurationPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode s1_DL_GTPtunnelEndpoint

      if (s1_DL_GTPtunnelEndpointPresent) {
         buffer.getContext().eventDispatcher.startElement("s1_DL_GTPtunnelEndpoint", -1);

         s1_DL_GTPtunnelEndpoint = new GTPtunnelEndpoint();
         s1_DL_GTPtunnelEndpoint.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("s1_DL_GTPtunnelEndpoint", -1);
      }
      else {
         s1_DL_GTPtunnelEndpoint = null;
      }

      // decode sgNB_UL_GTP_TEIDatPDCP

      if (sgNB_UL_GTP_TEIDatPDCPPresent) {
         buffer.getContext().eventDispatcher.startElement("sgNB_UL_GTP_TEIDatPDCP", -1);

         sgNB_UL_GTP_TEIDatPDCP = new GTPtunnelEndpoint();
         sgNB_UL_GTP_TEIDatPDCP.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sgNB_UL_GTP_TEIDatPDCP", -1);
      }
      else {
         sgNB_UL_GTP_TEIDatPDCP = null;
      }

      // decode mCG_E_RAB_Level_QoS_Parameters

      if (mCG_E_RAB_Level_QoS_ParametersPresent) {
         buffer.getContext().eventDispatcher.startElement("mCG_E_RAB_Level_QoS_Parameters", -1);

         mCG_E_RAB_Level_QoS_Parameters = new E_RAB_Level_QoS_Parameters();
         mCG_E_RAB_Level_QoS_Parameters.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mCG_E_RAB_Level_QoS_Parameters", -1);
      }
      else {
         mCG_E_RAB_Level_QoS_Parameters = null;
      }

      // decode uL_Configuration

      if (uL_ConfigurationPresent) {
         buffer.getContext().eventDispatcher.startElement("uL_Configuration", -1);

         uL_Configuration = new ULConfiguration();
         uL_Configuration.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("uL_Configuration", -1);
      }
      else {
         uL_Configuration = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new E_RABs_Admitted_ToBeModified_SgNBModAck_Item_SgNBPDCPpresent_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (s1_DL_GTPtunnelEndpoint != null) s1_DL_GTPtunnelEndpoint.print (_sb, "s1_DL_GTPtunnelEndpoint", _level+1);
      if (sgNB_UL_GTP_TEIDatPDCP != null) sgNB_UL_GTP_TEIDatPDCP.print (_sb, "sgNB_UL_GTP_TEIDatPDCP", _level+1);
      if (mCG_E_RAB_Level_QoS_Parameters != null) mCG_E_RAB_Level_QoS_Parameters.print (_sb, "mCG_E_RAB_Level_QoS_Parameters", _level+1);
      if (uL_Configuration != null) uL_Configuration.print (_sb, "uL_Configuration", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
