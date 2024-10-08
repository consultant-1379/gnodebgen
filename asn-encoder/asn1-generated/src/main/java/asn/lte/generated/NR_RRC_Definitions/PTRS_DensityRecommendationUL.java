/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PTRS_DensityRecommendationUL extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PTRS-DensityRecommendationUL";
   }

   public Asn1Integer frequencyDensity1;
   public Asn1Integer frequencyDensity2;
   public Asn1Integer timeDensity1;
   public Asn1Integer timeDensity2;
   public Asn1Integer timeDensity3;
   public Asn1Integer sampleDensity1;
   public Asn1Integer sampleDensity2;
   public Asn1Integer sampleDensity3;
   public Asn1Integer sampleDensity4;
   public Asn1Integer sampleDensity5;

   public PTRS_DensityRecommendationUL () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PTRS_DensityRecommendationUL (
      Asn1Integer frequencyDensity1_,
      Asn1Integer frequencyDensity2_,
      Asn1Integer timeDensity1_,
      Asn1Integer timeDensity2_,
      Asn1Integer timeDensity3_,
      Asn1Integer sampleDensity1_,
      Asn1Integer sampleDensity2_,
      Asn1Integer sampleDensity3_,
      Asn1Integer sampleDensity4_,
      Asn1Integer sampleDensity5_
   ) {
      super();
      frequencyDensity1 = frequencyDensity1_;
      frequencyDensity2 = frequencyDensity2_;
      timeDensity1 = timeDensity1_;
      timeDensity2 = timeDensity2_;
      timeDensity3 = timeDensity3_;
      sampleDensity1 = sampleDensity1_;
      sampleDensity2 = sampleDensity2_;
      sampleDensity3 = sampleDensity3_;
      sampleDensity4 = sampleDensity4_;
      sampleDensity5 = sampleDensity5_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PTRS_DensityRecommendationUL (long frequencyDensity1_,
      long frequencyDensity2_,
      long timeDensity1_,
      long timeDensity2_,
      long timeDensity3_,
      long sampleDensity1_,
      long sampleDensity2_,
      long sampleDensity3_,
      long sampleDensity4_,
      long sampleDensity5_
   ) {
      super();
      frequencyDensity1 = new Asn1Integer (frequencyDensity1_);
      frequencyDensity2 = new Asn1Integer (frequencyDensity2_);
      timeDensity1 = new Asn1Integer (timeDensity1_);
      timeDensity2 = new Asn1Integer (timeDensity2_);
      timeDensity3 = new Asn1Integer (timeDensity3_);
      sampleDensity1 = new Asn1Integer (sampleDensity1_);
      sampleDensity2 = new Asn1Integer (sampleDensity2_);
      sampleDensity3 = new Asn1Integer (sampleDensity3_);
      sampleDensity4 = new Asn1Integer (sampleDensity4_);
      sampleDensity5 = new Asn1Integer (sampleDensity5_);
   }

   public void init () {
      frequencyDensity1 = null;
      frequencyDensity2 = null;
      timeDensity1 = null;
      timeDensity2 = null;
      timeDensity3 = null;
      sampleDensity1 = null;
      sampleDensity2 = null;
      sampleDensity3 = null;
      sampleDensity4 = null;
      sampleDensity5 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return frequencyDensity1;
         case 1: return frequencyDensity2;
         case 2: return timeDensity1;
         case 3: return timeDensity2;
         case 4: return timeDensity3;
         case 5: return sampleDensity1;
         case 6: return sampleDensity2;
         case 7: return sampleDensity3;
         case 8: return sampleDensity4;
         case 9: return sampleDensity5;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "frequencyDensity1";
         case 1: return "frequencyDensity2";
         case 2: return "timeDensity1";
         case 3: return "timeDensity2";
         case 4: return "timeDensity3";
         case 5: return "sampleDensity1";
         case 6: return "sampleDensity2";
         case 7: return "sampleDensity3";
         case 8: return "sampleDensity4";
         case 9: return "sampleDensity5";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode frequencyDensity1

      buffer.getContext().eventDispatcher.startElement("frequencyDensity1", -1);

      frequencyDensity1 = new Asn1Integer();
      frequencyDensity1.decode (buffer, 1, 276);

      buffer.invokeCharacters(frequencyDensity1.toString());
      buffer.getContext().eventDispatcher.endElement("frequencyDensity1", -1);

      // decode frequencyDensity2

      buffer.getContext().eventDispatcher.startElement("frequencyDensity2", -1);

      frequencyDensity2 = new Asn1Integer();
      frequencyDensity2.decode (buffer, 1, 276);

      buffer.invokeCharacters(frequencyDensity2.toString());
      buffer.getContext().eventDispatcher.endElement("frequencyDensity2", -1);

      // decode timeDensity1

      buffer.getContext().eventDispatcher.startElement("timeDensity1", -1);

      timeDensity1 = new Asn1Integer();
      timeDensity1.decode (buffer, 0, 29);

      buffer.invokeCharacters(timeDensity1.toString());
      buffer.getContext().eventDispatcher.endElement("timeDensity1", -1);

      // decode timeDensity2

      buffer.getContext().eventDispatcher.startElement("timeDensity2", -1);

      timeDensity2 = new Asn1Integer();
      timeDensity2.decode (buffer, 0, 29);

      buffer.invokeCharacters(timeDensity2.toString());
      buffer.getContext().eventDispatcher.endElement("timeDensity2", -1);

      // decode timeDensity3

      buffer.getContext().eventDispatcher.startElement("timeDensity3", -1);

      timeDensity3 = new Asn1Integer();
      timeDensity3.decode (buffer, 0, 29);

      buffer.invokeCharacters(timeDensity3.toString());
      buffer.getContext().eventDispatcher.endElement("timeDensity3", -1);

      // decode sampleDensity1

      buffer.getContext().eventDispatcher.startElement("sampleDensity1", -1);

      sampleDensity1 = new Asn1Integer();
      sampleDensity1.decode (buffer, 1, 276);

      buffer.invokeCharacters(sampleDensity1.toString());
      buffer.getContext().eventDispatcher.endElement("sampleDensity1", -1);

      // decode sampleDensity2

      buffer.getContext().eventDispatcher.startElement("sampleDensity2", -1);

      sampleDensity2 = new Asn1Integer();
      sampleDensity2.decode (buffer, 1, 276);

      buffer.invokeCharacters(sampleDensity2.toString());
      buffer.getContext().eventDispatcher.endElement("sampleDensity2", -1);

      // decode sampleDensity3

      buffer.getContext().eventDispatcher.startElement("sampleDensity3", -1);

      sampleDensity3 = new Asn1Integer();
      sampleDensity3.decode (buffer, 1, 276);

      buffer.invokeCharacters(sampleDensity3.toString());
      buffer.getContext().eventDispatcher.endElement("sampleDensity3", -1);

      // decode sampleDensity4

      buffer.getContext().eventDispatcher.startElement("sampleDensity4", -1);

      sampleDensity4 = new Asn1Integer();
      sampleDensity4.decode (buffer, 1, 276);

      buffer.invokeCharacters(sampleDensity4.toString());
      buffer.getContext().eventDispatcher.endElement("sampleDensity4", -1);

      // decode sampleDensity5

      buffer.getContext().eventDispatcher.startElement("sampleDensity5", -1);

      sampleDensity5 = new Asn1Integer();
      sampleDensity5.decode (buffer, 1, 276);

      buffer.invokeCharacters(sampleDensity5.toString());
      buffer.getContext().eventDispatcher.endElement("sampleDensity5", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (frequencyDensity1 != null) frequencyDensity1.print (_sb, "frequencyDensity1", _level+1);
      if (frequencyDensity2 != null) frequencyDensity2.print (_sb, "frequencyDensity2", _level+1);
      if (timeDensity1 != null) timeDensity1.print (_sb, "timeDensity1", _level+1);
      if (timeDensity2 != null) timeDensity2.print (_sb, "timeDensity2", _level+1);
      if (timeDensity3 != null) timeDensity3.print (_sb, "timeDensity3", _level+1);
      if (sampleDensity1 != null) sampleDensity1.print (_sb, "sampleDensity1", _level+1);
      if (sampleDensity2 != null) sampleDensity2.print (_sb, "sampleDensity2", _level+1);
      if (sampleDensity3 != null) sampleDensity3.print (_sb, "sampleDensity3", _level+1);
      if (sampleDensity4 != null) sampleDensity4.print (_sb, "sampleDensity4", _level+1);
      if (sampleDensity5 != null) sampleDensity5.print (_sb, "sampleDensity5", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
