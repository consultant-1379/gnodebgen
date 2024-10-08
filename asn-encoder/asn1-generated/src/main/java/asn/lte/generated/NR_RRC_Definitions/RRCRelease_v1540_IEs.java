/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCRelease_v1540_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCRelease-v1540-IEs";
   }

   public RejectWaitTime waitTime;  // optional
   public RRCRelease_v1610_IEs nonCriticalExtension;  // optional

   public RRCRelease_v1540_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCRelease_v1540_IEs (
      RejectWaitTime waitTime_,
      RRCRelease_v1610_IEs nonCriticalExtension_
   ) {
      super();
      waitTime = waitTime_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCRelease_v1540_IEs (long waitTime_,
      RRCRelease_v1610_IEs nonCriticalExtension_
   ) {
      super();
      waitTime = new RejectWaitTime (waitTime_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      waitTime = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return waitTime;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "waitTime";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean waitTimePresent = buffer.decodeBit ("waitTimePresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode waitTime

      if (waitTimePresent) {
         buffer.getContext().eventDispatcher.startElement("waitTime", -1);

         waitTime = new RejectWaitTime();
         waitTime.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("waitTime", -1);
      }
      else {
         waitTime = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCRelease_v1610_IEs();
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
      if (waitTime != null) waitTime.print (_sb, "waitTime", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
