package com.teamdev.comet.bean.properties;


class mzXmlParameters {
    private String scanRange = "0 0";
    private String precursorCharge = "0 0";
    private int msLevel = 2;
    private ACTIVATION_METHOD activationMethod = ACTIVATION_METHOD.ALL;

    enum ACTIVATION_METHOD {
        ALL,
        CID,
        ECD,
        ETD,
        PQD,
        HCD,
        IRMPD
    }
}
