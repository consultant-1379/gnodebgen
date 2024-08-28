/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_shortDRX extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public DRX_Config_shortDRX_drx_ShortCycle drx_ShortCycle = null;
   public Asn1Integer drx_ShortCycleTimer;

   public DRX_Config_shortDRX () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRX_Config_shortDRX (
      DRX_Config_shortDRX_drx_ShortCycle drx_ShortCycle_,
      Asn1Integer drx_ShortCycleTimer_
   ) {
      super();
      drx_ShortCycle = drx_ShortCycle_;
      drx_ShortCycleTimer = drx_ShortCycleTimer_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public DRX_Config_shortDRX (DRX_Config_shortDRX_drx_ShortCycle drx_ShortCycle_,
      long drx_ShortCycleTimer_
   ) {
      super();
      drx_ShortCycle = drx_ShortCycle_;
      drx_ShortCycleTimer = new Asn1Integer (drx_ShortCycleTimer_);
   }

   public void init () {
      drx_ShortCycle = null;
      drx_ShortCycleTimer = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drx_ShortCycle;
         case 1: return drx_ShortCycleTimer;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drx-ShortCycle";
         case 1: return "drx-ShortCycleTimer";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode drx_ShortCycle

      buffer.getContext().eventDispatcher.startElement("drx_ShortCycle", -1);

      {
         int tval = DRX_Config_shortDRX_drx_ShortCycle.decodeEnumValue (buffer);
         drx_ShortCycle = DRX_Config_shortDRX_drx_ShortCycle.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("drx_ShortCycle", -1);

      // decode drx_ShortCycleTimer

      buffer.getContext().eventDispatcher.startElement("drx_ShortCycleTimer", -1);

      drx_ShortCycleTimer = new Asn1Integer();
      drx_ShortCycleTimer.decode (buffer, 1, 16);

      buffer.invokeCharacters(drx_ShortCycleTimer.toString());
      buffer.getContext().eventDispatcher.endElement("drx_ShortCycleTimer", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (drx_ShortCycle != null) drx_ShortCycle.print (_sb, "drx_ShortCycle", _level+1);
      if (drx_ShortCycleTimer != null) drx_ShortCycleTimer.print (_sb, "drx_ShortCycleTimer", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
