/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_HoppingConfigDisc_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-HoppingConfigDisc-r12";
   }

   public Asn1Integer a_r12;
   public Asn1Integer b_r12;
   public SL_HoppingConfigDisc_r12_c_r12 c_r12 = null;

   public SL_HoppingConfigDisc_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_HoppingConfigDisc_r12 (
      Asn1Integer a_r12_,
      Asn1Integer b_r12_,
      SL_HoppingConfigDisc_r12_c_r12 c_r12_
   ) {
      super();
      a_r12 = a_r12_;
      b_r12 = b_r12_;
      c_r12 = c_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_HoppingConfigDisc_r12 (long a_r12_,
      long b_r12_,
      SL_HoppingConfigDisc_r12_c_r12 c_r12_
   ) {
      super();
      a_r12 = new Asn1Integer (a_r12_);
      b_r12 = new Asn1Integer (b_r12_);
      c_r12 = c_r12_;
   }

   public void init () {
      a_r12 = null;
      b_r12 = null;
      c_r12 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return a_r12;
         case 1: return b_r12;
         case 2: return c_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "a-r12";
         case 1: return "b-r12";
         case 2: return "c-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode a_r12

      buffer.getContext().eventDispatcher.startElement("a_r12", -1);

      a_r12 = new Asn1Integer();
      a_r12.decode (buffer, 1, 200);

      buffer.invokeCharacters(a_r12.toString());
      buffer.getContext().eventDispatcher.endElement("a_r12", -1);

      // decode b_r12

      buffer.getContext().eventDispatcher.startElement("b_r12", -1);

      b_r12 = new Asn1Integer();
      b_r12.decode (buffer, 1, 10);

      buffer.invokeCharacters(b_r12.toString());
      buffer.getContext().eventDispatcher.endElement("b_r12", -1);

      // decode c_r12

      buffer.getContext().eventDispatcher.startElement("c_r12", -1);

      {
         int tval = SL_HoppingConfigDisc_r12_c_r12.decodeEnumValue (buffer);
         c_r12 = SL_HoppingConfigDisc_r12_c_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("c_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (a_r12 != null) a_r12.print (_sb, "a_r12", _level+1);
      if (b_r12 != null) b_r12.print (_sb, "b_r12", _level+1);
      if (c_r12 != null) c_r12.print (_sb, "c_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
