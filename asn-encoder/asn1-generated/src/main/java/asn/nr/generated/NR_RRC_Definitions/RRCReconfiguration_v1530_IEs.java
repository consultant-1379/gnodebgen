/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCReconfiguration_v1530_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCReconfiguration-v1530-IEs";
   }

   public CellGroupConfig masterCellGroup;  // optional
   public RRCReconfiguration_v1530_IEs_fullConfig fullConfig = null;  // optional
   public RRCReconfiguration_v1530_IEs_dedicatedNAS_MessageList dedicatedNAS_MessageList;  // optional
   public MasterKeyUpdate masterKeyUpdate;  // optional
   public SIB1 dedicatedSIB1_Delivery;  // optional
   public SystemInformation dedicatedSystemInformationDelivery;  // optional
   public OtherConfig otherConfig;  // optional
   public RRCReconfiguration_v1540_IEs nonCriticalExtension;  // optional

   public RRCReconfiguration_v1530_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCReconfiguration_v1530_IEs (
      CellGroupConfig masterCellGroup_,
      RRCReconfiguration_v1530_IEs_fullConfig fullConfig_,
      RRCReconfiguration_v1530_IEs_dedicatedNAS_MessageList dedicatedNAS_MessageList_,
      MasterKeyUpdate masterKeyUpdate_,
      SIB1 dedicatedSIB1_Delivery_,
      SystemInformation dedicatedSystemInformationDelivery_,
      OtherConfig otherConfig_,
      RRCReconfiguration_v1540_IEs nonCriticalExtension_
   ) {
      super();
      masterCellGroup = masterCellGroup_;
      fullConfig = fullConfig_;
      dedicatedNAS_MessageList = dedicatedNAS_MessageList_;
      masterKeyUpdate = masterKeyUpdate_;
      dedicatedSIB1_Delivery = dedicatedSIB1_Delivery_;
      dedicatedSystemInformationDelivery = dedicatedSystemInformationDelivery_;
      otherConfig = otherConfig_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      masterCellGroup = null;
      fullConfig = null;
      dedicatedNAS_MessageList = null;
      masterKeyUpdate = null;
      dedicatedSIB1_Delivery = null;
      dedicatedSystemInformationDelivery = null;
      otherConfig = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return masterCellGroup;
         case 1: return fullConfig;
         case 2: return dedicatedNAS_MessageList;
         case 3: return masterKeyUpdate;
         case 4: return dedicatedSIB1_Delivery;
         case 5: return dedicatedSystemInformationDelivery;
         case 6: return otherConfig;
         case 7: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "masterCellGroup";
         case 1: return "fullConfig";
         case 2: return "dedicatedNAS-MessageList";
         case 3: return "masterKeyUpdate";
         case 4: return "dedicatedSIB1-Delivery";
         case 5: return "dedicatedSystemInformationDelivery";
         case 6: return "otherConfig";
         case 7: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean masterCellGroupPresent = buffer.decodeBit ("masterCellGroupPresent");
      boolean fullConfigPresent = buffer.decodeBit ("fullConfigPresent");
      boolean dedicatedNAS_MessageListPresent = buffer.decodeBit ("dedicatedNAS_MessageListPresent");
      boolean masterKeyUpdatePresent = buffer.decodeBit ("masterKeyUpdatePresent");
      boolean dedicatedSIB1_DeliveryPresent = buffer.decodeBit ("dedicatedSIB1_DeliveryPresent");
      boolean dedicatedSystemInformationDeliveryPresent = buffer.decodeBit ("dedicatedSystemInformationDeliveryPresent");
      boolean otherConfigPresent = buffer.decodeBit ("otherConfigPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode masterCellGroup

      if (masterCellGroupPresent) {
         buffer.getContext().eventDispatcher.startElement("masterCellGroup", -1);

         Asn1OctetString masterCellGroup_outer = new Asn1OctetString();
         masterCellGroup_outer.decode (buffer);
         if (masterCellGroup_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( masterCellGroup_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         masterCellGroup = new CellGroupConfig();
         masterCellGroup.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("masterCellGroup", -1);
      }
      else {
         masterCellGroup = null;
      }

      // decode fullConfig

      if (fullConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("fullConfig", -1);

         int tval = RRCReconfiguration_v1530_IEs_fullConfig.decodeEnumValue (buffer);
         fullConfig = RRCReconfiguration_v1530_IEs_fullConfig.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fullConfig", -1);
      }
      else {
         fullConfig = null;
      }

      // decode dedicatedNAS_MessageList

      if (dedicatedNAS_MessageListPresent) {
         buffer.getContext().eventDispatcher.startElement("dedicatedNAS_MessageList", -1);

         dedicatedNAS_MessageList = new RRCReconfiguration_v1530_IEs_dedicatedNAS_MessageList();
         dedicatedNAS_MessageList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dedicatedNAS_MessageList", -1);
      }
      else {
         dedicatedNAS_MessageList = null;
      }

      // decode masterKeyUpdate

      if (masterKeyUpdatePresent) {
         buffer.getContext().eventDispatcher.startElement("masterKeyUpdate", -1);

         masterKeyUpdate = new MasterKeyUpdate();
         masterKeyUpdate.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("masterKeyUpdate", -1);
      }
      else {
         masterKeyUpdate = null;
      }

      // decode dedicatedSIB1_Delivery

      if (dedicatedSIB1_DeliveryPresent) {
         buffer.getContext().eventDispatcher.startElement("dedicatedSIB1_Delivery", -1);

         Asn1OctetString dedicatedSIB1_Delivery_outer = new Asn1OctetString();
         dedicatedSIB1_Delivery_outer.decode (buffer);
         if (dedicatedSIB1_Delivery_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( dedicatedSIB1_Delivery_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         dedicatedSIB1_Delivery = new SIB1();
         dedicatedSIB1_Delivery.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("dedicatedSIB1_Delivery", -1);
      }
      else {
         dedicatedSIB1_Delivery = null;
      }

      // decode dedicatedSystemInformationDelivery

      if (dedicatedSystemInformationDeliveryPresent) {
         buffer.getContext().eventDispatcher.startElement("dedicatedSystemInformationDelivery", -1);

         Asn1OctetString dedicatedSystemInformationDelivery_outer = new Asn1OctetString();
         dedicatedSystemInformationDelivery_outer.decode (buffer);
         if (dedicatedSystemInformationDelivery_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( dedicatedSystemInformationDelivery_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         dedicatedSystemInformationDelivery = new SystemInformation();
         dedicatedSystemInformationDelivery.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("dedicatedSystemInformationDelivery", -1);
      }
      else {
         dedicatedSystemInformationDelivery = null;
      }

      // decode otherConfig

      if (otherConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("otherConfig", -1);

         otherConfig = new OtherConfig();
         otherConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("otherConfig", -1);
      }
      else {
         otherConfig = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCReconfiguration_v1540_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((masterCellGroup != null), null);
      buffer.encodeBit ((fullConfig != null), null);
      buffer.encodeBit ((dedicatedNAS_MessageList != null), null);
      buffer.encodeBit ((masterKeyUpdate != null), null);
      buffer.encodeBit ((dedicatedSIB1_Delivery != null), null);
      buffer.encodeBit ((dedicatedSystemInformationDelivery != null), null);
      buffer.encodeBit ((otherConfig != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode masterCellGroup

      if (masterCellGroup != null) {
         buffer.getContext().eventDispatcher.startElement("masterCellGroup", -1);

         Asn1OctetString masterCellGroup_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            masterCellGroup.encode (buffer);
            masterCellGroup_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         masterCellGroup_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("masterCellGroup", -1);
      }

      // encode fullConfig

      if (fullConfig != null) {
         buffer.getContext().eventDispatcher.startElement("fullConfig", -1);

         fullConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("fullConfig", -1);
      }

      // encode dedicatedNAS_MessageList

      if (dedicatedNAS_MessageList != null) {
         buffer.getContext().eventDispatcher.startElement("dedicatedNAS_MessageList", -1);

         dedicatedNAS_MessageList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dedicatedNAS_MessageList", -1);
      }

      // encode masterKeyUpdate

      if (masterKeyUpdate != null) {
         buffer.getContext().eventDispatcher.startElement("masterKeyUpdate", -1);

         masterKeyUpdate.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("masterKeyUpdate", -1);
      }

      // encode dedicatedSIB1_Delivery

      if (dedicatedSIB1_Delivery != null) {
         buffer.getContext().eventDispatcher.startElement("dedicatedSIB1_Delivery", -1);

         Asn1OctetString dedicatedSIB1_Delivery_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            dedicatedSIB1_Delivery.encode (buffer);
            dedicatedSIB1_Delivery_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         dedicatedSIB1_Delivery_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dedicatedSIB1_Delivery", -1);
      }

      // encode dedicatedSystemInformationDelivery

      if (dedicatedSystemInformationDelivery != null) {
         buffer.getContext().eventDispatcher.startElement("dedicatedSystemInformationDelivery", -1);

         Asn1OctetString dedicatedSystemInformationDelivery_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            dedicatedSystemInformationDelivery.encode (buffer);
            dedicatedSystemInformationDelivery_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         dedicatedSystemInformationDelivery_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dedicatedSystemInformationDelivery", -1);
      }

      // encode otherConfig

      if (otherConfig != null) {
         buffer.getContext().eventDispatcher.startElement("otherConfig", -1);

         otherConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("otherConfig", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (masterCellGroup != null) masterCellGroup.print (_sb, "masterCellGroup", _level+1);
      if (fullConfig != null) fullConfig.print (_sb, "fullConfig", _level+1);
      if (dedicatedNAS_MessageList != null) dedicatedNAS_MessageList.print (_sb, "dedicatedNAS_MessageList", _level+1);
      if (masterKeyUpdate != null) masterKeyUpdate.print (_sb, "masterKeyUpdate", _level+1);
      if (dedicatedSIB1_Delivery != null) dedicatedSIB1_Delivery.print (_sb, "dedicatedSIB1_Delivery", _level+1);
      if (dedicatedSystemInformationDelivery != null) dedicatedSystemInformationDelivery.print (_sb, "dedicatedSystemInformationDelivery", _level+1);
      if (otherConfig != null) otherConfig.print (_sb, "otherConfig", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
