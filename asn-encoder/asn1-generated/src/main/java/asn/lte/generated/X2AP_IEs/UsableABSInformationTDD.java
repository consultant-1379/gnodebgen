/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class UsableABSInformationTDD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UsableABSInformationTDD";
   }

   public Asn1BitString usaable_abs_pattern_info;
   public UsableABSInformationTDD_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public UsableABSInformationTDD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UsableABSInformationTDD (
      Asn1BitString usaable_abs_pattern_info_,
      UsableABSInformationTDD_iE_Extensions iE_Extensions_
   ) {
      super();
      usaable_abs_pattern_info = usaable_abs_pattern_info_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UsableABSInformationTDD (
      Asn1BitString usaable_abs_pattern_info_
   ) {
      super();
      usaable_abs_pattern_info = usaable_abs_pattern_info_;
   }

   public void init () {
      usaable_abs_pattern_info = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return usaable_abs_pattern_info;
         case 1: return iE_Extensions;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "usaable-abs-pattern-info";
         case 1: return "iE-Extensions";
         case 2: return null;
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode usaable_abs_pattern_info

      buffer.getContext().eventDispatcher.startElement("usaable_abs_pattern_info", -1);

      usaable_abs_pattern_info = new Asn1BitString();
      boolean extbit_1 = buffer.decodeBit ("extbit_1");
      if (!extbit_1) {
         usaable_abs_pattern_info.decode (buffer, 1, 70);
      }
      else {
         usaable_abs_pattern_info.decode (buffer);
      }

      buffer.invokeCharacters(usaable_abs_pattern_info.toString());
      buffer.getContext().eventDispatcher.endElement("usaable_abs_pattern_info", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new UsableABSInformationTDD_iE_Extensions();
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
      if (usaable_abs_pattern_info != null) usaable_abs_pattern_info.print (_sb, "usaable_abs_pattern_info", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
