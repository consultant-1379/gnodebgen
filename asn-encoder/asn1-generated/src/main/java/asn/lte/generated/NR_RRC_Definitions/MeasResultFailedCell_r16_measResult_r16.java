/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultFailedCell_r16_measResult_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasResultFailedCell_r16_measResult_r16_cellResults_r16 cellResults_r16;
   public MeasResultFailedCell_r16_measResult_r16_rsIndexResults_r16 rsIndexResults_r16;

   public MeasResultFailedCell_r16_measResult_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultFailedCell_r16_measResult_r16 (
      MeasResultFailedCell_r16_measResult_r16_cellResults_r16 cellResults_r16_,
      MeasResultFailedCell_r16_measResult_r16_rsIndexResults_r16 rsIndexResults_r16_
   ) {
      super();
      cellResults_r16 = cellResults_r16_;
      rsIndexResults_r16 = rsIndexResults_r16_;
   }

   public void init () {
      cellResults_r16 = null;
      rsIndexResults_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellResults_r16;
         case 1: return rsIndexResults_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellResults-r16";
         case 1: return "rsIndexResults-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cellResults_r16

      buffer.getContext().eventDispatcher.startElement("cellResults_r16", -1);

      cellResults_r16 = new MeasResultFailedCell_r16_measResult_r16_cellResults_r16();
      cellResults_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellResults_r16", -1);

      // decode rsIndexResults_r16

      buffer.getContext().eventDispatcher.startElement("rsIndexResults_r16", -1);

      rsIndexResults_r16 = new MeasResultFailedCell_r16_measResult_r16_rsIndexResults_r16();
      rsIndexResults_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsIndexResults_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellResults_r16 != null) cellResults_r16.print (_sb, "cellResults_r16", _level+1);
      if (rsIndexResults_r16 != null) rsIndexResults_r16.print (_sb, "rsIndexResults_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
