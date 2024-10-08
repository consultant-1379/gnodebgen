/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SchedulingInfo";
   }

   public SchedulingInfo_si_Periodicity si_Periodicity = null;
   public SIB_MappingInfo sib_MappingInfo;

   public SchedulingInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SchedulingInfo (
      SchedulingInfo_si_Periodicity si_Periodicity_,
      SIB_MappingInfo sib_MappingInfo_
   ) {
      super();
      si_Periodicity = si_Periodicity_;
      sib_MappingInfo = sib_MappingInfo_;
   }

   public void init () {
      si_Periodicity = null;
      sib_MappingInfo = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return si_Periodicity;
         case 1: return sib_MappingInfo;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "si-Periodicity";
         case 1: return "sib-MappingInfo";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode si_Periodicity

      buffer.getContext().eventDispatcher.startElement("si_Periodicity", -1);

      {
         int tval = SchedulingInfo_si_Periodicity.decodeEnumValue (buffer);
         si_Periodicity = SchedulingInfo_si_Periodicity.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("si_Periodicity", -1);

      // decode sib_MappingInfo

      buffer.getContext().eventDispatcher.startElement("sib_MappingInfo", -1);

      sib_MappingInfo = new SIB_MappingInfo();
      sib_MappingInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sib_MappingInfo", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (si_Periodicity != null) si_Periodicity.print (_sb, "si_Periodicity", _level+1);
      if (sib_MappingInfo != null) sib_MappingInfo.print (_sb, "sib_MappingInfo", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
