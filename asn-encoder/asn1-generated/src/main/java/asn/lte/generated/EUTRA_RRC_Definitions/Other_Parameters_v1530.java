/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Other_Parameters_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Other-Parameters-v1530";
   }

   public Other_Parameters_v1530_assistInfoBitForLC_r15 assistInfoBitForLC_r15 = null;  // optional
   public Other_Parameters_v1530_timeReferenceProvision_r15 timeReferenceProvision_r15 = null;  // optional
   public Other_Parameters_v1530_flightPathPlan_r15 flightPathPlan_r15 = null;  // optional

   public Other_Parameters_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Other_Parameters_v1530 (
      Other_Parameters_v1530_assistInfoBitForLC_r15 assistInfoBitForLC_r15_,
      Other_Parameters_v1530_timeReferenceProvision_r15 timeReferenceProvision_r15_,
      Other_Parameters_v1530_flightPathPlan_r15 flightPathPlan_r15_
   ) {
      super();
      assistInfoBitForLC_r15 = assistInfoBitForLC_r15_;
      timeReferenceProvision_r15 = timeReferenceProvision_r15_;
      flightPathPlan_r15 = flightPathPlan_r15_;
   }

   public void init () {
      assistInfoBitForLC_r15 = null;
      timeReferenceProvision_r15 = null;
      flightPathPlan_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return assistInfoBitForLC_r15;
         case 1: return timeReferenceProvision_r15;
         case 2: return flightPathPlan_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "assistInfoBitForLC-r15";
         case 1: return "timeReferenceProvision-r15";
         case 2: return "flightPathPlan-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean assistInfoBitForLC_r15Present = buffer.decodeBit ("assistInfoBitForLC_r15Present");
      boolean timeReferenceProvision_r15Present = buffer.decodeBit ("timeReferenceProvision_r15Present");
      boolean flightPathPlan_r15Present = buffer.decodeBit ("flightPathPlan_r15Present");

      // decode assistInfoBitForLC_r15

      if (assistInfoBitForLC_r15Present) {
         buffer.getContext().eventDispatcher.startElement("assistInfoBitForLC_r15", -1);

         int tval = Other_Parameters_v1530_assistInfoBitForLC_r15.decodeEnumValue (buffer);
         assistInfoBitForLC_r15 = Other_Parameters_v1530_assistInfoBitForLC_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("assistInfoBitForLC_r15", -1);
      }
      else {
         assistInfoBitForLC_r15 = null;
      }

      // decode timeReferenceProvision_r15

      if (timeReferenceProvision_r15Present) {
         buffer.getContext().eventDispatcher.startElement("timeReferenceProvision_r15", -1);

         int tval = Other_Parameters_v1530_timeReferenceProvision_r15.decodeEnumValue (buffer);
         timeReferenceProvision_r15 = Other_Parameters_v1530_timeReferenceProvision_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("timeReferenceProvision_r15", -1);
      }
      else {
         timeReferenceProvision_r15 = null;
      }

      // decode flightPathPlan_r15

      if (flightPathPlan_r15Present) {
         buffer.getContext().eventDispatcher.startElement("flightPathPlan_r15", -1);

         int tval = Other_Parameters_v1530_flightPathPlan_r15.decodeEnumValue (buffer);
         flightPathPlan_r15 = Other_Parameters_v1530_flightPathPlan_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("flightPathPlan_r15", -1);
      }
      else {
         flightPathPlan_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (assistInfoBitForLC_r15 != null) assistInfoBitForLC_r15.print (_sb, "assistInfoBitForLC_r15", _level+1);
      if (timeReferenceProvision_r15 != null) timeReferenceProvision_r15.print (_sb, "timeReferenceProvision_r15", _level+1);
      if (flightPathPlan_r15 != null) flightPathPlan_r15.print (_sb, "flightPathPlan_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
