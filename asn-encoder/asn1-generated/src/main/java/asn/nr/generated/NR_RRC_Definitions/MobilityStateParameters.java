/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MobilityStateParameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MobilityStateParameters";
   }

   public MobilityStateParameters_t_Evaluation t_Evaluation = null;
   public MobilityStateParameters_t_HystNormal t_HystNormal = null;
   public Asn1Integer n_CellChangeMedium;
   public Asn1Integer n_CellChangeHigh;

   public MobilityStateParameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MobilityStateParameters (
      MobilityStateParameters_t_Evaluation t_Evaluation_,
      MobilityStateParameters_t_HystNormal t_HystNormal_,
      Asn1Integer n_CellChangeMedium_,
      Asn1Integer n_CellChangeHigh_
   ) {
      super();
      t_Evaluation = t_Evaluation_;
      t_HystNormal = t_HystNormal_;
      n_CellChangeMedium = n_CellChangeMedium_;
      n_CellChangeHigh = n_CellChangeHigh_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MobilityStateParameters (MobilityStateParameters_t_Evaluation t_Evaluation_,
      MobilityStateParameters_t_HystNormal t_HystNormal_,
      long n_CellChangeMedium_,
      long n_CellChangeHigh_
   ) {
      super();
      t_Evaluation = t_Evaluation_;
      t_HystNormal = t_HystNormal_;
      n_CellChangeMedium = new Asn1Integer (n_CellChangeMedium_);
      n_CellChangeHigh = new Asn1Integer (n_CellChangeHigh_);
   }

   public void init () {
      t_Evaluation = null;
      t_HystNormal = null;
      n_CellChangeMedium = null;
      n_CellChangeHigh = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return t_Evaluation;
         case 1: return t_HystNormal;
         case 2: return n_CellChangeMedium;
         case 3: return n_CellChangeHigh;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "t-Evaluation";
         case 1: return "t-HystNormal";
         case 2: return "n-CellChangeMedium";
         case 3: return "n-CellChangeHigh";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode t_Evaluation

      buffer.getContext().eventDispatcher.startElement("t_Evaluation", -1);

      {
         int tval = MobilityStateParameters_t_Evaluation.decodeEnumValue (buffer);
         t_Evaluation = MobilityStateParameters_t_Evaluation.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t_Evaluation", -1);

      // decode t_HystNormal

      buffer.getContext().eventDispatcher.startElement("t_HystNormal", -1);

      {
         int tval = MobilityStateParameters_t_HystNormal.decodeEnumValue (buffer);
         t_HystNormal = MobilityStateParameters_t_HystNormal.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("t_HystNormal", -1);

      // decode n_CellChangeMedium

      buffer.getContext().eventDispatcher.startElement("n_CellChangeMedium", -1);

      n_CellChangeMedium = new Asn1Integer();
      n_CellChangeMedium.decode (buffer, 1, 16);

      buffer.invokeCharacters(n_CellChangeMedium.toString());
      buffer.getContext().eventDispatcher.endElement("n_CellChangeMedium", -1);

      // decode n_CellChangeHigh

      buffer.getContext().eventDispatcher.startElement("n_CellChangeHigh", -1);

      n_CellChangeHigh = new Asn1Integer();
      n_CellChangeHigh.decode (buffer, 1, 16);

      buffer.invokeCharacters(n_CellChangeHigh.toString());
      buffer.getContext().eventDispatcher.endElement("n_CellChangeHigh", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode t_Evaluation

      if (t_Evaluation != null) {
         buffer.getContext().eventDispatcher.startElement("t_Evaluation", -1);

         t_Evaluation.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("t_Evaluation", -1);
      }
      else throw new Asn1MissingRequiredException ("t_Evaluation");

      // encode t_HystNormal

      if (t_HystNormal != null) {
         buffer.getContext().eventDispatcher.startElement("t_HystNormal", -1);

         t_HystNormal.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("t_HystNormal", -1);
      }
      else throw new Asn1MissingRequiredException ("t_HystNormal");

      // encode n_CellChangeMedium

      if (n_CellChangeMedium != null) {
         buffer.getContext().eventDispatcher.startElement("n_CellChangeMedium", -1);

         n_CellChangeMedium.encode (buffer, 1, 16);

         buffer.getContext().eventDispatcher.endElement("n_CellChangeMedium", -1);
      }
      else throw new Asn1MissingRequiredException ("n_CellChangeMedium");

      // encode n_CellChangeHigh

      if (n_CellChangeHigh != null) {
         buffer.getContext().eventDispatcher.startElement("n_CellChangeHigh", -1);

         n_CellChangeHigh.encode (buffer, 1, 16);

         buffer.getContext().eventDispatcher.endElement("n_CellChangeHigh", -1);
      }
      else throw new Asn1MissingRequiredException ("n_CellChangeHigh");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (t_Evaluation != null) t_Evaluation.print (_sb, "t_Evaluation", _level+1);
      if (t_HystNormal != null) t_HystNormal.print (_sb, "t_HystNormal", _level+1);
      if (n_CellChangeMedium != null) n_CellChangeMedium.print (_sb, "n_CellChangeMedium", _level+1);
      if (n_CellChangeHigh != null) n_CellChangeHigh.print (_sb, "n_CellChangeHigh", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
