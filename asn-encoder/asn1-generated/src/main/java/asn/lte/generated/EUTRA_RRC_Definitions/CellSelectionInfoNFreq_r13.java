/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellSelectionInfoNFreq_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellSelectionInfoNFreq-r13";
   }

   public Q_RxLevMin q_RxLevMin_r13;
   public Asn1Integer q_RxLevMinOffset;  // optional
   public CellSelectionInfoNFreq_r13_q_Hyst_r13 q_Hyst_r13 = null;
   public Q_RxLevMin q_RxLevMinReselection_r13;
   public T_Reselection t_ReselectionEUTRA_r13;

   public CellSelectionInfoNFreq_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellSelectionInfoNFreq_r13 (
      Q_RxLevMin q_RxLevMin_r13_,
      Asn1Integer q_RxLevMinOffset_,
      CellSelectionInfoNFreq_r13_q_Hyst_r13 q_Hyst_r13_,
      Q_RxLevMin q_RxLevMinReselection_r13_,
      T_Reselection t_ReselectionEUTRA_r13_
   ) {
      super();
      q_RxLevMin_r13 = q_RxLevMin_r13_;
      q_RxLevMinOffset = q_RxLevMinOffset_;
      q_Hyst_r13 = q_Hyst_r13_;
      q_RxLevMinReselection_r13 = q_RxLevMinReselection_r13_;
      t_ReselectionEUTRA_r13 = t_ReselectionEUTRA_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CellSelectionInfoNFreq_r13 (
      Q_RxLevMin q_RxLevMin_r13_,
      CellSelectionInfoNFreq_r13_q_Hyst_r13 q_Hyst_r13_,
      Q_RxLevMin q_RxLevMinReselection_r13_,
      T_Reselection t_ReselectionEUTRA_r13_
   ) {
      super();
      q_RxLevMin_r13 = q_RxLevMin_r13_;
      q_Hyst_r13 = q_Hyst_r13_;
      q_RxLevMinReselection_r13 = q_RxLevMinReselection_r13_;
      t_ReselectionEUTRA_r13 = t_ReselectionEUTRA_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellSelectionInfoNFreq_r13 (long q_RxLevMin_r13_,
      long q_RxLevMinOffset_,
      CellSelectionInfoNFreq_r13_q_Hyst_r13 q_Hyst_r13_,
      long q_RxLevMinReselection_r13_,
      long t_ReselectionEUTRA_r13_
   ) {
      super();
      q_RxLevMin_r13 = new Q_RxLevMin (q_RxLevMin_r13_);
      q_RxLevMinOffset = new Asn1Integer (q_RxLevMinOffset_);
      q_Hyst_r13 = q_Hyst_r13_;
      q_RxLevMinReselection_r13 = new Q_RxLevMin (q_RxLevMinReselection_r13_);
      t_ReselectionEUTRA_r13 = new T_Reselection (t_ReselectionEUTRA_r13_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CellSelectionInfoNFreq_r13 (
      long q_RxLevMin_r13_,
      CellSelectionInfoNFreq_r13_q_Hyst_r13 q_Hyst_r13_,
      long q_RxLevMinReselection_r13_,
      long t_ReselectionEUTRA_r13_
   ) {
      super();
      q_RxLevMin_r13 = new Q_RxLevMin (q_RxLevMin_r13_);
      q_Hyst_r13 = q_Hyst_r13_;
      q_RxLevMinReselection_r13 = new Q_RxLevMin (q_RxLevMinReselection_r13_);
      t_ReselectionEUTRA_r13 = new T_Reselection (t_ReselectionEUTRA_r13_);
   }

   public void init () {
      q_RxLevMin_r13 = null;
      q_RxLevMinOffset = null;
      q_Hyst_r13 = null;
      q_RxLevMinReselection_r13 = null;
      t_ReselectionEUTRA_r13 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return q_RxLevMin_r13;
         case 1: return q_RxLevMinOffset;
         case 2: return q_Hyst_r13;
         case 3: return q_RxLevMinReselection_r13;
         case 4: return t_ReselectionEUTRA_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "q-RxLevMin-r13";
         case 1: return "q-RxLevMinOffset";
         case 2: return "q-Hyst-r13";
         case 3: return "q-RxLevMinReselection-r13";
         case 4: return "t-ReselectionEUTRA-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean q_RxLevMinOffsetPresent = buffer.decodeBit ("q_RxLevMinOffsetPresent");

      // decode q_RxLevMin_r13

      buffer.getContext().eventDispatcher.startElement("q_RxLevMin_r13", -1);

      q_RxLevMin_r13 = new Q_RxLevMin();
      q_RxLevMin_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("q_RxLevMin_r13", -1);

      // decode q_RxLevMinOffset

      if (q_RxLevMinOffsetPresent) {
         buffer.getContext().eventDispatcher.startElement("q_RxLevMinOffset", -1);

         q_RxLevMinOffset = new Asn1Integer();
         q_RxLevMinOffset.decode (buffer, 1, 8);

         buffer.invokeCharacters(q_RxLevMinOffset.toString());
         buffer.getContext().eventDispatcher.endElement("q_RxLevMinOffset", -1);
      }
      else {
         q_RxLevMinOffset = null;
      }

      // decode q_Hyst_r13

      buffer.getContext().eventDispatcher.startElement("q_Hyst_r13", -1);

      {
         int tval = CellSelectionInfoNFreq_r13_q_Hyst_r13.decodeEnumValue (buffer);
         q_Hyst_r13 = CellSelectionInfoNFreq_r13_q_Hyst_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("q_Hyst_r13", -1);

      // decode q_RxLevMinReselection_r13

      buffer.getContext().eventDispatcher.startElement("q_RxLevMinReselection_r13", -1);

      q_RxLevMinReselection_r13 = new Q_RxLevMin();
      q_RxLevMinReselection_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("q_RxLevMinReselection_r13", -1);

      // decode t_ReselectionEUTRA_r13

      buffer.getContext().eventDispatcher.startElement("t_ReselectionEUTRA_r13", -1);

      t_ReselectionEUTRA_r13 = new T_Reselection();
      t_ReselectionEUTRA_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("t_ReselectionEUTRA_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (q_RxLevMin_r13 != null) q_RxLevMin_r13.print (_sb, "q_RxLevMin_r13", _level+1);
      if (q_RxLevMinOffset != null) q_RxLevMinOffset.print (_sb, "q_RxLevMinOffset", _level+1);
      if (q_Hyst_r13 != null) q_Hyst_r13.print (_sb, "q_Hyst_r13", _level+1);
      if (q_RxLevMinReselection_r13 != null) q_RxLevMinReselection_r13.print (_sb, "q_RxLevMinReselection_r13", _level+1);
      if (t_ReselectionEUTRA_r13 != null) t_ReselectionEUTRA_r13.print (_sb, "t_ReselectionEUTRA_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
