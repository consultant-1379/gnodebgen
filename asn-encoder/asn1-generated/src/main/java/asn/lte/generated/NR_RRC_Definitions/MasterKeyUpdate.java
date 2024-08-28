/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MasterKeyUpdate extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MasterKeyUpdate";
   }

   public Asn1Boolean keySetChangeIndicator;
   public NextHopChainingCount nextHopChainingCount;
   public Asn1OctetString nas_Container;  // optional
   public Asn1OpenExt extElem1;

   public MasterKeyUpdate () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MasterKeyUpdate (
      Asn1Boolean keySetChangeIndicator_,
      NextHopChainingCount nextHopChainingCount_,
      Asn1OctetString nas_Container_
   ) {
      super();
      keySetChangeIndicator = keySetChangeIndicator_;
      nextHopChainingCount = nextHopChainingCount_;
      nas_Container = nas_Container_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MasterKeyUpdate (
      Asn1Boolean keySetChangeIndicator_,
      NextHopChainingCount nextHopChainingCount_
   ) {
      super();
      keySetChangeIndicator = keySetChangeIndicator_;
      nextHopChainingCount = nextHopChainingCount_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MasterKeyUpdate (boolean keySetChangeIndicator_,
      long nextHopChainingCount_,
      byte[] nas_Container_
   ) {
      super();
      keySetChangeIndicator = new Asn1Boolean (keySetChangeIndicator_);
      nextHopChainingCount = new NextHopChainingCount (nextHopChainingCount_);
      nas_Container = new Asn1OctetString (nas_Container_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MasterKeyUpdate (
      boolean keySetChangeIndicator_,
      long nextHopChainingCount_
   ) {
      super();
      keySetChangeIndicator = new Asn1Boolean (keySetChangeIndicator_);
      nextHopChainingCount = new NextHopChainingCount (nextHopChainingCount_);
   }

   public void init () {
      keySetChangeIndicator = null;
      nextHopChainingCount = null;
      nas_Container = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return keySetChangeIndicator;
         case 1: return nextHopChainingCount;
         case 2: return nas_Container;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "keySetChangeIndicator";
         case 1: return "nextHopChainingCount";
         case 2: return "nas-Container";
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

      boolean nas_ContainerPresent = buffer.decodeBit ("nas_ContainerPresent");

      // decode keySetChangeIndicator

      buffer.getContext().eventDispatcher.startElement("keySetChangeIndicator", -1);

      keySetChangeIndicator = new Asn1Boolean();
      keySetChangeIndicator.decode (buffer);

      buffer.invokeCharacters(keySetChangeIndicator.toString());
      buffer.getContext().eventDispatcher.endElement("keySetChangeIndicator", -1);

      // decode nextHopChainingCount

      buffer.getContext().eventDispatcher.startElement("nextHopChainingCount", -1);

      nextHopChainingCount = new NextHopChainingCount();
      nextHopChainingCount.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nextHopChainingCount", -1);

      // decode nas_Container

      if (nas_ContainerPresent) {
         buffer.getContext().eventDispatcher.startElement("nas_Container", -1);

         nas_Container = new Asn1OctetString();
         nas_Container.decode (buffer);

         buffer.invokeCharacters(nas_Container.toString());
         buffer.getContext().eventDispatcher.endElement("nas_Container", -1);
      }
      else {
         nas_Container = null;
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
      if (keySetChangeIndicator != null) keySetChangeIndicator.print (_sb, "keySetChangeIndicator", _level+1);
      if (nextHopChainingCount != null) nextHopChainingCount.print (_sb, "nextHopChainingCount", _level+1);
      if (nas_Container != null) nas_Container.print (_sb, "nas_Container", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
