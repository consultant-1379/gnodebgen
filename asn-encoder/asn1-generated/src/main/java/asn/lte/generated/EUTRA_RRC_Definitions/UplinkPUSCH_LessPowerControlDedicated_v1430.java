/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPUSCH_LessPowerControlDedicated_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkPUSCH-LessPowerControlDedicated-v1430";
   }

   public Asn1Integer p0_UE_PeriodicSRS_r14;  // optional
   public Asn1Integer p0_UE_AperiodicSRS_r14;  // optional
   public Asn1Boolean accumulationEnabled_r14;

   public UplinkPUSCH_LessPowerControlDedicated_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkPUSCH_LessPowerControlDedicated_v1430 (
      Asn1Integer p0_UE_PeriodicSRS_r14_,
      Asn1Integer p0_UE_AperiodicSRS_r14_,
      Asn1Boolean accumulationEnabled_r14_
   ) {
      super();
      p0_UE_PeriodicSRS_r14 = p0_UE_PeriodicSRS_r14_;
      p0_UE_AperiodicSRS_r14 = p0_UE_AperiodicSRS_r14_;
      accumulationEnabled_r14 = accumulationEnabled_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UplinkPUSCH_LessPowerControlDedicated_v1430 (
      Asn1Boolean accumulationEnabled_r14_
   ) {
      super();
      accumulationEnabled_r14 = accumulationEnabled_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UplinkPUSCH_LessPowerControlDedicated_v1430 (long p0_UE_PeriodicSRS_r14_,
      long p0_UE_AperiodicSRS_r14_,
      boolean accumulationEnabled_r14_
   ) {
      super();
      p0_UE_PeriodicSRS_r14 = new Asn1Integer (p0_UE_PeriodicSRS_r14_);
      p0_UE_AperiodicSRS_r14 = new Asn1Integer (p0_UE_AperiodicSRS_r14_);
      accumulationEnabled_r14 = new Asn1Boolean (accumulationEnabled_r14_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public UplinkPUSCH_LessPowerControlDedicated_v1430 (
      boolean accumulationEnabled_r14_
   ) {
      super();
      accumulationEnabled_r14 = new Asn1Boolean (accumulationEnabled_r14_);
   }

   public void init () {
      p0_UE_PeriodicSRS_r14 = null;
      p0_UE_AperiodicSRS_r14 = null;
      accumulationEnabled_r14 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p0_UE_PeriodicSRS_r14;
         case 1: return p0_UE_AperiodicSRS_r14;
         case 2: return accumulationEnabled_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p0-UE-PeriodicSRS-r14";
         case 1: return "p0-UE-AperiodicSRS-r14";
         case 2: return "accumulationEnabled-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean p0_UE_PeriodicSRS_r14Present = buffer.decodeBit ("p0_UE_PeriodicSRS_r14Present");
      boolean p0_UE_AperiodicSRS_r14Present = buffer.decodeBit ("p0_UE_AperiodicSRS_r14Present");

      // decode p0_UE_PeriodicSRS_r14

      if (p0_UE_PeriodicSRS_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p0_UE_PeriodicSRS_r14", -1);

         p0_UE_PeriodicSRS_r14 = new Asn1Integer();
         p0_UE_PeriodicSRS_r14.decode (buffer, -8, 7);

         buffer.invokeCharacters(p0_UE_PeriodicSRS_r14.toString());
         buffer.getContext().eventDispatcher.endElement("p0_UE_PeriodicSRS_r14", -1);
      }
      else {
         p0_UE_PeriodicSRS_r14 = null;
      }

      // decode p0_UE_AperiodicSRS_r14

      if (p0_UE_AperiodicSRS_r14Present) {
         buffer.getContext().eventDispatcher.startElement("p0_UE_AperiodicSRS_r14", -1);

         p0_UE_AperiodicSRS_r14 = new Asn1Integer();
         p0_UE_AperiodicSRS_r14.decode (buffer, -8, 7);

         buffer.invokeCharacters(p0_UE_AperiodicSRS_r14.toString());
         buffer.getContext().eventDispatcher.endElement("p0_UE_AperiodicSRS_r14", -1);
      }
      else {
         p0_UE_AperiodicSRS_r14 = null;
      }

      // decode accumulationEnabled_r14

      buffer.getContext().eventDispatcher.startElement("accumulationEnabled_r14", -1);

      accumulationEnabled_r14 = new Asn1Boolean();
      accumulationEnabled_r14.decode (buffer);

      buffer.invokeCharacters(accumulationEnabled_r14.toString());
      buffer.getContext().eventDispatcher.endElement("accumulationEnabled_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p0_UE_PeriodicSRS_r14 != null) p0_UE_PeriodicSRS_r14.print (_sb, "p0_UE_PeriodicSRS_r14", _level+1);
      if (p0_UE_AperiodicSRS_r14 != null) p0_UE_AperiodicSRS_r14.print (_sb, "p0_UE_AperiodicSRS_r14", _level+1);
      if (accumulationEnabled_r14 != null) accumulationEnabled_r14.print (_sb, "accumulationEnabled_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
