/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class RecommendedCellItem extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RecommendedCellItem";
   }

   public EUTRAN_CGI eUTRAN_CGI;
   public Asn1Integer timeStayedInCell;  // optional
   public RecommendedCellItem_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public RecommendedCellItem () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RecommendedCellItem (
      EUTRAN_CGI eUTRAN_CGI_,
      Asn1Integer timeStayedInCell_,
      RecommendedCellItem_iE_Extensions iE_Extensions_
   ) {
      super();
      eUTRAN_CGI = eUTRAN_CGI_;
      timeStayedInCell = timeStayedInCell_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RecommendedCellItem (
      EUTRAN_CGI eUTRAN_CGI_
   ) {
      super();
      eUTRAN_CGI = eUTRAN_CGI_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RecommendedCellItem (EUTRAN_CGI eUTRAN_CGI_,
      long timeStayedInCell_,
      RecommendedCellItem_iE_Extensions iE_Extensions_
   ) {
      super();
      eUTRAN_CGI = eUTRAN_CGI_;
      timeStayedInCell = new Asn1Integer (timeStayedInCell_);
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      eUTRAN_CGI = null;
      timeStayedInCell = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eUTRAN_CGI;
         case 1: return timeStayedInCell;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eUTRAN-CGI";
         case 1: return "timeStayedInCell";
         case 2: return "iE-Extensions";
         case 3: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean timeStayedInCellPresent = buffer.decodeBit ("timeStayedInCellPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode eUTRAN_CGI

      buffer.getContext().eventDispatcher.startElement("eUTRAN_CGI", -1);

      eUTRAN_CGI = new EUTRAN_CGI();
      eUTRAN_CGI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eUTRAN_CGI", -1);

      // decode timeStayedInCell

      if (timeStayedInCellPresent) {
         buffer.getContext().eventDispatcher.startElement("timeStayedInCell", -1);

         timeStayedInCell = new Asn1Integer();
         timeStayedInCell.decode (buffer, 0, 4095);

         buffer.invokeCharacters(timeStayedInCell.toString());
         buffer.getContext().eventDispatcher.endElement("timeStayedInCell", -1);
      }
      else {
         timeStayedInCell = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new RecommendedCellItem_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eUTRAN_CGI != null) eUTRAN_CGI.print (_sb, "eUTRAN_CGI", _level+1);
      if (timeStayedInCell != null) timeStayedInCell.print (_sb, "timeStayedInCell", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
