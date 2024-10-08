/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Other_Parameters_v1360 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Other-Parameters-v1360";
   }

   public Other_Parameters_v1360_inDeviceCoexInd_HardwareSharingInd_r13 inDeviceCoexInd_HardwareSharingInd_r13 = null;  // optional

   public Other_Parameters_v1360 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Other_Parameters_v1360 (
      Other_Parameters_v1360_inDeviceCoexInd_HardwareSharingInd_r13 inDeviceCoexInd_HardwareSharingInd_r13_
   ) {
      super();
      inDeviceCoexInd_HardwareSharingInd_r13 = inDeviceCoexInd_HardwareSharingInd_r13_;
   }

   public void init () {
      inDeviceCoexInd_HardwareSharingInd_r13 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return inDeviceCoexInd_HardwareSharingInd_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "inDeviceCoexInd-HardwareSharingInd-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean inDeviceCoexInd_HardwareSharingInd_r13Present = buffer.decodeBit ("inDeviceCoexInd_HardwareSharingInd_r13Present");

      // decode inDeviceCoexInd_HardwareSharingInd_r13

      if (inDeviceCoexInd_HardwareSharingInd_r13Present) {
         buffer.getContext().eventDispatcher.startElement("inDeviceCoexInd_HardwareSharingInd_r13", -1);

         int tval = Other_Parameters_v1360_inDeviceCoexInd_HardwareSharingInd_r13.decodeEnumValue (buffer);
         inDeviceCoexInd_HardwareSharingInd_r13 = Other_Parameters_v1360_inDeviceCoexInd_HardwareSharingInd_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("inDeviceCoexInd_HardwareSharingInd_r13", -1);
      }
      else {
         inDeviceCoexInd_HardwareSharingInd_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (inDeviceCoexInd_HardwareSharingInd_r13 != null) inDeviceCoexInd_HardwareSharingInd_r13.print (_sb, "inDeviceCoexInd_HardwareSharingInd_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
