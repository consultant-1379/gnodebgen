/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCResumeRequest1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCResumeRequest1";
   }

   public RRCResumeRequest1_IEs rrcResumeRequest1;

   public RRCResumeRequest1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCResumeRequest1 (
      RRCResumeRequest1_IEs rrcResumeRequest1_
   ) {
      super();
      rrcResumeRequest1 = rrcResumeRequest1_;
   }

   public void init () {
      rrcResumeRequest1 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rrcResumeRequest1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rrcResumeRequest1";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rrcResumeRequest1

      buffer.getContext().eventDispatcher.startElement("rrcResumeRequest1", -1);

      rrcResumeRequest1 = new RRCResumeRequest1_IEs();
      rrcResumeRequest1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rrcResumeRequest1", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode rrcResumeRequest1

      if (rrcResumeRequest1 != null) {
         buffer.getContext().eventDispatcher.startElement("rrcResumeRequest1", -1);

         rrcResumeRequest1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rrcResumeRequest1", -1);
      }
      else throw new Asn1MissingRequiredException ("rrcResumeRequest1");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rrcResumeRequest1 != null) rrcResumeRequest1.print (_sb, "rrcResumeRequest1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
