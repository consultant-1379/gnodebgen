/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class TraceActivation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TraceActivation";
   }

   public EUTRANTraceID eUTRANTraceID;
   public InterfacesToTrace interfacesToTrace;
   public TraceDepth traceDepth = null;
   public TraceCollectionEntityIPAddress traceCollectionEntityIPAddress;
   public TraceActivation_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public TraceActivation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TraceActivation (
      EUTRANTraceID eUTRANTraceID_,
      InterfacesToTrace interfacesToTrace_,
      TraceDepth traceDepth_,
      TraceCollectionEntityIPAddress traceCollectionEntityIPAddress_,
      TraceActivation_iE_Extensions iE_Extensions_
   ) {
      super();
      eUTRANTraceID = eUTRANTraceID_;
      interfacesToTrace = interfacesToTrace_;
      traceDepth = traceDepth_;
      traceCollectionEntityIPAddress = traceCollectionEntityIPAddress_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public TraceActivation (
      EUTRANTraceID eUTRANTraceID_,
      InterfacesToTrace interfacesToTrace_,
      TraceDepth traceDepth_,
      TraceCollectionEntityIPAddress traceCollectionEntityIPAddress_
   ) {
      super();
      eUTRANTraceID = eUTRANTraceID_;
      interfacesToTrace = interfacesToTrace_;
      traceDepth = traceDepth_;
      traceCollectionEntityIPAddress = traceCollectionEntityIPAddress_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TraceActivation (byte[] eUTRANTraceID_,
      InterfacesToTrace interfacesToTrace_,
      TraceDepth traceDepth_,
      TraceCollectionEntityIPAddress traceCollectionEntityIPAddress_,
      TraceActivation_iE_Extensions iE_Extensions_
   ) {
      super();
      eUTRANTraceID = new EUTRANTraceID (eUTRANTraceID_);
      interfacesToTrace = interfacesToTrace_;
      traceDepth = traceDepth_;
      traceCollectionEntityIPAddress = traceCollectionEntityIPAddress_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public TraceActivation (
      byte[] eUTRANTraceID_,
      InterfacesToTrace interfacesToTrace_,
      TraceDepth traceDepth_,
      TraceCollectionEntityIPAddress traceCollectionEntityIPAddress_
   ) {
      super();
      eUTRANTraceID = new EUTRANTraceID (eUTRANTraceID_);
      interfacesToTrace = interfacesToTrace_;
      traceDepth = traceDepth_;
      traceCollectionEntityIPAddress = traceCollectionEntityIPAddress_;
   }

   public void init () {
      eUTRANTraceID = null;
      interfacesToTrace = null;
      traceDepth = null;
      traceCollectionEntityIPAddress = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eUTRANTraceID;
         case 1: return interfacesToTrace;
         case 2: return traceDepth;
         case 3: return traceCollectionEntityIPAddress;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eUTRANTraceID";
         case 1: return "interfacesToTrace";
         case 2: return "traceDepth";
         case 3: return "traceCollectionEntityIPAddress";
         case 4: return "iE-Extensions";
         case 5: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode eUTRANTraceID

      buffer.getContext().eventDispatcher.startElement("eUTRANTraceID", -1);

      eUTRANTraceID = new EUTRANTraceID();
      eUTRANTraceID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eUTRANTraceID", -1);

      // decode interfacesToTrace

      buffer.getContext().eventDispatcher.startElement("interfacesToTrace", -1);

      interfacesToTrace = new InterfacesToTrace();
      interfacesToTrace.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("interfacesToTrace", -1);

      // decode traceDepth

      buffer.getContext().eventDispatcher.startElement("traceDepth", -1);

      {
         int tval = TraceDepth.decodeEnumValue (buffer);
         traceDepth = TraceDepth.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("traceDepth", -1);

      // decode traceCollectionEntityIPAddress

      buffer.getContext().eventDispatcher.startElement("traceCollectionEntityIPAddress", -1);

      traceCollectionEntityIPAddress = new TraceCollectionEntityIPAddress();
      traceCollectionEntityIPAddress.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("traceCollectionEntityIPAddress", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new TraceActivation_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eUTRANTraceID != null) eUTRANTraceID.print (_sb, "eUTRANTraceID", _level+1);
      if (interfacesToTrace != null) interfacesToTrace.print (_sb, "interfacesToTrace", _level+1);
      if (traceDepth != null) traceDepth.print (_sb, "traceDepth", _level+1);
      if (traceCollectionEntityIPAddress != null) traceCollectionEntityIPAddress.print (_sb, "traceCollectionEntityIPAddress", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
