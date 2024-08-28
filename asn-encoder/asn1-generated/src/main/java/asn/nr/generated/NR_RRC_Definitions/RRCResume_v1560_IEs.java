/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCResume_v1560_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCResume-v1560-IEs";
   }

   public RadioBearerConfig radioBearerConfig2;  // optional
   public SK_Counter sk_Counter;  // optional
   public RRCResume_v1610_IEs nonCriticalExtension;  // optional

   public RRCResume_v1560_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCResume_v1560_IEs (
      RadioBearerConfig radioBearerConfig2_,
      SK_Counter sk_Counter_,
      RRCResume_v1610_IEs nonCriticalExtension_
   ) {
      super();
      radioBearerConfig2 = radioBearerConfig2_;
      sk_Counter = sk_Counter_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RRCResume_v1560_IEs (RadioBearerConfig radioBearerConfig2_,
      long sk_Counter_,
      RRCResume_v1610_IEs nonCriticalExtension_
   ) {
      super();
      radioBearerConfig2 = radioBearerConfig2_;
      sk_Counter = new SK_Counter (sk_Counter_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      radioBearerConfig2 = null;
      sk_Counter = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return radioBearerConfig2;
         case 1: return sk_Counter;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "radioBearerConfig2";
         case 1: return "sk-Counter";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean radioBearerConfig2Present = buffer.decodeBit ("radioBearerConfig2Present");
      boolean sk_CounterPresent = buffer.decodeBit ("sk_CounterPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode radioBearerConfig2

      if (radioBearerConfig2Present) {
         buffer.getContext().eventDispatcher.startElement("radioBearerConfig2", -1);

         Asn1OctetString radioBearerConfig2_outer = new Asn1OctetString();
         radioBearerConfig2_outer.decode (buffer);
         if (radioBearerConfig2_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( radioBearerConfig2_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         radioBearerConfig2 = new RadioBearerConfig();
         radioBearerConfig2.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("radioBearerConfig2", -1);
      }
      else {
         radioBearerConfig2 = null;
      }

      // decode sk_Counter

      if (sk_CounterPresent) {
         buffer.getContext().eventDispatcher.startElement("sk_Counter", -1);

         sk_Counter = new SK_Counter();
         sk_Counter.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sk_Counter", -1);
      }
      else {
         sk_Counter = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCResume_v1610_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((radioBearerConfig2 != null), null);
      buffer.encodeBit ((sk_Counter != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode radioBearerConfig2

      if (radioBearerConfig2 != null) {
         buffer.getContext().eventDispatcher.startElement("radioBearerConfig2", -1);

         Asn1OctetString radioBearerConfig2_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            radioBearerConfig2.encode (buffer);
            radioBearerConfig2_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         radioBearerConfig2_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("radioBearerConfig2", -1);
      }

      // encode sk_Counter

      if (sk_Counter != null) {
         buffer.getContext().eventDispatcher.startElement("sk_Counter", -1);

         sk_Counter.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sk_Counter", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (radioBearerConfig2 != null) radioBearerConfig2.print (_sb, "radioBearerConfig2", _level+1);
      if (sk_Counter != null) sk_Counter.print (_sb, "sk_Counter", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
