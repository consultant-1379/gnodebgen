/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_MainConfig_ul_SCH_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MAC_MainConfig_ul_SCH_Config_maxHARQ_Tx maxHARQ_Tx = null;  // optional
   public PeriodicBSR_Timer_r12 periodicBSR_Timer = null;  // optional
   public RetxBSR_Timer_r12 retxBSR_Timer = null;
   public Asn1Boolean ttiBundling;

   public MAC_MainConfig_ul_SCH_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_MainConfig_ul_SCH_Config (
      MAC_MainConfig_ul_SCH_Config_maxHARQ_Tx maxHARQ_Tx_,
      PeriodicBSR_Timer_r12 periodicBSR_Timer_,
      RetxBSR_Timer_r12 retxBSR_Timer_,
      Asn1Boolean ttiBundling_
   ) {
      super();
      maxHARQ_Tx = maxHARQ_Tx_;
      periodicBSR_Timer = periodicBSR_Timer_;
      retxBSR_Timer = retxBSR_Timer_;
      ttiBundling = ttiBundling_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MAC_MainConfig_ul_SCH_Config (
      RetxBSR_Timer_r12 retxBSR_Timer_,
      Asn1Boolean ttiBundling_
   ) {
      super();
      retxBSR_Timer = retxBSR_Timer_;
      ttiBundling = ttiBundling_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MAC_MainConfig_ul_SCH_Config (MAC_MainConfig_ul_SCH_Config_maxHARQ_Tx maxHARQ_Tx_,
      PeriodicBSR_Timer_r12 periodicBSR_Timer_,
      RetxBSR_Timer_r12 retxBSR_Timer_,
      boolean ttiBundling_
   ) {
      super();
      maxHARQ_Tx = maxHARQ_Tx_;
      periodicBSR_Timer = periodicBSR_Timer_;
      retxBSR_Timer = retxBSR_Timer_;
      ttiBundling = new Asn1Boolean (ttiBundling_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MAC_MainConfig_ul_SCH_Config (
      RetxBSR_Timer_r12 retxBSR_Timer_,
      boolean ttiBundling_
   ) {
      super();
      retxBSR_Timer = retxBSR_Timer_;
      ttiBundling = new Asn1Boolean (ttiBundling_);
   }

   public void init () {
      maxHARQ_Tx = null;
      periodicBSR_Timer = null;
      retxBSR_Timer = null;
      ttiBundling = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxHARQ_Tx;
         case 1: return periodicBSR_Timer;
         case 2: return retxBSR_Timer;
         case 3: return ttiBundling;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxHARQ-Tx";
         case 1: return "periodicBSR-Timer";
         case 2: return "retxBSR-Timer";
         case 3: return "ttiBundling";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean maxHARQ_TxPresent = buffer.decodeBit ("maxHARQ_TxPresent");
      boolean periodicBSR_TimerPresent = buffer.decodeBit ("periodicBSR_TimerPresent");

      // decode maxHARQ_Tx

      if (maxHARQ_TxPresent) {
         buffer.getContext().eventDispatcher.startElement("maxHARQ_Tx", -1);

         int tval = MAC_MainConfig_ul_SCH_Config_maxHARQ_Tx.decodeEnumValue (buffer);
         maxHARQ_Tx = MAC_MainConfig_ul_SCH_Config_maxHARQ_Tx.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxHARQ_Tx", -1);
      }
      else {
         maxHARQ_Tx = null;
      }

      // decode periodicBSR_Timer

      if (periodicBSR_TimerPresent) {
         buffer.getContext().eventDispatcher.startElement("periodicBSR_Timer", -1);

         int tval = PeriodicBSR_Timer_r12.decodeEnumValue (buffer);
         periodicBSR_Timer = PeriodicBSR_Timer_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("periodicBSR_Timer", -1);
      }
      else {
         periodicBSR_Timer = null;
      }

      // decode retxBSR_Timer

      buffer.getContext().eventDispatcher.startElement("retxBSR_Timer", -1);

      {
         int tval = RetxBSR_Timer_r12.decodeEnumValue (buffer);
         retxBSR_Timer = RetxBSR_Timer_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("retxBSR_Timer", -1);

      // decode ttiBundling

      buffer.getContext().eventDispatcher.startElement("ttiBundling", -1);

      ttiBundling = new Asn1Boolean();
      ttiBundling.decode (buffer);

      buffer.invokeCharacters(ttiBundling.toString());
      buffer.getContext().eventDispatcher.endElement("ttiBundling", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxHARQ_Tx != null) maxHARQ_Tx.print (_sb, "maxHARQ_Tx", _level+1);
      if (periodicBSR_Timer != null) periodicBSR_Timer.print (_sb, "periodicBSR_Timer", _level+1);
      if (retxBSR_Timer != null) retxBSR_Timer.print (_sb, "retxBSR_Timer", _level+1);
      if (ttiBundling != null) ttiBundling.print (_sb, "ttiBundling", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
