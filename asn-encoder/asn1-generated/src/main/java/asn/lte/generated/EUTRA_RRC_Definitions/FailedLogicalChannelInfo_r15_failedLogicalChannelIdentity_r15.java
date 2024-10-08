/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 cellGroupIndication_r15 = null;
   public Asn1Integer logicalChannelIdentity_r15;  // optional
   public Asn1Integer logicalChannelIdentityExt_r15;  // optional

   public FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15 (
      FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 cellGroupIndication_r15_,
      Asn1Integer logicalChannelIdentity_r15_,
      Asn1Integer logicalChannelIdentityExt_r15_
   ) {
      super();
      cellGroupIndication_r15 = cellGroupIndication_r15_;
      logicalChannelIdentity_r15 = logicalChannelIdentity_r15_;
      logicalChannelIdentityExt_r15 = logicalChannelIdentityExt_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15 (
      FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 cellGroupIndication_r15_
   ) {
      super();
      cellGroupIndication_r15 = cellGroupIndication_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15 (FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 cellGroupIndication_r15_,
      long logicalChannelIdentity_r15_,
      long logicalChannelIdentityExt_r15_
   ) {
      super();
      cellGroupIndication_r15 = cellGroupIndication_r15_;
      logicalChannelIdentity_r15 = new Asn1Integer (logicalChannelIdentity_r15_);
      logicalChannelIdentityExt_r15 = new Asn1Integer (logicalChannelIdentityExt_r15_);
   }

   public void init () {
      cellGroupIndication_r15 = null;
      logicalChannelIdentity_r15 = null;
      logicalChannelIdentityExt_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellGroupIndication_r15;
         case 1: return logicalChannelIdentity_r15;
         case 2: return logicalChannelIdentityExt_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellGroupIndication-r15";
         case 1: return "logicalChannelIdentity-r15";
         case 2: return "logicalChannelIdentityExt-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean logicalChannelIdentity_r15Present = buffer.decodeBit ("logicalChannelIdentity_r15Present");
      boolean logicalChannelIdentityExt_r15Present = buffer.decodeBit ("logicalChannelIdentityExt_r15Present");

      // decode cellGroupIndication_r15

      buffer.getContext().eventDispatcher.startElement("cellGroupIndication_r15", -1);

      {
         int tval = FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15.decodeEnumValue (buffer);
         cellGroupIndication_r15 = FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cellGroupIndication_r15", -1);

      // decode logicalChannelIdentity_r15

      if (logicalChannelIdentity_r15Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelIdentity_r15", -1);

         logicalChannelIdentity_r15 = new Asn1Integer();
         logicalChannelIdentity_r15.decode (buffer, 1, 10);

         buffer.invokeCharacters(logicalChannelIdentity_r15.toString());
         buffer.getContext().eventDispatcher.endElement("logicalChannelIdentity_r15", -1);
      }
      else {
         logicalChannelIdentity_r15 = null;
      }

      // decode logicalChannelIdentityExt_r15

      if (logicalChannelIdentityExt_r15Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelIdentityExt_r15", -1);

         logicalChannelIdentityExt_r15 = new Asn1Integer();
         logicalChannelIdentityExt_r15.decode (buffer, 32, 38);

         buffer.invokeCharacters(logicalChannelIdentityExt_r15.toString());
         buffer.getContext().eventDispatcher.endElement("logicalChannelIdentityExt_r15", -1);
      }
      else {
         logicalChannelIdentityExt_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellGroupIndication_r15 != null) cellGroupIndication_r15.print (_sb, "cellGroupIndication_r15", _level+1);
      if (logicalChannelIdentity_r15 != null) logicalChannelIdentity_r15.print (_sb, "logicalChannelIdentity_r15", _level+1);
      if (logicalChannelIdentityExt_r15 != null) logicalChannelIdentityExt_r15.print (_sb, "logicalChannelIdentityExt_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
