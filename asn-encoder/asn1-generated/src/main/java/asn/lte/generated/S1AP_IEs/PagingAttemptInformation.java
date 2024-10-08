/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class PagingAttemptInformation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PagingAttemptInformation";
   }

   public PagingAttemptCount pagingAttemptCount;
   public IntendedNumberOfPagingAttempts intendedNumberOfPagingAttempts;
   public NextPagingAreaScope nextPagingAreaScope = null;  // optional
   public PagingAttemptInformation_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public PagingAttemptInformation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PagingAttemptInformation (
      PagingAttemptCount pagingAttemptCount_,
      IntendedNumberOfPagingAttempts intendedNumberOfPagingAttempts_,
      NextPagingAreaScope nextPagingAreaScope_,
      PagingAttemptInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      pagingAttemptCount = pagingAttemptCount_;
      intendedNumberOfPagingAttempts = intendedNumberOfPagingAttempts_;
      nextPagingAreaScope = nextPagingAreaScope_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PagingAttemptInformation (
      PagingAttemptCount pagingAttemptCount_,
      IntendedNumberOfPagingAttempts intendedNumberOfPagingAttempts_
   ) {
      super();
      pagingAttemptCount = pagingAttemptCount_;
      intendedNumberOfPagingAttempts = intendedNumberOfPagingAttempts_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PagingAttemptInformation (long pagingAttemptCount_,
      long intendedNumberOfPagingAttempts_,
      NextPagingAreaScope nextPagingAreaScope_,
      PagingAttemptInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      pagingAttemptCount = new PagingAttemptCount (pagingAttemptCount_);
      intendedNumberOfPagingAttempts = new IntendedNumberOfPagingAttempts (intendedNumberOfPagingAttempts_);
      nextPagingAreaScope = nextPagingAreaScope_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PagingAttemptInformation (
      long pagingAttemptCount_,
      long intendedNumberOfPagingAttempts_
   ) {
      super();
      pagingAttemptCount = new PagingAttemptCount (pagingAttemptCount_);
      intendedNumberOfPagingAttempts = new IntendedNumberOfPagingAttempts (intendedNumberOfPagingAttempts_);
   }

   public void init () {
      pagingAttemptCount = null;
      intendedNumberOfPagingAttempts = null;
      nextPagingAreaScope = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pagingAttemptCount;
         case 1: return intendedNumberOfPagingAttempts;
         case 2: return nextPagingAreaScope;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pagingAttemptCount";
         case 1: return "intendedNumberOfPagingAttempts";
         case 2: return "nextPagingAreaScope";
         case 3: return "iE-Extensions";
         case 4: return null;
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

      boolean nextPagingAreaScopePresent = buffer.decodeBit ("nextPagingAreaScopePresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode pagingAttemptCount

      buffer.getContext().eventDispatcher.startElement("pagingAttemptCount", -1);

      pagingAttemptCount = new PagingAttemptCount();
      pagingAttemptCount.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pagingAttemptCount", -1);

      // decode intendedNumberOfPagingAttempts

      buffer.getContext().eventDispatcher.startElement("intendedNumberOfPagingAttempts", -1);

      intendedNumberOfPagingAttempts = new IntendedNumberOfPagingAttempts();
      intendedNumberOfPagingAttempts.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("intendedNumberOfPagingAttempts", -1);

      // decode nextPagingAreaScope

      if (nextPagingAreaScopePresent) {
         buffer.getContext().eventDispatcher.startElement("nextPagingAreaScope", -1);

         int tval = NextPagingAreaScope.decodeEnumValue (buffer);
         nextPagingAreaScope = NextPagingAreaScope.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nextPagingAreaScope", -1);
      }
      else {
         nextPagingAreaScope = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new PagingAttemptInformation_iE_Extensions();
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
      if (pagingAttemptCount != null) pagingAttemptCount.print (_sb, "pagingAttemptCount", _level+1);
      if (intendedNumberOfPagingAttempts != null) intendedNumberOfPagingAttempts.print (_sb, "intendedNumberOfPagingAttempts", _level+1);
      if (nextPagingAreaScope != null) nextPagingAreaScope.print (_sb, "nextPagingAreaScope", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
