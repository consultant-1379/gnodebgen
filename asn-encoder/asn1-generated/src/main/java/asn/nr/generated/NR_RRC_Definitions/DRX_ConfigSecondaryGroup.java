/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_ConfigSecondaryGroup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DRX-ConfigSecondaryGroup";
   }

   public DRX_ConfigSecondaryGroup_drx_onDurationTimer drx_onDurationTimer;
   public DRX_ConfigSecondaryGroup_drx_InactivityTimer drx_InactivityTimer = null;

   public DRX_ConfigSecondaryGroup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DRX_ConfigSecondaryGroup (
      DRX_ConfigSecondaryGroup_drx_onDurationTimer drx_onDurationTimer_,
      DRX_ConfigSecondaryGroup_drx_InactivityTimer drx_InactivityTimer_
   ) {
      super();
      drx_onDurationTimer = drx_onDurationTimer_;
      drx_InactivityTimer = drx_InactivityTimer_;
   }

   public void init () {
      drx_onDurationTimer = null;
      drx_InactivityTimer = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drx_onDurationTimer;
         case 1: return drx_InactivityTimer;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drx-onDurationTimer";
         case 1: return "drx-InactivityTimer";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode drx_onDurationTimer

      buffer.getContext().eventDispatcher.startElement("drx_onDurationTimer", -1);

      drx_onDurationTimer = new DRX_ConfigSecondaryGroup_drx_onDurationTimer();
      drx_onDurationTimer.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("drx_onDurationTimer", -1);

      // decode drx_InactivityTimer

      buffer.getContext().eventDispatcher.startElement("drx_InactivityTimer", -1);

      {
         int tval = DRX_ConfigSecondaryGroup_drx_InactivityTimer.decodeEnumValue (buffer);
         drx_InactivityTimer = DRX_ConfigSecondaryGroup_drx_InactivityTimer.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("drx_InactivityTimer", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode drx_onDurationTimer

      if (drx_onDurationTimer != null) {
         buffer.getContext().eventDispatcher.startElement("drx_onDurationTimer", -1);

         drx_onDurationTimer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drx_onDurationTimer", -1);
      }
      else throw new Asn1MissingRequiredException ("drx_onDurationTimer");

      // encode drx_InactivityTimer

      if (drx_InactivityTimer != null) {
         buffer.getContext().eventDispatcher.startElement("drx_InactivityTimer", -1);

         drx_InactivityTimer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("drx_InactivityTimer", -1);
      }
      else throw new Asn1MissingRequiredException ("drx_InactivityTimer");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (drx_onDurationTimer != null) drx_onDurationTimer.print (_sb, "drx_onDurationTimer", _level+1);
      if (drx_InactivityTimer != null) drx_InactivityTimer.print (_sb, "drx_InactivityTimer", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
