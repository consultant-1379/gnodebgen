/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Resource_resourceMapping extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer startPosition;
   public SRS_Resource_resourceMapping_nrofSymbols nrofSymbols = null;
   public SRS_Resource_resourceMapping_repetitionFactor repetitionFactor = null;

   public SRS_Resource_resourceMapping () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_Resource_resourceMapping (
      Asn1Integer startPosition_,
      SRS_Resource_resourceMapping_nrofSymbols nrofSymbols_,
      SRS_Resource_resourceMapping_repetitionFactor repetitionFactor_
   ) {
      super();
      startPosition = startPosition_;
      nrofSymbols = nrofSymbols_;
      repetitionFactor = repetitionFactor_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_Resource_resourceMapping (long startPosition_,
      SRS_Resource_resourceMapping_nrofSymbols nrofSymbols_,
      SRS_Resource_resourceMapping_repetitionFactor repetitionFactor_
   ) {
      super();
      startPosition = new Asn1Integer (startPosition_);
      nrofSymbols = nrofSymbols_;
      repetitionFactor = repetitionFactor_;
   }

   public void init () {
      startPosition = null;
      nrofSymbols = null;
      repetitionFactor = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return startPosition;
         case 1: return nrofSymbols;
         case 2: return repetitionFactor;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "startPosition";
         case 1: return "nrofSymbols";
         case 2: return "repetitionFactor";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode startPosition

      buffer.getContext().eventDispatcher.startElement("startPosition", -1);

      startPosition = new Asn1Integer();
      startPosition.decode (buffer, 0, 5);

      buffer.invokeCharacters(startPosition.toString());
      buffer.getContext().eventDispatcher.endElement("startPosition", -1);

      // decode nrofSymbols

      buffer.getContext().eventDispatcher.startElement("nrofSymbols", -1);

      {
         int tval = SRS_Resource_resourceMapping_nrofSymbols.decodeEnumValue (buffer);
         nrofSymbols = SRS_Resource_resourceMapping_nrofSymbols.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("nrofSymbols", -1);

      // decode repetitionFactor

      buffer.getContext().eventDispatcher.startElement("repetitionFactor", -1);

      {
         int tval = SRS_Resource_resourceMapping_repetitionFactor.decodeEnumValue (buffer);
         repetitionFactor = SRS_Resource_resourceMapping_repetitionFactor.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("repetitionFactor", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode startPosition

      if (startPosition != null) {
         buffer.getContext().eventDispatcher.startElement("startPosition", -1);

         startPosition.encode (buffer, 0, 5);

         buffer.getContext().eventDispatcher.endElement("startPosition", -1);
      }
      else throw new Asn1MissingRequiredException ("startPosition");

      // encode nrofSymbols

      if (nrofSymbols != null) {
         buffer.getContext().eventDispatcher.startElement("nrofSymbols", -1);

         nrofSymbols.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nrofSymbols", -1);
      }
      else throw new Asn1MissingRequiredException ("nrofSymbols");

      // encode repetitionFactor

      if (repetitionFactor != null) {
         buffer.getContext().eventDispatcher.startElement("repetitionFactor", -1);

         repetitionFactor.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("repetitionFactor", -1);
      }
      else throw new Asn1MissingRequiredException ("repetitionFactor");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (startPosition != null) startPosition.print (_sb, "startPosition", _level+1);
      if (nrofSymbols != null) nrofSymbols.print (_sb, "nrofSymbols", _level+1);
      if (repetitionFactor != null) repetitionFactor.print (_sb, "repetitionFactor", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
