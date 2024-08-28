/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigCommon_pusch_ConfigBasic extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer n_SB;
   public PUSCH_ConfigCommon_pusch_ConfigBasic_hoppingMode hoppingMode = null;
   public Asn1Integer pusch_HoppingOffset;
   public Asn1Boolean enable64QAM;

   public PUSCH_ConfigCommon_pusch_ConfigBasic () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigCommon_pusch_ConfigBasic (
      Asn1Integer n_SB_,
      PUSCH_ConfigCommon_pusch_ConfigBasic_hoppingMode hoppingMode_,
      Asn1Integer pusch_HoppingOffset_,
      Asn1Boolean enable64QAM_
   ) {
      super();
      n_SB = n_SB_;
      hoppingMode = hoppingMode_;
      pusch_HoppingOffset = pusch_HoppingOffset_;
      enable64QAM = enable64QAM_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUSCH_ConfigCommon_pusch_ConfigBasic (long n_SB_,
      PUSCH_ConfigCommon_pusch_ConfigBasic_hoppingMode hoppingMode_,
      long pusch_HoppingOffset_,
      boolean enable64QAM_
   ) {
      super();
      n_SB = new Asn1Integer (n_SB_);
      hoppingMode = hoppingMode_;
      pusch_HoppingOffset = new Asn1Integer (pusch_HoppingOffset_);
      enable64QAM = new Asn1Boolean (enable64QAM_);
   }

   public void init () {
      n_SB = null;
      hoppingMode = null;
      pusch_HoppingOffset = null;
      enable64QAM = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return n_SB;
         case 1: return hoppingMode;
         case 2: return pusch_HoppingOffset;
         case 3: return enable64QAM;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "n-SB";
         case 1: return "hoppingMode";
         case 2: return "pusch-HoppingOffset";
         case 3: return "enable64QAM";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode n_SB

      buffer.getContext().eventDispatcher.startElement("n_SB", -1);

      n_SB = new Asn1Integer();
      n_SB.decode (buffer, 1, 4);

      buffer.invokeCharacters(n_SB.toString());
      buffer.getContext().eventDispatcher.endElement("n_SB", -1);

      // decode hoppingMode

      buffer.getContext().eventDispatcher.startElement("hoppingMode", -1);

      {
         int tval = PUSCH_ConfigCommon_pusch_ConfigBasic_hoppingMode.decodeEnumValue (buffer);
         hoppingMode = PUSCH_ConfigCommon_pusch_ConfigBasic_hoppingMode.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("hoppingMode", -1);

      // decode pusch_HoppingOffset

      buffer.getContext().eventDispatcher.startElement("pusch_HoppingOffset", -1);

      pusch_HoppingOffset = new Asn1Integer();
      pusch_HoppingOffset.decode (buffer, 0, 98);

      buffer.invokeCharacters(pusch_HoppingOffset.toString());
      buffer.getContext().eventDispatcher.endElement("pusch_HoppingOffset", -1);

      // decode enable64QAM

      buffer.getContext().eventDispatcher.startElement("enable64QAM", -1);

      enable64QAM = new Asn1Boolean();
      enable64QAM.decode (buffer);

      buffer.invokeCharacters(enable64QAM.toString());
      buffer.getContext().eventDispatcher.endElement("enable64QAM", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (n_SB != null) n_SB.print (_sb, "n_SB", _level+1);
      if (hoppingMode != null) hoppingMode.print (_sb, "hoppingMode", _level+1);
      if (pusch_HoppingOffset != null) pusch_HoppingOffset.print (_sb, "pusch_HoppingOffset", _level+1);
      if (enable64QAM != null) enable64QAM.print (_sb, "enable64QAM", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
