/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCResumeRequest extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCResumeRequest";
   }

   public RRCResumeRequest_IEs rrcResumeRequest;

   public RRCResumeRequest () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCResumeRequest (
      RRCResumeRequest_IEs rrcResumeRequest_
   ) {
      super();
      rrcResumeRequest = rrcResumeRequest_;
   }

   public void init () {
      rrcResumeRequest = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rrcResumeRequest;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rrcResumeRequest";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rrcResumeRequest

      buffer.getContext().eventDispatcher.startElement("rrcResumeRequest", -1);

      rrcResumeRequest = new RRCResumeRequest_IEs();
      rrcResumeRequest.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rrcResumeRequest", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rrcResumeRequest != null) rrcResumeRequest.print (_sb, "rrcResumeRequest", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
