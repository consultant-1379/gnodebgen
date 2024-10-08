/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRB_ToAddModSCG_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DRB-ToAddModSCG-r12";
   }

   public DRB_Identity drb_Identity_r12;
   public DRB_ToAddModSCG_r12_drb_Type_r12 drb_Type_r12;  // optional
   public RLC_Config rlc_ConfigSCG_r12;  // optional
   public RLC_Config_v1250 rlc_Config_v1250;  // optional
   public Asn1Integer logicalChannelIdentitySCG_r12;  // optional
   public LogicalChannelConfig logicalChannelConfigSCG_r12;  // optional
   public boolean mV2ExtPresent;
   public RLC_Config_v1430 rlc_Config_v1430;  // optional
   public boolean mV3ExtPresent;
   public Asn1Integer logicalChannelIdentitySCG_r15;  // optional
   public RLC_Config_v1530 rlc_Config_v1530;  // optional
   public RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15;  // optional
   public Asn1OpenExt extElem1;

   public DRB_ToAddModSCG_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRB_ToAddModSCG_r12 (
      DRB_Identity drb_Identity_r12_,
      DRB_ToAddModSCG_r12_drb_Type_r12 drb_Type_r12_,
      RLC_Config rlc_ConfigSCG_r12_,
      RLC_Config_v1250 rlc_Config_v1250_,
      Asn1Integer logicalChannelIdentitySCG_r12_,
      LogicalChannelConfig logicalChannelConfigSCG_r12_,
      RLC_Config_v1430 rlc_Config_v1430_,
      Asn1Integer logicalChannelIdentitySCG_r15_,
      RLC_Config_v1530 rlc_Config_v1530_,
      RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15_
   ) {
      super();
      drb_Identity_r12 = drb_Identity_r12_;
      drb_Type_r12 = drb_Type_r12_;
      rlc_ConfigSCG_r12 = rlc_ConfigSCG_r12_;
      rlc_Config_v1250 = rlc_Config_v1250_;
      logicalChannelIdentitySCG_r12 = logicalChannelIdentitySCG_r12_;
      logicalChannelConfigSCG_r12 = logicalChannelConfigSCG_r12_;
      rlc_Config_v1430 = rlc_Config_v1430_;
      logicalChannelIdentitySCG_r15 = logicalChannelIdentitySCG_r15_;
      rlc_Config_v1530 = rlc_Config_v1530_;
      rlc_BearerConfigDupl_r15 = rlc_BearerConfigDupl_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public DRB_ToAddModSCG_r12 (
      DRB_Identity drb_Identity_r12_
   ) {
      super();
      drb_Identity_r12 = drb_Identity_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DRB_ToAddModSCG_r12 (long drb_Identity_r12_,
      DRB_ToAddModSCG_r12_drb_Type_r12 drb_Type_r12_,
      RLC_Config rlc_ConfigSCG_r12_,
      RLC_Config_v1250 rlc_Config_v1250_,
      long logicalChannelIdentitySCG_r12_,
      LogicalChannelConfig logicalChannelConfigSCG_r12_,
      RLC_Config_v1430 rlc_Config_v1430_,
      long logicalChannelIdentitySCG_r15_,
      RLC_Config_v1530 rlc_Config_v1530_,
      RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15_
   ) {
      super();
      drb_Identity_r12 = new DRB_Identity (drb_Identity_r12_);
      drb_Type_r12 = drb_Type_r12_;
      rlc_ConfigSCG_r12 = rlc_ConfigSCG_r12_;
      rlc_Config_v1250 = rlc_Config_v1250_;
      logicalChannelIdentitySCG_r12 = new Asn1Integer (logicalChannelIdentitySCG_r12_);
      logicalChannelConfigSCG_r12 = logicalChannelConfigSCG_r12_;
      rlc_Config_v1430 = rlc_Config_v1430_;
      logicalChannelIdentitySCG_r15 = new Asn1Integer (logicalChannelIdentitySCG_r15_);
      rlc_Config_v1530 = rlc_Config_v1530_;
      rlc_BearerConfigDupl_r15 = rlc_BearerConfigDupl_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public DRB_ToAddModSCG_r12 (
      long drb_Identity_r12_
   ) {
      super();
      drb_Identity_r12 = new DRB_Identity (drb_Identity_r12_);
   }

   public void init () {
      drb_Identity_r12 = null;
      drb_Type_r12 = null;
      rlc_ConfigSCG_r12 = null;
      rlc_Config_v1250 = null;
      logicalChannelIdentitySCG_r12 = null;
      logicalChannelConfigSCG_r12 = null;
      rlc_Config_v1430 = null;
      logicalChannelIdentitySCG_r15 = null;
      rlc_Config_v1530 = null;
      rlc_BearerConfigDupl_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drb_Identity_r12;
         case 1: return drb_Type_r12;
         case 2: return rlc_ConfigSCG_r12;
         case 3: return rlc_Config_v1250;
         case 4: return logicalChannelIdentitySCG_r12;
         case 5: return logicalChannelConfigSCG_r12;
         case 6: return rlc_Config_v1430;
         case 7: return logicalChannelIdentitySCG_r15;
         case 8: return rlc_Config_v1530;
         case 9: return rlc_BearerConfigDupl_r15;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drb-Identity-r12";
         case 1: return "drb-Type-r12";
         case 2: return "rlc-ConfigSCG-r12";
         case 3: return "rlc-Config-v1250";
         case 4: return "logicalChannelIdentitySCG-r12";
         case 5: return "logicalChannelConfigSCG-r12";
         case 6: return "rlc-Config-v1430";
         case 7: return "logicalChannelIdentitySCG-r15";
         case 8: return "rlc-Config-v1530";
         case 9: return "rlc-BearerConfigDupl-r15";
         case 10: return null;
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

      boolean drb_Type_r12Present = buffer.decodeBit ("drb_Type_r12Present");
      boolean rlc_ConfigSCG_r12Present = buffer.decodeBit ("rlc_ConfigSCG_r12Present");
      boolean rlc_Config_v1250Present = buffer.decodeBit ("rlc_Config_v1250Present");
      boolean logicalChannelIdentitySCG_r12Present = buffer.decodeBit ("logicalChannelIdentitySCG_r12Present");
      boolean logicalChannelConfigSCG_r12Present = buffer.decodeBit ("logicalChannelConfigSCG_r12Present");

      // decode drb_Identity_r12

      buffer.getContext().eventDispatcher.startElement("drb_Identity_r12", -1);

      drb_Identity_r12 = new DRB_Identity();
      drb_Identity_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("drb_Identity_r12", -1);

      // decode drb_Type_r12

      if (drb_Type_r12Present) {
         buffer.getContext().eventDispatcher.startElement("drb_Type_r12", -1);

         drb_Type_r12 = new DRB_ToAddModSCG_r12_drb_Type_r12();
         drb_Type_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drb_Type_r12", -1);
      }
      else {
         drb_Type_r12 = null;
      }

      // decode rlc_ConfigSCG_r12

      if (rlc_ConfigSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("rlc_ConfigSCG_r12", -1);

         rlc_ConfigSCG_r12 = new RLC_Config();
         rlc_ConfigSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_ConfigSCG_r12", -1);
      }
      else {
         rlc_ConfigSCG_r12 = null;
      }

      // decode rlc_Config_v1250

      if (rlc_Config_v1250Present) {
         buffer.getContext().eventDispatcher.startElement("rlc_Config_v1250", -1);

         rlc_Config_v1250 = new RLC_Config_v1250();
         rlc_Config_v1250.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_Config_v1250", -1);
      }
      else {
         rlc_Config_v1250 = null;
      }

      // decode logicalChannelIdentitySCG_r12

      if (logicalChannelIdentitySCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelIdentitySCG_r12", -1);

         logicalChannelIdentitySCG_r12 = new Asn1Integer();
         logicalChannelIdentitySCG_r12.decode (buffer, 3, 10);

         buffer.invokeCharacters(logicalChannelIdentitySCG_r12.toString());
         buffer.getContext().eventDispatcher.endElement("logicalChannelIdentitySCG_r12", -1);
      }
      else {
         logicalChannelIdentitySCG_r12 = null;
      }

      // decode logicalChannelConfigSCG_r12

      if (logicalChannelConfigSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelConfigSCG_r12", -1);

         logicalChannelConfigSCG_r12 = new LogicalChannelConfig();
         logicalChannelConfigSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("logicalChannelConfigSCG_r12", -1);
      }
      else {
         logicalChannelConfigSCG_r12 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean rlc_Config_v1430Present = buffer.decodeBit ("rlc_Config_v1430Present");

            // decode rlc_Config_v1430

            if (rlc_Config_v1430Present) {
               buffer.getContext().eventDispatcher.startElement("rlc_Config_v1430", -1);

               rlc_Config_v1430 = new RLC_Config_v1430();
               rlc_Config_v1430.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlc_Config_v1430", -1);
            }
            else {
               rlc_Config_v1430 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean logicalChannelIdentitySCG_r15Present = buffer.decodeBit ("logicalChannelIdentitySCG_r15Present");

            boolean rlc_Config_v1530Present = buffer.decodeBit ("rlc_Config_v1530Present");

            boolean rlc_BearerConfigDupl_r15Present = buffer.decodeBit ("rlc_BearerConfigDupl_r15Present");

            // decode logicalChannelIdentitySCG_r15

            if (logicalChannelIdentitySCG_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logicalChannelIdentitySCG_r15", -1);

               logicalChannelIdentitySCG_r15 = new Asn1Integer();
               logicalChannelIdentitySCG_r15.decode (buffer, 32, 38);

               buffer.invokeCharacters(logicalChannelIdentitySCG_r15.toString());
               buffer.getContext().eventDispatcher.endElement("logicalChannelIdentitySCG_r15", -1);
            }
            else {
               logicalChannelIdentitySCG_r15 = null;
            }

            // decode rlc_Config_v1530

            if (rlc_Config_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("rlc_Config_v1530", -1);

               rlc_Config_v1530 = new RLC_Config_v1530();
               rlc_Config_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlc_Config_v1530", -1);
            }
            else {
               rlc_Config_v1530 = null;
            }

            // decode rlc_BearerConfigDupl_r15

            if (rlc_BearerConfigDupl_r15Present) {
               buffer.getContext().eventDispatcher.startElement("rlc_BearerConfigDupl_r15", -1);

               rlc_BearerConfigDupl_r15 = new RLC_BearerConfig_r15();
               rlc_BearerConfigDupl_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlc_BearerConfigDupl_r15", -1);
            }
            else {
               rlc_BearerConfigDupl_r15 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (drb_Identity_r12 != null) drb_Identity_r12.print (_sb, "drb_Identity_r12", _level+1);
      if (drb_Type_r12 != null) drb_Type_r12.print (_sb, "drb_Type_r12", _level+1);
      if (rlc_ConfigSCG_r12 != null) rlc_ConfigSCG_r12.print (_sb, "rlc_ConfigSCG_r12", _level+1);
      if (rlc_Config_v1250 != null) rlc_Config_v1250.print (_sb, "rlc_Config_v1250", _level+1);
      if (logicalChannelIdentitySCG_r12 != null) logicalChannelIdentitySCG_r12.print (_sb, "logicalChannelIdentitySCG_r12", _level+1);
      if (logicalChannelConfigSCG_r12 != null) logicalChannelConfigSCG_r12.print (_sb, "logicalChannelConfigSCG_r12", _level+1);
      if (rlc_Config_v1430 != null) rlc_Config_v1430.print (_sb, "rlc_Config_v1430", _level+1);
      if (logicalChannelIdentitySCG_r15 != null) logicalChannelIdentitySCG_r15.print (_sb, "logicalChannelIdentitySCG_r15", _level+1);
      if (rlc_Config_v1530 != null) rlc_Config_v1530.print (_sb, "rlc_Config_v1530", _level+1);
      if (rlc_BearerConfigDupl_r15 != null) rlc_BearerConfigDupl_r15.print (_sb, "rlc_BearerConfigDupl_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
