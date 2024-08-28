/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReestabUE_Identity extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReestabUE-Identity";
   }

   public C_RNTI c_RNTI;
   public PhysCellId physCellId;
   public ShortMAC_I shortMAC_I;

   public ReestabUE_Identity () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReestabUE_Identity (
      C_RNTI c_RNTI_,
      PhysCellId physCellId_,
      ShortMAC_I shortMAC_I_
   ) {
      super();
      c_RNTI = c_RNTI_;
      physCellId = physCellId_;
      shortMAC_I = shortMAC_I_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReestabUE_Identity (C_RNTI c_RNTI_,
      long physCellId_,
      ShortMAC_I shortMAC_I_
   ) {
      super();
      c_RNTI = c_RNTI_;
      physCellId = new PhysCellId (physCellId_);
      shortMAC_I = shortMAC_I_;
   }

   public void init () {
      c_RNTI = null;
      physCellId = null;
      shortMAC_I = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return c_RNTI;
         case 1: return physCellId;
         case 2: return shortMAC_I;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "c-RNTI";
         case 1: return "physCellId";
         case 2: return "shortMAC-I";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode c_RNTI

      buffer.getContext().eventDispatcher.startElement("c_RNTI", -1);

      c_RNTI = new C_RNTI();
      c_RNTI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("c_RNTI", -1);

      // decode physCellId

      buffer.getContext().eventDispatcher.startElement("physCellId", -1);

      physCellId = new PhysCellId();
      physCellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId", -1);

      // decode shortMAC_I

      buffer.getContext().eventDispatcher.startElement("shortMAC_I", -1);

      shortMAC_I = new ShortMAC_I();
      shortMAC_I.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("shortMAC_I", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (c_RNTI != null) c_RNTI.print (_sb, "c_RNTI", _level+1);
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (shortMAC_I != null) shortMAC_I.print (_sb, "shortMAC_I", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
