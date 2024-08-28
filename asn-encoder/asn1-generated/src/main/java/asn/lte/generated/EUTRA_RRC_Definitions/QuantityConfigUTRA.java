/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QuantityConfigUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QuantityConfigUTRA";
   }

   public QuantityConfigUTRA_measQuantityUTRA_FDD measQuantityUTRA_FDD = null;
   public QuantityConfigUTRA_measQuantityUTRA_TDD measQuantityUTRA_TDD = null;
   public FilterCoefficient filterCoefficient = null;  // default = FilterCoefficient.fc4()

   public QuantityConfigUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QuantityConfigUTRA (
      QuantityConfigUTRA_measQuantityUTRA_FDD measQuantityUTRA_FDD_,
      QuantityConfigUTRA_measQuantityUTRA_TDD measQuantityUTRA_TDD_,
      FilterCoefficient filterCoefficient_
   ) {
      super();
      measQuantityUTRA_FDD = measQuantityUTRA_FDD_;
      measQuantityUTRA_TDD = measQuantityUTRA_TDD_;
      filterCoefficient = filterCoefficient_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public QuantityConfigUTRA (
      QuantityConfigUTRA_measQuantityUTRA_FDD measQuantityUTRA_FDD_,
      QuantityConfigUTRA_measQuantityUTRA_TDD measQuantityUTRA_TDD_
   ) {
      super();
      measQuantityUTRA_FDD = measQuantityUTRA_FDD_;
      measQuantityUTRA_TDD = measQuantityUTRA_TDD_;
      filterCoefficient = FilterCoefficient.fc4();
   }

   public void init () {
      measQuantityUTRA_FDD = null;
      measQuantityUTRA_TDD = null;
      filterCoefficient = FilterCoefficient.fc4();
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measQuantityUTRA_FDD;
         case 1: return measQuantityUTRA_TDD;
         case 2: return filterCoefficient;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measQuantityUTRA-FDD";
         case 1: return "measQuantityUTRA-TDD";
         case 2: return "filterCoefficient";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean filterCoefficientPresent = buffer.decodeBit ("filterCoefficientPresent");

      // decode measQuantityUTRA_FDD

      buffer.getContext().eventDispatcher.startElement("measQuantityUTRA_FDD", -1);

      {
         int tval = QuantityConfigUTRA_measQuantityUTRA_FDD.decodeEnumValue (buffer);
         measQuantityUTRA_FDD = QuantityConfigUTRA_measQuantityUTRA_FDD.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measQuantityUTRA_FDD", -1);

      // decode measQuantityUTRA_TDD

      buffer.getContext().eventDispatcher.startElement("measQuantityUTRA_TDD", -1);

      {
         int tval = QuantityConfigUTRA_measQuantityUTRA_TDD.decodeEnumValue (buffer);
         measQuantityUTRA_TDD = QuantityConfigUTRA_measQuantityUTRA_TDD.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("measQuantityUTRA_TDD", -1);

      // decode filterCoefficient

      if (filterCoefficientPresent) {
         buffer.getContext().eventDispatcher.startElement("filterCoefficient", -1);

         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficient = FilterCoefficient.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("filterCoefficient", -1);
      }
      else {
         filterCoefficient = FilterCoefficient.fc4();
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measQuantityUTRA_FDD != null) measQuantityUTRA_FDD.print (_sb, "measQuantityUTRA_FDD", _level+1);
      if (measQuantityUTRA_TDD != null) measQuantityUTRA_TDD.print (_sb, "measQuantityUTRA_TDD", _level+1);
      if (filterCoefficient != null) filterCoefficient.print (_sb, "filterCoefficient", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
