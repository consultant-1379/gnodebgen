/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_CarrierConfigDedicated_NB_r13_dl_GapNonAnchor_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _USENOGAP_R13 = 1;
   public final static byte _USEANCHORGAPCONFIG_R13 = 2;
   public final static byte _EXPLICITGAPCONFIGURATION_R13 = 3;
   public final static byte _SPARE = 4;

   public DL_CarrierConfigDedicated_NB_r13_dl_GapNonAnchor_r13 () {
      super();
   }

   public DL_CarrierConfigDedicated_NB_r13_dl_GapNonAnchor_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _USENOGAP_R13: return "useNoGap_r13";
      case _USEANCHORGAPCONFIG_R13: return "useAnchorGapConfig_r13";
      case _EXPLICITGAPCONFIGURATION_R13: return "explicitGapConfiguration_r13";
      case _SPARE: return "spare";
      default: return "UNDEFINED";
      }
   }

   public void set_useNoGap_r13 () {
      setElement (_USENOGAP_R13, Asn1Null.NULL_VALUE);
   }

   public void set_useAnchorGapConfig_r13 () {
      setElement (_USEANCHORGAPCONFIG_R13, Asn1Null.NULL_VALUE);
   }

   public void set_explicitGapConfiguration_r13 (DL_GapConfig_NB_r13 value) {
      setElement (_EXPLICITGAPCONFIGURATION_R13, value);
   }

   public void set_spare () {
      setElement (_SPARE, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // useNoGap_r13
         case 0: { 
            Asn1Null useNoGap_r13;
            element = useNoGap_r13 = Asn1Null.NULL_VALUE;
            useNoGap_r13.decode (buffer);

            buffer.invokeCharacters(useNoGap_r13.toString());
            break;
         }

         // useAnchorGapConfig_r13
         case 1: { 
            Asn1Null useAnchorGapConfig_r13;
            element = useAnchorGapConfig_r13 = Asn1Null.NULL_VALUE;
            useAnchorGapConfig_r13.decode (buffer);

            buffer.invokeCharacters(useAnchorGapConfig_r13.toString());
            break;
         }

         // explicitGapConfiguration_r13
         case 2: { 
            DL_GapConfig_NB_r13 explicitGapConfiguration_r13;
            element = explicitGapConfiguration_r13 = new DL_GapConfig_NB_r13();
            explicitGapConfiguration_r13.decode (buffer);
            break;
         }

         // spare
         case 3: { 
            Asn1Null spare;
            element = spare = Asn1Null.NULL_VALUE;
            spare.decode (buffer);

            buffer.invokeCharacters(spare.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
