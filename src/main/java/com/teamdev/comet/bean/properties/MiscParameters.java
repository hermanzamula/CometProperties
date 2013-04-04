package com.teamdev.comet.bean.properties;

class MiscParameters {
    private String digestMassRange = "600.0 5000.0";
    private int numResults = 50;
    private boolean skipSearching = true;
    private int maxFragmentCharge = 3; //max 5
    private NUCLEOTIDE_READING_FRAME nucleotideReadingFrame = NUCLEOTIDE_READING_FRAME.PROTEIN_DB;
    private boolean clipNtermMethionine = false;

    enum NUCLEOTIDE_READING_FRAME {
        PROTEIN_DB,
        ONE, TWO, THREE, FOUR, FIVE, SIX,
        FORWARD_THREE,
        REVERSE_THREE,
        ALL_SIX,

    }
}
