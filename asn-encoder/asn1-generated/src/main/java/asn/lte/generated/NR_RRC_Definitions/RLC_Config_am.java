/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLC_Config_am extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public UL_AM_RLC ul_AM_RLC;
   public DL_AM_RLC dl_AM_RLC;

   public RLC_Config_am () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLC_Config_am (
      UL_AM_RLC ul_AM_RLC_,
      DL_AM_RLC dl_AM_RLC_
   ) {
      super();
      ul_AM_RLC = ul_AM_RLC_;
      dl_AM_RLC = dl_AM_RLC_;
   }

   public void init () {
      ul_AM_RLC = null;
      dl_AM_RLC = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_AM_RLC;
         case 1: return dl_AM_RLC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-AM-RLC";
         case 1: return "dl-AM-RLC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ul_AM_RLC

      buffer.getContext().eventDispatcher.startElement("ul_AM_RLC", -1);

      ul_AM_RLC = new UL_AM_RLC();
      ul_AM_RLC.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_AM_RLC", -1);

      // decode dl_AM_RLC

      buffer.getContext().eventDispatcher.startElement("dl_AM_RLC", -1);

      dl_AM_RLC = new DL_AM_RLC();
      dl_AM_RLC.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_AM_RLC", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_AM_RLC != null) ul_AM_RLC.print (_sb, "ul_AM_RLC", _level+1);
      if (dl_AM_RLC != null) dl_AM_RLC.print (_sb, "dl_AM_RLC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
