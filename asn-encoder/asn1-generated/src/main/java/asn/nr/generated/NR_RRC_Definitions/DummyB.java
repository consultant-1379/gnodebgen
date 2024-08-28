/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyB extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DummyB";
   }

   public DummyB_maxNumberTxPortsPerResource maxNumberTxPortsPerResource = null;
   public Asn1Integer maxNumberResources;
   public Asn1Integer totalNumberTxPorts;
   public DummyB_supportedCodebookMode supportedCodebookMode = null;
   public Asn1Integer maxNumberCSI_RS_PerResourceSet;

   public DummyB () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DummyB (
      DummyB_maxNumberTxPortsPerResource maxNumberTxPortsPerResource_,
      Asn1Integer maxNumberResources_,
      Asn1Integer totalNumberTxPorts_,
      DummyB_supportedCodebookMode supportedCodebookMode_,
      Asn1Integer maxNumberCSI_RS_PerResourceSet_
   ) {
      super();
      maxNumberTxPortsPerResource = maxNumberTxPortsPerResource_;
      maxNumberResources = maxNumberResources_;
      totalNumberTxPorts = totalNumberTxPorts_;
      supportedCodebookMode = supportedCodebookMode_;
      maxNumberCSI_RS_PerResourceSet = maxNumberCSI_RS_PerResourceSet_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DummyB (DummyB_maxNumberTxPortsPerResource maxNumberTxPortsPerResource_,
      long maxNumberResources_,
      long totalNumberTxPorts_,
      DummyB_supportedCodebookMode supportedCodebookMode_,
      long maxNumberCSI_RS_PerResourceSet_
   ) {
      super();
      maxNumberTxPortsPerResource = maxNumberTxPortsPerResource_;
      maxNumberResources = new Asn1Integer (maxNumberResources_);
      totalNumberTxPorts = new Asn1Integer (totalNumberTxPorts_);
      supportedCodebookMode = supportedCodebookMode_;
      maxNumberCSI_RS_PerResourceSet = new Asn1Integer (maxNumberCSI_RS_PerResourceSet_);
   }

   public void init () {
      maxNumberTxPortsPerResource = null;
      maxNumberResources = null;
      totalNumberTxPorts = null;
      supportedCodebookMode = null;
      maxNumberCSI_RS_PerResourceSet = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberTxPortsPerResource;
         case 1: return maxNumberResources;
         case 2: return totalNumberTxPorts;
         case 3: return supportedCodebookMode;
         case 4: return maxNumberCSI_RS_PerResourceSet;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberTxPortsPerResource";
         case 1: return "maxNumberResources";
         case 2: return "totalNumberTxPorts";
         case 3: return "supportedCodebookMode";
         case 4: return "maxNumberCSI-RS-PerResourceSet";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberTxPortsPerResource

      buffer.getContext().eventDispatcher.startElement("maxNumberTxPortsPerResource", -1);

      {
         int tval = DummyB_maxNumberTxPortsPerResource.decodeEnumValue (buffer);
         maxNumberTxPortsPerResource = DummyB_maxNumberTxPortsPerResource.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberTxPortsPerResource", -1);

      // decode maxNumberResources

      buffer.getContext().eventDispatcher.startElement("maxNumberResources", -1);

      maxNumberResources = new Asn1Integer();
      maxNumberResources.decode (buffer, 1, 64);

      buffer.invokeCharacters(maxNumberResources.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberResources", -1);

      // decode totalNumberTxPorts

      buffer.getContext().eventDispatcher.startElement("totalNumberTxPorts", -1);

      totalNumberTxPorts = new Asn1Integer();
      totalNumberTxPorts.decode (buffer, 2, 256);

      buffer.invokeCharacters(totalNumberTxPorts.toString());
      buffer.getContext().eventDispatcher.endElement("totalNumberTxPorts", -1);

      // decode supportedCodebookMode

      buffer.getContext().eventDispatcher.startElement("supportedCodebookMode", -1);

      {
         int tval = DummyB_supportedCodebookMode.decodeEnumValue (buffer);
         supportedCodebookMode = DummyB_supportedCodebookMode.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportedCodebookMode", -1);

      // decode maxNumberCSI_RS_PerResourceSet

      buffer.getContext().eventDispatcher.startElement("maxNumberCSI_RS_PerResourceSet", -1);

      maxNumberCSI_RS_PerResourceSet = new Asn1Integer();
      maxNumberCSI_RS_PerResourceSet.decode (buffer, 1, 8);

      buffer.invokeCharacters(maxNumberCSI_RS_PerResourceSet.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberCSI_RS_PerResourceSet", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberTxPortsPerResource

      if (maxNumberTxPortsPerResource != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberTxPortsPerResource", -1);

         maxNumberTxPortsPerResource.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberTxPortsPerResource", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberTxPortsPerResource");

      // encode maxNumberResources

      if (maxNumberResources != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberResources", -1);

         maxNumberResources.encode (buffer, 1, 64);

         buffer.getContext().eventDispatcher.endElement("maxNumberResources", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberResources");

      // encode totalNumberTxPorts

      if (totalNumberTxPorts != null) {
         buffer.getContext().eventDispatcher.startElement("totalNumberTxPorts", -1);

         totalNumberTxPorts.encode (buffer, 2, 256);

         buffer.getContext().eventDispatcher.endElement("totalNumberTxPorts", -1);
      }
      else throw new Asn1MissingRequiredException ("totalNumberTxPorts");

      // encode supportedCodebookMode

      if (supportedCodebookMode != null) {
         buffer.getContext().eventDispatcher.startElement("supportedCodebookMode", -1);

         supportedCodebookMode.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedCodebookMode", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedCodebookMode");

      // encode maxNumberCSI_RS_PerResourceSet

      if (maxNumberCSI_RS_PerResourceSet != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberCSI_RS_PerResourceSet", -1);

         maxNumberCSI_RS_PerResourceSet.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("maxNumberCSI_RS_PerResourceSet", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberCSI_RS_PerResourceSet");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberTxPortsPerResource != null) maxNumberTxPortsPerResource.print (_sb, "maxNumberTxPortsPerResource", _level+1);
      if (maxNumberResources != null) maxNumberResources.print (_sb, "maxNumberResources", _level+1);
      if (totalNumberTxPorts != null) totalNumberTxPorts.print (_sb, "totalNumberTxPorts", _level+1);
      if (supportedCodebookMode != null) supportedCodebookMode.print (_sb, "supportedCodebookMode", _level+1);
      if (maxNumberCSI_RS_PerResourceSet != null) maxNumberCSI_RS_PerResourceSet.print (_sb, "maxNumberCSI_RS_PerResourceSet", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
