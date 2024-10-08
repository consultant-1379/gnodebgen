/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BLER_Result_r12_blocksReceived_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString n_r12;
   public Asn1BitString m_r12;

   public BLER_Result_r12_blocksReceived_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BLER_Result_r12_blocksReceived_r12 (
      Asn1BitString n_r12_,
      Asn1BitString m_r12_
   ) {
      super();
      n_r12 = n_r12_;
      m_r12 = m_r12_;
   }

   public void init () {
      n_r12 = null;
      m_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return n_r12;
         case 1: return m_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "n-r12";
         case 1: return "m-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode n_r12

      buffer.getContext().eventDispatcher.startElement("n_r12", -1);

      n_r12 = new Asn1BitString();
      n_r12.decode (buffer, 3, 3);

      buffer.invokeCharacters(n_r12.toString());
      buffer.getContext().eventDispatcher.endElement("n_r12", -1);

      // decode m_r12

      buffer.getContext().eventDispatcher.startElement("m_r12", -1);

      m_r12 = new Asn1BitString();
      m_r12.decode (buffer, 8, 8);

      buffer.invokeCharacters(m_r12.toString());
      buffer.getContext().eventDispatcher.endElement("m_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (n_r12 != null) n_r12.print (_sb, "n_r12", _level+1);
      if (m_r12 != null) m_r12.print (_sb, "m_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
