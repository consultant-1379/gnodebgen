/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class LastVisitedCell_Item extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LastVisitedCell-Item";
   }

   // Choice element identifier constants
   public final static byte _E_UTRAN_CELL = 1;
   public final static byte _UTRAN_CELL = 2;
   public final static byte _GERAN_CELL = 3;
   public final static byte _NG_RAN_CELL = 4;
   public final static byte _EXTELEM1 = 5;

   public LastVisitedCell_Item () {
      super();
   }

   public LastVisitedCell_Item (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _E_UTRAN_CELL: return "e_UTRAN_Cell";
      case _UTRAN_CELL: return "uTRAN_Cell";
      case _GERAN_CELL: return "gERAN_Cell";
      case _NG_RAN_CELL: return "nG_RAN_Cell";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_e_UTRAN_Cell (LastVisitedEUTRANCellInformation value) {
      setElement (_E_UTRAN_CELL, value);
   }

   public void set_uTRAN_Cell (LastVisitedUTRANCellInformation value) {
      setElement (_UTRAN_CELL, value);
   }

   public void set_gERAN_Cell (LastVisitedGERANCellInformation value) {
      setElement (_GERAN_CELL, value);
   }

   public void set_nG_RAN_Cell (LastVisitedNGRANCellInformation value) {
      setElement (_NG_RAN_CELL, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (3, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // e_UTRAN_Cell
            case 0: { 
               LastVisitedEUTRANCellInformation e_UTRAN_Cell;
               element = e_UTRAN_Cell = new LastVisitedEUTRANCellInformation();
               e_UTRAN_Cell.decode (buffer);
               break;
            }

            // uTRAN_Cell
            case 1: { 
               LastVisitedUTRANCellInformation uTRAN_Cell;
               element = uTRAN_Cell = new LastVisitedUTRANCellInformation();
               uTRAN_Cell.decode (buffer);
               break;
            }

            // gERAN_Cell
            case 2: { 
               LastVisitedGERANCellInformation gERAN_Cell;
               element = gERAN_Cell = new LastVisitedGERANCellInformation();
               gERAN_Cell.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 4;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // nG_RAN_Cell
            case 0: { 
               LastVisitedNGRANCellInformation nG_RAN_Cell;
               element = nG_RAN_Cell = new LastVisitedNGRANCellInformation();
               nG_RAN_Cell.decode (buffer);
               break;
            }

            // extElem1
            case 1: { 
               Asn1OpenType extElem1;
               element = extElem1 = new Asn1OpenType();
               extElem1.decode (buffer);

               buffer.invokeCharacters(extElem1.toString());
               break;
            }

            default:
               setElement (_EXTELEM1, openType);
               buffer.invokeCharacters (openType.toString());
         }

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
