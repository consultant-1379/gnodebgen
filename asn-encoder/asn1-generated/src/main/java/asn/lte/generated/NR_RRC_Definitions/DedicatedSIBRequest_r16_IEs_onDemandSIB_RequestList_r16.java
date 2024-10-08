/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedSIB_List_r16 requestedSIB_List_r16;  // optional
   public DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedPosSIB_List_r16 requestedPosSIB_List_r16;  // optional

   public DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16 (
      DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedSIB_List_r16 requestedSIB_List_r16_,
      DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedPosSIB_List_r16 requestedPosSIB_List_r16_
   ) {
      super();
      requestedSIB_List_r16 = requestedSIB_List_r16_;
      requestedPosSIB_List_r16 = requestedPosSIB_List_r16_;
   }

   public void init () {
      requestedSIB_List_r16 = null;
      requestedPosSIB_List_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return requestedSIB_List_r16;
         case 1: return requestedPosSIB_List_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "requestedSIB-List-r16";
         case 1: return "requestedPosSIB-List-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean requestedSIB_List_r16Present = buffer.decodeBit ("requestedSIB_List_r16Present");
      boolean requestedPosSIB_List_r16Present = buffer.decodeBit ("requestedPosSIB_List_r16Present");

      // decode requestedSIB_List_r16

      if (requestedSIB_List_r16Present) {
         buffer.getContext().eventDispatcher.startElement("requestedSIB_List_r16", -1);

         requestedSIB_List_r16 = new DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedSIB_List_r16();
         requestedSIB_List_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("requestedSIB_List_r16", -1);
      }
      else {
         requestedSIB_List_r16 = null;
      }

      // decode requestedPosSIB_List_r16

      if (requestedPosSIB_List_r16Present) {
         buffer.getContext().eventDispatcher.startElement("requestedPosSIB_List_r16", -1);

         requestedPosSIB_List_r16 = new DedicatedSIBRequest_r16_IEs_onDemandSIB_RequestList_r16_requestedPosSIB_List_r16();
         requestedPosSIB_List_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("requestedPosSIB_List_r16", -1);
      }
      else {
         requestedPosSIB_List_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (requestedSIB_List_r16 != null) requestedSIB_List_r16.print (_sb, "requestedSIB_List_r16", _level+1);
      if (requestedPosSIB_List_r16 != null) requestedPosSIB_List_r16.print (_sb, "requestedPosSIB_List_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
