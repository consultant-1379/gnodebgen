/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCG_Configuration_v13c0_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SCG_ConfigPartSCG_v13c0 scg_ConfigPartSCG_v13c0;  // optional

   public SCG_Configuration_v13c0_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCG_Configuration_v13c0_setup (
      SCG_ConfigPartSCG_v13c0 scg_ConfigPartSCG_v13c0_
   ) {
      super();
      scg_ConfigPartSCG_v13c0 = scg_ConfigPartSCG_v13c0_;
   }

   public void init () {
      scg_ConfigPartSCG_v13c0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scg_ConfigPartSCG_v13c0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scg-ConfigPartSCG-v13c0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scg_ConfigPartSCG_v13c0Present = buffer.decodeBit ("scg_ConfigPartSCG_v13c0Present");

      // decode scg_ConfigPartSCG_v13c0

      if (scg_ConfigPartSCG_v13c0Present) {
         buffer.getContext().eventDispatcher.startElement("scg_ConfigPartSCG_v13c0", -1);

         scg_ConfigPartSCG_v13c0 = new SCG_ConfigPartSCG_v13c0();
         scg_ConfigPartSCG_v13c0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scg_ConfigPartSCG_v13c0", -1);
      }
      else {
         scg_ConfigPartSCG_v13c0 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (scg_ConfigPartSCG_v13c0 != null) scg_ConfigPartSCG_v13c0.print (_sb, "scg_ConfigPartSCG_v13c0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
