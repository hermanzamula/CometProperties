package com.teamdev.comet.bean.properties;


class mzXmlParameters {
    private String scanRange = "0 0";
    private String precursorCharge = "0 0";
    private int msLevel = 2;
    private ACTIVATION_METHOD activationMethod = ACTIVATION_METHOD.ALL;

    public String getScanRange() {
        return scanRange;
    }

    public void setScanRange(String scanRange) {
        this.scanRange = scanRange;
    }

    public String getPrecursorCharge() {
        return precursorCharge;
    }

    public void setPrecursorCharge(String precursorCharge) {
        this.precursorCharge = precursorCharge;
    }

    public int getMsLevel() {
        return msLevel;
    }

    public void setMsLevel(int msLevel) {
        this.msLevel = msLevel;
    }

    public ACTIVATION_METHOD getActivationMethod() {
        return activationMethod;
    }

    public void setActivationMethod(ACTIVATION_METHOD activationMethod) {
        this.activationMethod = activationMethod;
    }

    public enum ACTIVATION_METHOD {
        ALL, CID, ECD,ETD, PQD,HCD, IRMPD
    }

    @Override
    public String toString() {
        return "\nscan_range = " + scanRange +
                "\nprecursor_charge = " + precursorCharge +
                "\nms_level = " + msLevel +
                "\nactivation_method = " + activationMethod;
    }
}
