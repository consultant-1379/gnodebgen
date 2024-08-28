/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_DelayValueConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UL-DelayValueConfig-r16";
   }

   public UL_DelayValueConfig_r16_delay_DRBlist delay_DRBlist;

   public UL_DelayValueConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UL_DelayValueConfig_r16 (
      UL_DelayValueConfig_r16_delay_DRBlist delay_DRBlist_
   ) {
      super();
      delay_DRBlist = delay_DRBlist_;
   }

   public void init () {
      delay_DRBlist = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return delay_DRBlist;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "delay-DRBlist";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode delay_DRBlist

      buffer.getContext().eventDispatcher.startElement("delay_DRBlist", -1);

      delay_DRBlist = new UL_DelayValueConfig_r16_delay_DRBlist();
      delay_DRBlist.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("delay_DRBlist", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (delay_DRBlist != null) delay_DRBlist.print (_sb, "delay_DRBlist", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
