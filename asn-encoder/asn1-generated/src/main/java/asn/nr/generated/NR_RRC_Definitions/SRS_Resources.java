/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Resources extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-Resources";
   }

   public SRS_Resources_maxNumberAperiodicSRS_PerBWP maxNumberAperiodicSRS_PerBWP = null;
   public Asn1Integer maxNumberAperiodicSRS_PerBWP_PerSlot;
   public SRS_Resources_maxNumberPeriodicSRS_PerBWP maxNumberPeriodicSRS_PerBWP = null;
   public Asn1Integer maxNumberPeriodicSRS_PerBWP_PerSlot;
   public SRS_Resources_maxNumberSemiPersistentSRS_PerBWP maxNumberSemiPersistentSRS_PerBWP = null;
   public Asn1Integer maxNumberSemiPersistentSRS_PerBWP_PerSlot;
   public SRS_Resources_maxNumberSRS_Ports_PerResource maxNumberSRS_Ports_PerResource = null;

   public SRS_Resources () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_Resources (
      SRS_Resources_maxNumberAperiodicSRS_PerBWP maxNumberAperiodicSRS_PerBWP_,
      Asn1Integer maxNumberAperiodicSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberPeriodicSRS_PerBWP maxNumberPeriodicSRS_PerBWP_,
      Asn1Integer maxNumberPeriodicSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberSemiPersistentSRS_PerBWP maxNumberSemiPersistentSRS_PerBWP_,
      Asn1Integer maxNumberSemiPersistentSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberSRS_Ports_PerResource maxNumberSRS_Ports_PerResource_
   ) {
      super();
      maxNumberAperiodicSRS_PerBWP = maxNumberAperiodicSRS_PerBWP_;
      maxNumberAperiodicSRS_PerBWP_PerSlot = maxNumberAperiodicSRS_PerBWP_PerSlot_;
      maxNumberPeriodicSRS_PerBWP = maxNumberPeriodicSRS_PerBWP_;
      maxNumberPeriodicSRS_PerBWP_PerSlot = maxNumberPeriodicSRS_PerBWP_PerSlot_;
      maxNumberSemiPersistentSRS_PerBWP = maxNumberSemiPersistentSRS_PerBWP_;
      maxNumberSemiPersistentSRS_PerBWP_PerSlot = maxNumberSemiPersistentSRS_PerBWP_PerSlot_;
      maxNumberSRS_Ports_PerResource = maxNumberSRS_Ports_PerResource_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_Resources (SRS_Resources_maxNumberAperiodicSRS_PerBWP maxNumberAperiodicSRS_PerBWP_,
      long maxNumberAperiodicSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberPeriodicSRS_PerBWP maxNumberPeriodicSRS_PerBWP_,
      long maxNumberPeriodicSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberSemiPersistentSRS_PerBWP maxNumberSemiPersistentSRS_PerBWP_,
      long maxNumberSemiPersistentSRS_PerBWP_PerSlot_,
      SRS_Resources_maxNumberSRS_Ports_PerResource maxNumberSRS_Ports_PerResource_
   ) {
      super();
      maxNumberAperiodicSRS_PerBWP = maxNumberAperiodicSRS_PerBWP_;
      maxNumberAperiodicSRS_PerBWP_PerSlot = new Asn1Integer (maxNumberAperiodicSRS_PerBWP_PerSlot_);
      maxNumberPeriodicSRS_PerBWP = maxNumberPeriodicSRS_PerBWP_;
      maxNumberPeriodicSRS_PerBWP_PerSlot = new Asn1Integer (maxNumberPeriodicSRS_PerBWP_PerSlot_);
      maxNumberSemiPersistentSRS_PerBWP = maxNumberSemiPersistentSRS_PerBWP_;
      maxNumberSemiPersistentSRS_PerBWP_PerSlot = new Asn1Integer (maxNumberSemiPersistentSRS_PerBWP_PerSlot_);
      maxNumberSRS_Ports_PerResource = maxNumberSRS_Ports_PerResource_;
   }

   public void init () {
      maxNumberAperiodicSRS_PerBWP = null;
      maxNumberAperiodicSRS_PerBWP_PerSlot = null;
      maxNumberPeriodicSRS_PerBWP = null;
      maxNumberPeriodicSRS_PerBWP_PerSlot = null;
      maxNumberSemiPersistentSRS_PerBWP = null;
      maxNumberSemiPersistentSRS_PerBWP_PerSlot = null;
      maxNumberSRS_Ports_PerResource = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberAperiodicSRS_PerBWP;
         case 1: return maxNumberAperiodicSRS_PerBWP_PerSlot;
         case 2: return maxNumberPeriodicSRS_PerBWP;
         case 3: return maxNumberPeriodicSRS_PerBWP_PerSlot;
         case 4: return maxNumberSemiPersistentSRS_PerBWP;
         case 5: return maxNumberSemiPersistentSRS_PerBWP_PerSlot;
         case 6: return maxNumberSRS_Ports_PerResource;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberAperiodicSRS-PerBWP";
         case 1: return "maxNumberAperiodicSRS-PerBWP-PerSlot";
         case 2: return "maxNumberPeriodicSRS-PerBWP";
         case 3: return "maxNumberPeriodicSRS-PerBWP-PerSlot";
         case 4: return "maxNumberSemiPersistentSRS-PerBWP";
         case 5: return "maxNumberSemiPersistentSRS-PerBWP-PerSlot";
         case 6: return "maxNumberSRS-Ports-PerResource";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberAperiodicSRS_PerBWP

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicSRS_PerBWP", -1);

      {
         int tval = SRS_Resources_maxNumberAperiodicSRS_PerBWP.decodeEnumValue (buffer);
         maxNumberAperiodicSRS_PerBWP = SRS_Resources_maxNumberAperiodicSRS_PerBWP.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicSRS_PerBWP", -1);

      // decode maxNumberAperiodicSRS_PerBWP_PerSlot

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicSRS_PerBWP_PerSlot", -1);

      maxNumberAperiodicSRS_PerBWP_PerSlot = new Asn1Integer();
      maxNumberAperiodicSRS_PerBWP_PerSlot.decode (buffer, 1, 6);

      buffer.invokeCharacters(maxNumberAperiodicSRS_PerBWP_PerSlot.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicSRS_PerBWP_PerSlot", -1);

      // decode maxNumberPeriodicSRS_PerBWP

      buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicSRS_PerBWP", -1);

      {
         int tval = SRS_Resources_maxNumberPeriodicSRS_PerBWP.decodeEnumValue (buffer);
         maxNumberPeriodicSRS_PerBWP = SRS_Resources_maxNumberPeriodicSRS_PerBWP.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicSRS_PerBWP", -1);

      // decode maxNumberPeriodicSRS_PerBWP_PerSlot

      buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicSRS_PerBWP_PerSlot", -1);

      maxNumberPeriodicSRS_PerBWP_PerSlot = new Asn1Integer();
      maxNumberPeriodicSRS_PerBWP_PerSlot.decode (buffer, 1, 6);

      buffer.invokeCharacters(maxNumberPeriodicSRS_PerBWP_PerSlot.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicSRS_PerBWP_PerSlot", -1);

      // decode maxNumberSemiPersistentSRS_PerBWP

      buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentSRS_PerBWP", -1);

      {
         int tval = SRS_Resources_maxNumberSemiPersistentSRS_PerBWP.decodeEnumValue (buffer);
         maxNumberSemiPersistentSRS_PerBWP = SRS_Resources_maxNumberSemiPersistentSRS_PerBWP.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentSRS_PerBWP", -1);

      // decode maxNumberSemiPersistentSRS_PerBWP_PerSlot

      buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentSRS_PerBWP_PerSlot", -1);

      maxNumberSemiPersistentSRS_PerBWP_PerSlot = new Asn1Integer();
      maxNumberSemiPersistentSRS_PerBWP_PerSlot.decode (buffer, 1, 6);

      buffer.invokeCharacters(maxNumberSemiPersistentSRS_PerBWP_PerSlot.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentSRS_PerBWP_PerSlot", -1);

      // decode maxNumberSRS_Ports_PerResource

      buffer.getContext().eventDispatcher.startElement("maxNumberSRS_Ports_PerResource", -1);

      {
         int tval = SRS_Resources_maxNumberSRS_Ports_PerResource.decodeEnumValue (buffer);
         maxNumberSRS_Ports_PerResource = SRS_Resources_maxNumberSRS_Ports_PerResource.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberSRS_Ports_PerResource", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberAperiodicSRS_PerBWP

      if (maxNumberAperiodicSRS_PerBWP != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicSRS_PerBWP", -1);

         maxNumberAperiodicSRS_PerBWP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicSRS_PerBWP", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberAperiodicSRS_PerBWP");

      // encode maxNumberAperiodicSRS_PerBWP_PerSlot

      if (maxNumberAperiodicSRS_PerBWP_PerSlot != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicSRS_PerBWP_PerSlot", -1);

         maxNumberAperiodicSRS_PerBWP_PerSlot.encode (buffer, 1, 6);

         buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicSRS_PerBWP_PerSlot", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberAperiodicSRS_PerBWP_PerSlot");

      // encode maxNumberPeriodicSRS_PerBWP

      if (maxNumberPeriodicSRS_PerBWP != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicSRS_PerBWP", -1);

         maxNumberPeriodicSRS_PerBWP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicSRS_PerBWP", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberPeriodicSRS_PerBWP");

      // encode maxNumberPeriodicSRS_PerBWP_PerSlot

      if (maxNumberPeriodicSRS_PerBWP_PerSlot != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicSRS_PerBWP_PerSlot", -1);

         maxNumberPeriodicSRS_PerBWP_PerSlot.encode (buffer, 1, 6);

         buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicSRS_PerBWP_PerSlot", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberPeriodicSRS_PerBWP_PerSlot");

      // encode maxNumberSemiPersistentSRS_PerBWP

      if (maxNumberSemiPersistentSRS_PerBWP != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentSRS_PerBWP", -1);

         maxNumberSemiPersistentSRS_PerBWP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentSRS_PerBWP", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSemiPersistentSRS_PerBWP");

      // encode maxNumberSemiPersistentSRS_PerBWP_PerSlot

      if (maxNumberSemiPersistentSRS_PerBWP_PerSlot != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentSRS_PerBWP_PerSlot", -1);

         maxNumberSemiPersistentSRS_PerBWP_PerSlot.encode (buffer, 1, 6);

         buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentSRS_PerBWP_PerSlot", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSemiPersistentSRS_PerBWP_PerSlot");

      // encode maxNumberSRS_Ports_PerResource

      if (maxNumberSRS_Ports_PerResource != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSRS_Ports_PerResource", -1);

         maxNumberSRS_Ports_PerResource.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberSRS_Ports_PerResource", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSRS_Ports_PerResource");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberAperiodicSRS_PerBWP != null) maxNumberAperiodicSRS_PerBWP.print (_sb, "maxNumberAperiodicSRS_PerBWP", _level+1);
      if (maxNumberAperiodicSRS_PerBWP_PerSlot != null) maxNumberAperiodicSRS_PerBWP_PerSlot.print (_sb, "maxNumberAperiodicSRS_PerBWP_PerSlot", _level+1);
      if (maxNumberPeriodicSRS_PerBWP != null) maxNumberPeriodicSRS_PerBWP.print (_sb, "maxNumberPeriodicSRS_PerBWP", _level+1);
      if (maxNumberPeriodicSRS_PerBWP_PerSlot != null) maxNumberPeriodicSRS_PerBWP_PerSlot.print (_sb, "maxNumberPeriodicSRS_PerBWP_PerSlot", _level+1);
      if (maxNumberSemiPersistentSRS_PerBWP != null) maxNumberSemiPersistentSRS_PerBWP.print (_sb, "maxNumberSemiPersistentSRS_PerBWP", _level+1);
      if (maxNumberSemiPersistentSRS_PerBWP_PerSlot != null) maxNumberSemiPersistentSRS_PerBWP_PerSlot.print (_sb, "maxNumberSemiPersistentSRS_PerBWP_PerSlot", _level+1);
      if (maxNumberSRS_Ports_PerResource != null) maxNumberSRS_Ports_PerResource.print (_sb, "maxNumberSRS_Ports_PerResource", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
