/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandCombinationParameters_v1270 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombinationParameters-v1270";
   }

   public BandCombinationParameters_v1270_bandParameterList_v1270 bandParameterList_v1270;  // optional

   public BandCombinationParameters_v1270 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandCombinationParameters_v1270 (
      BandCombinationParameters_v1270_bandParameterList_v1270 bandParameterList_v1270_
   ) {
      super();
      bandParameterList_v1270 = bandParameterList_v1270_;
   }

   public void init () {
      bandParameterList_v1270 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandParameterList_v1270;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandParameterList-v1270";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bandParameterList_v1270Present = buffer.decodeBit ("bandParameterList_v1270Present");

      // decode bandParameterList_v1270

      if (bandParameterList_v1270Present) {
         buffer.getContext().eventDispatcher.startElement("bandParameterList_v1270", -1);

         bandParameterList_v1270 = new BandCombinationParameters_v1270_bandParameterList_v1270();
         bandParameterList_v1270.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bandParameterList_v1270", -1);
      }
      else {
         bandParameterList_v1270 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandParameterList_v1270 != null) bandParameterList_v1270.print (_sb, "bandParameterList_v1270", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
