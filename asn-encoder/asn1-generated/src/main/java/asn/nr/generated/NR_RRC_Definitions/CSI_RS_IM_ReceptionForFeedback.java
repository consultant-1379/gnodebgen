/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_IM_ReceptionForFeedback extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-IM-ReceptionForFeedback";
   }

   public Asn1Integer maxConfigNumberNZP_CSI_RS_PerCC;
   public Asn1Integer maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC;
   public CSI_RS_IM_ReceptionForFeedback_maxConfigNumberCSI_IM_PerCC maxConfigNumberCSI_IM_PerCC = null;
   public Asn1Integer maxNumberSimultaneousNZP_CSI_RS_PerCC;
   public Asn1Integer totalNumberPortsSimultaneousNZP_CSI_RS_PerCC;

   public CSI_RS_IM_ReceptionForFeedback () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_IM_ReceptionForFeedback (
      Asn1Integer maxConfigNumberNZP_CSI_RS_PerCC_,
      Asn1Integer maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC_,
      CSI_RS_IM_ReceptionForFeedback_maxConfigNumberCSI_IM_PerCC maxConfigNumberCSI_IM_PerCC_,
      Asn1Integer maxNumberSimultaneousNZP_CSI_RS_PerCC_,
      Asn1Integer totalNumberPortsSimultaneousNZP_CSI_RS_PerCC_
   ) {
      super();
      maxConfigNumberNZP_CSI_RS_PerCC = maxConfigNumberNZP_CSI_RS_PerCC_;
      maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC = maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC_;
      maxConfigNumberCSI_IM_PerCC = maxConfigNumberCSI_IM_PerCC_;
      maxNumberSimultaneousNZP_CSI_RS_PerCC = maxNumberSimultaneousNZP_CSI_RS_PerCC_;
      totalNumberPortsSimultaneousNZP_CSI_RS_PerCC = totalNumberPortsSimultaneousNZP_CSI_RS_PerCC_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_RS_IM_ReceptionForFeedback (long maxConfigNumberNZP_CSI_RS_PerCC_,
      long maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC_,
      CSI_RS_IM_ReceptionForFeedback_maxConfigNumberCSI_IM_PerCC maxConfigNumberCSI_IM_PerCC_,
      long maxNumberSimultaneousNZP_CSI_RS_PerCC_,
      long totalNumberPortsSimultaneousNZP_CSI_RS_PerCC_
   ) {
      super();
      maxConfigNumberNZP_CSI_RS_PerCC = new Asn1Integer (maxConfigNumberNZP_CSI_RS_PerCC_);
      maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC = new Asn1Integer (maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC_);
      maxConfigNumberCSI_IM_PerCC = maxConfigNumberCSI_IM_PerCC_;
      maxNumberSimultaneousNZP_CSI_RS_PerCC = new Asn1Integer (maxNumberSimultaneousNZP_CSI_RS_PerCC_);
      totalNumberPortsSimultaneousNZP_CSI_RS_PerCC = new Asn1Integer (totalNumberPortsSimultaneousNZP_CSI_RS_PerCC_);
   }

   public void init () {
      maxConfigNumberNZP_CSI_RS_PerCC = null;
      maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC = null;
      maxConfigNumberCSI_IM_PerCC = null;
      maxNumberSimultaneousNZP_CSI_RS_PerCC = null;
      totalNumberPortsSimultaneousNZP_CSI_RS_PerCC = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxConfigNumberNZP_CSI_RS_PerCC;
         case 1: return maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC;
         case 2: return maxConfigNumberCSI_IM_PerCC;
         case 3: return maxNumberSimultaneousNZP_CSI_RS_PerCC;
         case 4: return totalNumberPortsSimultaneousNZP_CSI_RS_PerCC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxConfigNumberNZP-CSI-RS-PerCC";
         case 1: return "maxConfigNumberPortsAcrossNZP-CSI-RS-PerCC";
         case 2: return "maxConfigNumberCSI-IM-PerCC";
         case 3: return "maxNumberSimultaneousNZP-CSI-RS-PerCC";
         case 4: return "totalNumberPortsSimultaneousNZP-CSI-RS-PerCC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxConfigNumberNZP_CSI_RS_PerCC

      buffer.getContext().eventDispatcher.startElement("maxConfigNumberNZP_CSI_RS_PerCC", -1);

      maxConfigNumberNZP_CSI_RS_PerCC = new Asn1Integer();
      maxConfigNumberNZP_CSI_RS_PerCC.decode (buffer, 1, 64);

      buffer.invokeCharacters(maxConfigNumberNZP_CSI_RS_PerCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxConfigNumberNZP_CSI_RS_PerCC", -1);

      // decode maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC

      buffer.getContext().eventDispatcher.startElement("maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC", -1);

      maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC = new Asn1Integer();
      maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC.decode (buffer, 2, 256);

      buffer.invokeCharacters(maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC", -1);

      // decode maxConfigNumberCSI_IM_PerCC

      buffer.getContext().eventDispatcher.startElement("maxConfigNumberCSI_IM_PerCC", -1);

      {
         int tval = CSI_RS_IM_ReceptionForFeedback_maxConfigNumberCSI_IM_PerCC.decodeEnumValue (buffer);
         maxConfigNumberCSI_IM_PerCC = CSI_RS_IM_ReceptionForFeedback_maxConfigNumberCSI_IM_PerCC.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxConfigNumberCSI_IM_PerCC", -1);

      // decode maxNumberSimultaneousNZP_CSI_RS_PerCC

      buffer.getContext().eventDispatcher.startElement("maxNumberSimultaneousNZP_CSI_RS_PerCC", -1);

      maxNumberSimultaneousNZP_CSI_RS_PerCC = new Asn1Integer();
      maxNumberSimultaneousNZP_CSI_RS_PerCC.decode (buffer, 1, 64);

      buffer.invokeCharacters(maxNumberSimultaneousNZP_CSI_RS_PerCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberSimultaneousNZP_CSI_RS_PerCC", -1);

      // decode totalNumberPortsSimultaneousNZP_CSI_RS_PerCC

      buffer.getContext().eventDispatcher.startElement("totalNumberPortsSimultaneousNZP_CSI_RS_PerCC", -1);

      totalNumberPortsSimultaneousNZP_CSI_RS_PerCC = new Asn1Integer();
      totalNumberPortsSimultaneousNZP_CSI_RS_PerCC.decode (buffer, 2, 256);

      buffer.invokeCharacters(totalNumberPortsSimultaneousNZP_CSI_RS_PerCC.toString());
      buffer.getContext().eventDispatcher.endElement("totalNumberPortsSimultaneousNZP_CSI_RS_PerCC", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxConfigNumberNZP_CSI_RS_PerCC

      if (maxConfigNumberNZP_CSI_RS_PerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxConfigNumberNZP_CSI_RS_PerCC", -1);

         maxConfigNumberNZP_CSI_RS_PerCC.encode (buffer, 1, 64);

         buffer.getContext().eventDispatcher.endElement("maxConfigNumberNZP_CSI_RS_PerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxConfigNumberNZP_CSI_RS_PerCC");

      // encode maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC

      if (maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC", -1);

         maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC.encode (buffer, 2, 256);

         buffer.getContext().eventDispatcher.endElement("maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC");

      // encode maxConfigNumberCSI_IM_PerCC

      if (maxConfigNumberCSI_IM_PerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxConfigNumberCSI_IM_PerCC", -1);

         maxConfigNumberCSI_IM_PerCC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxConfigNumberCSI_IM_PerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxConfigNumberCSI_IM_PerCC");

      // encode maxNumberSimultaneousNZP_CSI_RS_PerCC

      if (maxNumberSimultaneousNZP_CSI_RS_PerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSimultaneousNZP_CSI_RS_PerCC", -1);

         maxNumberSimultaneousNZP_CSI_RS_PerCC.encode (buffer, 1, 64);

         buffer.getContext().eventDispatcher.endElement("maxNumberSimultaneousNZP_CSI_RS_PerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSimultaneousNZP_CSI_RS_PerCC");

      // encode totalNumberPortsSimultaneousNZP_CSI_RS_PerCC

      if (totalNumberPortsSimultaneousNZP_CSI_RS_PerCC != null) {
         buffer.getContext().eventDispatcher.startElement("totalNumberPortsSimultaneousNZP_CSI_RS_PerCC", -1);

         totalNumberPortsSimultaneousNZP_CSI_RS_PerCC.encode (buffer, 2, 256);

         buffer.getContext().eventDispatcher.endElement("totalNumberPortsSimultaneousNZP_CSI_RS_PerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("totalNumberPortsSimultaneousNZP_CSI_RS_PerCC");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxConfigNumberNZP_CSI_RS_PerCC != null) maxConfigNumberNZP_CSI_RS_PerCC.print (_sb, "maxConfigNumberNZP_CSI_RS_PerCC", _level+1);
      if (maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC != null) maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC.print (_sb, "maxConfigNumberPortsAcrossNZP_CSI_RS_PerCC", _level+1);
      if (maxConfigNumberCSI_IM_PerCC != null) maxConfigNumberCSI_IM_PerCC.print (_sb, "maxConfigNumberCSI_IM_PerCC", _level+1);
      if (maxNumberSimultaneousNZP_CSI_RS_PerCC != null) maxNumberSimultaneousNZP_CSI_RS_PerCC.print (_sb, "maxNumberSimultaneousNZP_CSI_RS_PerCC", _level+1);
      if (totalNumberPortsSimultaneousNZP_CSI_RS_PerCC != null) totalNumberPortsSimultaneousNZP_CSI_RS_PerCC.print (_sb, "totalNumberPortsSimultaneousNZP_CSI_RS_PerCC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
