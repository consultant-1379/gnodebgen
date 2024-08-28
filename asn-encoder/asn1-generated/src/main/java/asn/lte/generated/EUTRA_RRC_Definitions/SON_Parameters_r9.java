/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SON_Parameters_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SON-Parameters-r9";
   }

   public SON_Parameters_r9_rach_Report_r9 rach_Report_r9 = null;  // optional

   public SON_Parameters_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SON_Parameters_r9 (
      SON_Parameters_r9_rach_Report_r9 rach_Report_r9_
   ) {
      super();
      rach_Report_r9 = rach_Report_r9_;
   }

   public void init () {
      rach_Report_r9 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rach_Report_r9;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rach-Report-r9";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rach_Report_r9Present = buffer.decodeBit ("rach_Report_r9Present");

      // decode rach_Report_r9

      if (rach_Report_r9Present) {
         buffer.getContext().eventDispatcher.startElement("rach_Report_r9", -1);

         int tval = SON_Parameters_r9_rach_Report_r9.decodeEnumValue (buffer);
         rach_Report_r9 = SON_Parameters_r9_rach_Report_r9.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rach_Report_r9", -1);
      }
      else {
         rach_Report_r9 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rach_Report_r9 != null) rach_Report_r9.print (_sb, "rach_Report_r9", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
