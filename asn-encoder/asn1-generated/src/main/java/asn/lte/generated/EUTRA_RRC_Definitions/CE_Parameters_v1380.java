/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CE_Parameters_v1380 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CE-Parameters-v1380";
   }

   public CE_Parameters_v1380_tm6_CE_ModeA_r13 tm6_CE_ModeA_r13 = null;  // optional

   public CE_Parameters_v1380 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CE_Parameters_v1380 (
      CE_Parameters_v1380_tm6_CE_ModeA_r13 tm6_CE_ModeA_r13_
   ) {
      super();
      tm6_CE_ModeA_r13 = tm6_CE_ModeA_r13_;
   }

   public void init () {
      tm6_CE_ModeA_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return tm6_CE_ModeA_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "tm6-CE-ModeA-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean tm6_CE_ModeA_r13Present = buffer.decodeBit ("tm6_CE_ModeA_r13Present");

      // decode tm6_CE_ModeA_r13

      if (tm6_CE_ModeA_r13Present) {
         buffer.getContext().eventDispatcher.startElement("tm6_CE_ModeA_r13", -1);

         int tval = CE_Parameters_v1380_tm6_CE_ModeA_r13.decodeEnumValue (buffer);
         tm6_CE_ModeA_r13 = CE_Parameters_v1380_tm6_CE_ModeA_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tm6_CE_ModeA_r13", -1);
      }
      else {
         tm6_CE_ModeA_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (tm6_CE_ModeA_r13 != null) tm6_CE_ModeA_r13.print (_sb, "tm6_CE_ModeA_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
