/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_ReferenceSignalsNPUSCH_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UL-ReferenceSignalsNPUSCH-NB-r13";
   }

   public Asn1Boolean groupHoppingEnabled_r13;
   public Asn1Integer groupAssignmentNPUSCH_r13;

   public UL_ReferenceSignalsNPUSCH_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UL_ReferenceSignalsNPUSCH_NB_r13 (
      Asn1Boolean groupHoppingEnabled_r13_,
      Asn1Integer groupAssignmentNPUSCH_r13_
   ) {
      super();
      groupHoppingEnabled_r13 = groupHoppingEnabled_r13_;
      groupAssignmentNPUSCH_r13 = groupAssignmentNPUSCH_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UL_ReferenceSignalsNPUSCH_NB_r13 (boolean groupHoppingEnabled_r13_,
      long groupAssignmentNPUSCH_r13_
   ) {
      super();
      groupHoppingEnabled_r13 = new Asn1Boolean (groupHoppingEnabled_r13_);
      groupAssignmentNPUSCH_r13 = new Asn1Integer (groupAssignmentNPUSCH_r13_);
   }

   public void init () {
      groupHoppingEnabled_r13 = null;
      groupAssignmentNPUSCH_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return groupHoppingEnabled_r13;
         case 1: return groupAssignmentNPUSCH_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "groupHoppingEnabled-r13";
         case 1: return "groupAssignmentNPUSCH-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode groupHoppingEnabled_r13

      buffer.getContext().eventDispatcher.startElement("groupHoppingEnabled_r13", -1);

      groupHoppingEnabled_r13 = new Asn1Boolean();
      groupHoppingEnabled_r13.decode (buffer);

      buffer.invokeCharacters(groupHoppingEnabled_r13.toString());
      buffer.getContext().eventDispatcher.endElement("groupHoppingEnabled_r13", -1);

      // decode groupAssignmentNPUSCH_r13

      buffer.getContext().eventDispatcher.startElement("groupAssignmentNPUSCH_r13", -1);

      groupAssignmentNPUSCH_r13 = new Asn1Integer();
      groupAssignmentNPUSCH_r13.decode (buffer, 0, 29);

      buffer.invokeCharacters(groupAssignmentNPUSCH_r13.toString());
      buffer.getContext().eventDispatcher.endElement("groupAssignmentNPUSCH_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (groupHoppingEnabled_r13 != null) groupHoppingEnabled_r13.print (_sb, "groupHoppingEnabled_r13", _level+1);
      if (groupAssignmentNPUSCH_r13 != null) groupAssignmentNPUSCH_r13.print (_sb, "groupAssignmentNPUSCH_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
