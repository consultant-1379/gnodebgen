/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_ForTracking extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-ForTracking";
   }

   public Asn1Integer maxBurstLength;
   public Asn1Integer maxSimultaneousResourceSetsPerCC;
   public Asn1Integer maxConfiguredResourceSetsPerCC;
   public Asn1Integer maxConfiguredResourceSetsAllCC;

   public CSI_RS_ForTracking () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_ForTracking (
      Asn1Integer maxBurstLength_,
      Asn1Integer maxSimultaneousResourceSetsPerCC_,
      Asn1Integer maxConfiguredResourceSetsPerCC_,
      Asn1Integer maxConfiguredResourceSetsAllCC_
   ) {
      super();
      maxBurstLength = maxBurstLength_;
      maxSimultaneousResourceSetsPerCC = maxSimultaneousResourceSetsPerCC_;
      maxConfiguredResourceSetsPerCC = maxConfiguredResourceSetsPerCC_;
      maxConfiguredResourceSetsAllCC = maxConfiguredResourceSetsAllCC_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_RS_ForTracking (long maxBurstLength_,
      long maxSimultaneousResourceSetsPerCC_,
      long maxConfiguredResourceSetsPerCC_,
      long maxConfiguredResourceSetsAllCC_
   ) {
      super();
      maxBurstLength = new Asn1Integer (maxBurstLength_);
      maxSimultaneousResourceSetsPerCC = new Asn1Integer (maxSimultaneousResourceSetsPerCC_);
      maxConfiguredResourceSetsPerCC = new Asn1Integer (maxConfiguredResourceSetsPerCC_);
      maxConfiguredResourceSetsAllCC = new Asn1Integer (maxConfiguredResourceSetsAllCC_);
   }

   public void init () {
      maxBurstLength = null;
      maxSimultaneousResourceSetsPerCC = null;
      maxConfiguredResourceSetsPerCC = null;
      maxConfiguredResourceSetsAllCC = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxBurstLength;
         case 1: return maxSimultaneousResourceSetsPerCC;
         case 2: return maxConfiguredResourceSetsPerCC;
         case 3: return maxConfiguredResourceSetsAllCC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxBurstLength";
         case 1: return "maxSimultaneousResourceSetsPerCC";
         case 2: return "maxConfiguredResourceSetsPerCC";
         case 3: return "maxConfiguredResourceSetsAllCC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxBurstLength

      buffer.getContext().eventDispatcher.startElement("maxBurstLength", -1);

      maxBurstLength = new Asn1Integer();
      maxBurstLength.decode (buffer, 1, 2);

      buffer.invokeCharacters(maxBurstLength.toString());
      buffer.getContext().eventDispatcher.endElement("maxBurstLength", -1);

      // decode maxSimultaneousResourceSetsPerCC

      buffer.getContext().eventDispatcher.startElement("maxSimultaneousResourceSetsPerCC", -1);

      maxSimultaneousResourceSetsPerCC = new Asn1Integer();
      maxSimultaneousResourceSetsPerCC.decode (buffer, 1, 8);

      buffer.invokeCharacters(maxSimultaneousResourceSetsPerCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxSimultaneousResourceSetsPerCC", -1);

      // decode maxConfiguredResourceSetsPerCC

      buffer.getContext().eventDispatcher.startElement("maxConfiguredResourceSetsPerCC", -1);

      maxConfiguredResourceSetsPerCC = new Asn1Integer();
      maxConfiguredResourceSetsPerCC.decode (buffer, 1, 64);

      buffer.invokeCharacters(maxConfiguredResourceSetsPerCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxConfiguredResourceSetsPerCC", -1);

      // decode maxConfiguredResourceSetsAllCC

      buffer.getContext().eventDispatcher.startElement("maxConfiguredResourceSetsAllCC", -1);

      maxConfiguredResourceSetsAllCC = new Asn1Integer();
      maxConfiguredResourceSetsAllCC.decode (buffer, 1, 256);

      buffer.invokeCharacters(maxConfiguredResourceSetsAllCC.toString());
      buffer.getContext().eventDispatcher.endElement("maxConfiguredResourceSetsAllCC", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxBurstLength

      if (maxBurstLength != null) {
         buffer.getContext().eventDispatcher.startElement("maxBurstLength", -1);

         maxBurstLength.encode (buffer, 1, 2);

         buffer.getContext().eventDispatcher.endElement("maxBurstLength", -1);
      }
      else throw new Asn1MissingRequiredException ("maxBurstLength");

      // encode maxSimultaneousResourceSetsPerCC

      if (maxSimultaneousResourceSetsPerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxSimultaneousResourceSetsPerCC", -1);

         maxSimultaneousResourceSetsPerCC.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("maxSimultaneousResourceSetsPerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxSimultaneousResourceSetsPerCC");

      // encode maxConfiguredResourceSetsPerCC

      if (maxConfiguredResourceSetsPerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxConfiguredResourceSetsPerCC", -1);

         maxConfiguredResourceSetsPerCC.encode (buffer, 1, 64);

         buffer.getContext().eventDispatcher.endElement("maxConfiguredResourceSetsPerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxConfiguredResourceSetsPerCC");

      // encode maxConfiguredResourceSetsAllCC

      if (maxConfiguredResourceSetsAllCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxConfiguredResourceSetsAllCC", -1);

         maxConfiguredResourceSetsAllCC.encode (buffer, 1, 256);

         buffer.getContext().eventDispatcher.endElement("maxConfiguredResourceSetsAllCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxConfiguredResourceSetsAllCC");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxBurstLength != null) maxBurstLength.print (_sb, "maxBurstLength", _level+1);
      if (maxSimultaneousResourceSetsPerCC != null) maxSimultaneousResourceSetsPerCC.print (_sb, "maxSimultaneousResourceSetsPerCC", _level+1);
      if (maxConfiguredResourceSetsPerCC != null) maxConfiguredResourceSetsPerCC.print (_sb, "maxConfiguredResourceSetsPerCC", _level+1);
      if (maxConfiguredResourceSetsAllCC != null) maxConfiguredResourceSetsAllCC.print (_sb, "maxConfiguredResourceSetsAllCC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
