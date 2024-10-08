/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class GuardBand_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "GuardBand-r16";
   }

   public Asn1Integer startCRB_r16;
   public Asn1Integer nrofCRBs_r16;

   public GuardBand_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public GuardBand_r16 (
      Asn1Integer startCRB_r16_,
      Asn1Integer nrofCRBs_r16_
   ) {
      super();
      startCRB_r16 = startCRB_r16_;
      nrofCRBs_r16 = nrofCRBs_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public GuardBand_r16 (long startCRB_r16_,
      long nrofCRBs_r16_
   ) {
      super();
      startCRB_r16 = new Asn1Integer (startCRB_r16_);
      nrofCRBs_r16 = new Asn1Integer (nrofCRBs_r16_);
   }

   public void init () {
      startCRB_r16 = null;
      nrofCRBs_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return startCRB_r16;
         case 1: return nrofCRBs_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "startCRB-r16";
         case 1: return "nrofCRBs-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode startCRB_r16

      buffer.getContext().eventDispatcher.startElement("startCRB_r16", -1);

      startCRB_r16 = new Asn1Integer();
      startCRB_r16.decode (buffer, 0, 274);

      buffer.invokeCharacters(startCRB_r16.toString());
      buffer.getContext().eventDispatcher.endElement("startCRB_r16", -1);

      // decode nrofCRBs_r16

      buffer.getContext().eventDispatcher.startElement("nrofCRBs_r16", -1);

      nrofCRBs_r16 = new Asn1Integer();
      nrofCRBs_r16.decode (buffer, 0, 15);

      buffer.invokeCharacters(nrofCRBs_r16.toString());
      buffer.getContext().eventDispatcher.endElement("nrofCRBs_r16", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (startCRB_r16 != null) startCRB_r16.print (_sb, "startCRB_r16", _level+1);
      if (nrofCRBs_r16 != null) nrofCRBs_r16.print (_sb, "nrofCRBs_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
