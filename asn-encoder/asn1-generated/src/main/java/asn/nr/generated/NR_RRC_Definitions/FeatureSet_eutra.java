/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSet_eutra extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public FeatureSetEUTRA_DownlinkId downlinkSetEUTRA;
   public FeatureSetEUTRA_UplinkId uplinkSetEUTRA;

   public FeatureSet_eutra () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSet_eutra (
      FeatureSetEUTRA_DownlinkId downlinkSetEUTRA_,
      FeatureSetEUTRA_UplinkId uplinkSetEUTRA_
   ) {
      super();
      downlinkSetEUTRA = downlinkSetEUTRA_;
      uplinkSetEUTRA = uplinkSetEUTRA_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public FeatureSet_eutra (long downlinkSetEUTRA_,
      long uplinkSetEUTRA_
   ) {
      super();
      downlinkSetEUTRA = new FeatureSetEUTRA_DownlinkId (downlinkSetEUTRA_);
      uplinkSetEUTRA = new FeatureSetEUTRA_UplinkId (uplinkSetEUTRA_);
   }

   public void init () {
      downlinkSetEUTRA = null;
      uplinkSetEUTRA = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return downlinkSetEUTRA;
         case 1: return uplinkSetEUTRA;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "downlinkSetEUTRA";
         case 1: return "uplinkSetEUTRA";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode downlinkSetEUTRA

      buffer.getContext().eventDispatcher.startElement("downlinkSetEUTRA", -1);

      downlinkSetEUTRA = new FeatureSetEUTRA_DownlinkId();
      downlinkSetEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("downlinkSetEUTRA", -1);

      // decode uplinkSetEUTRA

      buffer.getContext().eventDispatcher.startElement("uplinkSetEUTRA", -1);

      uplinkSetEUTRA = new FeatureSetEUTRA_UplinkId();
      uplinkSetEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("uplinkSetEUTRA", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode downlinkSetEUTRA

      if (downlinkSetEUTRA != null) {
         buffer.getContext().eventDispatcher.startElement("downlinkSetEUTRA", -1);

         downlinkSetEUTRA.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("downlinkSetEUTRA", -1);
      }
      else throw new Asn1MissingRequiredException ("downlinkSetEUTRA");

      // encode uplinkSetEUTRA

      if (uplinkSetEUTRA != null) {
         buffer.getContext().eventDispatcher.startElement("uplinkSetEUTRA", -1);

         uplinkSetEUTRA.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("uplinkSetEUTRA", -1);
      }
      else throw new Asn1MissingRequiredException ("uplinkSetEUTRA");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (downlinkSetEUTRA != null) downlinkSetEUTRA.print (_sb, "downlinkSetEUTRA", _level+1);
      if (uplinkSetEUTRA != null) uplinkSetEUTRA.print (_sb, "uplinkSetEUTRA", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
