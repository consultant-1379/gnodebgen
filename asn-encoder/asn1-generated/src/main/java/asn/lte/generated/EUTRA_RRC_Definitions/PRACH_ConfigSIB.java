/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PRACH_ConfigSIB extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PRACH-ConfigSIB";
   }

   public Asn1Integer rootSequenceIndex;
   public PRACH_ConfigInfo prach_ConfigInfo;

   public PRACH_ConfigSIB () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PRACH_ConfigSIB (
      Asn1Integer rootSequenceIndex_,
      PRACH_ConfigInfo prach_ConfigInfo_
   ) {
      super();
      rootSequenceIndex = rootSequenceIndex_;
      prach_ConfigInfo = prach_ConfigInfo_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PRACH_ConfigSIB (long rootSequenceIndex_,
      PRACH_ConfigInfo prach_ConfigInfo_
   ) {
      super();
      rootSequenceIndex = new Asn1Integer (rootSequenceIndex_);
      prach_ConfigInfo = prach_ConfigInfo_;
   }

   public void init () {
      rootSequenceIndex = null;
      prach_ConfigInfo = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rootSequenceIndex;
         case 1: return prach_ConfigInfo;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rootSequenceIndex";
         case 1: return "prach-ConfigInfo";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rootSequenceIndex

      buffer.getContext().eventDispatcher.startElement("rootSequenceIndex", -1);

      rootSequenceIndex = new Asn1Integer();
      rootSequenceIndex.decode (buffer, 0, 837);

      buffer.invokeCharacters(rootSequenceIndex.toString());
      buffer.getContext().eventDispatcher.endElement("rootSequenceIndex", -1);

      // decode prach_ConfigInfo

      buffer.getContext().eventDispatcher.startElement("prach_ConfigInfo", -1);

      prach_ConfigInfo = new PRACH_ConfigInfo();
      prach_ConfigInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("prach_ConfigInfo", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rootSequenceIndex != null) rootSequenceIndex.print (_sb, "rootSequenceIndex", _level+1);
      if (prach_ConfigInfo != null) prach_ConfigInfo.print (_sb, "prach_ConfigInfo", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
