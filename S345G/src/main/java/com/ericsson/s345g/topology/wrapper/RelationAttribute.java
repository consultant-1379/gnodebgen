package com.ericsson.s345g.topology.wrapper;

public class RelationAttribute{
    
    /**
     * The moClass
     */
    private String moClass;
    
    /**
     * The nci
     */
    private long nci;
    /**
     * The plmId
     */
    private byte[] plmnID;
    
    /**
     * @return
     */
    public long getNci() {
        return nci;
    }
    /**
     * @param nci
     */
    public void setNci(long nci) {
        this.nci = nci;
    }
    /**
     * @return
     */
    public byte[] getPlmnID() {
        return plmnID;
    }
    /**
     * @param plmnID
     */
    public void setPlmnID(byte[] plmnID) {
        this.plmnID = plmnID;
    }
    
    /**
     * @return
     */
    public String getMoClass() {
        return moClass;
    }
    
    /**
     * @param moClass
     */
    public void setMoClass(String moClass) {
        this.moClass = moClass;
    }
    
    
}
