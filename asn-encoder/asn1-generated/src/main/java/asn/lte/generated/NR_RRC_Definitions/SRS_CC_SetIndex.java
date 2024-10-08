/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_CC_SetIndex extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-CC-SetIndex";
   }

   public Asn1Integer cc_SetIndex;  // optional
   public Asn1Integer cc_IndexInOneCC_Set;  // optional

   public SRS_CC_SetIndex () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_CC_SetIndex (
      Asn1Integer cc_SetIndex_,
      Asn1Integer cc_IndexInOneCC_Set_
   ) {
      super();
      cc_SetIndex = cc_SetIndex_;
      cc_IndexInOneCC_Set = cc_IndexInOneCC_Set_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_CC_SetIndex (long cc_SetIndex_,
      long cc_IndexInOneCC_Set_
   ) {
      super();
      cc_SetIndex = new Asn1Integer (cc_SetIndex_);
      cc_IndexInOneCC_Set = new Asn1Integer (cc_IndexInOneCC_Set_);
   }

   public void init () {
      cc_SetIndex = null;
      cc_IndexInOneCC_Set = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cc_SetIndex;
         case 1: return cc_IndexInOneCC_Set;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cc-SetIndex";
         case 1: return "cc-IndexInOneCC-Set";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cc_SetIndexPresent = buffer.decodeBit ("cc_SetIndexPresent");
      boolean cc_IndexInOneCC_SetPresent = buffer.decodeBit ("cc_IndexInOneCC_SetPresent");

      // decode cc_SetIndex

      if (cc_SetIndexPresent) {
         buffer.getContext().eventDispatcher.startElement("cc_SetIndex", -1);

         cc_SetIndex = new Asn1Integer();
         cc_SetIndex.decode (buffer, 0, 3);

         buffer.invokeCharacters(cc_SetIndex.toString());
         buffer.getContext().eventDispatcher.endElement("cc_SetIndex", -1);
      }
      else {
         cc_SetIndex = null;
      }

      // decode cc_IndexInOneCC_Set

      if (cc_IndexInOneCC_SetPresent) {
         buffer.getContext().eventDispatcher.startElement("cc_IndexInOneCC_Set", -1);

         cc_IndexInOneCC_Set = new Asn1Integer();
         cc_IndexInOneCC_Set.decode (buffer, 0, 7);

         buffer.invokeCharacters(cc_IndexInOneCC_Set.toString());
         buffer.getContext().eventDispatcher.endElement("cc_IndexInOneCC_Set", -1);
      }
      else {
         cc_IndexInOneCC_Set = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cc_SetIndex != null) cc_SetIndex.print (_sb, "cc_SetIndex", _level+1);
      if (cc_IndexInOneCC_Set != null) cc_IndexInOneCC_Set.print (_sb, "cc_IndexInOneCC_Set", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
