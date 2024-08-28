/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QuantityConfigWLAN_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QuantityConfigWLAN-r13";
   }

   public QuantityConfigWLAN_r13_measQuantityWLAN_r13 measQuantityWLAN_r13 = null;
   public FilterCoefficient filterCoefficient_r13 = null;  // default = FilterCoefficient.fc4()

   public QuantityConfigWLAN_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QuantityConfigWLAN_r13 (
      QuantityConfigWLAN_r13_measQuantityWLAN_r13 measQuantityWLAN_r13_,
      FilterCoefficient filterCoefficient_r13_
   ) {
      super();
      measQuantityWLAN_r13 = measQuantityWLAN_r13_;
      filterCoefficient_r13 = filterCoefficient_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public QuantityConfigWLAN_r13 (
      QuantityConfigWLAN_r13_measQuantityWLAN_r13 measQuantityWLAN_r13_
   ) {
      super();
      measQuantityWLAN_r13 = measQuantityWLAN_r13_;
      filterCoefficient_r13 = FilterCoefficient.fc4();
   }

   public void init () {
      measQuantityWLAN_r13 = null;
      filterCoefficient_r13 = FilterCoefficient.fc4();
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measQuantityWLAN_r13;
         case 1: return filterCoefficient_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measQuantityWLAN-r13";
         case 1: return "filterCoefficient-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean filterCoefficient_r13Present = buffer.decodeBit ("filterCoefficient_r13Present");

      // decode measQuantityWLAN_r13

      buffer.getContext().eventDispatcher.startElement("measQuantityWLAN_r13", -1);

      {
         int tval = QuantityConfigWLAN_r13_measQuantityWLAN_r13.decodeEnumValue (buffer);
         measQuantityWLAN_r13 = QuantityConfigWLAN_r13_measQuantityWLAN_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measQuantityWLAN_r13", -1);

      // decode filterCoefficient_r13

      if (filterCoefficient_r13Present) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficient_r13", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficient_r13 = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficient_r13", -1);
      }
      else {
         filterCoefficient_r13 = FilterCoefficient.fc4();
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measQuantityWLAN_r13 != null) measQuantityWLAN_r13.print (_sb, "measQuantityWLAN_r13", _level+1);
      if (filterCoefficient_r13 != null) filterCoefficient_r13.print (_sb, "filterCoefficient_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
