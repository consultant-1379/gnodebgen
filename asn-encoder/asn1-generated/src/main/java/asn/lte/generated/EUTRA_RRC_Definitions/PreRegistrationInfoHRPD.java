/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PreRegistrationInfoHRPD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PreRegistrationInfoHRPD";
   }

   public Asn1Boolean preRegistrationAllowed;
   public PreRegistrationZoneIdHRPD preRegistrationZoneId;  // optional
   public SecondaryPreRegistrationZoneIdListHRPD secondaryPreRegistrationZoneIdList;  // optional

   public PreRegistrationInfoHRPD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PreRegistrationInfoHRPD (
      Asn1Boolean preRegistrationAllowed_,
      PreRegistrationZoneIdHRPD preRegistrationZoneId_,
      SecondaryPreRegistrationZoneIdListHRPD secondaryPreRegistrationZoneIdList_
   ) {
      super();
      preRegistrationAllowed = preRegistrationAllowed_;
      preRegistrationZoneId = preRegistrationZoneId_;
      secondaryPreRegistrationZoneIdList = secondaryPreRegistrationZoneIdList_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PreRegistrationInfoHRPD (
      Asn1Boolean preRegistrationAllowed_
   ) {
      super();
      preRegistrationAllowed = preRegistrationAllowed_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PreRegistrationInfoHRPD (boolean preRegistrationAllowed_,
      long preRegistrationZoneId_,
      SecondaryPreRegistrationZoneIdListHRPD secondaryPreRegistrationZoneIdList_
   ) {
      super();
      preRegistrationAllowed = new Asn1Boolean (preRegistrationAllowed_);
      preRegistrationZoneId = new PreRegistrationZoneIdHRPD (preRegistrationZoneId_);
      secondaryPreRegistrationZoneIdList = secondaryPreRegistrationZoneIdList_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public PreRegistrationInfoHRPD (
      boolean preRegistrationAllowed_
   ) {
      super();
      preRegistrationAllowed = new Asn1Boolean (preRegistrationAllowed_);
   }

   public void init () {
      preRegistrationAllowed = null;
      preRegistrationZoneId = null;
      secondaryPreRegistrationZoneIdList = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return preRegistrationAllowed;
         case 1: return preRegistrationZoneId;
         case 2: return secondaryPreRegistrationZoneIdList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "preRegistrationAllowed";
         case 1: return "preRegistrationZoneId";
         case 2: return "secondaryPreRegistrationZoneIdList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean preRegistrationZoneIdPresent = buffer.decodeBit ("preRegistrationZoneIdPresent");
      boolean secondaryPreRegistrationZoneIdListPresent = buffer.decodeBit ("secondaryPreRegistrationZoneIdListPresent");

      // decode preRegistrationAllowed

      buffer.getContext().eventDispatcher.startElement("preRegistrationAllowed", -1);

      preRegistrationAllowed = new Asn1Boolean();
      preRegistrationAllowed.decode (buffer);

      buffer.invokeCharacters(preRegistrationAllowed.toString());
      buffer.getContext().eventDispatcher.endElement("preRegistrationAllowed", -1);

      // decode preRegistrationZoneId

      if (preRegistrationZoneIdPresent) {
         buffer.getContext().eventDispatcher.startElement("preRegistrationZoneId", -1);

         preRegistrationZoneId = new PreRegistrationZoneIdHRPD();
         preRegistrationZoneId.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("preRegistrationZoneId", -1);
      }
      else {
         preRegistrationZoneId = null;
      }

      // decode secondaryPreRegistrationZoneIdList

      if (secondaryPreRegistrationZoneIdListPresent) {
         buffer.getContext().eventDispatcher.startElement("secondaryPreRegistrationZoneIdList", -1);

         secondaryPreRegistrationZoneIdList = new SecondaryPreRegistrationZoneIdListHRPD();
         secondaryPreRegistrationZoneIdList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("secondaryPreRegistrationZoneIdList", -1);
      }
      else {
         secondaryPreRegistrationZoneIdList = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (preRegistrationAllowed != null) preRegistrationAllowed.print (_sb, "preRegistrationAllowed", _level+1);
      if (preRegistrationZoneId != null) preRegistrationZoneId.print (_sb, "preRegistrationZoneId", _level+1);
      if (secondaryPreRegistrationZoneIdList != null) secondaryPreRegistrationZoneIdList.print (_sb, "secondaryPreRegistrationZoneIdList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
