/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _NPLUS4SET1 = 0;
   public static final int _NPLUS6SET1 = 1;
   public static final int _NPLUS6SET2 = 2;
   public static final int _NPLUS8SET2 = 3;

   // Singleton instances of MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15
   protected static final MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 _nplus4set1 = new MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15(0);
   protected static final MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 _nplus6set1 = new MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15(1);
   protected static final MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 _nplus6set2 = new MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15(2);
   protected static final MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 _nplus8set2 = new MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nplus4set1.
    */
   public static MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 nplus4set1() {
      return _nplus4set1;
   }

   /**
    * Singleton accessor method for nplus6set1.
    */
   public static MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 nplus6set1() {
      return _nplus6set1;
   }

   /**
    * Singleton accessor method for nplus6set2.
    */
   public static MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 nplus6set2() {
      return _nplus6set2;
   }

   /**
    * Singleton accessor method for nplus8set2.
    */
   public static MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 nplus8set2() {
      return _nplus8set2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15.valueOf( MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return nplus4set1();
         case 1: return nplus6set1();
         case 2: return nplus6set2();
         case 3: return nplus8set2();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MAC_MainConfig_shortTTI_AndSPT_r15_setup_proc_Timeline_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nplus4set1");
         case 1: return ("nplus6set1");
         case 2: return ("nplus6set2");
         case 3: return ("nplus8set2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
