/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SidelinkUEInformation_v1430_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SidelinkUEInformation-v1430-IEs";
   }

   public SL_V2X_CommFreqList_r14 v2x_CommRxInterestedFreqList_r14;  // optional
   public SidelinkUEInformation_v1430_IEs_p2x_CommTxType_r14 p2x_CommTxType_r14 = null;  // optional
   public SL_V2X_CommTxFreqList_r14 v2x_CommTxResourceReq_r14;  // optional
   public SidelinkUEInformation_v1530_IEs nonCriticalExtension;  // optional

   public SidelinkUEInformation_v1430_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SidelinkUEInformation_v1430_IEs (
      SL_V2X_CommFreqList_r14 v2x_CommRxInterestedFreqList_r14_,
      SidelinkUEInformation_v1430_IEs_p2x_CommTxType_r14 p2x_CommTxType_r14_,
      SL_V2X_CommTxFreqList_r14 v2x_CommTxResourceReq_r14_,
      SidelinkUEInformation_v1530_IEs nonCriticalExtension_
   ) {
      super();
      v2x_CommRxInterestedFreqList_r14 = v2x_CommRxInterestedFreqList_r14_;
      p2x_CommTxType_r14 = p2x_CommTxType_r14_;
      v2x_CommTxResourceReq_r14 = v2x_CommTxResourceReq_r14_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      v2x_CommRxInterestedFreqList_r14 = null;
      p2x_CommTxType_r14 = null;
      v2x_CommTxResourceReq_r14 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return v2x_CommRxInterestedFreqList_r14;
         case 1: return p2x_CommTxType_r14;
         case 2: return v2x_CommTxResourceReq_r14;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "v2x-CommRxInterestedFreqList-r14";
         case 1: return "p2x-CommTxType-r14";
         case 2: return "v2x-CommTxResourceReq-r14";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean v2x_CommRxInterestedFreqList_r14Present = buffer.decodeBit ("v2x_CommRxInterestedFreqList_r14Present");
      boolean p2x_CommTxType_r14Present = buffer.decodeBit ("p2x_CommTxType_r14Present");
      boolean v2x_CommTxResourceReq_r14Present = buffer.decodeBit ("v2x_CommTxResourceReq_r14Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode v2x_CommRxInterestedFreqList_r14

      if (v2x_CommRxInterestedFreqList_r14Present) {
         buffer.getContext().eventDispatcher.startElement("v2x_CommRxInterestedFreqList_r14", -1);

         v2x_CommRxInterestedFreqList_r14 = new SL_V2X_CommFreqList_r14();
         v2x_CommRxInterestedFreqList_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("v2x_CommRxInterestedFreqList_r14", -1);
      }
      else {
         v2x_CommRxInterestedFreqList_r14 = null;
      }

      // decode p2x_CommTxType_r14

      if (p2x_CommTxType_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p2x_CommTxType_r14", -1);

         int tval = SidelinkUEInformation_v1430_IEs_p2x_CommTxType_r14.decodeEnumValue (buffer);
         p2x_CommTxType_r14 = SidelinkUEInformation_v1430_IEs_p2x_CommTxType_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("p2x_CommTxType_r14", -1);
      }
      else {
         p2x_CommTxType_r14 = null;
      }

      // decode v2x_CommTxResourceReq_r14

      if (v2x_CommTxResourceReq_r14Present) {
         buffer.getContext().eventDispatcher.startElement("v2x_CommTxResourceReq_r14", -1);

         v2x_CommTxResourceReq_r14 = new SL_V2X_CommTxFreqList_r14();
         v2x_CommTxResourceReq_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("v2x_CommTxResourceReq_r14", -1);
      }
      else {
         v2x_CommTxResourceReq_r14 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SidelinkUEInformation_v1530_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (v2x_CommRxInterestedFreqList_r14 != null) v2x_CommRxInterestedFreqList_r14.print (_sb, "v2x_CommRxInterestedFreqList_r14", _level+1);
      if (p2x_CommTxType_r14 != null) p2x_CommTxType_r14.print (_sb, "p2x_CommTxType_r14", _level+1);
      if (v2x_CommTxResourceReq_r14 != null) v2x_CommTxResourceReq_r14.print (_sb, "v2x_CommTxResourceReq_r14", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
