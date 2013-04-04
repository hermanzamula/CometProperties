package com.teamdev.comet.bean.properties;

class Masses {

    private double peptideMassTolerance = 3.00;
    private PEPTIDE_UNITS peptideMassUnits =  PEPTIDE_UNITS.AMU;
    private MASSES_TYPE massTypeParent = MASSES_TYPE.MONOISOTOPIC;
    private MASSES_TYPE massTypeFragment = MASSES_TYPE.MONOISOTOPIC;
    private PRECURSOR_TOLERANCE precursorToleranceType = PRECURSOR_TOLERANCE.MH;
    private  ISOTOPE_ERROR isotopeError = ISOTOPE_ERROR.OFF;


   public enum PEPTIDE_UNITS {
        AMU,
        MMU,
        PPM
    }

    public enum MASSES_TYPE {
        AVERAGE,
        MONOISOTOPIC
    }

    public enum PRECURSOR_TOLERANCE {
        MH,
        PRECURSOR_MZ
    }

    public enum ISOTOPE_ERROR {
        OFF,
        ON,
        LABELING
    }
}
