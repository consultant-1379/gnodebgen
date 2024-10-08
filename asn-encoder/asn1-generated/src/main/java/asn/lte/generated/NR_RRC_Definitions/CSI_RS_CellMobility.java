/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_CellMobility extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-CellMobility";
   }

   public PhysCellId cellId;
   public CSI_RS_CellMobility_csi_rs_MeasurementBW csi_rs_MeasurementBW;
   public CSI_RS_CellMobility_density density = null;  // optional
   public CSI_RS_CellMobility_csi_rs_ResourceList_Mobility csi_rs_ResourceList_Mobility;

   public CSI_RS_CellMobility () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_CellMobility (
      PhysCellId cellId_,
      CSI_RS_CellMobility_csi_rs_MeasurementBW csi_rs_MeasurementBW_,
      CSI_RS_CellMobility_density density_,
      CSI_RS_CellMobility_csi_rs_ResourceList_Mobility csi_rs_ResourceList_Mobility_
   ) {
      super();
      cellId = cellId_;
      csi_rs_MeasurementBW = csi_rs_MeasurementBW_;
      density = density_;
      csi_rs_ResourceList_Mobility = csi_rs_ResourceList_Mobility_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CSI_RS_CellMobility (
      PhysCellId cellId_,
      CSI_RS_CellMobility_csi_rs_MeasurementBW csi_rs_MeasurementBW_,
      CSI_RS_CellMobility_csi_rs_ResourceList_Mobility csi_rs_ResourceList_Mobility_
   ) {
      super();
      cellId = cellId_;
      csi_rs_MeasurementBW = csi_rs_MeasurementBW_;
      csi_rs_ResourceList_Mobility = csi_rs_ResourceList_Mobility_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_RS_CellMobility (long cellId_,
      CSI_RS_CellMobility_csi_rs_MeasurementBW csi_rs_MeasurementBW_,
      CSI_RS_CellMobility_density density_,
      CSI_RS_CellMobility_csi_rs_ResourceList_Mobility csi_rs_ResourceList_Mobility_
   ) {
      super();
      cellId = new PhysCellId (cellId_);
      csi_rs_MeasurementBW = csi_rs_MeasurementBW_;
      density = density_;
      csi_rs_ResourceList_Mobility = csi_rs_ResourceList_Mobility_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CSI_RS_CellMobility (
      long cellId_,
      CSI_RS_CellMobility_csi_rs_MeasurementBW csi_rs_MeasurementBW_,
      CSI_RS_CellMobility_csi_rs_ResourceList_Mobility csi_rs_ResourceList_Mobility_
   ) {
      super();
      cellId = new PhysCellId (cellId_);
      csi_rs_MeasurementBW = csi_rs_MeasurementBW_;
      csi_rs_ResourceList_Mobility = csi_rs_ResourceList_Mobility_;
   }

   public void init () {
      cellId = null;
      csi_rs_MeasurementBW = null;
      density = null;
      csi_rs_ResourceList_Mobility = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellId;
         case 1: return csi_rs_MeasurementBW;
         case 2: return density;
         case 3: return csi_rs_ResourceList_Mobility;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellId";
         case 1: return "csi-rs-MeasurementBW";
         case 2: return "density";
         case 3: return "csi-rs-ResourceList-Mobility";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean densityPresent = buffer.decodeBit ("densityPresent");

      // decode cellId

      buffer.getContext().eventDispatcher.startElement("cellId", -1);

      cellId = new PhysCellId();
      cellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellId", -1);

      // decode csi_rs_MeasurementBW

      buffer.getContext().eventDispatcher.startElement("csi_rs_MeasurementBW", -1);

      csi_rs_MeasurementBW = new CSI_RS_CellMobility_csi_rs_MeasurementBW();
      csi_rs_MeasurementBW.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_rs_MeasurementBW", -1);

      // decode density

      if (densityPresent) {
         buffer.getContext().eventDispatcher.startElement("density", -1);

         int tval = CSI_RS_CellMobility_density.decodeEnumValue (buffer);
         density = CSI_RS_CellMobility_density.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("density", -1);
      }
      else {
         density = null;
      }

      // decode csi_rs_ResourceList_Mobility

      buffer.getContext().eventDispatcher.startElement("csi_rs_ResourceList_Mobility", -1);

      csi_rs_ResourceList_Mobility = new CSI_RS_CellMobility_csi_rs_ResourceList_Mobility();
      csi_rs_ResourceList_Mobility.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_rs_ResourceList_Mobility", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellId != null) cellId.print (_sb, "cellId", _level+1);
      if (csi_rs_MeasurementBW != null) csi_rs_MeasurementBW.print (_sb, "csi_rs_MeasurementBW", _level+1);
      if (density != null) density.print (_sb, "density", _level+1);
      if (csi_rs_ResourceList_Mobility != null) csi_rs_ResourceList_Mobility.print (_sb, "csi_rs_ResourceList_Mobility", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
