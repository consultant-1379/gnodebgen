/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_V2X_ConfigDedicated_r14_commTxResources_v1530_setup_scheduled_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public LogicalChGroupInfoList_v1530 logicalChGroupInfoList_v1530;  // optional
   public Asn1Integer mcs_r15;  // optional

   public SL_V2X_ConfigDedicated_r14_commTxResources_v1530_setup_scheduled_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_V2X_ConfigDedicated_r14_commTxResources_v1530_setup_scheduled_v1530 (
      LogicalChGroupInfoList_v1530 logicalChGroupInfoList_v1530_,
      Asn1Integer mcs_r15_
   ) {
      super();
      logicalChGroupInfoList_v1530 = logicalChGroupInfoList_v1530_;
      mcs_r15 = mcs_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_V2X_ConfigDedicated_r14_commTxResources_v1530_setup_scheduled_v1530 (LogicalChGroupInfoList_v1530 logicalChGroupInfoList_v1530_,
      long mcs_r15_
   ) {
      super();
      logicalChGroupInfoList_v1530 = logicalChGroupInfoList_v1530_;
      mcs_r15 = new Asn1Integer (mcs_r15_);
   }

   public void init () {
      logicalChGroupInfoList_v1530 = null;
      mcs_r15 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return logicalChGroupInfoList_v1530;
         case 1: return mcs_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "logicalChGroupInfoList-v1530";
         case 1: return "mcs-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean logicalChGroupInfoList_v1530Present = buffer.decodeBit ("logicalChGroupInfoList_v1530Present");
      boolean mcs_r15Present = buffer.decodeBit ("mcs_r15Present");

      // decode logicalChGroupInfoList_v1530

      if (logicalChGroupInfoList_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChGroupInfoList_v1530", -1);

         logicalChGroupInfoList_v1530 = new LogicalChGroupInfoList_v1530();
         logicalChGroupInfoList_v1530.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("logicalChGroupInfoList_v1530", -1);
      }
      else {
         logicalChGroupInfoList_v1530 = null;
      }

      // decode mcs_r15

      if (mcs_r15Present) {
         buffer.getContext().eventDispatcher.startElement("mcs_r15", -1);

         mcs_r15 = new Asn1Integer();
         mcs_r15.decode (buffer, 0, 31);

         buffer.invokeCharacters(mcs_r15.toString());
         buffer.getContext().eventDispatcher.endElement("mcs_r15", -1);
      }
      else {
         mcs_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (logicalChGroupInfoList_v1530 != null) logicalChGroupInfoList_v1530.print (_sb, "logicalChGroupInfoList_v1530", _level+1);
      if (mcs_r15 != null) mcs_r15.print (_sb, "mcs_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
