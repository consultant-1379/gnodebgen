/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.MeasResultSCG_Failure;

public class CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16_failureType_r16 failureType_r16 = null;
   public MeasResultSCG_Failure measResultSCG_r16;

   public CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16 (
      CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16_failureType_r16 failureType_r16_,
      MeasResultSCG_Failure measResultSCG_r16_
   ) {
      super();
      failureType_r16 = failureType_r16_;
      measResultSCG_r16 = measResultSCG_r16_;
   }

   public void init () {
      failureType_r16 = null;
      measResultSCG_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return failureType_r16;
         case 1: return measResultSCG_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "failureType-r16";
         case 1: return "measResultSCG-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode failureType_r16

      buffer.getContext().eventDispatcher.startElement("failureType_r16", -1);

      {
         int tval = CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16_failureType_r16.decodeEnumValue (buffer);
         failureType_r16 = CG_ConfigInfo_v1610_IEs_scgFailureInfo_r16_failureType_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("failureType_r16", -1);

      // decode measResultSCG_r16

      buffer.getContext().eventDispatcher.startElement("measResultSCG_r16", -1);

      {
         Asn1OctetString measResultSCG_r16_outer = new Asn1OctetString();
         measResultSCG_r16_outer.decode (buffer);
         if (measResultSCG_r16_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( measResultSCG_r16_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         measResultSCG_r16 = new MeasResultSCG_Failure();
         measResultSCG_r16.decode (buffer);
         buffer = savedBuffer;
      }
      buffer.getContext().eventDispatcher.endElement("measResultSCG_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode failureType_r16

      if (failureType_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("failureType_r16", -1);

         failureType_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("failureType_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("failureType_r16");

      // encode measResultSCG_r16

      if (measResultSCG_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_r16", -1);

         Asn1OctetString measResultSCG_r16_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            measResultSCG_r16.encode (buffer);
            measResultSCG_r16_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         measResultSCG_r16_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultSCG_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("measResultSCG_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (failureType_r16 != null) failureType_r16.print (_sb, "failureType_r16", _level+1);
      if (measResultSCG_r16 != null) measResultSCG_r16.print (_sb, "measResultSCG_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
