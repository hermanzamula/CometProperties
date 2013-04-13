package com.teamdev.comet.bean.properties;

class SearchEnzyme {

    private int searchEnzymeNumber = 1;
    private ENZYME_TERMINI numEnzymeTermini = ENZYME_TERMINI.SEMI_DIGESTED;
    private int allowedMissedCleavage = 2;

    public int getSearchEnzymeNumber() {
        return searchEnzymeNumber;
    }

    public void setSearchEnzymeNumber(int searchEnzymeNumber) {
        this.searchEnzymeNumber = searchEnzymeNumber;
    }

    public ENZYME_TERMINI getNumEnzymeTermini() {
        return numEnzymeTermini;
    }

    public void setNumEnzymeTermini(ENZYME_TERMINI numEnzymeTermini) {
        this.numEnzymeTermini = numEnzymeTermini;
    }

    public int getAllowedMissedCleavage() {
        return allowedMissedCleavage;
    }

    public void setAllowedMissedCleavage(int allowedMissedCleavage) {
        this.allowedMissedCleavage = allowedMissedCleavage;
    }

    public static enum ENZYME_TERMINI {
        SEMI_DIGESTED(1), FULLY_DIGESTED(2),
        N_TERM(8), C_TERM(9);
        private int value;

        private ENZYME_TERMINI(int i) {
            value = i;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public int getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return  "\nsearch_enzyme_number = " + searchEnzymeNumber +
                "\nnum_enzyme_termini = " + numEnzymeTermini +
                "\nallowed_missed_cleavage = " + allowedMissedCleavage;
    }
}
