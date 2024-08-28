/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ExpectedUEActivityBehaviour extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ExpectedUEActivityBehaviour";
   }

   public ExpectedActivityPeriod expectedActivityPeriod;  // optional
   public ExpectedIdlePeriod expectedIdlePeriod;  // optional
   public SourceOfUEActivityBehaviourInformation sourceofUEActivityBehaviourInformation = null;  // optional
   public ExpectedUEActivityBehaviour_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public ExpectedUEActivityBehaviour () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ExpectedUEActivityBehaviour (
      ExpectedActivityPeriod expectedActivityPeriod_,
      ExpectedIdlePeriod expectedIdlePeriod_,
      SourceOfUEActivityBehaviourInformation sourceofUEActivityBehaviourInformation_,
      ExpectedUEActivityBehaviour_iE_Extensions iE_Extensions_
   ) {
      super();
      expectedActivityPeriod = expectedActivityPeriod_;
      expectedIdlePeriod = expectedIdlePeriod_;
      sourceofUEActivityBehaviourInformation = sourceofUEActivityBehaviourInformation_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ExpectedUEActivityBehaviour (long expectedActivityPeriod_,
      long expectedIdlePeriod_,
      SourceOfUEActivityBehaviourInformation sourceofUEActivityBehaviourInformation_,
      ExpectedUEActivityBehaviour_iE_Extensions iE_Extensions_
   ) {
      super();
      expectedActivityPeriod = new ExpectedActivityPeriod (expectedActivityPeriod_);
      expectedIdlePeriod = new ExpectedIdlePeriod (expectedIdlePeriod_);
      sourceofUEActivityBehaviourInformation = sourceofUEActivityBehaviourInformation_;
      iE_Extensions = iE_Extensions_;
   }

   public void init () {
      expectedActivityPeriod = null;
      expectedIdlePeriod = null;
      sourceofUEActivityBehaviourInformation = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return expectedActivityPeriod;
         case 1: return expectedIdlePeriod;
         case 2: return sourceofUEActivityBehaviourInformation;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "expectedActivityPeriod";
         case 1: return "expectedIdlePeriod";
         case 2: return "sourceofUEActivityBehaviourInformation";
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

      boolean expectedActivityPeriodPresent = buffer.decodeBit ("expectedActivityPeriodPresent");
      boolean expectedIdlePeriodPresent = buffer.decodeBit ("expectedIdlePeriodPresent");
      boolean sourceofUEActivityBehaviourInformationPresent = buffer.decodeBit ("sourceofUEActivityBehaviourInformationPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode expectedActivityPeriod

      if (expectedActivityPeriodPresent) {
         buffer.getContext().eventDispatcher.startElement("expectedActivityPeriod", -1);

         expectedActivityPeriod = new ExpectedActivityPeriod();
         expectedActivityPeriod.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("expectedActivityPeriod", -1);
      }
      else {
         expectedActivityPeriod = null;
      }

      // decode expectedIdlePeriod

      if (expectedIdlePeriodPresent) {
         buffer.getContext().eventDispatcher.startElement("expectedIdlePeriod", -1);

         expectedIdlePeriod = new ExpectedIdlePeriod();
         expectedIdlePeriod.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("expectedIdlePeriod", -1);
      }
      else {
         expectedIdlePeriod = null;
      }

      // decode sourceofUEActivityBehaviourInformation

      if (sourceofUEActivityBehaviourInformationPresent) {
         buffer.getContext().eventDispatcher.startElement("sourceofUEActivityBehaviourInformation", -1);

         int tval = SourceOfUEActivityBehaviourInformation.decodeEnumValue (buffer);
         sourceofUEActivityBehaviourInformation = SourceOfUEActivityBehaviourInformation.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sourceofUEActivityBehaviourInformation", -1);
      }
      else {
         sourceofUEActivityBehaviourInformation = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new ExpectedUEActivityBehaviour_iE_Extensions();
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
      if (expectedActivityPeriod != null) expectedActivityPeriod.print (_sb, "expectedActivityPeriod", _level+1);
      if (expectedIdlePeriod != null) expectedIdlePeriod.print (_sb, "expectedIdlePeriod", _level+1);
      if (sourceofUEActivityBehaviourInformation != null) sourceofUEActivityBehaviourInformation.print (_sb, "sourceofUEActivityBehaviourInformation", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
