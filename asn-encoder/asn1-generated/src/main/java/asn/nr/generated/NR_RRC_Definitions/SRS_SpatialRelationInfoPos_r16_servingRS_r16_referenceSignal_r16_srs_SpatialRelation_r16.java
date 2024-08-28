/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16_resourceSelection_r16 resourceSelection_r16;
   public BWP_Id uplinkBWP_r16;

   public SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16 (
      SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16_resourceSelection_r16 resourceSelection_r16_,
      BWP_Id uplinkBWP_r16_
   ) {
      super();
      resourceSelection_r16 = resourceSelection_r16_;
      uplinkBWP_r16 = uplinkBWP_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16 (SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16_resourceSelection_r16 resourceSelection_r16_,
      long uplinkBWP_r16_
   ) {
      super();
      resourceSelection_r16 = resourceSelection_r16_;
      uplinkBWP_r16 = new BWP_Id (uplinkBWP_r16_);
   }

   public void init () {
      resourceSelection_r16 = null;
      uplinkBWP_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return resourceSelection_r16;
         case 1: return uplinkBWP_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "resourceSelection-r16";
         case 1: return "uplinkBWP-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode resourceSelection_r16

      buffer.getContext().eventDispatcher.startElement("resourceSelection_r16", -1);

      resourceSelection_r16 = new SRS_SpatialRelationInfoPos_r16_servingRS_r16_referenceSignal_r16_srs_SpatialRelation_r16_resourceSelection_r16();
      resourceSelection_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("resourceSelection_r16", -1);

      // decode uplinkBWP_r16

      buffer.getContext().eventDispatcher.startElement("uplinkBWP_r16", -1);

      uplinkBWP_r16 = new BWP_Id();
      uplinkBWP_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uplinkBWP_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode resourceSelection_r16

      if (resourceSelection_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("resourceSelection_r16", -1);

         resourceSelection_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("resourceSelection_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("resourceSelection_r16");

      // encode uplinkBWP_r16

      if (uplinkBWP_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("uplinkBWP_r16", -1);

         uplinkBWP_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("uplinkBWP_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("uplinkBWP_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (resourceSelection_r16 != null) resourceSelection_r16.print (_sb, "resourceSelection_r16", _level+1);
      if (uplinkBWP_r16 != null) uplinkBWP_r16.print (_sb, "uplinkBWP_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
