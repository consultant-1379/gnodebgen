/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ULInformationTransferMRDC_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ULInformationTransferMRDC-IEs";
   }

   public Asn1OctetString ul_DCCH_MessageNR;  // optional
   public Asn1OctetString ul_DCCH_MessageEUTRA;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public ULInformationTransferMRDC_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public ULInformationTransferMRDC_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ULInformationTransferMRDC_IEs (
      Asn1OctetString ul_DCCH_MessageNR_,
      Asn1OctetString ul_DCCH_MessageEUTRA_,
      Asn1OctetString lateNonCriticalExtension_,
      ULInformationTransferMRDC_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ul_DCCH_MessageNR = ul_DCCH_MessageNR_;
      ul_DCCH_MessageEUTRA = ul_DCCH_MessageEUTRA_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ULInformationTransferMRDC_IEs (byte[] ul_DCCH_MessageNR_,
      byte[] ul_DCCH_MessageEUTRA_,
      byte[] lateNonCriticalExtension_,
      ULInformationTransferMRDC_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ul_DCCH_MessageNR = new Asn1OctetString (ul_DCCH_MessageNR_);
      ul_DCCH_MessageEUTRA = new Asn1OctetString (ul_DCCH_MessageEUTRA_);
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ul_DCCH_MessageNR = null;
      ul_DCCH_MessageEUTRA = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_DCCH_MessageNR;
         case 1: return ul_DCCH_MessageEUTRA;
         case 2: return lateNonCriticalExtension;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-DCCH-MessageNR";
         case 1: return "ul-DCCH-MessageEUTRA";
         case 2: return "lateNonCriticalExtension";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ul_DCCH_MessageNRPresent = buffer.decodeBit ("ul_DCCH_MessageNRPresent");
      boolean ul_DCCH_MessageEUTRAPresent = buffer.decodeBit ("ul_DCCH_MessageEUTRAPresent");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ul_DCCH_MessageNR

      if (ul_DCCH_MessageNRPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_DCCH_MessageNR", -1);

         ul_DCCH_MessageNR = new Asn1OctetString();
         ul_DCCH_MessageNR.decode (buffer);

         buffer.invokeCharacters(ul_DCCH_MessageNR.toString());
         buffer.getContext().eventDispatcher.endElement("ul_DCCH_MessageNR", -1);
      }
      else {
         ul_DCCH_MessageNR = null;
      }

      // decode ul_DCCH_MessageEUTRA

      if (ul_DCCH_MessageEUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_DCCH_MessageEUTRA", -1);

         ul_DCCH_MessageEUTRA = new Asn1OctetString();
         ul_DCCH_MessageEUTRA.decode (buffer);

         buffer.invokeCharacters(ul_DCCH_MessageEUTRA.toString());
         buffer.getContext().eventDispatcher.endElement("ul_DCCH_MessageEUTRA", -1);
      }
      else {
         ul_DCCH_MessageEUTRA = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new ULInformationTransferMRDC_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ul_DCCH_MessageNR != null) ul_DCCH_MessageNR.print (_sb, "ul_DCCH_MessageNR", _level+1);
      if (ul_DCCH_MessageEUTRA != null) ul_DCCH_MessageEUTRA.print (_sb, "ul_DCCH_MessageEUTRA", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
