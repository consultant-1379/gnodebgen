/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultFailedCell_r16_measResult_r16_cellResults_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasQuantityResults resultsSSB_Cell_r16;

   public MeasResultFailedCell_r16_measResult_r16_cellResults_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultFailedCell_r16_measResult_r16_cellResults_r16 (
      MeasQuantityResults resultsSSB_Cell_r16_
   ) {
      super();
      resultsSSB_Cell_r16 = resultsSSB_Cell_r16_;
   }

   public void init () {
      resultsSSB_Cell_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return resultsSSB_Cell_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "resultsSSB-Cell-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode resultsSSB_Cell_r16

      buffer.getContext().eventDispatcher.startElement("resultsSSB_Cell_r16", -1);

      resultsSSB_Cell_r16 = new MeasQuantityResults();
      resultsSSB_Cell_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("resultsSSB_Cell_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (resultsSSB_Cell_r16 != null) resultsSSB_Cell_r16.print (_sb, "resultsSSB_Cell_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
