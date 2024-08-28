/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Standalone_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Standalone-NB-r13";
   }

   public Asn1BitString spare;

   public Standalone_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Standalone_NB_r13 (
      Asn1BitString spare_
   ) {
      super();
      spare = spare_;
   }

   public void init () {
      spare = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return spare;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "spare";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode spare

      buffer.getContext().eventDispatcher.startElement("spare", -1);

      spare = new Asn1BitString();
      spare.decode (buffer, 5, 5);

      buffer.invokeCharacters(spare.toString());
      buffer.getContext().eventDispatcher.endElement("spare", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (spare != null) spare.print (_sb, "spare", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
