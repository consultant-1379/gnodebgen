/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class AS_Context extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AS-Context";
   }

   public ReestablishmentInfo reestablishmentInfo;  // optional

   public AS_Context () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AS_Context (
      ReestablishmentInfo reestablishmentInfo_
   ) {
      super();
      reestablishmentInfo = reestablishmentInfo_;
   }

   public void init () {
      reestablishmentInfo = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reestablishmentInfo;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reestablishmentInfo";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean reestablishmentInfoPresent = buffer.decodeBit ("reestablishmentInfoPresent");

      // decode reestablishmentInfo

      if (reestablishmentInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("reestablishmentInfo", -1);

         reestablishmentInfo = new ReestablishmentInfo();
         reestablishmentInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reestablishmentInfo", -1);
      }
      else {
         reestablishmentInfo = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reestablishmentInfo != null) reestablishmentInfo.print (_sb, "reestablishmentInfo", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
