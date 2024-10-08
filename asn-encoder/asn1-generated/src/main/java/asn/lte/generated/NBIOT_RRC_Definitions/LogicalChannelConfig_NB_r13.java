/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogicalChannelConfig_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LogicalChannelConfig-NB-r13";
   }

   public Asn1Integer priority_r13;  // optional
   public Asn1Boolean logicalChannelSR_Prohibit_r13;  // optional
   public Asn1OpenExt extElem1;

   public LogicalChannelConfig_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LogicalChannelConfig_NB_r13 (
      Asn1Integer priority_r13_,
      Asn1Boolean logicalChannelSR_Prohibit_r13_
   ) {
      super();
      priority_r13 = priority_r13_;
      logicalChannelSR_Prohibit_r13 = logicalChannelSR_Prohibit_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LogicalChannelConfig_NB_r13 (long priority_r13_,
      boolean logicalChannelSR_Prohibit_r13_
   ) {
      super();
      priority_r13 = new Asn1Integer (priority_r13_);
      logicalChannelSR_Prohibit_r13 = new Asn1Boolean (logicalChannelSR_Prohibit_r13_);
   }

   public void init () {
      priority_r13 = null;
      logicalChannelSR_Prohibit_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return priority_r13;
         case 1: return logicalChannelSR_Prohibit_r13;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "priority-r13";
         case 1: return "logicalChannelSR-Prohibit-r13";
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

      boolean priority_r13Present = buffer.decodeBit ("priority_r13Present");
      boolean logicalChannelSR_Prohibit_r13Present = buffer.decodeBit ("logicalChannelSR_Prohibit_r13Present");

      // decode priority_r13

      if (priority_r13Present) {
         buffer.getContext().eventDispatcher.startElement("priority_r13", -1);

         priority_r13 = new Asn1Integer();
         priority_r13.decode (buffer, 1, 16);

         buffer.invokeCharacters(priority_r13.toString());
         buffer.getContext().eventDispatcher.endElement("priority_r13", -1);
      }
      else {
         priority_r13 = null;
      }

      // decode logicalChannelSR_Prohibit_r13

      if (logicalChannelSR_Prohibit_r13Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelSR_Prohibit_r13", -1);

         logicalChannelSR_Prohibit_r13 = new Asn1Boolean();
         logicalChannelSR_Prohibit_r13.decode (buffer);

         buffer.invokeCharacters(logicalChannelSR_Prohibit_r13.toString());
         buffer.getContext().eventDispatcher.endElement("logicalChannelSR_Prohibit_r13", -1);
      }
      else {
         logicalChannelSR_Prohibit_r13 = null;
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
      if (priority_r13 != null) priority_r13.print (_sb, "priority_r13", _level+1);
      if (logicalChannelSR_Prohibit_r13 != null) logicalChannelSR_Prohibit_r13.print (_sb, "logicalChannelSR_Prohibit_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
