/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CommResourcePool_r12_rxParametersNCell_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public TDD_Config tdd_Config_r12;  // optional
   public Asn1Integer syncConfigIndex_r12;

   public SL_CommResourcePool_r12_rxParametersNCell_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CommResourcePool_r12_rxParametersNCell_r12 (
      TDD_Config tdd_Config_r12_,
      Asn1Integer syncConfigIndex_r12_
   ) {
      super();
      tdd_Config_r12 = tdd_Config_r12_;
      syncConfigIndex_r12 = syncConfigIndex_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_CommResourcePool_r12_rxParametersNCell_r12 (
      Asn1Integer syncConfigIndex_r12_
   ) {
      super();
      syncConfigIndex_r12 = syncConfigIndex_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_CommResourcePool_r12_rxParametersNCell_r12 (TDD_Config tdd_Config_r12_,
      long syncConfigIndex_r12_
   ) {
      super();
      tdd_Config_r12 = tdd_Config_r12_;
      syncConfigIndex_r12 = new Asn1Integer (syncConfigIndex_r12_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_CommResourcePool_r12_rxParametersNCell_r12 (
      long syncConfigIndex_r12_
   ) {
      super();
      syncConfigIndex_r12 = new Asn1Integer (syncConfigIndex_r12_);
   }

   public void init () {
      tdd_Config_r12 = null;
      syncConfigIndex_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tdd_Config_r12;
         case 1: return syncConfigIndex_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tdd-Config-r12";
         case 1: return "syncConfigIndex-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tdd_Config_r12Present = buffer.decodeBit ("tdd_Config_r12Present");

      // decode tdd_Config_r12

      if (tdd_Config_r12Present) {
         buffer.getContext().eventDispatcher.startElement("tdd_Config_r12", -1);

         tdd_Config_r12 = new TDD_Config();
         tdd_Config_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tdd_Config_r12", -1);
      }
      else {
         tdd_Config_r12 = null;
      }

      // decode syncConfigIndex_r12

      buffer.getContext().eventDispatcher.startElement("syncConfigIndex_r12", -1);

      syncConfigIndex_r12 = new Asn1Integer();
      syncConfigIndex_r12.decode (buffer, 0, 15);

      buffer.invokeCharacters(syncConfigIndex_r12.toString());
      buffer.getContext().eventDispatcher.endElement("syncConfigIndex_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tdd_Config_r12 != null) tdd_Config_r12.print (_sb, "tdd_Config_r12", _level+1);
      if (syncConfigIndex_r12 != null) syncConfigIndex_r12.print (_sb, "syncConfigIndex_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
