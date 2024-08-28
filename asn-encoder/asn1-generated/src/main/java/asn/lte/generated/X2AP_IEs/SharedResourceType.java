/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SharedResourceType extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SharedResourceType";
   }

   // Choice element identifier constants
   public final static byte _ULONLYSHARING = 1;
   public final static byte _ULANDDLSHARING = 2;
   public final static byte _EXTELEM1 = 3;

   public SharedResourceType () {
      super();
   }

   public SharedResourceType (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ULONLYSHARING: return "uLOnlySharing";
      case _ULANDDLSHARING: return "uLandDLSharing";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_uLOnlySharing (ULOnlySharing value) {
      setElement (_ULONLYSHARING, value);
   }

   public void set_uLandDLSharing (ULandDLSharing value) {
      setElement (_ULANDDLSHARING, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (2, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // uLOnlySharing
            case 0: { 
               ULOnlySharing uLOnlySharing;
               element = uLOnlySharing = new ULOnlySharing();
               uLOnlySharing.decode (buffer);
               break;
            }

            // uLandDLSharing
            case 1: { 
               ULandDLSharing uLandDLSharing;
               element = uLandDLSharing = new ULandDLSharing();
               uLandDLSharing.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 3;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
