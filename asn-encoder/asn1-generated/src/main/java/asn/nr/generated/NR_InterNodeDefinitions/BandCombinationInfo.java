/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class BandCombinationInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombinationInfo";
   }

   public BandCombinationIndex bandCombinationIndex;
   public BandCombinationInfo_allowedFeatureSetsList allowedFeatureSetsList;

   public BandCombinationInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandCombinationInfo (
      BandCombinationIndex bandCombinationIndex_,
      BandCombinationInfo_allowedFeatureSetsList allowedFeatureSetsList_
   ) {
      super();
      bandCombinationIndex = bandCombinationIndex_;
      allowedFeatureSetsList = allowedFeatureSetsList_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandCombinationInfo (long bandCombinationIndex_,
      BandCombinationInfo_allowedFeatureSetsList allowedFeatureSetsList_
   ) {
      super();
      bandCombinationIndex = new BandCombinationIndex (bandCombinationIndex_);
      allowedFeatureSetsList = allowedFeatureSetsList_;
   }

   public void init () {
      bandCombinationIndex = null;
      allowedFeatureSetsList = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandCombinationIndex;
         case 1: return allowedFeatureSetsList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandCombinationIndex";
         case 1: return "allowedFeatureSetsList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode bandCombinationIndex

      buffer.getContext().eventDispatcher.startElement("bandCombinationIndex", -1);

      bandCombinationIndex = new BandCombinationIndex();
      bandCombinationIndex.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandCombinationIndex", -1);

      // decode allowedFeatureSetsList

      buffer.getContext().eventDispatcher.startElement("allowedFeatureSetsList", -1);

      allowedFeatureSetsList = new BandCombinationInfo_allowedFeatureSetsList();
      allowedFeatureSetsList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("allowedFeatureSetsList", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode bandCombinationIndex

      if (bandCombinationIndex != null) {
         buffer.getContext().eventDispatcher.startElement("bandCombinationIndex", -1);

         bandCombinationIndex.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bandCombinationIndex", -1);
      }
      else throw new Asn1MissingRequiredException ("bandCombinationIndex");

      // encode allowedFeatureSetsList

      if (allowedFeatureSetsList != null) {
         buffer.getContext().eventDispatcher.startElement("allowedFeatureSetsList", -1);

         allowedFeatureSetsList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("allowedFeatureSetsList", -1);
      }
      else throw new Asn1MissingRequiredException ("allowedFeatureSetsList");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bandCombinationIndex != null) bandCombinationIndex.print (_sb, "bandCombinationIndex", _level+1);
      if (allowedFeatureSetsList != null) allowedFeatureSetsList.print (_sb, "allowedFeatureSetsList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
