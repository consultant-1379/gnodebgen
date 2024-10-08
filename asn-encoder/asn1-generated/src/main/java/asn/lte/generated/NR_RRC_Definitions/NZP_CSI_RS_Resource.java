/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NZP_CSI_RS_Resource extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NZP-CSI-RS-Resource";
   }

   public NZP_CSI_RS_ResourceId nzp_CSI_RS_ResourceId;
   public CSI_RS_ResourceMapping resourceMapping;
   public Asn1Integer powerControlOffset;
   public NZP_CSI_RS_Resource_powerControlOffsetSS powerControlOffsetSS = null;  // optional
   public ScramblingId scramblingID;
   public CSI_ResourcePeriodicityAndOffset periodicityAndOffset;  // optional
   public TCI_StateId qcl_InfoPeriodicCSI_RS;  // optional
   public Asn1OpenExt extElem1;

   public NZP_CSI_RS_Resource () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NZP_CSI_RS_Resource (
      NZP_CSI_RS_ResourceId nzp_CSI_RS_ResourceId_,
      CSI_RS_ResourceMapping resourceMapping_,
      Asn1Integer powerControlOffset_,
      NZP_CSI_RS_Resource_powerControlOffsetSS powerControlOffsetSS_,
      ScramblingId scramblingID_,
      CSI_ResourcePeriodicityAndOffset periodicityAndOffset_,
      TCI_StateId qcl_InfoPeriodicCSI_RS_
   ) {
      super();
      nzp_CSI_RS_ResourceId = nzp_CSI_RS_ResourceId_;
      resourceMapping = resourceMapping_;
      powerControlOffset = powerControlOffset_;
      powerControlOffsetSS = powerControlOffsetSS_;
      scramblingID = scramblingID_;
      periodicityAndOffset = periodicityAndOffset_;
      qcl_InfoPeriodicCSI_RS = qcl_InfoPeriodicCSI_RS_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NZP_CSI_RS_Resource (
      NZP_CSI_RS_ResourceId nzp_CSI_RS_ResourceId_,
      CSI_RS_ResourceMapping resourceMapping_,
      Asn1Integer powerControlOffset_,
      ScramblingId scramblingID_
   ) {
      super();
      nzp_CSI_RS_ResourceId = nzp_CSI_RS_ResourceId_;
      resourceMapping = resourceMapping_;
      powerControlOffset = powerControlOffset_;
      scramblingID = scramblingID_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NZP_CSI_RS_Resource (long nzp_CSI_RS_ResourceId_,
      CSI_RS_ResourceMapping resourceMapping_,
      long powerControlOffset_,
      NZP_CSI_RS_Resource_powerControlOffsetSS powerControlOffsetSS_,
      long scramblingID_,
      CSI_ResourcePeriodicityAndOffset periodicityAndOffset_,
      long qcl_InfoPeriodicCSI_RS_
   ) {
      super();
      nzp_CSI_RS_ResourceId = new NZP_CSI_RS_ResourceId (nzp_CSI_RS_ResourceId_);
      resourceMapping = resourceMapping_;
      powerControlOffset = new Asn1Integer (powerControlOffset_);
      powerControlOffsetSS = powerControlOffsetSS_;
      scramblingID = new ScramblingId (scramblingID_);
      periodicityAndOffset = periodicityAndOffset_;
      qcl_InfoPeriodicCSI_RS = new TCI_StateId (qcl_InfoPeriodicCSI_RS_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public NZP_CSI_RS_Resource (
      long nzp_CSI_RS_ResourceId_,
      CSI_RS_ResourceMapping resourceMapping_,
      long powerControlOffset_,
      long scramblingID_
   ) {
      super();
      nzp_CSI_RS_ResourceId = new NZP_CSI_RS_ResourceId (nzp_CSI_RS_ResourceId_);
      resourceMapping = resourceMapping_;
      powerControlOffset = new Asn1Integer (powerControlOffset_);
      scramblingID = new ScramblingId (scramblingID_);
   }

   public void init () {
      nzp_CSI_RS_ResourceId = null;
      resourceMapping = null;
      powerControlOffset = null;
      powerControlOffsetSS = null;
      scramblingID = null;
      periodicityAndOffset = null;
      qcl_InfoPeriodicCSI_RS = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nzp_CSI_RS_ResourceId;
         case 1: return resourceMapping;
         case 2: return powerControlOffset;
         case 3: return powerControlOffsetSS;
         case 4: return scramblingID;
         case 5: return periodicityAndOffset;
         case 6: return qcl_InfoPeriodicCSI_RS;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nzp-CSI-RS-ResourceId";
         case 1: return "resourceMapping";
         case 2: return "powerControlOffset";
         case 3: return "powerControlOffsetSS";
         case 4: return "scramblingID";
         case 5: return "periodicityAndOffset";
         case 6: return "qcl-InfoPeriodicCSI-RS";
         case 7: return null;
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

      boolean powerControlOffsetSSPresent = buffer.decodeBit ("powerControlOffsetSSPresent");
      boolean periodicityAndOffsetPresent = buffer.decodeBit ("periodicityAndOffsetPresent");
      boolean qcl_InfoPeriodicCSI_RSPresent = buffer.decodeBit ("qcl_InfoPeriodicCSI_RSPresent");

      // decode nzp_CSI_RS_ResourceId

      buffer.getContext().eventDispatcher.startElement("nzp_CSI_RS_ResourceId", -1);

      nzp_CSI_RS_ResourceId = new NZP_CSI_RS_ResourceId();
      nzp_CSI_RS_ResourceId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nzp_CSI_RS_ResourceId", -1);

      // decode resourceMapping

      buffer.getContext().eventDispatcher.startElement("resourceMapping", -1);

      resourceMapping = new CSI_RS_ResourceMapping();
      resourceMapping.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("resourceMapping", -1);

      // decode powerControlOffset

      buffer.getContext().eventDispatcher.startElement("powerControlOffset", -1);

      powerControlOffset = new Asn1Integer();
      powerControlOffset.decode (buffer, -8, 15);

      buffer.invokeCharacters(powerControlOffset.toString());
      buffer.getContext().eventDispatcher.endElement("powerControlOffset", -1);

      // decode powerControlOffsetSS

      if (powerControlOffsetSSPresent) {
         buffer.getContext().eventDispatcher.startElement("powerControlOffsetSS", -1);

         int tval = NZP_CSI_RS_Resource_powerControlOffsetSS.decodeEnumValue (buffer);
         powerControlOffsetSS = NZP_CSI_RS_Resource_powerControlOffsetSS.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("powerControlOffsetSS", -1);
      }
      else {
         powerControlOffsetSS = null;
      }

      // decode scramblingID

      buffer.getContext().eventDispatcher.startElement("scramblingID", -1);

      scramblingID = new ScramblingId();
      scramblingID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("scramblingID", -1);

      // decode periodicityAndOffset

      if (periodicityAndOffsetPresent) {
         buffer.getContext().eventDispatcher.startElement("periodicityAndOffset", -1);

         periodicityAndOffset = new CSI_ResourcePeriodicityAndOffset();
         periodicityAndOffset.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("periodicityAndOffset", -1);
      }
      else {
         periodicityAndOffset = null;
      }

      // decode qcl_InfoPeriodicCSI_RS

      if (qcl_InfoPeriodicCSI_RSPresent) {
         buffer.getContext().eventDispatcher.startElement("qcl_InfoPeriodicCSI_RS", -1);

         qcl_InfoPeriodicCSI_RS = new TCI_StateId();
         qcl_InfoPeriodicCSI_RS.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("qcl_InfoPeriodicCSI_RS", -1);
      }
      else {
         qcl_InfoPeriodicCSI_RS = null;
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
      if (nzp_CSI_RS_ResourceId != null) nzp_CSI_RS_ResourceId.print (_sb, "nzp_CSI_RS_ResourceId", _level+1);
      if (resourceMapping != null) resourceMapping.print (_sb, "resourceMapping", _level+1);
      if (powerControlOffset != null) powerControlOffset.print (_sb, "powerControlOffset", _level+1);
      if (powerControlOffsetSS != null) powerControlOffsetSS.print (_sb, "powerControlOffsetSS", _level+1);
      if (scramblingID != null) scramblingID.print (_sb, "scramblingID", _level+1);
      if (periodicityAndOffset != null) periodicityAndOffset.print (_sb, "periodicityAndOffset", _level+1);
      if (qcl_InfoPeriodicCSI_RS != null) qcl_InfoPeriodicCSI_RS.print (_sb, "qcl_InfoPeriodicCSI_RS", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
