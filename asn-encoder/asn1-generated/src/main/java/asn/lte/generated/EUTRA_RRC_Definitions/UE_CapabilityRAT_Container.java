/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_CapabilityRAT_Container extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-CapabilityRAT-Container";
   }

   public RAT_Type rat_Type = null;
   public Asn1OctetString ueCapabilityRAT_Container;

   public UE_CapabilityRAT_Container () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_CapabilityRAT_Container (
      RAT_Type rat_Type_,
      Asn1OctetString ueCapabilityRAT_Container_
   ) {
      super();
      rat_Type = rat_Type_;
      ueCapabilityRAT_Container = ueCapabilityRAT_Container_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UE_CapabilityRAT_Container (RAT_Type rat_Type_,
      byte[] ueCapabilityRAT_Container_
   ) {
      super();
      rat_Type = rat_Type_;
      ueCapabilityRAT_Container = new Asn1OctetString (ueCapabilityRAT_Container_);
   }

   public void init () {
      rat_Type = null;
      ueCapabilityRAT_Container = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rat_Type;
         case 1: return ueCapabilityRAT_Container;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rat-Type";
         case 1: return "ueCapabilityRAT-Container";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rat_Type

      buffer.getContext().eventDispatcher.startElement("rat_Type", -1);

      {
         int tval = RAT_Type.decodeEnumValue (buffer);
         rat_Type = RAT_Type.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("rat_Type", -1);

      // decode ueCapabilityRAT_Container

      buffer.getContext().eventDispatcher.startElement("ueCapabilityRAT_Container", -1);

      ueCapabilityRAT_Container = new Asn1OctetString();
      ueCapabilityRAT_Container.decode (buffer);

      buffer.invokeCharacters(ueCapabilityRAT_Container.toString());
      buffer.getContext().eventDispatcher.endElement("ueCapabilityRAT_Container", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rat_Type != null) rat_Type.print (_sb, "rat_Type", _level+1);
      if (ueCapabilityRAT_Container != null) ueCapabilityRAT_Container.print (_sb, "ueCapabilityRAT_Container", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
