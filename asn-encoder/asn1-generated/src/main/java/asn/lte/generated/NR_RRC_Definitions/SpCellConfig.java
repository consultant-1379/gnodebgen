/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SpCellConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SpCellConfig";
   }

   public ServCellIndex servCellIndex;  // optional
   public ReconfigurationWithSync reconfigurationWithSync;  // optional
   public SpCellConfig_rlf_TimersAndConstants rlf_TimersAndConstants;  // optional
   public SpCellConfig_rlmInSyncOutOfSyncThreshold rlmInSyncOutOfSyncThreshold = null;  // optional
   public ServingCellConfig spCellConfigDedicated;  // optional
   public Asn1OpenExt extElem1;

   public SpCellConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SpCellConfig (
      ServCellIndex servCellIndex_,
      ReconfigurationWithSync reconfigurationWithSync_,
      SpCellConfig_rlf_TimersAndConstants rlf_TimersAndConstants_,
      SpCellConfig_rlmInSyncOutOfSyncThreshold rlmInSyncOutOfSyncThreshold_,
      ServingCellConfig spCellConfigDedicated_
   ) {
      super();
      servCellIndex = servCellIndex_;
      reconfigurationWithSync = reconfigurationWithSync_;
      rlf_TimersAndConstants = rlf_TimersAndConstants_;
      rlmInSyncOutOfSyncThreshold = rlmInSyncOutOfSyncThreshold_;
      spCellConfigDedicated = spCellConfigDedicated_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SpCellConfig (long servCellIndex_,
      ReconfigurationWithSync reconfigurationWithSync_,
      SpCellConfig_rlf_TimersAndConstants rlf_TimersAndConstants_,
      SpCellConfig_rlmInSyncOutOfSyncThreshold rlmInSyncOutOfSyncThreshold_,
      ServingCellConfig spCellConfigDedicated_
   ) {
      super();
      servCellIndex = new ServCellIndex (servCellIndex_);
      reconfigurationWithSync = reconfigurationWithSync_;
      rlf_TimersAndConstants = rlf_TimersAndConstants_;
      rlmInSyncOutOfSyncThreshold = rlmInSyncOutOfSyncThreshold_;
      spCellConfigDedicated = spCellConfigDedicated_;
   }

   public void init () {
      servCellIndex = null;
      reconfigurationWithSync = null;
      rlf_TimersAndConstants = null;
      rlmInSyncOutOfSyncThreshold = null;
      spCellConfigDedicated = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return servCellIndex;
         case 1: return reconfigurationWithSync;
         case 2: return rlf_TimersAndConstants;
         case 3: return rlmInSyncOutOfSyncThreshold;
         case 4: return spCellConfigDedicated;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "servCellIndex";
         case 1: return "reconfigurationWithSync";
         case 2: return "rlf-TimersAndConstants";
         case 3: return "rlmInSyncOutOfSyncThreshold";
         case 4: return "spCellConfigDedicated";
         case 5: return null;
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

      boolean servCellIndexPresent = buffer.decodeBit ("servCellIndexPresent");
      boolean reconfigurationWithSyncPresent = buffer.decodeBit ("reconfigurationWithSyncPresent");
      boolean rlf_TimersAndConstantsPresent = buffer.decodeBit ("rlf_TimersAndConstantsPresent");
      boolean rlmInSyncOutOfSyncThresholdPresent = buffer.decodeBit ("rlmInSyncOutOfSyncThresholdPresent");
      boolean spCellConfigDedicatedPresent = buffer.decodeBit ("spCellConfigDedicatedPresent");

      // decode servCellIndex

      if (servCellIndexPresent) {
         buffer.getContext().eventDispatcher.startElement("servCellIndex", -1);

         servCellIndex = new ServCellIndex();
         servCellIndex.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("servCellIndex", -1);
      }
      else {
         servCellIndex = null;
      }

      // decode reconfigurationWithSync

      if (reconfigurationWithSyncPresent) {
         buffer.getContext().eventDispatcher.startElement("reconfigurationWithSync", -1);

         reconfigurationWithSync = new ReconfigurationWithSync();
         reconfigurationWithSync.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reconfigurationWithSync", -1);
      }
      else {
         reconfigurationWithSync = null;
      }

      // decode rlf_TimersAndConstants

      if (rlf_TimersAndConstantsPresent) {
         buffer.getContext().eventDispatcher.startElement("rlf_TimersAndConstants", -1);

         rlf_TimersAndConstants = new SpCellConfig_rlf_TimersAndConstants();
         rlf_TimersAndConstants.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlf_TimersAndConstants", -1);
      }
      else {
         rlf_TimersAndConstants = null;
      }

      // decode rlmInSyncOutOfSyncThreshold

      if (rlmInSyncOutOfSyncThresholdPresent) {
         buffer.getContext().eventDispatcher.startElement("rlmInSyncOutOfSyncThreshold", -1);

         int tval = SpCellConfig_rlmInSyncOutOfSyncThreshold.decodeEnumValue (buffer);
         rlmInSyncOutOfSyncThreshold = SpCellConfig_rlmInSyncOutOfSyncThreshold.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rlmInSyncOutOfSyncThreshold", -1);
      }
      else {
         rlmInSyncOutOfSyncThreshold = null;
      }

      // decode spCellConfigDedicated

      if (spCellConfigDedicatedPresent) {
         buffer.getContext().eventDispatcher.startElement("spCellConfigDedicated", -1);

         spCellConfigDedicated = new ServingCellConfig();
         spCellConfigDedicated.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("spCellConfigDedicated", -1);
      }
      else {
         spCellConfigDedicated = null;
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
      if (servCellIndex != null) servCellIndex.print (_sb, "servCellIndex", _level+1);
      if (reconfigurationWithSync != null) reconfigurationWithSync.print (_sb, "reconfigurationWithSync", _level+1);
      if (rlf_TimersAndConstants != null) rlf_TimersAndConstants.print (_sb, "rlf_TimersAndConstants", _level+1);
      if (rlmInSyncOutOfSyncThreshold != null) rlmInSyncOutOfSyncThreshold.print (_sb, "rlmInSyncOutOfSyncThreshold", _level+1);
      if (spCellConfigDedicated != null) spCellConfigDedicated.print (_sb, "spCellConfigDedicated", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
