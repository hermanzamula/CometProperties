package com.teamdev.comet.bean.properties;


import static com.teamdev.comet.bean.properties.Output.toInt;

public class MiscParameters {
    private String digestMassRange = "600.0 5000.0";
    private int numResults = 50;
    private boolean skipSearching = true;
    private int maxFragmentCharge = 3; //max 5
    private NUCLEOTIDE_READING_FRAME nucleotideReadingFrame = NUCLEOTIDE_READING_FRAME.PROTEIN_DB;
    private boolean clipNtermMethionine = false;

    public String getDigestMassRange() {
        return digestMassRange;
    }

    public void setDigestMassRange(String digestMassRange) {
        this.digestMassRange = digestMassRange;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public boolean isSkipSearching() {
        return skipSearching;
    }

    public void setSkipSearching(boolean skipSearching) {
        this.skipSearching = skipSearching;
    }

    public int getMaxFragmentCharge() {
        return maxFragmentCharge;
    }

    public void setMaxFragmentCharge(int maxFragmentCharge) {
        this.maxFragmentCharge = maxFragmentCharge;
    }

    public NUCLEOTIDE_READING_FRAME getNucleotideReadingFrame() {
        return nucleotideReadingFrame;
    }

    public void setNucleotideReadingFrame(NUCLEOTIDE_READING_FRAME nucleotideReadingFrame) {
        this.nucleotideReadingFrame = nucleotideReadingFrame;
    }

    public boolean isClipNtermMethionine() {
        return clipNtermMethionine;
    }

    public void setClipNtermMethionine(boolean clipNtermMethionine) {
        this.clipNtermMethionine = clipNtermMethionine;
    }

    public enum NUCLEOTIDE_READING_FRAME {
        PROTEIN_DB(0),
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        FORWARD_THREE(7), REVERSE_THREE(8), ALL_SIX(9);
        private int value;

        private NUCLEOTIDE_READING_FRAME(int i) {
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
        return  "\ndigest_mass_range = " + digestMassRange +
                "\nnum_results = " + numResults +
                "\nskip_researching = " + toInt(skipSearching) +
                "\nmax_fragment_charge = " + maxFragmentCharge +
                "\nnucleotide_reading_frame = " + nucleotideReadingFrame +
                "\nclip_nterm_methionine = " + toInt(clipNtermMethionine);
    }
}
