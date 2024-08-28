/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_IEs;

import com.objsys.asn1j.runtime.*;

public class CauseProtocol extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CauseProtocol";
   }

   // Integer constants for switch-case
   public static final int _TRANSFER_SYNTAX_ERROR = 0;
   public static final int _ABSTRACT_SYNTAX_ERROR_REJECT = 1;
   public static final int _ABSTRACT_SYNTAX_ERROR_IGNORE_AND_NOTIFY = 2;
   public static final int _MESSAGE_NOT_COMPATIBLE_WITH_RECEIVER_STATE = 3;
   public static final int _SEMANTIC_ERROR = 4;
   public static final int _UNSPECIFIED = 5;
   public static final int _ABSTRACT_SYNTAX_ERROR_FALSELY_CONSTRUCTED_MESSAGE = 6;

   // Singleton instances of CauseProtocol
   protected static final CauseProtocol _transfer_syntax_error = new CauseProtocol(0);
   protected static final CauseProtocol _abstract_syntax_error_reject = new CauseProtocol(1);
   protected static final CauseProtocol _abstract_syntax_error_ignore_and_notify = new CauseProtocol(2);
   protected static final CauseProtocol _message_not_compatible_with_receiver_state = new CauseProtocol(3);
   protected static final CauseProtocol _semantic_error = new CauseProtocol(4);
   protected static final CauseProtocol _unspecified = new CauseProtocol(5);
   protected static final CauseProtocol _abstract_syntax_error_falsely_constructed_message = new CauseProtocol(6);
   private static CauseProtocol __undefined = new CauseProtocol(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    */
   protected CauseProtocol (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for transfer_syntax_error.
    */
   public static CauseProtocol transfer_syntax_error() {
      return _transfer_syntax_error;
   }

   /**
    * Singleton accessor method for abstract_syntax_error_reject.
    */
   public static CauseProtocol abstract_syntax_error_reject() {
      return _abstract_syntax_error_reject;
   }

   /**
    * Singleton accessor method for abstract_syntax_error_ignore_and_notify.
    */
   public static CauseProtocol abstract_syntax_error_ignore_and_notify() {
      return _abstract_syntax_error_ignore_and_notify;
   }

   /**
    * Singleton accessor method for message_not_compatible_with_receiver_state.
    */
   public static CauseProtocol message_not_compatible_with_receiver_state() {
      return _message_not_compatible_with_receiver_state;
   }

   /**
    * Singleton accessor method for semantic_error.
    */
   public static CauseProtocol semantic_error() {
      return _semantic_error;
   }

   /**
    * Singleton accessor method for unspecified.
    */
   public static CauseProtocol unspecified() {
      return _unspecified;
   }

   /**
    * Singleton accessor method for abstract_syntax_error_falsely_constructed_message.
    */
   public static CauseProtocol abstract_syntax_error_falsely_constructed_message() {
      return _abstract_syntax_error_falsely_constructed_message;
   }

   /** Undefined value. */
   protected static CauseProtocol __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CauseProtocol.valueOf( CauseProtocol.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CauseProtocol valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return transfer_syntax_error();
         case 1: return abstract_syntax_error_reject();
         case 2: return abstract_syntax_error_ignore_and_notify();
         case 3: return message_not_compatible_with_receiver_state();
         case 4: return semantic_error();
         case 5: return unspecified();
         case 6: return abstract_syntax_error_falsely_constructed_message();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         return 0x7fffffff;
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (7);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            case 4: ret =  4; break;
            case 5: ret =  5; break;
            case 6: ret =  6; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CauseProtocol.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("transfer-syntax-error");
         case 1: return ("abstract-syntax-error-reject");
         case 2: return ("abstract-syntax-error-ignore-and-notify");
         case 3: return ("message-not-compatible-with-receiver-state");
         case 4: return ("semantic-error");
         case 5: return ("unspecified");
         case 6: return ("abstract-syntax-error-falsely-constructed-message");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
