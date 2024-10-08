/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasGapConfigDensePRS_r15_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasGapConfigDensePRS_r15_setup_gapOffsetDensePRS_r15 gapOffsetDensePRS_r15;

   public MeasGapConfigDensePRS_r15_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasGapConfigDensePRS_r15_setup (
      MeasGapConfigDensePRS_r15_setup_gapOffsetDensePRS_r15 gapOffsetDensePRS_r15_
   ) {
      super();
      gapOffsetDensePRS_r15 = gapOffsetDensePRS_r15_;
   }

   public void init () {
      gapOffsetDensePRS_r15 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gapOffsetDensePRS_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gapOffsetDensePRS-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode gapOffsetDensePRS_r15

      buffer.getContext().eventDispatcher.startElement("gapOffsetDensePRS_r15", -1);

      gapOffsetDensePRS_r15 = new MeasGapConfigDensePRS_r15_setup_gapOffsetDensePRS_r15();
      gapOffsetDensePRS_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("gapOffsetDensePRS_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (gapOffsetDensePRS_r15 != null) gapOffsetDensePRS_r15.print (_sb, "gapOffsetDensePRS_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
