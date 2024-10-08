/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ConnEstFailureControl extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ConnEstFailureControl";
   }

   public ConnEstFailureControl_connEstFailCount connEstFailCount = null;
   public ConnEstFailureControl_connEstFailOffsetValidity connEstFailOffsetValidity = null;
   public Asn1Integer connEstFailOffset;  // optional

   public ConnEstFailureControl () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ConnEstFailureControl (
      ConnEstFailureControl_connEstFailCount connEstFailCount_,
      ConnEstFailureControl_connEstFailOffsetValidity connEstFailOffsetValidity_,
      Asn1Integer connEstFailOffset_
   ) {
      super();
      connEstFailCount = connEstFailCount_;
      connEstFailOffsetValidity = connEstFailOffsetValidity_;
      connEstFailOffset = connEstFailOffset_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public ConnEstFailureControl (
      ConnEstFailureControl_connEstFailCount connEstFailCount_,
      ConnEstFailureControl_connEstFailOffsetValidity connEstFailOffsetValidity_
   ) {
      super();
      connEstFailCount = connEstFailCount_;
      connEstFailOffsetValidity = connEstFailOffsetValidity_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ConnEstFailureControl (ConnEstFailureControl_connEstFailCount connEstFailCount_,
      ConnEstFailureControl_connEstFailOffsetValidity connEstFailOffsetValidity_,
      long connEstFailOffset_
   ) {
      super();
      connEstFailCount = connEstFailCount_;
      connEstFailOffsetValidity = connEstFailOffsetValidity_;
      connEstFailOffset = new Asn1Integer (connEstFailOffset_);
   }

   public void init () {
      connEstFailCount = null;
      connEstFailOffsetValidity = null;
      connEstFailOffset = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return connEstFailCount;
         case 1: return connEstFailOffsetValidity;
         case 2: return connEstFailOffset;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "connEstFailCount";
         case 1: return "connEstFailOffsetValidity";
         case 2: return "connEstFailOffset";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean connEstFailOffsetPresent = buffer.decodeBit ("connEstFailOffsetPresent");

      // decode connEstFailCount

      buffer.getContext().eventDispatcher.startElement("connEstFailCount", -1);

      {
         int tval = ConnEstFailureControl_connEstFailCount.decodeEnumValue (buffer);
         connEstFailCount = ConnEstFailureControl_connEstFailCount.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("connEstFailCount", -1);

      // decode connEstFailOffsetValidity

      buffer.getContext().eventDispatcher.startElement("connEstFailOffsetValidity", -1);

      {
         int tval = ConnEstFailureControl_connEstFailOffsetValidity.decodeEnumValue (buffer);
         connEstFailOffsetValidity = ConnEstFailureControl_connEstFailOffsetValidity.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("connEstFailOffsetValidity", -1);

      // decode connEstFailOffset

      if (connEstFailOffsetPresent) {
         buffer.getContext().eventDispatcher.startElement("connEstFailOffset", -1);

         connEstFailOffset = new Asn1Integer();
         connEstFailOffset.decode (buffer, 0, 15);

         buffer.invokeCharacters(connEstFailOffset.toString());
         buffer.getContext().eventDispatcher.endElement("connEstFailOffset", -1);
      }
      else {
         connEstFailOffset = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((connEstFailOffset != null), null);

      // encode connEstFailCount

      if (connEstFailCount != null) {
         buffer.getContext().eventDispatcher.startElement("connEstFailCount", -1);

         connEstFailCount.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("connEstFailCount", -1);
      }
      else throw new Asn1MissingRequiredException ("connEstFailCount");

      // encode connEstFailOffsetValidity

      if (connEstFailOffsetValidity != null) {
         buffer.getContext().eventDispatcher.startElement("connEstFailOffsetValidity", -1);

         connEstFailOffsetValidity.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("connEstFailOffsetValidity", -1);
      }
      else throw new Asn1MissingRequiredException ("connEstFailOffsetValidity");

      // encode connEstFailOffset

      if (connEstFailOffset != null) {
         buffer.getContext().eventDispatcher.startElement("connEstFailOffset", -1);

         connEstFailOffset.encode (buffer, 0, 15);

         buffer.getContext().eventDispatcher.endElement("connEstFailOffset", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (connEstFailCount != null) connEstFailCount.print (_sb, "connEstFailCount", _level+1);
      if (connEstFailOffsetValidity != null) connEstFailOffsetValidity.print (_sb, "connEstFailOffsetValidity", _level+1);
      if (connEstFailOffset != null) connEstFailOffset.print (_sb, "connEstFailOffset", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
