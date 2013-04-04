package com.teamdev.comet.bean.properties;

class SearchEnzyme {

    private int searchEnzymeNumber = 1;
    private ENZYME_TERMINI numEnzymeTermini = ENZYME_TERMINI.SEMI_DIGESTED;
    private int allowedMissedCleavage = 2;

    static enum ENZYME_TERMINI {
        SEMI_DIGESTED,
        FULLY_DIGESTED,
        N_TERM,
        C_TERM
    }

}
