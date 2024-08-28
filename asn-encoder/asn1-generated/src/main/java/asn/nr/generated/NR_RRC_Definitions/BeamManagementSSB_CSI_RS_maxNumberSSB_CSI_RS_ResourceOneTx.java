/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N8 = 1;
   public static final int _N16 = 2;
   public static final int _N32 = 3;
   public static final int _N64 = 4;

   // Singleton instances of BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx
   protected static final BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx _n0 = new BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx(0);
   protected static final BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx _n8 = new BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx(1);
   protected static final BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx _n16 = new BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx(2);
   protected static final BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx _n32 = new BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx(3);
   protected static final BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx _n64 = new BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx n32() {
      return _n32;
   }

   /**
    * Singleton accessor method for n64.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx n64() {
      return _n64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx.valueOf( BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n8();
         case 2: return n16();
         case 3: return n32();
         case 4: return n64();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (BeamManagementSSB_CSI_RS_maxNumberSSB_CSI_RS_ResourceOneTx.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n0 */break;
         case 1: ui = 1; /* n8 */break;
         case 2: ui = 2; /* n16 */break;
         case 3: ui = 3; /* n32 */break;
         case 4: ui = 4; /* n64 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 5);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n8");
         case 2: return ("n16");
         case 3: return ("n32");
         case 4: return ("n64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
