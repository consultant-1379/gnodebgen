/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MaxBW_PreferenceConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MaxBW-PreferenceConfig-r16";
   }

   public MaxBW_PreferenceConfig_r16_maxBW_PreferenceProhibitTimer_r16 maxBW_PreferenceProhibitTimer_r16 = null;

   public MaxBW_PreferenceConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MaxBW_PreferenceConfig_r16 (
      MaxBW_PreferenceConfig_r16_maxBW_PreferenceProhibitTimer_r16 maxBW_PreferenceProhibitTimer_r16_
   ) {
      super();
      maxBW_PreferenceProhibitTimer_r16 = maxBW_PreferenceProhibitTimer_r16_;
   }

   public void init () {
      maxBW_PreferenceProhibitTimer_r16 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxBW_PreferenceProhibitTimer_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxBW-PreferenceProhibitTimer-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxBW_PreferenceProhibitTimer_r16

      buffer.getContext().eventDispatcher.startElement("maxBW_PreferenceProhibitTimer_r16", -1);

      {
         int tval = MaxBW_PreferenceConfig_r16_maxBW_PreferenceProhibitTimer_r16.decodeEnumValue (buffer);
         maxBW_PreferenceProhibitTimer_r16 = MaxBW_PreferenceConfig_r16_maxBW_PreferenceProhibitTimer_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxBW_PreferenceProhibitTimer_r16", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxBW_PreferenceProhibitTimer_r16

      if (maxBW_PreferenceProhibitTimer_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxBW_PreferenceProhibitTimer_r16", -1);

         maxBW_PreferenceProhibitTimer_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxBW_PreferenceProhibitTimer_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxBW_PreferenceProhibitTimer_r16");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxBW_PreferenceProhibitTimer_r16 != null) maxBW_PreferenceProhibitTimer_r16.print (_sb, "maxBW_PreferenceProhibitTimer_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
