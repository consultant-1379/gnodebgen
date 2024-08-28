/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_ConfigDedicated_v1250 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-ConfigDedicated-v1250";
   }

   public PUSCH_ConfigDedicated_v1250_uciOnPUSCH uciOnPUSCH;

   public PUSCH_ConfigDedicated_v1250 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_ConfigDedicated_v1250 (
      PUSCH_ConfigDedicated_v1250_uciOnPUSCH uciOnPUSCH_
   ) {
      super();
      uciOnPUSCH = uciOnPUSCH_;
   }

   public void init () {
      uciOnPUSCH = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return uciOnPUSCH;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "uciOnPUSCH";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode uciOnPUSCH

      buffer.getContext().eventDispatcher.startElement("uciOnPUSCH", -1);

      uciOnPUSCH = new PUSCH_ConfigDedicated_v1250_uciOnPUSCH();
      uciOnPUSCH.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uciOnPUSCH", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (uciOnPUSCH != null) uciOnPUSCH.print (_sb, "uciOnPUSCH", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
