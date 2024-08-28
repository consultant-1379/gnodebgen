/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_ConfigNZP_Activation_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-ConfigNZP-Activation-r14";
   }

   public CSI_RS_ConfigNZP_Activation_r14_csi_RS_NZP_mode_r14 csi_RS_NZP_mode_r14 = null;
   public Asn1Integer activatedResources_r14;

   public CSI_RS_ConfigNZP_Activation_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_ConfigNZP_Activation_r14 (
      CSI_RS_ConfigNZP_Activation_r14_csi_RS_NZP_mode_r14 csi_RS_NZP_mode_r14_,
      Asn1Integer activatedResources_r14_
   ) {
      super();
      csi_RS_NZP_mode_r14 = csi_RS_NZP_mode_r14_;
      activatedResources_r14 = activatedResources_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_RS_ConfigNZP_Activation_r14 (CSI_RS_ConfigNZP_Activation_r14_csi_RS_NZP_mode_r14 csi_RS_NZP_mode_r14_,
      long activatedResources_r14_
   ) {
      super();
      csi_RS_NZP_mode_r14 = csi_RS_NZP_mode_r14_;
      activatedResources_r14 = new Asn1Integer (activatedResources_r14_);
   }

   public void init () {
      csi_RS_NZP_mode_r14 = null;
      activatedResources_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_RS_NZP_mode_r14;
         case 1: return activatedResources_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-RS-NZP-mode-r14";
         case 1: return "activatedResources-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode csi_RS_NZP_mode_r14

      buffer.getContext().eventDispatcher.startElement("csi_RS_NZP_mode_r14", -1);

      {
         int tval = CSI_RS_ConfigNZP_Activation_r14_csi_RS_NZP_mode_r14.decodeEnumValue (buffer);
         csi_RS_NZP_mode_r14 = CSI_RS_ConfigNZP_Activation_r14_csi_RS_NZP_mode_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("csi_RS_NZP_mode_r14", -1);

      // decode activatedResources_r14

      buffer.getContext().eventDispatcher.startElement("activatedResources_r14", -1);

      activatedResources_r14 = new Asn1Integer();
      activatedResources_r14.decode (buffer, 0, 4);

      buffer.invokeCharacters(activatedResources_r14.toString());
      buffer.getContext().eventDispatcher.endElement("activatedResources_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_RS_NZP_mode_r14 != null) csi_RS_NZP_mode_r14.print (_sb, "csi_RS_NZP_mode_r14", _level+1);
      if (activatedResources_r14 != null) activatedResources_r14.print (_sb, "activatedResources_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
