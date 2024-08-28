/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEAssistanceInformation_v1530_IEs_sps_AssistanceInformation_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public TrafficPatternInfoList_v1530 trafficPatternInfoListSL_v1530;

   public UEAssistanceInformation_v1530_IEs_sps_AssistanceInformation_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UEAssistanceInformation_v1530_IEs_sps_AssistanceInformation_v1530 (
      TrafficPatternInfoList_v1530 trafficPatternInfoListSL_v1530_
   ) {
      super();
      trafficPatternInfoListSL_v1530 = trafficPatternInfoListSL_v1530_;
   }

   public void init () {
      trafficPatternInfoListSL_v1530 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return trafficPatternInfoListSL_v1530;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "trafficPatternInfoListSL-v1530";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode trafficPatternInfoListSL_v1530

      buffer.getContext().eventDispatcher.startElement("trafficPatternInfoListSL_v1530", -1);

      trafficPatternInfoListSL_v1530 = new TrafficPatternInfoList_v1530();
      trafficPatternInfoListSL_v1530.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trafficPatternInfoListSL_v1530", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (trafficPatternInfoListSL_v1530 != null) trafficPatternInfoListSL_v1530.print (_sb, "trafficPatternInfoListSL_v1530", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
