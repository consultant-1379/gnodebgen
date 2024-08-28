/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IdleModeMobilityControlInfo_v9e0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IdleModeMobilityControlInfo-v9e0";
   }

   public IdleModeMobilityControlInfo_v9e0_freqPriorityListEUTRA_v9e0 freqPriorityListEUTRA_v9e0;

   public IdleModeMobilityControlInfo_v9e0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public IdleModeMobilityControlInfo_v9e0 (
      IdleModeMobilityControlInfo_v9e0_freqPriorityListEUTRA_v9e0 freqPriorityListEUTRA_v9e0_
   ) {
      super();
      freqPriorityListEUTRA_v9e0 = freqPriorityListEUTRA_v9e0_;
   }

   public void init () {
      freqPriorityListEUTRA_v9e0 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqPriorityListEUTRA_v9e0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqPriorityListEUTRA-v9e0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode freqPriorityListEUTRA_v9e0

      buffer.getContext().eventDispatcher.startElement("freqPriorityListEUTRA_v9e0", -1);

      freqPriorityListEUTRA_v9e0 = new IdleModeMobilityControlInfo_v9e0_freqPriorityListEUTRA_v9e0();
      freqPriorityListEUTRA_v9e0.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("freqPriorityListEUTRA_v9e0", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (freqPriorityListEUTRA_v9e0 != null) freqPriorityListEUTRA_v9e0.print (_sb, "freqPriorityListEUTRA_v9e0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
