/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_moreThanTwoRLC_DRB_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public LogicalChannelIdentity splitSecondaryPath_r16;  // optional
   public PDCP_Config_moreThanTwoRLC_DRB_r16_duplicationState_r16 duplicationState_r16;  // optional

   public PDCP_Config_moreThanTwoRLC_DRB_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Config_moreThanTwoRLC_DRB_r16 (
      LogicalChannelIdentity splitSecondaryPath_r16_,
      PDCP_Config_moreThanTwoRLC_DRB_r16_duplicationState_r16 duplicationState_r16_
   ) {
      super();
      splitSecondaryPath_r16 = splitSecondaryPath_r16_;
      duplicationState_r16 = duplicationState_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PDCP_Config_moreThanTwoRLC_DRB_r16 (long splitSecondaryPath_r16_,
      PDCP_Config_moreThanTwoRLC_DRB_r16_duplicationState_r16 duplicationState_r16_
   ) {
      super();
      splitSecondaryPath_r16 = new LogicalChannelIdentity (splitSecondaryPath_r16_);
      duplicationState_r16 = duplicationState_r16_;
   }

   public void init () {
      splitSecondaryPath_r16 = null;
      duplicationState_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return splitSecondaryPath_r16;
         case 1: return duplicationState_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "splitSecondaryPath-r16";
         case 1: return "duplicationState-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean splitSecondaryPath_r16Present = buffer.decodeBit ("splitSecondaryPath_r16Present");
      boolean duplicationState_r16Present = buffer.decodeBit ("duplicationState_r16Present");

      // decode splitSecondaryPath_r16

      if (splitSecondaryPath_r16Present) {
         buffer.getContext().eventDispatcher.startElement("splitSecondaryPath_r16", -1);

         splitSecondaryPath_r16 = new LogicalChannelIdentity();
         splitSecondaryPath_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("splitSecondaryPath_r16", -1);
      }
      else {
         splitSecondaryPath_r16 = null;
      }

      // decode duplicationState_r16

      if (duplicationState_r16Present) {
         buffer.getContext().eventDispatcher.startElement("duplicationState_r16", -1);

         duplicationState_r16 = new PDCP_Config_moreThanTwoRLC_DRB_r16_duplicationState_r16();
         duplicationState_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("duplicationState_r16", -1);
      }
      else {
         duplicationState_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (splitSecondaryPath_r16 != null) splitSecondaryPath_r16.print (_sb, "splitSecondaryPath_r16", _level+1);
      if (duplicationState_r16 != null) duplicationState_r16.print (_sb, "duplicationState_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
