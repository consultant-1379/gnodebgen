/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_groupBconfigured extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RACH_ConfigCommon_groupBconfigured_ra_Msg3SizeGroupA ra_Msg3SizeGroupA = null;
   public RACH_ConfigCommon_groupBconfigured_messagePowerOffsetGroupB messagePowerOffsetGroupB = null;
   public Asn1Integer numberOfRA_PreamblesGroupA;

   public RACH_ConfigCommon_groupBconfigured () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_ConfigCommon_groupBconfigured (
      RACH_ConfigCommon_groupBconfigured_ra_Msg3SizeGroupA ra_Msg3SizeGroupA_,
      RACH_ConfigCommon_groupBconfigured_messagePowerOffsetGroupB messagePowerOffsetGroupB_,
      Asn1Integer numberOfRA_PreamblesGroupA_
   ) {
      super();
      ra_Msg3SizeGroupA = ra_Msg3SizeGroupA_;
      messagePowerOffsetGroupB = messagePowerOffsetGroupB_;
      numberOfRA_PreamblesGroupA = numberOfRA_PreamblesGroupA_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RACH_ConfigCommon_groupBconfigured (RACH_ConfigCommon_groupBconfigured_ra_Msg3SizeGroupA ra_Msg3SizeGroupA_,
      RACH_ConfigCommon_groupBconfigured_messagePowerOffsetGroupB messagePowerOffsetGroupB_,
      long numberOfRA_PreamblesGroupA_
   ) {
      super();
      ra_Msg3SizeGroupA = ra_Msg3SizeGroupA_;
      messagePowerOffsetGroupB = messagePowerOffsetGroupB_;
      numberOfRA_PreamblesGroupA = new Asn1Integer (numberOfRA_PreamblesGroupA_);
   }

   public void init () {
      ra_Msg3SizeGroupA = null;
      messagePowerOffsetGroupB = null;
      numberOfRA_PreamblesGroupA = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ra_Msg3SizeGroupA;
         case 1: return messagePowerOffsetGroupB;
         case 2: return numberOfRA_PreamblesGroupA;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ra-Msg3SizeGroupA";
         case 1: return "messagePowerOffsetGroupB";
         case 2: return "numberOfRA-PreamblesGroupA";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ra_Msg3SizeGroupA

      buffer.getContext().eventDispatcher.startElement("ra_Msg3SizeGroupA", -1);

      {
         int tval = RACH_ConfigCommon_groupBconfigured_ra_Msg3SizeGroupA.decodeEnumValue (buffer);
         ra_Msg3SizeGroupA = RACH_ConfigCommon_groupBconfigured_ra_Msg3SizeGroupA.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ra_Msg3SizeGroupA", -1);

      // decode messagePowerOffsetGroupB

      buffer.getContext().eventDispatcher.startElement("messagePowerOffsetGroupB", -1);

      {
         int tval = RACH_ConfigCommon_groupBconfigured_messagePowerOffsetGroupB.decodeEnumValue (buffer);
         messagePowerOffsetGroupB = RACH_ConfigCommon_groupBconfigured_messagePowerOffsetGroupB.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("messagePowerOffsetGroupB", -1);

      // decode numberOfRA_PreamblesGroupA

      buffer.getContext().eventDispatcher.startElement("numberOfRA_PreamblesGroupA", -1);

      numberOfRA_PreamblesGroupA = new Asn1Integer();
      numberOfRA_PreamblesGroupA.decode (buffer, 1, 64);

      buffer.invokeCharacters(numberOfRA_PreamblesGroupA.toString());
      buffer.getContext().eventDispatcher.endElement("numberOfRA_PreamblesGroupA", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ra_Msg3SizeGroupA != null) ra_Msg3SizeGroupA.print (_sb, "ra_Msg3SizeGroupA", _level+1);
      if (messagePowerOffsetGroupB != null) messagePowerOffsetGroupB.print (_sb, "messagePowerOffsetGroupB", _level+1);
      if (numberOfRA_PreamblesGroupA != null) numberOfRA_PreamblesGroupA.print (_sb, "numberOfRA_PreamblesGroupA", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
