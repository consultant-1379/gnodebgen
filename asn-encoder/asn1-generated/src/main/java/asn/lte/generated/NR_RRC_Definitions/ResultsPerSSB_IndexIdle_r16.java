/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ResultsPerSSB_IndexIdle_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ResultsPerSSB-IndexIdle-r16";
   }

   public SSB_Index ssb_Index_r16;
   public ResultsPerSSB_IndexIdle_r16_ssb_Results_r16 ssb_Results_r16;  // optional

   public ResultsPerSSB_IndexIdle_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ResultsPerSSB_IndexIdle_r16 (
      SSB_Index ssb_Index_r16_,
      ResultsPerSSB_IndexIdle_r16_ssb_Results_r16 ssb_Results_r16_
   ) {
      super();
      ssb_Index_r16 = ssb_Index_r16_;
      ssb_Results_r16 = ssb_Results_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ResultsPerSSB_IndexIdle_r16 (
      SSB_Index ssb_Index_r16_
   ) {
      super();
      ssb_Index_r16 = ssb_Index_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ResultsPerSSB_IndexIdle_r16 (long ssb_Index_r16_,
      ResultsPerSSB_IndexIdle_r16_ssb_Results_r16 ssb_Results_r16_
   ) {
      super();
      ssb_Index_r16 = new SSB_Index (ssb_Index_r16_);
      ssb_Results_r16 = ssb_Results_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public ResultsPerSSB_IndexIdle_r16 (
      long ssb_Index_r16_
   ) {
      super();
      ssb_Index_r16 = new SSB_Index (ssb_Index_r16_);
   }

   public void init () {
      ssb_Index_r16 = null;
      ssb_Results_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ssb_Index_r16;
         case 1: return ssb_Results_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ssb-Index-r16";
         case 1: return "ssb-Results-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ssb_Results_r16Present = buffer.decodeBit ("ssb_Results_r16Present");

      // decode ssb_Index_r16

      buffer.getContext().eventDispatcher.startElement("ssb_Index_r16", -1);

      ssb_Index_r16 = new SSB_Index();
      ssb_Index_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ssb_Index_r16", -1);

      // decode ssb_Results_r16

      if (ssb_Results_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ssb_Results_r16", -1);

         ssb_Results_r16 = new ResultsPerSSB_IndexIdle_r16_ssb_Results_r16();
         ssb_Results_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ssb_Results_r16", -1);
      }
      else {
         ssb_Results_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ssb_Index_r16 != null) ssb_Index_r16.print (_sb, "ssb_Index_r16", _level+1);
      if (ssb_Results_r16 != null) ssb_Results_r16.print (_sb, "ssb_Results_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
