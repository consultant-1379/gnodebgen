/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Handover extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Handover";
   }

   public Handover_targetRAT_Type targetRAT_Type = null;
   public Asn1OctetString targetRAT_MessageContainer;
   public Asn1OctetString nas_SecurityParamFromEUTRA;  // optional
   public SI_OrPSI_GERAN systemInformation;  // optional

   public Handover () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Handover (
      Handover_targetRAT_Type targetRAT_Type_,
      Asn1OctetString targetRAT_MessageContainer_,
      Asn1OctetString nas_SecurityParamFromEUTRA_,
      SI_OrPSI_GERAN systemInformation_
   ) {
      super();
      targetRAT_Type = targetRAT_Type_;
      targetRAT_MessageContainer = targetRAT_MessageContainer_;
      nas_SecurityParamFromEUTRA = nas_SecurityParamFromEUTRA_;
      systemInformation = systemInformation_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public Handover (
      Handover_targetRAT_Type targetRAT_Type_,
      Asn1OctetString targetRAT_MessageContainer_
   ) {
      super();
      targetRAT_Type = targetRAT_Type_;
      targetRAT_MessageContainer = targetRAT_MessageContainer_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Handover (Handover_targetRAT_Type targetRAT_Type_,
      byte[] targetRAT_MessageContainer_,
      byte[] nas_SecurityParamFromEUTRA_,
      SI_OrPSI_GERAN systemInformation_
   ) {
      super();
      targetRAT_Type = targetRAT_Type_;
      targetRAT_MessageContainer = new Asn1OctetString (targetRAT_MessageContainer_);
      nas_SecurityParamFromEUTRA = new Asn1OctetString (nas_SecurityParamFromEUTRA_);
      systemInformation = systemInformation_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public Handover (
      Handover_targetRAT_Type targetRAT_Type_,
      byte[] targetRAT_MessageContainer_
   ) {
      super();
      targetRAT_Type = targetRAT_Type_;
      targetRAT_MessageContainer = new Asn1OctetString (targetRAT_MessageContainer_);
   }

   public void init () {
      targetRAT_Type = null;
      targetRAT_MessageContainer = null;
      nas_SecurityParamFromEUTRA = null;
      systemInformation = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return targetRAT_Type;
         case 1: return targetRAT_MessageContainer;
         case 2: return nas_SecurityParamFromEUTRA;
         case 3: return systemInformation;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "targetRAT-Type";
         case 1: return "targetRAT-MessageContainer";
         case 2: return "nas-SecurityParamFromEUTRA";
         case 3: return "systemInformation";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nas_SecurityParamFromEUTRAPresent = buffer.decodeBit ("nas_SecurityParamFromEUTRAPresent");
      boolean systemInformationPresent = buffer.decodeBit ("systemInformationPresent");

      // decode targetRAT_Type

      buffer.getContext().eventDispatcher.startElement("targetRAT_Type", -1);

      {
         int tval = Handover_targetRAT_Type.decodeEnumValue (buffer);
         targetRAT_Type = Handover_targetRAT_Type.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("targetRAT_Type", -1);

      // decode targetRAT_MessageContainer

      buffer.getContext().eventDispatcher.startElement("targetRAT_MessageContainer", -1);

      targetRAT_MessageContainer = new Asn1OctetString();
      targetRAT_MessageContainer.decode (buffer);

      buffer.invokeCharacters(targetRAT_MessageContainer.toString());
      buffer.getContext().eventDispatcher.endElement("targetRAT_MessageContainer", -1);

      // decode nas_SecurityParamFromEUTRA

      if (nas_SecurityParamFromEUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("nas_SecurityParamFromEUTRA", -1);

         nas_SecurityParamFromEUTRA = new Asn1OctetString();
         nas_SecurityParamFromEUTRA.decode (buffer, 1, 1);

         buffer.invokeCharacters(nas_SecurityParamFromEUTRA.toString());
         buffer.getContext().eventDispatcher.endElement("nas_SecurityParamFromEUTRA", -1);
      }
      else {
         nas_SecurityParamFromEUTRA = null;
      }

      // decode systemInformation

      if (systemInformationPresent) {
         buffer.getContext().eventDispatcher.startElement("systemInformation", -1);

         systemInformation = new SI_OrPSI_GERAN();
         systemInformation.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("systemInformation", -1);
      }
      else {
         systemInformation = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (targetRAT_Type != null) targetRAT_Type.print (_sb, "targetRAT_Type", _level+1);
      if (targetRAT_MessageContainer != null) targetRAT_MessageContainer.print (_sb, "targetRAT_MessageContainer", _level+1);
      if (nas_SecurityParamFromEUTRA != null) nas_SecurityParamFromEUTRA.print (_sb, "nas_SecurityParamFromEUTRA", _level+1);
      if (systemInformation != null) systemInformation.print (_sb, "systemInformation", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
