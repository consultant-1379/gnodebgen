/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class UERadioAccessCapabilityInformation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UERadioAccessCapabilityInformation";
   }

   public UERadioAccessCapabilityInformation_criticalExtensions criticalExtensions;

   public UERadioAccessCapabilityInformation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UERadioAccessCapabilityInformation (
      UERadioAccessCapabilityInformation_criticalExtensions criticalExtensions_
   ) {
      super();
      criticalExtensions = criticalExtensions_;
   }

   public void init () {
      criticalExtensions = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return criticalExtensions;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "criticalExtensions";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode criticalExtensions

      buffer.getContext().eventDispatcher.startElement("criticalExtensions", -1);

      criticalExtensions = new UERadioAccessCapabilityInformation_criticalExtensions();
      criticalExtensions.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("criticalExtensions", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode criticalExtensions

      if (criticalExtensions != null) {
         buffer.getContext().eventDispatcher.startElement("criticalExtensions", -1);

         criticalExtensions.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("criticalExtensions", -1);
      }
      else throw new Asn1MissingRequiredException ("criticalExtensions");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (criticalExtensions != null) criticalExtensions.print (_sb, "criticalExtensions", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
