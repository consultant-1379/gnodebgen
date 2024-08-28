/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellSelectionInfo_v1130 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellSelectionInfo-v1130";
   }

   public Q_QualMin_r9 q_QualMinWB_r11;

   public CellSelectionInfo_v1130 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellSelectionInfo_v1130 (
      Q_QualMin_r9 q_QualMinWB_r11_
   ) {
      super();
      q_QualMinWB_r11 = q_QualMinWB_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellSelectionInfo_v1130 (long q_QualMinWB_r11_
   ) {
      super();
      q_QualMinWB_r11 = new Q_QualMin_r9 (q_QualMinWB_r11_);
   }

   public void init () {
      q_QualMinWB_r11 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return q_QualMinWB_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "q-QualMinWB-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode q_QualMinWB_r11

      buffer.getContext().eventDispatcher.startElement("q_QualMinWB_r11", -1);

      q_QualMinWB_r11 = new Q_QualMin_r9();
      q_QualMinWB_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("q_QualMinWB_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (q_QualMinWB_r11 != null) q_QualMinWB_r11.print (_sb, "q_QualMinWB_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
