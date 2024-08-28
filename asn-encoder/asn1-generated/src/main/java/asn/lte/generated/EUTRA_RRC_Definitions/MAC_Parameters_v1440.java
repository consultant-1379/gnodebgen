/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_Parameters_v1440 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-Parameters-v1440";
   }

   public MAC_Parameters_v1440_rai_Support_r14 rai_Support_r14 = null;  // optional

   public MAC_Parameters_v1440 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_Parameters_v1440 (
      MAC_Parameters_v1440_rai_Support_r14 rai_Support_r14_
   ) {
      super();
      rai_Support_r14 = rai_Support_r14_;
   }

   public void init () {
      rai_Support_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rai_Support_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rai-Support-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rai_Support_r14Present = buffer.decodeBit ("rai_Support_r14Present");

      // decode rai_Support_r14

      if (rai_Support_r14Present) {
         buffer.getContext().eventDispatcher.startElement("rai_Support_r14", -1);

         int tval = MAC_Parameters_v1440_rai_Support_r14.decodeEnumValue (buffer);
         rai_Support_r14 = MAC_Parameters_v1440_rai_Support_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rai_Support_r14", -1);
      }
      else {
         rai_Support_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rai_Support_r14 != null) rai_Support_r14.print (_sb, "rai_Support_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
