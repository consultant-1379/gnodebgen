/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionSetup_NB_r13_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionSetup-NB-r13-IEs";
   }

   public RadioResourceConfigDedicated_NB_r13 radioResourceConfigDedicated_r13;
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public RRCConnectionSetup_NB_r13_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCConnectionSetup_NB_r13_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionSetup_NB_r13_IEs (
      RadioResourceConfigDedicated_NB_r13 radioResourceConfigDedicated_r13_,
      Asn1OctetString lateNonCriticalExtension_,
      RRCConnectionSetup_NB_r13_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      radioResourceConfigDedicated_r13 = radioResourceConfigDedicated_r13_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RRCConnectionSetup_NB_r13_IEs (
      RadioResourceConfigDedicated_NB_r13 radioResourceConfigDedicated_r13_
   ) {
      super();
      radioResourceConfigDedicated_r13 = radioResourceConfigDedicated_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCConnectionSetup_NB_r13_IEs (RadioResourceConfigDedicated_NB_r13 radioResourceConfigDedicated_r13_,
      byte[] lateNonCriticalExtension_,
      RRCConnectionSetup_NB_r13_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      radioResourceConfigDedicated_r13 = radioResourceConfigDedicated_r13_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      radioResourceConfigDedicated_r13 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return radioResourceConfigDedicated_r13;
         case 1: return lateNonCriticalExtension;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "radioResourceConfigDedicated-r13";
         case 1: return "lateNonCriticalExtension";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode radioResourceConfigDedicated_r13

      buffer.getContext().eventDispatcher.startElement("radioResourceConfigDedicated_r13", -1);

      radioResourceConfigDedicated_r13 = new RadioResourceConfigDedicated_NB_r13();
      radioResourceConfigDedicated_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("radioResourceConfigDedicated_r13", -1);

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionSetup_NB_r13_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (radioResourceConfigDedicated_r13 != null) radioResourceConfigDedicated_r13.print (_sb, "radioResourceConfigDedicated_r13", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
