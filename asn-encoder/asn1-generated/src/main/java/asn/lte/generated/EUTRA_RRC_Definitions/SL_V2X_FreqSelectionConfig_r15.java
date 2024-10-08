/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_V2X_FreqSelectionConfig_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-V2X-FreqSelectionConfig-r15";
   }

   public SL_PriorityList_r13 priorityList_r15;
   public SL_CBR_r14 threshCBR_FreqReselection_r15;  // optional
   public SL_CBR_r14 threshCBR_FreqKeeping_r15;  // optional

   public SL_V2X_FreqSelectionConfig_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_V2X_FreqSelectionConfig_r15 (
      SL_PriorityList_r13 priorityList_r15_,
      SL_CBR_r14 threshCBR_FreqReselection_r15_,
      SL_CBR_r14 threshCBR_FreqKeeping_r15_
   ) {
      super();
      priorityList_r15 = priorityList_r15_;
      threshCBR_FreqReselection_r15 = threshCBR_FreqReselection_r15_;
      threshCBR_FreqKeeping_r15 = threshCBR_FreqKeeping_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_V2X_FreqSelectionConfig_r15 (
      SL_PriorityList_r13 priorityList_r15_
   ) {
      super();
      priorityList_r15 = priorityList_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_V2X_FreqSelectionConfig_r15 (SL_PriorityList_r13 priorityList_r15_,
      long threshCBR_FreqReselection_r15_,
      long threshCBR_FreqKeeping_r15_
   ) {
      super();
      priorityList_r15 = priorityList_r15_;
      threshCBR_FreqReselection_r15 = new SL_CBR_r14 (threshCBR_FreqReselection_r15_);
      threshCBR_FreqKeeping_r15 = new SL_CBR_r14 (threshCBR_FreqKeeping_r15_);
   }

   public void init () {
      priorityList_r15 = null;
      threshCBR_FreqReselection_r15 = null;
      threshCBR_FreqKeeping_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return priorityList_r15;
         case 1: return threshCBR_FreqReselection_r15;
         case 2: return threshCBR_FreqKeeping_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "priorityList-r15";
         case 1: return "threshCBR-FreqReselection-r15";
         case 2: return "threshCBR-FreqKeeping-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean threshCBR_FreqReselection_r15Present = buffer.decodeBit ("threshCBR_FreqReselection_r15Present");
      boolean threshCBR_FreqKeeping_r15Present = buffer.decodeBit ("threshCBR_FreqKeeping_r15Present");

      // decode priorityList_r15

      buffer.getContext().eventDispatcher.startElement("priorityList_r15", -1);

      priorityList_r15 = new SL_PriorityList_r13();
      priorityList_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("priorityList_r15", -1);

      // decode threshCBR_FreqReselection_r15

      if (threshCBR_FreqReselection_r15Present) {
         buffer.getContext().eventDispatcher.startElement("threshCBR_FreqReselection_r15", -1);

         threshCBR_FreqReselection_r15 = new SL_CBR_r14();
         threshCBR_FreqReselection_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("threshCBR_FreqReselection_r15", -1);
      }
      else {
         threshCBR_FreqReselection_r15 = null;
      }

      // decode threshCBR_FreqKeeping_r15

      if (threshCBR_FreqKeeping_r15Present) {
         buffer.getContext().eventDispatcher.startElement("threshCBR_FreqKeeping_r15", -1);

         threshCBR_FreqKeeping_r15 = new SL_CBR_r14();
         threshCBR_FreqKeeping_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("threshCBR_FreqKeeping_r15", -1);
      }
      else {
         threshCBR_FreqKeeping_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (priorityList_r15 != null) priorityList_r15.print (_sb, "priorityList_r15", _level+1);
      if (threshCBR_FreqReselection_r15 != null) threshCBR_FreqReselection_r15.print (_sb, "threshCBR_FreqReselection_r15", _level+1);
      if (threshCBR_FreqKeeping_r15 != null) threshCBR_FreqKeeping_r15.print (_sb, "threshCBR_FreqKeeping_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
