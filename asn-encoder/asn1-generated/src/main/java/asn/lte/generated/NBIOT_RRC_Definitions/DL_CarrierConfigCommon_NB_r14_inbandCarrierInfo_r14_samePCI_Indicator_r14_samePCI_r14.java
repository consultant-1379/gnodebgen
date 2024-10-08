/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14_samePCI_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer indexToMidPRB_r14;

   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14_samePCI_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14_samePCI_r14 (
      Asn1Integer indexToMidPRB_r14_
   ) {
      super();
      indexToMidPRB_r14 = indexToMidPRB_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DL_CarrierConfigCommon_NB_r14_inbandCarrierInfo_r14_samePCI_Indicator_r14_samePCI_r14 (long indexToMidPRB_r14_
   ) {
      super();
      indexToMidPRB_r14 = new Asn1Integer (indexToMidPRB_r14_);
   }

   public void init () {
      indexToMidPRB_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return indexToMidPRB_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "indexToMidPRB-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode indexToMidPRB_r14

      buffer.getContext().eventDispatcher.startElement("indexToMidPRB_r14", -1);

      indexToMidPRB_r14 = new Asn1Integer();
      indexToMidPRB_r14.decode (buffer, -55, 54);

      buffer.invokeCharacters(indexToMidPRB_r14.toString());
      buffer.getContext().eventDispatcher.endElement("indexToMidPRB_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (indexToMidPRB_r14 != null) indexToMidPRB_r14.print (_sb, "indexToMidPRB_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
