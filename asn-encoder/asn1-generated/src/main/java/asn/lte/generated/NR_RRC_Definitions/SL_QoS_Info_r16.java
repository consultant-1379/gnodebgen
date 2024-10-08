/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_QoS_Info_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-QoS-Info-r16";
   }

   public SL_QoS_FlowIdentity_r16 sl_QoS_FlowIdentity_r16;
   public SL_QoS_Profile_r16 sl_QoS_Profile_r16;  // optional

   public SL_QoS_Info_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_QoS_Info_r16 (
      SL_QoS_FlowIdentity_r16 sl_QoS_FlowIdentity_r16_,
      SL_QoS_Profile_r16 sl_QoS_Profile_r16_
   ) {
      super();
      sl_QoS_FlowIdentity_r16 = sl_QoS_FlowIdentity_r16_;
      sl_QoS_Profile_r16 = sl_QoS_Profile_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_QoS_Info_r16 (
      SL_QoS_FlowIdentity_r16 sl_QoS_FlowIdentity_r16_
   ) {
      super();
      sl_QoS_FlowIdentity_r16 = sl_QoS_FlowIdentity_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_QoS_Info_r16 (long sl_QoS_FlowIdentity_r16_,
      SL_QoS_Profile_r16 sl_QoS_Profile_r16_
   ) {
      super();
      sl_QoS_FlowIdentity_r16 = new SL_QoS_FlowIdentity_r16 (sl_QoS_FlowIdentity_r16_);
      sl_QoS_Profile_r16 = sl_QoS_Profile_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_QoS_Info_r16 (
      long sl_QoS_FlowIdentity_r16_
   ) {
      super();
      sl_QoS_FlowIdentity_r16 = new SL_QoS_FlowIdentity_r16 (sl_QoS_FlowIdentity_r16_);
   }

   public void init () {
      sl_QoS_FlowIdentity_r16 = null;
      sl_QoS_Profile_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_QoS_FlowIdentity_r16;
         case 1: return sl_QoS_Profile_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-QoS-FlowIdentity-r16";
         case 1: return "sl-QoS-Profile-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sl_QoS_Profile_r16Present = buffer.decodeBit ("sl_QoS_Profile_r16Present");

      // decode sl_QoS_FlowIdentity_r16

      buffer.getContext().eventDispatcher.startElement("sl_QoS_FlowIdentity_r16", -1);

      sl_QoS_FlowIdentity_r16 = new SL_QoS_FlowIdentity_r16();
      sl_QoS_FlowIdentity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_QoS_FlowIdentity_r16", -1);

      // decode sl_QoS_Profile_r16

      if (sl_QoS_Profile_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_QoS_Profile_r16", -1);

         sl_QoS_Profile_r16 = new SL_QoS_Profile_r16();
         sl_QoS_Profile_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_QoS_Profile_r16", -1);
      }
      else {
         sl_QoS_Profile_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sl_QoS_FlowIdentity_r16 != null) sl_QoS_FlowIdentity_r16.print (_sb, "sl_QoS_FlowIdentity_r16", _level+1);
      if (sl_QoS_Profile_r16 != null) sl_QoS_Profile_r16.print (_sb, "sl_QoS_Profile_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
