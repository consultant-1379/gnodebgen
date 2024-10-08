/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpaceExt_r16_searchSpaceType_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SearchSpaceExt_r16_searchSpaceType_r16_common_r16 common_r16;

   public SearchSpaceExt_r16_searchSpaceType_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SearchSpaceExt_r16_searchSpaceType_r16 (
      SearchSpaceExt_r16_searchSpaceType_r16_common_r16 common_r16_
   ) {
      super();
      common_r16 = common_r16_;
   }

   public void init () {
      common_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return common_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "common-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode common_r16

      buffer.getContext().eventDispatcher.startElement("common_r16", -1);

      common_r16 = new SearchSpaceExt_r16_searchSpaceType_r16_common_r16();
      common_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("common_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (common_r16 != null) common_r16.print (_sb, "common_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
