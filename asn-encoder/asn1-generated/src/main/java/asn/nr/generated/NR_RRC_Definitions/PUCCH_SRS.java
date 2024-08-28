/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_SRS extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUCCH-SRS";
   }

   public SRS_ResourceId resource;
   public BWP_Id uplinkBWP;

   public PUCCH_SRS () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUCCH_SRS (
      SRS_ResourceId resource_,
      BWP_Id uplinkBWP_
   ) {
      super();
      resource = resource_;
      uplinkBWP = uplinkBWP_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PUCCH_SRS (long resource_,
      long uplinkBWP_
   ) {
      super();
      resource = new SRS_ResourceId (resource_);
      uplinkBWP = new BWP_Id (uplinkBWP_);
   }

   public void init () {
      resource = null;
      uplinkBWP = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return resource;
         case 1: return uplinkBWP;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "resource";
         case 1: return "uplinkBWP";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode resource

      buffer.getContext().eventDispatcher.startElement("resource", -1);

      resource = new SRS_ResourceId();
      resource.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("resource", -1);

      // decode uplinkBWP

      buffer.getContext().eventDispatcher.startElement("uplinkBWP", -1);

      uplinkBWP = new BWP_Id();
      uplinkBWP.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uplinkBWP", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode resource

      if (resource != null) {
         buffer.getContext().eventDispatcher.startElement("resource", -1);

         resource.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("resource", -1);
      }
      else throw new Asn1MissingRequiredException ("resource");

      // encode uplinkBWP

      if (uplinkBWP != null) {
         buffer.getContext().eventDispatcher.startElement("uplinkBWP", -1);

         uplinkBWP.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("uplinkBWP", -1);
      }
      else throw new Asn1MissingRequiredException ("uplinkBWP");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (resource != null) resource.print (_sb, "resource", _level+1);
      if (uplinkBWP != null) uplinkBWP.print (_sb, "uplinkBWP", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
